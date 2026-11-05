package estudo.t18.visao;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import estudo.t18.modelo.*;
import estudo.t18.servico.Servico;
import estudo.t18.excecao.OperacaoInvalidaException;

/** A tela so coleta dados e apresenta resultados; calculos ficam no modelo. */
public class Tela extends JFrame {
    private final Servico servico;
    private final JTextField id = new JTextField(8);
    private final JTextField descricao = new JTextField(16);
    private final JTextField responsavel = new JTextField(16);
    private final JTextField valor = new JTextField(10);
    private final JTextField quantidade = new JTextField(8);
    private final JComboBox<String> tipo = new JComboBox<>(new String[]{"Simples", "Completo"});
    private final DefaultTableModel modelo = new DefaultTableModel(
        new String[]{"ID", "Descricao", "Tipo", "Organizador", "Preço por participante", "Participantes", "Resultado"}, 0) {
        @Override public boolean isCellEditable(int linha, int coluna) { return false; }
    };
    private final JTable tabela = new JTable(modelo);
    private final JLabel status = new JLabel("Cadastro em memoria. Escolha uma operacao.");

    public Tela(Servico servico) {
        super("Organização de eventos");
        this.servico = servico;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel campos = new JPanel(new GridLayout(0, 2, 8, 6));
        campos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        campo(campos, "ID positivo", id); campo(campos, "Categoria", tipo);
        campo(campos, "Descricao", descricao); campo(campos, "Organizador", responsavel);
        campo(campos, "Preço por participante", valor); campo(campos, "Participantes (minimo 1)", quantidade);
        add(campos, BorderLayout.NORTH);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(tabela), BorderLayout.CENTER);
        JPanel botoes = new JPanel(new GridLayout(2, 5, 5, 5));
        botao(botoes, "Cadastrar", () -> salvar(false));
        botao(botoes, "Atualizar", () -> salvar(true));
        botao(botoes, "Buscar ID", this::buscar);
        botao(botoes, "Remover", this::remover);
        botao(botoes, "Limpar campos", this::limpar);
        botao(botoes, "Listar todos", () -> mostrar(servico.listar()));
        botao(botoes, "Resumo", () -> JOptionPane.showMessageDialog(this, servico.resumo()));
        botao(botoes, "Destaques", () -> {
            mostrar(servico.filtrarDestaques()); status.setText("Eventos com pelo menos 20 participantes");
        });
        botao(botoes, "Por responsavel", () -> {
            String termo = JOptionPane.showInputDialog(this, "Parte do nome de Organizador:");
            if (termo != null) mostrar(servico.buscarPorResponsavel(termo));
        });
        botao(botoes, "Exemplos", () -> {
            servico.carregarExemplos(); mostrar(servico.listar());
        });
        JPanel rodape = new JPanel(new BorderLayout(5, 5));
        rodape.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        rodape.add(botoes, BorderLayout.CENTER); rodape.add(status, BorderLayout.SOUTH);
        add(rodape, BorderLayout.SOUTH);
        tabela.getSelectionModel().addListSelectionListener(e -> {
            int linha = tabela.getSelectedRow();
            if (!e.getValueIsAdjusting() && linha >= 0) {
                try { preencher(servico.buscar((Integer) modelo.getValueAt(linha, 0))); }
                catch (OperacaoInvalidaException erro) { status.setText(erro.getMessage()); }
            }
        });
        mostrar(servico.listar());
        setSize(1050, 620); setLocationRelativeTo(null);
    }
    private interface Acao { void executar() throws OperacaoInvalidaException; }
    private void botao(JPanel painel, String texto, Acao acao) {
        JButton botao = new JButton(texto);
        botao.addActionListener(e -> {
            try { acao.executar(); }
            catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(this, "Confira os numeros. Use virgula ou ponto, sem milhar.");
            } catch (OperacaoInvalidaException | IllegalArgumentException erro) {
                JOptionPane.showMessageDialog(this, erro.getMessage(), "Operacao invalida", JOptionPane.ERROR_MESSAGE);
            }
        });
        painel.add(botao);
    }
    private void campo(JPanel painel, String rotulo, JComponent campo) {
        painel.add(new JLabel(rotulo)); painel.add(campo);
    }
    private int lerId() { return Integer.parseInt(id.getText().trim()); }
    private void salvar(boolean atualizar) throws OperacaoInvalidaException {
        int codigo = lerId();
        int unidades = Integer.parseInt(quantidade.getText().trim());
        double base = Validacao.lerDecimal(valor.getText());
        if (atualizar) servico.atualizar(tipo.getSelectedIndex() + 1, codigo,
            descricao.getText(), responsavel.getText(), base, unidades);
        else servico.cadastrar(tipo.getSelectedIndex() + 1, codigo,
            descricao.getText(), responsavel.getText(), base, unidades);
        mostrar(servico.listar()); limpar(); status.setText("Registro salvo.");
    }
    private void buscar() throws OperacaoInvalidaException { preencher(servico.buscar(lerId())); }
    private void remover() throws OperacaoInvalidaException {
        int codigo = lerId();
        Evento registro = servico.buscar(codigo);
        if (JOptionPane.showConfirmDialog(this, "Remover " + registro.getDescricao() + "?",
                "Confirmacao", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            servico.remover(codigo); mostrar(servico.listar()); limpar();
        }
    }
    private void preencher(Evento registro) {
        id.setText(String.valueOf(registro.getId())); descricao.setText(registro.getDescricao());
        responsavel.setText(registro.getResponsavel().getNome());
        valor.setText(String.valueOf(registro.getPrecoPessoa()));
        quantidade.setText(String.valueOf(registro.getParticipantes()));
        tipo.setSelectedIndex(registro instanceof EventoSimples ? 0 : 1);
        status.setText("ID " + registro.getId() + " carregado. Atualizar usa o ID informado.");
    }
    private void limpar() {
        id.setText(""); descricao.setText(""); responsavel.setText("");
        valor.setText(""); quantidade.setText(""); tipo.setSelectedIndex(0);
        tabela.clearSelection(); id.requestFocusInWindow();
    }
    private void mostrar(List<Evento> registros) {
        modelo.setRowCount(0);
        for (Evento r : registros) modelo.addRow(new Object[]{r.getId(), r.getDescricao(),
            r.getTipo(), r.getResponsavel().getNome(), r.getPrecoPessoa(), r.getParticipantes(),
            String.format(java.util.Locale.forLanguageTag("pt-BR"), "R$ %.2f", r.calcularTotal())});
        status.setText(registros.size() + " registro(s) exibido(s).");
    }
}

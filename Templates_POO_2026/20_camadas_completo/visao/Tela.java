package template20.visao;

import javax.swing.*;
import java.awt.BorderLayout;
import template20.modelo.Produto;
import template20.servico.ProdutoService;

// Apresentacao: le campos, chama servico, mostra resultado.
public class Tela extends JFrame {
    private final ProdutoService servico;
    private JTextField nome = new JTextField(12);
    private JTextField preco = new JTextField(8);
    private DefaultListModel<Produto> modelo = new DefaultListModel<>();
    public Tela(ProdutoService servico) {
        super("Produtos em camadas");
        this.servico = servico;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel campos = new JPanel();
        campos.add(new JLabel("Nome:")); campos.add(nome);
        campos.add(new JLabel("Preco:")); campos.add(preco);
        JButton salvar = new JButton("Salvar"); campos.add(salvar);
        add(campos, BorderLayout.NORTH);
        add(new JScrollPane(new JList<Produto>(modelo)), BorderLayout.CENTER);
        salvar.addActionListener(e -> cadastrar());
        setSize(550, 300); setLocationRelativeTo(null);
    }
    private void cadastrar() {
        try {
            double valor = Double.parseDouble(preco.getText().trim().replace(',', '.'));
            servico.cadastrar(nome.getText(), valor);
            modelo.clear();
            for (Produto p : servico.listar()) modelo.addElement(p);
            nome.setText(""); preco.setText(""); nome.requestFocusInWindow();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Digite um preco numerico");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}

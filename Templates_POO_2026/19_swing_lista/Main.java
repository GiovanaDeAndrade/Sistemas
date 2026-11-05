package template19;

import javax.swing.*;
import java.awt.BorderLayout;
// Swing: combo, checkbox, lista e remoção
// ADAPTE: categorias, checkbox e campos; o DefaultListModel abastece a JList.
class Tela extends JFrame {
    private JTextField nome = new JTextField(12);
    private JComboBox<String> categoria = new JComboBox<>(new String[]{"Livro", "Curso"});
    private JCheckBox ativo = new JCheckBox("Ativo", true);
    private DefaultListModel<String> modelo = new DefaultListModel<>();
    private JList<String> lista = new JList<>(modelo);
    public Tela() {
        super("Cadastro visual");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel topo = new JPanel();
        topo.add(new JLabel("Nome:")); topo.add(nome); topo.add(categoria); topo.add(ativo);
        JButton adicionar = new JButton("Adicionar");
        JButton remover = new JButton("Remover selecionado");
        topo.add(adicionar);
        add(topo, BorderLayout.NORTH);
        add(new JScrollPane(lista), BorderLayout.CENTER);
        add(remover, BorderLayout.SOUTH);
        adicionar.addActionListener(e -> {
            if (nome.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha o nome"); return;
            }
            modelo.addElement(nome.getText().trim() + " / " + categoria.getSelectedItem()
                + " / " + (ativo.isSelected() ? "ativo" : "inativo"));
            nome.setText(""); nome.requestFocusInWindow();
        });
        remover.addActionListener(e -> {
            int indice = lista.getSelectedIndex();
            if (indice >= 0) modelo.remove(indice);
            else JOptionPane.showMessageDialog(this, "Selecione um item");
        });
        setSize(650, 300); setLocationRelativeTo(null);
    }
}

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Tela().setVisible(true));
    }
}

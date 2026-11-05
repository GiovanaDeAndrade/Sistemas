package template18;

import javax.swing.*;
import java.awt.GridLayout;
// Swing: JFrame, campos, botão e evento
// ADAPTE: rótulos, campos e cálculo dentro de Calculadora.
class Calculadora {
    public double somar(double a, double b) {
        double soma = a + b;
        if (!Double.isFinite(a) || !Double.isFinite(b) || !Double.isFinite(soma))
            throw new IllegalArgumentException("Numeros invalidos ou resultado muito grande");
        return soma;
    }
}
class Tela extends JFrame {
    private JTextField campoA = new JTextField(10);
    private JTextField campoB = new JTextField(10);
    private JLabel resultado = new JLabel("Resultado");
    public Tela() {
        super("Somador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 8, 8));
        add(new JLabel("Numero A")); add(campoA);
        add(new JLabel("Numero B")); add(campoB);
        JButton botao = new JButton("Somar");
        add(botao); add(resultado);
        botao.addActionListener(e -> calcular()); // Acao executada ao clicar.
        pack(); setLocationRelativeTo(null);
    }
    private void calcular() {
        try {
            double a = Double.parseDouble(campoA.getText().trim().replace(',', '.'));
            double b = Double.parseDouble(campoB.getText().trim().replace(',', '.'));
            resultado.setText("Soma: " + new Calculadora().somar(a, b));
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Confira os numeros: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Tela().setVisible(true));
    }
}

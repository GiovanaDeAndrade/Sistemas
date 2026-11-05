package template17;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
// Swing: entrada e saída com JOptionPane
// ADAPTE: a pergunta e a fórmula de dobro.
class Calculadora {
    public double dobrar(double numero) {
        if (!Double.isFinite(numero)) throw new IllegalArgumentException("Numero invalido");
        double resultado = numero * 2;
        if (!Double.isFinite(resultado)) throw new IllegalArgumentException("Resultado muito grande");
        return resultado;
    }
}

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            String texto = JOptionPane.showInputDialog(null, "Digite um numero:");
            if (texto == null) return; // Cancelar nao e erro.
            try {
                double numero = Double.parseDouble(texto.trim().replace(',', '.'));
                JOptionPane.showMessageDialog(null, new Calculadora().dobrar(numero));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um numero valido");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        });
    }
}

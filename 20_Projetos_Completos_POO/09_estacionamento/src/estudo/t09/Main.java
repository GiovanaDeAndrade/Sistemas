package estudo.t09;

import javax.swing.SwingUtilities;
import estudo.t09.repositorio.Repositorio;
import estudo.t09.servico.Servico;
import estudo.t09.visao.Console;
import estudo.t09.visao.Tela;

/** Sem argumentos: console. Com argumento gui: janela Swing. */
public class Main {
    public static void main(String[] args) {
        Servico servico = new Servico(new Repositorio());
        if (args.length > 0 && "gui".equalsIgnoreCase(args[0])) {
            SwingUtilities.invokeLater(() -> new Tela(servico).setVisible(true));
        } else {
            new Console(servico).executar();
        }
    }
}

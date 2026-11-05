package estudo.t13;

import javax.swing.SwingUtilities;
import estudo.t13.repositorio.Repositorio;
import estudo.t13.servico.Servico;
import estudo.t13.visao.Console;
import estudo.t13.visao.Tela;

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

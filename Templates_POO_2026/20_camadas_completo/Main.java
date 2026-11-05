package template20;

import javax.swing.SwingUtilities;
import template20.repositorio.ProdutoRepository;
import template20.servico.ProdutoService;
import template20.visao.Tela;

public class Main {
    public static void main(String[] args) {
        // Montagem: a tela recebe o servico, que recebe o repositorio.
        ProdutoRepository repositorio = new ProdutoRepository();
        ProdutoService servico = new ProdutoService(repositorio);
        SwingUtilities.invokeLater(() -> new Tela(servico).setVisible(true));
    }
}

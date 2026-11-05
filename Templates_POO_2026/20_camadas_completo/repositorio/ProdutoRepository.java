package template20.repositorio;

import java.util.ArrayList;
import java.util.List;
import template20.modelo.Produto;

// Armazenamento em memoria. Nao conhece janelas.
public class ProdutoRepository {
    private final ArrayList<Produto> produtos = new ArrayList<>();
    public void adicionar(Produto produto) { produtos.add(produto); }
    public Produto buscarPorNome(String nome) {
        for (Produto p : produtos)
            if (p.getNome().equalsIgnoreCase(nome)) return p;
        return null;
    }
    public List<Produto> listar() { return new ArrayList<>(produtos); }
}

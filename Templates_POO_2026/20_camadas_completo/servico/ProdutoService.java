package template20.servico;

import java.util.List;
import template20.modelo.Produto;
import template20.repositorio.ProdutoRepository;

// Regras de negocio. Pode ser chamado por Swing ou console.
public class ProdutoService {
    private final ProdutoRepository repositorio;
    public ProdutoService(ProdutoRepository repositorio) { this.repositorio = repositorio; }
    public void cadastrar(String nome, double preco) {
        Produto produto = new Produto(nome, preco);
        if (repositorio.buscarPorNome(produto.getNome()) != null)
            throw new IllegalArgumentException("Nome ja cadastrado");
        repositorio.adicionar(produto);
    }
    public List<Produto> listar() { return repositorio.listar(); }
}

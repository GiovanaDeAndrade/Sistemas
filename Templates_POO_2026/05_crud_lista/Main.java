package template05;

import java.util.ArrayList;
// Cadastro: adicionar, buscar, alterar, remover
// ADAPTE: Livro/titulo por Produto/nome; preserve a busca por ID.
class Livro {
    private final int id;
    private String titulo;
    public Livro(int id, String titulo) { this.id = id; this.titulo = titulo; }
    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
}
class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    public Livro buscar(int id) {
        for (Livro l : livros) if (l.getId() == id) return l;
        return null; // Quem chama deve verificar antes de usar.
    }
    public void adicionar(Livro livro) {
        if (livro == null) throw new IllegalArgumentException("Livro obrigatorio");
        if (buscar(livro.getId()) != null) throw new IllegalArgumentException("ID repetido");
        livros.add(livro);
    }
    public boolean remover(int id) {
        Livro encontrado = buscar(id);
        return encontrado != null && livros.remove(encontrado);
    }
    public void alterar(int id, String titulo) {
        Livro livro = buscar(id);
        if (livro == null) throw new IllegalArgumentException("Livro nao encontrado");
        livro.setTitulo(titulo);
    }
}

public class Main {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();
        b.adicionar(new Livro(1, "Java"));
        b.alterar(1, "POO");
        System.out.println(b.buscar(1).getTitulo());
        System.out.println(b.remover(1));
        System.out.println(b.buscar(1));
    }
}

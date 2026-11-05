package template02;


// Associação: cliente tem endereço
// ADAPTE: Cliente/Endereco por Vendedor/Endereco, Aluno/Curso etc.
class Endereco {
    private String cidade;
    public Endereco(String cidade) { this.cidade = cidade; }
    public String getCidade() { return cidade; }
}
class Cliente {
    private String nome;
    private Endereco endereco; // E um objeto, nao uma String.
    public Cliente(String nome, Endereco endereco) {
        if (endereco == null) throw new IllegalArgumentException("Endereco obrigatorio");
        this.nome = nome;
        this.endereco = endereco;
    }
    public String resumo() { return nome + " - " + endereco.getCidade(); }
}

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Blumenau");
        Cliente cliente = new Cliente("Ana", endereco);
        System.out.println(cliente.resumo());
    }
}

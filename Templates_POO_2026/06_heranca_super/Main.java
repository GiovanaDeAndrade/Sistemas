package template06;


// Herança: Pessoa e Aluno
// ADAPTE: Pessoa/Aluno e atributos comuns/específicos.
class Pessoa {
    private String nome;
    public Pessoa(String nome) { this.nome = nome; }
    public String getNome() { return nome; }
    public String descrever() { return "Nome: " + nome; }
}
class Aluno extends Pessoa {
    private int matricula;
    public Aluno(String nome, int matricula) {
        super(nome); // Inicializa a parte herdada: primeira instrucao do construtor.
        this.matricula = matricula;
    }
    @Override public String descrever() {
        return super.descrever() + " / Matricula: " + matricula;
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ana", 123);
        System.out.println(aluno.getNome());
        System.out.println(aluno.descrever());
    }
}

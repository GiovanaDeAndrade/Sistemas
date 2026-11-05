package template09;

import java.util.ArrayList;
// Lista polimórfica: folha de pagamento
// ADAPTE: Funcionario/Fixo/Comissionado e salário/comissão.
abstract class Funcionario {
    private String nome;
    public Funcionario(String nome) { this.nome = nome; }
    public String getNome() { return nome; }
    public abstract double calcularSalario();
}
class Fixo extends Funcionario {
    private double salario;
    public Fixo(String nome, double salario) { super(nome); this.salario = salario; }
    @Override public double calcularSalario() { return salario; }
}
class Comissionado extends Funcionario {
    private double vendas, taxa;
    public Comissionado(String nome, double vendas, double taxa) {
        super(nome); this.vendas = vendas; this.taxa = taxa;
    }
    @Override public double calcularSalario() { return vendas * taxa; }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> equipe = new ArrayList<>();
        equipe.add(new Fixo("Ana", 2000));
        equipe.add(new Comissionado("Bia", 10000, 0.05)); // 5% = 0.05
        double total = 0;
        for (Funcionario f : equipe) {
            System.out.println(f.getNome() + ": " + f.calcularSalario());
            total += f.calcularSalario();
        }
        System.out.println("Total: " + total);
        System.out.println("Media: " + (equipe.isEmpty() ? 0 : total / equipe.size()));
    }
}

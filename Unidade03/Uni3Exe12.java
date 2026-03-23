package Unidade03;

import java.util.Scanner;

public class Uni3Exe12 {

    private double dependente;
    private double INSS;
    private double impostoRenda;
    private double valorHora;
    private String nome;
    private double horasTrabalhadas;
    private int numeroDependentes;

    public Uni3Exe12(double dependente, double INSS, double impostoRenda, double valorHora, String nome,
            double horasTrabalhadas, int numeroDependentes) {
        this.valorHora = valorHora;
        this.INSS = INSS;
        this.dependente = dependente;
        this.impostoRenda = impostoRenda;
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.numeroDependentes = numeroDependentes;
    }

    public double salarioBruto() {
        return (valorHora * horasTrabalhadas) + (dependente * numeroDependentes);
    }

    public double salarioLiquido() {
        return (valorHora * horasTrabalhadas) - (((valorHora * horasTrabalhadas) * INSS) + ((valorHora * horasTrabalhadas) * impostoRenda) + (numeroDependentes * dependente));
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            final double dependente = 60.0;
            final double INSS = 0.085;
            final double impostoRenda = 0.050;
            final double valorHora = 10.0;

            System.out.print("Nome:");
            String nome = sc.next();

            System.out.print("Quantidade de horas trabalhadas no mês:");
            double horasTrabalhadas = sc.nextDouble();

            System.out.print("Número de dependentes:");
            int numeroDependentes = sc.nextInt();

            Uni3Exe12 calc = new Uni3Exe12(dependente, INSS, impostoRenda, valorHora, nome, horasTrabalhadas, numeroDependentes);

            System.out.println("O funcionário " + nome + " possui um salário bruto de R$" + calc.salarioBruto() + " e um salário líquido de R$" + calc.salarioLiquido());
        }
    }
}
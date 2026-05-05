package Unidade02;

import java.util.*;

public class Uni2Exe06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira seu número de funcionário: ");
        int nFuncionario = sc.nextInt();

        System.out.print("Insira seu número de horas trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();

        System.out.print("Insira quanto você recebe pro hora trabalhada: ");
        double valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.printf("N º do Funcionário: " + nFuncionario + "\nHoras trabalhadas: " + horasTrabalhadas + "\nSalário: R$ %.2f" , salario);

        sc.close();
        
    }

}

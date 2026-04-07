package Unidade04;

import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Entre com as horas trabalhadas no mês: ");
            float horaMes = sc.nextFloat();

            System.out.print("Qual o valor pago por hora: ");
            float horasValor = sc.nextFloat();

            float salarioTotal = horaMes * horasValor;

            if (horaMes > 160) {
                float salarioExtra = (horaMes - 160) * (horasValor / 2);
                salarioTotal = salarioTotal + salarioExtra;

                System.out.print("Salario total: " + salarioTotal);

            } else {
                System.out.printf("O salario total é: R$%.2f", salarioTotal);
            }

        }
    }
}

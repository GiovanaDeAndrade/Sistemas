package Unidade04;

import java.util.Scanner;

public class Uni4Exe02 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Escreva um número inteiro maior que zero");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                System.out.print("O número é par.");

            } else {
                System.out.print("O número é ímpar.");
            }

        }

    }
}
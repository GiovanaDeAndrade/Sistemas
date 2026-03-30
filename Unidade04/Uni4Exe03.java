package Unidade04;

import java.util.Scanner;

public class Uni4Exe03 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Informe um número: ");
            int numero1 = sc.nextInt();

            System.out.println("Informe outro número: ");
            int numero2 = sc.nextInt();

            if (numero1 > numero2) {
                System.out.println("O valor " + numero1 + " é maior que o valor " + numero2);

            } else {
                System.out.println("O valor " + numero2 + " é maior que o valor " + numero1);
            }
        }
    }
}
package Unidade04;

import java.util.Scanner;

public class Uni4Exe09 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite um numero: ");
            int n1 = sc.nextInt();

            System.out.print("Digite outro numero: ");
            int n2 = sc.nextInt();

            if (n1 % n2 == 0) {
                System.out.print("Os valores são multiplos.");

            } else {
                System.out.print("Não são multiplos.");
            }

        }
    }

}

package Unidade04;

import java.util.Scanner;

public class Uni4Exe20 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Informe a primeira nota: ");
            float nota1 = sc.nextFloat();

            System.out.print("Informe a segunda nota: ");
            float nota2 = sc.nextFloat();

            System.out.print("Informe a terceira nota: ");
            float nota3 = sc.nextFloat();

            System.out.print("Informe a média dos exercícios: ");
            float exercícios = sc.nextFloat();

            float media = (nota1 + (nota2 * 2) + (nota3 * 3) + exercícios) / 7;

            if (media >= 9) {
                System.out.print("Sua média é A");

            } else if (media >= 7.5 && media < 9.0) {
                System.out.print("Sua média é B");

            } else if (media >= 6.0 && media < 7.5) {
                System.out.print("Sua média é C");

            } else if (media >= 4.0 && media < 6.0) {
                System.out.print("Sua média é D");

            } else if (media < 4.0) {
                System.out.print("Sua média é E");

            }

        }
    }

}

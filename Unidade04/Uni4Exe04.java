package Unidade04;

import java.util.Scanner;

public class Uni4Exe04 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Informe um número: ");
            float numero = sc.nextFloat();

            if (numero % 1 != 0) {
                System.out.println("Foram digitadas casas decimais.");

            } else {
                System.out.println("Não foram digitadas casas decimais.");
            }

        }

    }
}
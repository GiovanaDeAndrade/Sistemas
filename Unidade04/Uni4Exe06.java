package Unidade04;

import java.util.Scanner;

public class Uni4Exe06 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite M para Masculino e F para feminino:");
            char letra = sc.next().toUpperCase().charAt(0);

            if (letra == 'M') {
                System.out.println("Masculino");

            } else if (letra == 'F') {
                System.out.println("Feminino");
            }

            else if (letra == 'I') {
                System.out.println("Não informado");
            }

            else {
                System.out.println("Entrada Incorreta");
            }

        }
    }

}

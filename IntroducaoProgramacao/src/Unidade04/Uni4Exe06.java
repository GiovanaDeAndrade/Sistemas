package Unidade04;

import java.util.Scanner;

public class Uni4Exe06 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite M para Masculino e F para feminino:");
            char letra = sc.next().toUpperCase().charAt(0);

            if (letra == 'M') {
                System.out.print("Masculino");

            } else if (letra == 'F') {
                System.out.print("Feminino");
            }

            else if (letra == 'I') {
                System.out.print("Não informado");
            }

            else {
                System.out.print("Entrada Incorreta");
            }

        }
    }

}

package Unidade04;

import java.util.Scanner;

public class Uni4Exe10 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Informe a idade do João: ");
            int joao = sc.nextInt();

            System.out.print("Informe a idade do Carlos: ");
            int carlos = sc.nextInt();

            System.out.print("Informe a idade da Helena: ");
            int helena = sc.nextInt();

            if (joao > carlos && helena > carlos) {
                System.out.println("Carlos é o mais novo.");

            } else if (joao > helena && carlos > helena) {
                System.out.println("Helena é a mais nova;");

            } else if (carlos > joao && helena > joao) {
                System.out.println("Joao é o mais novo;");
            }

        }

    }

}

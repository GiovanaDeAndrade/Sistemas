
package Unidade04;

import java.util.Scanner;


public class Uni4Exe26 {

    public static void main(String[] args) {


        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Escolha uma opção: \n");

            System.out.print("T : Calcula a área de um triângulo de base B e altura H\n");
            System.out.print("Q : Calcula a área de um quadrado de lado L\n");
            System.out.print("R : Calcula a área de um retângulo de base B e altura A\n");
            System.out.print("C : Calcula a área de um círculo de raio R\n");

            char opcao = sc.next().toUpperCase().charAt(0);

            switch (opcao) {
                case 'T':
                    System.out.print("Informe o valor da base (B): ");
                    float base = sc.nextFloat();

                    System.out.print("Informe o valor da altura (H): ");
                    float altura = sc.nextFloat();

                    System.out.printf("A área deste triângulo é: " + ((base * altura) / 2) + "cm³");

                    break;

                case 'Q':
                    System.out.print("Informe o valor do lado do Quadrado: ");
                    float lado = sc.nextFloat();

                    System.out.printf("A área deste triângulo é: " + (lado * 2) + "cm³");

                    break;

                case 'R':
                    System.out.print("Informe o valor da base (B)");
                    float base2 = sc.nextFloat();

                    System.out.print("Informe o valor da altura (H)");
                    float altura2 = sc.nextFloat();

                    System.out.printf("A área deste retângulo é: " + (base2 * altura2) + "cm³");

                    break;

                case 'C':
                    System.out.print("Informe o valor do raio (R): ");
                    float raio = sc.nextFloat();

                    System.out.printf("A área deste triângulo é: %.2f ", (Math.PI * (raio * raio)), "cm³");

                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        }
    }

}


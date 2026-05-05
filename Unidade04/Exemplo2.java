package Unidade04;

import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma das opções: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Numero 1");
                break;

            case 2:
                System.out.println("Numero 2");
                break;

            case 3:
                System.out.println("Numero 3");
                break;

            case 4:
                System.out.println("Numero 4");
                break;

            case 5:
                System.out.println("Numero 5");
                break;

            case 6:
                System.out.println("Numero 6");
                break;

            case 7:
                System.out.println("Numero 7");
                break;

            case 8:
                System.out.println("Numero 8");
                break;

            case 9:
                System.out.println("Numero 9");
                break;

            case 10:
                System.out.println("Numero 10");
                break;

            default:
                System.out.println("Numero invalid");

                sc.close();

        }

    }

}

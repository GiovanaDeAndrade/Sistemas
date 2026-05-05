package Unidade04;

import java.util.Scanner;

public class Uni4Exe24 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Informe o valor 1: ");
            int valor1 = sc.nextInt();

            System.out.print("Informe o valor 2: ");
            int valor2 = sc.nextInt();

            System.out.print("Informe o valor 3: ");
            int valor3 = sc.nextInt();

            System.out.print("Opção = 1, ordem crescente: \r\n" +
                    "Opção = 2, ordem decrescente:\r\n" +
                    "Opção = 3, o maior valor no meio: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    
                    if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3) {
                        System.out.print(valor3 + " " + valor2 + " " + valor1);

                    } else if (valor1 > valor2 && valor1 > valor3 && valor3 > valor2) {
                        System.out.print(valor2 + " " + valor3 + " " + valor1);

                    } else if (valor3 > valor1 && valor3 > valor2 && valor2 > valor1) {
                        System.out.print(valor1 + " " + valor2 + " " + valor3);

                    } else if (valor3 > valor1 && valor3 > valor2 && valor1 > valor2) {
                        System.out.print(valor2 + " " + valor1 + " " + valor3);

                    } else if (valor2 > valor1 && valor2 > valor3 && valor1 > valor3) {
                        System.out.print(valor3 + " " + valor1 + " " + valor2);

                    } else if (valor2 > valor1 && valor2 > valor3 && valor3 > valor1) {
                        System.out.print(valor1 + " " + valor3 + " " + valor2);
                    }
                   

                    break;

                    case 2:

                     if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3) {
                        System.out.print(valor1 + " " + valor2 + " " + valor3);

                    } else if (valor1 > valor2 && valor1 > valor3 && valor3 > valor2) {
                        System.out.print(valor1 + " " + valor3 + " " + valor2);

                    } else if (valor3 > valor1 && valor3 > valor2 && valor2 > valor1) {
                        System.out.print(valor3 + " " + valor2 + " " + valor1);

                    } else if (valor3 > valor1 && valor3 > valor2 && valor1 > valor2) {
                        System.out.print(valor3 + " " + valor1 + " " + valor2);

                    } else if (valor2 > valor1 && valor2 > valor3 && valor1 > valor3) {
                        System.out.print(valor2 + " " + valor1 + " " + valor3);

                    } else if (valor2 > valor1 && valor2 > valor3 && valor3 > valor1) {
                        System.out.print(valor2 + " " + valor3 + " " + valor1);
                    }

                    break;

                    case 3:
                    if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3) {
                        System.out.print(valor2 + " " + valor1 + " " + valor3);

                    } else if (valor1 > valor2 && valor1 > valor3 && valor3 > valor2) {
                        System.out.print(valor3 + " " + valor2 + " " + valor2);

                    } else if (valor3 > valor1 && valor3 > valor2 && valor2 > valor1) {
                        System.out.print(valor2 + " " + valor3 + " " + valor1);

                    } else if (valor3 > valor1 && valor3 > valor2 && valor1 > valor2) {
                        System.out.print(valor1 + " " + valor3 + " " + valor2);

                    } else if (valor2 > valor1 && valor2 > valor3 && valor1 > valor3) {
                        System.out.print(valor1 + " " + valor2 + " " + valor3);

                    } else if (valor2 > valor1 && valor2 > valor3 && valor3 > valor1) {
                        System.out.print(valor3 + " " + valor2 + " " + valor1);
                    }

                    break;

                default: System.out.println("Valor invalido. ");
                    break;
            }

        }

    }

}

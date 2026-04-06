package Unidade04;

import java.util.Scanner;

public class Uni4Exe24 {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Informe o valor 1: ");
            int valor1 = sc.nextInt();

            System.out.println("Informe o valor 2: ");
            int valor2 = sc.nextInt();

            System.out.println("Informe o valor 3: ");
            int valor3 = sc.nextInt();

            System.out.println("Opção = 1, escreva os 3 valores em ordem crescente\r\n" + 
                                "Opção = 2, escreva os 3 valores em ordem decrescente\r\n" + 
                                "Opção = 3, escreva os 3 valores de forma que o maior valor fique no meio");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1: 
                    if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3) {
                        System.out.println(valor1 + " " + valor2 + " " + valor3);
                        
                    }














                    
                    break;
            
                default:
                    break;
            }



























        }
        





    }

}

package Unidade04;

import java.util.Scanner;

public class Uni4Exe25 {

    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Informe o valor 1: ");
            float valor1 = sc.nextFloat();

            System.out.print("Informe o valor 2: ");
            float valor2 = sc.nextFloat();

            System.out.println("Escolha uma opção:\n" +
                                "1 - Soma de dois números.\n" +
                                "2 - Diferença entre dois números.\n" +
                                "3 - Produto entre dois números.\n" +
                                "4 - Divisão entre dois números (o denominador não pode ser zero).");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1: System.out.println("A soma é: " + (valor1 + valor2));
                    
                    break;

                case 2: System.out.println("A diferença é: " + (valor1 - valor2));
                    
                    break;

                case 3: System.out.println("O produto é: " + (valor1 * valor2));
                    
                    break;

                case 4: if(valor1 != 0 && valor2 != 0){
                    System.out.println("A divisão é: " + (valor1 / valor2));}

                    else{System.out.println("Valor inválido.");}
                    
                    break;
            
                default: System.out.println("Opção inválida.");
                    break;
            }










        }
    }

}

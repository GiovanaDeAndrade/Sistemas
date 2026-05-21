package Unidade04;

import java.util.Scanner;

public class Uni4Exe22 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Escolha um número: ");
            int valor = sc.nextInt();

            switch (valor) {
                case 1: System.out.print("Bacharel em Ciência da Computação");
                    
                    break;

                case 2: System.out.print("Licenciado em Computação");
                    
                    break;

                case 3: System.out.print("Bacharel em Sistemas de Informação");
                    
                    break;
            
                default: System.out.print("Curso Inválido");
                    break;
            }





        }
    }

}

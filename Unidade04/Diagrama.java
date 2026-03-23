package Unidade04;

import java.util.Scanner;

public class Diagrama {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)){

            System.out.print("Informe sua idade: ");
                int idade = sc.nextInt();

            if( idade >= 18){ 
                System.out.print("Maior de idade.");

            } else if ( idade < 18 && idade > 6){ 
                System.out.print("Você é adolescente.");

            } else {
                System.out.print("Você é criancinha.");
            }

        }
    }
}

    



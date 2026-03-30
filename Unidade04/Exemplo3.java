package Unidade04;

import java.util.Scanner;


public class Exemplo3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Diga uma letra: ");
        char letra = sc.next().toUpperCase().charAt(0);
    
        switch (letra) {
                case 'A':
                System.out.println("Vogal");
                break;

                case 'E':
                System.out.println("Vogal");
                break;

                case 'I':
                System.out.println("Vogal");
                break;

                case 'O':
                System.out.println("Vogal");
                break;

                case 'U':
                System.out.println("Vogal");                
                break;
        
            default: 
            System.out.println("Consoante");
                break;
        }
    }

}

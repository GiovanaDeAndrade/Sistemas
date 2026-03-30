package Unidade04;

import java.util.Scanner;

public class Uni4Exe05 {

    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Você gosta da cor azul?");
            String resposta = sc.next();

            boolean azul = false;
            if (resposta.equalsIgnoreCase("Sim")) {
                azul = true;

            } else {
                System.out.println("Que feio.");
            }
                
             if (azul == true){
                System.out.println("Parabéns");
            
            } 
        }
     }
}



package Unidade04;

import java.util.Scanner;

public class Uni4Exe11 {

    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Informe a idade de João: ");
            int joao = sc.nextInt();

            System.out.println("Informe a idade de Carlos: ");
            int carlos = sc.nextInt();

            System.out.println("Informe a idade de Helena: ");
            int helena = sc.nextInt();

            if (joao == carlos && carlos == helena){
                System.out.println("São trigêmeos.");

            } else if (joao == carlos && carlos != helena){
                System.out.println("Carlos e João são gêmeos.");

            }  else if (joao != carlos && carlos == helena){
                System.out.println("Carlos e Helena são gêmeos.");

            } else if (joao == helena && carlos != helena){
                System.out.println("Helena e João são gêmeos.");

            } else if (joao != carlos && carlos != helena){
                System.out.println("Apenas irmãos normais.");

            }















        }
    }

}

package Unidade04;

import java.util.Scanner;

public class Uni4Exe11 {

    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Informe a idade de João: ");
            int joao = sc.nextInt();

            System.out.print("Informe a idade de Carlos: ");
            int carlos = sc.nextInt();

            System.out.print("Informe a idade de Helena: ");
            int helena = sc.nextInt();

            if (joao == carlos && carlos == helena){
                System.out.print("São trigêmeos.");

            } else if (joao == carlos && carlos != helena){
                System.out.print("Carlos e João são gêmeos.");

            }  else if (joao != carlos && carlos == helena){
                System.out.print("Carlos e Helena são gêmeos.");

            } else if (joao == helena && carlos != helena){
                System.out.print("Helena e João são gêmeos.");

            } else if (joao != carlos && carlos != helena){
                System.out.print("Apenas irmãos normais.");

            }















        }
    }

}

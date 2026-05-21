package Unidade04;

import java.util.Scanner;

public class Uni4Exe19 {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Informe o valor de X: ");
            int x = sc.nextInt();

            System.out.print("Informe o valor de Y: ");
            int y = sc.nextInt();


            if(x == 0 && y == 0){
                System.out.print("Quadrante 0");}

                else if(x > 0 && y > 0){
                System.out.print("Quadrante 1");

                } else if(x < 0 && y > 0){
                System.out.print("Quadrante 2");

                } else if(x < 0 && y < 0){
                System.out.print("Quadrante 3");

                } else if(x > 0 && y < 0){
                System.out.print("Quadrante 4");}
            }
        }

        }
          

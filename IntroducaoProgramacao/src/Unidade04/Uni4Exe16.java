package Unidade04;

import java.util.Scanner;

public class Uni4Exe16 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Informe a idade da primeira mulher:");
            int m1 = sc.nextInt();

            System.out.print("Informe a idade da segunda mulher:");
            int m2 = sc.nextInt();

            System.out.print("Informe a idade do primeiro homem:");
            int h1 = sc.nextInt();

            System.out.print("Informe a idade do segundo homem:");
            int h2 = sc.nextInt();

            if (m1 != m2 && m1 != h1 && m2 != h1 && h1 != h2 && m1 != h2 && m2 != h2) {

                if(m1 > m2 && h1 > h2){
                    System.out.print("Soma: " + (m2 + h1) + " Produto: " + (m1 * h2));
                } else if(m1 < m2 && h1 < h2){
                    System.out.print("Soma: " + (m1 + h2) + " Produto: " + (m2 * h1));
                } else if(m1 > m2 && h1 < h2){
                    System.out.print("Soma: " + (m2 + h2) + " Produto: " + (m1 * h1));
                } else if(m1 < m2 && h1 > h2){
                    System.out.print("Soma: " + (m1 + h1) + " Produto: " + (m2 * h2));
                }

            }

        }
    }

}

package Unidade02;

import java.util.Scanner;

public class Uni2Exe05 {



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int A, B, C, D;
        int total;

        System.out.println("Digite um valor A: ");
        A = sc.nextInt();

        System.out.println("Digite um valor B: ");
        B = sc.nextInt();

        System.out.println("Digite um valor C: ");
        C = sc.nextInt();

        System.out.println("Digite um valor D: ");
        D = sc.nextInt();

        total = ((A * B) - (C * D));

        System.out.println("O total da diferença entre os produtos de A e B, e C e D é: " + total );

        sc.close();
    }


}



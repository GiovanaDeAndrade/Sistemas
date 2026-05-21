package Unidade02;

import java.util.*;

public class Uni2Exe01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;
        int soma = 0;

        System.out.print("Digite um número: ");
        n1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        n2 = sc.nextInt();

        soma = n1 + n2;
        
        System.out.print("O total da soma é: " + soma);

        sc.close();

    }

}
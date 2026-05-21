package Unidade02;

import java.util.Scanner;

public class Uni2Exe03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio = 0;

        System.out.print("Informe o valor do raio: ");
        raio = sc.nextDouble();

        double Area = Math.PI * Math.pow(raio, 2);

        System.out.print("O valor da Área da Circunferência é: " + Area);

        sc.close();
       
    }
}
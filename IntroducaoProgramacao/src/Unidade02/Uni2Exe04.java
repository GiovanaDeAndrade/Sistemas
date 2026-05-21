package Unidade02;

import java.util.Scanner;

public class Uni2Exe04 {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    double A = 0;
    double B = 0;
    
    System.out.println("Digite o 1º número: ");
    A = sc.nextDouble();

    System.out.println("Digite o 2º número: ");
    B = sc.nextDouble();

    double media = 0;

    media = ((A * 3.5) + (B * 7.5)) / 11;

    System.out.println("O valor da média ponderada é: " + media);

    sc.close();
}
}

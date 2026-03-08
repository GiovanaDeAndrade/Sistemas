package trabalhoUni02;

import java.util.Scanner;

public class Uni2Exe20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de dobras: ");
        int dobras = sc.nextInt();

        int lado = (int)Math.pow(2, dobras) + 1;

        int quadrados = lado * lado;

        System.out.println("A quantidade de quadrados será: " + quadrados);

        sc.close();
    }
}



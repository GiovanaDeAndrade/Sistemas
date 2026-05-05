package Unidade02;

import java.util.*;

public class Uni2Exe02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1, n2, multi = 0;

        System.out.print("Digite um número: ");
        n1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        n2 = sc.nextInt();

        multi = n1 * n2;

        System.out.print("O resultado é: " + multi);

        sc.close();

    }

}

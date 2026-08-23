package Semestre01.Unidade06;

import java.util.Scanner;

public class Uni6Exe01 {
    private Scanner sc = new Scanner(System.in);
    private int[] valores = new int[10];

    public Uni6Exe01() {

        lerValores();
        imprimirInvertido();

    }

    public void lerValores() {
        for (int i = 0; i < valores.length; i++) {
            System.out.print("[" + valores[i] + "]");
            valores[i] = sc.nextInt();

        }
    }

    public void imprimirInvertido() {
        System.out.println("Valores na ordem inversa:");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.println("[" + valores[i] + "]");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe01();
    }

}

package Semestre01.Unidade06;

import java.util.Scanner;

public class Uni6Exe04 {

    Scanner sc = new Scanner(System.in);
    private int tamanho = 3;
    private int[] vetor1 = new int[tamanho];
    private int[] vetor2 = new int[tamanho];
    private int[] vetor3 = new int[tamanho];

    public void lerValores() {
        System.out.println("Digite os valores do vetor 1: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o valor: " + i);
            vetor1[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor 2: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor: " + i);
            vetor2[i] = sc.nextInt();
        }
    }

    public void somaVetores() {
        for (int i = 0; i < tamanho; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }
    }

    public void escreverValores() {
        System.out.print("Vetor 1:  [");
        for (int i = 0; i < tamanho; i++) {
            if (i < tamanho - 1) {
                System.out.print(vetor1[i] + "]");
            } else {
                System.out.println(vetor1[i]);
            }

        }
        System.out.println("Vetor2: [");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor2[i] + ",");
        }
        System.out.println("]");
        System.out.println("Vetor3: [");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("[" + vetor3[i] + "]");
        }
    }
    public Uni6Exe04(){

    }

    public static void main(String[] args) {
        Uni6Exe04 conta = new Uni6Exe04();

        conta.lerValores();
        conta.somaVetores();
        conta.escreverValores();

    }
}

package Semestre01.Prova01;

import java.util.Scanner;

public class Questão02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Produto 1 -> R$50");
        System.out.println("Produto 2 -> R$100");
        System.out.println("Produto 3 -> R$200");

        float produto1 = 50f;
        float produto2 = 100f;
        float produto3 = 200f;

        System.out.print("Informe o código do produto desejado: ");
        int codigo = sc.nextInt();

        System.out.print("Informe a quantidade desejada: ");
        int quantidade = sc.nextInt();

        float valorTotal = 0;

        switch (codigo) {

            case 1:
                valorTotal = quantidade * produto1;
                break;

            case 2:
                valorTotal = quantidade * produto2;
                break;

            case 3:
                valorTotal = quantidade * produto3;
                break;

            default:
                System.out.println("Produto inválido.");
                sc.close();
                return;
        }

        if (quantidade <= 0) {
            System.out.println("Quantidade inválida.");
        } else if (quantidade >= 10 || valorTotal >= 500) {

            float desconto = valorTotal * 0.15f;
            float valorComDesconto = valorTotal - desconto;

            System.out.printf("Valor total da compra: R$%.2f%n", valorTotal);
            System.out.printf("Valor total com desconto: R$%.2f%n", valorComDesconto);

        } else {
            System.out.printf("Valor final da compra: R$%.2f%n", valorTotal);
        }

        sc.close();
    }
}
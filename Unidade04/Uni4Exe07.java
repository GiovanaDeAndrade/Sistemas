package Unidade04;

import java.util.Scanner;

public class Uni4Exe07 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Entre com o peso da carta:");
            float carta = sc.nextFloat();

            float pesoExecedido = carta - 50;
            float qtAdicional = (pesoExecedido / 20) + 1;

            if (carta <= 50) {
                System.out.printf("Valor a pagar: R$%.2f", 0.45f);

            } else {
                System.out.printf("Valor a pagar: R$%.2f" , (0.45f + (0.45f * qtAdicional)));

            }

        }

    }
}

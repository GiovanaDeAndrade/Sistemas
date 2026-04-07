package Unidade04;

import java.util.Scanner;

public class Uni4Exe12 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Informe o lado 1: ");
            float lado1 = sc.nextFloat();

            System.out.print("Informe o lado 2: ");
            float lado2 = sc.nextFloat();

            System.out.print("Informe o lado 3: ");
            float lado3 = sc.nextFloat();

            if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado3)) {
                if (lado1 == lado2 && lado1 == lado3) {
                    System.out.print("É equilatero.");
                } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.print("É isóseles.");
                } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                    System.out.print("É escaleno.");
                }

            } else {
                System.out.print("Não forma um triângulo.");
            }

        }
    }

}

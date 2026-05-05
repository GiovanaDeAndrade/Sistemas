package Unidade02;

import java.util.Scanner;

public class Uni2Exe14 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Informe o valor: ");
            int valor = sc.nextInt();

            int val = valor;

            int cedula100 = valor / 100;
            valor = valor % 100;

            int cedula50 = valor / 50;
            valor = valor % 50;

            int cedula20 = valor / 20;
            valor = valor % 20;

            int cedula10 = valor / 10;
            valor = valor % 10;

            int cedula5 = valor / 5;
            valor = valor % 5;

            int cedula2 = valor / 2;
            valor = valor % 2;

            int cedula1 = valor / 1;
            valor = valor % 1;

            System.out.println("Valor: " + val + "\nCédulas de 100: " + cedula100 + "\nCédulas de 50: " + cedula50 +
                    "\nCédulas de 20: " + cedula20 + "\nCédulas de 10: " + cedula10 + "\nCédulas de 5: " + cedula5 +
                    "\nCédulas de 2: " + cedula2 + "\nCédulas de 1: " + cedula1);

        }
    }
}

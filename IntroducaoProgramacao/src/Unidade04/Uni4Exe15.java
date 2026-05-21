package Unidade04;

import java.util.Scanner;

public class Uni4Exe15 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Informe a quantos meses o funcionário foi admitido: ");
            int tempo = sc.nextInt();

            if (tempo < 12) {
                System.out.print("O funcionário irá receber 5% de reajuste");
            }

            else if (tempo > 12 && tempo < 49) {
                System.out.print("O funcionário irá receber 7% de reajuste");
            }

            else {
                System.out.print("Reajuste não informado");
            }
        }
    }

}

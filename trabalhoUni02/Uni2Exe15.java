package trabalhoUni02;

import java.util.*;

public class Uni2Exe15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor de saque: "); //perdao professor mas nao consegui fazer usando float :(
        int saque = sc.nextInt();

        int valSaque = saque;

        int nota100 = (saque / 100);
        saque = saque % 100;

        int nota50 = (saque / 50);
        saque = saque % 50;

        int nota20 = (saque / 20);
        saque = saque % 20;

        int nota10 = (saque / 10);
        saque = saque % 10;

        int nota5 = (saque / 5);
        saque = saque % 5;

        int nota2 = (saque / 2);
        saque = saque % 2;

        int centavos = saque * 100;

        int real1 = centavos / 100;
        centavos = centavos % 100;

        int moeda50 = (centavos / 50);
        centavos = centavos % 50;

        int moeda25 = (centavos / 25);
        centavos = centavos % 25;

        int moeda10 = (centavos / 10);
        centavos = centavos % 10;

        int moeda5 = (centavos / 5);
        centavos = centavos % 5;

        int moeda1 = (centavos / 1);
        centavos = centavos % 1;

        System.out.println(
                        "\n--- Cédulas ---\n" + 
                        "\nCédulas de 100: " + nota100 +
                        "\nCédulas de 50: " + nota50 +
                        "\nCédulas de 20: " + nota20 +
                        "\nCédulas de 10: " + nota10 +
                        "\nCédulas de 5: " + nota5 +
                        "\nCédulas de 2: " + nota2 +
                        "\n--- Moedas ---\n" +
                        "\nMoedas de 1 real: " + real1 +
                        "\nMoedas de 50 centavos: " + moeda50 +
                        "\nMoedas de 25 centavos: " + moeda25 +
                        "\nMoedas de 10 centavos: " + moeda10 +
                        "\nMoedas de 5 centavos: " + moeda5 +
                        "\nMoedas de 1 centavo: " + moeda1 +
                        "\nValor total do saque: " + valSaque );

        sc.close();

    }

}

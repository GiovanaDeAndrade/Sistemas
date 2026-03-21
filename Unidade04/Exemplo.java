package Unidade04;

import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Vamos validar se você tem direito a meia entrada");

            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();

            System.out.print("Você doa sangue?");

            String resposta = sc.next();

            boolean doador = false;

            resposta.toUpperCase();

            if (resposta.equalsIgnoreCase("S") || resposta.equalsIgnoreCase("Sim")) {
                doador = true;
            }

            if (idade < 18 || idade >= 60 || doador) {
                System.out.println("Tem direito!");
            } else {
                System.out.println("Não tem direito");
            }
        }
    }
}

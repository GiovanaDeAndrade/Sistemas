package Unidade02;

import java.util.*;

public class Uni2Exe10 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int segundos, horas, minutos, resto;

            System.out.print("Digite o tempo em segundos: ");
            segundos = sc.nextInt();

            horas = segundos / 3600;

            resto = segundos % 3600;

            minutos = resto / 60;

            segundos = resto % 60;

            System.out.printf("%d:%02d:%02d", horas, minutos, segundos);

            sc.close();
        }
    }
}

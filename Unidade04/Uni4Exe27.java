package Unidade04;

import java.util.Scanner;

public class Uni4Exe27 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Informe a hora de Chegada: ");
            System.out.println("Horas: ");
            int horaC = sc.nextInt();

            System.out.println("Minutos: ");
            int minC = sc.nextInt();

            System.out.println("Informe a hora de Saída: ");
            System.out.println("Horas: ");
            int horaS = sc.nextInt();

            System.out.println("Minutos: ");
            int minS = sc.nextInt();

            int totalHoras = horaS - horaC;
            int totalMinutos = minS - minC;


            if (horaC >= 0 || horaC < 24 && minC >= 0 && minC < 60 && horaS >= 0 || horaS < 24 && minS >= 0 && minS < 60) {

                int minCTotal = (horaC * 60) + minC;
                int minSTotal = (horaS * 60) + minS;
                int minTotal = minCTotal + minSTotal;
                int qHoras = minTotal / 60;
                int qMinutos = (minTotal % 60);
                
            }













        }
    }

}

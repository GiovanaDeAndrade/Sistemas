package Unidade04;

import java.util.Scanner;

public class Uni4Exe27 {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hChegada = sc.nextInt();
        int mChegada = sc.nextInt();
        int hSaida = sc.nextInt();
        int mSaida = sc.nextInt();

        if (hChegada < 0 || hChegada > 23 || hSaida < 0 || hSaida > 23 ||
            mChegada < 0 || mChegada > 59 || mSaida < 0 || mSaida > 59) {
            System.out.println("Horario invalido");
        } else {
            int chegadaMin = hChegada * 60 + mChegada;
            int saidaMin = hSaida * 60 + mSaida;

            if (saidaMin <= chegadaMin) {
                System.out.println("Horario invalido");
            } else {
                int tempoTotal = saidaMin - chegadaMin;

                int horas = tempoTotal / 60;
                int minutos = tempoTotal % 60;

                if (tempoTotal < 30) {
                    horas = 1;
                } else {
                    if (minutos >= 30) {
                        horas++;
                    }
                    if (horas == 0) {
                        horas = 1;
                    }
                }

                double valor = 0;

                switch (horas) {
                    case 1:
                        valor = 5.0;
                        break;
                    case 2:
                        valor = 10.0;
                        break;
                    case 3:
                        valor = 17.5;
                        break;
                    case 4:
                        valor = 25.0;
                        break;
                    default:
                        valor = 25.0 + (horas - 4) * 10.0;
                        break;
                }

                int horasReais = tempoTotal / 60;
                int minutosReais = tempoTotal % 60;

                System.out.println(horasReais + "h " + minutosReais + "min");
                System.out.println(horas);
                System.out.println(valor);
            }
        }

        sc.close();
    }




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
>>>>>>> 3e4ce9fdbe231a460db8a32a2f1218b1d9b32973

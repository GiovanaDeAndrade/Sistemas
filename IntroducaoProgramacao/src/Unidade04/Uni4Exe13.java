package Unidade04;

import java.util.Scanner;

public class Uni4Exe13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a carta 1: ");
        int c1 = sc.nextInt();

        System.out.print("Informe a carta 2: ");
        int c2 = sc.nextInt();

        System.out.print("Informe a carta 3: ");
        int c3 = sc.nextInt();

        int cartasBoas = 0;

        if (c1 == 1 || c1 == 2 || c1 == 3) {
            cartasBoas ++;
        }
        if (c2 == 1 || c2 == 2 || c2 == 3) {
            cartasBoas ++;
        }
        if (c3 == 1 || c3 == 2 || c3 == 3) {
            cartasBoas ++;
        }

        if(cartasBoas == 1){
            System.out.print("Truco");
        } else if(cartasBoas == 2){
            System.out.print("Seis");
        } else if(cartasBoas == 3){
            System.out.print("Nove");
        }

        System.out.print("Quantidade de cartas boas: " + cartasBoas);

        sc.close();

    }

}

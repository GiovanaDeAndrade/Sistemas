package Unidade02;

import java.util.*;

public class Uni2Exe16 {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

        double lata = 350;
        double garrafa = 600;
        double litrao = 2000;

        System.out.println("Informe a quantidade de latas de 350ml: ");
        double q1 = sc.nextDouble();

        System.out.println("Informe a quantidade de garrafas de 600ml: ");
        double q2 = sc.nextDouble();

        System.out.println("Informe a quantidade de garrafas de 2L: ");
        double q3 = sc.nextDouble();

        double total = ((lata * q1) + (garrafa * q2) + (litrao * q3)) / 1000;

        System.out.println("A quantidade total em litros será de: " + total + "L");

     sc.close();

    }

}

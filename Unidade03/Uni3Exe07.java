package Unidade03;

import java.util.Scanner;

public class Uni3Exe07 {

    private float lata, garrafa, doisL, q1, q2, q3;

    public Uni3Exe07(float lata, float garrafa, float doisL, float q1, float q2, float q3){
        this.lata = lata;
        this.garrafa = garrafa;
        this.doisL = doisL;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
    }

    public float totalDeLitros(){
        return (lata * q1) + (garrafa * q2) + (doisL * q3);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de latas: ");
        float q1 = sc.nextFloat();
        float lata = 350;

        System.out.println("Informe a quantidade de garrafas de 600ml: ");
        float q2 = sc.nextFloat();
        float garrafa = 600;

        System.out.println("Informe a quantidade de garrafas de 2L: ");
        float q3 = sc.nextFloat();
        float doisL = 2000;

        Uni3Exe07 conta = new Uni3Exe07(lata, garrafa, doisL, q1, q2, q3);

        System.out.println("O total de litros é: " + (conta.totalDeLitros() / 1000) + "L");

        sc.close();
        
    }

}

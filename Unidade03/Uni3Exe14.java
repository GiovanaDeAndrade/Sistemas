package Unidade03;

import java.util.Scanner;

public class Uni3Exe14 {
    private float distancia;
    private float tempo;

    public Uni3Exe14(float distancia, float tempo){
        this.distancia = distancia;
        this.tempo = tempo;

    }

    public float velocidade(){
        return this.distancia / this.tempo;

    }

    public float litro(){
        return distancia / 12;

    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)){;

        System.out.print("Informe a distancia percorrida na viagem: ");
        float distancia = sc.nextFloat();

        System.out.print("Informe o tempo lavado: ");
        float tempo = sc.nextFloat();

        Uni3Exe14 conta = new Uni3Exe14(distancia, tempo);

        System.out.print("A velocidade média foi de " + conta.velocidade() + "km/h e a quantidade de combustível usado foi " + conta.litro() + " litros.");

        }

    }
}

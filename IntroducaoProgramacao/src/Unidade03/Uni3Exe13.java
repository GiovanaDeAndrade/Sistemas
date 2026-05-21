package Unidade03;

import java.util.Scanner;

public class Uni3Exe13 {
    float metroAltura;
    float metroLargura;
    float metro2;

    public Uni3Exe13(float metroAltura, float metroLargura, float metro2){
        this.metro2 = metro2;
        this.metroAltura = metroAltura;
        this.metroLargura = metroLargura;

    }

    public float valor(){
        return (metroAltura * metroLargura) * metro2;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float azulejo = 12.5f;

        System.out.println("Informe a largura da parede: ");
        float metroLargura = sc.nextFloat();

        System.out.println("Informe a altura da parede: ");
        float metroAltura = sc.nextFloat();

        float metro2 = azulejo * 9;

        Uni3Exe13 conta = new Uni3Exe13(metro2, metroLargura, metroAltura);

        System.out.printf("O valor final será: R$%.2f" , conta.valor());

        sc.close();

    }

}

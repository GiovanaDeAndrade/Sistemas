package Unidade03;

import java.util.Scanner;

public class Uni3Exe11 {
    private float celsius;

    public Uni3Exe11(float celsius){
        this.celsius = celsius;

    }

    public float farenheit(){
        return (celsius * 1.8f) + 32;

    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)){

            System.out.print("Informe o valor em Celsius: ");
            float celsius = sc.nextFloat();

            Uni3Exe11 conta = new Uni3Exe11(celsius);

            System.out.printf("O valor em farenheit será: %.2f" , conta.farenheit());

        }
    }

}

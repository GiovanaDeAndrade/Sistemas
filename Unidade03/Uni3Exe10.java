package Unidade03;

import java.util.Scanner;

public class Uni3Exe10 {
    private double cat1;
    private double cat2;

    public Uni3Exe10(double cat1, double cat2){
        this.cat1 = cat1;
        this.cat2 = cat2;

    }

    public double hipotenusa(){
        return Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));

    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){   

            System.out.print("Informe o valor do cateto 1: ");
            double cat1 = sc.nextDouble();

            System.out.print("Informe o valor do cateto 2:");
            double cat2 = sc.nextDouble();

            Uni3Exe10 conta = new Uni3Exe10(cat1, cat2);

            System.out.printf("O valor da hipotenusa é: %.2f" , conta.hipotenusa());

        }
    }

}

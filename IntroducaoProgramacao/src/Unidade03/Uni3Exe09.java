package Unidade03;

import java.util.Scanner;

public class Uni3Exe09 {
    private double raio, altura;
    
    public Uni3Exe09(double raio, double altura){
        this.raio = raio;
        this.altura = altura;

    }

    public double volume(){
        return Math.pow(raio,2) * altura * Math.PI;
    }

    public static void main(String[] args) {

       try( Scanner sc = new Scanner(System.in)){

        System.out.print("Informe o raio: ");
        double raio = sc.nextDouble();

        System.out.print("Informe a altura: ");
        double altura = sc.nextDouble();

        Uni3Exe09 conta = new Uni3Exe09(raio, altura);

        System.out.printf("O volume da lata de óleo é: %.2f cm³" , conta.volume());

       }
        
    }
    
}

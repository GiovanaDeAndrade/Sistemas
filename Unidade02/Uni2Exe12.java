package Unidade02;

 import java.util.*;

public class Uni2Exe12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double x1, x2, y1, y2;

        System.out.println("Informe os valores dos eixos X e Y do primeiro ponto.");

        System.out.print("Sendo X¹: "); 
        x1 = sc.nextDouble();

        System.out.print ("Sendo Y¹: "); 
        y1 = sc.nextDouble();

        System.out.println("Informe os valores dos eixos de X e Y do segundo ponto.");

        System.out.print("Sendo X²: "); 
        x2 = sc.nextDouble();

        System.out.print ("Sendo Y²: "); 
        y2 = sc.nextDouble();

        double ponto1 = (x2 -x1);
        double ponto2 = (y2 - y1);
        double potencia1 = Math.pow(ponto1, 2);
        double potencia2 = Math.pow(ponto2, 2);
        double soma = (potencia1 + potencia2);
        double raizTotal = Math.sqrt(soma);

        System.out.printf("A distância entre estes dois pontos é de: %.4f", raizTotal);

        sc.close();

    }

}


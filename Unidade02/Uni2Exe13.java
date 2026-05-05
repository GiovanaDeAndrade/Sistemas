package Unidade02;

import java.util.*;

public class Uni2Exe13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double distancia;

        System.out.println("Informe a distância desejada entre os carros (em quilometros): ");
        distancia = sc.nextDouble();

        double tempo = distancia * 2;

        System.out.println("Levará " + tempo + " minutos para o carro Y tomar essa distância do carro X.");

        sc.close();
    }
}

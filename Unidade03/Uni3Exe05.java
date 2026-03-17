package Unidade03;

import java.util.Scanner;

public class Uni3Exe05 {
    private float chip, alimento, frango;


public Uni3Exe05(float chip, float alimento, float frango){

    this.chip = chip;
    this.alimento = alimento;
    this.frango = frango;

}

public float valorTotal(){
    return (chip + (2 * alimento)) * frango;

}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe a quantidade de frangos: ");
    float frangoQtd = sc.nextFloat();
    float chipoVal = 4;
    float alimentoVal = 3.50f;


    Uni3Exe05 conta = new Uni3Exe05(chipoVal, alimentoVal, frangoQtd);

    System.out.printf("O valor total par amarcar todos os frangos será: R$%.2f" , conta.valorTotal());

    sc.close();
    
}

}

package Unidade03;

import java.util.Scanner;

public class Uni3Exe01 {

    private int largura;
    private int comprimento;

public Uni3Exe01 (int largura , int comprimento){
    this.largura = largura;
    this.comprimento = comprimento;
}

public int CalcularArea(){
    return this.largura * this.comprimento;

}

public static void main(String[] args) {

    int largura, comprimento;

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe a largura do terreno: ");
    largura = sc.nextInt();

    System.out.println("Informe a largura do comprimentoi: ");
    comprimento = sc.nextInt();

    Uni3Exe01 uni3Exe01 = new Uni3Exe01 (largura, comprimento);

    int area = uni3Exe01.CalcularArea();
    
    System.out.println("A area total é: " + area);

    sc.close();
    
}

}





    


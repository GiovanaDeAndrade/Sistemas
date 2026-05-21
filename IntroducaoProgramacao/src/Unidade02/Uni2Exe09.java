package Unidade02;

import java.util.*;

public class Uni2Exe09 {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    double dolar; 
    double cotacao;
    double reais;

    System.out.println("Informe a quantidade em dólar: ");
    dolar = sc.nextDouble();

    System.out.println("Informe a cotação do dólar hoje: ");
    cotacao = sc.nextDouble();

    reais = dolar * cotacao;

    System.out.printf("A quantidade em reais a ser devolvida será de: R$%.2f" , reais);

    sc.close();


}


}

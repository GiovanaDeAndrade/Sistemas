package Unidade03;

import java.util.Scanner;

public class Uni3Exe02 {
    private float valorDoCalcado;
    private float percentualDesconto;

public Uni3Exe02(float valorDoCalcado, float percentualDesconto){

   this.valorDoCalcado = valorDoCalcado;
   this.percentualDesconto = percentualDesconto;

}

public float totalDoDesconto(){
    return this.valorDoCalcado * (this.percentualDesconto / 100);

}

public float valorTotalAPagar(){
    return this.valorDoCalcado - this.totalDoDesconto();

}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor do produto: ");
    float valor = sc.nextFloat();
    float valorFixoPercentual = 12.0f;

    Uni3Exe02 classAula = new Uni3Exe02(valor, valorFixoPercentual);
    System.out.println("O valo rdo desconto é de R$" + classAula.totalDoDesconto());
    System.out.println("O preço do par de sapatos com desconto é R$" + classAula.valorTotalAPagar());

    sc.close();
    
}


    

}


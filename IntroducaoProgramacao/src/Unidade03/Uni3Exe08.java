package Unidade03;

import java.util.Scanner;

public class Uni3Exe08 {

    private double valorRecebido,cotacaoDolar;

    public Uni3Exe08(double valorRecebido, double cotacaoDolar){
        this.cotacaoDolar = cotacaoDolar;
        this.valorRecebido = valorRecebido;
    }

    public double conversao(){
        return cotacaoDolar * valorRecebido;
    }

    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Valor em dólares recebido pelo cliente:");
            double valorRecebido = sc.nextDouble();

            System.out.print("Cotação do dólar hoje:");
            double cotacaoDolar = sc.nextDouble();

            Uni3Exe08 conversao = new Uni3Exe08(valorRecebido, cotacaoDolar);

            System.out.printf("O atendente deve devolver R$%.2f para o cliente.", conversao.conversao());
        }
    }
}

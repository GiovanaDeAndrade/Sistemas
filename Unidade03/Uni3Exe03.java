package Unidade03;

import java.util.Scanner;

public class Uni3Exe03 {
    private float totalAbastecer;
    private float precoGasolina;

    public Uni3Exe03(float totalAbastecer, float precoGasolina){

        this.totalAbastecer = totalAbastecer;
        this.precoGasolina = precoGasolina;

    }

    public float valorAPagar(){
        return this.totalAbastecer / precoGasolina;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantia de pagamento para abastecer: ");
        float valor = sc.nextFloat();
        System.out.println("Informe o preço da gasolina: ");
        float gasolinaPreco = sc.nextFloat();

        Uni3Exe03 conta = new Uni3Exe03(valor, gasolinaPreco);
        
        System.out.printf("A quantidade de litros a abastecer o tanque é: R$%.2f" , conta.valorAPagar());

        sc.close();

    }

}



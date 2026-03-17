package Unidade03;

import java.util.Scanner;

public class Uni3Exe06 {
    private float quilo, prato;

    public Uni3Exe06(float quilo, float prato){
        this.quilo = quilo;
        this.prato = prato;

    }

    public float valorTotal(){
        return (quilo - prato) * 25;
    
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do prato em quilos: ");
        float quilos = sc.nextFloat();
        float prato = 0.750f;

        Uni3Exe06 conta = new Uni3Exe06 (quilos, prato);

        
        System.out.printf("O valor a pagar será: R$%.2f", conta.valorTotal());
         
        sc.close();
    }

}

package Unidade03;

import java.util.Scanner;

public class Uni3Exe15 {
    private int valor;

    public Uni3Exe15(int valor){
        this.valor = valor;
    }

    public int centenas(){
        return (valor / 100) % 100;
    }

    public int dezenas(){
        return (valor / 10) % 10;
    }

    public int unidades() {
        return valor % 10;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int valor = sc.nextInt();

        Uni3Exe15 conta = new Uni3Exe15(valor);

        System.out.println(conta.centenas() + " centena(s) " + conta.dezenas() + " dezena(s) " + conta.unidades() + " unidade(s).");
        


    }

}

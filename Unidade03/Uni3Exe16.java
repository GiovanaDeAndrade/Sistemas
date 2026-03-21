package Unidade03;

import java.util.Scanner;

public class Uni3Exe16 {

    private int valorCompra;
    private int valorCliente;

    public Uni3Exe16(int valorCompra, int valorCliente) {
        this.valorCompra = valorCompra;
        this.valorCliente = valorCliente;
    }

    public int troco() {
        return (valorCliente - valorCompra);

    }

    public int notas100() {
        return ((valorCliente - valorCompra) / 100 % 100);
    }

    public int notas10() {
        return ((valorCliente - valorCompra) / 10 % 10);
    }

    public int notas1() {
        return ((valorCliente - valorCompra) / 1 % 10);
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Informe o total da compra: ");
            int valorCompra = sc.nextInt();

            System.out.println("Informe o valor dado pelo cliente: ");
            int valorCliente = sc.nextInt();

            Uni3Exe16 conta = new Uni3Exe16(valorCompra, valorCliente);

            System.out.println("O valor do troco será de: " + conta.troco());

            System.out.println("nota de 100: " + conta.notas100());

            System.out.println("nota de 10: " + conta.notas10());

            System.out.println("nota de 1: " + conta.notas1());
        }
    }
}

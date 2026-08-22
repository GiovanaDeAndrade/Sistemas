package com.example.ExemploEncapsulamento;

public class App {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("Nome");
        conta.setSaldo(0);

        System.out.println(conta.getTitular());

        conta.depositar(300);
        conta.sacar(1);

        System.out.println("Saldo da conta: " + conta.getSaldo());
    }
}

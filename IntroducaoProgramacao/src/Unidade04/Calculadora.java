package Unidade04;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        float n1, n2;
        char operador;

       try ( Scanner sc = new Scanner(System.in)){

        System.out.println("Digite um número");
        n1 = sc.nextFloat();

        System.out.println("Digite outro número: ");
        n2 = sc.nextFloat();

        System.out.println("Digite a conta:");
        System.out.println("+ para somar:");
        System.out.println(" - para subtrair:");
        System.out.println("* para multiplicar:");
        System.out.println("/ para dividir:");
        System.out.println("% para o resto da divisão:");
         
        operador = sc.next().charAt(0);

        if (operador == '+'){
            somar(n1, n2);

        } else if (operador == '-'){
            diminuir(n1,n2);

        }else if (operador == '*'){
            multiplicar(n1,n2);

        }else if (operador == '/'){
            dividir(n1,n2);

        }else if (operador == '%'){
            resto(n1,n2);
    
        } else {System.out.println("Operador inválido.");}
}
}

    private static void resto(float n1, float n2) {
        System.out.println("O resto é: " + (n1 % n2));
    }

    private static void dividir(float n1, float n2) {
        System.out.println("A divisão é: " + (n1 / n2));
    }

    private static void multiplicar(float n1, float n2) {
       System.out.println("A multiplicação é: " + (n1 * n2));
    }

    private static void diminuir(float n1, float n2) {
        System.out.println("A subtração é: " + (n1 - n2));
    }

    private static void somar(float n1, float n2) {
       System.out.println("O retso é: " + (n1 +  n2));
    }
}
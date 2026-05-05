package Unidade02;

    import java.util.*;

public class Uni2Exe11 {

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    double A = 0;
    double B = 0;
    double C = 0;

    System.out.println("Informe o valor de A: ");
    A = sc.nextDouble();

    System.out.println("Informe o valor de B: ");
    B = sc.nextDouble();

    System.out.print("Informe o valor de C: ");
    C = sc.nextDouble();

    System.out.println("A área de um triângulo com a base no valor de A e altura de C: " + (A * C) / 2 + "cm");

    System.out.println("A área de um círculo com o raio no valor de C é: " + (2 * Math.PI * C) + "cm²");

    System.out.println("A área de um trapezio com as bases nos valores de A e B e a altura com o valor de C é: " + (( A+ B) * C / 2) + "cm");

    System.out.println("A área de um quadrado com o lado no valor de B é: " + B * B + "cm");

    System.out.println("A área de um retângulo com os lados nos valores de A e B é: " + A * B + "cm");

    sc.close();



}

}



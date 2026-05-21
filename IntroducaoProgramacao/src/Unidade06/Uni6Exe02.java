package Unidade06;

import java.util.Scanner;

public class Uni6Exe02 {
    private Scanner sc = new Scanner(System.in);
    private double[] valores = new double[12];
    private double media = 0;

    public Uni6Exe02() {

    }

    public void lerValores() {
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite um núemro real: ");
            valores[i] = sc.nextDouble();

        }

    }

    public void calcularMedia() {
        double soma = 0;
        for (int i = 0; i < 12; i++) {

            soma += valores[i];

        }

        media = soma / 12;

    }

    public void listarValoresMaiorQueMedia() {
        for (int i = 0; 1 < 12; i++) {
            if (valores[i] > media) {
                System.out.println("Valor " + valores[i] + "maior que a média " + media);

            }else {
                System.out.println("Não tem valores maiores que a média");
            } 

        }

    }

    public static void main(String[] args) {
        Uni6Exe02 conta = new Uni6Exe02();

        conta.lerValores();
        conta.calcularMedia();
        conta.listarValoresMaiorQueMedia();

    }

}

import java.util.Scanner;

public class Uni5Exe08 {

    public static void main(String[] args) {
        Scanner sc = new Scnanner(System.in);
        System.out.println("Informe a quantidade de numero a serem lidos");
        int qtde = sc.nextInt();
        int menor = 0;
        double media = 0;

        for (int i = 1; i <= qtde; i++) {

            System.out.println("Digite o numero: +i");
            int numero = sc.nextInt();
            if (numero < 0) {
                if (numero < menor) {
                    menor = numero;
                }
            } else {
                media = media + numero;
                qtdePositivos++;
            }

        } System.out.println("Menor valor negativo: " + menor);
            System.out.println("Maior numero positivos: " + media/qtdePositivos);

    } 
}

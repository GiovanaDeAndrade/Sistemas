import java.util.Scanner;

public class Uni5Exe06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de numeros");
        int n = sc.nextInt();

        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o nr " + i);
            double numero = sc.nextDouble();
            if (numero < menor) {
                menor = numero;
            } else if (numero > maior) {
                maior = numero;
            }

        }
        System.out.println("O menor numero é: " + menor);
        System.out.println("O maior numero: " + maior);

    }
}

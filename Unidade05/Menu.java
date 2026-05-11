import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int opcao = 0;
            do {

                System.out.println("Menu");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtrair");
                System.out.println("3 - Multiplicar");
                System.out.println("4 - Dividir");
                System.out.println("9 - Sair");

            } while (opcao != 9);

            switch (opcao) {
                case 1:
                    System.out.println("Escreva um número: ");
                    int n1 = sc.nextInt();

                    System.out.println("Escreva outor número: ");
                    int n2 = sc.nextInt();

                    System.out.println("Resultado: " + (n1 + n2));

                    break;

                case 2:
                    System.out.println("Escreva um número: ");
                    int n1 = sc.nextInt();

                    System.out.println("Escreva outor número: ");
                    int n2 = sc.nextInt();

                    System.out.println("Resultado: " + (n1 - n2));

                    break;

                case 3:
                    System.out.println("Escreva um número: ");
                    int n1 = sc.nextInt();

                    System.out.println("Escreva outor número: ");
                    int n2 = sc.nextInt();

                    System.out.println("Resultado: " + (n1 * n2));

                    break;

                case 4:
                    System.out.println("Escreva um número: ");
                    int n1 = sc.nextInt();

                    System.out.println("Escreva outor número: ");
                    int n2 = sc.nextInt();

                    System.out.println("Resultado: " + (n1 / n2));

                    break;

                default:
                    break;
            }
        }
    }
}

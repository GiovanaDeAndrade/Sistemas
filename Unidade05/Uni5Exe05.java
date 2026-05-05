import java.util.Scanner;

public class Uni5Exe05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = sc.nextInt();
        numero = numero / 2;
        int n = 8;
        String sequencia = "";

        for (int i = 1; i <= numero; i++) {
            sequencia += n + ",";
            n = n + 2;
            sequencia += n + ",";
            n = (n - 2) * 2;

        }

        System.out.print(sequencia);

    }

}

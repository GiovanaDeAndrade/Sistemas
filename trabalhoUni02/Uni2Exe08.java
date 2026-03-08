package trabalhoUni02;

import java.util.Scanner;

public class Uni2Exe08 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cod1, qtd1, cod2, qtd2 = 0;
        double val1, val2 = 0;

        System.out.print("Informe o código da 1ª peça: ");
        cod1 = sc.nextInt();

        System.out.print("Informe a quantidade da 1ª peça: ");
        qtd1 = sc.nextInt();

        System.out.print("Informe o valor unitário da 1ª peça: ");
        val1 = sc.nextDouble();

        System.out.print("Informe o código da 2ª peça: ");
        cod2 = sc.nextInt();

        System.out.print("Informe a quantidade da 2ª peça: ");
        qtd2 = sc.nextInt();

        System.out.print("Informe o valor unitário da 2ª peça: ");
        val2 = sc.nextDouble();


        double valTotal = ((qtd1 * val1) + (qtd2 * val2));

        System.out.print("Peça cod.(" + cod1 + ") possui " + qtd1 + " peças no estoque. Valor unitário: R$" + val1 + 
                            "\nPeça cod.(" + cod2 + ") possui " + qtd2 + " peças no estoque. Valor unitário: R$" + val2);

        System.out.print("\nValor total a ser pago: " + valTotal);

        sc.close();
    }
}

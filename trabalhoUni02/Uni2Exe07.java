package trabalhoUni02;

import java.util.*;

public class Uni2Exe07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe o salario fixo: R$");
        double salFixo = sc.nextDouble();

        System.out.print("Informe o valor total das vendas: R$");
        double vendas = sc.nextDouble();

        double salarioTotal = salFixo + (vendas * 0.15);

        System.out.printf(nome + " irá receber: R$ %.2f", salarioTotal);

        sc.close();
    }

}

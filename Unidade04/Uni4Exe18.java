package Unidade04;

import java.util.Scanner;

public class Uni4Exe18 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Informe o dia de vencimento do pagamento: ");
            int diaPag = sc.nextInt();

            System.out.print("Informe o valor da prestação: ");
            float valor = sc.nextFloat();

            System.out.print("Informe o dia do pagamento: ");
            int dia = sc.nextInt();

            if (dia > 0 && dia <= diaPag) {
                System.out.printf("O pagamento está em dia. O valor da prestação = R$%.2f", (valor - (valor * 0.10)));

            } else if(dia < (diaPag + 5) && dia > diaPag){
                System.out.printf("O pagamento está em dia. O valor da prestação = R$%.2f" , valor);

            } else {
                System.out.printf(
                        "O pagamento está atrasado. Multa de 2%% por dia de atraso. Valor da prestação = R$%.2f",
                        (valor + ((valor * 0.02) * (dia - diaPag))));
            }

        }
    }

}

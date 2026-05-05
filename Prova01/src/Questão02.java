import java.util.Scanner;

public class Questão02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Produto 1 -> R$50");
        System.out.println("Produto 2 -> R$100");
        System.out.println("Produto 3 -> R$200");

        float produto1 = 50f;
        float produto2 = 100f;
        float produto3 = 200f;

        System.out.println("Informe o código do produto desejado: ");
        float codigo = sc.nextFloat();

        System.out.println("Informe a quantidade desejada: ");
        float quantidade = sc.nextFloat();

        switch (codigo) {
            case 1f:
                if (quantidade >= 10 && (quantidade * produto1) >= 500) {
                    System.out.printf("Valor total da compra: R$%.2f \n", (quantidade * produto1));
                    System.out.printf("Valor total com desconto: R$%.2f",
                            ((quantidade * produto1) - ((quantidade * produto1) * 0.15f)));
                } else if (quantidade >= 10) {
                    System.out.printf("Valor total da compra: R$%.2f \n", (quantidade * produto1));
                    System.out.printf("Valor total com desconto: R$%.2f",
                            ((quantidade * produto1) - ((quantidade * produto1) * 0.15f)));
                } else if ((quantidade * produto1) >= 500) {
                    System.out.printf("Valor total da compra: R$%.2f \n", (quantidade * produto1));
                    System.out.printf("Valor total com desconto: R$%.2f",
                            ((quantidade * produto1) - ((quantidade * produto1) * 0.15f)));
                } else {
                    System.out.printf("Valor final da compra: R$%.2f", (quantidade * produto1));
                }

                break;

            case 2f:
                if (quantidade >= 10 && (quantidade * produto2) >= 500) {
                    System.out.printf("Valor total da compra: R$%.2f \n", (quantidade * produto2));
                    System.out.printf("Valor total com desconto: R$%.2f\n",
                            ((quantidade * produto2) - ((quantidade * produto2) * 0.15)));

                } else if (quantidade >= 10) {
                    System.out.printf("Valor total da compra: R$%.2f \n", (quantidade * produto2));
                    System.out.printf("Valor total com desconto: R$%.2f\n",
                            ((quantidade * produto2) - ((quantidade * produto2) * 0.15)));
                } else if ((quantidade * produto2) >= 500) {
                    System.out.printf("Valor total da compra: R$%.2f \n", (quantidade * produto2));
                    System.out.printf("Valor total com desconto: R$%.2f\n",
                            ((quantidade * produto2) - ((quantidade * produto2) * 0.15)));
                } else {
                    System.out.printf("Valor final da compra: R$%.2f", (quantidade * produto2));
                }

                break;

            case 3f:
                if (quantidade >= 10 && (quantidade * produto3) >= 500) {
                    System.out.printf("Valor total da compra: R$%.2f \n", (quantidade * produto3));
                    System.out.printf("Valor total com desconto: R$%.2f\n",
                            ((quantidade * produto3) - ((quantidade * produto3) * 0.15)));
                } else if (quantidade >= 10) {
                    System.out.printf("Valor total da compra: R$%.2f \n", (quantidade * produto3));
                    System.out.printf("Valor total com desconto: R$%.2f\n",
                            ((quantidade * produto3) - ((quantidade * produto3) * 0.15)));
                } else if ((quantidade * produto3) >= 500) {
                    System.out.printf("Valor total da compra: R$%.2f \n", (quantidade * produto3));
                    System.out.printf("Valor total com desconto: R$%.2f\n",
                            ((quantidade * produto3) - ((quantidade * produto3) * 0.15)));
                } else {
                    System.out.printf("Valor final da compra: R$%.2f", (quantidade * produto3));
                }

                break;

            default:
                System.out.println("Produto ou quantidade iválidos.");
                break;

        }

        sc.close();
    }

}

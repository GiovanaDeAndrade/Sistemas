import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da conta: ");
        float conta = sc.nextFloat();

        System.out.println("Informe o tipo de cliente: ");
        String clienteTipo = sc.next().toUpperCase();

        switch (clienteTipo) {
            case "VIP": 
            float totalVip = (conta - (conta* 0.10f));

            if(totalVip >= 100f){ 
                System.out.printf("Valor final a pagar: R$%.2f" ,  (totalVip + (totalVip * 0.10f)) );

            } else{System.out.printf("Valor final a pagar: R$%.2f" ,  (totalVip + (totalVip * 0.05f)) );}

            break;

            case "comum": 

            if(conta >= 200f){ 
                float totalComum = (conta - (conta * 0.05f));
                
                if (totalComum >= 100){

                    System.out.printf("Valor final a pagar: R$%.2f" ,(totalComum + (totalComum * 0.10f)));
                } else {System.out.printf("Valor final a pagar: R$%.2f" , (totalComum + (totalComum * 0.05f)));}

            } else System.out.printf("Valor final a pagar: R$%.2f" ,(conta + (conta * 0.05f)));
                
            break;
            
            
            }
                
                sc.close();
        
        }
        }

    



package trabalhoUni02;

  import java.util.Scanner;

public class Uni2Exe18 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

         double azulEstampado = 12.5;
         double mQuadrado = 9;

            System.out.print("Altura: ");
            double alturaParede = sc.nextDouble();
            System.out.print ("Comprimento: ");
            double comprimentoParede = sc.nextDouble();

            double valorMParede = azulEstampado * mQuadrado;

            double valorFinal = valorMParede * (alturaParede * comprimentoParede);

            System.out.println("O valor final é R$" + valorFinal);

            sc.close();
        
    }
}


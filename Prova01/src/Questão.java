import java.util.Scanner;

public class Questão {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a idade do paciente: ");
        int idade = sc.nextInt();

        System.out.print("Informe a temperatura corporal: ");
        float temperatura = sc.nextFloat();

        System.out.print("Paciente prioritário? \n S = Sim \n N = Não \n");
        char resposta = sc.next().toUpperCase().charAt(0);

        if (temperatura >= 38 || resposta == 'S') {
            System.out.print("Atendimento Prioritário.");

        } else if (idade >= 60) {
            System.out.print("Atendimento Prioritário - Idoso prioritário");

        }

        else if (temperatura >= 37) {
            System.out.print("Aguardar - Estado febril.");

        } else {
            System.out.print("Aguardar - Normal");
        }

        sc.close();

    }
}

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o usuário: ");
        String user = sc.next();

        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();

        boolean resposta = false;

        if (user.equals("admin")) {
            resposta = true;
             System.out.println("Login bem-sucedido.");

        } else {
            System.out.println("Acesso bloqueado.");
       
        if (user.equals("admin") || senha != 1234) {
            System.out.println("Login bem-sucedido.");

        } else {
            System.out.println("Usuário inválido.");
        }
        sc.close();

    }
}}

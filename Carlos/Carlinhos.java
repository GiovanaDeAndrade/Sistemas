package Carlos;

import java.util.Scanner;

public class Carlinhos {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.println("O carlos está te tratando bem?");
        String resposta = sc.next();

        if(resposta.equalsIgnoreCase("Sim")){
            System.out.println("Parabéns pelo mínimo");

        } else if(resposta.equalsIgnoreCase("Nao")){
            System.out.println("Tem que melhorar");

        } else if(resposta.equalsIgnoreCase("Mais ou menos")){
            System.out.println("Tudo bem, mas oque da pra melhorar?");

        }
        }










        }
    }



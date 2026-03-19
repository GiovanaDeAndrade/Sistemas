package Unidade04;

import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Vamos validar se você tem direito a meia entrada");

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Você doa sangue?");

        String resposta = sc.next();
        boolean doador = false;
        
        if (resposta.equalsIgnoreCase("Sim")
            || resposta.equalsIgnoreCase("S")){
        doador = true;
                
        }


        if (idade < 18 || idade >= 60 || doador){
            System.out.println("Tem direito!");
        }
        else { 
            System.out.println("Não tem direito");
        }
    }

}

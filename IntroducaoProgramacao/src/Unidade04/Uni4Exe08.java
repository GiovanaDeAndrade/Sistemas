package Unidade04;

import java.util.Scanner;

public class Uni4Exe08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = sc.next().toUpperCase().charAt(0);

        if (letra == ('a') || letra == ('e') || letra == ('i') || letra == ('o') || letra == ('u')) {
            System.out.print("É vogal.");

        } else {
            System.out.print("Não é vogal");
        }

        sc.close();

    }

}

package Unidade04;

import java.util.Scanner;

public class Uni4Exe21 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Informe sua altura:");
            float altura = sc.nextFloat();

            System.out.print("Informe seu peso:");
            float peso = sc.nextFloat();

            float imc = peso / altura;

            if (imc < 18.5) {
                System.out.print("Magreza");

            } else if (imc >= 18.5 && imc < 24.9){
                System.out.print("Saudável");

            } else if (imc >= 25.0  && imc < 29.9){
                System.out.print("Sobrepeso");

            } else if (imc >= 30.0 && imc < 34.9){
                System.out.print("Obesidade Grau I");

            } else if (imc >= 35.0 && imc < 39.9){
                System.out.print("Obesidade Grau II (severa)");

            } else if (imc >= 40.0){
                System.out.print("Obesidade Grau III (mórbida)");

            }


        }
    }

}

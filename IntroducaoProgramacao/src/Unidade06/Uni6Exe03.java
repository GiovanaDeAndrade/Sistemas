package Unidade06;

import java.util.Scanner;

public class Uni6Exe03 {

    public class Uni6Exe02 {
        private Scanner sc = new Scanner(System.in);
        private double[] valores = new double[12];

        public Uni6Exe02() {

        }

        public void lerValores() {
            for (int i = 0; i < 12; i++) {
                System.out.print("Digite um núemro real: ");
                valores[i] = sc.nextDouble();

            }

        }

        public void valoresImpar() {
            for (int i = 0; i < 12; i++) {
                if (i % 2 == 0) {
                    valores[i] = valores[i] * (valores[i] * 0.02);
                    

                } else {
                    valores[i] = (valores[i] * 0.05);
                }

            }

        }

        public void valores() {
            for (int i = 0; i < 12; i++) {
                System.out.println();

            }

        }

    }
}

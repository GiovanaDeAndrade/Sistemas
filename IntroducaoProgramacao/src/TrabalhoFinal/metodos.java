package TrabalhoFinal;

import java.util.Scanner;

public class metodos {

    private Scanner sc = new Scanner(System.in);
    private int[][] vetor = new int[6][7];
    private String posicaoFim = "B";


    public TrabalhoFinal(){






    }
    private void mostrarValores() {
        System.out.print("Exibindo vetor: ");
        for (String i = "B"; i < posicaoFim; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
        System.out.println();
    }


    

}

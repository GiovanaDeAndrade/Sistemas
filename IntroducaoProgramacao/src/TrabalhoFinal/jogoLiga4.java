package TrabalhoFinal;

import java.util.Scanner;

public class jogoLiga4 {

    private Scanner sc = new Scanner(System.in);
    private String[][] jogo = new String[6][7];

    public jogoLiga4() {

        int opcao = 0;
        do {
            System.out.println("--- Menu do Jogo ---");
            System.out.println("1 - Iniciar Jogo");
            System.out.println("0 - Sair do Jogo");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    iniciarJogo();

                    break;

                case 0:
                    System.out.println("Obrigada por jogar!");

                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 0);

    }

    public void iniciarJogo(){
     System.out.println("Escolha entre Vermelho e Azul: ");
                System.out.println("V = Vermelho");
                System.out.println("A = Azul");
                char cor = sc.next().toUpperCase().charAt(0);
                

                if (cor == 'V') {
                    for(int i = 0; i < jogo.length; i++){
                        System.out.println("[" + jogo[i] + "]");
                    
                    
                }
            }
            }

    public void tabuleiro() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Coluna " + jogo[i] + "[ " + "]");
            

        }
    }

    public static void main(String[] args) {
        new jogoLiga4();

    }

}

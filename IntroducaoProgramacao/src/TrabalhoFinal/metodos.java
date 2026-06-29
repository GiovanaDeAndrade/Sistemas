package TrabalhoFinal;

import java.util.Random;
import java.util.Scanner;

public class Metodos {

    private Scanner sc = new Scanner(System.in);
    private Random random = new Random();

    private final int linha = 6;
    private final int coluna = 7;

    private int[][] jogo = new int[linha][coluna];

    private char corJogador;
    private char corComputador;

    public Metodos() {
        jogarPartida();
    }

    // ===================== LOOP PRINCIPAL (RF09) =====================

    private void jogarPartida() {
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            iniciarJogo();
            rodarPartida();
            jogarNovamente = perguntarJogarNovamente();
        }

        System.out.println("Encerrando o jogo. Até a próxima!");
    }

    // Zera o tabuleiro e prepara uma nova partida (parte do RF09)
    private void iniciarJogo() {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                jogo[i][j] = 0;
            }
        }

        escolherCor();
        mostrarJogo();
    }

    // Controla a alternância de turnos até haver vitória ou empate
    private void rodarPartida() {
        boolean fimDeJogo = false;

        while (!fimDeJogo) {

            // RF05 - menu permite mostrar o tabuleiro a qualquer momento
            menuJogador();
            mostrarJogo();

            if (vitoria(1)) {
                System.out.println("Parabéns! Você (" + corJogador + ") venceu!");
                fimDeJogo = true;

            } else if (tabuleiroCompleto()) {
                // RF08
                System.out.println("EMPATE!");
                fimDeJogo = true;

            } else {
                jogadaComputador();
                mostrarJogo();

                if (vitoria(2)) {
                    System.out.println("O computador (" + corComputador + ") venceu!");
                    fimDeJogo = true;

                } else if (tabuleiroCompleto()) {
                    // RF08
                    System.out.println("EMPATE!");
                    fimDeJogo = true;
                }
            }
        }
    }

    // ===================== RF05 - IMPRIMIR A QUALQUER MOMENTO =====================

    private void menuJogador() {
        int opcao = -1;

        while (opcao != 2) {
            System.out.println("1 - Mostrar tabuleiro");
            System.out.println("2 - Fazer jogada");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                mostrarJogo();
            } else if (opcao == 2) {
                jogadaJogador();
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    // ===================== EXIBIÇÃO (RF01 / RF05) =====================

    private void mostrarJogo() {
        System.out.println("Exibindo jogo:");

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {

                if (jogo[i][j] == 0) {
                    System.out.print(" B ");
                } else if (jogo[i][j] == 1) {
                    System.out.print(" " + corJogador + " ");
                } else if (jogo[i][j] == 2) {
                    System.out.print(" " + corComputador + " ");
                }
            }
            System.out.println();
        }

        System.out.println(" 1  2  3  4  5  6  7 ");
        System.out.println();
    }

    // ===================== RF02 - ESCOLHA DE COR =====================

    private void escolherCor() {
        corJogador = ' ';

        while (corJogador != 'V' && corJogador != 'A') {
            System.out.println("Escolha sua cor:");
            System.out.println("V - Vermelho");
            System.out.println("A - Azul");

            corJogador = sc.next().toUpperCase().charAt(0);

            if (corJogador != 'V' && corJogador != 'A') {
                System.out.println("Opção inválida, tente novamente.");
            }
        }

        corComputador = (corJogador == 'V') ? 'A' : 'V';

        System.out.println("Sua cor: " + corJogador);
        System.out.println("Cor do computador: " + corComputador);
        System.out.println();
    }

    // ===================== RF03 / RF07 - JOGADA DO JOGADOR =====================

    private void jogadaJogador() {
        boolean jogou = false;

        while (!jogou) {
            System.out.print("Escolha uma coluna para jogar de 1 a 7: ");
            int colunaEscolhida = sc.nextInt() - 1;

            jogou = colocarPeca(colunaEscolhida, 1);

            if (!jogou) {
                // RF07 - coluna inválida ou cheia: solicita novamente
                System.out.println("Coluna inválida ou cheia. Tente novamente.");
            }
        }
    }

    // ===================== RF04 - JOGADA DO COMPUTADOR =====================

    private void jogadaComputador() {
        System.out.println("Vez do computador...");

        boolean jogou = false;

        while (!jogou) {
            int colunaSorteada = random.nextInt(coluna);
            jogou = colocarPeca(colunaSorteada, 2);
        }

        System.out.println("O computador fez uma jogada.");
    }

    // ===================== RF03 - POSICIONAMENTO DA PEÇA =====================

    private boolean colocarPeca(int colunaEscolhida, int jogador) {
        if (colunaEscolhida < 0 || colunaEscolhida >= coluna) {
            return false;
        }

        // Percorre de baixo para cima para a peça "cair" até a linha mais abaixo livre
        for (int i = linha - 1; i >= 0; i--) {
            if (jogo[i][colunaEscolhida] == 0) {
                jogo[i][colunaEscolhida] = jogador;
                return true;
            }
        }

        return false; // coluna cheia
    }

    // ===================== RF06 - VERIFICAÇÃO DE VITÓRIA =====================

    private boolean vitoria(int jogador) {

        // Horizontal
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j <= coluna - 4; j++) {
                if (jogo[i][j] == jogador
                        && jogo[i][j + 1] == jogador
                        && jogo[i][j + 2] == jogador
                        && jogo[i][j + 3] == jogador) {
                    return true;
                }
            }
        }

        // Vertical
        for (int i = 0; i <= linha - 4; i++) {
            for (int j = 0; j < coluna; j++) {
                if (jogo[i][j] == jogador
                        && jogo[i + 1][j] == jogador
                        && jogo[i + 2][j] == jogador
                        && jogo[i + 3][j] == jogador) {
                    return true;
                }
            }
        }

        // Diagonal para a direita ( \ )
        for (int i = 0; i <= linha - 4; i++) {
            for (int j = 0; j <= coluna - 4; j++) {
                if (jogo[i][j] == jogador
                        && jogo[i + 1][j + 1] == jogador
                        && jogo[i + 2][j + 2] == jogador
                        && jogo[i + 3][j + 3] == jogador) {
                    return true;
                }
            }
        }

        // Diagonal para a esquerda ( / )
        for (int i = 0; i <= linha - 4; i++) {
            for (int j = 3; j < coluna; j++) {
                if (jogo[i][j] == jogador
                        && jogo[i + 1][j - 1] == jogador
                        && jogo[i + 2][j - 2] == jogador
                        && jogo[i + 3][j - 3] == jogador) {
                    return true;
                }
            }
        }

        return false;
    }

    // ===================== RF08 - EMPATE =====================

    private boolean tabuleiroCompleto() {
        // Se a linha do topo (i = 0) não tem nenhum espaço em branco,
        // significa que todas as colunas estão cheias.
        for (int j = 0; j < coluna; j++) {
            if (jogo[0][j] == 0) {
                return false;
            }
        }
        return true;
    }

    // ===================== RF09 - JOGAR NOVAMENTE =====================

    private boolean perguntarJogarNovamente() {
        System.out.println();
        System.out.print("Deseja jogar novamente? (S/N): ");
        char resposta = sc.next().toUpperCase().charAt(0);
        return resposta == 'S';
    }

    public static void main(String[] args) {
        new Metodos();
    }
}
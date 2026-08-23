package Semestre01.Unidade06;

import java.util.Scanner;

public class Main {
    private Scanner sc = new Scanner(System.in);
    private int[] vetor = new int[50];
    private int posicaoFim = 0;

    public Main() {

        int opcao;

        do {
            System.out.println();
            System.out.println("--- Menu ---");
            System.out.println("1 - Incluir Valor");
            System.out.println("2 - Pesquisar Valor");
            System.out.println("3 - Alterar Valor");
            System.out.println("4 - Excluir Valores");
            System.out.println("5 - Mostrar Valores");
            System.out.println("6 - Ordenar Valores ");
            System.out.println("7 - Inverter Valores");
            System.out.println("8 - Sair do Sistema");
            System.out.print("Digite a opcao escolhida: ");
            opcao = sc.nextInt();
            // chamo cada metodo conforme o numero escolhido

            switch (opcao) {
                case 1:
                    incluirValor();
                    break;

                case 2:
                    pesquisarValor();
                    break;

                case 3:
                    alterarValores();
                    break;

                case 4:
                    excluirValor();
                    break;

                case 5:
                    mostrarValores();
                    break;

                case 6:
                    ordenarValores();
                    break;

                case 7:
                    inverterValores();
                    break;

                case 8:
                    System.out.println("Obrigado por usar nosso sistema!");
                    System.out.println("Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 8);
    }

    private void incluirValor() {
        if (posicaoFim < vetor.length - 1) {

            System.out.print("Digite o numero a ser incluído: ");
            int numero = sc.nextInt();
            vetor[posicaoFim] = numero;
            System.out.println("Numero: " + numero + " inserido na posição: " + posicaoFim);
            posicaoFim++;

        } else {
            System.out.println("Vetor Cheio");
        }
    }

    private int pesquisarValor() {
        System.out.println("Informe um numero");
        int numero = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < posicaoFim; i++) {
            if (vetor[i] == numero) {
                System.out.println("Numero (" + numero + ") encontrado! Posição(indice): [" + i + "]");
                encontrado = true;
                return i;
            }
        }
        if (!encontrado) {
            System.out.println("Numero não encontrado");
        }
        return -1;

    }

    private void alterarValores() {
        int posicao = pesquisarValor();
        if (posicao != -1) {
            System.out.println("Informe o novo numero: ");
            int numero = sc.nextInt();
            vetor[posicao] = numero;
            System.out.println("Subsitituiuo numero na posisção " + posicao);

        }
    }

    public void excluirValor() {
        int posicao = pesquisarValor();
        if (posicao != -1) {
            for (int i = posicao; i < posicaoFim; i++) {
                vetor[i] = vetor[i + 1];
            }
            posicaoFim--;
            System.out.println("Valor excluído");
        }
    }

    private void mostrarValores() {
        System.out.print("Exibindo vetor: ");
        for (int i = 0; i < posicaoFim; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
        System.out.println();
    }

    private void ordenarValores() {
        for (int i = 0; i < posicaoFim - 1; i++) {
            for (int j = 0; j < posicaoFim - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        System.out.println("Vetor ordenado.");
    }

    private void inverterValores() {
        int temp = 0;
        for (int i = 0; i < posicaoFim; i++) {
            for (int j = 0; j < i; j++) {
                temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        System.out.println("Vetor invertido.");
    }

    public static void main(String[] args) {
        new Main();
    }

}
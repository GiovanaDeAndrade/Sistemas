package Unidade06;

import java.util.Scanner;

public class Uni6Exe10 {
    private Scanner sc = new Scanner(System.in);
    private int[] vetor = new int[50];
    private int posicaoFim = 0;

    public Uni6Exe10() {

        int opcao;

        do {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1 - incluir Valor");
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
                case 1: // incluir valor

                    incluirValor();

                    break;

                case 2: // pesquisar
                    pesquisarValor();

                    break;

                case 3: // Alterar valores
                    alterarValores();

                    break;

                case 4: // Excluir valores
                    excluirValor();

                    break;

                case 5:// Mostrar valores
                    mostrarVetor();

                    break;

                case 6: // Ordenar valores
                    break;

                case 7: // inverter valores
                    break;

                case 8:
                    System.out.println("Obrigado por usra nosso sistema!");
                    System.out.println("Até mais!");

                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 8);
    }

    private void incluirValor() {
        if (posicaoFim < posicaoFim) {

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
                System.out.println("Numero " + numero + " encontrado  ma posição " + i);
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
        if(posicao != -1){
            System.out.println("Informe o novo numero: ");
            int numero = sc.nextInt();
            vetor[posicao] = numero;
            System.out.println("Subsitituiuo numero na posisção " + posicao);

        }
    }

    public void excluirValor(){
        int posicao = pesquisarValor();
        if(posicao != -1){
            for(int i=posicao; i<posicaoFim; i++){
                vetor[i] = vetor[i+1];
            }
            posicaoFim--;
            System.out.println("Valor excluído");
        }
    }

    private void mostrarVetor() {
        System.out.println("Exibindo o vetor");
        for (int i = 0; i < posicaoFim; i++) {
            System.out.print("| ");
            System.out.print(vetor[i]);
            System.out.print(" |");

        }

    }

    public static void main(String[] args) {
        new Uni6Exe10();
    }

}

package Semestre01.Unidade06;

import java.util.Scanner;

public class Teste {

    


    private Scanner sc = new Scanner(System.in);

    private String[] mochila;
    private int[] pesos;
    private int capacidadeMaxima;
    private int posicaoFim = 0;

    public Teste() {
        iniciarMochila();
        menu();
    }

    private void iniciarMochila() {
        System.out.println("Informe as informações da mochila:");

        System.out.print("Tamanho da mochila: ");
        int tamanho = sc.nextInt();

        System.out.print("Capacidade máxima da mochila: ");
        capacidadeMaxima = sc.nextInt();

        mochila = new String[tamanho];
        pesos = new int[tamanho];
    }

    private void menu() {
        int opcao;

        do {
            System.out.println("\n- MENU -");
            System.out.println("1 - Inserir item");
            System.out.println("2 - Imprimir itens");
            System.out.println("3 - Item mais pesado");
            System.out.println("4 - Ordenar mochila");
            System.out.println("5 - Excluir item");
            System.out.println("6 - Sair");
            System.out.print("Digite uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    inserirItem();
                    break;
                case 2:
                    imprimirMochila();
                    break;
                case 3:
                    itemMaisPesado();
                    break;
                case 4:
                    ordenarMochila();
                    break;
                case 5:
                    excluirItem();
                    break;
                case 6:
                    System.out.println("FIM!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 6);
    }

    private int calcularPesoAtual() {
        int soma = 0;

        for (int i = 0; i < posicaoFim; i++) {
            soma += pesos[i];
        }

        return soma;
    }

    private void inserirItem() {
        if (posicaoFim >= mochila.length) {
            System.out.println("A mochila está cheia.");
            return;
        }

        System.out.print("Nome do item: ");
        String item = sc.next();

        System.out.print("Peso do item: ");
        int peso = sc.nextInt();

        int pesoAtual = calcularPesoAtual();
        int pesoSobrando = capacidadeMaxima - pesoAtual;

        if (peso <= 0 || peso > pesoSobrando) {
            System.out.println("Item não inserido.");
            System.out.println("Peso disponível: " + pesoSobrando + " kg");
            return;
        }

        mochila[posicaoFim] = item;
        pesos[posicaoFim] = peso;
        posicaoFim++;

        System.out.println("Item inserido com sucesso.");
        System.out.println("Peso sobrando: " + (capacidadeMaxima - calcularPesoAtual()) + " kg");
    }

    private void imprimirMochila() {
        if (posicaoFim == 0) {
            System.out.println("A mochila está vazia.");
            return;
        }

        for (int i = 0; i < posicaoFim; i++) {
            System.out.println("Item: " + mochila[i] + " - Peso: " + pesos[i] + " kg");
        }
    }

    private void itemMaisPesado() {
        if (posicaoFim == 0) {
            System.out.println("A mochila está vazia.");
            return;
        }

        int maiorPeso = pesos[0];
        String itemMaisPesado = mochila[0];

        for (int i = 1; i < posicaoFim; i++) {
            if (pesos[i] > maiorPeso) {
                maiorPeso = pesos[i];
                itemMaisPesado = mochila[i];
            }
        }

        System.out.println("Item mais pesado: " + itemMaisPesado + " - " + maiorPeso + " kg");
    }

    private void ordenarMochila() {
        for (int i = 0; i < posicaoFim - 1; i++) {
            for (int j = 0; j < posicaoFim - 1; j++) {
                if (pesos[j] > pesos[j + 1]) {

                    int auxPeso = pesos[j];
                    pesos[j] = pesos[j + 1];
                    pesos[j + 1] = auxPeso;

                    String auxItem = mochila[j];
                    mochila[j] = mochila[j + 1];
                    mochila[j + 1] = auxItem;
                }
            }
        }

        System.out.println("Mochila ordenada por peso.");
    }

    private void excluirItem() {
        System.out.print("Informe o item que deseja excluir: ");
        String item = sc.next();

        for (int i = 0; i < posicaoFim; i++) {
            if (mochila[i].equals(item)) {

                for (int j = i; j < posicaoFim - 1; j++) {
                    mochila[j] = mochila[j + 1];
                    pesos[j] = pesos[j + 1];
                }

                posicaoFim--;
                mochila[posicaoFim] = null;
                pesos[posicaoFim] = 0;

                System.out.println("Item excluído com sucesso.");
                return;
            }
        }

        System.out.println("Item não encontrado.");
    }

    public static void main(String[] args) {
        new Teste();
    }
}



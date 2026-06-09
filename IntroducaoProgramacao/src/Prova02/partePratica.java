package Prova02;

import java.util.Scanner;

public class partePratica {

    private Scanner sc = new Scanner(System.in);
    private String[] mochila = new String[5];
    private int[] capacidade = new int[5];
    private int posicaoFim = 0;

    public partePratica() {
        int opcao;

        do {
            System.out.println();
            System.out.println("--- Menu ---");
            System.out.println("1 - Incluir item e peso");
            System.out.println("2 - Imprimir mochila");
            System.out.println("3 - Mostrar item mais pesado");
            System.out.println("4 - Ordenar mochila");
            System.out.println("5 - Excluir algum item da mochila");
            System.out.println("6 - Sair");
            System.out.print("Digite a opcao escolhida: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    incluirMochila();
                    break;

                case 2:
                    imprimirMochila();
                    break;

                case 3:
                    valorItemMaisPesado();
                    break;

                case 4:
                    ordenarMochila();
                    break;

                case 5:
                    excluirItemMochila();
                    break;

                case 6:
                    System.out.println("Obrigada por usar meu sistema!");
                    System.out.println("Até mais");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 6);
    }

    private int calculaPeso() {
        int total = 0;

        for (int i = 0; i < posicaoFim; i++) {
            total += capacidade[i];
        }

        return total;
    }

    private void imprimirMochila() {
        if (posicaoFim == 0) {
            System.out.println("A mochila está vazia.");
            return;
        }

        System.out.println("Exibindo o que tem na mochila:");

        for (int i = 0; i < posicaoFim; i++) {
            System.out.println("Item: " + mochila[i] + " de peso: " + capacidade[i]);
        }

        System.out.println("Peso total da mochila: " + calculaPeso());
    }

    private void ordenarMochila() {
        for (int i = 0; i < posicaoFim - 1; i++) {
            for (int j = 0; j < posicaoFim - 1 - i; j++) {
                if (capacidade[j] > capacidade[j + 1]) {

                    int auxPeso = capacidade[j];
                    capacidade[j] = capacidade[j + 1];
                    capacidade[j + 1] = auxPeso;

                    String auxItem = mochila[j];
                    mochila[j] = mochila[j + 1];
                    mochila[j + 1] = auxItem;
                }
            }
        }

        System.out.println("Mochila ordenada por peso.");
    }

    private void incluirMochila() {
        if (posicaoFim < mochila.length) {

            System.out.print("Informe o nome do item: ");
            String item = sc.next();

            System.out.print("Informe o peso do item: ");
            int peso = sc.nextInt();

            mochila[posicaoFim] = item;
            capacidade[posicaoFim] = peso;

            System.out.println("Item: " + item);
            System.out.println("Peso: " + peso);
            System.out.println("Inserido na posição: " + posicaoFim);

            posicaoFim++;

        } else {
            System.out.println("Mochila cheia.");
        }
    }

    private void valorItemMaisPesado() {
        if (posicaoFim == 0) {
            System.out.println("A mochila está vazia.");
            return;
        }

        int maiorPeso = capacidade[0];
        String itemMaisPesado = mochila[0];

        for (int i = 1; i < posicaoFim; i++) {
            if (capacidade[i] > maiorPeso) {
                maiorPeso = capacidade[i];
                itemMaisPesado = mochila[i];
            }
        }

        System.out.println("Item mais pesado: " + itemMaisPesado);
        System.out.println("Peso: " + maiorPeso);
    }

    private void excluirItemMochila() {
        if (posicaoFim == 0) {
            System.out.println("A mochila está vazia.");
            return;
        }

        System.out.print("Informe o item que deseja excluir: ");
        String item = sc.next();

        for (int i = 0; i < posicaoFim; i++) {
            if (mochila[i].equalsIgnoreCase(item)) {

                for (int j = i; j < posicaoFim - 1; j++) {
                    mochila[j] = mochila[j + 1];
                    capacidade[j] = capacidade[j + 1];
                }

                posicaoFim--;
                mochila[posicaoFim] = null;
                capacidade[posicaoFim] = 0;

                System.out.println("Item excluído com sucesso.");
                return;
            }
        }

        System.out.println("Item não encontrado.");
    }

    public static void main(String[] args) {
        new partePratica();
    }
}
package template04;

import java.util.ArrayList;
// Composição: pedido cria seus itens
// ADAPTE: Pedido/Item e a fórmula quantidade vezes preço.
class Pedido {
    // Classe interna privada: os itens pertencem a este pedido.
    private static class Item {
        private final double preco;
        private final int quantidade;
        Item(double preco, int quantidade) { this.preco = preco; this.quantidade = quantidade; }
        double subtotal() { return preco * quantidade; }
    }
    private ArrayList<Item> itens = new ArrayList<>();
    public void adicionarItem(double preco, int quantidade) {
        if (!Double.isFinite(preco) || preco < 0 || quantidade <= 0)
            throw new IllegalArgumentException("Item invalido");
        itens.add(new Item(preco, quantidade));
    }
    public double total() {
        double soma = 0;
        for (Item item : itens) soma += item.subtotal();
        return soma;
    }
}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarItem(10, 2);
        pedido.adicionarItem(5, 3);
        System.out.println(pedido.total());
    }
}

package br.furb.aula.poo.restaurantePolimorfico;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Prato> pratos = new ArrayList<>();

    public void incluirPrato(Prato prato) {
        if (prato == null) {
            throw new IllegalArgumentException("Prato invalido");
        }
        pratos.add(prato);
    }

    public void removerPrato(Prato prato) {
        if (prato == null) {
            throw new IllegalArgumentException("Prato invalido");
        }
        pratos.remove(prato);
    }

    public ArrayList<Prato> getPratos() {
        return new ArrayList<>(pratos);
    }

    public double calcularValorPedido() {
        double total = 0;
        for (Prato prato : pratos) {
            total += prato.getValor();
        }
        return total;
    }
}

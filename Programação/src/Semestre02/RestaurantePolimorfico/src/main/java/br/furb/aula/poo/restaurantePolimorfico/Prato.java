package br.furb.aula.poo.restaurantePolimorfico;

public class Prato {
    private double valor;
    private String nome;
    private Categoria categoria;

    public Prato(double valor, String nome, Categoria categoria) {
        setValor(valor);
        setNome(nome);
        setCategoria(categoria);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0 || !Double.isFinite(valor)) {
            throw new IllegalArgumentException("Valor invalido");
        }
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        if (categoria == null) {
            throw new CategoriaInvalidaException();
        }
        this.categoria = categoria;
    }
}

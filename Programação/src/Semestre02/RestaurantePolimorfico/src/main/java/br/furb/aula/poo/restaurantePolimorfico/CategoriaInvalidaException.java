package br.furb.aula.poo.restaurantePolimorfico;

public class CategoriaInvalidaException extends IllegalArgumentException {
    public CategoriaInvalidaException() {
        super("Categoria invalido");
    }
}

package template10;


// Sobrecarga: mesmo nome, parâmetros diferentes
// ADAPTE: calcular e os parâmetros; o retorno sozinho não diferencia métodos.
class Calculadora {
    public double calcular(double preco, int quantidade) { return preco * quantidade; }
    public double calcular(double preco, int quantidade, double desconto) {
        if (desconto < 0 || desconto > 1 || !Double.isFinite(desconto))
            throw new IllegalArgumentException("Desconto deve estar entre 0 e 1");
        return calcular(preco, quantidade) * (1 - desconto);
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println(c.calcular(20, 3));
        System.out.println(c.calcular(20, 3, 0.10));
    }
}

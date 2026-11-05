package template11;


// Interface: pagamento com Pix ou cartão
// ADAPTE: Pagamento e as regras de Pix/Cartao; descontos/taxas são fictícios.
interface Pagamento {
    double calcularTotal(double valor);
}
class Pix implements Pagamento {
    @Override public double calcularTotal(double valor) { return valor * 0.95; }
}
class Cartao implements Pagamento {
    @Override public double calcularTotal(double valor) { return valor * 1.02; }
}
class Caixa {
    public double fechar(double valor, Pagamento pagamento) {
        if (!Double.isFinite(valor) || valor < 0 || pagamento == null)
            throw new IllegalArgumentException("Pagamento invalido");
        return pagamento.calcularTotal(valor); // Nao precisa descobrir o tipo concreto.
    }
}

public class Main {
    public static void main(String[] args) {
        Caixa caixa = new Caixa();
        System.out.println(caixa.fechar(100, new Pix()));
        System.out.println(caixa.fechar(100, new Cartao()));
    }
}

package template15;


// Exceção personalizada: saque
// ADAPTE: SaldoInsuficienteException e a condição de saque.
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) { super(mensagem); }
}
class Conta {
    private double saldo;
    public Conta(double saldo) {
        if (!Double.isFinite(saldo) || saldo < 0) throw new IllegalArgumentException("Saldo invalido");
        this.saldo = saldo;
    }
    public double getSaldo() { return saldo; }
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (!Double.isFinite(valor) || valor <= 0) throw new IllegalArgumentException("Saque invalido");
        if (valor > saldo) throw new SaldoInsuficienteException("Saldo insuficiente");
        saldo -= valor; // So altera depois de validar tudo.
    }
}

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(100);
        try {
            conta.sacar(30);
            conta.sacar(100);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(conta.getSaldo());
    }
}

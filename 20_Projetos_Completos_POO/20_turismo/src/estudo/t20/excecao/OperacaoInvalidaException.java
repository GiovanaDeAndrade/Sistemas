package estudo.t20.excecao;

/** Excecao verificada: o chamador precisa capturar ou declarar throws. */
public class OperacaoInvalidaException extends Exception {
    public OperacaoInvalidaException(String mensagem) { super(mensagem); }
}

package estudo.t19.excecao;

/** Excecao verificada: o chamador precisa capturar ou declarar throws. */
public class OperacaoInvalidaException extends Exception {
    public OperacaoInvalidaException(String mensagem) { super(mensagem); }
}

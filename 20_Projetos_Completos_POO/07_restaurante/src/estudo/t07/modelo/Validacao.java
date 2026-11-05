package estudo.t07.modelo;

/** Validacoes pequenas reutilizadas pelo modelo e pelas interfaces de usuario. */
public final class Validacao {
    private Validacao() { }
    public static String texto(String valor, String campo) {
        if (valor == null || valor.trim().isEmpty())
            throw new IllegalArgumentException(campo + " obrigatorio");
        return valor.trim();
    }
    public static int positivo(int valor, String campo) {
        if (valor <= 0) throw new IllegalArgumentException(campo + " deve ser positivo");
        return valor;
    }
    public static double valor(double valor, String campo) {
        if (!Double.isFinite(valor) || valor < 0 || valor > 1000000000)
            throw new IllegalArgumentException(campo + " deve estar entre 0 e 1 bilhao");
        return valor;
    }
    public static int quantidade(int valor, int minimo, String campo) {
        if (valor < minimo || valor > 1000000)
            throw new IllegalArgumentException(campo + " deve estar entre " + minimo + " e 1000000");
        return valor;
    }
    public static double lerDecimal(String texto) {
        // Aceita 12,50 ou 12.50, sem separador de milhar.
        return Double.parseDouble(texto.trim().replace(',', '.'));
    }
}

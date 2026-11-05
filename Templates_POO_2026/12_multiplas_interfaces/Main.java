package template12;


// Duas interfaces na mesma classe
// ADAPTE: Imprimivel/Exportavel e os métodos do contrato.
interface Imprimivel { String imprimir(); }
interface Exportavel { String exportar(); }
class Relatorio implements Imprimivel, Exportavel {
    private String titulo;
    public Relatorio(String titulo) { this.titulo = titulo; }
    @Override public String imprimir() { return "Relatorio: " + titulo; }
    @Override public String exportar() { return "titulo\n" + titulo; }
}

public class Main {
    public static void main(String[] args) {
        Relatorio r = new Relatorio("Vendas");
        Imprimivel impressao = r;
        Exportavel exportacao = r;
        System.out.println(impressao.imprimir());
        System.out.println(exportacao.exportar());
    }
}

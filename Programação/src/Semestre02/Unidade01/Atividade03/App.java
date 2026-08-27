package Semestre02.Unidade01.Atividade03;

public class App {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5.0, 3.0);

        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Área: " + retangulo.getArea());
        System.out.println("Perímetro: " + retangulo.getPerimetro());
    }
}

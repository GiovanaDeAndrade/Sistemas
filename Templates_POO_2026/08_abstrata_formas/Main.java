package template08;


// Classe abstrata: formas e áreas
// ADAPTE: Forma/Retangulo/Circulo e as fórmulas de area.
abstract class Forma {
    public abstract double area(); // Sem corpo: as filhas implementam.
}
class Retangulo extends Forma {
    private double base, altura;
    public Retangulo(double base, double altura) {
        if (!Double.isFinite(base) || !Double.isFinite(altura) || base <= 0 || altura <= 0)
            throw new IllegalArgumentException("Medidas invalidas");
        this.base = base; this.altura = altura;
    }
    @Override public double area() { return base * altura; }
}
class Circulo extends Forma {
    private double raio;
    public Circulo(double raio) {
        if (!Double.isFinite(raio) || raio <= 0) throw new IllegalArgumentException("Raio invalido");
        this.raio = raio;
    }
    @Override public double area() { return Math.PI * raio * raio; }
}

public class Main {
    public static void main(String[] args) {
        Forma f = new Retangulo(3, 4);
        System.out.println(f.area());
        f = new Circulo(2);
        System.out.printf(java.util.Locale.US, "%.2f%n", f.area());
        // new Forma() nao compila: Forma e abstrata.
    }
}

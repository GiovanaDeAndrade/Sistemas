package template14;


// Exceções: conversão, divisão e finally
// ADAPTE: as entradas e os tipos de exceção de cada operação.
class Divisao {
    public static int calcular(String texto, int divisor) {
        int numero = Integer.parseInt(texto); // Pode lancar NumberFormatException.
        return numero / divisor; // Divisao inteira: divisor zero lanca ArithmeticException.
    }
}

public class Main {
    public static void main(String[] args) {
        String[] textos = { "20", "abc", "20" };
        int[] divisores = { 2, 2, 0 };
        for (int i = 0; i < textos.length; i++) {
            try {
                System.out.println(Divisao.calcular(textos[i], divisores[i]));
            } catch (NumberFormatException e) {
                System.out.println("Digite um inteiro");
            } catch (ArithmeticException e) {
                System.out.println("Divisor nao pode ser zero");
            } finally {
                System.out.println("Tentativa encerrada");
            }
        }
    }
}

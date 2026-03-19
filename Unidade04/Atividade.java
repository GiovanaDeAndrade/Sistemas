package Unidade04;

public class Atividade {
    public static void main(String[] args) {
        float media = 7f;
        float frequencia = 74f;
        if (media >= 6 && frequencia >= 75) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        String fruta = "Banana";
        if (fruta != "Banana") {
            System.out.println("Outra fruta");
        } else {
            System.out.println("Bom pra vida");
        }
        float nota1 = 10;
        float nota2 = 5;
        media = (nota1 + nota2) / 2;
        frequencia = 75;

        boolean provaSuficiencia = true;
        if (media >= 6 || provaSuficiencia) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }

}

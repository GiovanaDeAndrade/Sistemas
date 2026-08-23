package Semestre02.Unidade01.Atividade01;

public class Rodar {

    public static void main(String[] args) {
        Carro c = new Carro();
        c.marca = "fiat";
        c.kmRodado = 1000;

        System.out.println("Marca: " + c.marca + "\nKm Rodado: " + c.kmRodado);
        c.andar(5000);
        System.out.println("Km Rodado: " + c.kmRodado);

        Cachorro dog = new Cachorro();
        dog.raca = "Dalmata";
        dog.nome = "Pintado";
        dog.latir();

        System.out.println("Raça: " + dog.raca + "\nNome: " + dog.nome);
    }
}



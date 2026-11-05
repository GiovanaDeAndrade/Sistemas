package template03;

import java.util.ArrayList;
// Agregação: equipe e jogadores
// ADAPTE: Equipe/Jogador por Turma/Aluno; altere limite e duplicidade.
class Jogador {
    private String nome;
    public Jogador(String nome) { this.nome = nome; }
    public String getNome() { return nome; }
}
class Equipe {
    private ArrayList<Jogador> jogadores = new ArrayList<>();
    public void adicionar(Jogador jogador) {
        if (jogador == null) throw new IllegalArgumentException("Jogador obrigatorio");
        if (!jogadores.contains(jogador)) jogadores.add(jogador);
    }
    public boolean remover(Jogador jogador) { return jogadores.remove(jogador); }
    public int quantidade() { return jogadores.size(); }
}

public class Main {
    public static void main(String[] args) {
        Jogador j = new Jogador("Ana"); // Criado fora da equipe.
        Equipe equipe = new Equipe();
        equipe.adicionar(j);
        System.out.println(equipe.quantidade());
        equipe.remover(j);
        System.out.println(j.getNome()); // Continua existindo sem a equipe.
    }
}

package template16;

import java.util.ArrayList;
import java.util.Scanner;
// Scanner: menu com cadastro e repetição
// ADAPTE: opções do menu e campos do cadastro; use nextLine para todas as entradas.
class Cadastro {
    private ArrayList<String> nomes = new ArrayList<>();
    public void adicionar(String nome) {
        if (nome == null || nome.trim().isEmpty()) throw new IllegalArgumentException("Nome vazio");
        nomes.add(nome.trim());
    }
    public String listar() { return nomes.toString(); }
}

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        try (Scanner entrada = new Scanner(System.in)) {
            while (true) {
                System.out.println("1-Cadastrar 2-Listar 0-Sair");
                if (!entrada.hasNextLine()) break;
                try {
                    int opcao = Integer.parseInt(entrada.nextLine().trim());
                    if (opcao == 0) break;
                    switch (opcao) {
                        case 1:
                            System.out.println("Nome completo:");
                            if (!entrada.hasNextLine()) return;
                            cadastro.adicionar(entrada.nextLine());
                            break;
                        case 2: System.out.println(cadastro.listar()); break;
                        default: System.out.println("Opcao inexistente");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Digite uma opcao numerica");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

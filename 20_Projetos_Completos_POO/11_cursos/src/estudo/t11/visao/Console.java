package estudo.t11.visao;

import java.util.List;
import java.util.Scanner;
import estudo.t11.modelo.*;
import estudo.t11.servico.Servico;
import estudo.t11.excecao.OperacaoInvalidaException;

/** Apresentacao no terminal. Sempre le linhas completas para nao pular nomes. */
public class Console {
    private final Servico servico;
    private final Scanner entrada = new Scanner(System.in);
    public Console(Servico servico) { this.servico = servico; }
    private String ler(String pergunta) {
        System.out.print(pergunta + ": ");
        if (!entrada.hasNextLine()) throw new java.util.NoSuchElementException();
        return entrada.nextLine();
    }
    private int inteiro(String pergunta) { return Integer.parseInt(ler(pergunta).trim()); }
    private void salvar(boolean atualizar) throws OperacaoInvalidaException {
        int id = inteiro("ID" );
        int tipo = inteiro("Tipo: 1-Regular / 2-Bolsista");
        String descricao = ler("Descricao");
        String responsavel = ler("Aluno");
        double valor = Validacao.lerDecimal(ler("Mensalidade (sem milhar)"));
        int quantidade = inteiro("Número de parcelas (minimo 1)");
        if (atualizar) servico.atualizar(tipo, id, descricao, responsavel, valor, quantidade);
        else servico.cadastrar(tipo, id, descricao, responsavel, valor, quantidade);
        System.out.println("Registro salvo.");
    }
    private void mostrar(List<Matricula> registros) {
        if (registros.isEmpty()) System.out.println("Nenhum registro.");
        for (Matricula r : registros) System.out.println(r);
    }
    public void executar() {
        System.out.println("Escola de cursos e matrículas");
        while (true) {
            System.out.println("\n1-Cadastrar 2-Listar 3-Buscar ID 4-Atualizar 5-Remover");
            System.out.println("6-Resumo 7-Destaques 8-Buscar responsavel 9-Exemplos 0-Sair");
            try {
                int opcao = inteiro("Opcao");
                switch (opcao) {
                    case 0: return;
                    case 1: salvar(false); break;
                    case 2: mostrar(servico.listar()); break;
                    case 3: System.out.println(servico.buscar(inteiro("ID"))); break;
                    case 4: salvar(true); break;
                    case 5:
                        int id = inteiro("ID para remover");
                        if (ler("Confirmar remocao? S/N").trim().equalsIgnoreCase("S")) {
                            servico.remover(id); System.out.println("Registro removido.");
                        }
                        break;
                    case 6: System.out.println(servico.resumo()); break;
                    case 7:
                        System.out.println("Matrículas de pelo menos 6 parcelas");
                        mostrar(servico.filtrarDestaques()); break;
                    case 8: mostrar(servico.buscarPorResponsavel(ler("Parte do nome"))); break;
                    case 9: servico.carregarExemplos(); System.out.println("Exemplos incluidos."); break;
                    default: System.out.println("Opcao inexistente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada numerica invalida. Operacao cancelada; tente novamente.");
            } catch (OperacaoInvalidaException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (java.util.NoSuchElementException e) {
                System.out.println("Entrada encerrada."); return;
            }
        }
    }
}

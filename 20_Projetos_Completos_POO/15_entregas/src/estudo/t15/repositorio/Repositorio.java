package estudo.t15.repositorio;

import java.util.ArrayList;
import java.util.List;
import estudo.t15.modelo.Pedido;
import estudo.t15.excecao.OperacaoInvalidaException;

/** Armazena objetos apenas em memoria. Usa agregacao, nao banco de dados. */
public class Repositorio {
    private final List<Pedido> registros = new ArrayList<>();
    public Pedido buscar(int id) {
        for (Pedido registro : registros)
            if (registro.getId() == id) return registro;
        return null;
    }
    public void adicionar(Pedido registro) throws OperacaoInvalidaException {
        if (registro == null) throw new OperacaoInvalidaException("Registro obrigatorio");
        if (buscar(registro.getId()) != null)
            throw new OperacaoInvalidaException("ID ja cadastrado");
        registros.add(registro);
    }
    public void substituir(Pedido novo) throws OperacaoInvalidaException {
        if (novo == null) throw new OperacaoInvalidaException("Registro obrigatorio");
        for (int i = 0; i < registros.size(); i++) {
            if (registros.get(i).getId() == novo.getId()) {
                registros.set(i, novo);
                return;
            }
        }
        throw new OperacaoInvalidaException("ID nao encontrado");
    }
    public void remover(int id) throws OperacaoInvalidaException {
        Pedido registro = buscar(id);
        if (registro == null) throw new OperacaoInvalidaException("ID nao encontrado");
        registros.remove(registro);
    }
    public List<Pedido> listar() {
        // Copia defensiva: limpar o retorno nao apaga o cadastro.
        return new ArrayList<>(registros);
    }
}

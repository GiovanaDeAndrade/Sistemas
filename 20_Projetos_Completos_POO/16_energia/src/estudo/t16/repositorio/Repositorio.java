package estudo.t16.repositorio;

import java.util.ArrayList;
import java.util.List;
import estudo.t16.modelo.Consumo;
import estudo.t16.excecao.OperacaoInvalidaException;

/** Armazena objetos apenas em memoria. Usa agregacao, nao banco de dados. */
public class Repositorio {
    private final List<Consumo> registros = new ArrayList<>();
    public Consumo buscar(int id) {
        for (Consumo registro : registros)
            if (registro.getId() == id) return registro;
        return null;
    }
    public void adicionar(Consumo registro) throws OperacaoInvalidaException {
        if (registro == null) throw new OperacaoInvalidaException("Registro obrigatorio");
        if (buscar(registro.getId()) != null)
            throw new OperacaoInvalidaException("ID ja cadastrado");
        registros.add(registro);
    }
    public void substituir(Consumo novo) throws OperacaoInvalidaException {
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
        Consumo registro = buscar(id);
        if (registro == null) throw new OperacaoInvalidaException("ID nao encontrado");
        registros.remove(registro);
    }
    public List<Consumo> listar() {
        // Copia defensiva: limpar o retorno nao apaga o cadastro.
        return new ArrayList<>(registros);
    }
}

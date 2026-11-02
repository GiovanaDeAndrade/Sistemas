package br.furb.aula.poo.restaurantePolimorfico;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class CartaoTest {

    private Cartao cartao;
    private final double SALDO_INICIAL = 200.0;

    @BeforeEach
    void setUp() {
        cartao = new Cartao(SALDO_INICIAL);
    }

    @Test
    @DisplayName("Deve calcular o desconto de 5% sobre o valor do pedido")
    void testCalcularDesconto() {
        Pedido pedido = new Pedido();
        pedido.incluirPrato(new Prato(100.0, "Sequência de Sushi", Categoria.PRINCIPAL));

        // 5% de 100.0 deve ser 5.0
        double descontoEsperado = 5.0;
        double descontoAtual = cartao.calcularDesconto(pedido);

        assertEquals(descontoEsperado, descontoAtual, 0.001,
                "O desconto para pagamento em cartão deve ser de exatamente 5% do total do pedido.");
    }

    @Test
    @DisplayName("Deve garantir que o troco seja sempre zero para pagamentos em cartão")
    void testCalcularTroco() {
        double valorPedido = 50.0;
        double troco = cartao.calcularTroco(valorPedido);

        assertEquals(0, troco, "O método calcularTroco deve sempre retornar 0 para a modalidade Cartão.");
    }

    @Test
    @DisplayName("Deve garantir que o saldo seja definido e recuperado corretamente")
    void testGetSetSaldo() {
        double novoSaldo = 350.0;
        cartao.setSaldo(novoSaldo);
        assertEquals(novoSaldo, cartao.getSaldo(), 0.001,
                "O getter deve retornar o novo saldo atribuído pelo setter.");
    }

    @Test
    @DisplayName("Deve lançar exceção ao definir saldo inválido")
    void testSetSaldoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> cartao.setSaldo(0),
                "Deveria lançar IllegalArgumentException para saldo igual a zero.");
        assertThrows(IllegalArgumentException.class, () -> cartao.setSaldo(-50.0),
                "Deveria lançar IllegalArgumentException para saldo negativo.");
    }

    @Test
    @DisplayName("Deve validar o saldo através do construtor com parâmetros")
    void testConstrutorComParametroValidacao() {
        assertThrows(IllegalArgumentException.class, () -> new Cartao(-10.0),
                "O construtor deve impedir a criação de um Cartão com saldo negativo.");
    }

}
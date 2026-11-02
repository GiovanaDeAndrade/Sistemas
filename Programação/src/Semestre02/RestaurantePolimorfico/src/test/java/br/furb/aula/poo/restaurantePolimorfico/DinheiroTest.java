package br.furb.aula.poo.restaurantePolimorfico;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class DinheiroTest {

    private Dinheiro pagamentoDinheiro;
    private final double VALOR_PAGAMENTO = 100.0;

    @BeforeEach
    void setUp() {
        pagamentoDinheiro = new Dinheiro(VALOR_PAGAMENTO);
    }

    @Test
    @DisplayName("Deve calcular o desconto de 10% sobre o valor do pedido")
    void testCalcularDesconto() {
        Pedido pedido = new Pedido();
        pedido.incluirPrato(new Prato(50.0, "Prato 1", Categoria.PRINCIPAL));
        pedido.incluirPrato(new Prato(50.0, "Prato 2", Categoria.PRINCIPAL));

        // 10% de 100.0 deve ser 10.0
        double descontoEsperado = 10.0;
        double descontoAtual = pagamentoDinheiro.calcularDesconto(pedido);

        assertEquals(descontoEsperado, descontoAtual, 0.001,
                "O desconto para pagamento em dinheiro deve ser de exatamente 10% do total do pedido.");
    }

    @Test
    @DisplayName("Deve calcular o troco corretamente")
    void testCalcularTroco() {
        double valorPedido = 85.50;
        // 100.0 (valor entregue) - 85.50 = 14.50
        double trocoEsperado = 14.50;
        double trocoAtual = pagamentoDinheiro.calcularTroco(valorPedido);

        assertEquals(trocoEsperado, trocoAtual, 0.001,
                "O cálculo do troco deve ser a diferença entre o valor entregue e o valor do pedido.");
    }

    @Test
    @DisplayName("Deve garantir que o valor seja definido e recuperado corretamente")
    void testGetSetValor() {
        pagamentoDinheiro.setValor(200.0);
        assertEquals(200.0, pagamentoDinheiro.getValor(), 0.001,
                "O getter deve retornar o novo valor atribuído pelo setter.");
    }

    @Test
    @DisplayName("Deve lançar exceção ao definir valor de pagamento inválido")
    void testSetValorInvalido() {
        assertThrows(IllegalArgumentException.class, () -> pagamentoDinheiro.setValor(0),
                "Deveria lançar IllegalArgumentException para valor de pagamento igual a zero.");
        assertThrows(IllegalArgumentException.class, () -> pagamentoDinheiro.setValor(-1.0),
                "Deveria lançar IllegalArgumentException para valor de pagamento negativo.");
    }

    @Test
    @DisplayName("Deve validar o valor já no construtor")
    void testConstrutorValidacao() {
        assertThrows(IllegalArgumentException.class, () -> new Dinheiro(0),
                "O construtor deve impedir a criação de um objeto Dinheiro com valor zero.");
    }

}
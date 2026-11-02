package br.furb.aula.poo.restaurantePolimorfico;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class CartaoFidelidadeTest {

    private CartaoFidelidade cartaoFidelidade;

    @BeforeEach
    void setUp() {
        // Como herda de Cartao, o saldo deve ser válido
        cartaoFidelidade = new CartaoFidelidade(500.0);
    }

    @Test
    @DisplayName("Deve dar 30% de desconto quando NÃO houver sobremesas no pedido")
    void testCalcularDescontoSemSobremesa() {
        Pedido pedido = new Pedido();
        pedido.incluirPrato(new Prato(100.0, "Filé Simples", Categoria.PRINCIPAL));

        // 30% de 100.0 = 30.0
        double descontoEsperado = 30.0;
        double descontoAtual = cartaoFidelidade.calcularDesconto(pedido);

        assertEquals(descontoEsperado, descontoAtual, 0.001,
                "Se não houver sobremesa, o desconto deve ser exatamente 30% do total do pedido.");
    }

    @Test
    @DisplayName("Deve dar desconto igual ao valor total das sobremesas quando elas existirem")
    void testCalcularDescontoComSobremesa() {
        Pedido pedido = new Pedido();
        pedido.incluirPrato(new Prato(50.0, "Prato Principal", Categoria.PRINCIPAL));
        pedido.incluirPrato(new Prato(15.0, "Pudim", Categoria.SOBREMESA));
        pedido.incluirPrato(new Prato(10.0, "Gelatina", Categoria.SOBREMESA));

        // O desconto deve ser a soma das sobremesas: 15.0 + 10.0 = 25.0
        double descontoEsperado = 25.0;
        double descontoAtual = cartaoFidelidade.calcularDesconto(pedido);

        assertEquals(descontoEsperado, descontoAtual, 0.001,
                "Quando há sobremesas, o desconto deve ser a soma dos valores apenas das sobremesas.");
    }

    @Test
    @DisplayName("Deve garantir que o desconto seja 0 para um pedido vazio")
    void testCalcularDescontoPedidoVazio() {
        Pedido pedidoVazio = new Pedido();
        // 30% de 0 = 0
        assertEquals(0, cartaoFidelidade.calcularDesconto(pedidoVazio), 0.001,
                "O desconto para um pedido vazio deve ser zero.");
    }

    @Test
    @DisplayName("Deve herdar corretamente o comportamento de troco da classe pai (Cartao)")
    void testCalcularTrocoHeranca() {
        // CartaoFidelidade herda de Cartao, portanto troco deve ser 0
        assertEquals(0, cartaoFidelidade.calcularTroco(100.0),
                "Cartão Fidelidade deve manter o comportamento de troco zero da classe Cartão.");
    }

    @Test
    @DisplayName("Deve validar o saldo através do construtor (repassando para super)")
    void testConstrutorValidacao() {
        assertThrows(IllegalArgumentException.class, () -> new CartaoFidelidade(-5.0),
                "O construtor deve validar o saldo através da chamada ao super(saldo).");
    }

    @Test
    @DisplayName("Deve manter o funcionamento correto do getter de saldo da classe pai")
    void testGetSaldoHeranca() {
        assertEquals(500.0, cartaoFidelidade.getSaldo(), 0.001,
                "O saldo inicial deve ser recuperado corretamente através da herança.");
    }

    @Test
    @DisplayName("Deve lançar exceção ao definir saldo inválido")
    void testSetSaldoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> cartaoFidelidade.setSaldo(0),
                "Deveria lançar IllegalArgumentException para saldo igual a zero.");
        assertThrows(IllegalArgumentException.class, () -> cartaoFidelidade.setSaldo(-50.0),
                "Deveria lançar IllegalArgumentException para saldo negativo.");
    }

}
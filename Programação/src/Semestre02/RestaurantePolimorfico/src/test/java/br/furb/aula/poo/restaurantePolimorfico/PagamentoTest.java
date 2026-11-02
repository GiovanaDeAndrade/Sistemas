package br.furb.aula.poo.restaurantePolimorfico;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class PagamentoTest {

    private Pedido pedido;
    private Pagamento pagamento;
    private MetodoPagamento metodoMock; // Usando uma implementação real para o teste

    @BeforeEach
    void setUp() {
        pedido = new Pedido();
        pedido.incluirPrato(new Prato(100.0, "Prato Teste", Categoria.PRINCIPAL));

        // Usamos Dinheiro como implementação de MetodoPagamento para os testes de integração
        metodoMock = new Dinheiro(150.0);
        pagamento = new Pagamento(pedido, metodoMock);
    }

    @Test
    @DisplayName("Deve calcular o total a pagar subtraindo o desconto do valor do pedido")
    void testCalcularTotalPagar() {
        // Pedido (100.0) - Desconto Dinheiro (10% de 100 = 10.0) = 90.0
        double valorEsperado = 90.0;
        double valorAtual = pagamento.calcularTotalPagar();

        assertEquals(valorEsperado, valorAtual, 0.001,
                "O total a pagar deve ser o valor do pedido menos o desconto do método de pagamento.");
    }

    @Test
    @DisplayName("Deve garantir que o pedido e o método sejam definidos e recuperados corretamente")
    void testGetSetAtributos() {
        Pedido novoPedido = new Pedido();
        MetodoPagamento novoMetodo = new Cartao(200.0);

        pagamento.setPedido(novoPedido);
        pagamento.setMetodo(novoMetodo);

        assertEquals(novoPedido, pagamento.getPedido(), "O getter de pedido deve retornar a nova instância definida.");
        assertEquals(novoMetodo, pagamento.getMetodo(), "O getter de método deve retornar a nova instância definida.");
    }

    @Test
    @DisplayName("Deve lançar exceção ao definir pedido nulo")
    void testSetPedidoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> pagamento.setPedido(null),
                "Deveria lançar IllegalArgumentException ao passar pedido nulo.");
    }

    @Test
    @DisplayName("Deve lançar exceção ao definir método de pagamento nulo")
    void testSetMetodoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> pagamento.setMetodo(null),
                "Deveria lançar IllegalArgumentException ao passar método de pagamento nulo.");
    }

    @Test
    @DisplayName("Deve validar pedido e método já no construtor")
    void testConstrutorValidacao() {
        assertAll("Validações do construtor",
                () -> assertThrows(IllegalArgumentException.class, () -> new Pagamento(null, metodoMock),
                        "O construtor deve validar se o pedido é nulo."),
                () -> assertThrows(IllegalArgumentException.class, () -> new Pagamento(pedido, null),
                        "O construtor deve validar se o método de pagamento é nulo.")
        );
    }

    @Test
    @DisplayName("Deve calcular total corretamente com Cartão (5% desconto)")
    void testCalcularTotalComCartao() {
        MetodoPagamento cartao = new Cartao(100.0);
        pagamento.setMetodo(cartao);

        // Pedido (100.0) - Desconto Cartão (5.0) = 95.0
        assertEquals(95.0, pagamento.calcularTotalPagar(), 0.001,
                "Ao mudar o método para Cartão, o total a pagar deve refletir o novo desconto de 5%.");
    }

    @Test
    @DisplayName("Cartão Fidelidade: Deve aplicar desconto de 30% quando NÃO houver sobremesa")
    void testCalcularTotalComFidelidadeSemSobremesa() {
        // Cenário: Pedido de 100.0 sem sobremesas
        Pedido pedidoSemSobremesa = new Pedido();
        pedidoSemSobremesa.incluirPrato(new Prato(100.0, "Jantar Especial", Categoria.PRINCIPAL));

        CartaoFidelidade fidelidade = new CartaoFidelidade(200.0);
        pagamento.setPedido(pedidoSemSobremesa);
        pagamento.setMetodo(fidelidade);

        // Cálculo: 100.0 - (30% de 100.0 = 30.0) = 70.0
        double valorEsperado = 70.0;
        double valorAtual = pagamento.calcularTotalPagar();

        assertEquals(valorEsperado, valorAtual, 0.001,
                "O desconto deveria ser de 30% do total pois não existem sobremesas no pedido.");
    }

    @Test
    @DisplayName("Cartão Fidelidade: Deve abater o valor total das sobremesas quando elas existirem")
    void testCalcularTotalComFidelidadeComSobremesa() {
        // Cenário: Prato Principal (60.0) + Duas Sobremesas (15.0 + 10.0) = 85.0
        Pedido pedidoComSobremesa = new Pedido();
        pedidoComSobremesa.incluirPrato(new Prato(60.0, "Lasanha", Categoria.PRINCIPAL));
        pedidoComSobremesa.incluirPrato(new Prato(15.0, "Pudim", Categoria.SOBREMESA));
        pedidoComSobremesa.incluirPrato(new Prato(10.0, "Sorvete", Categoria.SOBREMESA));

        CartaoFidelidade fidelidade = new CartaoFidelidade(200.0);
        pagamento.setPedido(pedidoComSobremesa);
        pagamento.setMetodo(fidelidade);

        // Cálculo: 85.0 total - 25.0 (soma das sobremesas) = 60.0
        double valorEsperado = 60.0;
        double valorAtual = pagamento.calcularTotalPagar();

        assertEquals(valorEsperado, valorAtual, 0.001,
                "O total a pagar deve ser o valor total menos a soma das sobremesas.");
    }
}
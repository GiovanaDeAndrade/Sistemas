package br.furb.aula.poo.restaurantePolimorfico;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.ArrayList;

class PedidoTest {

    private Pedido pedido;
    private Prato prato1;
    private Prato prato2;

    @BeforeEach
    void setUp() {
        pedido = new Pedido();
        // Criando instâncias de pratos para os testes
        prato1 = new Prato(30.0, "Pizza", Categoria.PRINCIPAL);
        prato2 = new Prato(15.0, "Pudim", Categoria.SOBREMESA);
    }

    @Test
    @DisplayName("Deve incluir pratos na lista do pedido")
    void testIncluirPrato() {
        pedido.incluirPrato(prato1);
        pedido.incluirPrato(prato2);

        ArrayList<Prato> pratos = pedido.getPratos();

        assertEquals(2, pratos.size(), "O pedido deveria conter 2 pratos após as inclusões.");
        assertTrue(pratos.contains(prato1), "A lista de pratos deveria conter o prato1.");
        assertTrue(pratos.contains(prato2), "A lista de pratos deveria conter o prato2.");
    }

    @Test
    @DisplayName("Deve lançar exceção ao tentar incluir um prato nulo")
    void testIncluirPratoNulo() {
        assertThrows(IllegalArgumentException.class, () -> pedido.incluirPrato(null),
                "Deveria lançar IllegalArgumentException ao tentar incluir um prato nulo.");
    }

    @Test
    @DisplayName("Deve remover um prato do pedido")
    void testRemoverPrato() {
        pedido.incluirPrato(prato1);
        pedido.incluirPrato(prato2);

        pedido.removerPrato(prato1);

        assertEquals(1, pedido.getPratos().size(), "O pedido deveria ter apenas 1 prato após a remoção.");
        assertFalse(pedido.getPratos().contains(prato1), "O prato1 não deveria mais estar na lista.");
    }

    @Test
    @DisplayName("Deve lançar exceção ao tentar remover um prato nulo")
    void testRemoverPratoNulo() {
        assertThrows(IllegalArgumentException.class, () -> pedido.removerPrato(null),
                "Deveria lançar IllegalArgumentException ao tentar remover um prato nulo.");
    }

    @Test
    @DisplayName("Deve calcular corretamente o valor total do pedido")
    void testCalcularValorPedido() {
        pedido.incluirPrato(prato1); // 30.0
        pedido.incluirPrato(prato2); // 15.0

        double esperado = 45.0;
        double atual = pedido.calcularValorPedido();

        assertEquals(esperado, atual, 0.001, "O cálculo total do pedido está incorreto.");
    }

    @Test
    @DisplayName("Deve retornar zero ao calcular valor de um pedido vazio")
    void testCalcularValorPedidoVazio() {
        assertEquals(0, pedido.calcularValorPedido(), 0.001,
                "O valor de um pedido sem pratos deve ser zero.");
    }

    @Test
    @DisplayName("Deve garantir que o getter retorne a lista de pratos")
    void testGetPratos() {
        assertNotNull(pedido.getPratos(), "O getter de pratos não deve retornar nulo.");
        pedido.incluirPrato(prato1);
        assertEquals(1, pedido.getPratos().size(), "A lista retornada pelo getter deve refletir os pratos adicionados.");
    }
}
package br.furb.aula.poo.restaurantePolimorfico;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class PratoTest {

    private Prato prato;
    private final String NOME_VALIDO = "Risoto de Alho Poró";
    private final double VALOR_VALIDO = 45.0;
    private final Categoria CATEGORIA_VALIDA = Categoria.PRINCIPAL; // Assumindo que Categoria é um Enum ou constante acessível

    @BeforeEach
    void setUp() {
        prato = new Prato(VALOR_VALIDO, NOME_VALIDO, CATEGORIA_VALIDA);
    }

    @Test
    @DisplayName("Deve garantir que o nome seja definido e recuperado corretamente")
    void testGetSetNome() {
        String novoNome = "Lasanha";
        prato.setNome(novoNome);
        assertEquals(novoNome, prato.getNome(), "O nome retornado pelo getter deve ser igual ao definido pelo setter.");
    }

    @Test
    @DisplayName("Deve lançar exceção ao definir nome vazio ou nulo")
    void testSetNomeInvalido() {
        assertThrows(IllegalArgumentException.class, () -> prato.setNome(""),
                "Deveria lançar IllegalArgumentException ao definir nome vazio.");
        assertThrows(IllegalArgumentException.class, () -> prato.setNome(null),
                "Deveria lançar IllegalArgumentException ao definir nome nulo.");
        assertThrows(IllegalArgumentException.class, () -> prato.setNome("   "),
                "Deveria lançar IllegalArgumentException ao definir nome apenas com espaços.");
    }

    @Test
    @DisplayName("Deve garantir que o valor seja definido e recuperado corretamente")
    void testGetSetValor() {
        double novoValor = 50.0;
        prato.setValor(novoValor);
        assertEquals(novoValor, prato.getValor(), 0.001, "O valor retornado deve ser o mesmo que foi atribuído.");
    }

    @Test
    @DisplayName("Deve lançar exceção ao definir valor menor ou igual a zero")
    void testSetValorInvalido() {
        assertThrows(IllegalArgumentException.class, () -> prato.setValor(0),
                "Deveria lançar IllegalArgumentException para valor igual a zero.");
        assertThrows(IllegalArgumentException.class, () -> prato.setValor(-10.5),
                "Deveria lançar IllegalArgumentException para valor negativo.");
    }

    @Test
    @DisplayName("Deve garantir que a categoria seja definida e recuperada corretamente")
    void testGetSetCategoria() {
        Categoria novaCategoria = Categoria.SOBREMESA;
        prato.setCategoria(novaCategoria);
        assertEquals(novaCategoria, prato.getCategoria(), "A categoria retornada deve ser a mesma que foi atribuída.");
    }

    @Test
    @DisplayName("Deve lançar CategoriaInvalidaException ao definir categoria nula")
    void testSetCategoriaInvalida() {
        assertThrows(CategoriaInvalidaException.class, () -> prato.setCategoria(null),
                "Deveria lançar CategoriaInvalidaException ao passar null para o setter de categoria.");
    }

    @Test
    @DisplayName("Deve garantir que o construtor inicializa os atributos corretamente")
    void testConstrutor() {
        assertAll("Verificação de inicialização do construtor",
                () -> assertEquals(NOME_VALIDO, prato.getNome(), "O construtor deve inicializar o nome corretamente."),
                () -> assertEquals(VALOR_VALIDO, prato.getValor(), 0.001, "O construtor deve inicializar o valor corretamente."),
                () -> assertEquals(CATEGORIA_VALIDA, prato.getCategoria(), "O construtor deve inicializar a categoria corretamente.")
        );
    }

    @Test
    @DisplayName("Deve lançar exceção ao instanciar Prato com nome inválido")
    void testConstrutorNomeInvalido() {
        // Testa nome nulo no construtor
        assertThrows(IllegalArgumentException.class, () ->
                        new Prato(VALOR_VALIDO, null, CATEGORIA_VALIDA),
                "O construtor deve lançar IllegalArgumentException para nome nulo.");

        // Testa nome vazio no construtor
        assertThrows(IllegalArgumentException.class, () ->
                        new Prato(VALOR_VALIDO, "", CATEGORIA_VALIDA),
                "O construtor deve lançar IllegalArgumentException para nome vazio.");
    }

    @Test
    @DisplayName("Deve lançar exceção ao instanciar Prato com valor inválido")
    void testConstrutorValorInvalido() {
        // Testa valor zero no construtor
        assertThrows(IllegalArgumentException.class, () ->
                        new Prato(0, NOME_VALIDO, CATEGORIA_VALIDA),
                "O construtor deve lançar IllegalArgumentException para valor igual a zero.");

        // Testa valor negativo no construtor
        assertThrows(IllegalArgumentException.class, () ->
                        new Prato(-5.0, NOME_VALIDO, CATEGORIA_VALIDA),
                "O construtor deve lançar IllegalArgumentException para valor negativo.");
    }

    @Test
    @DisplayName("Deve lançar exceção ao instanciar Prato com categoria nula")
    void testConstrutorCategoriaInvalida() {
        assertThrows(CategoriaInvalidaException.class, () ->
                        new Prato(VALOR_VALIDO, NOME_VALIDO, null),
                "O construtor deve lançar CategoriaInvalidaException para categoria nula.");
    }
}
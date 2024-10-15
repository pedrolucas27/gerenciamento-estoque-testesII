package br.ufrn.imd.execucao02.chatgpt;

import br.ufrn.imd.Estoque;
import br.ufrn.imd.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstoqueTest {

    private Estoque estoque;
    private Produto produto1;
    private Produto produto2;

    @BeforeEach
    public void setUp() {
        estoque = new Estoque();
        produto1 = new Produto("Produto 1", "001", 150.00);
        produto2 = new Produto("Produto 2", "002", 505.00);
    }

    @Test
    public void testInserirProduto() {
        estoque.inserirProduto(produto1, 5);
        estoque.inserirProduto(produto2, 10);

        assertEquals(5, estoque.consultarQuantidade("001"), "A quantidade do Produto 1 deve ser 5.");
        assertEquals(10, estoque.consultarQuantidade("002"), "A quantidade do Produto 2 deve ser 10.");
    }

    @Test
    public void testRemoverProdutoQuantidadeSuficiente() {
        estoque.inserirProduto(produto1, 10);
        estoque.removerProduto("001", 4);

        assertEquals(6, estoque.consultarQuantidade("001"), "A quantidade após remoção deve ser 6.");
    }

    @Test
    public void testRemoverProdutoQuantidadeInsuficiente() {
        estoque.inserirProduto(produto1, 5);
        estoque.removerProduto("001", 7); // Tentativa de remover mais do que existe

        assertEquals(0, estoque.consultarQuantidade("001"), "A quantidade não pode ser negativa, deve ser 0.");
    }

    @Test
    public void testRemoverProdutoInexistente() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            estoque.removerProduto("003", 2);
        });

        assertEquals("O produto de código 003 não existe no estoque.", exception.getMessage());
    }

    @Test
    public void testConsultarQuantidadeProdutoExistente() {
        estoque.inserirProduto(produto1, 8);
        assertEquals(8, estoque.consultarQuantidade("001"), "Deve retornar a quantidade correta para o Produto 1.");
    }

    @Test
    public void testConsultarQuantidadeProdutoInexistente() {
        assertEquals(0, estoque.consultarQuantidade("999"), "Produtos inexistentes devem retornar quantidade 0.");
    }

    @Test
    public void testProdutoExiste() {
        estoque.inserirProduto(produto1, 12);
        assertTrue(estoque.produtoExiste("001"), "O produto 1 deve existir no estoque.");
    }

    @Test
    public void testProdutoInexistente() {
        assertFalse(estoque.produtoExiste("003"), "Produto com código 003 não deve existir no estoque.");
    }
}
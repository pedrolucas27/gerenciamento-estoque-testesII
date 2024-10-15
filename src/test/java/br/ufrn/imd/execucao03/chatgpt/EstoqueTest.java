package br.ufrn.imd.execucao03.chatgpt;

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
        produto1 = new Produto("Produto 1", "001", 50.00);
        produto2 = new Produto("Produto 2", "002", 45.00);
    }

    @Test
    public void testInserirProduto() {
        estoque.inserirProduto(produto1, 10);

        assertEquals(10, estoque.consultarQuantidade("001"), "Deve ser 10 após a inserção.");
    }

    @Test
    public void testInserirProdutoExistente() {
        estoque.inserirProduto(produto1, 5);
        estoque.inserirProduto(produto1, 10); // Adicionando mais do mesmo produto

        assertEquals(15, estoque.consultarQuantidade("001"), "A quantidade deve ser 10 após a inserção.");
    }

    @Test
    public void testLimparEstoqueProduto() {
        estoque.inserirProduto(produto1, 5);
        estoque.removerProduto("001", 5); // Removendo toda a quantidade

        assertEquals(0, estoque.consultarQuantidade("001"), "A quantidade deve ser 0 após remoção total.");
    }

    @Test
    public void testRemoverProdutoQuantidadeParcial() {
        estoque.inserirProduto(produto1, 10);
        estoque.removerProduto("001", 4); // Removendo parcialmente

        assertEquals(6, estoque.consultarQuantidade("001"), "A quantidade deve ser 6 após a remoção parcial.");
    }

    @Test
    public void testRemoverProdutoInexistente() {
        estoque.inserirProduto(produto1, 5);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            estoque.removerProduto("003", 2); // Tentativa de remover produto que não existe
        });

        assertEquals("O produto de código 003 não existe no estoque.", exception.getMessage());
    }

    @Test
    public void testRemoverProdutoIndisponivel() {
        estoque.inserirProduto(produto1, 3);
        estoque.removerProduto("001", 5); // Tentativa de remover mais do que existe

        assertEquals(0, estoque.consultarQuantidade("001"), "A quantidade deve permanecer em 0 após tentativa de remoção excessiva.");
    }

    @Test
    public void testConsultarQuantidadeProdutoExistente() {
        estoque.inserirProduto(produto2, 20);

        assertEquals(20, estoque.consultarQuantidade("002"), "Deve retornar a quantidade correta para o Produto 2.");
    }

    @Test
    public void testConsultarQuantidadeProdutoInexistente() {
        assertEquals(0, estoque.consultarQuantidade("999"), "Produtos inexistentes devem retornar quantidade 0.");
    }

    @Test
    public void testProdutoExisteNoEstoque() {
        estoque.inserirProduto(produto1, 10);

        assertTrue(estoque.produtoExiste("001"), "O Produto 1 deve existir no estoque.");
    }

    @Test
    public void testProdutoInexistente() {
        assertFalse(estoque.produtoExiste("003"), "O Produto 3 não deve existir no estoque.");
    }
}
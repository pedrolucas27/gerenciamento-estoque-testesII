package br.ufrn.imd.execucao01.chatgpt;

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
        produto1 = new Produto("Produto A", "001", 10.0);
        produto2 = new Produto("Produto B", "002", 20.0);
    }

    @Test
    public void testInserirProduto() {
        estoque.inserirProduto(produto1, 5);
        assertEquals(5, estoque.consultarQuantidade(produto1.getCodigo()),
                "A quantidade do produto inserido deveria ser 5.");
    }

    @Test
    public void testRemoverProdutoQuantidadeSuficiente() {
        estoque.inserirProduto(produto1, 5);
        estoque.removerProduto(produto1.getCodigo(), 3);
        assertEquals(2, estoque.consultarQuantidade(produto1.getCodigo()),
                "A quantidade do produto após remoção deveria ser 2.");
    }

    @Test
    public void testRemoverProdutoQuantidadeInsuficiente() {
        estoque.inserirProduto(produto1, 5);
        estoque.removerProduto(produto1.getCodigo(), 5);
        assertEquals(0, estoque.consultarQuantidade(produto1.getCodigo()),
                "A quantidade do produto após remover tudo deveria ser 0.");
    }

    @Test
    public void testRemoverProdutoNaoExistente() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            estoque.removerProduto("999", 1);
        });
        assertEquals("O produto de código 999 não existe no estoque.", exception.getMessage());
    }

    @Test
    public void testConsultarQuantidadeProdutoNaoExistente() {
        assertEquals(0, estoque.consultarQuantidade("999"),
                "Consultar quantidade de produto inexistente deveria retornar 0.");
    }

    @Test
    public void testProdutoExiste() {
        estoque.inserirProduto(produto1, 5);
        assertTrue(estoque.produtoExiste(produto1.getCodigo()),
                "O produto deveria existir no estoque.");
        assertFalse(estoque.produtoExiste("999"),
                "O produto não deveria existir no estoque.");
    }
}
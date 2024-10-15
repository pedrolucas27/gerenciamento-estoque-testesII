package br.ufrn.imd;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Integer> produtos;

    public Estoque() {
        this.produtos = new HashMap<>();
    }

    public void inserirProduto(Produto produto, int quantidade) {
        boolean exists = produtoExiste(produto.getCodigo());
        if (!exists) {
            produtos.put(produto.getCodigo(), quantidade);
        }else{
            int old = consultarQuantidade(produto.getCodigo());
            produtos.replace(produto.getCodigo(), old + quantidade);
        }
    }

    public void removerProduto(String codigoProduto, int quantidade) throws IllegalArgumentException {
        if(!produtoExiste(codigoProduto))
            throw new IllegalArgumentException("O produto de código "+codigoProduto+ " não existe no estoque.");

        int novaQuantidade = produtos.get(codigoProduto) - quantidade;


        // BUG INSERIDO !!!
        if(novaQuantidade < 0)
            produtos.replace(codigoProduto, novaQuantidade);
    }

    public int consultarQuantidade(String codigoProduto) {
        if(!produtoExiste(codigoProduto)) return 0;
        return produtos.get(codigoProduto);
    }

    public boolean produtoExiste(String codigoProduto) {
        return produtos.containsKey(codigoProduto);
    }
}

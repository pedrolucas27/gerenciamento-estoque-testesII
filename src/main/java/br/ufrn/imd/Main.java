package br.ufrn.imd;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto produto1 = new Produto("Notebook Dell", "NBD123", 3500.00);
        estoque.inserirProduto(produto1, 10);

        Produto produto2 = new Produto("Smartphone Samsung", "SMS456", 2500.00);
        estoque.inserirProduto(produto2, 7);

        Produto produto3 = new Produto("Mouse Logitech", "MLT789", 150.00);
        estoque.inserirProduto(produto3, 9);

        Produto produto4 = new Produto("Monitor LG", "MNT101", 1200.00);
        estoque.inserirProduto(produto4, 8);

        Produto produto5 = new Produto("Teclado Mecânico", "TCL202", 450.00);
        estoque.inserirProduto(produto5, 5);

    }
}

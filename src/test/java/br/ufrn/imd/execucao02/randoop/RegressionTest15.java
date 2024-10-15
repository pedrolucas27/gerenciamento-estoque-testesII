package br.ufrn.imd.execucao02.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test7501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7501");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        estoque0.removerProduto("hi!", (-98));
        br.ufrn.imd.Produto produto24 = new br.ufrn.imd.Produto("", "", (double) (-63));
        estoque0.inserirProduto(produto24, (int) (short) 10);
        double double27 = produto24.getPreco();
        produto24.setCodigo("hi!");
        java.lang.String str30 = produto24.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-63.0d) + "'", double27 == (-63.0d));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getCodigo();
        java.lang.String str8 = produto3.getCodigo();
        double double9 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto23.setCodigo("hi!");
        estoque19.inserirProduto(produto23, (int) (byte) 0);
        estoque0.inserirProduto(produto23, 1);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto33.setPreco((double) '#');
        produto33.setPreco((double) 10);
        java.lang.String str38 = produto33.getNome();
        produto33.setPreco(0.0d);
        java.lang.String str41 = produto33.getNome();
        estoque0.inserirProduto(produto33, (int) (short) -1);
        boolean boolean45 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 0);
        estoque0.inserirProduto(produto49, (int) (byte) 1);
        br.ufrn.imd.Produto produto55 = new br.ufrn.imd.Produto("hi!", "", 0.0d);
        estoque0.inserirProduto(produto55, (int) (byte) 0);
        int int59 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("", (int) '#');
        br.ufrn.imd.Produto produto66 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto66.setNome("hi!");
        produto66.setNome("");
        produto66.setPreco(1.0d);
        java.lang.String str73 = produto66.getCodigo();
        double double74 = produto66.getPreco();
        produto66.setNome("");
        produto66.setNome("");
        double double79 = produto66.getPreco();
        produto66.setPreco((double) (-1));
        produto66.setNome("hi!");
        estoque0.inserirProduto(produto66, (int) (short) 1);
        estoque0.removerProduto("", 96);
        int int90 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 1.0d + "'", double79 == 1.0d);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque17 = new br.ufrn.imd.Estoque();
        boolean boolean19 = estoque17.produtoExiste("");
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto23.setNome("hi!");
        produto23.setPreco((double) 10);
        estoque17.inserirProduto(produto23, (int) (byte) -1);
        estoque17.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque17.inserirProduto(produto36, (int) (short) 100);
        estoque0.inserirProduto(produto36, 0);
        boolean boolean42 = estoque0.produtoExiste("");
        int int44 = estoque0.consultarQuantidade("hi!");
        boolean boolean46 = estoque0.produtoExiste("");
        boolean boolean48 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) (byte) 100);
        boolean boolean53 = estoque0.produtoExiste("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-160));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto20 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto20.setNome("hi!");
        produto20.setNome("");
        java.lang.String str25 = produto20.getNome();
        produto20.setNome("hi!");
        estoque0.inserirProduto(produto20, 9);
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        boolean boolean32 = estoque30.produtoExiste("");
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto36.setNome("hi!");
        produto36.setPreco((double) 10);
        estoque30.inserirProduto(produto36, (int) (byte) -1);
        int int44 = estoque30.consultarQuantidade("");
        boolean boolean46 = estoque30.produtoExiste("hi!");
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto50.setNome("hi!");
        produto50.setNome("");
        java.lang.String str55 = produto50.getNome();
        produto50.setNome("hi!");
        estoque30.inserirProduto(produto50, 9);
        estoque30.removerProduto("hi!", (int) (short) 10);
        br.ufrn.imd.Produto produto66 = new br.ufrn.imd.Produto("", "", 1.0d);
        java.lang.String str67 = produto66.getNome();
        estoque30.inserirProduto(produto66, (int) '4');
        java.lang.String str70 = produto66.getCodigo();
        estoque0.inserirProduto(produto66, (-1));
        estoque0.removerProduto("hi!", 33);
        br.ufrn.imd.Produto produto79 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto79.setNome("hi!");
        produto79.setPreco((double) 10);
        java.lang.String str84 = produto79.getCodigo();
        java.lang.String str85 = produto79.getNome();
        produto79.setNome("");
        java.lang.String str88 = produto79.getNome();
        estoque0.inserirProduto(produto79, (-2));
        produto79.setNome("hi!");
        java.lang.String str93 = produto79.getCodigo();
        java.lang.String str94 = produto79.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-68));
        produto3.setCodigo("hi!");
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setPreco((double) 10);
        java.lang.String str24 = produto19.getNome();
        double double25 = produto19.getPreco();
        java.lang.String str26 = produto19.getCodigo();
        produto19.setCodigo("hi!");
        java.lang.String str29 = produto19.getCodigo();
        produto19.setNome("");
        estoque0.inserirProduto(produto19, (int) (short) 10);
        boolean boolean35 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("hi!", "", 100.0d);
        estoque0.inserirProduto(produto39, (int) (byte) 10);
        boolean boolean43 = estoque0.produtoExiste("");
        int int45 = estoque0.consultarQuantidade("hi!");
        boolean boolean47 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 10);
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto34.setCodigo("hi!");
        estoque30.inserirProduto(produto34, (int) (byte) 0);
        estoque0.inserirProduto(produto34, (int) (byte) 10);
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("", "", (double) (byte) 0);
        estoque0.inserirProduto(produto44, 1);
        produto44.setNome("");
        produto44.setPreco((double) (byte) 1);
        java.lang.String str51 = produto44.getNome();
        produto44.setPreco((double) 16);
        produto44.setPreco(9.0d);
        produto44.setPreco((-4.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("");
        double double7 = produto3.getPreco();
        java.lang.String str8 = produto3.getCodigo();
        java.lang.String str9 = produto3.getNome();
        java.lang.String str10 = produto3.getNome();
        double double11 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 0);
        boolean boolean29 = estoque0.produtoExiste("hi!");
        int int31 = estoque0.consultarQuantidade("");
        int int33 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto37.setNome("hi!");
        produto37.setPreco((double) 10);
        java.lang.String str42 = produto37.getNome();
        double double43 = produto37.getPreco();
        produto37.setNome("");
        double double46 = produto37.getPreco();
        produto37.setCodigo("");
        java.lang.String str49 = produto37.getCodigo();
        estoque0.inserirProduto(produto37, 97);
        boolean boolean53 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto57 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double58 = produto57.getPreco();
        java.lang.String str59 = produto57.getCodigo();
        java.lang.String str60 = produto57.getCodigo();
        produto57.setPreco((double) (short) -1);
        double double63 = produto57.getPreco();
        produto57.setCodigo("");
        java.lang.String str66 = produto57.getCodigo();
        produto57.setPreco(0.0d);
        estoque0.inserirProduto(produto57, (-76));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 100.0d + "'", double58 == 100.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 98);
        double double4 = produto3.getPreco();
        produto3.setNome("");
        java.lang.String str7 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 98.0d + "'", double4 == 98.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setCodigo("");
        java.lang.String str9 = produto3.getCodigo();
        double double10 = produto3.getPreco();
        java.lang.String str11 = produto3.getNome();
        produto3.setPreco(196.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (-98));
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto34.setNome("hi!");
        produto34.setPreco((double) 10);
        java.lang.String str39 = produto34.getCodigo();
        java.lang.String str40 = produto34.getNome();
        produto34.setNome("");
        java.lang.String str43 = produto34.getNome();
        produto34.setCodigo("");
        estoque0.inserirProduto(produto34, (-88));
        java.lang.String str48 = produto34.getNome();
        java.lang.String str49 = produto34.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double23 = produto22.getPreco();
        java.lang.String str24 = produto22.getCodigo();
        java.lang.String str25 = produto22.getNome();
        produto22.setNome("hi!");
        estoque0.inserirProduto(produto22, (int) (short) 0);
        estoque0.removerProduto("hi!", 52);
        boolean boolean34 = estoque0.produtoExiste("hi!");
        boolean boolean36 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto23.setNome("hi!");
        produto23.setPreco((double) 10);
        java.lang.String str28 = produto23.getCodigo();
        double double29 = produto23.getPreco();
        produto23.setPreco((double) 1.0f);
        estoque0.inserirProduto(produto23, (int) (short) 0);
        int int35 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto39.setNome("hi!");
        produto39.setPreco((double) 10);
        produto39.setNome("hi!");
        produto39.setPreco((double) 'a');
        produto39.setNome("");
        produto39.setNome("");
        double double52 = produto39.getPreco();
        produto39.setNome("hi!");
        java.lang.String str55 = produto39.getCodigo();
        estoque0.inserirProduto(produto39, (-11));
        estoque0.removerProduto("hi!", (-200));
        br.ufrn.imd.Produto produto64 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (short) 10);
        estoque0.inserirProduto(produto64, (-101));
        br.ufrn.imd.Produto produto70 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto70.setPreco((double) (byte) 100);
        produto70.setNome("hi!");
        produto70.setCodigo("");
        double double77 = produto70.getPreco();
        produto70.setNome("");
        produto70.setPreco((double) (-3));
        estoque0.inserirProduto(produto70, 8);
        java.lang.String str84 = produto70.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 97.0d + "'", double52 == 97.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 100.0d + "'", double77 == 100.0d);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto18.setNome("hi!");
        produto18.setPreco((double) 10);
        produto18.setNome("hi!");
        estoque0.inserirProduto(produto18, (-1));
        int int28 = estoque0.consultarQuantidade("");
        int int30 = estoque0.consultarQuantidade("");
        int int32 = estoque0.consultarQuantidade("hi!");
        int int34 = estoque0.consultarQuantidade("hi!");
        int int36 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-2) + "'", int32 == (-2));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-2) + "'", int34 == (-2));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 1);
        produto3.setCodigo("hi!");
        java.lang.String str6 = produto3.getNome();
        double double7 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 100L);
        estoque0.inserirProduto(produto15, (int) (short) 10);
        estoque0.removerProduto("hi!", (int) (byte) 0);
        boolean boolean26 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (-4));
        boolean boolean31 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("hi!");
        boolean boolean18 = estoque0.produtoExiste("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 100L);
        estoque0.inserirProduto(produto15, (int) (short) 10);
        boolean boolean23 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Estoque estoque24 = new br.ufrn.imd.Estoque();
        boolean boolean26 = estoque24.produtoExiste("");
        br.ufrn.imd.Produto produto30 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto30.setNome("hi!");
        produto30.setPreco((double) 10);
        estoque24.inserirProduto(produto30, (int) (byte) -1);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto40.setNome("hi!");
        produto40.setNome("");
        estoque24.inserirProduto(produto40, 0);
        estoque0.inserirProduto(produto40, (int) (short) 10);
        estoque0.removerProduto("hi!", (-2));
        br.ufrn.imd.Estoque estoque52 = new br.ufrn.imd.Estoque();
        boolean boolean54 = estoque52.produtoExiste("");
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto58.setNome("hi!");
        produto58.setPreco((double) 10);
        estoque52.inserirProduto(produto58, (int) (byte) -1);
        estoque52.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto71 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto71.setNome("hi!");
        produto71.setPreco((double) 10);
        java.lang.String str76 = produto71.getNome();
        double double77 = produto71.getPreco();
        java.lang.String str78 = produto71.getCodigo();
        produto71.setCodigo("hi!");
        java.lang.String str81 = produto71.getCodigo();
        produto71.setNome("");
        estoque52.inserirProduto(produto71, (int) (short) 10);
        produto71.setCodigo("");
        estoque0.inserirProduto(produto71, 0);
        int int91 = estoque0.consultarQuantidade("hi!");
        int int93 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("", (int) (short) 10);
        estoque0.removerProduto("hi!", 29);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-78) + "'", int91 == (-78));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        produto3.setPreco(10.0d);
        produto3.setCodigo("hi!");
        produto3.setNome("hi!");
        java.lang.String str20 = produto3.getCodigo();
        produto3.setCodigo("");
        java.lang.String str23 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        produto21.setPreco((double) 10);
        produto21.setNome("hi!");
        java.lang.String str28 = produto21.getCodigo();
        double double29 = produto21.getPreco();
        produto21.setCodigo("hi!");
        estoque0.inserirProduto(produto21, (int) 'a');
        br.ufrn.imd.Estoque estoque34 = new br.ufrn.imd.Estoque();
        boolean boolean36 = estoque34.produtoExiste("");
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto40.setNome("hi!");
        produto40.setPreco((double) 10);
        estoque34.inserirProduto(produto40, (int) (byte) -1);
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto50.setNome("hi!");
        produto50.setNome("");
        estoque34.inserirProduto(produto50, 0);
        int int58 = estoque34.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto62 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto62.setNome("hi!");
        produto62.setPreco((double) 10);
        java.lang.String str67 = produto62.getNome();
        double double68 = produto62.getPreco();
        java.lang.String str69 = produto62.getCodigo();
        estoque34.inserirProduto(produto62, (int) '#');
        br.ufrn.imd.Produto produto75 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque34.inserirProduto(produto75, (-1));
        double double78 = produto75.getPreco();
        estoque0.inserirProduto(produto75, (int) (short) 100);
        java.lang.String str81 = produto75.getCodigo();
        produto75.setNome("");
        java.lang.String str84 = produto75.getNome();
        produto75.setPreco(68.0d);
        produto75.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        int int13 = estoque0.consultarQuantidade("");
        boolean boolean15 = estoque0.produtoExiste("");
        boolean boolean17 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto21.setNome("");
        java.lang.String str24 = produto21.getNome();
        estoque0.inserirProduto(produto21, (int) (byte) 10);
        java.lang.String str27 = produto21.getNome();
        double double28 = produto21.getPreco();
        produto21.setCodigo("");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 10);
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto34.setCodigo("hi!");
        estoque30.inserirProduto(produto34, (int) (byte) 0);
        estoque0.inserirProduto(produto34, (int) (byte) 10);
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("", "", (double) (byte) 0);
        estoque0.inserirProduto(produto44, 1);
        produto44.setNome("");
        produto44.setPreco((double) (byte) 1);
        java.lang.String str51 = produto44.getNome();
        produto44.setPreco((double) 114);
        produto44.setCodigo("hi!");
        java.lang.String str56 = produto44.getCodigo();
        produto44.setPreco((double) (-65));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getCodigo();
        produto3.setPreco(0.0d);
        java.lang.String str9 = produto3.getNome();
        java.lang.Class<?> wildcardClass10 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        produto3.setNome("");
        produto3.setPreco((double) (byte) 100);
        java.lang.String str15 = produto3.getNome();
        produto3.setCodigo("hi!");
        double double18 = produto3.getPreco();
        produto3.setNome("");
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco((double) 9);
        java.lang.String str27 = produto3.getCodigo();
        java.lang.String str28 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto20 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto20.setNome("hi!");
        produto20.setNome("");
        java.lang.String str25 = produto20.getNome();
        produto20.setNome("hi!");
        estoque0.inserirProduto(produto20, 9);
        boolean boolean31 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) ' ');
        boolean boolean36 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        java.lang.String str33 = produto28.getNome();
        double double34 = produto28.getPreco();
        java.lang.String str35 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) '#');
        boolean boolean39 = estoque0.produtoExiste("");
        int int41 = estoque0.consultarQuantidade("");
        boolean boolean43 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) (short) -1);
        estoque0.removerProduto("hi!", (int) (byte) -1);
        int int51 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto55 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double56 = produto55.getPreco();
        produto55.setNome("hi!");
        java.lang.String str59 = produto55.getCodigo();
        produto55.setCodigo("hi!");
        double double62 = produto55.getPreco();
        produto55.setCodigo("hi!");
        java.lang.String str65 = produto55.getNome();
        produto55.setCodigo("");
        double double68 = produto55.getPreco();
        double double69 = produto55.getPreco();
        estoque0.inserirProduto(produto55, (-116));
        produto55.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 100.0d + "'", double62 == 100.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 100.0d + "'", double68 == 100.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 100.0d + "'", double69 == 100.0d);
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 100L);
        estoque0.inserirProduto(produto15, (int) (short) 10);
        estoque0.removerProduto("hi!", (int) (byte) 0);
        boolean boolean26 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) (byte) 1);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "", (double) (short) 10);
        double double34 = produto33.getPreco();
        produto33.setCodigo("");
        produto33.setNome("");
        produto33.setPreco((double) (-78));
        java.lang.String str41 = produto33.getNome();
        estoque0.inserirProduto(produto33, (-1));
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("", "hi!", 1.0d);
        produto47.setCodigo("");
        java.lang.String str50 = produto47.getCodigo();
        estoque0.inserirProduto(produto47, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        produto21.setPreco((double) 10);
        produto21.setNome("hi!");
        java.lang.String str28 = produto21.getCodigo();
        double double29 = produto21.getPreco();
        produto21.setCodigo("hi!");
        estoque0.inserirProduto(produto21, (int) 'a');
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto37.setNome("");
        estoque0.inserirProduto(produto37, (int) (byte) -1);
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "hi!", (double) ' ');
        estoque0.inserirProduto(produto45, (int) (byte) 0);
        br.ufrn.imd.Produto produto51 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 0);
        estoque0.inserirProduto(produto51, 100);
        boolean boolean55 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto59 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double60 = produto59.getPreco();
        java.lang.String str61 = produto59.getCodigo();
        java.lang.String str62 = produto59.getCodigo();
        produto59.setPreco((double) (short) -1);
        produto59.setNome("hi!");
        estoque0.inserirProduto(produto59, (-4));
        produto59.setPreco((double) (byte) 100);
        java.lang.String str71 = produto59.getCodigo();
        java.lang.String str72 = produto59.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 100.0d + "'", double60 == 100.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto21.setPreco((double) '#');
        produto21.setNome("");
        estoque0.inserirProduto(produto21, (int) (byte) 1);
        estoque0.removerProduto("hi!", (-98));
        estoque0.removerProduto("hi!", 1);
        estoque0.removerProduto("hi!", (-103));
        int int38 = estoque0.consultarQuantidade("hi!");
        boolean boolean40 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-2) + "'", int38 == (-2));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str23 = produto22.getCodigo();
        estoque0.inserirProduto(produto22, (int) 'a');
        boolean boolean27 = estoque0.produtoExiste("hi!");
        int int29 = estoque0.consultarQuantidade("");
        int int31 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", (int) (byte) 1);
        br.ufrn.imd.Estoque estoque35 = new br.ufrn.imd.Estoque();
        boolean boolean37 = estoque35.produtoExiste("");
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto41.setNome("hi!");
        produto41.setPreco((double) 10);
        estoque35.inserirProduto(produto41, (int) (byte) -1);
        int int49 = estoque35.consultarQuantidade("");
        estoque35.removerProduto("hi!", 1);
        int int54 = estoque35.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto58.setNome("hi!");
        produto58.setPreco((double) 10);
        java.lang.String str63 = produto58.getCodigo();
        double double64 = produto58.getPreco();
        produto58.setPreco((double) 1.0f);
        estoque35.inserirProduto(produto58, (int) (short) 0);
        java.lang.String str69 = produto58.getCodigo();
        estoque0.inserirProduto(produto58, 19);
        estoque0.removerProduto("hi!", 116);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-98) + "'", int31 == (-98));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-2) + "'", int54 == (-2));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        br.ufrn.imd.Produto produto12 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto12.setNome("hi!");
        produto12.setNome("");
        produto12.setPreco(1.0d);
        estoque0.inserirProduto(produto12, 100);
        produto12.setCodigo("");
        produto12.setPreco((double) (-63));
        double double25 = produto12.getPreco();
        produto12.setCodigo("");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-63.0d) + "'", double25 == (-63.0d));
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", 0.0d);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.Class<?> wildcardClass7 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-160));
        java.lang.String str4 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        int int6 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto10 = new br.ufrn.imd.Produto("hi!", "", (double) 9);
        estoque0.inserirProduto(produto10, (int) '#');
        br.ufrn.imd.Estoque estoque13 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto17 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto17.setCodigo("hi!");
        estoque13.inserirProduto(produto17, (int) (byte) 0);
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto25.setNome("hi!");
        produto25.setNome("");
        produto25.setPreco(1.0d);
        estoque13.inserirProduto(produto25, 100);
        produto25.setPreco((double) 0);
        java.lang.String str36 = produto25.getNome();
        double double37 = produto25.getPreco();
        estoque0.inserirProduto(produto25, 36);
        boolean boolean41 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto45.setNome("hi!");
        produto45.setPreco((double) 10);
        java.lang.String str50 = produto45.getNome();
        double double51 = produto45.getPreco();
        java.lang.String str52 = produto45.getCodigo();
        java.lang.String str53 = produto45.getCodigo();
        produto45.setCodigo("hi!");
        produto45.setPreco((double) (short) 10);
        double double58 = produto45.getPreco();
        produto45.setNome("");
        estoque0.inserirProduto(produto45, 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
    }

    @Test
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco(1.0d);
        java.lang.String str8 = produto3.getNome();
        produto3.setCodigo("hi!");
        java.lang.String str11 = produto3.getCodigo();
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto23.setCodigo("hi!");
        estoque19.inserirProduto(produto23, (int) (byte) 0);
        estoque0.inserirProduto(produto23, 1);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto33.setPreco((double) '#');
        produto33.setPreco((double) 10);
        java.lang.String str38 = produto33.getNome();
        produto33.setPreco(0.0d);
        java.lang.String str41 = produto33.getNome();
        estoque0.inserirProduto(produto33, (int) (short) -1);
        boolean boolean45 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double50 = produto49.getPreco();
        java.lang.String str51 = produto49.getNome();
        estoque0.inserirProduto(produto49, 0);
        br.ufrn.imd.Produto produto57 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto57.setNome("hi!");
        produto57.setPreco((double) 10);
        java.lang.String str62 = produto57.getNome();
        double double63 = produto57.getPreco();
        java.lang.String str64 = produto57.getNome();
        produto57.setNome("");
        produto57.setNome("hi!");
        estoque0.inserirProduto(produto57, (int) 'a');
        boolean boolean72 = estoque0.produtoExiste("");
        int int74 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto78 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto78.setNome("hi!");
        produto78.setPreco((double) 10);
        java.lang.String str83 = produto78.getNome();
        double double84 = produto78.getPreco();
        java.lang.String str85 = produto78.getCodigo();
        produto78.setCodigo("hi!");
        java.lang.String str88 = produto78.getNome();
        double double89 = produto78.getPreco();
        java.lang.String str90 = produto78.getNome();
        estoque0.inserirProduto(produto78, 100);
        int int94 = estoque0.consultarQuantidade("hi!");
        int int96 = estoque0.consultarQuantidade("");
        boolean boolean98 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 10.0d + "'", double84 == 10.0d);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 10.0d + "'", double89 == 10.0d);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 196 + "'", int94 == 196);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        boolean boolean26 = estoque0.produtoExiste("hi!");
        int int28 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque29 = new br.ufrn.imd.Estoque();
        boolean boolean31 = estoque29.produtoExiste("");
        br.ufrn.imd.Produto produto35 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto35.setNome("hi!");
        produto35.setPreco((double) 10);
        estoque29.inserirProduto(produto35, (int) (byte) -1);
        int int43 = estoque29.consultarQuantidade("");
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto47.setNome("");
        estoque29.inserirProduto(produto47, (int) (byte) 10);
        boolean boolean53 = estoque29.produtoExiste("");
        int int55 = estoque29.consultarQuantidade("");
        estoque29.removerProduto("hi!", 10);
        int int60 = estoque29.consultarQuantidade("");
        boolean boolean62 = estoque29.produtoExiste("");
        int int64 = estoque29.consultarQuantidade("");
        br.ufrn.imd.Produto produto68 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto68.setPreco((double) (byte) 100);
        estoque29.inserirProduto(produto68, 34);
        estoque0.inserirProduto(produto68, 70);
        int int76 = estoque0.consultarQuantidade("hi!");
        boolean boolean78 = estoque0.produtoExiste("");
        boolean boolean80 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 79 + "'", int76 == 79);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setNome("");
        java.lang.Class<?> wildcardClass6 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        int int13 = estoque0.consultarQuantidade("");
        boolean boolean15 = estoque0.produtoExiste("");
        boolean boolean17 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto21.setNome("");
        java.lang.String str24 = produto21.getNome();
        estoque0.inserirProduto(produto21, (int) (byte) 10);
        int int28 = estoque0.consultarQuantidade("hi!");
        boolean boolean30 = estoque0.produtoExiste("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-102));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-90) + "'", int28 == (-90));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto21.setPreco((double) '#');
        produto21.setNome("");
        estoque0.inserirProduto(produto21, (int) (byte) 1);
        br.ufrn.imd.Estoque estoque28 = new br.ufrn.imd.Estoque();
        boolean boolean30 = estoque28.produtoExiste("");
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto34.setNome("hi!");
        produto34.setPreco((double) 10);
        estoque28.inserirProduto(produto34, (int) (byte) -1);
        int int42 = estoque28.consultarQuantidade("");
        estoque28.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto49.setNome("hi!");
        produto49.setPreco((double) 10);
        produto49.setNome("hi!");
        java.lang.String str56 = produto49.getCodigo();
        double double57 = produto49.getPreco();
        produto49.setCodigo("hi!");
        estoque28.inserirProduto(produto49, (int) 'a');
        br.ufrn.imd.Estoque estoque62 = new br.ufrn.imd.Estoque();
        boolean boolean64 = estoque62.produtoExiste("");
        br.ufrn.imd.Produto produto68 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto68.setNome("hi!");
        produto68.setPreco((double) 10);
        estoque62.inserirProduto(produto68, (int) (byte) -1);
        br.ufrn.imd.Produto produto78 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto78.setNome("hi!");
        produto78.setNome("");
        estoque62.inserirProduto(produto78, 0);
        java.lang.String str85 = produto78.getCodigo();
        double double86 = produto78.getPreco();
        estoque28.inserirProduto(produto78, (int) (short) -1);
        estoque0.inserirProduto(produto78, (int) 'a');
        produto78.setPreco((double) (byte) 1);
        produto78.setPreco((double) (byte) 10);
        produto78.setPreco((double) 1);
        produto78.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 10.0d + "'", double86 == 10.0d);
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        estoque0.removerProduto("hi!", (int) (short) 1);
        boolean boolean16 = estoque0.produtoExiste("hi!");
        boolean boolean18 = estoque0.produtoExiste("");
        boolean boolean20 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque21 = new br.ufrn.imd.Estoque();
        boolean boolean23 = estoque21.produtoExiste("");
        br.ufrn.imd.Produto produto27 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto27.setNome("hi!");
        produto27.setPreco((double) 10);
        estoque21.inserirProduto(produto27, (int) (byte) -1);
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto37.setNome("hi!");
        produto37.setNome("");
        estoque21.inserirProduto(produto37, 0);
        java.lang.String str44 = produto37.getCodigo();
        double double45 = produto37.getPreco();
        double double46 = produto37.getPreco();
        java.lang.String str47 = produto37.getNome();
        produto37.setCodigo("");
        produto37.setNome("");
        produto37.setPreco((-1.0d));
        produto37.setCodigo("");
        estoque0.inserirProduto(produto37, (-78));
        int int59 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-78) + "'", int59 == (-78));
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto18.setNome("hi!");
        produto18.setPreco((double) 10);
        produto18.setNome("hi!");
        estoque0.inserirProduto(produto18, (-1));
        int int28 = estoque0.consultarQuantidade("");
        boolean boolean30 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", 52);
        br.ufrn.imd.Estoque estoque34 = new br.ufrn.imd.Estoque();
        boolean boolean36 = estoque34.produtoExiste("");
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto40.setNome("hi!");
        produto40.setPreco((double) 10);
        estoque34.inserirProduto(produto40, (int) (byte) -1);
        int int48 = estoque34.consultarQuantidade("");
        estoque34.removerProduto("hi!", 1);
        int int53 = estoque34.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto57 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto57.setNome("hi!");
        produto57.setPreco((double) 10);
        java.lang.String str62 = produto57.getNome();
        double double63 = produto57.getPreco();
        java.lang.String str64 = produto57.getCodigo();
        produto57.setCodigo("hi!");
        java.lang.String str67 = produto57.getCodigo();
        estoque34.inserirProduto(produto57, 0);
        java.lang.String str70 = produto57.getCodigo();
        produto57.setCodigo("hi!");
        estoque0.inserirProduto(produto57, 179);
        int int76 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-2) + "'", int53 == (-2));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 125 + "'", int76 == 125);
    }

    @Test
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        java.lang.String str33 = produto28.getNome();
        double double34 = produto28.getPreco();
        java.lang.String str35 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) '#');
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque0.inserirProduto(produto41, (-1));
        java.lang.String str44 = produto41.getCodigo();
        produto41.setNome("");
        java.lang.String str47 = produto41.getNome();
        java.lang.String str48 = produto41.getCodigo();
        produto41.setNome("");
        java.lang.String str51 = produto41.getNome();
        produto41.setCodigo("hi!");
        java.lang.String str54 = produto41.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        java.lang.String str13 = produto3.getNome();
        produto3.setNome("hi!");
        produto3.setNome("");
        java.lang.String str18 = produto3.getNome();
        java.lang.String str19 = produto3.getNome();
        java.lang.String str20 = produto3.getCodigo();
        double double21 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        boolean boolean4 = estoque0.produtoExiste("hi!");
        boolean boolean6 = estoque0.produtoExiste("");
        boolean boolean8 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto12 = new br.ufrn.imd.Produto("", "", (double) (short) -1);
        produto12.setCodigo("hi!");
        produto12.setPreco((double) (-108));
        estoque0.inserirProduto(produto12, (-2));
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto22.setPreco((double) '#');
        produto22.setPreco((double) 10);
        java.lang.String str27 = produto22.getNome();
        produto22.setPreco(0.0d);
        produto22.setNome("hi!");
        produto22.setPreco((double) 96);
        produto22.setNome("");
        estoque0.inserirProduto(produto22, (-11));
        produto22.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        java.lang.String str33 = produto28.getNome();
        double double34 = produto28.getPreco();
        java.lang.String str35 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) '#');
        estoque0.removerProduto("hi!", (-200));
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto44.setNome("hi!");
        produto44.setPreco((double) 10);
        produto44.setNome("hi!");
        produto44.setPreco((double) 'a');
        produto44.setNome("");
        produto44.setNome("");
        produto44.setPreco((double) (short) -1);
        produto44.setCodigo("");
        produto44.setCodigo("");
        estoque0.inserirProduto(produto44, 96);
        estoque0.removerProduto("hi!", 8);
        br.ufrn.imd.Produto produto71 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double72 = produto71.getPreco();
        java.lang.String str73 = produto71.getCodigo();
        java.lang.String str74 = produto71.getNome();
        produto71.setNome("hi!");
        double double77 = produto71.getPreco();
        produto71.setCodigo("");
        java.lang.String str80 = produto71.getNome();
        estoque0.inserirProduto(produto71, (-97));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 100.0d + "'", double72 == 100.0d);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 100.0d + "'", double77 == 100.0d);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        produto3.setPreco((double) (short) 10);
        java.lang.String str16 = produto3.getCodigo();
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        boolean boolean25 = estoque0.produtoExiste("");
        int int27 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto31.setPreco((double) '#');
        produto31.setNome("");
        estoque0.inserirProduto(produto31, (int) (short) 10);
        boolean boolean39 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", 109);
        int int44 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", (-10));
        estoque0.removerProduto("hi!", (-108));
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-98));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 109 + "'", int44 == 109);
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto23.setCodigo("hi!");
        estoque19.inserirProduto(produto23, (int) (byte) 0);
        estoque0.inserirProduto(produto23, 1);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto33.setPreco((double) '#');
        produto33.setPreco((double) 10);
        java.lang.String str38 = produto33.getNome();
        produto33.setPreco(0.0d);
        java.lang.String str41 = produto33.getNome();
        estoque0.inserirProduto(produto33, (int) (short) -1);
        int int45 = estoque0.consultarQuantidade("");
        int int47 = estoque0.consultarQuantidade("");
        boolean boolean49 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto53 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto53.setNome("hi!");
        produto53.setPreco((double) 10);
        produto53.setNome("hi!");
        produto53.setPreco((double) 'a');
        produto53.setNome("");
        produto53.setNome("");
        produto53.setPreco((double) (short) -1);
        double double68 = produto53.getPreco();
        java.lang.String str69 = produto53.getCodigo();
        estoque0.inserirProduto(produto53, 86);
        boolean boolean73 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        int int6 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto10 = new br.ufrn.imd.Produto("hi!", "", (double) 9);
        estoque0.inserirProduto(produto10, (int) '#');
        int int14 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto18.setNome("hi!");
        produto18.setPreco((double) 10);
        java.lang.String str23 = produto18.getCodigo();
        double double24 = produto18.getPreco();
        double double25 = produto18.getPreco();
        estoque0.inserirProduto(produto18, 33);
        java.lang.String str28 = produto18.getCodigo();
        produto18.setPreco(34.0d);
        java.lang.String str31 = produto18.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (-99));
        java.lang.Class<?> wildcardClass22 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (-89));
        java.lang.String str4 = produto3.getNome();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.String str8 = produto3.getNome();
        produto3.setPreco(52.0d);
        double double11 = produto3.getPreco();
        produto3.setNome("hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (short) 0);
        int int22 = estoque0.consultarQuantidade("");
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque27 = new br.ufrn.imd.Estoque();
        boolean boolean29 = estoque27.produtoExiste("");
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto33.setNome("hi!");
        produto33.setPreco((double) 10);
        estoque27.inserirProduto(produto33, (int) (byte) -1);
        estoque27.removerProduto("hi!", 0);
        estoque27.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str50 = produto49.getCodigo();
        estoque27.inserirProduto(produto49, (int) 'a');
        boolean boolean54 = estoque27.produtoExiste("hi!");
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto58.setCodigo("hi!");
        java.lang.String str61 = produto58.getNome();
        java.lang.String str62 = produto58.getCodigo();
        estoque27.inserirProduto(produto58, (int) (byte) 100);
        double double65 = produto58.getPreco();
        estoque0.inserirProduto(produto58, 34);
        produto58.setCodigo("");
        produto58.setNome("hi!");
        double double72 = produto58.getPreco();
        produto58.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 100.0d + "'", double72 == 100.0d);
    }

    @Test
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        int int16 = estoque0.consultarQuantidade("");
        boolean boolean18 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) ' ');
        int int23 = estoque0.consultarQuantidade("");
        boolean boolean25 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", 28);
        boolean boolean30 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", 70.0d);
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        int int21 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto25.setNome("hi!");
        java.lang.String str28 = produto25.getCodigo();
        estoque0.inserirProduto(produto25, 18);
        java.lang.String str31 = produto25.getNome();
        produto25.setPreco(35.0d);
        double double34 = produto25.getPreco();
        produto25.setNome("");
        produto25.setPreco((double) '4');
        double double39 = produto25.getPreco();
        produto25.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 35.0d + "'", double34 == 35.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 52.0d + "'", double39 == 52.0d);
    }

    @Test
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        produto3.setNome("");
        produto3.setPreco((double) 18);
        double double18 = produto3.getPreco();
        produto3.setNome("");
        double double21 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 18.0d + "'", double18 == 18.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 18.0d + "'", double21 == 18.0d);
    }

    @Test
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        boolean boolean6 = estoque0.produtoExiste("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        int int19 = estoque0.consultarQuantidade("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-102));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        int int6 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto10 = new br.ufrn.imd.Produto("hi!", "", (double) 9);
        estoque0.inserirProduto(produto10, (int) '#');
        int int14 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto18.setNome("hi!");
        produto18.setPreco((double) 10);
        java.lang.String str23 = produto18.getCodigo();
        double double24 = produto18.getPreco();
        double double25 = produto18.getPreco();
        estoque0.inserirProduto(produto18, 33);
        java.lang.String str28 = produto18.getCodigo();
        produto18.setPreco(34.0d);
        double double31 = produto18.getPreco();
        java.lang.String str32 = produto18.getCodigo();
        java.lang.Class<?> wildcardClass33 = produto18.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 34.0d + "'", double31 == 34.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double22 = produto21.getPreco();
        produto21.setNome("hi!");
        java.lang.String str25 = produto21.getCodigo();
        produto21.setCodigo("hi!");
        double double28 = produto21.getPreco();
        estoque0.inserirProduto(produto21, (int) 'a');
        java.lang.String str31 = produto21.getCodigo();
        produto21.setNome("hi!");
        produto21.setNome("");
        produto21.setCodigo("");
        produto21.setCodigo("");
        produto21.setCodigo("hi!");
        produto21.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-1L));
        produto3.setCodigo("");
        produto3.setNome("hi!");
        produto3.setPreco((double) 'a');
        java.lang.String str10 = produto3.getCodigo();
        produto3.setPreco(18.0d);
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto23.setNome("hi!");
        produto23.setPreco((double) 10);
        java.lang.String str28 = produto23.getCodigo();
        double double29 = produto23.getPreco();
        produto23.setPreco((double) 1.0f);
        estoque0.inserirProduto(produto23, (int) (short) 0);
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 0);
        produto37.setCodigo("");
        estoque0.inserirProduto(produto37, (int) (byte) 1);
        estoque0.removerProduto("hi!", 10);
        boolean boolean46 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", 35.0d);
        java.lang.String str51 = produto50.getCodigo();
        produto50.setPreco((double) (-30));
        estoque0.inserirProduto(produto50, (-98));
        int int57 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
    }

    @Test
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setPreco((double) 10);
        java.lang.String str24 = produto19.getNome();
        double double25 = produto19.getPreco();
        java.lang.String str26 = produto19.getCodigo();
        produto19.setCodigo("hi!");
        java.lang.String str29 = produto19.getCodigo();
        produto19.setNome("");
        estoque0.inserirProduto(produto19, (int) (short) 10);
        produto19.setNome("");
        produto19.setNome("hi!");
        produto19.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (-142));
    }

    @Test
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 'a');
        produto3.setNome("");
        produto3.setNome("");
        produto3.setPreco((double) (short) -1);
        double double18 = produto3.getPreco();
        java.lang.String str19 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        produto3.setNome("");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 125);
    }

    @Test
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-83));
    }

    @Test
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        br.ufrn.imd.Produto produto12 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto12.setNome("hi!");
        produto12.setNome("");
        produto12.setPreco(1.0d);
        estoque0.inserirProduto(produto12, 100);
        produto12.setPreco((double) 0);
        java.lang.String str23 = produto12.getNome();
        java.lang.String str24 = produto12.getCodigo();
        produto12.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto23.setNome("hi!");
        produto23.setPreco((double) 10);
        java.lang.String str28 = produto23.getNome();
        double double29 = produto23.getPreco();
        java.lang.String str30 = produto23.getCodigo();
        java.lang.String str31 = produto23.getNome();
        estoque0.inserirProduto(produto23, 68);
        java.lang.String str34 = produto23.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        produto3.setCodigo("hi!");
        java.lang.String str13 = produto3.getCodigo();
        double double14 = produto3.getPreco();
        produto3.setCodigo("hi!");
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setPreco((double) 10L);
        produto3.setPreco(35.0d);
        produto3.setCodigo("");
        produto3.setCodigo("");
        java.lang.String str20 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("");
        int int18 = estoque0.consultarQuantidade("");
        int int20 = estoque0.consultarQuantidade("hi!");
        int int22 = estoque0.consultarQuantidade("hi!");
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque27 = new br.ufrn.imd.Estoque();
        boolean boolean29 = estoque27.produtoExiste("");
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto33.setNome("hi!");
        produto33.setPreco((double) 10);
        estoque27.inserirProduto(produto33, (int) (byte) -1);
        int int41 = estoque27.consultarQuantidade("");
        estoque27.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto48 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto48.setNome("hi!");
        produto48.setPreco((double) 10);
        produto48.setNome("hi!");
        java.lang.String str55 = produto48.getCodigo();
        double double56 = produto48.getPreco();
        produto48.setCodigo("hi!");
        estoque27.inserirProduto(produto48, (int) 'a');
        java.lang.String str61 = produto48.getCodigo();
        java.lang.String str62 = produto48.getCodigo();
        java.lang.String str63 = produto48.getNome();
        estoque0.inserirProduto(produto48, 0);
        java.lang.String str66 = produto48.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
    }

    @Test
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 10);
        estoque0.removerProduto("hi!", (int) (short) 10);
        int int34 = estoque0.consultarQuantidade("hi!");
        int int36 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", (int) (byte) 0);
        br.ufrn.imd.Produto produto43 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto43.setNome("hi!");
        produto43.setPreco((double) 10);
        java.lang.String str48 = produto43.getNome();
        double double49 = produto43.getPreco();
        java.lang.String str50 = produto43.getCodigo();
        produto43.setCodigo("hi!");
        java.lang.String str53 = produto43.getCodigo();
        java.lang.String str54 = produto43.getNome();
        estoque0.inserirProduto(produto43, 10);
        boolean boolean58 = estoque0.produtoExiste("");
        int int60 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-11) + "'", int34 == (-11));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-11) + "'", int36 == (-11));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 100L);
        estoque0.inserirProduto(produto15, (int) (short) 10);
        boolean boolean23 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Estoque estoque24 = new br.ufrn.imd.Estoque();
        boolean boolean26 = estoque24.produtoExiste("");
        br.ufrn.imd.Produto produto30 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto30.setNome("hi!");
        produto30.setPreco((double) 10);
        estoque24.inserirProduto(produto30, (int) (byte) -1);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto40.setNome("hi!");
        produto40.setNome("");
        estoque24.inserirProduto(produto40, 0);
        estoque0.inserirProduto(produto40, (int) (short) 10);
        br.ufrn.imd.Produto produto52 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str53 = produto52.getCodigo();
        produto52.setNome("");
        produto52.setPreco((double) 10);
        produto52.setCodigo("hi!");
        estoque0.inserirProduto(produto52, (-2));
        produto52.setNome("hi!");
        java.lang.String str64 = produto52.getCodigo();
        java.lang.String str65 = produto52.getCodigo();
        java.lang.String str66 = produto52.getNome();
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
    }

    @Test
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        br.ufrn.imd.Produto produto12 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto12.setNome("hi!");
        produto12.setNome("");
        produto12.setPreco(1.0d);
        estoque0.inserirProduto(produto12, 100);
        produto12.setPreco((double) (short) 0);
        produto12.setPreco((double) 10.0f);
        produto12.setNome("hi!");
        produto12.setNome("");
    }

    @Test
    public void test7580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7580");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        boolean boolean25 = estoque0.produtoExiste("");
        boolean boolean27 = estoque0.produtoExiste("hi!");
        boolean boolean29 = estoque0.produtoExiste("hi!");
        boolean boolean31 = estoque0.produtoExiste("");
        int int33 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test7581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7581");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setCodigo("");
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setNome("hi!");
        java.lang.String str13 = produto3.getNome();
        java.lang.String str14 = produto3.getNome();
        double double15 = produto3.getPreco();
        produto3.setCodigo("");
        java.lang.String str18 = produto3.getNome();
        produto3.setNome("hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test7582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7582");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        java.lang.String str33 = produto28.getNome();
        double double34 = produto28.getPreco();
        java.lang.String str35 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) '#');
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque0.inserirProduto(produto41, (-1));
        produto41.setCodigo("hi!");
        java.lang.String str46 = produto41.getCodigo();
        double double47 = produto41.getPreco();
        produto41.setCodigo("");
        produto41.setPreco(0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
    }

    @Test
    public void test7583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7583");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        boolean boolean6 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto10 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto10.setNome("hi!");
        produto10.setNome("");
        produto10.setPreco((double) 10L);
        produto10.setNome("");
        produto10.setPreco((double) 96);
        produto10.setPreco((double) (-98));
        estoque0.inserirProduto(produto10, (-91));
        boolean boolean26 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test7584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7584");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        produto21.setPreco((double) 10);
        produto21.setNome("hi!");
        java.lang.String str28 = produto21.getCodigo();
        double double29 = produto21.getPreco();
        produto21.setCodigo("hi!");
        estoque0.inserirProduto(produto21, (int) 'a');
        boolean boolean35 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Estoque estoque39 = new br.ufrn.imd.Estoque();
        boolean boolean41 = estoque39.produtoExiste("");
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto45.setNome("hi!");
        produto45.setPreco((double) 10);
        estoque39.inserirProduto(produto45, (int) (byte) -1);
        estoque39.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto58.setNome("hi!");
        produto58.setPreco((double) 10);
        java.lang.String str63 = produto58.getNome();
        double double64 = produto58.getPreco();
        java.lang.String str65 = produto58.getCodigo();
        produto58.setCodigo("hi!");
        java.lang.String str68 = produto58.getCodigo();
        produto58.setNome("");
        estoque39.inserirProduto(produto58, (int) (short) 10);
        produto58.setNome("hi!");
        estoque0.inserirProduto(produto58, (int) 'a');
        br.ufrn.imd.Produto produto80 = new br.ufrn.imd.Produto("hi!", "", (double) (byte) 1);
        java.lang.String str81 = produto80.getCodigo();
        produto80.setNome("hi!");
        estoque0.inserirProduto(produto80, 16);
        br.ufrn.imd.Produto produto89 = new br.ufrn.imd.Produto("", "hi!", 0.0d);
        java.lang.String str90 = produto89.getNome();
        estoque0.inserirProduto(produto89, 70);
        boolean boolean94 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test7585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7585");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-98));
        produto3.setNome("");
        java.lang.Class<?> wildcardClass6 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test7586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7586");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (-3));
        java.lang.String str4 = produto3.getCodigo();
        double double5 = produto3.getPreco();
        java.lang.String str6 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-3.0d) + "'", double5 == (-3.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test7587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7587");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        produto28.setNome("hi!");
        java.lang.String str35 = produto28.getCodigo();
        double double36 = produto28.getPreco();
        java.lang.String str37 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, 10);
        produto28.setPreco((double) 1.0f);
        produto28.setPreco((double) 109);
        produto28.setCodigo("");
        double double46 = produto28.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 109.0d + "'", double46 == 109.0d);
    }

    @Test
    public void test7588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7588");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto23.setNome("hi!");
        produto23.setPreco((double) 10);
        java.lang.String str28 = produto23.getNome();
        double double29 = produto23.getPreco();
        java.lang.String str30 = produto23.getCodigo();
        produto23.setCodigo("hi!");
        java.lang.String str33 = produto23.getCodigo();
        estoque0.inserirProduto(produto23, 0);
        boolean boolean37 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (int) '4');
        br.ufrn.imd.Estoque estoque41 = new br.ufrn.imd.Estoque();
        boolean boolean43 = estoque41.produtoExiste("");
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto47.setNome("hi!");
        produto47.setPreco((double) 10);
        estoque41.inserirProduto(produto47, (int) (byte) -1);
        estoque41.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto60 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto60.setNome("hi!");
        produto60.setPreco((double) 10);
        java.lang.String str65 = produto60.getNome();
        double double66 = produto60.getPreco();
        java.lang.String str67 = produto60.getCodigo();
        produto60.setCodigo("hi!");
        java.lang.String str70 = produto60.getCodigo();
        produto60.setNome("");
        estoque41.inserirProduto(produto60, (int) (short) 10);
        br.ufrn.imd.Produto produto78 = new br.ufrn.imd.Produto("hi!", "", (double) 1L);
        produto78.setCodigo("");
        estoque41.inserirProduto(produto78, 0);
        produto78.setPreco((double) (-100));
        estoque0.inserirProduto(produto78, (-13));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
    }

    @Test
    public void test7589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7589");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto21.setPreco((double) '#');
        produto21.setNome("");
        estoque0.inserirProduto(produto21, (int) (byte) 1);
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double32 = produto31.getPreco();
        produto31.setNome("hi!");
        java.lang.String str35 = produto31.getCodigo();
        produto31.setCodigo("hi!");
        double double38 = produto31.getPreco();
        produto31.setCodigo("hi!");
        java.lang.String str41 = produto31.getNome();
        produto31.setCodigo("");
        estoque0.inserirProduto(produto31, 97);
        estoque0.removerProduto("", 0);
        estoque0.removerProduto("", 8);
        br.ufrn.imd.Estoque estoque52 = new br.ufrn.imd.Estoque();
        boolean boolean54 = estoque52.produtoExiste("");
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto58.setNome("hi!");
        produto58.setPreco((double) 10);
        estoque52.inserirProduto(produto58, (int) (byte) -1);
        int int66 = estoque52.consultarQuantidade("");
        boolean boolean68 = estoque52.produtoExiste("");
        boolean boolean70 = estoque52.produtoExiste("hi!");
        br.ufrn.imd.Produto produto74 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto74.setNome("hi!");
        produto74.setNome("");
        java.lang.String str79 = produto74.getCodigo();
        double double80 = produto74.getPreco();
        double double81 = produto74.getPreco();
        estoque52.inserirProduto(produto74, 1);
        estoque0.inserirProduto(produto74, 115);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 10.0d + "'", double80 == 10.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
    }

    @Test
    public void test7590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7590");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque0.inserirProduto(produto19, (int) (short) 100);
        produto19.setPreco((double) (-2));
        java.lang.String str24 = produto19.getCodigo();
        produto19.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test7591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7591");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 179);
    }

    @Test
    public void test7592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7592");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 61);
    }

    @Test
    public void test7593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7593");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        estoque0.removerProduto("hi!", 0);
    }

    @Test
    public void test7594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7594");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto20 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto20.setNome("hi!");
        produto20.setNome("");
        java.lang.String str25 = produto20.getNome();
        produto20.setNome("hi!");
        estoque0.inserirProduto(produto20, 9);
        double double30 = produto20.getPreco();
        produto20.setPreco((double) (-200));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    }

    @Test
    public void test7595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7595");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getNome();
        double double12 = produto3.getPreco();
        produto3.setCodigo("");
        produto3.setPreco((-102.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test7596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7596");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str23 = produto22.getCodigo();
        estoque0.inserirProduto(produto22, (int) 'a');
        boolean boolean27 = estoque0.produtoExiste("hi!");
        int int29 = estoque0.consultarQuantidade("");
        int int31 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", (int) (byte) 1);
        estoque0.removerProduto("hi!", (int) '#');
        estoque0.removerProduto("hi!", 125);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-98) + "'", int31 == (-98));
    }

    @Test
    public void test7597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7597");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", 1);
        boolean boolean23 = estoque0.produtoExiste("hi!");
        int int25 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque26 = new br.ufrn.imd.Estoque();
        boolean boolean28 = estoque26.produtoExiste("");
        br.ufrn.imd.Produto produto32 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto32.setNome("hi!");
        produto32.setPreco((double) 10);
        estoque26.inserirProduto(produto32, (int) (byte) -1);
        br.ufrn.imd.Produto produto42 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto42.setNome("hi!");
        produto42.setNome("");
        estoque26.inserirProduto(produto42, 0);
        java.lang.String str49 = produto42.getCodigo();
        double double50 = produto42.getPreco();
        double double51 = produto42.getPreco();
        produto42.setPreco((double) 1L);
        estoque0.inserirProduto(produto42, (int) ' ');
        br.ufrn.imd.Produto produto59 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto59.setNome("hi!");
        produto59.setNome("");
        produto59.setPreco(1.0d);
        java.lang.String str66 = produto59.getCodigo();
        double double67 = produto59.getPreco();
        produto59.setNome("");
        produto59.setPreco(10.0d);
        produto59.setCodigo("hi!");
        estoque0.inserirProduto(produto59, 0);
        java.lang.String str76 = produto59.getNome();
        double double77 = produto59.getPreco();
        produto59.setPreco((double) (-146));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2) + "'", int25 == (-2));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 1.0d + "'", double67 == 1.0d);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
    }

    @Test
    public void test7598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7598");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 10L);
        double double4 = produto3.getPreco();
        produto3.setPreco((double) 0);
        produto3.setPreco((double) (-91));
        produto3.setCodigo("hi!");
        produto3.setPreco((-78.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test7599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7599");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque0.inserirProduto(produto19, (int) (short) 100);
        java.lang.String str22 = produto19.getCodigo();
        produto19.setPreco((double) '#');
        produto19.setPreco((-2.0d));
        double double27 = produto19.getPreco();
        java.lang.String str28 = produto19.getNome();
        produto19.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-2.0d) + "'", double27 == (-2.0d));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test7600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7600");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto3.setPreco((double) (short) 1);
        java.lang.String str6 = produto3.getNome();
        double double7 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test7601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7601");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        produto3.setNome("");
        double double10 = produto3.getPreco();
        produto3.setCodigo("hi!");
        double double13 = produto3.getPreco();
        produto3.setNome("hi!");
        double double16 = produto3.getPreco();
        double double17 = produto3.getPreco();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test7602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7602");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setPreco((double) 10);
        java.lang.String str24 = produto19.getNome();
        double double25 = produto19.getPreco();
        java.lang.String str26 = produto19.getCodigo();
        produto19.setCodigo("hi!");
        java.lang.String str29 = produto19.getCodigo();
        produto19.setNome("");
        estoque0.inserirProduto(produto19, (int) (short) 10);
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("hi!", "", (double) 1L);
        produto37.setCodigo("");
        estoque0.inserirProduto(produto37, 0);
        boolean boolean43 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque44 = new br.ufrn.imd.Estoque();
        boolean boolean46 = estoque44.produtoExiste("");
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto50.setNome("hi!");
        produto50.setPreco((double) 10);
        estoque44.inserirProduto(produto50, (int) (byte) -1);
        int int58 = estoque44.consultarQuantidade("");
        estoque44.removerProduto("hi!", 1);
        int int63 = estoque44.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto67 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto67.setNome("hi!");
        produto67.setPreco((double) 10);
        java.lang.String str72 = produto67.getCodigo();
        double double73 = produto67.getPreco();
        produto67.setPreco((double) 1.0f);
        estoque44.inserirProduto(produto67, (int) (short) 0);
        produto67.setNome("");
        double double80 = produto67.getPreco();
        estoque0.inserirProduto(produto67, (-201));
        estoque0.removerProduto("hi!", (-33));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-2) + "'", int63 == (-2));
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 1.0d + "'", double80 == 1.0d);
    }

    @Test
    public void test7603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7603");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (-98));
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto34.setNome("hi!");
        produto34.setPreco((double) 10);
        java.lang.String str39 = produto34.getCodigo();
        java.lang.String str40 = produto34.getNome();
        produto34.setNome("");
        java.lang.String str43 = produto34.getNome();
        produto34.setCodigo("");
        estoque0.inserirProduto(produto34, (-88));
        produto34.setPreco(0.0d);
        java.lang.String str50 = produto34.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test7604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7604");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        produto3.setCodigo("hi!");
        double double10 = produto3.getPreco();
        produto3.setNome("hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test7605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7605");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        java.lang.String str33 = produto28.getNome();
        double double34 = produto28.getPreco();
        java.lang.String str35 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) '#');
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque0.inserirProduto(produto41, (-1));
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto47.setNome("hi!");
        produto47.setPreco((double) 10);
        java.lang.String str52 = produto47.getCodigo();
        java.lang.String str53 = produto47.getCodigo();
        estoque0.inserirProduto(produto47, 0);
        produto47.setPreco(0.0d);
        java.lang.String str58 = produto47.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test7606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7606");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        int int16 = estoque0.consultarQuantidade("");
        boolean boolean18 = estoque0.produtoExiste("");
        int int20 = estoque0.consultarQuantidade("hi!");
        int int22 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto26 = new br.ufrn.imd.Produto("hi!", "", (double) (-2));
        produto26.setNome("hi!");
        produto26.setPreco((double) (-108));
        estoque0.inserirProduto(produto26, 0);
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto36.setCodigo("hi!");
        produto36.setCodigo("");
        estoque0.inserirProduto(produto36, (-34));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test7607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7607");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        produto21.setPreco((double) 10);
        produto21.setNome("hi!");
        java.lang.String str28 = produto21.getCodigo();
        double double29 = produto21.getPreco();
        produto21.setCodigo("hi!");
        estoque0.inserirProduto(produto21, (int) 'a');
        boolean boolean35 = estoque0.produtoExiste("");
        int int37 = estoque0.consultarQuantidade("");
        int int39 = estoque0.consultarQuantidade("");
        boolean boolean41 = estoque0.produtoExiste("");
        boolean boolean43 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("", "", (double) (-36));
        double double48 = produto47.getPreco();
        produto47.setCodigo("hi!");
        estoque0.inserirProduto(produto47, 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-36.0d) + "'", double48 == (-36.0d));
    }

    @Test
    public void test7608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7608");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        estoque0.removerProduto("hi!", 100);
        boolean boolean22 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (-2));
        estoque0.removerProduto("hi!", 70);
        int int30 = estoque0.consultarQuantidade("");
        int int32 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7609");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (short) 0);
        int int22 = estoque0.consultarQuantidade("");
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque27 = new br.ufrn.imd.Estoque();
        boolean boolean29 = estoque27.produtoExiste("");
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto33.setNome("hi!");
        produto33.setPreco((double) 10);
        estoque27.inserirProduto(produto33, (int) (byte) -1);
        estoque27.removerProduto("hi!", 0);
        estoque27.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str50 = produto49.getCodigo();
        estoque27.inserirProduto(produto49, (int) 'a');
        boolean boolean54 = estoque27.produtoExiste("hi!");
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto58.setCodigo("hi!");
        java.lang.String str61 = produto58.getNome();
        java.lang.String str62 = produto58.getCodigo();
        estoque27.inserirProduto(produto58, (int) (byte) 100);
        double double65 = produto58.getPreco();
        estoque0.inserirProduto(produto58, 34);
        produto58.setCodigo("");
        produto58.setNome("hi!");
        double double72 = produto58.getPreco();
        produto58.setPreco((-53.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 100.0d + "'", double72 == 100.0d);
    }

    @Test
    public void test7610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7610");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str23 = produto22.getCodigo();
        estoque0.inserirProduto(produto22, (int) 'a');
        boolean boolean27 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("", 10);
        estoque0.removerProduto("", (-33));
        boolean boolean35 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto39.setPreco((double) (byte) 100);
        java.lang.String str42 = produto39.getNome();
        produto39.setNome("hi!");
        produto39.setCodigo("");
        estoque0.inserirProduto(produto39, 68);
        br.ufrn.imd.Estoque estoque49 = new br.ufrn.imd.Estoque();
        boolean boolean51 = estoque49.produtoExiste("");
        br.ufrn.imd.Produto produto55 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto55.setNome("hi!");
        produto55.setPreco((double) 10);
        estoque49.inserirProduto(produto55, (int) (byte) -1);
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto65.setNome("hi!");
        produto65.setNome("");
        estoque49.inserirProduto(produto65, 0);
        java.lang.String str72 = produto65.getCodigo();
        double double73 = produto65.getPreco();
        java.lang.String str74 = produto65.getCodigo();
        produto65.setNome("");
        java.lang.String str77 = produto65.getCodigo();
        estoque0.inserirProduto(produto65, (-76));
        java.lang.Class<?> wildcardClass80 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test7611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7611");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        java.lang.String str23 = produto16.getCodigo();
        produto16.setNome("");
        produto16.setCodigo("hi!");
        java.lang.String str28 = produto16.getCodigo();
        java.lang.String str29 = produto16.getNome();
        double double30 = produto16.getPreco();
        produto16.setPreco(0.0d);
        produto16.setNome("hi!");
        produto16.setCodigo("");
        java.lang.String str37 = produto16.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test7612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7612");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) '#');
        java.lang.String str4 = produto3.getNome();
        produto3.setCodigo("hi!");
        java.lang.Class<?> wildcardClass7 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7613");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        estoque0.removerProduto("hi!", (int) (short) 1);
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto18.setNome("hi!");
        produto18.setPreco((double) 10);
        java.lang.String str23 = produto18.getNome();
        double double24 = produto18.getPreco();
        java.lang.String str25 = produto18.getNome();
        produto18.setNome("");
        produto18.setNome("hi!");
        java.lang.String str30 = produto18.getCodigo();
        produto18.setPreco((double) (-2));
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) '#');
        double double37 = produto18.getPreco();
        java.lang.String str38 = produto18.getCodigo();
        produto18.setPreco(96.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-2.0d) + "'", double37 == (-2.0d));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test7614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7614");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (-99.0d));
    }

    @Test
    public void test7615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7615");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque25 = new br.ufrn.imd.Estoque();
        boolean boolean27 = estoque25.produtoExiste("");
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto31.setNome("hi!");
        produto31.setPreco((double) 10);
        estoque25.inserirProduto(produto31, (int) (byte) -1);
        int int39 = estoque25.consultarQuantidade("");
        estoque25.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto46.setNome("hi!");
        produto46.setPreco((double) 10);
        produto46.setNome("hi!");
        java.lang.String str53 = produto46.getCodigo();
        double double54 = produto46.getPreco();
        produto46.setCodigo("hi!");
        estoque25.inserirProduto(produto46, (int) 'a');
        java.lang.String str59 = produto46.getCodigo();
        java.lang.String str60 = produto46.getCodigo();
        java.lang.String str61 = produto46.getCodigo();
        produto46.setPreco(97.0d);
        estoque0.inserirProduto(produto46, 33);
        double double66 = produto46.getPreco();
        produto46.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 97.0d + "'", double66 == 97.0d);
    }

    @Test
    public void test7616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7616");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        produto6.setNome("hi!");
        produto6.setCodigo("");
        produto6.setCodigo("");
        java.lang.String str19 = produto6.getNome();
        java.lang.String str20 = produto6.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test7617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7617");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        produto3.setPreco((double) (short) 10);
        java.lang.String str16 = produto3.getCodigo();
        double double17 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test7618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7618");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        int int25 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque26 = new br.ufrn.imd.Estoque();
        boolean boolean28 = estoque26.produtoExiste("");
        br.ufrn.imd.Produto produto32 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto32.setNome("hi!");
        produto32.setPreco((double) 10);
        estoque26.inserirProduto(produto32, (int) (byte) -1);
        int int40 = estoque26.consultarQuantidade("");
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto44.setNome("");
        estoque26.inserirProduto(produto44, (int) (byte) 10);
        boolean boolean50 = estoque26.produtoExiste("");
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto54.setNome("");
        produto54.setNome("hi!");
        produto54.setNome("");
        estoque26.inserirProduto(produto54, 9);
        estoque0.inserirProduto(produto54, (-63));
        produto54.setPreco((double) (byte) 1);
        produto54.setPreco((double) (-63));
        produto54.setCodigo("");
        produto54.setNome("hi!");
        java.lang.String str73 = produto54.getNome();
        java.lang.String str74 = produto54.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
    }

    @Test
    public void test7619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7619");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto20 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto20.setNome("hi!");
        produto20.setNome("");
        java.lang.String str25 = produto20.getNome();
        produto20.setNome("hi!");
        estoque0.inserirProduto(produto20, 9);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double34 = produto33.getPreco();
        produto33.setNome("hi!");
        java.lang.String str37 = produto33.getCodigo();
        produto33.setCodigo("hi!");
        double double40 = produto33.getPreco();
        produto33.setCodigo("hi!");
        java.lang.String str43 = produto33.getNome();
        java.lang.String str44 = produto33.getNome();
        produto33.setPreco((double) ' ');
        estoque0.inserirProduto(produto33, 97);
        estoque0.removerProduto("hi!", 42);
        boolean boolean53 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test7620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7620");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        boolean boolean25 = estoque0.produtoExiste("");
        int int27 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("hi!", "", (double) 1L);
        produto31.setCodigo("");
        estoque0.inserirProduto(produto31, (-35));
        int int37 = estoque0.consultarQuantidade("");
        int int39 = estoque0.consultarQuantidade("");
        boolean boolean41 = estoque0.produtoExiste("");
        boolean boolean43 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-35) + "'", int37 == (-35));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-35) + "'", int39 == (-35));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test7621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7621");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque0.inserirProduto(produto19, (int) (short) 100);
        int int23 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque24 = new br.ufrn.imd.Estoque();
        boolean boolean26 = estoque24.produtoExiste("");
        br.ufrn.imd.Produto produto30 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto30.setNome("hi!");
        produto30.setPreco((double) 10);
        estoque24.inserirProduto(produto30, (int) (byte) -1);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto40.setNome("hi!");
        produto40.setNome("");
        estoque24.inserirProduto(produto40, 0);
        int int48 = estoque24.consultarQuantidade("hi!");
        estoque24.removerProduto("hi!", 0);
        boolean boolean53 = estoque24.produtoExiste("hi!");
        br.ufrn.imd.Produto produto57 = new br.ufrn.imd.Produto("", "", (double) (short) 10);
        java.lang.String str58 = produto57.getNome();
        estoque24.inserirProduto(produto57, (-200));
        double double61 = produto57.getPreco();
        produto57.setPreco(0.0d);
        produto57.setNome("");
        estoque0.inserirProduto(produto57, 36);
        java.lang.String str68 = produto57.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test7622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7622");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (-63.0d));
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getNome();
        java.lang.String str6 = produto3.getCodigo();
        java.lang.String str7 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-63.0d) + "'", double4 == (-63.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test7623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7623");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 10.0f);
        produto3.setPreco((-1.0d));
        java.lang.String str6 = produto3.getCodigo();
        java.lang.Class<?> wildcardClass7 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7624");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        java.lang.String str33 = produto28.getNome();
        double double34 = produto28.getPreco();
        java.lang.String str35 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) '#');
        produto28.setNome("");
        produto28.setNome("");
        produto28.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test7625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7625");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        produto3.setCodigo("hi!");
        double double10 = produto3.getPreco();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        double double14 = produto3.getPreco();
        produto3.setCodigo("");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test7626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7626");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        int int13 = estoque0.consultarQuantidade("");
        boolean boolean15 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setNome("");
        estoque0.inserirProduto(produto19, (int) (byte) -1);
        estoque0.removerProduto("hi!", 99);
        br.ufrn.imd.Produto produto32 = new br.ufrn.imd.Produto("", "", (double) (short) 10);
        double double33 = produto32.getPreco();
        produto32.setCodigo("");
        produto32.setNome("");
        produto32.setPreco((double) (-78));
        estoque0.inserirProduto(produto32, (int) '4');
        estoque0.removerProduto("hi!", (-72));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
    }

    @Test
    public void test7627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7627");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-1));
        produto3.setCodigo("hi!");
        produto3.setNome("");
    }

    @Test
    public void test7628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7628");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (-11));
        produto3.setCodigo("hi!");
        double double6 = produto3.getPreco();
        produto3.setCodigo("");
        java.lang.Class<?> wildcardClass9 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7629");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setPreco((double) 10);
        java.lang.String str24 = produto19.getNome();
        double double25 = produto19.getPreco();
        java.lang.String str26 = produto19.getCodigo();
        produto19.setCodigo("hi!");
        java.lang.String str29 = produto19.getCodigo();
        produto19.setNome("");
        estoque0.inserirProduto(produto19, (int) (short) 10);
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("hi!", "", (double) 1L);
        produto37.setCodigo("");
        estoque0.inserirProduto(produto37, 0);
        br.ufrn.imd.Estoque estoque42 = new br.ufrn.imd.Estoque();
        boolean boolean44 = estoque42.produtoExiste("");
        br.ufrn.imd.Produto produto48 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto48.setNome("hi!");
        produto48.setPreco((double) 10);
        estoque42.inserirProduto(produto48, (int) (byte) -1);
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto58.setNome("hi!");
        produto58.setNome("");
        estoque42.inserirProduto(produto58, 0);
        java.lang.String str65 = produto58.getCodigo();
        double double66 = produto58.getPreco();
        produto58.setCodigo("");
        produto58.setPreco((double) 1.0f);
        java.lang.String str71 = produto58.getNome();
        estoque0.inserirProduto(produto58, (int) (short) 10);
        estoque0.removerProduto("", (int) (short) 1);
        int int78 = estoque0.consultarQuantidade("hi!");
        boolean boolean80 = estoque0.produtoExiste("hi!");
        boolean boolean82 = estoque0.produtoExiste("hi!");
        boolean boolean84 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 9 + "'", int78 == 9);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test7630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7630");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 'a');
        produto3.setNome("hi!");
        double double6 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test7631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7631");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto3.setPreco((double) (byte) 100);
        java.lang.String str6 = produto3.getNome();
        double double7 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test7632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7632");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        int int21 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto25.setNome("hi!");
        java.lang.String str28 = produto25.getCodigo();
        estoque0.inserirProduto(produto25, 18);
        boolean boolean32 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (-116));
        estoque0.removerProduto("hi!", (-132));
        boolean boolean40 = estoque0.produtoExiste("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-135));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test7633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7633");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 1);
        produto3.setCodigo("hi!");
        produto3.setNome("");
    }

    @Test
    public void test7634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7634");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 149);
    }

    @Test
    public void test7635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7635");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        java.lang.String str23 = produto16.getCodigo();
        double double24 = produto16.getPreco();
        java.lang.String str25 = produto16.getCodigo();
        produto16.setNome("");
        double double28 = produto16.getPreco();
        java.lang.String str29 = produto16.getCodigo();
        java.lang.String str30 = produto16.getCodigo();
        produto16.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test7636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7636");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        int int16 = estoque0.consultarQuantidade("");
        boolean boolean18 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) ' ');
        boolean boolean23 = estoque0.produtoExiste("");
        int int25 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 34);
        boolean boolean30 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-33) + "'", int25 == (-33));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test7637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7637");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 1);
        produto3.setCodigo("hi!");
        java.lang.String str6 = produto3.getNome();
        produto3.setCodigo("");
        java.lang.String str9 = produto3.getCodigo();
        double double10 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test7638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7638");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto3.setNome("");
        produto3.setNome("hi!");
        produto3.setNome("");
        java.lang.String str10 = produto3.getCodigo();
        produto3.setPreco((double) (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test7639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7639");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 1);
        produto3.setPreco((double) (byte) -1);
        java.lang.String str6 = produto3.getCodigo();
        java.lang.String str7 = produto3.getCodigo();
        produto3.setPreco((double) 19);
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test7640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7640");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto23.setCodigo("hi!");
        estoque19.inserirProduto(produto23, (int) (byte) 0);
        estoque0.inserirProduto(produto23, 1);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto33.setPreco((double) '#');
        produto33.setPreco((double) 10);
        java.lang.String str38 = produto33.getNome();
        produto33.setPreco(0.0d);
        java.lang.String str41 = produto33.getNome();
        estoque0.inserirProduto(produto33, (int) (short) -1);
        boolean boolean45 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 0);
        estoque0.inserirProduto(produto49, (int) (byte) 1);
        int int53 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto57 = new br.ufrn.imd.Produto("", "", (double) 10);
        estoque0.inserirProduto(produto57, 10);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) (short) 10);
        int int67 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto71 = new br.ufrn.imd.Produto("", "hi!", 68.0d);
        estoque0.inserirProduto(produto71, (-5));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-10) + "'", int67 == (-10));
    }

    @Test
    public void test7641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7641");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto18.setNome("hi!");
        produto18.setPreco((double) 10);
        produto18.setNome("hi!");
        estoque0.inserirProduto(produto18, (-1));
        boolean boolean28 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Estoque estoque29 = new br.ufrn.imd.Estoque();
        boolean boolean31 = estoque29.produtoExiste("");
        br.ufrn.imd.Produto produto35 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto35.setNome("hi!");
        produto35.setPreco((double) 10);
        estoque29.inserirProduto(produto35, (int) (byte) -1);
        int int43 = estoque29.consultarQuantidade("");
        boolean boolean45 = estoque29.produtoExiste("");
        boolean boolean47 = estoque29.produtoExiste("");
        br.ufrn.imd.Produto produto51 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double52 = produto51.getPreco();
        java.lang.String str53 = produto51.getCodigo();
        java.lang.String str54 = produto51.getNome();
        produto51.setNome("hi!");
        estoque29.inserirProduto(produto51, (int) (short) 0);
        java.lang.String str59 = produto51.getNome();
        estoque0.inserirProduto(produto51, 97);
        produto51.setCodigo("hi!");
        java.lang.Class<?> wildcardClass64 = produto51.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 100.0d + "'", double52 == 100.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test7642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7642");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getCodigo();
        produto3.setPreco((double) (short) -1);
        double double9 = produto3.getPreco();
        produto3.setCodigo("hi!");
        produto3.setCodigo("");
        double double14 = produto3.getPreco();
        produto3.setNome("");
        java.lang.String str17 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test7643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7643");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        java.lang.String str33 = produto28.getNome();
        double double34 = produto28.getPreco();
        java.lang.String str35 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) '#');
        boolean boolean39 = estoque0.produtoExiste("");
        int int41 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque42 = new br.ufrn.imd.Estoque();
        boolean boolean44 = estoque42.produtoExiste("");
        br.ufrn.imd.Produto produto48 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto48.setNome("hi!");
        produto48.setPreco((double) 10);
        estoque42.inserirProduto(produto48, (int) (byte) -1);
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto58.setNome("hi!");
        produto58.setNome("");
        estoque42.inserirProduto(produto58, 0);
        java.lang.String str65 = produto58.getCodigo();
        double double66 = produto58.getPreco();
        java.lang.String str67 = produto58.getCodigo();
        produto58.setNome("");
        estoque0.inserirProduto(produto58, 10);
        java.lang.String str72 = produto58.getCodigo();
        produto58.setNome("");
        produto58.setNome("hi!");
        produto58.setPreco((-33.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
    }

    @Test
    public void test7644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7644");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto23.setCodigo("hi!");
        estoque19.inserirProduto(produto23, (int) (byte) 0);
        estoque0.inserirProduto(produto23, 1);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto33.setPreco((double) '#');
        produto33.setPreco((double) 10);
        java.lang.String str38 = produto33.getNome();
        produto33.setPreco(0.0d);
        java.lang.String str41 = produto33.getNome();
        estoque0.inserirProduto(produto33, (int) (short) -1);
        java.lang.String str44 = produto33.getNome();
        java.lang.String str45 = produto33.getNome();
        java.lang.String str46 = produto33.getNome();
        produto33.setPreco((double) 38);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test7645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7645");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        produto3.setNome("");
        produto3.setPreco((double) (byte) 100);
        java.lang.String str15 = produto3.getNome();
        produto3.setCodigo("hi!");
        produto3.setPreco((double) (byte) 1);
        produto3.setPreco((-2.0d));
        produto3.setPreco((double) (-63));
        java.lang.String str24 = produto3.getCodigo();
        java.lang.String str25 = produto3.getNome();
        java.lang.String str26 = produto3.getNome();
        produto3.setCodigo("hi!");
        produto3.setNome("hi!");
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test7646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7646");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto23.setCodigo("hi!");
        estoque19.inserirProduto(produto23, (int) (byte) 0);
        estoque0.inserirProduto(produto23, 1);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto33.setPreco((double) '#');
        produto33.setPreco((double) 10);
        java.lang.String str38 = produto33.getNome();
        produto33.setPreco(0.0d);
        java.lang.String str41 = produto33.getNome();
        estoque0.inserirProduto(produto33, (int) (short) -1);
        produto33.setPreco((double) (-63));
        produto33.setPreco((double) 18);
        produto33.setCodigo("");
        java.lang.String str50 = produto33.getNome();
        java.lang.String str51 = produto33.getNome();
        java.lang.String str52 = produto33.getNome();
        java.lang.String str53 = produto33.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test7647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7647");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto23.setCodigo("hi!");
        estoque19.inserirProduto(produto23, (int) (byte) 0);
        estoque0.inserirProduto(produto23, 1);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto33.setPreco((double) '#');
        produto33.setPreco((double) 10);
        java.lang.String str38 = produto33.getNome();
        produto33.setPreco(0.0d);
        java.lang.String str41 = produto33.getNome();
        estoque0.inserirProduto(produto33, (int) (short) -1);
        java.lang.String str44 = produto33.getNome();
        java.lang.String str45 = produto33.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
    }

    @Test
    public void test7648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7648");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 52);
        produto3.setCodigo("");
    }

    @Test
    public void test7649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7649");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        int int21 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque22 = new br.ufrn.imd.Estoque();
        boolean boolean24 = estoque22.produtoExiste("");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        estoque22.inserirProduto(produto28, (int) (byte) -1);
        int int36 = estoque22.consultarQuantidade("");
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto40.setNome("");
        estoque22.inserirProduto(produto40, (int) (byte) 10);
        produto40.setNome("hi!");
        estoque0.inserirProduto(produto40, (int) (byte) -1);
        estoque0.removerProduto("hi!", (-200));
        br.ufrn.imd.Produto produto55 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double56 = produto55.getPreco();
        produto55.setNome("");
        java.lang.String str59 = produto55.getNome();
        estoque0.inserirProduto(produto55, (-98));
        produto55.setCodigo("");
        double double64 = produto55.getPreco();
        produto55.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 100.0d + "'", double64 == 100.0d);
    }

    @Test
    public void test7650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7650");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-35));
        java.lang.String str4 = produto3.getNome();
        java.lang.String str5 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test7651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7651");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 0.0f);
        java.lang.String str4 = produto3.getNome();
        produto3.setPreco((double) 68);
        java.lang.Class<?> wildcardClass7 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7652");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        estoque0.removerProduto("hi!", (int) (short) 100);
        int int16 = estoque0.consultarQuantidade("hi!");
        int int18 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-200) + "'", int16 == (-200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-200) + "'", int18 == (-200));
    }

    @Test
    public void test7653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7653");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str23 = produto22.getCodigo();
        estoque0.inserirProduto(produto22, (int) 'a');
        boolean boolean27 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("", 10);
        estoque0.removerProduto("", (-33));
        boolean boolean35 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("", "", (double) (short) -1);
        estoque0.inserirProduto(produto39, 99);
        estoque0.removerProduto("", (int) (short) 0);
        estoque0.removerProduto("", (-25));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test7654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7654");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        produto21.setPreco((double) 10);
        produto21.setNome("hi!");
        java.lang.String str28 = produto21.getCodigo();
        double double29 = produto21.getPreco();
        produto21.setCodigo("hi!");
        estoque0.inserirProduto(produto21, (int) 'a');
        java.lang.String str34 = produto21.getCodigo();
        java.lang.String str35 = produto21.getCodigo();
        java.lang.String str36 = produto21.getNome();
        java.lang.String str37 = produto21.getCodigo();
        double double38 = produto21.getPreco();
        produto21.setPreco(1.0d);
        produto21.setCodigo("");
        produto21.setPreco((double) 100);
        produto21.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
    }

    @Test
    public void test7655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7655");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (-1));
        produto3.setNome("hi!");
    }

    @Test
    public void test7656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7656");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto23.setNome("hi!");
        produto23.setPreco((double) 10);
        java.lang.String str28 = produto23.getCodigo();
        double double29 = produto23.getPreco();
        produto23.setPreco((double) 1.0f);
        estoque0.inserirProduto(produto23, (int) (short) 0);
        java.lang.String str34 = produto23.getCodigo();
        produto23.setNome("hi!");
        java.lang.String str37 = produto23.getNome();
        produto23.setCodigo("hi!");
        produto23.setCodigo("hi!");
        produto23.setPreco(0.0d);
        produto23.setPreco(8.0d);
        produto23.setCodigo("hi!");
        java.lang.Class<?> wildcardClass48 = produto23.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test7657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7657");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        boolean boolean25 = estoque0.produtoExiste("");
        int int27 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto31.setPreco((double) '#');
        produto31.setNome("");
        estoque0.inserirProduto(produto31, (int) (short) 10);
        int int39 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque40 = new br.ufrn.imd.Estoque();
        boolean boolean42 = estoque40.produtoExiste("");
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto46.setNome("hi!");
        produto46.setPreco((double) 10);
        estoque40.inserirProduto(produto46, (int) (byte) -1);
        br.ufrn.imd.Produto produto56 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto56.setNome("hi!");
        produto56.setNome("");
        estoque40.inserirProduto(produto56, 0);
        java.lang.String str63 = produto56.getCodigo();
        double double64 = produto56.getPreco();
        produto56.setCodigo("");
        produto56.setPreco((double) 1.0f);
        produto56.setPreco((double) 10);
        java.lang.String str71 = produto56.getCodigo();
        java.lang.String str72 = produto56.getNome();
        estoque0.inserirProduto(produto56, 100);
        br.ufrn.imd.Produto produto78 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto78.setPreco((double) '#');
        produto78.setPreco((double) 10);
        java.lang.String str83 = produto78.getNome();
        produto78.setPreco(0.0d);
        produto78.setNome("hi!");
        produto78.setPreco((double) 96);
        double double90 = produto78.getPreco();
        estoque0.inserirProduto(produto78, (-76));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 96.0d + "'", double90 == 96.0d);
    }

    @Test
    public void test7658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7658");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto23.setCodigo("hi!");
        estoque19.inserirProduto(produto23, (int) (byte) 0);
        estoque0.inserirProduto(produto23, 1);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto33.setPreco((double) '#');
        produto33.setPreco((double) 10);
        java.lang.String str38 = produto33.getNome();
        produto33.setPreco(0.0d);
        java.lang.String str41 = produto33.getNome();
        estoque0.inserirProduto(produto33, (int) (short) -1);
        boolean boolean45 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double50 = produto49.getPreco();
        java.lang.String str51 = produto49.getNome();
        estoque0.inserirProduto(produto49, 0);
        int int55 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto59 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto59.setNome("hi!");
        produto59.setPreco((double) 10);
        produto59.setNome("hi!");
        java.lang.String str66 = produto59.getCodigo();
        produto59.setPreco((double) (-10));
        java.lang.String str69 = produto59.getNome();
        double double70 = produto59.getPreco();
        estoque0.inserirProduto(produto59, (-68));
        double double73 = produto59.getPreco();
        produto59.setPreco(166.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-10.0d) + "'", double70 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-10.0d) + "'", double73 == (-10.0d));
    }

    @Test
    public void test7659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7659");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto23.setCodigo("hi!");
        estoque19.inserirProduto(produto23, (int) (byte) 0);
        estoque0.inserirProduto(produto23, 1);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto33.setPreco((double) '#');
        produto33.setPreco((double) 10);
        java.lang.String str38 = produto33.getNome();
        produto33.setPreco(0.0d);
        java.lang.String str41 = produto33.getNome();
        estoque0.inserirProduto(produto33, (int) (short) -1);
        boolean boolean45 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 0);
        estoque0.inserirProduto(produto49, (int) (byte) 1);
        estoque0.removerProduto("hi!", (int) (byte) 10);
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto58.setPreco((double) (byte) 100);
        java.lang.String str61 = produto58.getNome();
        java.lang.String str62 = produto58.getCodigo();
        estoque0.inserirProduto(produto58, (int) (byte) 1);
        boolean boolean66 = estoque0.produtoExiste("");
        boolean boolean68 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test7660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7660");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto23.setCodigo("hi!");
        estoque19.inserirProduto(produto23, (int) (byte) 0);
        estoque0.inserirProduto(produto23, 1);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto33.setPreco((double) '#');
        produto33.setPreco((double) 10);
        java.lang.String str38 = produto33.getNome();
        produto33.setPreco(0.0d);
        java.lang.String str41 = produto33.getNome();
        estoque0.inserirProduto(produto33, (int) (short) -1);
        boolean boolean45 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 0);
        estoque0.inserirProduto(produto49, (int) (byte) 1);
        br.ufrn.imd.Produto produto55 = new br.ufrn.imd.Produto("hi!", "", 0.0d);
        estoque0.inserirProduto(produto55, (int) (byte) 0);
        int int59 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("", (int) '#');
        br.ufrn.imd.Produto produto66 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto66.setNome("hi!");
        produto66.setNome("");
        produto66.setPreco(1.0d);
        java.lang.String str73 = produto66.getCodigo();
        double double74 = produto66.getPreco();
        produto66.setNome("");
        produto66.setNome("");
        double double79 = produto66.getPreco();
        produto66.setPreco((double) (-1));
        produto66.setNome("hi!");
        estoque0.inserirProduto(produto66, (int) (short) 1);
        boolean boolean87 = estoque0.produtoExiste("hi!");
        boolean boolean89 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (-97));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 1.0d + "'", double79 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test7661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7661");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto23.setCodigo("hi!");
        estoque19.inserirProduto(produto23, (int) (byte) 0);
        estoque0.inserirProduto(produto23, 1);
        produto23.setPreco((double) (byte) -1);
        java.lang.String str32 = produto23.getNome();
        produto23.setPreco((double) 114);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test7662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7662");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        produto21.setPreco((double) 10);
        produto21.setNome("hi!");
        java.lang.String str28 = produto21.getCodigo();
        double double29 = produto21.getPreco();
        produto21.setCodigo("hi!");
        estoque0.inserirProduto(produto21, (int) 'a');
        java.lang.String str34 = produto21.getCodigo();
        java.lang.String str35 = produto21.getCodigo();
        java.lang.String str36 = produto21.getCodigo();
        java.lang.String str37 = produto21.getNome();
        produto21.setCodigo("hi!");
        java.lang.String str40 = produto21.getCodigo();
        java.lang.String str41 = produto21.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test7663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7663");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto28.setNome("");
        produto28.setNome("hi!");
        produto28.setNome("");
        estoque0.inserirProduto(produto28, 9);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "", (double) '#');
        estoque0.inserirProduto(produto40, (-1));
        produto40.setPreco((double) 114);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7664");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque18 = new br.ufrn.imd.Estoque();
        boolean boolean20 = estoque18.produtoExiste("");
        br.ufrn.imd.Produto produto24 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto24.setNome("hi!");
        produto24.setPreco((double) 10);
        estoque18.inserirProduto(produto24, (int) (byte) -1);
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto34.setNome("hi!");
        produto34.setNome("");
        estoque18.inserirProduto(produto34, 0);
        int int42 = estoque18.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto46.setNome("hi!");
        produto46.setPreco((double) 10);
        java.lang.String str51 = produto46.getNome();
        double double52 = produto46.getPreco();
        java.lang.String str53 = produto46.getCodigo();
        estoque18.inserirProduto(produto46, (int) '#');
        estoque0.inserirProduto(produto46, (int) (byte) -1);
        estoque0.removerProduto("hi!", (int) (short) 1);
        br.ufrn.imd.Produto produto64 = new br.ufrn.imd.Produto("", "hi!", (double) (short) -1);
        java.lang.String str65 = produto64.getCodigo();
        produto64.setNome("hi!");
        java.lang.String str68 = produto64.getNome();
        produto64.setPreco((double) 99);
        estoque0.inserirProduto(produto64, 100);
        estoque0.removerProduto("hi!", (-98));
        int int77 = estoque0.consultarQuantidade("");
        int int79 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (-68));
        int int84 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto88 = new br.ufrn.imd.Produto("hi!", "", 100.0d);
        java.lang.String str89 = produto88.getCodigo();
        double double90 = produto88.getPreco();
        double double91 = produto88.getPreco();
        produto88.setCodigo("hi!");
        produto88.setPreco(104.0d);
        estoque0.inserirProduto(produto88, 50);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 97 + "'", int84 == 97);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 100.0d + "'", double90 == 100.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 100.0d + "'", double91 == 100.0d);
    }

    @Test
    public void test7665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7665");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getCodigo();
        produto3.setPreco((double) (-1L));
        java.lang.String str13 = produto3.getNome();
        produto3.setPreco((-32.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7666");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        produto21.setPreco((double) 10);
        produto21.setNome("hi!");
        java.lang.String str28 = produto21.getCodigo();
        double double29 = produto21.getPreco();
        produto21.setCodigo("hi!");
        estoque0.inserirProduto(produto21, (int) 'a');
        boolean boolean35 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) 'a');
        int int40 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 33);
        boolean boolean45 = estoque0.produtoExiste("hi!");
        int int47 = estoque0.consultarQuantidade("hi!");
        int int49 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque50 = new br.ufrn.imd.Estoque();
        boolean boolean52 = estoque50.produtoExiste("");
        br.ufrn.imd.Produto produto56 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto56.setNome("hi!");
        produto56.setPreco((double) 10);
        estoque50.inserirProduto(produto56, (int) (byte) -1);
        int int64 = estoque50.consultarQuantidade("");
        boolean boolean66 = estoque50.produtoExiste("");
        boolean boolean68 = estoque50.produtoExiste("");
        br.ufrn.imd.Produto produto72 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double73 = produto72.getPreco();
        java.lang.String str74 = produto72.getCodigo();
        java.lang.String str75 = produto72.getNome();
        produto72.setNome("hi!");
        estoque50.inserirProduto(produto72, (int) (short) 0);
        java.lang.String str80 = produto72.getNome();
        double double81 = produto72.getPreco();
        java.lang.String str82 = produto72.getCodigo();
        java.lang.String str83 = produto72.getNome();
        double double84 = produto72.getPreco();
        estoque0.inserirProduto(produto72, (-135));
        double double87 = produto72.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-35) + "'", int47 == (-35));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-35) + "'", int49 == (-35));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 100.0d + "'", double73 == 100.0d);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 100.0d + "'", double81 == 100.0d);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 100.0d + "'", double84 == 100.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 100.0d + "'", double87 == 100.0d);
    }

    @Test
    public void test7667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7667");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 100L);
        estoque0.inserirProduto(produto15, (int) (short) 10);
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double26 = produto25.getPreco();
        produto25.setNome("hi!");
        java.lang.String str29 = produto25.getNome();
        produto25.setCodigo("hi!");
        estoque0.inserirProduto(produto25, (int) (short) 100);
        estoque0.removerProduto("hi!", (int) (short) 10);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto40.setNome("hi!");
        produto40.setPreco((double) 10);
        java.lang.String str45 = produto40.getNome();
        double double46 = produto40.getPreco();
        java.lang.String str47 = produto40.getCodigo();
        produto40.setCodigo("hi!");
        produto40.setPreco((double) (-1.0f));
        produto40.setPreco(100.0d);
        estoque0.inserirProduto(produto40, (int) ' ');
        boolean boolean57 = estoque0.produtoExiste("");
        boolean boolean59 = estoque0.produtoExiste("hi!");
        int int61 = estoque0.consultarQuantidade("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-12));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 42 + "'", int61 == 42);
    }

    @Test
    public void test7668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7668");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        java.lang.String str33 = produto28.getNome();
        double double34 = produto28.getPreco();
        java.lang.String str35 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) '#');
        boolean boolean39 = estoque0.produtoExiste("");
        int int41 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque42 = new br.ufrn.imd.Estoque();
        boolean boolean44 = estoque42.produtoExiste("");
        br.ufrn.imd.Produto produto48 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto48.setNome("hi!");
        produto48.setPreco((double) 10);
        estoque42.inserirProduto(produto48, (int) (byte) -1);
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto58.setNome("hi!");
        produto58.setNome("");
        estoque42.inserirProduto(produto58, 0);
        java.lang.String str65 = produto58.getCodigo();
        double double66 = produto58.getPreco();
        java.lang.String str67 = produto58.getCodigo();
        produto58.setNome("");
        estoque0.inserirProduto(produto58, 10);
        java.lang.String str72 = produto58.getCodigo();
        produto58.setPreco((double) (-99));
        produto58.setNome("");
        double double77 = produto58.getPreco();
        produto58.setCodigo("hi!");
        java.lang.String str80 = produto58.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-99.0d) + "'", double77 == (-99.0d));
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
    }

    @Test
    public void test7669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7669");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setNome("hi!");
        double double9 = produto3.getPreco();
        produto3.setPreco((double) 0);
        produto3.setCodigo("hi!");
        produto3.setPreco((double) (-200));
        produto3.setCodigo("");
        java.lang.Class<?> wildcardClass18 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7670");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        int int13 = estoque0.consultarQuantidade("");
        boolean boolean15 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setNome("");
        estoque0.inserirProduto(produto19, (int) (byte) -1);
        estoque0.removerProduto("hi!", 99);
        br.ufrn.imd.Estoque estoque29 = new br.ufrn.imd.Estoque();
        boolean boolean31 = estoque29.produtoExiste("");
        br.ufrn.imd.Produto produto35 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto35.setNome("hi!");
        produto35.setPreco((double) 10);
        estoque29.inserirProduto(produto35, (int) (byte) -1);
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto45.setNome("hi!");
        produto45.setNome("");
        estoque29.inserirProduto(produto45, 0);
        java.lang.String str52 = produto45.getCodigo();
        double double53 = produto45.getPreco();
        double double54 = produto45.getPreco();
        java.lang.String str55 = produto45.getNome();
        produto45.setCodigo("");
        produto45.setNome("");
        produto45.setCodigo("");
        java.lang.String str62 = produto45.getCodigo();
        estoque0.inserirProduto(produto45, 109);
        estoque0.removerProduto("", (-101));
        estoque0.removerProduto("", 119);
        int int72 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-10) + "'", int72 == (-10));
    }

    @Test
    public void test7671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7671");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        produto3.setPreco(0.0d);
        double double11 = produto3.getPreco();
        double double12 = produto3.getPreco();
        produto3.setPreco((double) (-4));
        produto3.setPreco((double) (short) 10);
        produto3.setPreco((double) (short) 0);
        java.lang.Class<?> wildcardClass19 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7672");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        produto16.setPreco((double) (-2));
        double double25 = produto16.getPreco();
        java.lang.String str26 = produto16.getNome();
        java.lang.String str27 = produto16.getNome();
        produto16.setNome("hi!");
        produto16.setCodigo("");
        produto16.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-2.0d) + "'", double25 == (-2.0d));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test7673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7673");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto18.setNome("hi!");
        produto18.setPreco((double) 10);
        produto18.setNome("hi!");
        estoque0.inserirProduto(produto18, (-1));
        int int28 = estoque0.consultarQuantidade("");
        int int30 = estoque0.consultarQuantidade("");
        boolean boolean32 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("hi!", "", (double) 35);
        estoque0.inserirProduto(produto36, 166);
        java.lang.String str39 = produto36.getCodigo();
        java.lang.String str40 = produto36.getCodigo();
        produto36.setPreco(104.0d);
        java.lang.String str43 = produto36.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test7674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7674");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto20 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str21 = produto20.getCodigo();
        produto20.setCodigo("hi!");
        produto20.setNome("hi!");
        double double26 = produto20.getPreco();
        produto20.setCodigo("");
        java.lang.String str29 = produto20.getCodigo();
        estoque0.inserirProduto(produto20, (-88));
        int int33 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test7675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7675");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 10);
        estoque0.removerProduto("hi!", (int) (short) 10);
        boolean boolean34 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque35 = new br.ufrn.imd.Estoque();
        boolean boolean37 = estoque35.produtoExiste("");
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto41.setNome("hi!");
        produto41.setPreco((double) 10);
        estoque35.inserirProduto(produto41, (int) (byte) -1);
        boolean boolean49 = estoque35.produtoExiste("");
        int int51 = estoque35.consultarQuantidade("");
        boolean boolean53 = estoque35.produtoExiste("");
        int int55 = estoque35.consultarQuantidade("hi!");
        boolean boolean57 = estoque35.produtoExiste("hi!");
        br.ufrn.imd.Estoque estoque58 = new br.ufrn.imd.Estoque();
        boolean boolean60 = estoque58.produtoExiste("");
        br.ufrn.imd.Produto produto64 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto64.setNome("hi!");
        produto64.setPreco((double) 10);
        estoque58.inserirProduto(produto64, (int) (byte) -1);
        int int72 = estoque58.consultarQuantidade("");
        boolean boolean74 = estoque58.produtoExiste("");
        boolean boolean76 = estoque58.produtoExiste("");
        br.ufrn.imd.Produto produto80 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double81 = produto80.getPreco();
        java.lang.String str82 = produto80.getCodigo();
        java.lang.String str83 = produto80.getNome();
        produto80.setNome("hi!");
        estoque58.inserirProduto(produto80, (int) (short) 0);
        java.lang.String str88 = produto80.getNome();
        produto80.setPreco((double) (-1L));
        produto80.setPreco((double) (byte) 100);
        estoque35.inserirProduto(produto80, 30);
        estoque0.inserirProduto(produto80, (-90));
        produto80.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 100.0d + "'", double81 == 100.0d);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
    }

    @Test
    public void test7676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7676");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        br.ufrn.imd.Produto produto12 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto12.setNome("hi!");
        produto12.setNome("");
        produto12.setPreco(1.0d);
        estoque0.inserirProduto(produto12, 100);
        produto12.setCodigo("");
        produto12.setCodigo("");
        produto12.setNome("hi!");
        java.lang.String str27 = produto12.getCodigo();
        produto12.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test7677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7677");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 10);
        int int31 = estoque0.consultarQuantidade("");
        boolean boolean33 = estoque0.produtoExiste("hi!");
        boolean boolean35 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque36 = new br.ufrn.imd.Estoque();
        boolean boolean38 = estoque36.produtoExiste("");
        br.ufrn.imd.Produto produto42 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto42.setNome("hi!");
        produto42.setPreco((double) 10);
        estoque36.inserirProduto(produto42, (int) (byte) -1);
        int int50 = estoque36.consultarQuantidade("");
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto54.setNome("");
        estoque36.inserirProduto(produto54, (int) (byte) 10);
        boolean boolean60 = estoque36.produtoExiste("");
        int int62 = estoque36.consultarQuantidade("");
        estoque36.removerProduto("hi!", 10);
        br.ufrn.imd.Estoque estoque66 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto70 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto70.setCodigo("hi!");
        estoque66.inserirProduto(produto70, (int) (byte) 0);
        estoque36.inserirProduto(produto70, (int) (byte) 10);
        estoque36.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto83 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-1.0f));
        estoque36.inserirProduto(produto83, 8);
        estoque0.inserirProduto(produto83, (-200));
        produto83.setNome("hi!");
        produto83.setPreco((double) 94);
        java.lang.Class<?> wildcardClass92 = produto83.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test7678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7678");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (-135));
        produto3.setPreco((double) 1);
    }

    @Test
    public void test7679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7679");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto28.setNome("");
        produto28.setNome("hi!");
        produto28.setNome("");
        estoque0.inserirProduto(produto28, 9);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "", (double) '#');
        estoque0.inserirProduto(produto40, (-1));
        int int44 = estoque0.consultarQuantidade("");
        boolean boolean46 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double51 = produto50.getPreco();
        java.lang.String str52 = produto50.getCodigo();
        java.lang.String str53 = produto50.getNome();
        produto50.setNome("hi!");
        produto50.setPreco(10.0d);
        double double58 = produto50.getPreco();
        java.lang.String str59 = produto50.getNome();
        estoque0.inserirProduto(produto50, 16);
        estoque0.removerProduto("", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 100.0d + "'", double51 == 100.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
    }

    @Test
    public void test7680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7680");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto18.setNome("hi!");
        produto18.setPreco((double) 10);
        produto18.setNome("hi!");
        estoque0.inserirProduto(produto18, (-1));
        int int28 = estoque0.consultarQuantidade("");
        int int30 = estoque0.consultarQuantidade("");
        boolean boolean32 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("hi!", "", (double) 35);
        estoque0.inserirProduto(produto36, 166);
        java.lang.String str39 = produto36.getCodigo();
        java.lang.String str40 = produto36.getNome();
        double double41 = produto36.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 35.0d + "'", double41 == 35.0d);
    }

    @Test
    public void test7681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7681");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        java.lang.String str23 = produto18.getCodigo();
        produto18.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test7682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7682");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (short) -1);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        produto3.setPreco((double) 99);
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getNome();
        produto3.setCodigo("");
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7683");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        int int25 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque26 = new br.ufrn.imd.Estoque();
        boolean boolean28 = estoque26.produtoExiste("");
        br.ufrn.imd.Produto produto32 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto32.setNome("hi!");
        produto32.setPreco((double) 10);
        estoque26.inserirProduto(produto32, (int) (byte) -1);
        int int40 = estoque26.consultarQuantidade("");
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto44.setNome("");
        estoque26.inserirProduto(produto44, (int) (byte) 10);
        boolean boolean50 = estoque26.produtoExiste("");
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto54.setNome("");
        produto54.setNome("hi!");
        produto54.setNome("");
        estoque26.inserirProduto(produto54, 9);
        estoque0.inserirProduto(produto54, (-63));
        produto54.setPreco((double) (byte) 1);
        produto54.setPreco((double) (-63));
        produto54.setCodigo("");
        double double71 = produto54.getPreco();
        double double72 = produto54.getPreco();
        double double73 = produto54.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-63.0d) + "'", double71 == (-63.0d));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-63.0d) + "'", double72 == (-63.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-63.0d) + "'", double73 == (-63.0d));
    }

    @Test
    public void test7684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7684");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        int int13 = estoque0.consultarQuantidade("");
        boolean boolean15 = estoque0.produtoExiste("");
        boolean boolean17 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto21.setNome("");
        java.lang.String str24 = produto21.getNome();
        estoque0.inserirProduto(produto21, (int) (byte) 10);
        double double27 = produto21.getPreco();
        java.lang.String str28 = produto21.getCodigo();
        java.lang.String str29 = produto21.getNome();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test7685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7685");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 10);
        estoque0.removerProduto("hi!", (int) (short) 10);
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("hi!", "hi!", (double) ' ');
        estoque0.inserirProduto(produto36, 97);
        produto36.setPreco(0.0d);
        double double41 = produto36.getPreco();
        produto36.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test7686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7686");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco((double) 1);
        java.lang.String str13 = produto3.getCodigo();
        produto3.setPreco((-69.0d));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7687");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        java.lang.String str12 = produto3.getNome();
        produto3.setCodigo("hi!");
        produto3.setPreco((double) (-63));
        java.lang.String str17 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test7688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7688");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (int) (byte) -1);
        int int29 = estoque0.consultarQuantidade("");
        boolean boolean31 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (int) (short) 1);
        boolean boolean36 = estoque0.produtoExiste("");
        boolean boolean38 = estoque0.produtoExiste("");
        boolean boolean40 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test7689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7689");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (-10.0d));
        java.lang.String str4 = produto3.getNome();
        java.lang.String str5 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test7690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7690");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 38);
    }

    @Test
    public void test7691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7691");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 0);
        boolean boolean29 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "", (double) (short) 10);
        java.lang.String str34 = produto33.getNome();
        estoque0.inserirProduto(produto33, (-200));
        double double37 = produto33.getPreco();
        produto33.setNome("");
        produto33.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
    }

    @Test
    public void test7692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7692");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (-90));
        java.lang.Class<?> wildcardClass4 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test7693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7693");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        boolean boolean25 = estoque0.produtoExiste("");
        boolean boolean27 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("hi!", "", (double) (short) 10);
        estoque0.inserirProduto(produto31, 36);
        int int35 = estoque0.consultarQuantidade("");
        java.lang.Class<?> wildcardClass36 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 36 + "'", int35 == 36);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7694");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setCodigo("");
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setNome("hi!");
        java.lang.String str13 = produto3.getCodigo();
        produto3.setPreco((double) (byte) -1);
        produto3.setCodigo("hi!");
        java.lang.String str18 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test7695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7695");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setPreco((double) 10);
        java.lang.String str24 = produto19.getNome();
        double double25 = produto19.getPreco();
        java.lang.String str26 = produto19.getCodigo();
        produto19.setCodigo("hi!");
        java.lang.String str29 = produto19.getCodigo();
        produto19.setNome("");
        estoque0.inserirProduto(produto19, (int) (short) 10);
        boolean boolean35 = estoque0.produtoExiste("hi!");
        int int37 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto41.setNome("hi!");
        produto41.setPreco((double) 10);
        java.lang.String str46 = produto41.getNome();
        produto41.setCodigo("hi!");
        estoque0.inserirProduto(produto41, (int) (short) 10);
        estoque0.removerProduto("hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass54 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test7696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7696");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        boolean boolean25 = estoque0.produtoExiste("");
        boolean boolean27 = estoque0.produtoExiste("hi!");
        boolean boolean29 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (int) 'a');
        estoque0.removerProduto("hi!", (-2));
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        double double40 = produto39.getPreco();
        estoque0.inserirProduto(produto39, 0);
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str47 = produto46.getCodigo();
        produto46.setNome("");
        java.lang.String str50 = produto46.getCodigo();
        estoque0.inserirProduto(produto46, (int) (short) 100);
        br.ufrn.imd.Produto produto56 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto56.setNome("hi!");
        produto56.setPreco((double) 10);
        produto56.setNome("hi!");
        java.lang.String str63 = produto56.getCodigo();
        double double64 = produto56.getPreco();
        java.lang.String str65 = produto56.getCodigo();
        produto56.setNome("hi!");
        produto56.setNome("hi!");
        produto56.setNome("hi!");
        java.lang.String str72 = produto56.getCodigo();
        estoque0.inserirProduto(produto56, 100);
        produto56.setCodigo("");
        java.lang.String str77 = produto56.getNome();
        produto56.setPreco(0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
    }

    @Test
    public void test7697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7697");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        java.lang.String str33 = produto28.getNome();
        double double34 = produto28.getPreco();
        java.lang.String str35 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) '#');
        produto28.setNome("");
        produto28.setNome("");
        produto28.setPreco(0.0d);
        java.lang.Class<?> wildcardClass44 = produto28.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test7698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7698");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque0.inserirProduto(produto19, (int) (short) 100);
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double26 = produto25.getPreco();
        java.lang.String str27 = produto25.getCodigo();
        java.lang.String str28 = produto25.getNome();
        produto25.setCodigo("");
        double double31 = produto25.getPreco();
        java.lang.String str32 = produto25.getCodigo();
        produto25.setNome("hi!");
        java.lang.String str35 = produto25.getNome();
        estoque0.inserirProduto(produto25, (-63));
        estoque0.removerProduto("hi!", 9);
        boolean boolean42 = estoque0.produtoExiste("");
        int int44 = estoque0.consultarQuantidade("");
        int int46 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-63) + "'", int44 == (-63));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 99 + "'", int46 == 99);
    }

    @Test
    public void test7699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7699");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        produto3.setNome("");
        java.lang.String str10 = produto3.getCodigo();
        produto3.setPreco(0.0d);
        java.lang.String str13 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        produto3.setPreco((double) 16);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7700");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto23.setNome("hi!");
        produto23.setPreco((double) 10);
        java.lang.String str28 = produto23.getNome();
        double double29 = produto23.getPreco();
        java.lang.String str30 = produto23.getCodigo();
        produto23.setCodigo("hi!");
        java.lang.String str33 = produto23.getCodigo();
        estoque0.inserirProduto(produto23, 0);
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("", "", (double) 0L);
        java.lang.String str40 = produto39.getNome();
        estoque0.inserirProduto(produto39, (int) (short) 0);
        boolean boolean44 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Estoque estoque45 = new br.ufrn.imd.Estoque();
        boolean boolean47 = estoque45.produtoExiste("");
        br.ufrn.imd.Produto produto51 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto51.setNome("hi!");
        produto51.setPreco((double) 10);
        estoque45.inserirProduto(produto51, (int) (byte) -1);
        int int59 = estoque45.consultarQuantidade("");
        estoque45.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto66 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto66.setNome("hi!");
        produto66.setPreco((double) 10);
        produto66.setNome("hi!");
        java.lang.String str73 = produto66.getCodigo();
        double double74 = produto66.getPreco();
        produto66.setCodigo("hi!");
        estoque45.inserirProduto(produto66, (int) 'a');
        java.lang.String str79 = produto66.getCodigo();
        java.lang.String str80 = produto66.getCodigo();
        java.lang.String str81 = produto66.getNome();
        java.lang.String str82 = produto66.getCodigo();
        estoque0.inserirProduto(produto66, 116);
        boolean boolean86 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test7701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7701");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 1.0f);
        java.lang.String str4 = produto3.getNome();
        produto3.setPreco((double) 98);
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7702");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco((double) 1);
        produto3.setCodigo("hi!");
        produto3.setNome("hi!");
        double double17 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test7703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7703");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        java.lang.String str33 = produto28.getNome();
        double double34 = produto28.getPreco();
        java.lang.String str35 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) '#');
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque0.inserirProduto(produto41, (-1));
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double48 = produto47.getPreco();
        java.lang.String str49 = produto47.getCodigo();
        java.lang.String str50 = produto47.getNome();
        estoque0.inserirProduto(produto47, 1);
        estoque0.removerProduto("hi!", (int) 'a');
        boolean boolean57 = estoque0.produtoExiste("");
        int int59 = estoque0.consultarQuantidade("");
        boolean boolean61 = estoque0.produtoExiste("hi!");
        boolean boolean63 = estoque0.produtoExiste("");
        java.lang.Class<?> wildcardClass64 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test7704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7704");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        java.lang.String str13 = produto3.getCodigo();
        java.lang.String str14 = produto3.getCodigo();
        produto3.setCodigo("");
        double double17 = produto3.getPreco();
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test7705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7705");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        produto3.setNome("");
        double double10 = produto3.getPreco();
        produto3.setPreco((-63.0d));
        produto3.setPreco((-69.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test7706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7706");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setPreco((double) 10);
        java.lang.String str24 = produto19.getNome();
        double double25 = produto19.getPreco();
        java.lang.String str26 = produto19.getCodigo();
        produto19.setCodigo("hi!");
        java.lang.String str29 = produto19.getCodigo();
        produto19.setNome("");
        estoque0.inserirProduto(produto19, (int) (short) 10);
        boolean boolean35 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto39.setPreco((double) '#');
        produto39.setPreco((double) 10);
        java.lang.String str44 = produto39.getNome();
        produto39.setPreco(0.0d);
        estoque0.inserirProduto(produto39, (int) (byte) -1);
        boolean boolean50 = estoque0.produtoExiste("hi!");
        int int52 = estoque0.consultarQuantidade("hi!");
        int int54 = estoque0.consultarQuantidade("hi!");
        int int56 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 8 + "'", int52 == 8);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 8 + "'", int54 == 8);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 8 + "'", int56 == 8);
    }

    @Test
    public void test7707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7707");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        produto3.setNome("hi!");
        produto3.setNome("hi!");
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test7708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7708");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 96);
        produto3.setPreco((double) 109);
        produto3.setCodigo("");
        java.lang.Class<?> wildcardClass8 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7709");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque17 = new br.ufrn.imd.Estoque();
        boolean boolean19 = estoque17.produtoExiste("");
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto23.setNome("hi!");
        produto23.setPreco((double) 10);
        estoque17.inserirProduto(produto23, (int) (byte) -1);
        estoque17.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque17.inserirProduto(produto36, (int) (short) 100);
        estoque0.inserirProduto(produto36, 0);
        boolean boolean42 = estoque0.produtoExiste("");
        int int44 = estoque0.consultarQuantidade("hi!");
        boolean boolean46 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-1.0f));
        java.lang.String str51 = produto50.getNome();
        estoque0.inserirProduto(produto50, (-200));
        int int55 = estoque0.consultarQuantidade("hi!");
        int int57 = estoque0.consultarQuantidade("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-201) + "'", int55 == (-201));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test7710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7710");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        estoque0.removerProduto("hi!", (int) '#');
        estoque0.removerProduto("hi!", 104);
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test7711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7711");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getCodigo();
        produto3.setPreco((double) 10.0f);
        produto3.setPreco(0.0d);
        produto3.setPreco((double) (-4));
        produto3.setPreco((double) 33);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test7712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7712");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        java.lang.String str9 = produto3.getNome();
        produto3.setNome("");
        java.lang.String str12 = produto3.getNome();
        produto3.setCodigo("");
        produto3.setPreco(0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test7713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7713");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque18 = new br.ufrn.imd.Estoque();
        boolean boolean20 = estoque18.produtoExiste("");
        br.ufrn.imd.Produto produto24 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto24.setNome("hi!");
        produto24.setPreco((double) 10);
        estoque18.inserirProduto(produto24, (int) (byte) -1);
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto34.setNome("hi!");
        produto34.setNome("");
        estoque18.inserirProduto(produto34, 0);
        int int42 = estoque18.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto46.setNome("hi!");
        produto46.setPreco((double) 10);
        java.lang.String str51 = produto46.getNome();
        double double52 = produto46.getPreco();
        java.lang.String str53 = produto46.getCodigo();
        estoque18.inserirProduto(produto46, (int) '#');
        estoque0.inserirProduto(produto46, (int) (byte) -1);
        int int59 = estoque0.consultarQuantidade("hi!");
        int int61 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto65.setNome("");
        java.lang.String str68 = produto65.getCodigo();
        double double69 = produto65.getPreco();
        estoque0.inserirProduto(produto65, 1);
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-2) + "'", int59 == (-2));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-2) + "'", int61 == (-2));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
    }

    @Test
    public void test7714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7714");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str23 = produto22.getCodigo();
        estoque0.inserirProduto(produto22, (int) 'a');
        boolean boolean27 = estoque0.produtoExiste("hi!");
        int int29 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        boolean boolean32 = estoque30.produtoExiste("");
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto36.setNome("hi!");
        produto36.setPreco((double) 10);
        estoque30.inserirProduto(produto36, (int) (byte) -1);
        boolean boolean44 = estoque30.produtoExiste("");
        int int46 = estoque30.consultarQuantidade("");
        boolean boolean48 = estoque30.produtoExiste("");
        estoque30.removerProduto("hi!", (int) ' ');
        br.ufrn.imd.Produto produto55 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double56 = produto55.getPreco();
        produto55.setNome("hi!");
        java.lang.String str59 = produto55.getNome();
        java.lang.String str60 = produto55.getCodigo();
        java.lang.String str61 = produto55.getNome();
        estoque30.inserirProduto(produto55, (int) ' ');
        estoque0.inserirProduto(produto55, 1);
        boolean boolean67 = estoque0.produtoExiste("");
        int int69 = estoque0.consultarQuantidade("");
        boolean boolean71 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto75 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto75.setNome("hi!");
        produto75.setPreco((double) 10);
        java.lang.String str80 = produto75.getCodigo();
        double double81 = produto75.getPreco();
        produto75.setPreco((double) 1.0f);
        produto75.setPreco((double) '4');
        produto75.setCodigo("");
        produto75.setCodigo("hi!");
        produto75.setCodigo("hi!");
        produto75.setPreco((double) (byte) 100);
        java.lang.String str94 = produto75.getNome();
        produto75.setPreco((-108.0d));
        estoque0.inserirProduto(produto75, (-36));
        java.lang.Class<?> wildcardClass99 = produto75.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 97 + "'", int69 == 97);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test7715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7715");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getCodigo();
        produto3.setPreco(0.0d);
        java.lang.String str9 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.String str12 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test7716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7716");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        br.ufrn.imd.Produto produto12 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto12.setNome("hi!");
        produto12.setNome("");
        produto12.setPreco(1.0d);
        estoque0.inserirProduto(produto12, 100);
        produto12.setPreco((double) 0);
        java.lang.String str23 = produto12.getNome();
        java.lang.String str24 = produto12.getCodigo();
        double double25 = produto12.getPreco();
        java.lang.String str26 = produto12.getCodigo();
        double double27 = produto12.getPreco();
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test7717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7717");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco((double) 10L);
        double double10 = produto3.getPreco();
        produto3.setPreco((double) (-11));
        java.lang.String str13 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test7718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7718");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        int int16 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto20 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto20.setNome("hi!");
        java.lang.String str23 = produto20.getCodigo();
        estoque0.inserirProduto(produto20, (-1));
        boolean boolean27 = estoque0.produtoExiste("");
        boolean boolean29 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str34 = produto33.getCodigo();
        produto33.setCodigo("hi!");
        produto33.setNome("hi!");
        estoque0.inserirProduto(produto33, 18);
        int int42 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", (-63));
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto49.setNome("");
        java.lang.String str52 = produto49.getCodigo();
        double double53 = produto49.getPreco();
        estoque0.inserirProduto(produto49, 116);
        java.lang.Class<?> wildcardClass56 = produto49.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 16 + "'", int42 == 16);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test7719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7719");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto21.setPreco((double) '#');
        produto21.setNome("");
        estoque0.inserirProduto(produto21, (int) (byte) 1);
        estoque0.removerProduto("hi!", (-98));
        estoque0.removerProduto("hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test7720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7720");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        produto3.setNome("");
        java.lang.String str10 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7721");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        int int25 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque26 = new br.ufrn.imd.Estoque();
        boolean boolean28 = estoque26.produtoExiste("");
        br.ufrn.imd.Produto produto32 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto32.setNome("hi!");
        produto32.setPreco((double) 10);
        estoque26.inserirProduto(produto32, (int) (byte) -1);
        int int40 = estoque26.consultarQuantidade("");
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto44.setNome("");
        estoque26.inserirProduto(produto44, (int) (byte) 10);
        boolean boolean50 = estoque26.produtoExiste("");
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto54.setNome("");
        produto54.setNome("hi!");
        produto54.setNome("");
        estoque26.inserirProduto(produto54, 9);
        estoque0.inserirProduto(produto54, (-63));
        produto54.setPreco((double) (byte) 1);
        produto54.setPreco((double) (-63));
        java.lang.String str69 = produto54.getNome();
        produto54.setCodigo("");
        java.lang.String str72 = produto54.getNome();
        java.lang.String str73 = produto54.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test7722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7722");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 1.0f);
        java.lang.String str4 = produto3.getCodigo();
        java.lang.String str5 = produto3.getNome();
        java.lang.String str6 = produto3.getNome();
        double double7 = produto3.getPreco();
        java.lang.String str8 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test7723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7723");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        int int25 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque26 = new br.ufrn.imd.Estoque();
        boolean boolean28 = estoque26.produtoExiste("");
        br.ufrn.imd.Produto produto32 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto32.setNome("hi!");
        produto32.setPreco((double) 10);
        estoque26.inserirProduto(produto32, (int) (byte) -1);
        int int40 = estoque26.consultarQuantidade("");
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto44.setNome("");
        estoque26.inserirProduto(produto44, (int) (byte) 10);
        boolean boolean50 = estoque26.produtoExiste("");
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto54.setNome("");
        produto54.setNome("hi!");
        produto54.setNome("");
        estoque26.inserirProduto(produto54, 9);
        estoque0.inserirProduto(produto54, (-63));
        boolean boolean66 = estoque0.produtoExiste("");
        boolean boolean68 = estoque0.produtoExiste("");
        int int70 = estoque0.consultarQuantidade("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-122));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 36 + "'", int70 == 36);
    }

    @Test
    public void test7724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7724");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        java.lang.String str13 = produto6.getCodigo();
        produto6.setPreco((double) (short) 1);
        java.lang.String str16 = produto6.getCodigo();
        produto6.setPreco((-2.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7725");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto23.setCodigo("hi!");
        estoque19.inserirProduto(produto23, (int) (byte) 0);
        estoque0.inserirProduto(produto23, 1);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto33.setPreco((double) '#');
        produto33.setPreco((double) 10);
        java.lang.String str38 = produto33.getNome();
        produto33.setPreco(0.0d);
        java.lang.String str41 = produto33.getNome();
        estoque0.inserirProduto(produto33, (int) (short) -1);
        boolean boolean45 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 0);
        estoque0.inserirProduto(produto49, (int) (byte) 1);
        estoque0.removerProduto("hi!", (int) (byte) 10);
        boolean boolean56 = estoque0.produtoExiste("hi!");
        java.lang.Class<?> wildcardClass57 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test7726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7726");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        int int13 = estoque0.consultarQuantidade("");
        boolean boolean15 = estoque0.produtoExiste("");
        boolean boolean17 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", 10);
        boolean boolean22 = estoque0.produtoExiste("hi!");
        boolean boolean24 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7727");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("hi!");
        int int20 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto24 = new br.ufrn.imd.Produto("hi!", "hi!", (-99.0d));
        estoque0.inserirProduto(produto24, (-108));
        estoque0.removerProduto("hi!", 28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test7728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7728");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (-98));
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto34.setNome("hi!");
        produto34.setPreco((double) 10);
        java.lang.String str39 = produto34.getCodigo();
        java.lang.String str40 = produto34.getNome();
        produto34.setNome("");
        java.lang.String str43 = produto34.getNome();
        produto34.setCodigo("");
        estoque0.inserirProduto(produto34, (-88));
        boolean boolean49 = estoque0.produtoExiste("");
        int int51 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-88) + "'", int51 == (-88));
    }

    @Test
    public void test7729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7729");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("");
        int int18 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (short) 100);
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double26 = produto25.getPreco();
        produto25.setNome("hi!");
        java.lang.String str29 = produto25.getNome();
        produto25.setCodigo("hi!");
        double double32 = produto25.getPreco();
        estoque0.inserirProduto(produto25, 109);
        int int36 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque37 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto41.setCodigo("hi!");
        estoque37.inserirProduto(produto41, (int) (byte) 0);
        estoque37.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto52 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto52.setNome("hi!");
        produto52.setPreco((double) 100L);
        estoque37.inserirProduto(produto52, (int) (short) 10);
        produto52.setPreco(52.0d);
        double double61 = produto52.getPreco();
        produto52.setCodigo("");
        double double64 = produto52.getPreco();
        double double65 = produto52.getPreco();
        double double66 = produto52.getPreco();
        estoque0.inserirProduto(produto52, (-89));
        br.ufrn.imd.Produto produto72 = new br.ufrn.imd.Produto("hi!", "", (double) 1L);
        produto72.setCodigo("");
        produto72.setPreco((double) (short) -1);
        produto72.setPreco((double) (short) 10);
        produto72.setCodigo("");
        estoque0.inserirProduto(produto72, 105);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 52.0d + "'", double61 == 52.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 52.0d + "'", double64 == 52.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 52.0d + "'", double65 == 52.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 52.0d + "'", double66 == 52.0d);
    }

    @Test
    public void test7730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7730");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", 10.0d);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7731");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        java.lang.String str8 = produto3.getNome();
        java.lang.String str9 = produto3.getNome();
        produto3.setPreco((double) 0L);
        produto3.setNome("hi!");
        java.lang.String str14 = produto3.getNome();
        double double15 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test7732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7732");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto23.setCodigo("hi!");
        estoque19.inserirProduto(produto23, (int) (byte) 0);
        estoque0.inserirProduto(produto23, 1);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto33.setPreco((double) '#');
        produto33.setPreco((double) 10);
        java.lang.String str38 = produto33.getNome();
        produto33.setPreco(0.0d);
        java.lang.String str41 = produto33.getNome();
        estoque0.inserirProduto(produto33, (int) (short) -1);
        boolean boolean45 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 0);
        estoque0.inserirProduto(produto49, (int) (byte) 1);
        int int53 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto57 = new br.ufrn.imd.Produto("", "", (double) 10);
        estoque0.inserirProduto(produto57, 10);
        int int61 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto65.setNome("hi!");
        produto65.setPreco((double) 10);
        java.lang.String str70 = produto65.getNome();
        double double71 = produto65.getPreco();
        java.lang.String str72 = produto65.getNome();
        produto65.setNome("");
        produto65.setPreco((double) (-3));
        estoque0.inserirProduto(produto65, (int) '4');
        boolean boolean80 = estoque0.produtoExiste("");
        int int82 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 10 + "'", int82 == 10);
    }

    @Test
    public void test7733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7733");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", 0.0d);
        produto3.setNome("hi!");
        produto3.setCodigo("");
    }

    @Test
    public void test7734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7734");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        produto3.setNome("");
        double double10 = produto3.getPreco();
        produto3.setCodigo("hi!");
        double double13 = produto3.getPreco();
        produto3.setNome("hi!");
        double double16 = produto3.getPreco();
        double double17 = produto3.getPreco();
        produto3.setNome("");
        java.lang.String str20 = produto3.getCodigo();
        double double21 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test7735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7735");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        produto3.setNome("hi!");
        double double9 = produto3.getPreco();
        produto3.setCodigo("");
        java.lang.String str12 = produto3.getCodigo();
        java.lang.String str13 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7736");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", 35.0d);
        produto3.setNome("hi!");
        produto3.setCodigo("hi!");
        double double8 = produto3.getPreco();
        double double9 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setPreco((double) (-200));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    }

    @Test
    public void test7737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7737");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (-63));
        produto3.setCodigo("hi!");
        java.lang.String str6 = produto3.getNome();
        java.lang.Class<?> wildcardClass7 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7738");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("");
        int int21 = estoque0.consultarQuantidade("");
        boolean boolean23 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto27 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto27.setNome("");
        java.lang.String str30 = produto27.getCodigo();
        java.lang.String str31 = produto27.getCodigo();
        produto27.setPreco((double) (-97));
        estoque0.inserirProduto(produto27, 10);
        boolean boolean37 = estoque0.produtoExiste("hi!");
        boolean boolean39 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test7739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7739");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 10);
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto34.setCodigo("hi!");
        estoque30.inserirProduto(produto34, (int) (byte) 0);
        estoque0.inserirProduto(produto34, (int) (byte) 10);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-1.0f));
        estoque0.inserirProduto(produto47, 8);
        java.lang.String str50 = produto47.getNome();
        double double51 = produto47.getPreco();
        produto47.setNome("hi!");
        java.lang.String str54 = produto47.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
    }

    @Test
    public void test7740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7740");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        java.lang.String str33 = produto28.getNome();
        double double34 = produto28.getPreco();
        java.lang.String str35 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) '#');
        boolean boolean39 = estoque0.produtoExiste("");
        int int41 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque42 = new br.ufrn.imd.Estoque();
        boolean boolean44 = estoque42.produtoExiste("");
        br.ufrn.imd.Produto produto48 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto48.setNome("hi!");
        produto48.setPreco((double) 10);
        estoque42.inserirProduto(produto48, (int) (byte) -1);
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto58.setNome("hi!");
        produto58.setNome("");
        estoque42.inserirProduto(produto58, 0);
        java.lang.String str65 = produto58.getCodigo();
        double double66 = produto58.getPreco();
        java.lang.String str67 = produto58.getCodigo();
        produto58.setNome("");
        estoque0.inserirProduto(produto58, 10);
        br.ufrn.imd.Produto produto75 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto75.setNome("hi!");
        produto75.setPreco((double) 10);
        java.lang.String str80 = produto75.getNome();
        double double81 = produto75.getPreco();
        java.lang.String str82 = produto75.getCodigo();
        produto75.setCodigo("hi!");
        java.lang.String str85 = produto75.getCodigo();
        java.lang.String str86 = produto75.getCodigo();
        produto75.setCodigo("");
        estoque0.inserirProduto(produto75, 16);
        java.lang.String str91 = produto75.getCodigo();
        double double92 = produto75.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 10.0d + "'", double92 == 10.0d);
    }

    @Test
    public void test7741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7741");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        int int16 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto20 = new br.ufrn.imd.Produto("hi!", "", 10.0d);
        java.lang.String str21 = produto20.getCodigo();
        double double22 = produto20.getPreco();
        estoque0.inserirProduto(produto20, 84);
        boolean boolean26 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test7742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7742");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getCodigo();
        produto3.setPreco((double) (-1L));
        double double13 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setPreco((double) 62);
        java.lang.String str18 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test7743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7743");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setPreco((double) 10);
        java.lang.String str24 = produto19.getNome();
        double double25 = produto19.getPreco();
        java.lang.String str26 = produto19.getCodigo();
        produto19.setCodigo("hi!");
        java.lang.String str29 = produto19.getCodigo();
        produto19.setNome("");
        estoque0.inserirProduto(produto19, (int) (short) 10);
        boolean boolean35 = estoque0.produtoExiste("hi!");
        int int37 = estoque0.consultarQuantidade("");
        boolean boolean39 = estoque0.produtoExiste("hi!");
        int int41 = estoque0.consultarQuantidade("hi!");
        boolean boolean43 = estoque0.produtoExiste("hi!");
        int int45 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
    }

    @Test
    public void test7744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7744");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", 166.0d);
        double double4 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 166.0d + "'", double4 == 166.0d);
    }

    @Test
    public void test7745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7745");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 50);
    }

    @Test
    public void test7746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7746");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (-63.0d));
        java.lang.String str4 = produto3.getNome();
        produto3.setCodigo("hi!");
        produto3.setPreco((double) (-11));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test7747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7747");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto20 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto20.setNome("hi!");
        produto20.setNome("");
        java.lang.String str25 = produto20.getNome();
        produto20.setNome("hi!");
        estoque0.inserirProduto(produto20, 9);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double34 = produto33.getPreco();
        produto33.setNome("hi!");
        java.lang.String str37 = produto33.getCodigo();
        produto33.setCodigo("hi!");
        double double40 = produto33.getPreco();
        produto33.setCodigo("hi!");
        java.lang.String str43 = produto33.getNome();
        java.lang.String str44 = produto33.getNome();
        produto33.setPreco((double) ' ');
        estoque0.inserirProduto(produto33, 97);
        estoque0.removerProduto("hi!", (-101));
        estoque0.removerProduto("hi!", 52);
        int int56 = estoque0.consultarQuantidade("hi!");
        boolean boolean58 = estoque0.produtoExiste("hi!");
        boolean boolean60 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 105 + "'", int56 == 105);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test7748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7748");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque18 = new br.ufrn.imd.Estoque();
        boolean boolean20 = estoque18.produtoExiste("");
        br.ufrn.imd.Produto produto24 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto24.setNome("hi!");
        produto24.setPreco((double) 10);
        estoque18.inserirProduto(produto24, (int) (byte) -1);
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto34.setNome("hi!");
        produto34.setNome("");
        estoque18.inserirProduto(produto34, 0);
        int int42 = estoque18.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto46.setNome("hi!");
        produto46.setPreco((double) 10);
        java.lang.String str51 = produto46.getNome();
        double double52 = produto46.getPreco();
        java.lang.String str53 = produto46.getCodigo();
        estoque18.inserirProduto(produto46, (int) '#');
        estoque0.inserirProduto(produto46, (int) (byte) -1);
        estoque0.removerProduto("hi!", (int) (short) 1);
        boolean boolean62 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test7749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7749");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto23.setNome("hi!");
        produto23.setNome("");
        produto23.setPreco(1.0d);
        java.lang.String str30 = produto23.getCodigo();
        double double31 = produto23.getPreco();
        produto23.setNome("");
        produto23.setNome("");
        double double36 = produto23.getPreco();
        java.lang.String str37 = produto23.getNome();
        estoque0.inserirProduto(produto23, (-108));
        br.ufrn.imd.Produto produto43 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto43.setNome("hi!");
        produto43.setPreco((double) 10);
        java.lang.String str48 = produto43.getNome();
        double double49 = produto43.getPreco();
        java.lang.String str50 = produto43.getNome();
        produto43.setNome("");
        produto43.setNome("hi!");
        java.lang.String str55 = produto43.getCodigo();
        produto43.setPreco((double) (short) 100);
        produto43.setPreco((double) '#');
        produto43.setNome("");
        produto43.setPreco(0.0d);
        estoque0.inserirProduto(produto43, (-150));
        estoque0.removerProduto("hi!", 0);
        boolean boolean70 = estoque0.produtoExiste("hi!");
        boolean boolean72 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test7750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7750");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto23.setNome("hi!");
        produto23.setPreco((double) 10);
        java.lang.String str28 = produto23.getNome();
        double double29 = produto23.getPreco();
        java.lang.String str30 = produto23.getCodigo();
        produto23.setCodigo("hi!");
        java.lang.String str33 = produto23.getCodigo();
        estoque0.inserirProduto(produto23, 0);
        boolean boolean37 = estoque0.produtoExiste("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test7751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7751");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setCodigo("");
        java.lang.String str9 = produto3.getCodigo();
        java.lang.String str10 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7752");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (-10));
        java.lang.Class<?> wildcardClass4 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test7753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7753");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        produto3.setNome("");
        double double12 = produto3.getPreco();
        produto3.setPreco((-1.0d));
        java.lang.Class<?> wildcardClass15 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7754");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 100L);
        estoque0.inserirProduto(produto15, (int) (short) 10);
        produto15.setPreco(52.0d);
        double double24 = produto15.getPreco();
        produto15.setCodigo("");
        produto15.setNome("hi!");
        produto15.setPreco((double) (-67));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
    }

    @Test
    public void test7755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7755");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto23.setCodigo("hi!");
        estoque19.inserirProduto(produto23, (int) (byte) 0);
        estoque0.inserirProduto(produto23, 1);
        int int31 = estoque0.consultarQuantidade("");
        int int33 = estoque0.consultarQuantidade("hi!");
        java.lang.Class<?> wildcardClass34 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test7756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7756");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (short) 100);
        produto3.setCodigo("");
        produto3.setPreco(10.0d);
        java.lang.String str8 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test7757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7757");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        estoque0.removerProduto("hi!", 100);
        boolean boolean22 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque23 = new br.ufrn.imd.Estoque();
        boolean boolean25 = estoque23.produtoExiste("");
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto29.setNome("hi!");
        produto29.setPreco((double) 10);
        estoque23.inserirProduto(produto29, (int) (byte) -1);
        estoque23.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto42 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto42.setNome("hi!");
        produto42.setPreco((double) 10);
        java.lang.String str47 = produto42.getNome();
        double double48 = produto42.getPreco();
        java.lang.String str49 = produto42.getCodigo();
        produto42.setCodigo("hi!");
        java.lang.String str52 = produto42.getCodigo();
        produto42.setNome("");
        estoque23.inserirProduto(produto42, (int) (short) 10);
        produto42.setCodigo("");
        produto42.setNome("");
        estoque0.inserirProduto(produto42, 0);
        int int64 = estoque0.consultarQuantidade("");
        boolean boolean66 = estoque0.produtoExiste("hi!");
        boolean boolean68 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test7758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7758");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 99);
        produto3.setCodigo("hi!");
        java.lang.String str6 = produto3.getNome();
        produto3.setPreco((double) 94);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test7759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7759");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        int int6 = estoque0.consultarQuantidade("");
        int int8 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque9 = new br.ufrn.imd.Estoque();
        boolean boolean11 = estoque9.produtoExiste("");
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 10);
        estoque9.inserirProduto(produto15, (int) (byte) -1);
        java.lang.String str22 = produto15.getNome();
        java.lang.String str23 = produto15.getNome();
        estoque0.inserirProduto(produto15, 34);
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto29.setNome("hi!");
        produto29.setNome("");
        produto29.setPreco(1.0d);
        java.lang.String str36 = produto29.getCodigo();
        double double37 = produto29.getPreco();
        produto29.setNome("");
        produto29.setNome("");
        java.lang.String str42 = produto29.getNome();
        double double43 = produto29.getPreco();
        double double44 = produto29.getPreco();
        estoque0.inserirProduto(produto29, 68);
        estoque0.removerProduto("hi!", 181);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
    }

    @Test
    public void test7760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7760");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        int int21 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto25.setNome("hi!");
        java.lang.String str28 = produto25.getCodigo();
        estoque0.inserirProduto(produto25, 18);
        boolean boolean32 = estoque0.produtoExiste("");
        boolean boolean34 = estoque0.produtoExiste("");
        boolean boolean36 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test7761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7761");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        br.ufrn.imd.Produto produto12 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto12.setNome("hi!");
        produto12.setNome("");
        produto12.setPreco(1.0d);
        estoque0.inserirProduto(produto12, 100);
        int int22 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", (-102));
        boolean boolean27 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 35);
        estoque0.inserirProduto(produto31, (-201));
        estoque0.removerProduto("hi!", 51);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto40.setNome("hi!");
        produto40.setPreco((double) 10);
        java.lang.String str45 = produto40.getCodigo();
        double double46 = produto40.getPreco();
        double double47 = produto40.getPreco();
        produto40.setCodigo("");
        produto40.setPreco(18.0d);
        estoque0.inserirProduto(produto40, (-4));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
    }

    @Test
    public void test7762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7762");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (short) 0);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 'a');
        produto15.setNome("");
        produto15.setNome("");
        double double28 = produto15.getPreco();
        double double29 = produto15.getPreco();
        produto15.setPreco((double) 68);
        produto15.setPreco((double) 8);
        java.lang.String str34 = produto15.getNome();
        estoque0.inserirProduto(produto15, (int) (byte) 100);
        boolean boolean38 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 97.0d + "'", double28 == 97.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 97.0d + "'", double29 == 97.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test7763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7763");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto20 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto20.setNome("hi!");
        produto20.setNome("");
        java.lang.String str25 = produto20.getNome();
        produto20.setNome("hi!");
        estoque0.inserirProduto(produto20, 9);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double34 = produto33.getPreco();
        produto33.setNome("hi!");
        java.lang.String str37 = produto33.getCodigo();
        produto33.setCodigo("hi!");
        double double40 = produto33.getPreco();
        produto33.setCodigo("hi!");
        java.lang.String str43 = produto33.getNome();
        java.lang.String str44 = produto33.getNome();
        produto33.setPreco((double) ' ');
        estoque0.inserirProduto(produto33, 97);
        estoque0.removerProduto("hi!", (-101));
        br.ufrn.imd.Produto produto52 = null;
        // The following exception was thrown during execution in test generation
        try {
            estoque0.inserirProduto(produto52, 134);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test7764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7764");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 100L);
        estoque0.inserirProduto(produto15, (int) (short) 10);
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double26 = produto25.getPreco();
        produto25.setNome("hi!");
        java.lang.String str29 = produto25.getNome();
        produto25.setCodigo("hi!");
        estoque0.inserirProduto(produto25, (int) (short) 100);
        estoque0.removerProduto("hi!", (int) (short) 10);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto40.setNome("hi!");
        produto40.setPreco((double) 10);
        java.lang.String str45 = produto40.getNome();
        double double46 = produto40.getPreco();
        java.lang.String str47 = produto40.getCodigo();
        produto40.setCodigo("hi!");
        produto40.setPreco((double) (-1.0f));
        produto40.setPreco(100.0d);
        estoque0.inserirProduto(produto40, (int) ' ');
        br.ufrn.imd.Produto produto59 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto59.setNome("hi!");
        produto59.setPreco((double) 10);
        java.lang.String str64 = produto59.getCodigo();
        double double65 = produto59.getPreco();
        produto59.setPreco((double) 1.0f);
        estoque0.inserirProduto(produto59, 68);
        int int71 = estoque0.consultarQuantidade("");
        boolean boolean73 = estoque0.produtoExiste("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-76));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test7765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7765");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 0.0f);
        produto3.setPreco(97.0d);
        produto3.setPreco(18.0d);
        java.lang.String str8 = produto3.getNome();
        produto3.setNome("");
        java.lang.String str11 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test7766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7766");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        boolean boolean6 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto10 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto10.setNome("hi!");
        produto10.setNome("");
        produto10.setPreco((double) 10L);
        produto10.setNome("");
        produto10.setPreco((double) 96);
        produto10.setPreco((double) (-98));
        estoque0.inserirProduto(produto10, (-91));
        java.lang.String str25 = produto10.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test7767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7767");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        produto3.setNome("");
        produto3.setPreco((double) (byte) 100);
        double double15 = produto3.getPreco();
        double double16 = produto3.getPreco();
        produto3.setNome("");
        produto3.setCodigo("");
        produto3.setPreco((double) '#');
        double double23 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
    }

    @Test
    public void test7768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7768");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto3.setPreco((double) (byte) 100);
        produto3.setNome("hi!");
        produto3.setCodigo("");
        double double10 = produto3.getPreco();
        produto3.setNome("");
        produto3.setPreco((double) (-3));
        java.lang.String str15 = produto3.getNome();
        java.lang.String str16 = produto3.getNome();
        java.lang.String str17 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test7769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7769");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 100L);
        produto3.setNome("hi!");
        produto3.setPreco((double) 0L);
        produto3.setCodigo("");
        double double10 = produto3.getPreco();
        java.lang.String str11 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7770");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        estoque0.removerProduto("hi!", 100);
        boolean boolean22 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque23 = new br.ufrn.imd.Estoque();
        boolean boolean25 = estoque23.produtoExiste("");
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto29.setNome("hi!");
        produto29.setPreco((double) 10);
        estoque23.inserirProduto(produto29, (int) (byte) -1);
        estoque23.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto42 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto42.setNome("hi!");
        produto42.setPreco((double) 10);
        java.lang.String str47 = produto42.getNome();
        double double48 = produto42.getPreco();
        java.lang.String str49 = produto42.getCodigo();
        produto42.setCodigo("hi!");
        java.lang.String str52 = produto42.getCodigo();
        produto42.setNome("");
        estoque23.inserirProduto(produto42, (int) (short) 10);
        produto42.setCodigo("");
        produto42.setNome("");
        estoque0.inserirProduto(produto42, 0);
        int int64 = estoque0.consultarQuantidade("");
        boolean boolean66 = estoque0.produtoExiste("");
        boolean boolean68 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto72 = new br.ufrn.imd.Produto("", "", (double) (short) 0);
        estoque0.inserirProduto(produto72, (-90));
        estoque0.removerProduto("hi!", (-13));
        estoque0.removerProduto("hi!", 32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test7771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7771");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (byte) 10);
        produto3.setPreco((double) (short) 100);
        java.lang.Class<?> wildcardClass6 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test7772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7772");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 6);
    }

    @Test
    public void test7773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7773");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque0.inserirProduto(produto19, (int) (short) 100);
        java.lang.String str22 = produto19.getCodigo();
        produto19.setNome("hi!");
        produto19.setPreco((double) 1);
        produto19.setCodigo("hi!");
        produto19.setPreco((double) (-160));
        double double31 = produto19.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-160.0d) + "'", double31 == (-160.0d));
    }

    @Test
    public void test7774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7774");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        produto21.setPreco((double) 10);
        produto21.setNome("hi!");
        java.lang.String str28 = produto21.getCodigo();
        double double29 = produto21.getPreco();
        produto21.setCodigo("hi!");
        estoque0.inserirProduto(produto21, (int) 'a');
        boolean boolean35 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) 'a');
        int int40 = estoque0.consultarQuantidade("hi!");
        int int42 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto46.setNome("");
        double double49 = produto46.getPreco();
        estoque0.inserirProduto(produto46, (-98));
        boolean boolean53 = estoque0.produtoExiste("hi!");
        int int55 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (-76));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test7775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7775");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setPreco((double) 10);
        java.lang.String str24 = produto19.getNome();
        double double25 = produto19.getPreco();
        java.lang.String str26 = produto19.getCodigo();
        produto19.setCodigo("hi!");
        java.lang.String str29 = produto19.getCodigo();
        produto19.setNome("");
        estoque0.inserirProduto(produto19, (int) (short) 10);
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("hi!", "", (double) 1L);
        produto37.setCodigo("");
        estoque0.inserirProduto(produto37, 0);
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str46 = produto45.getCodigo();
        produto45.setNome("");
        double double49 = produto45.getPreco();
        double double50 = produto45.getPreco();
        java.lang.String str51 = produto45.getCodigo();
        estoque0.inserirProduto(produto45, (int) '4');
        estoque0.removerProduto("", (-91));
        br.ufrn.imd.Produto produto60 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double61 = produto60.getPreco();
        java.lang.String str62 = produto60.getCodigo();
        java.lang.String str63 = produto60.getNome();
        produto60.setCodigo("");
        double double66 = produto60.getPreco();
        java.lang.String str67 = produto60.getCodigo();
        produto60.setNome("hi!");
        java.lang.String str70 = produto60.getCodigo();
        produto60.setPreco((double) (byte) -1);
        produto60.setNome("hi!");
        estoque0.inserirProduto(produto60, 0);
        java.lang.Class<?> wildcardClass77 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 100.0d + "'", double61 == 100.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 100.0d + "'", double66 == 100.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test7776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7776");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto3.setNome("");
        java.lang.String str6 = produto3.getCodigo();
        double double7 = produto3.getPreco();
        double double8 = produto3.getPreco();
        java.lang.String str9 = produto3.getNome();
        produto3.setNome("");
        produto3.setNome("hi!");
        java.lang.Class<?> wildcardClass14 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7777");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        produto3.setPreco(0.0d);
        produto3.setCodigo("hi!");
        produto3.setNome("hi!");
        java.lang.String str15 = produto3.getNome();
        produto3.setCodigo("hi!");
        double double18 = produto3.getPreco();
        java.lang.String str19 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test7778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7778");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto21.setPreco((double) '#');
        produto21.setNome("");
        estoque0.inserirProduto(produto21, (int) (byte) 1);
        estoque0.removerProduto("hi!", (int) (short) 1);
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto34.setPreco((double) '#');
        produto34.setPreco((double) 10);
        estoque0.inserirProduto(produto34, 10);
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto44.setNome("hi!");
        double double47 = produto44.getPreco();
        produto44.setCodigo("");
        estoque0.inserirProduto(produto44, 68);
        estoque0.removerProduto("", 34);
        boolean boolean56 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("", 70);
        int int61 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-2) + "'", int61 == (-2));
    }

    @Test
    public void test7779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7779");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setPreco((double) 10);
        java.lang.String str24 = produto19.getNome();
        double double25 = produto19.getPreco();
        java.lang.String str26 = produto19.getCodigo();
        produto19.setCodigo("hi!");
        java.lang.String str29 = produto19.getCodigo();
        produto19.setNome("");
        estoque0.inserirProduto(produto19, (int) (short) 10);
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("hi!", "", (double) 1L);
        produto37.setCodigo("");
        estoque0.inserirProduto(produto37, 0);
        br.ufrn.imd.Estoque estoque42 = new br.ufrn.imd.Estoque();
        boolean boolean44 = estoque42.produtoExiste("");
        br.ufrn.imd.Produto produto48 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto48.setNome("hi!");
        produto48.setPreco((double) 10);
        estoque42.inserirProduto(produto48, (int) (byte) -1);
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto58.setNome("hi!");
        produto58.setNome("");
        estoque42.inserirProduto(produto58, 0);
        java.lang.String str65 = produto58.getCodigo();
        double double66 = produto58.getPreco();
        produto58.setCodigo("");
        produto58.setPreco((double) 1.0f);
        java.lang.String str71 = produto58.getNome();
        estoque0.inserirProduto(produto58, (int) (short) 10);
        int int75 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto79 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-1L));
        produto79.setNome("");
        double double82 = produto79.getPreco();
        java.lang.String str83 = produto79.getCodigo();
        estoque0.inserirProduto(produto79, 8);
        java.lang.String str86 = produto79.getNome();
        java.lang.String str87 = produto79.getNome();
        java.lang.String str88 = produto79.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 9 + "'", int75 == 9);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1.0d) + "'", double82 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
    }

    @Test
    public void test7780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7780");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.String str8 = produto3.getNome();
        produto3.setPreco(52.0d);
        produto3.setCodigo("hi!");
        produto3.setCodigo("");
        java.lang.String str15 = produto3.getCodigo();
        produto3.setNome("");
        java.lang.String str18 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7781");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto23.setNome("hi!");
        produto23.setPreco((double) 10);
        java.lang.String str28 = produto23.getNome();
        double double29 = produto23.getPreco();
        java.lang.String str30 = produto23.getCodigo();
        produto23.setCodigo("hi!");
        java.lang.String str33 = produto23.getCodigo();
        estoque0.inserirProduto(produto23, 0);
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("", "", (double) 0L);
        java.lang.String str40 = produto39.getNome();
        estoque0.inserirProduto(produto39, (int) (short) 0);
        java.lang.String str43 = produto39.getCodigo();
        produto39.setCodigo("hi!");
        produto39.setPreco((double) (-1L));
        produto39.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test7782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7782");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        java.lang.String str4 = produto3.getCodigo();
        double double5 = produto3.getPreco();
        java.lang.String str6 = produto3.getNome();
        produto3.setNome("hi!");
        double double9 = produto3.getPreco();
        produto3.setCodigo("");
        java.lang.String str12 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test7783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7783");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (-37));
    }

    @Test
    public void test7784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7784");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        boolean boolean26 = estoque0.produtoExiste("hi!");
        boolean boolean28 = estoque0.produtoExiste("hi!");
        int int30 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque31 = new br.ufrn.imd.Estoque();
        boolean boolean33 = estoque31.produtoExiste("");
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto37.setNome("hi!");
        produto37.setPreco((double) 10);
        estoque31.inserirProduto(produto37, (int) (byte) -1);
        int int45 = estoque31.consultarQuantidade("");
        estoque31.removerProduto("hi!", 1);
        int int50 = estoque31.consultarQuantidade("");
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto54.setNome("hi!");
        produto54.setNome("");
        produto54.setPreco(1.0d);
        java.lang.String str61 = produto54.getCodigo();
        double double62 = produto54.getPreco();
        produto54.setNome("");
        produto54.setNome("");
        double double67 = produto54.getPreco();
        java.lang.String str68 = produto54.getNome();
        estoque31.inserirProduto(produto54, (-108));
        estoque0.inserirProduto(produto54, (-65));
        java.lang.Class<?> wildcardClass73 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 1.0d + "'", double67 == 1.0d);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test7785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7785");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        int int20 = estoque0.consultarQuantidade("");
        boolean boolean22 = estoque0.produtoExiste("");
        boolean boolean24 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7786");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        double double10 = produto3.getPreco();
        java.lang.String str11 = produto3.getCodigo();
        java.lang.String str12 = produto3.getCodigo();
        java.lang.String str13 = produto3.getNome();
        double double14 = produto3.getPreco();
        java.lang.String str15 = produto3.getNome();
        produto3.setPreco(34.0d);
        produto3.setPreco((double) 100L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test7787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7787");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        int int6 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto10 = new br.ufrn.imd.Produto("hi!", "", (double) 9);
        estoque0.inserirProduto(produto10, (int) '#');
        int int14 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto18.setNome("hi!");
        produto18.setPreco((double) 10);
        java.lang.String str23 = produto18.getCodigo();
        double double24 = produto18.getPreco();
        double double25 = produto18.getPreco();
        estoque0.inserirProduto(produto18, 33);
        java.lang.String str28 = produto18.getCodigo();
        java.lang.String str29 = produto18.getCodigo();
        produto18.setPreco((double) (-12));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test7788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7788");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (int) (byte) -1);
        int int29 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto33.setNome("hi!");
        produto33.setPreco((double) 10);
        java.lang.String str38 = produto33.getNome();
        double double39 = produto33.getPreco();
        java.lang.String str40 = produto33.getNome();
        produto33.setNome("");
        produto33.setPreco((double) (byte) 100);
        java.lang.String str45 = produto33.getNome();
        produto33.setCodigo("hi!");
        double double48 = produto33.getPreco();
        java.lang.String str49 = produto33.getNome();
        java.lang.String str50 = produto33.getCodigo();
        produto33.setNome("hi!");
        estoque0.inserirProduto(produto33, 68);
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double59 = produto58.getPreco();
        produto58.setCodigo("hi!");
        estoque0.inserirProduto(produto58, (-11));
        br.ufrn.imd.Estoque estoque64 = new br.ufrn.imd.Estoque();
        boolean boolean66 = estoque64.produtoExiste("");
        boolean boolean68 = estoque64.produtoExiste("hi!");
        boolean boolean70 = estoque64.produtoExiste("");
        boolean boolean72 = estoque64.produtoExiste("hi!");
        br.ufrn.imd.Produto produto76 = new br.ufrn.imd.Produto("", "", (double) (short) -1);
        produto76.setCodigo("hi!");
        produto76.setPreco((double) (-108));
        estoque64.inserirProduto(produto76, (-2));
        estoque0.inserirProduto(produto76, (-90));
        boolean boolean86 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test7789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7789");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setPreco((double) 10);
        java.lang.String str24 = produto19.getNome();
        double double25 = produto19.getPreco();
        java.lang.String str26 = produto19.getCodigo();
        produto19.setCodigo("hi!");
        java.lang.String str29 = produto19.getCodigo();
        produto19.setNome("");
        estoque0.inserirProduto(produto19, (int) (short) 10);
        boolean boolean35 = estoque0.produtoExiste("hi!");
        int int37 = estoque0.consultarQuantidade("hi!");
        int int39 = estoque0.consultarQuantidade("");
        boolean boolean41 = estoque0.produtoExiste("");
        int int43 = estoque0.consultarQuantidade("");
        java.lang.Class<?> wildcardClass44 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test7790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7790");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-1));
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getNome();
        produto3.setNome("");
        produto3.setPreco((double) (-67));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test7791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7791");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        int int25 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque26 = new br.ufrn.imd.Estoque();
        boolean boolean28 = estoque26.produtoExiste("");
        br.ufrn.imd.Produto produto32 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto32.setNome("hi!");
        produto32.setPreco((double) 10);
        estoque26.inserirProduto(produto32, (int) (byte) -1);
        int int40 = estoque26.consultarQuantidade("");
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto44.setNome("");
        estoque26.inserirProduto(produto44, (int) (byte) 10);
        boolean boolean50 = estoque26.produtoExiste("");
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto54.setNome("");
        produto54.setNome("hi!");
        produto54.setNome("");
        estoque26.inserirProduto(produto54, 9);
        estoque0.inserirProduto(produto54, (-63));
        int int66 = estoque0.consultarQuantidade("hi!");
        boolean boolean68 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (-135));
        int int73 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 36 + "'", int66 == 36);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 36 + "'", int73 == 36);
    }

    @Test
    public void test7792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7792");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.String str8 = produto3.getNome();
        produto3.setNome("hi!");
        produto3.setPreco((double) (byte) -1);
        double double13 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test7793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7793");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        produto3.setNome("");
        java.lang.String str10 = produto3.getNome();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7794");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (short) 10);
        double double4 = produto3.getPreco();
        produto3.setCodigo("");
        produto3.setNome("hi!");
        java.lang.String str9 = produto3.getCodigo();
        produto3.setCodigo("");
        produto3.setCodigo("");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test7795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7795");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 10);
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto34.setCodigo("hi!");
        estoque30.inserirProduto(produto34, (int) (byte) 0);
        estoque0.inserirProduto(produto34, (int) (byte) 10);
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("", "", (double) (byte) 0);
        estoque0.inserirProduto(produto44, 1);
        estoque0.removerProduto("hi!", (int) (short) 100);
        int int51 = estoque0.consultarQuantidade("hi!");
        boolean boolean53 = estoque0.produtoExiste("hi!");
        int int55 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 68);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-91) + "'", int51 == (-91));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-91) + "'", int55 == (-91));
    }

    @Test
    public void test7796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7796");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        produto18.setNome("hi!");
        produto18.setNome("");
        produto18.setNome("hi!");
        java.lang.String str29 = produto18.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test7797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7797");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (-102.0d));
    }

    @Test
    public void test7798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7798");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        java.lang.String str33 = produto28.getNome();
        double double34 = produto28.getPreco();
        java.lang.String str35 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) '#');
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque0.inserirProduto(produto41, (-1));
        java.lang.String str44 = produto41.getCodigo();
        produto41.setNome("");
        java.lang.String str47 = produto41.getNome();
        java.lang.String str48 = produto41.getCodigo();
        java.lang.String str49 = produto41.getCodigo();
        produto41.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test7799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7799");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 0.0f);
        produto3.setPreco(97.0d);
        java.lang.String str6 = produto3.getNome();
        java.lang.String str7 = produto3.getNome();
        double double8 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test7800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7800");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (-98));
        int int32 = estoque0.consultarQuantidade("hi!");
        boolean boolean34 = estoque0.produtoExiste("");
        java.lang.Class<?> wildcardClass35 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test7801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7801");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        int int16 = estoque0.consultarQuantidade("");
        boolean boolean18 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) ' ');
        int int23 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto27 = new br.ufrn.imd.Produto("", "", (double) 1.0f);
        java.lang.String str28 = produto27.getNome();
        estoque0.inserirProduto(produto27, (int) (byte) 1);
        java.lang.String str31 = produto27.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-33) + "'", int23 == (-33));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test7802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7802");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 9);
        produto3.setPreco((double) (byte) 0);
        produto3.setCodigo("hi!");
        java.lang.String str8 = produto3.getNome();
        java.lang.String str9 = produto3.getCodigo();
        java.lang.Class<?> wildcardClass10 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7803");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        produto21.setPreco((double) 10);
        produto21.setNome("hi!");
        java.lang.String str28 = produto21.getCodigo();
        double double29 = produto21.getPreco();
        produto21.setCodigo("hi!");
        estoque0.inserirProduto(produto21, (int) 'a');
        boolean boolean35 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) 'a');
        int int40 = estoque0.consultarQuantidade("hi!");
        int int42 = estoque0.consultarQuantidade("");
        int int44 = estoque0.consultarQuantidade("");
        boolean boolean46 = estoque0.produtoExiste("hi!");
        boolean boolean48 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) (byte) -1);
        boolean boolean53 = estoque0.produtoExiste("hi!");
        boolean boolean55 = estoque0.produtoExiste("");
        int int57 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test7804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7804");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 100L);
        produto3.setNome("hi!");
        produto3.setPreco((double) 0L);
        produto3.setCodigo("");
        double double10 = produto3.getPreco();
        produto3.setPreco((double) (-6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test7805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7805");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        produto28.setNome("hi!");
        java.lang.String str35 = produto28.getCodigo();
        double double36 = produto28.getPreco();
        java.lang.String str37 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, 10);
        double double40 = produto28.getPreco();
        produto28.setNome("");
        produto28.setPreco((-5.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
    }

    @Test
    public void test7806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7806");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (short) -1);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("hi!");
        produto3.setCodigo("hi!");
        produto3.setNome("");
        produto3.setCodigo("hi!");
        java.lang.String str13 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7807");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 33);
        java.lang.String str4 = produto3.getNome();
        produto3.setCodigo("hi!");
        java.lang.Class<?> wildcardClass7 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7808");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("");
        int int21 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (short) 1);
        estoque0.removerProduto("hi!", (-98));
        int int29 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-3) + "'", int29 == (-3));
    }

    @Test
    public void test7809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7809");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (byte) 10);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (short) 0);
        java.lang.String str22 = produto21.getCodigo();
        double double23 = produto21.getPreco();
        estoque0.inserirProduto(produto21, (int) (short) 1);
        int int27 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test7810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7810");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (-33));
        java.lang.String str4 = produto3.getNome();
        produto3.setPreco((double) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7811");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto3.setCodigo("hi!");
        produto3.setNome("");
        java.lang.String str8 = produto3.getNome();
        java.lang.String str9 = produto3.getCodigo();
        produto3.setNome("");
        java.lang.String str12 = produto3.getNome();
        produto3.setNome("");
        java.lang.Class<?> wildcardClass15 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7812");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        produto21.setPreco((double) 10);
        produto21.setNome("hi!");
        java.lang.String str28 = produto21.getCodigo();
        double double29 = produto21.getPreco();
        produto21.setCodigo("hi!");
        estoque0.inserirProduto(produto21, (int) 'a');
        boolean boolean35 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Estoque estoque39 = new br.ufrn.imd.Estoque();
        boolean boolean41 = estoque39.produtoExiste("");
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto45.setNome("hi!");
        produto45.setPreco((double) 10);
        estoque39.inserirProduto(produto45, (int) (byte) -1);
        br.ufrn.imd.Produto produto55 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto55.setNome("hi!");
        produto55.setNome("");
        estoque39.inserirProduto(produto55, 0);
        int int63 = estoque39.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto67 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto67.setNome("hi!");
        produto67.setPreco((double) 10);
        java.lang.String str72 = produto67.getNome();
        double double73 = produto67.getPreco();
        java.lang.String str74 = produto67.getCodigo();
        estoque39.inserirProduto(produto67, (int) '#');
        produto67.setNome("");
        produto67.setNome("hi!");
        estoque0.inserirProduto(produto67, 70);
        estoque0.removerProduto("hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
    }

    @Test
    public void test7813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7813");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        produto3.setNome("");
        produto3.setPreco(0.0d);
        double double12 = produto3.getPreco();
        double double13 = produto3.getPreco();
        java.lang.Class<?> wildcardClass14 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7814");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setPreco((double) 10);
        java.lang.String str24 = produto19.getNome();
        double double25 = produto19.getPreco();
        java.lang.String str26 = produto19.getCodigo();
        produto19.setCodigo("hi!");
        java.lang.String str29 = produto19.getCodigo();
        produto19.setNome("");
        estoque0.inserirProduto(produto19, (int) (short) 10);
        boolean boolean35 = estoque0.produtoExiste("hi!");
        int int37 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("hi!", "hi!", 52.0d);
        produto41.setPreco((-3.0d));
        java.lang.String str44 = produto41.getNome();
        estoque0.inserirProduto(produto41, 0);
        estoque0.removerProduto("hi!", (-160));
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test7815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7815");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto28.setNome("");
        produto28.setNome("hi!");
        produto28.setNome("");
        estoque0.inserirProduto(produto28, 9);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "", (double) '#');
        estoque0.inserirProduto(produto40, (-1));
        int int44 = estoque0.consultarQuantidade("");
        int int46 = estoque0.consultarQuantidade("hi!");
        boolean boolean48 = estoque0.produtoExiste("");
        int int50 = estoque0.consultarQuantidade("");
        int int52 = estoque0.consultarQuantidade("hi!");
        boolean boolean54 = estoque0.produtoExiste("");
        int int56 = estoque0.consultarQuantidade("");
        int int58 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto62 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double63 = produto62.getPreco();
        java.lang.String str64 = produto62.getNome();
        produto62.setNome("hi!");
        java.lang.String str67 = produto62.getNome();
        produto62.setPreco(52.0d);
        produto62.setCodigo("");
        estoque0.inserirProduto(produto62, (-9));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 18 + "'", int46 == 18);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 18 + "'", int52 == 18);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 18 + "'", int58 == 18);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
    }

    @Test
    public void test7816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7816");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 100L);
        estoque0.inserirProduto(produto15, (int) (short) 10);
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double26 = produto25.getPreco();
        produto25.setNome("hi!");
        java.lang.String str29 = produto25.getNome();
        produto25.setCodigo("hi!");
        estoque0.inserirProduto(produto25, (int) (short) 100);
        estoque0.removerProduto("hi!", (int) (short) 10);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto40.setNome("hi!");
        produto40.setPreco((double) 10);
        java.lang.String str45 = produto40.getNome();
        double double46 = produto40.getPreco();
        java.lang.String str47 = produto40.getCodigo();
        produto40.setCodigo("hi!");
        produto40.setPreco((double) (-1.0f));
        produto40.setPreco(100.0d);
        estoque0.inserirProduto(produto40, (int) ' ');
        java.lang.String str56 = produto40.getNome();
        produto40.setPreco((double) 100);
        java.lang.String str59 = produto40.getNome();
        java.lang.String str60 = produto40.getCodigo();
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
    }

    @Test
    public void test7817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7817");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto28.setNome("");
        produto28.setNome("hi!");
        produto28.setNome("");
        estoque0.inserirProduto(produto28, 9);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "", (double) '#');
        estoque0.inserirProduto(produto40, (-1));
        int int44 = estoque0.consultarQuantidade("hi!");
        boolean boolean46 = estoque0.produtoExiste("hi!");
        int int48 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 18 + "'", int44 == 18);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 18 + "'", int48 == 18);
    }

    @Test
    public void test7818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7818");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto18.setNome("hi!");
        produto18.setPreco((double) 10);
        produto18.setNome("hi!");
        estoque0.inserirProduto(produto18, (-1));
        produto18.setNome("hi!");
        java.lang.String str29 = produto18.getCodigo();
        double double30 = produto18.getPreco();
        produto18.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    }

    @Test
    public void test7819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7819");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 1.0d);
        produto3.setCodigo("");
        produto3.setNome("");
        java.lang.String str8 = produto3.getCodigo();
        produto3.setPreco(0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test7820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7820");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 100.0f);
        java.lang.String str4 = produto3.getCodigo();
        double double5 = produto3.getPreco();
        produto3.setNome("");
        produto3.setNome("");
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test7821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7821");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setCodigo("");
        double double14 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setNome("");
        java.lang.String str19 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test7822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7822");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str23 = produto22.getCodigo();
        estoque0.inserirProduto(produto22, (int) 'a');
        boolean boolean27 = estoque0.produtoExiste("hi!");
        int int29 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        boolean boolean32 = estoque30.produtoExiste("");
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto36.setNome("hi!");
        produto36.setPreco((double) 10);
        estoque30.inserirProduto(produto36, (int) (byte) -1);
        boolean boolean44 = estoque30.produtoExiste("");
        int int46 = estoque30.consultarQuantidade("");
        boolean boolean48 = estoque30.produtoExiste("");
        estoque30.removerProduto("hi!", (int) ' ');
        br.ufrn.imd.Produto produto55 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double56 = produto55.getPreco();
        produto55.setNome("hi!");
        java.lang.String str59 = produto55.getNome();
        java.lang.String str60 = produto55.getCodigo();
        java.lang.String str61 = produto55.getNome();
        estoque30.inserirProduto(produto55, (int) ' ');
        estoque0.inserirProduto(produto55, 1);
        boolean boolean67 = estoque0.produtoExiste("");
        boolean boolean69 = estoque0.produtoExiste("hi!");
        boolean boolean71 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto75 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double76 = produto75.getPreco();
        produto75.setNome("hi!");
        java.lang.String str79 = produto75.getCodigo();
        produto75.setCodigo("hi!");
        double double82 = produto75.getPreco();
        produto75.setCodigo("hi!");
        java.lang.String str85 = produto75.getNome();
        produto75.setCodigo("");
        double double88 = produto75.getPreco();
        double double89 = produto75.getPreco();
        produto75.setCodigo("");
        estoque0.inserirProduto(produto75, (-196));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 100.0d + "'", double76 == 100.0d);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 100.0d + "'", double82 == 100.0d);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 100.0d + "'", double88 == 100.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 100.0d + "'", double89 == 100.0d);
    }

    @Test
    public void test7823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7823");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        produto21.setPreco((double) 10);
        produto21.setNome("hi!");
        java.lang.String str28 = produto21.getCodigo();
        double double29 = produto21.getPreco();
        produto21.setCodigo("hi!");
        estoque0.inserirProduto(produto21, (int) 'a');
        boolean boolean35 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) 'a');
        int int40 = estoque0.consultarQuantidade("hi!");
        boolean boolean42 = estoque0.produtoExiste("hi!");
        int int44 = estoque0.consultarQuantidade("");
        int int46 = estoque0.consultarQuantidade("hi!");
        int int48 = estoque0.consultarQuantidade("hi!");
        int int50 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-2) + "'", int46 == (-2));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-2) + "'", int48 == (-2));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-2) + "'", int50 == (-2));
    }

    @Test
    public void test7824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7824");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (short) 100);
        produto3.setCodigo("");
        produto3.setPreco(10.0d);
        produto3.setPreco(33.0d);
        produto3.setNome("hi!");
    }

    @Test
    public void test7825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7825");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setPreco((double) 10);
        java.lang.String str24 = produto19.getNome();
        double double25 = produto19.getPreco();
        java.lang.String str26 = produto19.getCodigo();
        produto19.setCodigo("hi!");
        java.lang.String str29 = produto19.getCodigo();
        produto19.setNome("");
        estoque0.inserirProduto(produto19, (int) (short) 10);
        boolean boolean35 = estoque0.produtoExiste("hi!");
        int int37 = estoque0.consultarQuantidade("hi!");
        int int39 = estoque0.consultarQuantidade("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test7826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7826");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str23 = produto22.getCodigo();
        estoque0.inserirProduto(produto22, (int) 'a');
        boolean boolean27 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("", 10);
        estoque0.removerProduto("", (-33));
        boolean boolean35 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("", "", (double) (short) -1);
        estoque0.inserirProduto(produto39, 99);
        estoque0.removerProduto("", (int) (short) 0);
        estoque0.removerProduto("hi!", 54);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test7827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7827");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("");
        int int18 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (short) 100);
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double26 = produto25.getPreco();
        produto25.setNome("hi!");
        java.lang.String str29 = produto25.getNome();
        produto25.setCodigo("hi!");
        double double32 = produto25.getPreco();
        estoque0.inserirProduto(produto25, 109);
        estoque0.removerProduto("hi!", 0);
        boolean boolean39 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (-10));
        estoque0.removerProduto("hi!", 96);
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("", "", (double) 'a');
        produto49.setNome("hi!");
        estoque0.inserirProduto(produto49, 36);
        java.lang.String str54 = produto49.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test7828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7828");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setPreco((double) 10);
        java.lang.String str24 = produto19.getNome();
        double double25 = produto19.getPreco();
        java.lang.String str26 = produto19.getCodigo();
        produto19.setCodigo("hi!");
        java.lang.String str29 = produto19.getCodigo();
        produto19.setNome("");
        estoque0.inserirProduto(produto19, (int) (short) 10);
        boolean boolean35 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto39.setPreco((double) '#');
        produto39.setPreco((double) 10);
        java.lang.String str44 = produto39.getNome();
        produto39.setPreco(0.0d);
        estoque0.inserirProduto(produto39, (int) (byte) -1);
        boolean boolean50 = estoque0.produtoExiste("hi!");
        boolean boolean52 = estoque0.produtoExiste("hi!");
        boolean boolean54 = estoque0.produtoExiste("");
        boolean boolean56 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto60 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double61 = produto60.getPreco();
        produto60.setNome("hi!");
        java.lang.String str64 = produto60.getNome();
        produto60.setCodigo("hi!");
        double double67 = produto60.getPreco();
        produto60.setPreco((double) 100.0f);
        java.lang.String str70 = produto60.getNome();
        java.lang.String str71 = produto60.getCodigo();
        estoque0.inserirProduto(produto60, (-132));
        java.lang.Class<?> wildcardClass74 = produto60.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 100.0d + "'", double61 == 100.0d);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 100.0d + "'", double67 == 100.0d);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test7829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7829");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto18.setNome("hi!");
        produto18.setPreco((double) 10);
        produto18.setNome("hi!");
        estoque0.inserirProduto(produto18, (-1));
        estoque0.removerProduto("hi!", (int) (byte) -1);
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        boolean boolean32 = estoque30.produtoExiste("");
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto36.setNome("hi!");
        produto36.setPreco((double) 10);
        estoque30.inserirProduto(produto36, (int) (byte) -1);
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto46.setNome("hi!");
        produto46.setNome("");
        estoque30.inserirProduto(produto46, 0);
        int int54 = estoque30.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto58.setNome("hi!");
        produto58.setPreco((double) 10);
        java.lang.String str63 = produto58.getNome();
        double double64 = produto58.getPreco();
        java.lang.String str65 = produto58.getCodigo();
        estoque30.inserirProduto(produto58, (int) '#');
        br.ufrn.imd.Produto produto71 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque30.inserirProduto(produto71, (-1));
        estoque0.inserirProduto(produto71, (int) (byte) 1);
        produto71.setCodigo("");
        java.lang.String str78 = produto71.getCodigo();
        double double79 = produto71.getPreco();
        produto71.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 10.0d + "'", double79 == 10.0d);
    }

    @Test
    public void test7830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7830");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 0);
        int int29 = estoque0.consultarQuantidade("hi!");
        boolean boolean31 = estoque0.produtoExiste("");
        int int33 = estoque0.consultarQuantidade("");
        int int35 = estoque0.consultarQuantidade("");
        int int37 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("hi!", "hi!", 8.0d);
        estoque0.inserirProduto(produto41, (-90));
        java.lang.String str44 = produto41.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test7831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7831");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 100L);
        estoque0.inserirProduto(produto15, (int) (short) 10);
        estoque0.removerProduto("hi!", (int) (byte) 0);
        boolean boolean26 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque27 = new br.ufrn.imd.Estoque();
        boolean boolean29 = estoque27.produtoExiste("");
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto33.setNome("hi!");
        produto33.setPreco((double) 10);
        estoque27.inserirProduto(produto33, (int) (byte) -1);
        br.ufrn.imd.Produto produto43 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto43.setNome("hi!");
        produto43.setNome("");
        estoque27.inserirProduto(produto43, 0);
        int int51 = estoque27.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto55 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto55.setNome("hi!");
        produto55.setPreco((double) 10);
        java.lang.String str60 = produto55.getNome();
        double double61 = produto55.getPreco();
        java.lang.String str62 = produto55.getCodigo();
        estoque27.inserirProduto(produto55, (int) '#');
        produto55.setNome("");
        java.lang.String str67 = produto55.getCodigo();
        double double68 = produto55.getPreco();
        estoque0.inserirProduto(produto55, 97);
        produto55.setCodigo("hi!");
        produto55.setNome("");
        produto55.setPreco((double) 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
    }

    @Test
    public void test7832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7832");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto23.setCodigo("hi!");
        estoque19.inserirProduto(produto23, (int) (byte) 0);
        estoque0.inserirProduto(produto23, 1);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto33.setPreco((double) '#');
        produto33.setPreco((double) 10);
        java.lang.String str38 = produto33.getNome();
        produto33.setPreco(0.0d);
        java.lang.String str41 = produto33.getNome();
        estoque0.inserirProduto(produto33, (int) (short) -1);
        boolean boolean45 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 0);
        estoque0.inserirProduto(produto49, (int) (byte) 1);
        estoque0.removerProduto("hi!", (int) (byte) 10);
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto58.setPreco((double) (byte) 100);
        java.lang.String str61 = produto58.getNome();
        java.lang.String str62 = produto58.getCodigo();
        estoque0.inserirProduto(produto58, (int) (byte) 1);
        boolean boolean66 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto70 = new br.ufrn.imd.Produto("", "hi!", (double) (byte) 1);
        produto70.setPreco((double) 0L);
        java.lang.String str73 = produto70.getNome();
        estoque0.inserirProduto(produto70, 134);
        java.lang.Class<?> wildcardClass76 = produto70.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test7833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7833");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        int int2 = estoque0.consultarQuantidade("");
        int int4 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7834");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (-70));
        produto3.setNome("hi!");
    }

    @Test
    public void test7835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7835");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-78));
        double double4 = produto3.getPreco();
        produto3.setCodigo("");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-78.0d) + "'", double4 == (-78.0d));
    }

    @Test
    public void test7836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7836");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto23.setNome("hi!");
        produto23.setPreco((double) 10);
        java.lang.String str28 = produto23.getNome();
        double double29 = produto23.getPreco();
        java.lang.String str30 = produto23.getCodigo();
        java.lang.String str31 = produto23.getNome();
        estoque0.inserirProduto(produto23, 68);
        java.lang.String str34 = produto23.getCodigo();
        produto23.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test7837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7837");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (byte) 1);
        produto3.setCodigo("hi!");
        produto3.setPreco(0.0d);
        double double8 = produto3.getPreco();
        produto3.setCodigo("hi!");
        produto3.setCodigo("");
        java.lang.String str13 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test7838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7838");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        estoque0.removerProduto("hi!", 100);
        boolean boolean22 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque23 = new br.ufrn.imd.Estoque();
        boolean boolean25 = estoque23.produtoExiste("");
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto29.setNome("hi!");
        produto29.setPreco((double) 10);
        estoque23.inserirProduto(produto29, (int) (byte) -1);
        estoque23.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto42 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto42.setNome("hi!");
        produto42.setPreco((double) 10);
        java.lang.String str47 = produto42.getNome();
        double double48 = produto42.getPreco();
        java.lang.String str49 = produto42.getCodigo();
        produto42.setCodigo("hi!");
        java.lang.String str52 = produto42.getCodigo();
        produto42.setNome("");
        estoque23.inserirProduto(produto42, (int) (short) 10);
        produto42.setCodigo("");
        produto42.setNome("");
        estoque0.inserirProduto(produto42, 0);
        int int64 = estoque0.consultarQuantidade("");
        boolean boolean66 = estoque0.produtoExiste("hi!");
        java.lang.Class<?> wildcardClass67 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test7839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7839");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto21.setPreco((double) '#');
        produto21.setNome("");
        estoque0.inserirProduto(produto21, (int) (byte) 1);
        estoque0.removerProduto("hi!", (int) (short) 1);
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto34.setPreco((double) '#');
        produto34.setCodigo("");
        estoque0.inserirProduto(produto34, 0);
        boolean boolean42 = estoque0.produtoExiste("hi!");
        int int44 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-2) + "'", int44 == (-2));
    }

    @Test
    public void test7840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7840");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        java.lang.String str33 = produto28.getNome();
        double double34 = produto28.getPreco();
        java.lang.String str35 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) '#');
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque0.inserirProduto(produto41, (-1));
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto47.setNome("hi!");
        produto47.setPreco((double) 10);
        java.lang.String str52 = produto47.getCodigo();
        java.lang.String str53 = produto47.getCodigo();
        estoque0.inserirProduto(produto47, 0);
        br.ufrn.imd.Produto produto59 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str60 = produto59.getCodigo();
        produto59.setNome("");
        double double63 = produto59.getPreco();
        estoque0.inserirProduto(produto59, 0);
        produto59.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
    }

    @Test
    public void test7841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7841");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        java.lang.String str23 = produto16.getCodigo();
        produto16.setNome("");
        produto16.setCodigo("hi!");
        java.lang.String str28 = produto16.getCodigo();
        java.lang.String str29 = produto16.getNome();
        java.lang.String str30 = produto16.getCodigo();
        java.lang.String str31 = produto16.getNome();
        double double32 = produto16.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
    }

    @Test
    public void test7842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7842");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        produto3.setNome("");
        java.lang.String str10 = produto3.getCodigo();
        produto3.setPreco(0.0d);
        java.lang.String str13 = produto3.getCodigo();
        java.lang.String str14 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7843");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 136);
        produto3.setPreco(104.0d);
    }

    @Test
    public void test7844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7844");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto20 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto20.setNome("hi!");
        produto20.setNome("");
        java.lang.String str25 = produto20.getNome();
        produto20.setNome("hi!");
        estoque0.inserirProduto(produto20, 9);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double34 = produto33.getPreco();
        produto33.setNome("hi!");
        java.lang.String str37 = produto33.getCodigo();
        produto33.setCodigo("hi!");
        double double40 = produto33.getPreco();
        produto33.setCodigo("hi!");
        java.lang.String str43 = produto33.getNome();
        java.lang.String str44 = produto33.getNome();
        produto33.setPreco((double) ' ');
        estoque0.inserirProduto(produto33, 97);
        estoque0.removerProduto("hi!", (-101));
        estoque0.removerProduto("hi!", 52);
        int int56 = estoque0.consultarQuantidade("hi!");
        int int58 = estoque0.consultarQuantidade("");
        int int60 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 105 + "'", int56 == 105);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test7845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7845");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        produto21.setPreco((double) 10);
        produto21.setNome("hi!");
        java.lang.String str28 = produto21.getCodigo();
        double double29 = produto21.getPreco();
        produto21.setCodigo("hi!");
        estoque0.inserirProduto(produto21, (int) 'a');
        boolean boolean35 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) 'a');
        int int40 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 33);
        int int45 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("hi!", "", 16.0d);
        estoque0.inserirProduto(produto49, 54);
        java.lang.Class<?> wildcardClass52 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test7846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7846");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        double double9 = produto3.getPreco();
        double double10 = produto3.getPreco();
        produto3.setCodigo("");
        produto3.setPreco(18.0d);
        java.lang.String str15 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test7847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7847");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        boolean boolean13 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto17 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double18 = produto17.getPreco();
        produto17.setNome("hi!");
        java.lang.String str21 = produto17.getCodigo();
        produto17.setCodigo("hi!");
        double double24 = produto17.getPreco();
        produto17.setCodigo("hi!");
        java.lang.String str27 = produto17.getNome();
        java.lang.String str28 = produto17.getNome();
        estoque0.inserirProduto(produto17, (-160));
        java.lang.String str31 = produto17.getCodigo();
        java.lang.String str32 = produto17.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test7848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7848");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        estoque0.removerProduto("hi!", (int) (short) 1);
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto18.setNome("hi!");
        produto18.setPreco((double) 10);
        java.lang.String str23 = produto18.getNome();
        double double24 = produto18.getPreco();
        java.lang.String str25 = produto18.getNome();
        produto18.setNome("");
        produto18.setNome("hi!");
        java.lang.String str30 = produto18.getCodigo();
        produto18.setPreco((double) (-2));
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) '#');
        java.lang.String str37 = produto18.getNome();
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test7849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7849");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        produto21.setPreco((double) 10);
        produto21.setNome("hi!");
        java.lang.String str28 = produto21.getCodigo();
        double double29 = produto21.getPreco();
        produto21.setCodigo("hi!");
        estoque0.inserirProduto(produto21, (int) 'a');
        boolean boolean35 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) 'a');
        int int40 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 33);
        int int45 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("hi!", "", 16.0d);
        estoque0.inserirProduto(produto49, 54);
        estoque0.removerProduto("hi!", 132);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test7850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7850");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        boolean boolean21 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str26 = produto25.getCodigo();
        produto25.setNome("");
        produto25.setPreco((double) 10);
        produto25.setCodigo("hi!");
        estoque0.inserirProduto(produto25, (int) (byte) 100);
        boolean boolean36 = estoque0.produtoExiste("");
        int int38 = estoque0.consultarQuantidade("hi!");
        int int40 = estoque0.consultarQuantidade("hi!");
        int int42 = estoque0.consultarQuantidade("");
        boolean boolean44 = estoque0.produtoExiste("");
        boolean boolean46 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 98 + "'", int38 == 98);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 98 + "'", int40 == 98);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test7851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7851");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        java.lang.String str6 = produto3.getCodigo();
        produto3.setNome("");
        java.lang.String str9 = produto3.getCodigo();
        double double10 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test7852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7852");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 51);
    }

    @Test
    public void test7853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7853");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 105);
    }

    @Test
    public void test7854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7854");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setPreco((double) 10);
        java.lang.String str24 = produto19.getNome();
        double double25 = produto19.getPreco();
        java.lang.String str26 = produto19.getCodigo();
        produto19.setCodigo("hi!");
        java.lang.String str29 = produto19.getCodigo();
        produto19.setNome("");
        estoque0.inserirProduto(produto19, (int) (short) 10);
        boolean boolean35 = estoque0.produtoExiste("hi!");
        int int37 = estoque0.consultarQuantidade("");
        boolean boolean39 = estoque0.produtoExiste("hi!");
        int int41 = estoque0.consultarQuantidade("hi!");
        int int43 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto47.setNome("hi!");
        produto47.setPreco((double) 10);
        java.lang.String str52 = produto47.getNome();
        double double53 = produto47.getPreco();
        java.lang.String str54 = produto47.getCodigo();
        produto47.setCodigo("hi!");
        java.lang.String str57 = produto47.getNome();
        produto47.setNome("hi!");
        estoque0.inserirProduto(produto47, 0);
        boolean boolean63 = estoque0.produtoExiste("hi!");
        boolean boolean65 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test7855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7855");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setCodigo("");
        java.lang.String str9 = produto3.getCodigo();
        java.lang.Class<?> wildcardClass10 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7856");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str23 = produto22.getCodigo();
        estoque0.inserirProduto(produto22, (int) 'a');
        boolean boolean27 = estoque0.produtoExiste("hi!");
        int int29 = estoque0.consultarQuantidade("");
        int int31 = estoque0.consultarQuantidade("hi!");
        boolean boolean33 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque34 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto38 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto38.setCodigo("hi!");
        estoque34.inserirProduto(produto38, (int) (byte) 0);
        estoque34.removerProduto("hi!", (int) (byte) 100);
        int int47 = estoque34.consultarQuantidade("");
        boolean boolean49 = estoque34.produtoExiste("");
        boolean boolean51 = estoque34.produtoExiste("hi!");
        estoque34.removerProduto("hi!", 10);
        boolean boolean56 = estoque34.produtoExiste("");
        br.ufrn.imd.Produto produto60 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double61 = produto60.getPreco();
        java.lang.String str62 = produto60.getCodigo();
        java.lang.String str63 = produto60.getNome();
        produto60.setCodigo("");
        double double66 = produto60.getPreco();
        produto60.setNome("hi!");
        java.lang.String str69 = produto60.getNome();
        estoque34.inserirProduto(produto60, (-90));
        int int73 = estoque34.consultarQuantidade("");
        br.ufrn.imd.Produto produto77 = new br.ufrn.imd.Produto("hi!", "", (-100.0d));
        estoque34.inserirProduto(produto77, (-160));
        produto77.setPreco(1.0d);
        estoque0.inserirProduto(produto77, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-98) + "'", int31 == (-98));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 100.0d + "'", double61 == 100.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 100.0d + "'", double66 == 100.0d);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-90) + "'", int73 == (-90));
    }

    @Test
    public void test7857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7857");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        java.lang.String str13 = produto3.getCodigo();
        java.lang.String str14 = produto3.getCodigo();
        java.lang.String str15 = produto3.getNome();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test7858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7858");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        produto16.setPreco((double) (-2));
        produto16.setNome("hi!");
        double double27 = produto16.getPreco();
        produto16.setPreco((double) (-90));
        java.lang.Class<?> wildcardClass30 = produto16.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-2.0d) + "'", double27 == (-2.0d));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7859");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 100L);
        estoque0.inserirProduto(produto15, (int) (short) 10);
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double26 = produto25.getPreco();
        produto25.setNome("hi!");
        java.lang.String str29 = produto25.getNome();
        produto25.setCodigo("hi!");
        estoque0.inserirProduto(produto25, (int) (short) 100);
        produto25.setNome("");
        produto25.setCodigo("");
        produto25.setCodigo("");
        produto25.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test7860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7860");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto20 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto20.setPreco((double) '#');
        estoque0.inserirProduto(produto20, (int) (short) 0);
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("hi!", "", (double) 100L);
        estoque0.inserirProduto(produto28, (int) (short) 0);
        double double31 = produto28.getPreco();
        produto28.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
    }

    @Test
    public void test7861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7861");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        boolean boolean25 = estoque0.produtoExiste("");
        int int27 = estoque0.consultarQuantidade("hi!");
        boolean boolean29 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "", (double) 0);
        estoque0.inserirProduto(produto33, 109);
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("hi!", "hi!", 1.0d);
        produto39.setCodigo("");
        produto39.setNome("");
        java.lang.String str44 = produto39.getCodigo();
        estoque0.inserirProduto(produto39, 30);
        estoque0.removerProduto("", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test7862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7862");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        produto3.setNome("");
        double double16 = produto3.getPreco();
        produto3.setPreco((double) (-1));
        java.lang.String str19 = produto3.getNome();
        double double20 = produto3.getPreco();
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test7863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7863");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        boolean boolean24 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7864");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        boolean boolean25 = estoque0.produtoExiste("");
        int int27 = estoque0.consultarQuantidade("hi!");
        boolean boolean29 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "", (double) 0);
        estoque0.inserirProduto(produto33, 109);
        int int37 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque38 = new br.ufrn.imd.Estoque();
        boolean boolean40 = estoque38.produtoExiste("");
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto44.setNome("hi!");
        produto44.setPreco((double) 10);
        estoque38.inserirProduto(produto44, (int) (byte) -1);
        estoque38.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto57 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto57.setNome("hi!");
        produto57.setPreco((double) 10);
        java.lang.String str62 = produto57.getNome();
        double double63 = produto57.getPreco();
        java.lang.String str64 = produto57.getCodigo();
        produto57.setCodigo("hi!");
        java.lang.String str67 = produto57.getCodigo();
        produto57.setNome("");
        estoque38.inserirProduto(produto57, (int) (short) 10);
        boolean boolean73 = estoque38.produtoExiste("hi!");
        int int75 = estoque38.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto79 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto79.setNome("hi!");
        produto79.setPreco((double) 10);
        java.lang.String str84 = produto79.getNome();
        produto79.setCodigo("hi!");
        estoque38.inserirProduto(produto79, (int) (short) 10);
        produto79.setNome("");
        estoque0.inserirProduto(produto79, (-78));
        estoque0.removerProduto("hi!", (-68));
        boolean boolean97 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 99 + "'", int37 == 99);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 9 + "'", int75 == 9);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test7865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7865");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto23.setCodigo("hi!");
        estoque19.inserirProduto(produto23, (int) (byte) 0);
        estoque0.inserirProduto(produto23, 1);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto33.setPreco((double) '#');
        produto33.setPreco((double) 10);
        java.lang.String str38 = produto33.getNome();
        produto33.setPreco(0.0d);
        java.lang.String str41 = produto33.getNome();
        estoque0.inserirProduto(produto33, (int) (short) -1);
        boolean boolean45 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double50 = produto49.getPreco();
        java.lang.String str51 = produto49.getNome();
        estoque0.inserirProduto(produto49, 0);
        int int55 = estoque0.consultarQuantidade("");
        int int57 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("", 28);
        estoque0.removerProduto("hi!", (-5));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test7866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7866");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 0.0f);
        produto3.setPreco(97.0d);
        produto3.setPreco(18.0d);
        java.lang.String str8 = produto3.getNome();
        produto3.setNome("");
        produto3.setCodigo("hi!");
        java.lang.String str13 = produto3.getCodigo();
        java.lang.String str14 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test7867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7867");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        java.lang.String str33 = produto28.getNome();
        double double34 = produto28.getPreco();
        java.lang.String str35 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) '#');
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque0.inserirProduto(produto41, (-1));
        java.lang.String str44 = produto41.getCodigo();
        produto41.setNome("");
        produto41.setCodigo("");
        produto41.setCodigo("");
        java.lang.String str51 = produto41.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test7868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7868");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getNome();
        produto3.setPreco((-33.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test7869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7869");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 'a');
        produto3.setNome("");
        produto3.setNome("");
        produto3.setPreco((double) (short) -1);
        double double18 = produto3.getPreco();
        java.lang.String str19 = produto3.getCodigo();
        double double20 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test7870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7870");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("");
        double double7 = produto3.getPreco();
        java.lang.String str8 = produto3.getCodigo();
        java.lang.String str9 = produto3.getNome();
        java.lang.String str10 = produto3.getNome();
        java.lang.String str11 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7871");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque0.inserirProduto(produto19, (int) (short) 100);
        int int23 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque24 = new br.ufrn.imd.Estoque();
        boolean boolean26 = estoque24.produtoExiste("");
        br.ufrn.imd.Produto produto30 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto30.setNome("hi!");
        produto30.setPreco((double) 10);
        estoque24.inserirProduto(produto30, (int) (byte) -1);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto40.setNome("hi!");
        produto40.setNome("");
        estoque24.inserirProduto(produto40, 0);
        int int48 = estoque24.consultarQuantidade("hi!");
        estoque24.removerProduto("hi!", 0);
        boolean boolean53 = estoque24.produtoExiste("hi!");
        br.ufrn.imd.Produto produto57 = new br.ufrn.imd.Produto("", "", (double) (short) 10);
        java.lang.String str58 = produto57.getNome();
        estoque24.inserirProduto(produto57, (-200));
        double double61 = produto57.getPreco();
        produto57.setPreco(0.0d);
        produto57.setNome("");
        estoque0.inserirProduto(produto57, 36);
        int int69 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 99 + "'", int69 == 99);
    }

    @Test
    public void test7872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7872");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 10);
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto34.setCodigo("hi!");
        estoque30.inserirProduto(produto34, (int) (byte) 0);
        estoque0.inserirProduto(produto34, (int) (byte) 10);
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("", "", (double) (byte) 0);
        estoque0.inserirProduto(produto44, 1);
        produto44.setNome("");
        produto44.setPreco((double) (byte) 1);
        java.lang.String str51 = produto44.getCodigo();
        double double52 = produto44.getPreco();
        java.lang.String str53 = produto44.getNome();
        produto44.setNome("hi!");
        produto44.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test7873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7873");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("");
        int int18 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (short) 100);
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double26 = produto25.getPreco();
        java.lang.String str27 = produto25.getCodigo();
        java.lang.String str28 = produto25.getNome();
        produto25.setCodigo("");
        double double31 = produto25.getPreco();
        java.lang.String str32 = produto25.getNome();
        estoque0.inserirProduto(produto25, (-1));
        java.lang.String str35 = produto25.getCodigo();
        java.lang.String str36 = produto25.getCodigo();
        double double37 = produto25.getPreco();
        produto25.setNome("hi!");
        produto25.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
    }

    @Test
    public void test7874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7874");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 10);
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto34.setCodigo("hi!");
        estoque30.inserirProduto(produto34, (int) (byte) 0);
        estoque0.inserirProduto(produto34, (int) (byte) 10);
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("", "", (double) (byte) 0);
        estoque0.inserirProduto(produto44, 1);
        produto44.setNome("");
        produto44.setPreco((double) (byte) 1);
        java.lang.String str51 = produto44.getCodigo();
        double double52 = produto44.getPreco();
        produto44.setPreco((double) (-90));
        java.lang.String str55 = produto44.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test7875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7875");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        int int6 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto10 = new br.ufrn.imd.Produto("hi!", "", (double) 9);
        estoque0.inserirProduto(produto10, (int) '#');
        boolean boolean14 = estoque0.produtoExiste("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("hi!", (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo hi! na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7876");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (byte) 1);
        produto3.setCodigo("hi!");
        produto3.setPreco(0.0d);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        double double12 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test7877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7877");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        produto3.setNome("");
        produto3.setPreco((double) (byte) 100);
        java.lang.String str15 = produto3.getNome();
        produto3.setCodigo("hi!");
        double double18 = produto3.getPreco();
        java.lang.String str19 = produto3.getNome();
        produto3.setNome("hi!");
        double double22 = produto3.getPreco();
        produto3.setPreco((double) (-100));
        java.lang.Class<?> wildcardClass25 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7878");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        produto3.setNome("");
        produto3.setPreco((double) (byte) 100);
        java.lang.String str15 = produto3.getNome();
        produto3.setCodigo("hi!");
        produto3.setPreco((double) (byte) 1);
        produto3.setPreco((-2.0d));
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test7879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7879");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque0.inserirProduto(produto19, (int) (short) 100);
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double26 = produto25.getPreco();
        java.lang.String str27 = produto25.getCodigo();
        java.lang.String str28 = produto25.getNome();
        produto25.setCodigo("");
        double double31 = produto25.getPreco();
        java.lang.String str32 = produto25.getCodigo();
        produto25.setNome("hi!");
        java.lang.String str35 = produto25.getNome();
        estoque0.inserirProduto(produto25, (-63));
        estoque0.removerProduto("hi!", 9);
        java.lang.Class<?> wildcardClass41 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test7880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7880");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        produto3.setNome("");
        produto3.setPreco((double) (byte) 100);
        java.lang.String str15 = produto3.getNome();
        produto3.setCodigo("hi!");
        produto3.setPreco((double) (byte) 1);
        produto3.setPreco((-2.0d));
        produto3.setPreco((double) (-63));
        java.lang.String str24 = produto3.getCodigo();
        java.lang.String str25 = produto3.getNome();
        java.lang.String str26 = produto3.getNome();
        produto3.setCodigo("hi!");
        produto3.setNome("hi!");
        java.lang.String str31 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test7881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7881");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        produto21.setPreco((double) 10);
        produto21.setNome("hi!");
        java.lang.String str28 = produto21.getCodigo();
        double double29 = produto21.getPreco();
        produto21.setCodigo("hi!");
        estoque0.inserirProduto(produto21, (int) 'a');
        java.lang.String str34 = produto21.getCodigo();
        java.lang.String str35 = produto21.getCodigo();
        java.lang.String str36 = produto21.getCodigo();
        produto21.setPreco(97.0d);
        java.lang.String str39 = produto21.getCodigo();
        java.lang.String str40 = produto21.getNome();
        double double41 = produto21.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 97.0d + "'", double41 == 97.0d);
    }

    @Test
    public void test7882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7882");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        int int16 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto20 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto20.setNome("hi!");
        java.lang.String str23 = produto20.getCodigo();
        estoque0.inserirProduto(produto20, (-1));
        boolean boolean27 = estoque0.produtoExiste("");
        int int29 = estoque0.consultarQuantidade("hi!");
        int int31 = estoque0.consultarQuantidade("");
        int int33 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto37.setPreco((double) '#');
        produto37.setPreco((double) 10);
        produto37.setNome("");
        java.lang.String str44 = produto37.getNome();
        double double45 = produto37.getPreco();
        estoque0.inserirProduto(produto37, 136);
        java.lang.String str48 = produto37.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2) + "'", int29 == (-2));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
    }

    @Test
    public void test7883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7883");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        java.lang.String str33 = produto28.getNome();
        double double34 = produto28.getPreco();
        java.lang.String str35 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) '#');
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque0.inserirProduto(produto41, (-1));
        int int45 = estoque0.consultarQuantidade("");
        boolean boolean47 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (-2));
        int int52 = estoque0.consultarQuantidade("");
        java.lang.Class<?> wildcardClass53 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test7884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7884");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 36);
        produto3.setNome("hi!");
        produto3.setCodigo("");
        java.lang.String str8 = produto3.getNome();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test7885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7885");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        java.lang.String str33 = produto28.getNome();
        double double34 = produto28.getPreco();
        java.lang.String str35 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) '#');
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque0.inserirProduto(produto41, (-1));
        br.ufrn.imd.Estoque estoque44 = new br.ufrn.imd.Estoque();
        boolean boolean46 = estoque44.produtoExiste("");
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto50.setNome("hi!");
        produto50.setPreco((double) 10);
        estoque44.inserirProduto(produto50, (int) (byte) -1);
        int int58 = estoque44.consultarQuantidade("");
        estoque44.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto65.setPreco((double) '#');
        produto65.setNome("");
        estoque44.inserirProduto(produto65, (int) (byte) 1);
        estoque0.inserirProduto(produto65, (int) (short) 1);
        boolean boolean75 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto79 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto79.setNome("hi!");
        produto79.setPreco((double) 10);
        java.lang.String str84 = produto79.getNome();
        double double85 = produto79.getPreco();
        java.lang.String str86 = produto79.getCodigo();
        java.lang.String str87 = produto79.getNome();
        estoque0.inserirProduto(produto79, 0);
        double double90 = produto79.getPreco();
        produto79.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 10.0d + "'", double85 == 10.0d);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 10.0d + "'", double90 == 10.0d);
    }

    @Test
    public void test7886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7886");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        int int25 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double30 = produto29.getPreco();
        java.lang.String str31 = produto29.getCodigo();
        java.lang.String str32 = produto29.getNome();
        produto29.setCodigo("");
        estoque0.inserirProduto(produto29, (int) (short) 0);
        estoque0.removerProduto("hi!", (-98));
        boolean boolean41 = estoque0.produtoExiste("hi!");
        boolean boolean43 = estoque0.produtoExiste("");
        int int45 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test7887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7887");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 10);
        int int31 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto35 = new br.ufrn.imd.Produto("", "hi!", (double) (short) 100);
        produto35.setCodigo("");
        estoque0.inserirProduto(produto35, (int) '#');
        estoque0.removerProduto("", 0);
        int int44 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test7888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7888");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 100L);
        produto3.setCodigo("hi!");
        produto3.setNome("");
        double double8 = produto3.getPreco();
        double double9 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test7889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7889");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto23.setNome("hi!");
        produto23.setPreco((double) 10);
        java.lang.String str28 = produto23.getNome();
        double double29 = produto23.getPreco();
        java.lang.String str30 = produto23.getCodigo();
        produto23.setCodigo("hi!");
        java.lang.String str33 = produto23.getCodigo();
        estoque0.inserirProduto(produto23, 0);
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("", "", (double) 0L);
        java.lang.String str40 = produto39.getNome();
        estoque0.inserirProduto(produto39, (int) (short) 0);
        int int44 = estoque0.consultarQuantidade("");
        boolean boolean46 = estoque0.produtoExiste("hi!");
        int int48 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test7890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7890");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        boolean boolean19 = estoque0.produtoExiste("");
        int int21 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", (-167));
        br.ufrn.imd.Estoque estoque25 = new br.ufrn.imd.Estoque();
        boolean boolean27 = estoque25.produtoExiste("");
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto31.setNome("hi!");
        produto31.setPreco((double) 10);
        estoque25.inserirProduto(produto31, (int) (byte) -1);
        int int39 = estoque25.consultarQuantidade("");
        boolean boolean41 = estoque25.produtoExiste("");
        boolean boolean43 = estoque25.produtoExiste("");
        br.ufrn.imd.Estoque estoque44 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto48 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto48.setCodigo("hi!");
        estoque44.inserirProduto(produto48, (int) (byte) 0);
        estoque25.inserirProduto(produto48, 1);
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto58.setPreco((double) '#');
        produto58.setPreco((double) 10);
        java.lang.String str63 = produto58.getNome();
        produto58.setPreco(0.0d);
        java.lang.String str66 = produto58.getNome();
        estoque25.inserirProduto(produto58, (int) (short) -1);
        boolean boolean70 = estoque25.produtoExiste("");
        br.ufrn.imd.Produto produto74 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double75 = produto74.getPreco();
        java.lang.String str76 = produto74.getNome();
        estoque25.inserirProduto(produto74, 0);
        int int80 = estoque25.consultarQuantidade("");
        boolean boolean82 = estoque25.produtoExiste("hi!");
        br.ufrn.imd.Produto produto86 = new br.ufrn.imd.Produto("hi!", "", (double) (short) 0);
        estoque25.inserirProduto(produto86, (int) (byte) 10);
        produto86.setPreco((double) 68);
        double double91 = produto86.getPreco();
        estoque0.inserirProduto(produto86, (-20));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 10.0d + "'", double75 == 10.0d);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 68.0d + "'", double91 == 68.0d);
    }

    @Test
    public void test7891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7891");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        java.lang.String str33 = produto28.getNome();
        double double34 = produto28.getPreco();
        java.lang.String str35 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) '#');
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque0.inserirProduto(produto41, (-1));
        produto41.setCodigo("hi!");
        produto41.setCodigo("hi!");
        produto41.setNome("");
        produto41.setNome("hi!");
        produto41.setPreco((double) (-29));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test7892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7892");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("");
        java.lang.String str6 = produto3.getNome();
        produto3.setNome("");
        produto3.setCodigo("");
        produto3.setCodigo("hi!");
        produto3.setNome("");
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test7893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7893");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        produto21.setPreco((double) 10);
        produto21.setNome("hi!");
        java.lang.String str28 = produto21.getCodigo();
        double double29 = produto21.getPreco();
        produto21.setCodigo("hi!");
        estoque0.inserirProduto(produto21, (int) 'a');
        boolean boolean35 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) 'a');
        int int40 = estoque0.consultarQuantidade("hi!");
        int int42 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto46.setNome("hi!");
        produto46.setPreco((double) 10);
        java.lang.String str51 = produto46.getNome();
        double double52 = produto46.getPreco();
        produto46.setNome("");
        double double55 = produto46.getPreco();
        produto46.setCodigo("");
        estoque0.inserirProduto(produto46, 10);
        java.lang.String str60 = produto46.getCodigo();
        produto46.setCodigo("");
        produto46.setPreco((double) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-2) + "'", int42 == (-2));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test7894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7894");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto21.setPreco((double) '#');
        produto21.setNome("");
        estoque0.inserirProduto(produto21, (int) (byte) 1);
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double32 = produto31.getPreco();
        produto31.setNome("hi!");
        java.lang.String str35 = produto31.getCodigo();
        produto31.setCodigo("hi!");
        double double38 = produto31.getPreco();
        produto31.setCodigo("hi!");
        java.lang.String str41 = produto31.getNome();
        produto31.setCodigo("");
        estoque0.inserirProduto(produto31, 97);
        java.lang.String str46 = produto31.getCodigo();
        produto31.setCodigo("hi!");
        double double49 = produto31.getPreco();
        produto31.setNome("");
        java.lang.String str52 = produto31.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test7895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7895");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto20 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto20.setNome("hi!");
        produto20.setNome("");
        java.lang.String str25 = produto20.getNome();
        produto20.setNome("hi!");
        estoque0.inserirProduto(produto20, 9);
        estoque0.removerProduto("hi!", (int) (short) 10);
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "", 1.0d);
        java.lang.String str37 = produto36.getNome();
        estoque0.inserirProduto(produto36, (int) '4');
        estoque0.removerProduto("hi!", (-101));
        boolean boolean44 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto48 = new br.ufrn.imd.Produto("hi!", "hi!", 35.0d);
        estoque0.inserirProduto(produto48, 18);
        produto48.setPreco((double) (-113));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test7896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7896");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto28.setNome("");
        produto28.setNome("hi!");
        produto28.setNome("");
        estoque0.inserirProduto(produto28, 9);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "", (double) '#');
        estoque0.inserirProduto(produto40, (-1));
        int int44 = estoque0.consultarQuantidade("");
        int int46 = estoque0.consultarQuantidade("hi!");
        boolean boolean48 = estoque0.produtoExiste("");
        boolean boolean50 = estoque0.produtoExiste("");
        estoque0.removerProduto("", 1);
        boolean boolean55 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque56 = new br.ufrn.imd.Estoque();
        boolean boolean58 = estoque56.produtoExiste("");
        br.ufrn.imd.Produto produto62 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto62.setNome("hi!");
        produto62.setPreco((double) 10);
        estoque56.inserirProduto(produto62, (int) (byte) -1);
        java.lang.String str69 = produto62.getCodigo();
        java.lang.String str70 = produto62.getNome();
        produto62.setCodigo("hi!");
        java.lang.String str73 = produto62.getCodigo();
        estoque0.inserirProduto(produto62, 32);
        int int77 = estoque0.consultarQuantidade("hi!");
        int int79 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 18 + "'", int46 == 18);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 50 + "'", int77 == 50);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-2) + "'", int79 == (-2));
    }

    @Test
    public void test7897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7897");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 109);
        java.lang.String str4 = produto3.getCodigo();
        java.lang.String str5 = produto3.getCodigo();
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test7898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7898");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        produto28.setNome("hi!");
        java.lang.String str35 = produto28.getCodigo();
        double double36 = produto28.getPreco();
        java.lang.String str37 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, 10);
        boolean boolean41 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 1);
        produto45.setNome("");
        double double48 = produto45.getPreco();
        estoque0.inserirProduto(produto45, (int) 'a');
        estoque0.removerProduto("hi!", (-2));
        java.lang.Class<?> wildcardClass54 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test7899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7899");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str23 = produto22.getCodigo();
        estoque0.inserirProduto(produto22, (int) 'a');
        boolean boolean27 = estoque0.produtoExiste("hi!");
        int int29 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        boolean boolean32 = estoque30.produtoExiste("");
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto36.setNome("hi!");
        produto36.setPreco((double) 10);
        estoque30.inserirProduto(produto36, (int) (byte) -1);
        boolean boolean44 = estoque30.produtoExiste("");
        int int46 = estoque30.consultarQuantidade("");
        boolean boolean48 = estoque30.produtoExiste("");
        estoque30.removerProduto("hi!", (int) ' ');
        br.ufrn.imd.Produto produto55 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double56 = produto55.getPreco();
        produto55.setNome("hi!");
        java.lang.String str59 = produto55.getNome();
        java.lang.String str60 = produto55.getCodigo();
        java.lang.String str61 = produto55.getNome();
        estoque30.inserirProduto(produto55, (int) ' ');
        estoque0.inserirProduto(produto55, 1);
        boolean boolean67 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", 70);
        estoque0.removerProduto("hi!", (-12));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test7900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7900");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 86);
        java.lang.String str4 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test7901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7901");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        boolean boolean25 = estoque0.produtoExiste("");
        int int27 = estoque0.consultarQuantidade("hi!");
        boolean boolean29 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        boolean boolean32 = estoque30.produtoExiste("");
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto36.setNome("hi!");
        produto36.setPreco((double) 10);
        estoque30.inserirProduto(produto36, (int) (byte) -1);
        boolean boolean44 = estoque30.produtoExiste("hi!");
        br.ufrn.imd.Produto produto48 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto48.setPreco((double) '#');
        produto48.setPreco((double) 10);
        java.lang.String str53 = produto48.getNome();
        produto48.setPreco(0.0d);
        estoque30.inserirProduto(produto48, (-2));
        produto48.setCodigo("");
        estoque0.inserirProduto(produto48, (-11));
        boolean boolean63 = estoque0.produtoExiste("hi!");
        boolean boolean65 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test7902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7902");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", 1);
        boolean boolean23 = estoque0.produtoExiste("hi!");
        int int25 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque26 = new br.ufrn.imd.Estoque();
        boolean boolean28 = estoque26.produtoExiste("");
        br.ufrn.imd.Produto produto32 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto32.setNome("hi!");
        produto32.setPreco((double) 10);
        estoque26.inserirProduto(produto32, (int) (byte) -1);
        br.ufrn.imd.Produto produto42 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto42.setNome("hi!");
        produto42.setNome("");
        estoque26.inserirProduto(produto42, 0);
        java.lang.String str49 = produto42.getCodigo();
        double double50 = produto42.getPreco();
        double double51 = produto42.getPreco();
        produto42.setPreco((double) 1L);
        estoque0.inserirProduto(produto42, (int) ' ');
        produto42.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2) + "'", int25 == (-2));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
    }

    @Test
    public void test7903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7903");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str23 = produto22.getCodigo();
        estoque0.inserirProduto(produto22, (int) 'a');
        boolean boolean27 = estoque0.produtoExiste("hi!");
        int int29 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        boolean boolean32 = estoque30.produtoExiste("");
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto36.setNome("hi!");
        produto36.setPreco((double) 10);
        estoque30.inserirProduto(produto36, (int) (byte) -1);
        boolean boolean44 = estoque30.produtoExiste("");
        int int46 = estoque30.consultarQuantidade("");
        boolean boolean48 = estoque30.produtoExiste("");
        estoque30.removerProduto("hi!", (int) ' ');
        br.ufrn.imd.Produto produto55 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double56 = produto55.getPreco();
        produto55.setNome("hi!");
        java.lang.String str59 = produto55.getNome();
        java.lang.String str60 = produto55.getCodigo();
        java.lang.String str61 = produto55.getNome();
        estoque30.inserirProduto(produto55, (int) ' ');
        estoque0.inserirProduto(produto55, 1);
        boolean boolean67 = estoque0.produtoExiste("");
        boolean boolean69 = estoque0.produtoExiste("");
        boolean boolean71 = estoque0.produtoExiste("");
        boolean boolean73 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test7904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7904");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 0.0f);
        java.lang.Class<?> wildcardClass4 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test7905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7905");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto23.setCodigo("hi!");
        estoque19.inserirProduto(produto23, (int) (byte) 0);
        estoque0.inserirProduto(produto23, 1);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto33.setPreco((double) '#');
        produto33.setPreco((double) 10);
        java.lang.String str38 = produto33.getNome();
        produto33.setPreco(0.0d);
        java.lang.String str41 = produto33.getNome();
        estoque0.inserirProduto(produto33, (int) (short) -1);
        boolean boolean45 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 0);
        estoque0.inserirProduto(produto49, (int) (byte) 1);
        br.ufrn.imd.Produto produto55 = new br.ufrn.imd.Produto("hi!", "", 0.0d);
        estoque0.inserirProduto(produto55, (int) (byte) 0);
        int int59 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("", (int) '#');
        br.ufrn.imd.Produto produto66 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto66.setNome("hi!");
        produto66.setNome("");
        produto66.setPreco(1.0d);
        java.lang.String str73 = produto66.getCodigo();
        double double74 = produto66.getPreco();
        produto66.setNome("");
        produto66.setNome("");
        double double79 = produto66.getPreco();
        produto66.setPreco((double) (-1));
        produto66.setNome("hi!");
        estoque0.inserirProduto(produto66, (int) (short) 1);
        produto66.setCodigo("hi!");
        produto66.setPreco(10.0d);
        java.lang.String str90 = produto66.getNome();
        double double91 = produto66.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 1.0d + "'", double79 == 1.0d);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 10.0d + "'", double91 == 10.0d);
    }

    @Test
    public void test7906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7906");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        java.lang.String str4 = produto3.getCodigo();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getCodigo();
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test7907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7907");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto28.setNome("");
        produto28.setNome("hi!");
        produto28.setNome("");
        estoque0.inserirProduto(produto28, 9);
        java.lang.String str37 = produto28.getNome();
        double double38 = produto28.getPreco();
        produto28.setPreco(32.0d);
        produto28.setPreco((double) 166);
        produto28.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
    }

    @Test
    public void test7908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7908");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto18.setNome("hi!");
        produto18.setPreco((double) 10);
        produto18.setNome("hi!");
        estoque0.inserirProduto(produto18, (-1));
        estoque0.removerProduto("hi!", (int) (byte) -1);
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        boolean boolean32 = estoque30.produtoExiste("");
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto36.setNome("hi!");
        produto36.setPreco((double) 10);
        estoque30.inserirProduto(produto36, (int) (byte) -1);
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto46.setNome("hi!");
        produto46.setNome("");
        estoque30.inserirProduto(produto46, 0);
        int int54 = estoque30.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto58.setNome("hi!");
        produto58.setPreco((double) 10);
        java.lang.String str63 = produto58.getNome();
        double double64 = produto58.getPreco();
        java.lang.String str65 = produto58.getCodigo();
        estoque30.inserirProduto(produto58, (int) '#');
        br.ufrn.imd.Produto produto71 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque30.inserirProduto(produto71, (-1));
        estoque0.inserirProduto(produto71, (int) (byte) 1);
        estoque0.removerProduto("hi!", (int) (byte) 0);
        br.ufrn.imd.Produto produto82 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        double double83 = produto82.getPreco();
        estoque0.inserirProduto(produto82, (int) (byte) 100);
        java.lang.String str86 = produto82.getNome();
        produto82.setCodigo("");
        java.lang.String str89 = produto82.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.0d + "'", double83 == 10.0d);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test7909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7909");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        int int21 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto25.setNome("hi!");
        java.lang.String str28 = produto25.getCodigo();
        estoque0.inserirProduto(produto25, 18);
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-1L));
        produto34.setCodigo("hi!");
        estoque0.inserirProduto(produto34, (int) (short) 10);
        boolean boolean40 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test7910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7910");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        br.ufrn.imd.Produto produto12 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto12.setNome("hi!");
        produto12.setNome("");
        produto12.setPreco(1.0d);
        estoque0.inserirProduto(produto12, 100);
        produto12.setPreco((double) 0);
        java.lang.String str23 = produto12.getNome();
        java.lang.String str24 = produto12.getNome();
        double double25 = produto12.getPreco();
        double double26 = produto12.getPreco();
        java.lang.String str27 = produto12.getNome();
        produto12.setCodigo("");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test7911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7911");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        produto3.setPreco(10.0d);
        produto3.setCodigo("hi!");
        produto3.setPreco(97.0d);
        produto3.setCodigo("hi!");
        produto3.setPreco((double) (byte) 1);
        java.lang.String str24 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test7912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7912");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 10);
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto34.setCodigo("hi!");
        estoque30.inserirProduto(produto34, (int) (byte) 0);
        estoque0.inserirProduto(produto34, (int) (byte) 10);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-1.0f));
        estoque0.inserirProduto(produto47, 8);
        java.lang.String str50 = produto47.getNome();
        double double51 = produto47.getPreco();
        produto47.setPreco((double) (-33));
        java.lang.String str54 = produto47.getNome();
        produto47.setPreco((double) (-56));
        double double57 = produto47.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-56.0d) + "'", double57 == (-56.0d));
    }

    @Test
    public void test7913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7913");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 116);
    }

    @Test
    public void test7914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7914");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-113));
    }

    @Test
    public void test7915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7915");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque18 = new br.ufrn.imd.Estoque();
        boolean boolean20 = estoque18.produtoExiste("");
        br.ufrn.imd.Produto produto24 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto24.setNome("hi!");
        produto24.setPreco((double) 10);
        estoque18.inserirProduto(produto24, (int) (byte) -1);
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto34.setNome("hi!");
        produto34.setNome("");
        estoque18.inserirProduto(produto34, 0);
        int int42 = estoque18.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto46.setNome("hi!");
        produto46.setPreco((double) 10);
        java.lang.String str51 = produto46.getNome();
        double double52 = produto46.getPreco();
        java.lang.String str53 = produto46.getCodigo();
        estoque18.inserirProduto(produto46, (int) '#');
        estoque0.inserirProduto(produto46, (int) (byte) -1);
        int int59 = estoque0.consultarQuantidade("hi!");
        int int61 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", (int) (byte) 1);
        br.ufrn.imd.Produto produto68 = new br.ufrn.imd.Produto("hi!", "", (double) (byte) 0);
        double double69 = produto68.getPreco();
        estoque0.inserirProduto(produto68, 33);
        br.ufrn.imd.Produto produto75 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto75.setNome("hi!");
        produto75.setPreco((double) 10);
        java.lang.String str80 = produto75.getNome();
        double double81 = produto75.getPreco();
        java.lang.String str82 = produto75.getNome();
        produto75.setNome("");
        produto75.setPreco((double) (byte) 100);
        java.lang.String str87 = produto75.getNome();
        produto75.setCodigo("hi!");
        double double90 = produto75.getPreco();
        produto75.setNome("");
        produto75.setNome("hi!");
        produto75.setNome("");
        double double97 = produto75.getPreco();
        estoque0.inserirProduto(produto75, 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-2) + "'", int59 == (-2));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-2) + "'", int61 == (-2));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 100.0d + "'", double90 == 100.0d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 100.0d + "'", double97 == 100.0d);
    }

    @Test
    public void test7916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7916");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        boolean boolean13 = estoque0.produtoExiste("hi!");
        boolean boolean15 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setPreco((double) 10);
        java.lang.String str24 = produto19.getNome();
        double double25 = produto19.getPreco();
        java.lang.String str26 = produto19.getCodigo();
        java.lang.String str27 = produto19.getCodigo();
        produto19.setCodigo("hi!");
        double double30 = produto19.getPreco();
        double double31 = produto19.getPreco();
        double double32 = produto19.getPreco();
        estoque0.inserirProduto(produto19, 99);
        produto19.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
    }

    @Test
    public void test7917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7917");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        double double14 = produto3.getPreco();
        produto3.setPreco((double) (short) 0);
        double double17 = produto3.getPreco();
        double double18 = produto3.getPreco();
        double double19 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setPreco(33.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test7918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7918");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 99.0d);
    }

    @Test
    public void test7919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7919");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        java.lang.String str23 = produto16.getCodigo();
        double double24 = produto16.getPreco();
        double double25 = produto16.getPreco();
        java.lang.String str26 = produto16.getNome();
        produto16.setCodigo("");
        produto16.setCodigo("hi!");
        java.lang.String str31 = produto16.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test7920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7920");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (short) 10);
        java.lang.String str4 = produto3.getCodigo();
        java.lang.String str5 = produto3.getNome();
        produto3.setNome("");
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test7921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7921");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        produto3.setPreco((double) (-1.0f));
        java.lang.String str15 = produto3.getNome();
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test7922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7922");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto21.setPreco((double) '#');
        produto21.setNome("");
        estoque0.inserirProduto(produto21, (int) (byte) 1);
        estoque0.removerProduto("hi!", (int) (short) 1);
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto34.setPreco((double) '#');
        produto34.setPreco((double) 10);
        estoque0.inserirProduto(produto34, 10);
        java.lang.String str41 = produto34.getCodigo();
        produto34.setCodigo("");
        java.lang.String str44 = produto34.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test7923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7923");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto21.setPreco((double) '#');
        produto21.setNome("");
        estoque0.inserirProduto(produto21, (int) (byte) 1);
        estoque0.removerProduto("hi!", (int) (short) 1);
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto34.setPreco((double) '#');
        produto34.setCodigo("");
        estoque0.inserirProduto(produto34, 0);
        boolean boolean42 = estoque0.produtoExiste("hi!");
        int int44 = estoque0.consultarQuantidade("");
        int int46 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-2) + "'", int46 == (-2));
    }

    @Test
    public void test7924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7924");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 100L);
        estoque0.inserirProduto(produto15, (int) (short) 10);
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double26 = produto25.getPreco();
        produto25.setNome("hi!");
        java.lang.String str29 = produto25.getNome();
        produto25.setCodigo("hi!");
        estoque0.inserirProduto(produto25, (int) (short) 100);
        estoque0.removerProduto("hi!", (int) (short) 10);
        int int38 = estoque0.consultarQuantidade("hi!");
        boolean boolean40 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto44.setPreco((double) '#');
        produto44.setPreco((double) 10);
        produto44.setNome("");
        java.lang.String str51 = produto44.getCodigo();
        produto44.setPreco(0.0d);
        double double54 = produto44.getPreco();
        produto44.setCodigo("");
        produto44.setNome("");
        produto44.setNome("");
        estoque0.inserirProduto(produto44, (int) '4');
        int int64 = estoque0.consultarQuantidade("hi!");
        int int66 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
    }

    @Test
    public void test7925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7925");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (-11));
        produto3.setCodigo("hi!");
        double double6 = produto3.getPreco();
        java.lang.String str7 = produto3.getNome();
        java.lang.String str8 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test7926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7926");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 100L);
        estoque0.inserirProduto(produto15, (int) (short) 10);
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double26 = produto25.getPreco();
        produto25.setNome("hi!");
        java.lang.String str29 = produto25.getNome();
        produto25.setCodigo("hi!");
        estoque0.inserirProduto(produto25, (int) (short) 100);
        estoque0.removerProduto("hi!", (int) (short) 10);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto40.setNome("hi!");
        produto40.setPreco((double) 10);
        java.lang.String str45 = produto40.getNome();
        double double46 = produto40.getPreco();
        java.lang.String str47 = produto40.getCodigo();
        produto40.setCodigo("hi!");
        produto40.setPreco((double) (-1.0f));
        produto40.setPreco(100.0d);
        estoque0.inserirProduto(produto40, (int) ' ');
        java.lang.String str56 = produto40.getNome();
        produto40.setPreco((double) 100);
        java.lang.String str59 = produto40.getNome();
        produto40.setPreco((double) (-25));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
    }

    @Test
    public void test7927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7927");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", 36.0d);
        produto3.setPreco(34.0d);
    }

    @Test
    public void test7928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7928");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("");
        int int18 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (short) 100);
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double26 = produto25.getPreco();
        produto25.setNome("hi!");
        java.lang.String str29 = produto25.getNome();
        produto25.setCodigo("hi!");
        double double32 = produto25.getPreco();
        estoque0.inserirProduto(produto25, 109);
        estoque0.removerProduto("hi!", 0);
        int int39 = estoque0.consultarQuantidade("hi!");
        int int41 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 8 + "'", int39 == 8);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
    }

    @Test
    public void test7929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7929");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        java.lang.String str13 = produto3.getCodigo();
        java.lang.String str14 = produto3.getCodigo();
        java.lang.String str15 = produto3.getNome();
        java.lang.String str16 = produto3.getCodigo();
        produto3.setPreco((double) (-2));
        produto3.setPreco((-98.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7930");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto23.setNome("hi!");
        produto23.setPreco((double) 10);
        java.lang.String str28 = produto23.getCodigo();
        double double29 = produto23.getPreco();
        produto23.setPreco((double) 1.0f);
        estoque0.inserirProduto(produto23, (int) (short) 0);
        java.lang.String str34 = produto23.getCodigo();
        java.lang.String str35 = produto23.getCodigo();
        produto23.setNome("");
        produto23.setNome("");
        produto23.setCodigo("hi!");
        double double42 = produto23.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
    }

    @Test
    public void test7931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7931");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        java.lang.String str23 = produto16.getCodigo();
        double double24 = produto16.getPreco();
        java.lang.String str25 = produto16.getCodigo();
        produto16.setNome("");
        produto16.setNome("");
        java.lang.String str30 = produto16.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test7932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7932");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque0.inserirProduto(produto19, (int) (short) 100);
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double26 = produto25.getPreco();
        java.lang.String str27 = produto25.getCodigo();
        java.lang.String str28 = produto25.getNome();
        produto25.setCodigo("");
        double double31 = produto25.getPreco();
        java.lang.String str32 = produto25.getCodigo();
        produto25.setNome("hi!");
        java.lang.String str35 = produto25.getNome();
        estoque0.inserirProduto(produto25, (-63));
        estoque0.removerProduto("hi!", 9);
        boolean boolean42 = estoque0.produtoExiste("");
        int int44 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto48 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto48.setNome("hi!");
        produto48.setPreco((double) 10);
        produto48.setNome("hi!");
        java.lang.String str55 = produto48.getCodigo();
        double double56 = produto48.getPreco();
        java.lang.String str57 = produto48.getCodigo();
        produto48.setNome("hi!");
        produto48.setNome("hi!");
        produto48.setNome("hi!");
        java.lang.String str64 = produto48.getCodigo();
        double double65 = produto48.getPreco();
        produto48.setNome("hi!");
        estoque0.inserirProduto(produto48, (-100));
        br.ufrn.imd.Produto produto73 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str74 = produto73.getCodigo();
        produto73.setNome("");
        double double77 = produto73.getPreco();
        double double78 = produto73.getPreco();
        java.lang.String str79 = produto73.getCodigo();
        produto73.setNome("");
        estoque0.inserirProduto(produto73, (-101));
        double double84 = produto73.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-63) + "'", int44 == (-63));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 10.0d + "'", double84 == 10.0d);
    }

    @Test
    public void test7933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7933");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        boolean boolean25 = estoque0.produtoExiste("");
        boolean boolean27 = estoque0.produtoExiste("hi!");
        boolean boolean29 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (int) 'a');
        estoque0.removerProduto("hi!", (-2));
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        double double40 = produto39.getPreco();
        estoque0.inserirProduto(produto39, 0);
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str47 = produto46.getCodigo();
        produto46.setNome("");
        java.lang.String str50 = produto46.getCodigo();
        estoque0.inserirProduto(produto46, (int) (short) 100);
        boolean boolean54 = estoque0.produtoExiste("");
        boolean boolean56 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Estoque estoque57 = new br.ufrn.imd.Estoque();
        boolean boolean59 = estoque57.produtoExiste("");
        br.ufrn.imd.Produto produto63 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto63.setNome("hi!");
        produto63.setPreco((double) 10);
        estoque57.inserirProduto(produto63, (int) (byte) -1);
        estoque57.removerProduto("hi!", 0);
        estoque57.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto79 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str80 = produto79.getCodigo();
        estoque57.inserirProduto(produto79, (int) 'a');
        estoque0.inserirProduto(produto79, (int) (byte) 1);
        estoque0.removerProduto("hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test7934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7934");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto28.setNome("");
        produto28.setNome("hi!");
        produto28.setNome("");
        estoque0.inserirProduto(produto28, 9);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "", (double) '#');
        estoque0.inserirProduto(produto40, (-1));
        int int44 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto48 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto48.setNome("hi!");
        produto48.setPreco((double) 10);
        produto48.setNome("hi!");
        produto48.setPreco((double) 'a');
        java.lang.String str57 = produto48.getNome();
        produto48.setCodigo("hi!");
        java.lang.String str60 = produto48.getCodigo();
        estoque0.inserirProduto(produto48, (int) (byte) 10);
        boolean boolean64 = estoque0.produtoExiste("hi!");
        int int66 = estoque0.consultarQuantidade("");
        int int68 = estoque0.consultarQuantidade("");
        boolean boolean70 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test7935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7935");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("");
        int int28 = estoque0.consultarQuantidade("");
        int int30 = estoque0.consultarQuantidade("hi!");
        int int32 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 9 + "'", int32 == 9);
    }

    @Test
    public void test7936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7936");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto21.setPreco((double) '#');
        produto21.setNome("");
        estoque0.inserirProduto(produto21, (int) (byte) 1);
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double32 = produto31.getPreco();
        produto31.setNome("hi!");
        java.lang.String str35 = produto31.getCodigo();
        produto31.setCodigo("hi!");
        double double38 = produto31.getPreco();
        produto31.setCodigo("hi!");
        java.lang.String str41 = produto31.getNome();
        produto31.setCodigo("");
        estoque0.inserirProduto(produto31, 97);
        produto31.setCodigo("");
        produto31.setPreco(0.0d);
        double double50 = produto31.getPreco();
        produto31.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    }

    @Test
    public void test7937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7937");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (short) 0);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 'a');
        produto15.setNome("");
        produto15.setNome("");
        double double28 = produto15.getPreco();
        double double29 = produto15.getPreco();
        produto15.setPreco((double) 68);
        produto15.setPreco((double) 8);
        java.lang.String str34 = produto15.getNome();
        estoque0.inserirProduto(produto15, (int) (byte) 100);
        estoque0.removerProduto("hi!", (int) (short) 0);
        br.ufrn.imd.Produto produto43 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto43.setNome("hi!");
        produto43.setPreco((double) 10);
        produto43.setNome("hi!");
        java.lang.String str50 = produto43.getCodigo();
        double double51 = produto43.getPreco();
        java.lang.String str52 = produto43.getCodigo();
        produto43.setNome("hi!");
        produto43.setNome("hi!");
        produto43.setNome("hi!");
        java.lang.String str59 = produto43.getCodigo();
        double double60 = produto43.getPreco();
        double double61 = produto43.getPreco();
        estoque0.inserirProduto(produto43, 100);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 97.0d + "'", double28 == 97.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 97.0d + "'", double29 == 97.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
    }

    @Test
    public void test7938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7938");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-91));
    }

    @Test
    public void test7939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7939");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        boolean boolean6 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto10 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double11 = produto10.getPreco();
        produto10.setNome("");
        java.lang.String str14 = produto10.getCodigo();
        java.lang.String str15 = produto10.getNome();
        estoque0.inserirProduto(produto10, (-10));
        produto10.setNome("hi!");
        produto10.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test7940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7940");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        boolean boolean25 = estoque0.produtoExiste("");
        int int27 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto31.setPreco((double) '#');
        produto31.setNome("");
        estoque0.inserirProduto(produto31, (int) (short) 10);
        boolean boolean39 = estoque0.produtoExiste("hi!");
        int int41 = estoque0.consultarQuantidade("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-102));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 109 + "'", int41 == 109);
    }

    @Test
    public void test7941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7941");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("");
        int int18 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (short) 100);
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double26 = produto25.getPreco();
        produto25.setNome("hi!");
        java.lang.String str29 = produto25.getNome();
        produto25.setCodigo("hi!");
        double double32 = produto25.getPreco();
        estoque0.inserirProduto(produto25, 109);
        estoque0.removerProduto("hi!", 0);
        boolean boolean39 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (-10));
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto46.setNome("hi!");
        produto46.setPreco((double) 10);
        produto46.setNome("hi!");
        produto46.setPreco((double) 'a');
        produto46.setNome("");
        produto46.setNome("");
        produto46.setPreco((double) (short) -1);
        double double61 = produto46.getPreco();
        java.lang.String str62 = produto46.getCodigo();
        produto46.setCodigo("hi!");
        estoque0.inserirProduto(produto46, (-135));
        br.ufrn.imd.Produto produto70 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-1L));
        produto70.setCodigo("");
        produto70.setNome("hi!");
        produto70.setPreco((double) 'a');
        produto70.setNome("");
        estoque0.inserirProduto(produto70, (int) '4');
        produto70.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
    }

    @Test
    public void test7942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7942");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        double double9 = produto3.getPreco();
        produto3.setPreco((double) 1.0f);
        produto3.setPreco((double) '4');
        produto3.setCodigo("");
        produto3.setCodigo("hi!");
        produto3.setCodigo("hi!");
        produto3.setPreco((double) (byte) 100);
        java.lang.String str22 = produto3.getNome();
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test7943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7943");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        boolean boolean25 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) ' ');
        boolean boolean30 = estoque0.produtoExiste("");
        int int32 = estoque0.consultarQuantidade("");
        boolean boolean34 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (-90));
        boolean boolean39 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque40 = new br.ufrn.imd.Estoque();
        boolean boolean42 = estoque40.produtoExiste("");
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto46.setNome("hi!");
        produto46.setPreco((double) 10);
        estoque40.inserirProduto(produto46, (int) (byte) -1);
        boolean boolean54 = estoque40.produtoExiste("");
        int int56 = estoque40.consultarQuantidade("");
        br.ufrn.imd.Produto produto60 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto60.setNome("hi!");
        java.lang.String str63 = produto60.getCodigo();
        estoque40.inserirProduto(produto60, (-1));
        boolean boolean67 = estoque40.produtoExiste("");
        boolean boolean69 = estoque40.produtoExiste("");
        br.ufrn.imd.Produto produto73 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str74 = produto73.getCodigo();
        produto73.setCodigo("hi!");
        produto73.setNome("hi!");
        estoque40.inserirProduto(produto73, 18);
        produto73.setCodigo("hi!");
        estoque0.inserirProduto(produto73, 136);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
    }

    @Test
    public void test7944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7944");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        int int16 = estoque0.consultarQuantidade("");
        boolean boolean18 = estoque0.produtoExiste("hi!");
        int int20 = estoque0.consultarQuantidade("");
        boolean boolean22 = estoque0.produtoExiste("hi!");
        boolean boolean24 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "", (double) (short) 10);
        double double29 = produto28.getPreco();
        produto28.setCodigo("");
        produto28.setNome("hi!");
        java.lang.String str34 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, 114);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "", (double) 100L);
        produto40.setCodigo("hi!");
        produto40.setNome("");
        double double45 = produto40.getPreco();
        estoque0.inserirProduto(produto40, (-91));
        double double48 = produto40.getPreco();
        java.lang.String str49 = produto40.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test7945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7945");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setCodigo("");
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setNome("hi!");
        produto3.setPreco((double) 1);
        produto3.setPreco((-200.0d));
        java.lang.String str17 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test7946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7946");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        produto3.setPreco(10.0d);
        produto3.setCodigo("hi!");
        produto3.setPreco(97.0d);
        java.lang.String str20 = produto3.getNome();
        java.lang.String str21 = produto3.getCodigo();
        produto3.setNome("");
        double double24 = produto3.getPreco();
        double double25 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
    }

    @Test
    public void test7947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7947");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        boolean boolean21 = estoque19.produtoExiste("");
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto25.setNome("hi!");
        produto25.setPreco((double) 10);
        estoque19.inserirProduto(produto25, (int) (byte) -1);
        estoque19.removerProduto("hi!", 0);
        int int36 = estoque19.consultarQuantidade("");
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque19.inserirProduto(produto40, (int) (byte) 100);
        boolean boolean44 = estoque19.produtoExiste("");
        br.ufrn.imd.Produto produto48 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double49 = produto48.getPreco();
        java.lang.String str50 = produto48.getCodigo();
        java.lang.String str51 = produto48.getCodigo();
        produto48.setPreco((double) (short) -1);
        estoque19.inserirProduto(produto48, (int) (byte) 1);
        int int57 = estoque19.consultarQuantidade("hi!");
        estoque19.removerProduto("hi!", (int) (byte) -1);
        br.ufrn.imd.Produto produto64 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto64.setCodigo("hi!");
        java.lang.String str67 = produto64.getNome();
        java.lang.String str68 = produto64.getCodigo();
        produto64.setNome("");
        double double71 = produto64.getPreco();
        java.lang.String str72 = produto64.getNome();
        estoque19.inserirProduto(produto64, (-4));
        java.lang.String str75 = produto64.getCodigo();
        estoque0.inserirProduto(produto64, (int) ' ');
        boolean boolean79 = estoque0.produtoExiste("hi!");
        int int81 = estoque0.consultarQuantidade("");
        int int83 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 100.0d + "'", double71 == 100.0d);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 31 + "'", int83 == 31);
    }

    @Test
    public void test7948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7948");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("");
        int int18 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (short) 100);
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double26 = produto25.getPreco();
        produto25.setNome("hi!");
        java.lang.String str29 = produto25.getNome();
        produto25.setCodigo("hi!");
        double double32 = produto25.getPreco();
        estoque0.inserirProduto(produto25, 109);
        estoque0.removerProduto("hi!", 0);
        boolean boolean39 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (-10));
        estoque0.removerProduto("hi!", 96);
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("", "", (double) 'a');
        produto49.setNome("hi!");
        estoque0.inserirProduto(produto49, 36);
        java.lang.Class<?> wildcardClass54 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test7949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7949");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        boolean boolean25 = estoque0.produtoExiste("");
        int int27 = estoque0.consultarQuantidade("hi!");
        boolean boolean29 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "", (double) 0);
        estoque0.inserirProduto(produto33, 109);
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double40 = produto39.getPreco();
        java.lang.String str41 = produto39.getCodigo();
        java.lang.String str42 = produto39.getNome();
        produto39.setNome("hi!");
        double double45 = produto39.getPreco();
        produto39.setPreco((double) (-1L));
        estoque0.inserirProduto(produto39, (-1));
        estoque0.removerProduto("hi!", (-97));
        int int54 = estoque0.consultarQuantidade("hi!");
        boolean boolean56 = estoque0.produtoExiste("");
        int int58 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 98 + "'", int54 == 98);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 109 + "'", int58 == 109);
    }

    @Test
    public void test7950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7950");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        produto16.setNome("");
        java.lang.String str25 = produto16.getNome();
        double double26 = produto16.getPreco();
        produto16.setCodigo("hi!");
        produto16.setNome("hi!");
        java.lang.String str31 = produto16.getCodigo();
        produto16.setPreco((double) (-112));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test7951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7951");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (byte) 1);
        produto3.setPreco((double) 0L);
        produto3.setCodigo("");
        produto3.setNome("hi!");
    }

    @Test
    public void test7952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7952");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (byte) 1);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getCodigo();
        java.lang.String str8 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test7953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7953");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto20 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto20.setNome("hi!");
        produto20.setNome("");
        java.lang.String str25 = produto20.getNome();
        produto20.setNome("hi!");
        estoque0.inserirProduto(produto20, 9);
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        boolean boolean32 = estoque30.produtoExiste("");
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto36.setNome("hi!");
        produto36.setPreco((double) 10);
        estoque30.inserirProduto(produto36, (int) (byte) -1);
        int int44 = estoque30.consultarQuantidade("");
        boolean boolean46 = estoque30.produtoExiste("hi!");
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto50.setNome("hi!");
        produto50.setNome("");
        java.lang.String str55 = produto50.getNome();
        produto50.setNome("hi!");
        estoque30.inserirProduto(produto50, 9);
        estoque30.removerProduto("hi!", (int) (short) 10);
        br.ufrn.imd.Produto produto66 = new br.ufrn.imd.Produto("", "", 1.0d);
        java.lang.String str67 = produto66.getNome();
        estoque30.inserirProduto(produto66, (int) '4');
        java.lang.String str70 = produto66.getCodigo();
        estoque0.inserirProduto(produto66, (-1));
        estoque0.removerProduto("hi!", 33);
        estoque0.removerProduto("", 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test7954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7954");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setPreco((double) 10);
        java.lang.String str24 = produto19.getNome();
        double double25 = produto19.getPreco();
        java.lang.String str26 = produto19.getCodigo();
        produto19.setCodigo("hi!");
        java.lang.String str29 = produto19.getCodigo();
        produto19.setNome("");
        estoque0.inserirProduto(produto19, (int) (short) 10);
        java.lang.String str34 = produto19.getCodigo();
        produto19.setNome("hi!");
        java.lang.String str37 = produto19.getCodigo();
        java.lang.String str38 = produto19.getCodigo();
        java.lang.String str39 = produto19.getNome();
        produto19.setPreco((double) (-100));
        java.lang.String str42 = produto19.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test7955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7955");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        java.lang.String str23 = produto16.getCodigo();
        double double24 = produto16.getPreco();
        java.lang.String str25 = produto16.getNome();
        produto16.setNome("hi!");
        double double28 = produto16.getPreco();
        double double29 = produto16.getPreco();
        java.lang.String str30 = produto16.getNome();
        produto16.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test7956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7956");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        boolean boolean25 = estoque0.produtoExiste("");
        int int27 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto31.setPreco((double) '#');
        produto31.setNome("");
        estoque0.inserirProduto(produto31, (int) (short) 10);
        java.lang.Class<?> wildcardClass38 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test7957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7957");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        produto21.setPreco((double) 10);
        produto21.setNome("hi!");
        java.lang.String str28 = produto21.getCodigo();
        double double29 = produto21.getPreco();
        produto21.setCodigo("hi!");
        estoque0.inserirProduto(produto21, (int) 'a');
        boolean boolean35 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) 'a');
        int int40 = estoque0.consultarQuantidade("hi!");
        int int42 = estoque0.consultarQuantidade("");
        int int44 = estoque0.consultarQuantidade("");
        boolean boolean46 = estoque0.produtoExiste("hi!");
        java.lang.Class<?> wildcardClass47 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test7958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7958");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getCodigo();
        produto3.setPreco(0.0d);
        produto3.setPreco((double) 105);
        double double11 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 105.0d + "'", double11 == 105.0d);
    }

    @Test
    public void test7959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7959");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (-68.0d));
        java.lang.String str4 = produto3.getCodigo();
        java.lang.String str5 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test7960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7960");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        java.lang.String str33 = produto28.getNome();
        double double34 = produto28.getPreco();
        java.lang.String str35 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) '#');
        boolean boolean39 = estoque0.produtoExiste("");
        int int41 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque42 = new br.ufrn.imd.Estoque();
        boolean boolean44 = estoque42.produtoExiste("");
        br.ufrn.imd.Produto produto48 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto48.setNome("hi!");
        produto48.setPreco((double) 10);
        estoque42.inserirProduto(produto48, (int) (byte) -1);
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto58.setNome("hi!");
        produto58.setNome("");
        estoque42.inserirProduto(produto58, 0);
        java.lang.String str65 = produto58.getCodigo();
        double double66 = produto58.getPreco();
        java.lang.String str67 = produto58.getCodigo();
        produto58.setNome("");
        estoque0.inserirProduto(produto58, 10);
        java.lang.String str72 = produto58.getCodigo();
        produto58.setPreco((double) (-63));
        produto58.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
    }

    @Test
    public void test7961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7961");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (-76));
        double double4 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-76.0d) + "'", double4 == (-76.0d));
    }

    @Test
    public void test7962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7962");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque0.inserirProduto(produto19, (int) (short) 100);
        int int23 = estoque0.consultarQuantidade("");
        int int25 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque26 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto30 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto30.setCodigo("hi!");
        estoque26.inserirProduto(produto30, (int) (byte) 0);
        br.ufrn.imd.Produto produto38 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto38.setNome("hi!");
        produto38.setNome("");
        produto38.setPreco(1.0d);
        estoque26.inserirProduto(produto38, 100);
        produto38.setCodigo("");
        produto38.setPreco((double) (-63));
        java.lang.String str51 = produto38.getCodigo();
        estoque0.inserirProduto(produto38, 51);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test7963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7963");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 61);
    }

    @Test
    public void test7964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7964");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("hi!");
        boolean boolean18 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (-5));
        br.ufrn.imd.Estoque estoque22 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto26 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto26.setCodigo("hi!");
        estoque22.inserirProduto(produto26, (int) (byte) 0);
        estoque22.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto37.setNome("hi!");
        produto37.setPreco((double) 100L);
        estoque22.inserirProduto(produto37, (int) (short) 10);
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double48 = produto47.getPreco();
        produto47.setNome("hi!");
        java.lang.String str51 = produto47.getNome();
        produto47.setCodigo("hi!");
        estoque22.inserirProduto(produto47, (int) (short) 100);
        estoque22.removerProduto("hi!", (int) (short) 10);
        br.ufrn.imd.Produto produto62 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto62.setNome("hi!");
        produto62.setPreco((double) 10);
        java.lang.String str67 = produto62.getNome();
        double double68 = produto62.getPreco();
        java.lang.String str69 = produto62.getCodigo();
        produto62.setCodigo("hi!");
        produto62.setPreco((double) (-1.0f));
        produto62.setPreco(100.0d);
        estoque22.inserirProduto(produto62, (int) ' ');
        br.ufrn.imd.Produto produto81 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto81.setNome("hi!");
        produto81.setPreco((double) 10);
        java.lang.String str86 = produto81.getCodigo();
        double double87 = produto81.getPreco();
        produto81.setPreco((double) 1.0f);
        estoque22.inserirProduto(produto81, 68);
        produto81.setPreco((double) 16);
        estoque0.inserirProduto(produto81, 32);
        java.lang.String str96 = produto81.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 10.0d + "'", double87 == 10.0d);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "hi!" + "'", str96, "hi!");
    }

    @Test
    public void test7965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7965");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 10);
        estoque0.removerProduto("hi!", (int) (short) 10);
        boolean boolean34 = estoque0.produtoExiste("");
        int int36 = estoque0.consultarQuantidade("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 135);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-11) + "'", int36 == (-11));
    }

    @Test
    public void test7966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7966");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        int int16 = estoque0.consultarQuantidade("");
        boolean boolean18 = estoque0.produtoExiste("");
        int int20 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto24 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 10L);
        double double25 = produto24.getPreco();
        estoque0.inserirProduto(produto24, (-98));
        estoque0.removerProduto("hi!", 9);
        int int32 = estoque0.consultarQuantidade("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-98));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7967");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        java.lang.String str11 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7968");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 10);
        int int31 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto35 = new br.ufrn.imd.Produto("", "hi!", (double) (short) 100);
        produto35.setCodigo("");
        estoque0.inserirProduto(produto35, (int) '#');
        boolean boolean41 = estoque0.produtoExiste("");
        estoque0.removerProduto("", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test7969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7969");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str23 = produto22.getCodigo();
        estoque0.inserirProduto(produto22, (int) 'a');
        estoque0.removerProduto("hi!", (int) (short) 10);
        int int30 = estoque0.consultarQuantidade("hi!");
        int int32 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 51);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-108) + "'", int30 == (-108));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
    }

    @Test
    public void test7970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7970");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setPreco((double) 10);
        java.lang.String str24 = produto19.getNome();
        double double25 = produto19.getPreco();
        java.lang.String str26 = produto19.getCodigo();
        produto19.setCodigo("hi!");
        java.lang.String str29 = produto19.getCodigo();
        produto19.setNome("");
        estoque0.inserirProduto(produto19, (int) (short) 10);
        boolean boolean35 = estoque0.produtoExiste("hi!");
        int int37 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque38 = new br.ufrn.imd.Estoque();
        boolean boolean40 = estoque38.produtoExiste("");
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto44.setNome("hi!");
        produto44.setPreco((double) 10);
        estoque38.inserirProduto(produto44, (int) (byte) -1);
        estoque38.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto57 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque38.inserirProduto(produto57, (int) (short) 100);
        br.ufrn.imd.Produto produto63 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double64 = produto63.getPreco();
        java.lang.String str65 = produto63.getCodigo();
        java.lang.String str66 = produto63.getNome();
        produto63.setCodigo("");
        double double69 = produto63.getPreco();
        java.lang.String str70 = produto63.getCodigo();
        produto63.setNome("hi!");
        java.lang.String str73 = produto63.getNome();
        estoque38.inserirProduto(produto63, (-63));
        estoque0.inserirProduto(produto63, 1);
        boolean boolean79 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", 54);
        estoque0.removerProduto("", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 100.0d + "'", double64 == 100.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 100.0d + "'", double69 == 100.0d);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test7971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7971");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        boolean boolean25 = estoque0.produtoExiste("");
        int int27 = estoque0.consultarQuantidade("hi!");
        boolean boolean29 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "", (double) 0);
        estoque0.inserirProduto(produto33, 109);
        int int37 = estoque0.consultarQuantidade("hi!");
        int int39 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 99 + "'", int37 == 99);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 99 + "'", int39 == 99);
    }

    @Test
    public void test7972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7972");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        boolean boolean21 = estoque0.produtoExiste("");
        int int23 = estoque0.consultarQuantidade("");
        int int25 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test7973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7973");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        boolean boolean4 = estoque0.produtoExiste("hi!");
        boolean boolean6 = estoque0.produtoExiste("");
        boolean boolean8 = estoque0.produtoExiste("hi!");
        int int10 = estoque0.consultarQuantidade("");
        boolean boolean12 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setPreco((double) 10);
        java.lang.String str21 = produto16.getNome();
        double double22 = produto16.getPreco();
        java.lang.String str23 = produto16.getCodigo();
        java.lang.String str24 = produto16.getCodigo();
        produto16.setCodigo("hi!");
        produto16.setPreco((double) (short) 10);
        produto16.setNome("");
        double double31 = produto16.getPreco();
        estoque0.inserirProduto(produto16, (-69));
        produto16.setCodigo("");
        produto16.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    }

    @Test
    public void test7974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7974");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        double double10 = produto3.getPreco();
        produto3.setCodigo("hi!");
        java.lang.String str13 = produto3.getNome();
        produto3.setPreco((double) (short) 100);
        double double16 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setPreco((double) 1);
        produto3.setNome("");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test7975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7975");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        java.lang.String str23 = produto16.getCodigo();
        double double24 = produto16.getPreco();
        java.lang.String str25 = produto16.getCodigo();
        produto16.setNome("");
        produto16.setNome("");
        java.lang.String str30 = produto16.getNome();
        java.lang.String str31 = produto16.getNome();
        produto16.setPreco((double) (-61));
        java.lang.Class<?> wildcardClass34 = produto16.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test7976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7976");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        boolean boolean6 = estoque0.produtoExiste("");
        boolean boolean8 = estoque0.produtoExiste("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7977");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 109);
    }

    @Test
    public void test7978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7978");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("hi!");
        int int28 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test7979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7979");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        int int21 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque22 = new br.ufrn.imd.Estoque();
        boolean boolean24 = estoque22.produtoExiste("");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        estoque22.inserirProduto(produto28, (int) (byte) -1);
        int int36 = estoque22.consultarQuantidade("");
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto40.setNome("");
        estoque22.inserirProduto(produto40, (int) (byte) 10);
        produto40.setNome("hi!");
        estoque0.inserirProduto(produto40, (int) (byte) -1);
        java.lang.String str49 = produto40.getCodigo();
        produto40.setPreco((double) (-101));
        produto40.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test7980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7980");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto19.setNome("hi!");
        produto19.setPreco((double) 10);
        java.lang.String str24 = produto19.getNome();
        double double25 = produto19.getPreco();
        java.lang.String str26 = produto19.getCodigo();
        produto19.setCodigo("hi!");
        java.lang.String str29 = produto19.getCodigo();
        produto19.setNome("");
        estoque0.inserirProduto(produto19, (int) (short) 10);
        boolean boolean35 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto39.setPreco((double) '#');
        produto39.setPreco((double) 10);
        java.lang.String str44 = produto39.getNome();
        produto39.setPreco(0.0d);
        estoque0.inserirProduto(produto39, (int) (byte) -1);
        boolean boolean50 = estoque0.produtoExiste("hi!");
        boolean boolean52 = estoque0.produtoExiste("hi!");
        int int54 = estoque0.consultarQuantidade("hi!");
        int int56 = estoque0.consultarQuantidade("");
        int int58 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque59 = new br.ufrn.imd.Estoque();
        boolean boolean61 = estoque59.produtoExiste("");
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto65.setNome("hi!");
        produto65.setPreco((double) 10);
        estoque59.inserirProduto(produto65, (int) (byte) -1);
        br.ufrn.imd.Produto produto75 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto75.setNome("hi!");
        produto75.setNome("");
        estoque59.inserirProduto(produto75, 0);
        java.lang.String str82 = produto75.getCodigo();
        double double83 = produto75.getPreco();
        produto75.setCodigo("");
        produto75.setPreco((double) 1.0f);
        java.lang.String str88 = produto75.getNome();
        produto75.setPreco((double) (byte) 10);
        produto75.setPreco(97.0d);
        estoque0.inserirProduto(produto75, (int) (short) 0);
        int int96 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 8 + "'", int54 == 8);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.0d + "'", double83 == 10.0d);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 8 + "'", int96 == 8);
    }

    @Test
    public void test7981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7981");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        produto3.setNome("");
        double double12 = produto3.getPreco();
        produto3.setCodigo("");
        java.lang.String str15 = produto3.getCodigo();
        double double16 = produto3.getPreco();
        double double17 = produto3.getPreco();
        produto3.setPreco(116.0d);
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test7982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7982");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setPreco((double) (byte) 0);
        java.lang.String str9 = produto3.getCodigo();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setPreco((double) 100.0f);
        double double13 = produto3.getPreco();
        double double14 = produto3.getPreco();
        produto3.setNome("hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test7983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7983");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque0.inserirProduto(produto21, (int) (byte) 100);
        boolean boolean25 = estoque0.produtoExiste("");
        int int27 = estoque0.consultarQuantidade("hi!");
        boolean boolean29 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (-99));
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) '#');
        java.lang.String str37 = produto36.getCodigo();
        double double38 = produto36.getPreco();
        estoque0.inserirProduto(produto36, 1);
        double double41 = produto36.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 35.0d + "'", double38 == 35.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 35.0d + "'", double41 == 35.0d);
    }

    @Test
    public void test7984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7984");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        double double9 = produto3.getPreco();
        double double10 = produto3.getPreco();
        produto3.setCodigo("");
        produto3.setPreco(18.0d);
        produto3.setPreco((-2.0d));
        produto3.setCodigo("");
        java.lang.String str19 = produto3.getNome();
        produto3.setPreco((double) 65);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test7985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7985");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        int int24 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        java.lang.String str33 = produto28.getNome();
        double double34 = produto28.getPreco();
        java.lang.String str35 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) '#');
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque0.inserirProduto(produto41, (-1));
        int int45 = estoque0.consultarQuantidade("");
        boolean boolean47 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto51 = new br.ufrn.imd.Produto("", "", (double) (short) 10);
        double double52 = produto51.getPreco();
        produto51.setCodigo("");
        produto51.setNome("hi!");
        estoque0.inserirProduto(produto51, 36);
        br.ufrn.imd.Produto produto62 = new br.ufrn.imd.Produto("hi!", "", (double) 9);
        produto62.setPreco((double) (byte) 0);
        double double65 = produto62.getPreco();
        java.lang.String str66 = produto62.getCodigo();
        estoque0.inserirProduto(produto62, (int) (short) -1);
        estoque0.removerProduto("", (-33));
        int int73 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 6);
        boolean boolean78 = estoque0.produtoExiste("");
        boolean boolean80 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 33 + "'", int73 == 33);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test7986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7986");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        boolean boolean19 = estoque0.produtoExiste("");
        int int21 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto25.setPreco((double) '#');
        produto25.setNome("");
        double double30 = produto25.getPreco();
        estoque0.inserirProduto(produto25, 8);
        int int34 = estoque0.consultarQuantidade("hi!");
        int int36 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 35.0d + "'", double30 == 35.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 7 + "'", int34 == 7);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
    }

    @Test
    public void test7987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7987");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setNome("hi!");
        double double9 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setCodigo("");
        produto3.setPreco((double) 99);
        produto3.setPreco((double) (byte) 100);
        java.lang.String str18 = produto3.getCodigo();
        produto3.setPreco((double) (-61));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7988");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 'a');
        produto3.setNome("");
        produto3.setNome("");
        produto3.setPreco((double) (short) -1);
        produto3.setCodigo("");
        produto3.setCodigo("");
        produto3.setCodigo("");
        produto3.setPreco(68.0d);
    }

    @Test
    public void test7989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7989");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("");
        boolean boolean26 = estoque0.produtoExiste("hi!");
        boolean boolean28 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) (short) -1);
        int int33 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test7990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7990");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        int int2 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        java.lang.String str7 = produto6.getNome();
        estoque0.inserirProduto(produto6, 10);
        br.ufrn.imd.Produto produto13 = new br.ufrn.imd.Produto("hi!", "", 10.0d);
        estoque0.inserirProduto(produto13, (-10));
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("hi!", "", (double) (-160));
        produto19.setCodigo("");
        estoque0.inserirProduto(produto19, (-201));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test7991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7991");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 18);
        java.lang.String str4 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        java.lang.Class<?> wildcardClass8 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7992");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (-63.0d));
        java.lang.String str4 = produto3.getNome();
        produto3.setCodigo("hi!");
        produto3.setPreco((-100.0d));
        java.lang.Class<?> wildcardClass9 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7993");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        int int13 = estoque0.consultarQuantidade("");
        boolean boolean15 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) (short) 0);
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "", (double) ' ');
        estoque0.inserirProduto(produto22, (int) (byte) 10);
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", 0.0d);
        double double29 = produto28.getPreco();
        estoque0.inserirProduto(produto28, 35);
        estoque0.removerProduto("hi!", 100);
        br.ufrn.imd.Produto produto38 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto38.setNome("hi!");
        produto38.setPreco((double) 10);
        java.lang.String str43 = produto38.getNome();
        double double44 = produto38.getPreco();
        java.lang.String str45 = produto38.getCodigo();
        java.lang.String str46 = produto38.getCodigo();
        estoque0.inserirProduto(produto38, 98);
        java.lang.String str49 = produto38.getNome();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test7994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7994");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto16.setNome("hi!");
        produto16.setNome("");
        estoque0.inserirProduto(produto16, 0);
        produto16.setNome("");
        double double25 = produto16.getPreco();
        produto16.setPreco((double) 18);
        produto16.setNome("");
        java.lang.String str30 = produto16.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test7995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7995");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double22 = produto21.getPreco();
        produto21.setNome("hi!");
        java.lang.String str25 = produto21.getCodigo();
        produto21.setCodigo("hi!");
        double double28 = produto21.getPreco();
        estoque0.inserirProduto(produto21, (int) 'a');
        java.lang.String str31 = produto21.getCodigo();
        java.lang.String str32 = produto21.getCodigo();
        java.lang.String str33 = produto21.getNome();
        produto21.setNome("");
        java.lang.String str36 = produto21.getNome();
        java.lang.String str37 = produto21.getCodigo();
        produto21.setNome("");
        java.lang.String str40 = produto21.getCodigo();
        java.lang.String str41 = produto21.getNome();
        produto21.setCodigo("");
        produto21.setCodigo("hi!");
        java.lang.Class<?> wildcardClass46 = produto21.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test7996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7996");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 0.0f);
        produto3.setPreco(97.0d);
        java.lang.String str6 = produto3.getNome();
        produto3.setPreco(0.0d);
        produto3.setCodigo("");
        produto3.setCodigo("hi!");
        java.lang.String str13 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test7997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7997");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str23 = produto22.getCodigo();
        estoque0.inserirProduto(produto22, (int) 'a');
        estoque0.removerProduto("hi!", (int) (short) 10);
        int int30 = estoque0.consultarQuantidade("hi!");
        int int32 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto36.setPreco((double) '#');
        produto36.setPreco((double) 10);
        java.lang.String str41 = produto36.getCodigo();
        produto36.setNome("");
        estoque0.inserirProduto(produto36, 16);
        int int47 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque48 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto52 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto52.setCodigo("hi!");
        estoque48.inserirProduto(produto52, (int) (byte) 0);
        estoque48.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto63 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto63.setNome("hi!");
        produto63.setPreco((double) 100L);
        estoque48.inserirProduto(produto63, (int) (short) 10);
        br.ufrn.imd.Produto produto73 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double74 = produto73.getPreco();
        produto73.setNome("hi!");
        java.lang.String str77 = produto73.getNome();
        produto73.setCodigo("hi!");
        estoque48.inserirProduto(produto73, (int) (short) 100);
        produto73.setPreco((double) (short) 100);
        produto73.setCodigo("hi!");
        estoque0.inserirProduto(produto73, (-116));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-108) + "'", int30 == (-108));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-92) + "'", int47 == (-92));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 100.0d + "'", double74 == 100.0d);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
    }

    @Test
    public void test7998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7998");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 30);
        java.lang.Class<?> wildcardClass4 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test7999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7999");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto18.setNome("");
        estoque0.inserirProduto(produto18, (int) (byte) 10);
        boolean boolean24 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (int) (byte) -1);
        int int29 = estoque0.consultarQuantidade("");
        boolean boolean31 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (int) (short) 1);
        boolean boolean36 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto40.setPreco((double) '#');
        produto40.setPreco((double) 10);
        java.lang.String str45 = produto40.getCodigo();
        java.lang.String str46 = produto40.getNome();
        estoque0.inserirProduto(produto40, (-25));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test8000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test8000");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        int int16 = estoque0.consultarQuantidade("");
        boolean boolean18 = estoque0.produtoExiste("");
        int int20 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto24 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 10L);
        double double25 = produto24.getPreco();
        estoque0.inserirProduto(produto24, (-98));
        estoque0.removerProduto("hi!", 9);
        int int32 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque33 = new br.ufrn.imd.Estoque();
        boolean boolean35 = estoque33.produtoExiste("");
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto39.setNome("hi!");
        produto39.setPreco((double) 10);
        estoque33.inserirProduto(produto39, (int) (byte) -1);
        estoque33.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto52 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto52.setNome("hi!");
        produto52.setPreco((double) 10);
        java.lang.String str57 = produto52.getNome();
        double double58 = produto52.getPreco();
        java.lang.String str59 = produto52.getCodigo();
        produto52.setCodigo("hi!");
        java.lang.String str62 = produto52.getCodigo();
        produto52.setNome("");
        estoque33.inserirProduto(produto52, (int) (short) 10);
        boolean boolean68 = estoque33.produtoExiste("");
        br.ufrn.imd.Produto produto72 = new br.ufrn.imd.Produto("hi!", "", 100.0d);
        estoque33.inserirProduto(produto72, (int) (byte) 10);
        br.ufrn.imd.Produto produto78 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        double double79 = produto78.getPreco();
        estoque33.inserirProduto(produto78, (int) (short) 10);
        produto78.setCodigo("hi!");
        java.lang.String str84 = produto78.getCodigo();
        estoque0.inserirProduto(produto78, (int) '#');
        produto78.setPreco((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-108) + "'", int32 == (-108));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 10.0d + "'", double79 == 10.0d);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
    }
}


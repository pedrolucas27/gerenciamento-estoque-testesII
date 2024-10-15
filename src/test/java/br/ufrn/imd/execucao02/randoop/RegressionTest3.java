package br.ufrn.imd.execucao02.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        boolean boolean72 = estoque0.produtoExiste("");
        int int74 = estoque0.consultarQuantidade("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        int int31 = estoque0.consultarQuantidade("");
        int int33 = estoque0.consultarQuantidade("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-99));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        boolean boolean20 = estoque0.produtoExiste("hi!");
        boolean boolean22 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque23 = new br.ufrn.imd.Estoque();
        boolean boolean25 = estoque23.produtoExiste("");
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto29.setNome("hi!");
        produto29.setPreco((double) 10);
        estoque23.inserirProduto(produto29, (int) (byte) -1);
        int int37 = estoque23.consultarQuantidade("");
        boolean boolean39 = estoque23.produtoExiste("");
        boolean boolean41 = estoque23.produtoExiste("");
        br.ufrn.imd.Estoque estoque42 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto46.setCodigo("hi!");
        estoque42.inserirProduto(produto46, (int) (byte) 0);
        estoque23.inserirProduto(produto46, 1);
        estoque0.inserirProduto(produto46, (int) (short) 100);
        int int56 = estoque0.consultarQuantidade("");
        boolean boolean58 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setPreco((-2.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        double double58 = produto55.getPreco();
        java.lang.String str59 = produto55.getNome();
        java.lang.String str60 = produto55.getCodigo();
        produto55.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", 97.0d);
        produto3.setCodigo("");
        produto3.setNome("hi!");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        java.lang.Class<?> wildcardClass30 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        estoque0.removerProduto("hi!", (-2));
        br.ufrn.imd.Produto produto78 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str79 = produto78.getCodigo();
        produto78.setNome("");
        double double82 = produto78.getPreco();
        double double83 = produto78.getPreco();
        java.lang.String str84 = produto78.getCodigo();
        produto78.setNome("");
        estoque0.inserirProduto(produto78, (-98));
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (int) (short) -1);
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
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 10.0d + "'", double82 == 10.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.0d + "'", double83 == 10.0d);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        java.lang.String str53 = produto47.getNome();
        produto47.setCodigo("hi!");
        java.lang.Class<?> wildcardClass56 = produto47.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        produto49.setCodigo("hi!");
        java.lang.String str54 = produto49.getNome();
        double double55 = produto49.getPreco();
        produto49.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        int int47 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque48 = new br.ufrn.imd.Estoque();
        boolean boolean50 = estoque48.produtoExiste("");
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto54.setNome("hi!");
        produto54.setPreco((double) 10);
        estoque48.inserirProduto(produto54, (int) (byte) -1);
        int int62 = estoque48.consultarQuantidade("");
        br.ufrn.imd.Produto produto66 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto66.setNome("");
        estoque48.inserirProduto(produto66, (int) (byte) 10);
        boolean boolean72 = estoque48.produtoExiste("");
        br.ufrn.imd.Produto produto76 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto76.setNome("");
        produto76.setNome("hi!");
        produto76.setNome("");
        estoque48.inserirProduto(produto76, 9);
        br.ufrn.imd.Produto produto88 = new br.ufrn.imd.Produto("", "", (double) '#');
        estoque48.inserirProduto(produto88, (-1));
        produto88.setNome("hi!");
        estoque0.inserirProduto(produto88, 9);
        estoque0.removerProduto("", 9);
        boolean boolean99 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        br.ufrn.imd.Produto produto12 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto12.setNome("hi!");
        produto12.setNome("");
        produto12.setPreco(1.0d);
        estoque0.inserirProduto(produto12, 100);
        boolean boolean22 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque23 = new br.ufrn.imd.Estoque();
        boolean boolean25 = estoque23.produtoExiste("");
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto29.setNome("hi!");
        produto29.setPreco((double) 10);
        estoque23.inserirProduto(produto29, (int) (byte) -1);
        int int37 = estoque23.consultarQuantidade("");
        boolean boolean39 = estoque23.produtoExiste("");
        boolean boolean41 = estoque23.produtoExiste("");
        br.ufrn.imd.Estoque estoque42 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto46.setCodigo("hi!");
        estoque42.inserirProduto(produto46, (int) (byte) 0);
        estoque23.inserirProduto(produto46, 1);
        br.ufrn.imd.Produto produto56 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto56.setPreco((double) '#');
        produto56.setPreco((double) 10);
        java.lang.String str61 = produto56.getNome();
        produto56.setPreco(0.0d);
        java.lang.String str64 = produto56.getNome();
        estoque23.inserirProduto(produto56, (int) (short) -1);
        produto56.setPreco((double) (-63));
        java.lang.String str69 = produto56.getCodigo();
        estoque0.inserirProduto(produto56, (int) ' ');
        java.lang.String str72 = produto56.getNome();
        double double73 = produto56.getPreco();
        java.lang.String str74 = produto56.getCodigo();
        java.lang.String str75 = produto56.getNome();
        produto56.setPreco((double) 97);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-63.0d) + "'", double73 == (-63.0d));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        int int34 = estoque0.consultarQuantidade("hi!");
        int int36 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-108) + "'", int30 == (-108));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-108) + "'", int34 == (-108));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-108) + "'", int36 == (-108));
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        estoque0.removerProduto("hi!", (int) (byte) 10);
        br.ufrn.imd.Produto produto42 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double43 = produto42.getPreco();
        java.lang.String str44 = produto42.getCodigo();
        java.lang.String str45 = produto42.getNome();
        produto42.setCodigo("");
        double double48 = produto42.getPreco();
        java.lang.String str49 = produto42.getCodigo();
        produto42.setNome("hi!");
        java.lang.String str52 = produto42.getCodigo();
        java.lang.String str53 = produto42.getNome();
        estoque0.inserirProduto(produto42, (int) ' ');
        br.ufrn.imd.Produto produto59 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto59.setNome("hi!");
        produto59.setPreco((double) 10);
        java.lang.String str64 = produto59.getNome();
        double double65 = produto59.getPreco();
        java.lang.String str66 = produto59.getCodigo();
        produto59.setCodigo("hi!");
        java.lang.String str69 = produto59.getCodigo();
        java.lang.String str70 = produto59.getCodigo();
        java.lang.String str71 = produto59.getNome();
        produto59.setNome("");
        estoque0.inserirProduto(produto59, (-4));
        estoque0.removerProduto("hi!", 116);
        estoque0.removerProduto("hi!", (-78));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        int int28 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-90) + "'", int28 == (-90));
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        produto3.setNome("");
        double double12 = produto3.getPreco();
        produto3.setCodigo("");
        java.lang.String str15 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        double double18 = produto3.getPreco();
        produto3.setPreco((-2.0d));
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto45.setNome("hi!");
        produto45.setPreco((double) 10);
        java.lang.String str50 = produto45.getCodigo();
        double double51 = produto45.getPreco();
        produto45.setPreco((double) 1.0f);
        produto45.setPreco((double) '4');
        estoque0.inserirProduto(produto45, 0);
        boolean boolean59 = estoque0.produtoExiste("hi!");
        java.lang.Class<?> wildcardClass60 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-2));
        java.lang.Class<?> wildcardClass4 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        java.lang.String str27 = produto16.getCodigo();
        produto16.setCodigo("");
        java.lang.String str30 = produto16.getNome();
        java.lang.String str31 = produto16.getNome();
        produto16.setPreco((double) (-160));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        produto55.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        java.lang.String str52 = produto46.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 109);
        produto3.setNome("");
        double double6 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 109.0d + "'", double6 == 109.0d);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        int int35 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        int int45 = estoque0.consultarQuantidade("hi!");
        boolean boolean47 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        double double14 = produto3.getPreco();
        produto3.setPreco((double) (byte) 1);
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-78));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        produto58.setCodigo("hi!");
        produto58.setPreco((double) 109);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        double double6 = produto3.getPreco();
        double double7 = produto3.getPreco();
        java.lang.String str8 = produto3.getNome();
        produto3.setCodigo("");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        produto78.setCodigo("");
        double double93 = produto78.getPreco();
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
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 10.0d + "'", double93 == 10.0d);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 0.0f);
        java.lang.String str4 = produto3.getNome();
        produto3.setPreco((double) 68);
        java.lang.String str7 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 9);
        produto3.setPreco((double) (byte) 0);
        produto3.setCodigo("hi!");
        java.lang.String str8 = produto3.getNome();
        java.lang.Class<?> wildcardClass9 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        estoque0.removerProduto("hi!", (int) 'a');
        estoque0.removerProduto("hi!", (int) '4');
        boolean boolean35 = estoque0.produtoExiste("");
        int int37 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-150) + "'", int37 == (-150));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        produto54.setCodigo("");
        java.lang.Class<?> wildcardClass67 = produto54.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        produto16.setCodigo("");
        produto16.setPreco((double) (-101));
        produto16.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        java.lang.Class<?> wildcardClass42 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (-200));
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        br.ufrn.imd.Produto produto43 = null;
        // The following exception was thrown during execution in test generation
        try {
            estoque0.inserirProduto(produto43, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto3.setNome("");
        produto3.setNome("hi!");
        produto3.setNome("");
        java.lang.String str10 = produto3.getCodigo();
        java.lang.Class<?> wildcardClass11 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        int int52 = estoque0.consultarQuantidade("hi!");
        boolean boolean54 = estoque0.produtoExiste("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (int) (byte) 1);
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 19 + "'", int52 == 19);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto18.setPreco((double) '#');
        produto18.setPreco((double) 10);
        java.lang.String str23 = produto18.getNome();
        produto18.setPreco(0.0d);
        estoque0.inserirProduto(produto18, (-2));
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto31.setPreco((double) '#');
        estoque0.inserirProduto(produto31, 100);
        produto31.setPreco((double) (-2));
        double double38 = produto31.getPreco();
        produto31.setNome("hi!");
        produto31.setPreco((double) (-12));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-2.0d) + "'", double38 == (-2.0d));
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (byte) 0);
        boolean boolean19 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto23.setNome("hi!");
        produto23.setPreco((double) 10);
        produto23.setNome("hi!");
        double double30 = produto23.getPreco();
        java.lang.String str31 = produto23.getCodigo();
        estoque0.inserirProduto(produto23, (int) ' ');
        produto23.setNome("");
        java.lang.Class<?> wildcardClass36 = produto23.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        boolean boolean66 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto70 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto70.setNome("hi!");
        produto70.setPreco((double) 10);
        java.lang.String str75 = produto70.getCodigo();
        double double76 = produto70.getPreco();
        java.lang.String str77 = produto70.getCodigo();
        produto70.setPreco((double) (short) -1);
        java.lang.String str80 = produto70.getNome();
        estoque0.inserirProduto(produto70, 34);
        double double83 = produto70.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 10.0d + "'", double76 == 10.0d);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "hi!", (double) 100.0f);
        produto41.setCodigo("");
        estoque0.inserirProduto(produto41, (-36));
        java.lang.Class<?> wildcardClass46 = produto41.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        int int6 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto10 = new br.ufrn.imd.Produto("hi!", "", (double) 9);
        estoque0.inserirProduto(produto10, (int) '#');
        int int14 = estoque0.consultarQuantidade("hi!");
        int int16 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("", (-63));
        int int21 = estoque0.consultarQuantidade("");
        int int23 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto27 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto27.setNome("hi!");
        produto27.setPreco((double) 10);
        java.lang.String str32 = produto27.getNome();
        double double33 = produto27.getPreco();
        java.lang.String str34 = produto27.getCodigo();
        produto27.setCodigo("hi!");
        produto27.setPreco((double) (-1.0f));
        java.lang.String str39 = produto27.getNome();
        produto27.setCodigo("hi!");
        produto27.setCodigo("hi!");
        produto27.setCodigo("hi!");
        estoque0.inserirProduto(produto27, (int) ' ');
        estoque0.removerProduto("hi!", 42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 9);
        produto3.setPreco((double) 10L);
        java.lang.Class<?> wildcardClass6 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        java.lang.String str4 = produto3.getCodigo();
        double double5 = produto3.getPreco();
        java.lang.String str6 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.String str9 = produto3.getNome();
        double double10 = produto3.getPreco();
        produto3.setPreco((double) 0);
        java.lang.Class<?> wildcardClass13 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 0);
        java.lang.String str4 = produto3.getCodigo();
        java.lang.String str5 = produto3.getNome();
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        java.lang.Class<?> wildcardClass36 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        int int45 = estoque0.consultarQuantidade("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        java.lang.String str28 = produto24.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-63.0d) + "'", double27 == (-63.0d));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (-101));
        java.lang.String str4 = produto3.getCodigo();
        double double5 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-101.0d) + "'", double5 == (-101.0d));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", 1.0d);
        java.lang.String str4 = produto3.getNome();
        java.lang.String str5 = produto3.getNome();
        produto3.setPreco((double) 30);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto18.setPreco((double) '#');
        produto18.setPreco((double) 10);
        java.lang.String str23 = produto18.getNome();
        produto18.setPreco(0.0d);
        estoque0.inserirProduto(produto18, (-2));
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto31.setPreco((double) '#');
        estoque0.inserirProduto(produto31, 100);
        produto31.setPreco((double) (-2));
        double double38 = produto31.getPreco();
        produto31.setPreco((double) (-33));
        double double41 = produto31.getPreco();
        produto31.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-2.0d) + "'", double38 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-33.0d) + "'", double41 == (-33.0d));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", 10.0d);
        produto3.setNome("hi!");
        produto3.setCodigo("");
        java.lang.String str8 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        java.lang.String str49 = produto31.getCodigo();
        produto31.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) 'a');
        int int20 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto3.setNome("");
        java.lang.String str6 = produto3.getCodigo();
        java.lang.String str7 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        java.lang.String str10 = produto3.getNome();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setNome("");
        java.lang.String str14 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        java.lang.Class<?> wildcardClass63 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        int int13 = estoque0.consultarQuantidade("");
        boolean boolean15 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque16 = new br.ufrn.imd.Estoque();
        boolean boolean18 = estoque16.produtoExiste("");
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto22.setNome("hi!");
        produto22.setPreco((double) 10);
        estoque16.inserirProduto(produto22, (int) (byte) -1);
        produto22.setNome("hi!");
        produto22.setCodigo("");
        java.lang.String str33 = produto22.getNome();
        double double34 = produto22.getPreco();
        estoque0.inserirProduto(produto22, (int) (byte) 0);
        boolean boolean38 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        double double10 = produto3.getPreco();
        produto3.setCodigo("hi!");
        java.lang.String str13 = produto3.getNome();
        produto3.setPreco((double) (short) 100);
        produto3.setNome("hi!");
        produto3.setNome("hi!");
        produto3.setCodigo("");
        java.lang.String str22 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 34);
        produto3.setNome("");
        java.lang.String str6 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (short) -1);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        produto3.setPreco((double) 68);
        java.lang.Class<?> wildcardClass10 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        boolean boolean54 = estoque0.produtoExiste("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        java.lang.String str26 = produto12.getNome();
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        produto3.setNome("");
        produto3.setPreco((double) (byte) 100);
        double double15 = produto3.getPreco();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 1);
        produto3.setPreco((double) (byte) -1);
        java.lang.String str6 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 70);
        produto3.setPreco((double) 166);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", 10.0d);
        produto3.setNome("hi!");
        produto3.setCodigo("");
        produto3.setPreco((double) 36);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto3.setNome("");
        java.lang.String str6 = produto3.getCodigo();
        java.lang.String str7 = produto3.getCodigo();
        java.lang.String str8 = produto3.getCodigo();
        produto3.setPreco((double) 99);
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        int int24 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 70);
        produto3.setPreco((double) 116);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        java.lang.Class<?> wildcardClass25 = produto12.getClass();
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.String str13 = produto3.getNome();
        double double14 = produto3.getPreco();
        java.lang.String str15 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto18.setPreco((double) '#');
        produto18.setPreco((double) 10);
        java.lang.String str23 = produto18.getNome();
        produto18.setPreco(0.0d);
        estoque0.inserirProduto(produto18, (-2));
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto31.setPreco((double) '#');
        estoque0.inserirProduto(produto31, 100);
        produto31.setPreco((double) (-2));
        produto31.setNome("");
        java.lang.String str40 = produto31.getNome();
        produto31.setCodigo("");
        java.lang.String str43 = produto31.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setCodigo("");
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setPreco((double) (-36));
        produto3.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        produto41.setCodigo("");
        produto41.setPreco((double) 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setPreco((double) (short) -1);
        java.lang.String str13 = produto3.getNome();
        java.lang.String str14 = produto3.getCodigo();
        double double15 = produto3.getPreco();
        java.lang.Class<?> wildcardClass16 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        java.lang.Class<?> wildcardClass41 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        produto34.setCodigo("");
        produto34.setCodigo("hi!");
        java.lang.String str45 = produto34.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        produto3.setPreco(100.0d);
        produto3.setNome("");
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        double double10 = produto3.getPreco();
        produto3.setCodigo("hi!");
        double double13 = produto3.getPreco();
        java.lang.String str14 = produto3.getNome();
        produto3.setNome("hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getCodigo();
        produto3.setPreco((double) 10.0f);
        java.lang.Class<?> wildcardClass13 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        java.lang.String str7 = produto3.getCodigo();
        produto3.setNome("");
        produto3.setCodigo("hi!");
        produto3.setPreco((double) '4');
        produto3.setPreco((double) (-101));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        produto3.setCodigo("hi!");
        double double10 = produto3.getPreco();
        double double11 = produto3.getPreco();
        produto3.setCodigo("hi!");
        produto3.setNome("");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setNome("");
        produto3.setNome("hi!");
        java.lang.Class<?> wildcardClass15 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setNome("");
        produto3.setCodigo("hi!");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        java.lang.String str42 = produto37.getCodigo();
        produto37.setPreco((double) (-36));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        br.ufrn.imd.Produto produto59 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto59.setCodigo("hi!");
        produto59.setCodigo("");
        produto59.setCodigo("hi!");
        estoque0.inserirProduto(produto59, (int) '#');
        produto59.setPreco((double) (short) 0);
        produto59.setPreco((double) (byte) 100);
        java.lang.String str72 = produto59.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 0.0f);
        produto3.setPreco(97.0d);
        produto3.setPreco(18.0d);
        java.lang.String str8 = produto3.getNome();
        java.lang.Class<?> wildcardClass9 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) 'a');
        boolean boolean20 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto24 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double25 = produto24.getPreco();
        java.lang.String str26 = produto24.getCodigo();
        java.lang.String str27 = produto24.getNome();
        produto24.setNome("hi!");
        estoque0.inserirProduto(produto24, 18);
        java.lang.String str32 = produto24.getCodigo();
        java.lang.String str33 = produto24.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        boolean boolean38 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        boolean boolean24 = estoque0.produtoExiste("hi!");
        boolean boolean26 = estoque0.produtoExiste("hi!");
        boolean boolean28 = estoque0.produtoExiste("hi!");
        int int30 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-102) + "'", int30 == (-102));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto3.setPreco((double) (byte) 100);
        java.lang.String str6 = produto3.getNome();
        java.lang.String str7 = produto3.getCodigo();
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        produto3.setPreco(18.0d);
        java.lang.String str12 = produto3.getCodigo();
        java.lang.String str13 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto3.setCodigo("hi!");
        java.lang.String str6 = produto3.getNome();
        double double7 = produto3.getPreco();
        java.lang.Class<?> wildcardClass8 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 28);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        int int67 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (short) 10);
        java.lang.String str4 = produto3.getNome();
        java.lang.Class<?> wildcardClass5 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        estoque0.removerProduto("hi!", (int) (short) 0);
        estoque0.removerProduto("hi!", 166);
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        java.lang.String str52 = produto44.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 0.0f);
        produto3.setNome("hi!");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        java.lang.String str13 = produto3.getNome();
        produto3.setNome("hi!");
        produto3.setCodigo("");
        produto3.setPreco((double) (-90));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        produto36.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        estoque0.removerProduto("", (-98));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-108) + "'", int30 == (-108));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        java.lang.String str31 = produto18.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        produto45.setNome("");
        produto45.setCodigo("hi!");
        produto45.setCodigo("hi!");
        produto45.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", 100.0d);
        java.lang.String str4 = produto3.getNome();
        double double5 = produto3.getPreco();
        java.lang.String str6 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 99);
        java.lang.String str4 = produto3.getNome();
        produto3.setPreco((double) (-33));
        produto3.setNome("hi!");
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (short) 100);
        double double4 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-33));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (short) -1);
        produto3.setCodigo("hi!");
        produto3.setPreco((double) (-108));
        produto3.setNome("");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        estoque0.removerProduto("", (-103));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
        produto47.setNome("hi!");
        produto47.setNome("");
        double double57 = produto47.getPreco();
        produto47.setNome("");
        java.lang.String str60 = produto47.getNome();
        double double61 = produto47.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 100.0d + "'", double57 == 100.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 100.0d + "'", double61 == 100.0d);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (byte) 0);
        produto3.setPreco((double) 1);
        java.lang.String str6 = produto3.getNome();
        produto3.setPreco((double) 109);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        produto47.setNome("hi!");
        produto47.setNome("");
        double double57 = produto47.getPreco();
        produto47.setNome("");
        double double60 = produto47.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 100.0d + "'", double57 == 100.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 100.0d + "'", double60 == 100.0d);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        br.ufrn.imd.Estoque estoque23 = new br.ufrn.imd.Estoque();
        boolean boolean25 = estoque23.produtoExiste("");
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto29.setNome("hi!");
        produto29.setPreco((double) 10);
        estoque23.inserirProduto(produto29, (int) (byte) -1);
        boolean boolean37 = estoque23.produtoExiste("");
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto41.setNome("hi!");
        produto41.setPreco((double) 10);
        produto41.setNome("hi!");
        estoque23.inserirProduto(produto41, (-1));
        java.lang.String str50 = produto41.getNome();
        double double51 = produto41.getPreco();
        java.lang.String str52 = produto41.getCodigo();
        estoque0.inserirProduto(produto41, (-102));
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (-5));
        produto3.setPreco((double) (-102));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        produto3.setNome("");
        double double10 = produto3.getPreco();
        produto3.setCodigo("hi!");
        produto3.setPreco((double) (-101));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        java.lang.String str18 = produto10.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getNome();
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double4 = produto3.getPreco();
        double double5 = produto3.getPreco();
        produto3.setPreco((double) (short) 0);
        produto3.setCodigo("hi!");
        java.lang.Class<?> wildcardClass10 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 100L);
        estoque0.inserirProduto(produto15, (int) (short) 10);
        boolean boolean23 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (byte) 0);
        boolean boolean19 = estoque0.produtoExiste("hi!");
        int int21 = estoque0.consultarQuantidade("");
        boolean boolean23 = estoque0.produtoExiste("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("");
        int int18 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        boolean boolean21 = estoque19.produtoExiste("");
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto25.setNome("hi!");
        produto25.setPreco((double) 10);
        estoque19.inserirProduto(produto25, (int) (byte) -1);
        estoque19.removerProduto("hi!", 0);
        estoque19.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str42 = produto41.getCodigo();
        estoque19.inserirProduto(produto41, (int) 'a');
        estoque0.inserirProduto(produto41, 100);
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto50.setNome("hi!");
        produto50.setNome("");
        java.lang.String str55 = produto50.getCodigo();
        double double56 = produto50.getPreco();
        estoque0.inserirProduto(produto50, (int) ' ');
        br.ufrn.imd.Produto produto62 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto62.setNome("hi!");
        produto62.setPreco((double) 10);
        produto62.setNome("hi!");
        produto62.setPreco((double) 'a');
        double double71 = produto62.getPreco();
        estoque0.inserirProduto(produto62, (int) (byte) 1);
        java.lang.String str74 = produto62.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 97.0d + "'", double71 == 97.0d);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-1.0f));
        java.lang.String str4 = produto3.getCodigo();
        produto3.setPreco(32.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        boolean boolean61 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto65.setNome("hi!");
        produto65.setPreco((double) 10);
        java.lang.String str70 = produto65.getNome();
        double double71 = produto65.getPreco();
        java.lang.String str72 = produto65.getCodigo();
        java.lang.String str73 = produto65.getNome();
        estoque0.inserirProduto(produto65, (int) '#');
        produto65.setCodigo("");
        java.lang.String str78 = produto65.getCodigo();
        produto65.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-2) + "'", int59 == (-2));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        estoque0.removerProduto("hi!", (int) (byte) 0);
        boolean boolean29 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", 18);
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-88));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        java.lang.Class<?> wildcardClass62 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-2) + "'", int59 == (-2));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-2) + "'", int61 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        java.lang.String str7 = produto3.getCodigo();
        produto3.setNome("");
        produto3.setCodigo("hi!");
        produto3.setPreco((double) 8);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        java.lang.String str48 = produto31.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto50.setNome("hi!");
        produto50.setPreco((double) 10);
        java.lang.String str55 = produto50.getNome();
        double double56 = produto50.getPreco();
        produto50.setNome("");
        java.lang.String str59 = produto50.getCodigo();
        double double60 = produto50.getPreco();
        produto50.setPreco(34.0d);
        estoque0.inserirProduto(produto50, 96);
        java.lang.String str65 = produto50.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        int int31 = estoque0.consultarQuantidade("hi!");
        int int33 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        int int16 = estoque0.consultarQuantidade("");
        boolean boolean18 = estoque0.produtoExiste("hi!");
        boolean boolean20 = estoque0.produtoExiste("hi!");
        boolean boolean22 = estoque0.produtoExiste("hi!");
        int int24 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) '4');
        boolean boolean29 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (short) 0);
        produto3.setCodigo("");
        java.lang.Class<?> wildcardClass6 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        boolean boolean67 = estoque0.produtoExiste("hi!");
        boolean boolean69 = estoque0.produtoExiste("");
        boolean boolean71 = estoque0.produtoExiste("hi!");
        boolean boolean73 = estoque0.produtoExiste("");
        int int75 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto79 = new br.ufrn.imd.Produto("hi!", "", (double) (short) 100);
        estoque0.inserirProduto(produto79, 104);
        int int83 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 104 + "'", int83 == 104);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", 0.0d);
        produto3.setNome("");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        int int13 = estoque0.consultarQuantidade("");
        boolean boolean15 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) (short) 0);
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto22.setNome("hi!");
        produto22.setPreco((double) 10);
        java.lang.String str27 = produto22.getNome();
        double double28 = produto22.getPreco();
        java.lang.String str29 = produto22.getCodigo();
        java.lang.String str30 = produto22.getNome();
        double double31 = produto22.getPreco();
        produto22.setCodigo("");
        java.lang.String str34 = produto22.getNome();
        estoque0.inserirProduto(produto22, 36);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto40.setNome("hi!");
        produto40.setPreco((double) 10);
        java.lang.String str45 = produto40.getNome();
        double double46 = produto40.getPreco();
        java.lang.String str47 = produto40.getCodigo();
        produto40.setNome("");
        estoque0.inserirProduto(produto40, (-33));
        br.ufrn.imd.Produto produto55 = new br.ufrn.imd.Produto("hi!", "hi!", 52.0d);
        estoque0.inserirProduto(produto55, (int) (byte) 0);
        java.lang.Class<?> wildcardClass58 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 100L);
        estoque0.inserirProduto(produto15, (int) (short) 10);
        java.lang.String str22 = produto15.getCodigo();
        produto15.setNome("hi!");
        produto15.setNome("hi!");
        produto15.setPreco((-10.0d));
        double double29 = produto15.getPreco();
        produto15.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-10.0d) + "'", double29 == (-10.0d));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 100L);
        produto3.setCodigo("hi!");
        produto3.setCodigo("");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        double double14 = produto3.getPreco();
        java.lang.String str15 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto19 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque0.inserirProduto(produto19, (int) (short) 100);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) '4');
        boolean boolean29 = estoque0.produtoExiste("hi!");
        int int31 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("");
        int int18 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        boolean boolean21 = estoque19.produtoExiste("");
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto25.setNome("hi!");
        produto25.setPreco((double) 10);
        estoque19.inserirProduto(produto25, (int) (byte) -1);
        estoque19.removerProduto("hi!", 0);
        estoque19.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str42 = produto41.getCodigo();
        estoque19.inserirProduto(produto41, (int) 'a');
        estoque0.inserirProduto(produto41, 100);
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto50.setNome("hi!");
        produto50.setNome("");
        java.lang.String str55 = produto50.getCodigo();
        double double56 = produto50.getPreco();
        estoque0.inserirProduto(produto50, (int) ' ');
        double double59 = produto50.getPreco();
        produto50.setPreco((double) (-132));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        int int27 = estoque0.consultarQuantidade("");
        int int29 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto34.setCodigo("hi!");
        estoque30.inserirProduto(produto34, (int) (byte) 0);
        estoque30.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto45.setNome("hi!");
        produto45.setPreco((double) 100L);
        estoque30.inserirProduto(produto45, (int) (short) 10);
        boolean boolean53 = estoque30.produtoExiste("hi!");
        br.ufrn.imd.Estoque estoque54 = new br.ufrn.imd.Estoque();
        boolean boolean56 = estoque54.produtoExiste("");
        br.ufrn.imd.Produto produto60 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto60.setNome("hi!");
        produto60.setPreco((double) 10);
        estoque54.inserirProduto(produto60, (int) (byte) -1);
        br.ufrn.imd.Produto produto70 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto70.setNome("hi!");
        produto70.setNome("");
        estoque54.inserirProduto(produto70, 0);
        estoque30.inserirProduto(produto70, (int) (short) 10);
        br.ufrn.imd.Produto produto82 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str83 = produto82.getCodigo();
        produto82.setNome("");
        produto82.setPreco((double) 10);
        produto82.setCodigo("hi!");
        estoque30.inserirProduto(produto82, (-2));
        java.lang.String str92 = produto82.getNome();
        java.lang.String str93 = produto82.getNome();
        estoque0.inserirProduto(produto82, 16);
        boolean boolean97 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 99 + "'", int29 == 99);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        double double6 = produto3.getPreco();
        double double7 = produto3.getPreco();
        java.lang.String str8 = produto3.getNome();
        java.lang.String str9 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 1.0f);
        java.lang.String str4 = produto3.getCodigo();
        java.lang.String str5 = produto3.getNome();
        produto3.setNome("hi!");
        produto3.setPreco((double) 68);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
        java.lang.String str40 = produto28.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        java.lang.Class<?> wildcardClass54 = produto51.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
        int int37 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        produto44.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        boolean boolean6 = estoque0.produtoExiste("hi!");
        boolean boolean8 = estoque0.produtoExiste("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 8);
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
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        int int16 = estoque0.consultarQuantidade("");
        boolean boolean18 = estoque0.produtoExiste("");
        java.lang.Class<?> wildcardClass19 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        int int16 = estoque0.consultarQuantidade("");
        boolean boolean18 = estoque0.produtoExiste("hi!");
        boolean boolean20 = estoque0.produtoExiste("hi!");
        boolean boolean22 = estoque0.produtoExiste("hi!");
        int int24 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) '4');
        int int29 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-53) + "'", int29 == (-53));
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        java.lang.Class<?> wildcardClass73 = produto58.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        estoque0.removerProduto("hi!", (-33));
        boolean boolean30 = estoque0.produtoExiste("hi!");
        int int32 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-68) + "'", int32 == (-68));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (short) 100);
        java.lang.Class<?> wildcardClass4 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getCodigo();
        produto3.setPreco((double) (byte) 1);
        produto3.setPreco(0.0d);
        double double12 = produto3.getPreco();
        produto3.setPreco((double) (short) 10);
        produto3.setPreco((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("");
        int int18 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        boolean boolean21 = estoque19.produtoExiste("");
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto25.setNome("hi!");
        produto25.setPreco((double) 10);
        estoque19.inserirProduto(produto25, (int) (byte) -1);
        estoque19.removerProduto("hi!", 0);
        estoque19.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str42 = produto41.getCodigo();
        estoque19.inserirProduto(produto41, (int) 'a');
        estoque0.inserirProduto(produto41, 100);
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto50.setNome("hi!");
        produto50.setNome("");
        java.lang.String str55 = produto50.getCodigo();
        double double56 = produto50.getPreco();
        estoque0.inserirProduto(produto50, (int) ' ');
        java.lang.Class<?> wildcardClass59 = produto50.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (-63.0d));
        java.lang.String str4 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        estoque0.removerProduto("hi!", (int) 'a');
        int int48 = estoque0.consultarQuantidade("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-132) + "'", int48 == (-132));
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) '#');
        produto3.setPreco(10.0d);
        produto3.setPreco((double) 68);
        java.lang.Class<?> wildcardClass8 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-200));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 97.0d + "'", double52 == 97.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        boolean boolean51 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("");
        int int18 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        boolean boolean21 = estoque19.produtoExiste("");
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto25.setNome("hi!");
        produto25.setPreco((double) 10);
        estoque19.inserirProduto(produto25, (int) (byte) -1);
        estoque19.removerProduto("hi!", 0);
        estoque19.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str42 = produto41.getCodigo();
        estoque19.inserirProduto(produto41, (int) 'a');
        estoque0.inserirProduto(produto41, 100);
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto50.setNome("hi!");
        produto50.setNome("");
        java.lang.String str55 = produto50.getCodigo();
        double double56 = produto50.getPreco();
        estoque0.inserirProduto(produto50, (int) ' ');
        br.ufrn.imd.Produto produto62 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto62.setNome("hi!");
        produto62.setNome("");
        produto62.setPreco(1.0d);
        java.lang.String str69 = produto62.getCodigo();
        java.lang.String str70 = produto62.getNome();
        produto62.setNome("");
        estoque0.inserirProduto(produto62, 0);
        boolean boolean76 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        produto59.setPreco((double) 8);
        java.lang.Class<?> wildcardClass68 = produto59.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        java.lang.String str30 = produto22.getNome();
        double double31 = produto22.getPreco();
        java.lang.String str32 = produto22.getCodigo();
        produto22.setCodigo("");
        java.lang.Class<?> wildcardClass35 = produto22.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 68);
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (byte) 0);
        boolean boolean19 = estoque0.produtoExiste("hi!");
        boolean boolean21 = estoque0.produtoExiste("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque5 = new br.ufrn.imd.Estoque();
        boolean boolean7 = estoque5.produtoExiste("");
        br.ufrn.imd.Produto produto11 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto11.setNome("hi!");
        produto11.setPreco((double) 10);
        estoque5.inserirProduto(produto11, (int) (byte) -1);
        estoque5.removerProduto("hi!", 0);
        int int22 = estoque5.consultarQuantidade("");
        br.ufrn.imd.Produto produto26 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque5.inserirProduto(produto26, (int) (byte) 100);
        int int30 = estoque5.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque31 = new br.ufrn.imd.Estoque();
        boolean boolean33 = estoque31.produtoExiste("");
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto37.setNome("hi!");
        produto37.setPreco((double) 10);
        estoque31.inserirProduto(produto37, (int) (byte) -1);
        int int45 = estoque31.consultarQuantidade("");
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto49.setNome("");
        estoque31.inserirProduto(produto49, (int) (byte) 10);
        boolean boolean55 = estoque31.produtoExiste("");
        br.ufrn.imd.Produto produto59 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto59.setNome("");
        produto59.setNome("hi!");
        produto59.setNome("");
        estoque31.inserirProduto(produto59, 9);
        estoque5.inserirProduto(produto59, (-63));
        estoque0.inserirProduto(produto59, (int) (byte) 0);
        produto59.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        boolean boolean61 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto65.setNome("hi!");
        produto65.setPreco((double) 10);
        java.lang.String str70 = produto65.getNome();
        double double71 = produto65.getPreco();
        java.lang.String str72 = produto65.getCodigo();
        java.lang.String str73 = produto65.getNome();
        estoque0.inserirProduto(produto65, (int) '#');
        br.ufrn.imd.Produto produto79 = new br.ufrn.imd.Produto("", "", (double) 1L);
        produto79.setPreco((double) 'a');
        estoque0.inserirProduto(produto79, 10);
        estoque0.removerProduto("", 35);
        java.lang.Class<?> wildcardClass87 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-2) + "'", int59 == (-2));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        int int64 = estoque0.consultarQuantidade("hi!");
        boolean boolean66 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 28 + "'", int64 == 28);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 0);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto50.setNome("hi!");
        produto50.setPreco((double) 10);
        java.lang.String str55 = produto50.getNome();
        double double56 = produto50.getPreco();
        produto50.setNome("");
        java.lang.String str59 = produto50.getCodigo();
        double double60 = produto50.getPreco();
        produto50.setPreco(34.0d);
        estoque0.inserirProduto(produto50, 96);
        produto50.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto18.setPreco((double) '#');
        produto18.setPreco((double) 10);
        java.lang.String str23 = produto18.getNome();
        produto18.setPreco(0.0d);
        estoque0.inserirProduto(produto18, (-2));
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto31.setPreco((double) '#');
        estoque0.inserirProduto(produto31, 100);
        produto31.setPreco((double) (-2));
        double double38 = produto31.getPreco();
        java.lang.String str39 = produto31.getNome();
        produto31.setPreco(97.0d);
        produto31.setPreco((double) '#');
        double double44 = produto31.getPreco();
        produto31.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-2.0d) + "'", double38 == (-2.0d));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 35.0d + "'", double44 == 35.0d);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-99));
        java.lang.Class<?> wildcardClass4 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (-11.0d));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
        produto21.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (byte) 0);
        boolean boolean19 = estoque0.produtoExiste("hi!");
        int int21 = estoque0.consultarQuantidade("");
        boolean boolean23 = estoque0.produtoExiste("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-99));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setPreco((double) 54);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 100L);
        produto3.setNome("hi!");
        produto3.setPreco((double) 0L);
        produto3.setCodigo("hi!");
        produto3.setNome("");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
        java.lang.Class<?> wildcardClass23 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        int int26 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-3) + "'", int26 == (-3));
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-99));
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
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (short) 0);
        produto3.setPreco((double) 36);
        java.lang.String str6 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto3.setNome("");
        java.lang.String str6 = produto3.getCodigo();
        double double7 = produto3.getPreco();
        double double8 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double4 = produto3.getPreco();
        produto3.setNome("");
        java.lang.Class<?> wildcardClass7 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        java.lang.String str58 = produto47.getNome();
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
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        int int47 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque48 = new br.ufrn.imd.Estoque();
        boolean boolean50 = estoque48.produtoExiste("");
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto54.setNome("hi!");
        produto54.setPreco((double) 10);
        estoque48.inserirProduto(produto54, (int) (byte) -1);
        int int62 = estoque48.consultarQuantidade("");
        br.ufrn.imd.Produto produto66 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto66.setNome("");
        estoque48.inserirProduto(produto66, (int) (byte) 10);
        boolean boolean72 = estoque48.produtoExiste("");
        br.ufrn.imd.Produto produto76 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto76.setNome("");
        produto76.setNome("hi!");
        produto76.setNome("");
        estoque48.inserirProduto(produto76, 9);
        br.ufrn.imd.Produto produto88 = new br.ufrn.imd.Produto("", "", (double) '#');
        estoque48.inserirProduto(produto88, (-1));
        produto88.setNome("hi!");
        estoque0.inserirProduto(produto88, 9);
        int int96 = estoque0.consultarQuantidade("");
        int int98 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 9 + "'", int96 == 9);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 9 + "'", int98 == 9);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        estoque0.removerProduto("hi!", (int) 'a');
        int int48 = estoque0.consultarQuantidade("hi!");
        boolean boolean50 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-132) + "'", int48 == (-132));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        produto44.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        produto3.setNome("");
        double double10 = produto3.getPreco();
        produto3.setNome("");
        double double13 = produto3.getPreco();
        produto3.setNome("");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        int int58 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 36);
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 8 + "'", int58 == 8);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        estoque0.removerProduto("", 116);
        int int58 = estoque0.consultarQuantidade("");
        java.lang.Class<?> wildcardClass59 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-116) + "'", int58 == (-116));
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        produto25.setPreco((double) (short) 100);
        java.lang.String str36 = produto25.getNome();
        java.lang.Class<?> wildcardClass37 = produto25.getClass();
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        java.lang.String str31 = produto21.getNome();
        produto21.setNome("");
        produto21.setCodigo("");
        java.lang.String str36 = produto21.getNome();
        java.lang.String str37 = produto21.getCodigo();
        produto21.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        produto3.setNome("");
        produto3.setNome("hi!");
        java.lang.String str15 = produto3.getCodigo();
        java.lang.String str16 = produto3.getNome();
        produto3.setNome("");
        java.lang.String str19 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        int int37 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque38 = new br.ufrn.imd.Estoque();
        boolean boolean40 = estoque38.produtoExiste("");
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto44.setNome("hi!");
        produto44.setPreco((double) 10);
        estoque38.inserirProduto(produto44, (int) (byte) -1);
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto54.setNome("hi!");
        produto54.setNome("");
        estoque38.inserirProduto(produto54, 0);
        java.lang.String str61 = produto54.getCodigo();
        produto54.setPreco(0.0d);
        estoque0.inserirProduto(produto54, 166);
        java.lang.Class<?> wildcardClass66 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        produto19.setPreco((double) 109);
        double double27 = produto19.getPreco();
        java.lang.Class<?> wildcardClass28 = produto19.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 109.0d + "'", double27 == 109.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-1L));
        produto3.setNome("");
        double double6 = produto3.getPreco();
        java.lang.String str7 = produto3.getCodigo();
        produto3.setPreco(10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        double double38 = produto31.getPreco();
        produto31.setNome("hi!");
        produto31.setPreco((double) 30);
        java.lang.String str43 = produto31.getNome();
        java.lang.String str44 = produto31.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 35.0d + "'", double38 == 35.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        boolean boolean46 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", 28);
        estoque0.removerProduto("", 104);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (-36));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getNome();
        produto3.setPreco((double) '4');
        produto3.setNome("");
        java.lang.String str16 = produto3.getCodigo();
        java.lang.String str17 = produto3.getNome();
        produto3.setPreco(32.0d);
        java.lang.Class<?> wildcardClass20 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        int int16 = estoque0.consultarQuantidade("");
        boolean boolean18 = estoque0.produtoExiste("hi!");
        boolean boolean20 = estoque0.produtoExiste("hi!");
        int int22 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque23 = new br.ufrn.imd.Estoque();
        boolean boolean25 = estoque23.produtoExiste("");
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto29.setNome("hi!");
        produto29.setPreco((double) 10);
        estoque23.inserirProduto(produto29, (int) (byte) -1);
        estoque23.removerProduto("hi!", 0);
        estoque23.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str46 = produto45.getCodigo();
        estoque23.inserirProduto(produto45, (int) 'a');
        boolean boolean50 = estoque23.produtoExiste("hi!");
        estoque23.removerProduto("", 10);
        estoque23.removerProduto("", (-33));
        boolean boolean58 = estoque23.produtoExiste("");
        br.ufrn.imd.Produto produto62 = new br.ufrn.imd.Produto("", "", (double) (short) -1);
        estoque23.inserirProduto(produto62, 99);
        estoque0.inserirProduto(produto62, (int) '4');
        br.ufrn.imd.Produto produto70 = new br.ufrn.imd.Produto("", "hi!", (double) (short) 100);
        produto70.setCodigo("");
        produto70.setPreco(10.0d);
        produto70.setCodigo("");
        estoque0.inserirProduto(produto70, (int) '#');
        produto70.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 100L);
        estoque0.inserirProduto(produto15, (int) (short) 10);
        java.lang.String str22 = produto15.getCodigo();
        produto15.setNome("hi!");
        produto15.setNome("hi!");
        java.lang.String str27 = produto15.getCodigo();
        produto15.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        java.lang.String str4 = produto3.getCodigo();
        double double5 = produto3.getPreco();
        java.lang.String str6 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.String str9 = produto3.getNome();
        double double10 = produto3.getPreco();
        double double11 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        java.lang.Class<?> wildcardClass70 = estoque0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 10.0f);
        produto3.setPreco((-1.0d));
        java.lang.Class<?> wildcardClass6 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (-91));
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        int int37 = estoque0.consultarQuantidade("hi!");
        boolean boolean39 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (-2));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        estoque36.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto57 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto57.setNome("hi!");
        produto57.setPreco((double) 10);
        java.lang.String str62 = produto57.getNome();
        double double63 = produto57.getPreco();
        java.lang.String str64 = produto57.getCodigo();
        produto57.setCodigo("hi!");
        java.lang.String str67 = produto57.getCodigo();
        java.lang.String str68 = produto57.getCodigo();
        java.lang.String str69 = produto57.getCodigo();
        estoque36.inserirProduto(produto57, 8);
        estoque0.inserirProduto(produto57, (-33));
        br.ufrn.imd.Produto produto74 = null;
        // The following exception was thrown during execution in test generation
        try {
            estoque0.inserirProduto(produto74, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        int int64 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto68 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto68.setNome("hi!");
        produto68.setNome("");
        produto68.setPreco(1.0d);
        java.lang.String str75 = produto68.getCodigo();
        double double76 = produto68.getPreco();
        produto68.setNome("");
        produto68.setCodigo("hi!");
        produto68.setNome("hi!");
        produto68.setPreco((double) (short) 1);
        estoque0.inserirProduto(produto68, 166);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-102) + "'", int64 == (-102));
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (-101.0d));
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
        boolean boolean23 = estoque0.produtoExiste("");
        java.lang.Class<?> wildcardClass24 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        produto16.setCodigo("");
        produto16.setPreco((double) 1.0f);
        java.lang.String str29 = produto16.getNome();
        produto16.setPreco((double) '4');
        produto16.setNome("hi!");
        double double34 = produto16.getPreco();
        produto16.setPreco((double) (-68));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 52.0d + "'", double34 == 52.0d);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-150));
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        boolean boolean42 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque43 = new br.ufrn.imd.Estoque();
        boolean boolean45 = estoque43.produtoExiste("");
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto49.setNome("hi!");
        produto49.setPreco((double) 10);
        estoque43.inserirProduto(produto49, (int) (byte) -1);
        int int57 = estoque43.consultarQuantidade("");
        estoque43.removerProduto("hi!", (int) (byte) 0);
        boolean boolean62 = estoque43.produtoExiste("hi!");
        br.ufrn.imd.Produto produto66 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto66.setNome("hi!");
        produto66.setPreco((double) 10);
        produto66.setNome("hi!");
        produto66.setPreco((double) 'a');
        produto66.setNome("");
        produto66.setNome("");
        produto66.setPreco(0.0d);
        produto66.setCodigo("");
        java.lang.String str83 = produto66.getCodigo();
        estoque43.inserirProduto(produto66, 34);
        java.lang.String str86 = produto66.getCodigo();
        estoque0.inserirProduto(produto66, 109);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) '4');
        produto3.setCodigo("");
        double double6 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 19);
        java.lang.Class<?> wildcardClass4 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        boolean boolean87 = estoque0.produtoExiste("");
        boolean boolean89 = estoque0.produtoExiste("");
        int int91 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.0d + "'", double83 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 100 + "'", int91 == 100);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        produto49.setCodigo("hi!");
        java.lang.String str54 = produto49.getNome();
        java.lang.String str55 = produto49.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        int int48 = estoque0.consultarQuantidade("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setCodigo("hi!");
        produto3.setCodigo("hi!");
        produto3.setPreco((double) (-90));
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        estoque0.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        estoque0.inserirProduto(produto34, (int) (byte) 10);
        java.lang.String str37 = produto34.getNome();
        produto34.setPreco((double) 35);
        java.lang.String str40 = produto34.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
        double double34 = produto25.getPreco();
        double double35 = produto25.getPreco();
        java.lang.String str36 = produto25.getNome();
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) 'a');
        boolean boolean20 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto24 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double25 = produto24.getPreco();
        java.lang.String str26 = produto24.getCodigo();
        java.lang.String str27 = produto24.getNome();
        produto24.setNome("hi!");
        estoque0.inserirProduto(produto24, 18);
        estoque0.removerProduto("hi!", 8);
        br.ufrn.imd.Produto produto38 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto38.setNome("");
        java.lang.String str41 = produto38.getCodigo();
        java.lang.String str42 = produto38.getCodigo();
        estoque0.inserirProduto(produto38, (int) '4');
        int int46 = estoque0.consultarQuantidade("hi!");
        boolean boolean48 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-36) + "'", int46 == (-36));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        java.lang.String str30 = produto16.getNome();
        produto16.setPreco((double) 33);
        produto16.setPreco((-10.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        java.lang.String str46 = produto33.getCodigo();
        produto33.setNome("");
        java.lang.Class<?> wildcardClass49 = produto33.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        double double69 = produto54.getPreco();
        java.lang.String str70 = produto54.getNome();
        java.lang.String str71 = produto54.getCodigo();
        java.lang.String str72 = produto54.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-63.0d) + "'", double69 == (-63.0d));
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        java.lang.String str81 = produto66.getCodigo();
        java.lang.String str82 = produto66.getNome();
        produto66.setCodigo("hi!");
        produto66.setCodigo("");
        java.lang.String str87 = produto66.getCodigo();
        java.lang.String str88 = produto66.getNome();
        estoque0.inserirProduto(produto66, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
        boolean boolean92 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto96 = new br.ufrn.imd.Produto("", "hi!", (double) (-98));
        estoque0.inserirProduto(produto96, 30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 10.0d + "'", double86 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        estoque0.removerProduto("hi!", 0);
        boolean boolean27 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto31.setNome("hi!");
        produto31.setNome("");
        produto31.setPreco((double) 'a');
        java.lang.String str38 = produto31.getCodigo();
        produto31.setCodigo("hi!");
        estoque0.inserirProduto(produto31, (-2));
        double double43 = produto31.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 97.0d + "'", double43 == 97.0d);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
        produto16.setNome("hi!");
        produto16.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        produto47.setNome("hi!");
        double double55 = produto47.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 100.0d + "'", double55 == 100.0d);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (short) -1);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        produto3.setPreco((double) 68);
        java.lang.String str10 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setNome("hi!");
        double double9 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setCodigo("");
        produto3.setPreco((double) 99);
        java.lang.Class<?> wildcardClass16 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        br.ufrn.imd.Produto produto12 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto12.setNome("hi!");
        produto12.setNome("");
        produto12.setPreco(1.0d);
        estoque0.inserirProduto(produto12, 100);
        boolean boolean22 = estoque0.produtoExiste("hi!");
        boolean boolean24 = estoque0.produtoExiste("");
        int int26 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        java.lang.String str23 = produto12.getNome();
        produto12.setCodigo("");
        java.lang.Class<?> wildcardClass26 = produto12.getClass();
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        estoque0.removerProduto("hi!", 32);
        java.lang.Class<?> wildcardClass26 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
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
            estoque0.removerProduto("", (-36));
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
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (byte) 0);
        boolean boolean19 = estoque0.produtoExiste("");
        boolean boolean21 = estoque0.produtoExiste("hi!");
        int int23 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        produto47.setNome("hi!");
        produto47.setNome("hi!");
        produto47.setPreco((double) (-99));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        produto46.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        java.lang.String str76 = produto71.getCodigo();
        java.lang.String str77 = produto71.getCodigo();
        produto71.setCodigo("hi!");
        produto71.setPreco((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        java.lang.String str27 = produto16.getCodigo();
        java.lang.String str28 = produto16.getCodigo();
        java.lang.String str29 = produto16.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
        produto47.setNome("hi!");
        produto47.setNome("");
        produto47.setCodigo("hi!");
        produto47.setPreco((-101.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-1L));
        produto3.setCodigo("hi!");
        produto3.setNome("hi!");
        java.lang.String str8 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        produto59.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 100.0d + "'", double60 == 100.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        int int6 = estoque0.consultarQuantidade("");
        int int8 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto12 = new br.ufrn.imd.Produto("", "hi!", (double) (short) 100);
        produto12.setCodigo("");
        produto12.setPreco(10.0d);
        produto12.setCodigo("hi!");
        estoque0.inserirProduto(produto12, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = produto12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        produto41.setNome("hi!");
        java.lang.Class<?> wildcardClass47 = produto41.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        int int40 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto3.setNome("");
        produto3.setNome("hi!");
        produto3.setCodigo("");
        java.lang.String str10 = produto3.getNome();
        double double11 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        produto3.setPreco(0.0d);
        produto3.setCodigo("hi!");
        produto3.setPreco((double) 8);
        java.lang.String str15 = produto3.getNome();
        java.lang.Class<?> wildcardClass16 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        estoque0.removerProduto("hi!", (int) (short) 100);
        java.lang.Class<?> wildcardClass44 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) -1);
        java.lang.String str4 = produto3.getNome();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        produto63.setPreco(0.0d);
        java.lang.Class<?> wildcardClass80 = produto63.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
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
        produto51.setCodigo("");
        java.lang.String str56 = produto51.getCodigo();
        java.lang.String str57 = produto51.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 0L);
        produto3.setPreco((-11.0d));
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        int int22 = estoque0.consultarQuantidade("");
        int int24 = estoque0.consultarQuantidade("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        java.lang.Class<?> wildcardClass74 = produto65.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 'a');
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        java.lang.Class<?> wildcardClass28 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (byte) 10);
        produto3.setNome("");
        java.lang.Class<?> wildcardClass6 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        int int16 = estoque0.consultarQuantidade("");
        boolean boolean18 = estoque0.produtoExiste("hi!");
        boolean boolean20 = estoque0.produtoExiste("hi!");
        int int22 = estoque0.consultarQuantidade("hi!");
        int int24 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
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
        boolean boolean32 = estoque0.produtoExiste("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 109);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        int int24 = estoque0.consultarQuantidade("");
        int int26 = estoque0.consultarQuantidade("");
        java.lang.Class<?> wildcardClass27 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", 35.0d);
        double double4 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 100L);
        produto3.setCodigo("hi!");
        produto3.setNome("");
        produto3.setCodigo("hi!");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto3.setCodigo("hi!");
        produto3.setNome("");
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        produto19.setPreco(35.0d);
        java.lang.Class<?> wildcardClass26 = produto19.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
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
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("hi!", "", (double) (byte) 1);
        java.lang.String str48 = produto47.getCodigo();
        produto47.setNome("hi!");
        produto47.setCodigo("hi!");
        estoque0.inserirProduto(produto47, 16);
        java.lang.Class<?> wildcardClass55 = estoque0.getClass();
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
        int int27 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (short) 100);
        estoque0.inserirProduto(produto31, 10);
        int int35 = estoque0.consultarQuantidade("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-82));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
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
        produto19.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto46.setCodigo("hi!");
        estoque42.inserirProduto(produto46, (int) (byte) 0);
        estoque42.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto57 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto57.setNome("hi!");
        produto57.setPreco((double) 100L);
        estoque42.inserirProduto(produto57, (int) (short) 10);
        br.ufrn.imd.Produto produto67 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double68 = produto67.getPreco();
        produto67.setNome("hi!");
        java.lang.String str71 = produto67.getNome();
        produto67.setCodigo("hi!");
        estoque42.inserirProduto(produto67, (int) (short) 100);
        estoque0.inserirProduto(produto67, (int) (short) 100);
        boolean boolean79 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (-116));
        int int84 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 100.0d + "'", double68 == 100.0d);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        boolean boolean59 = estoque0.produtoExiste("hi!");
        int int61 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 8);
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-108));
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
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-2) + "'", int61 == (-2));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        br.ufrn.imd.Produto produto69 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto69.setNome("hi!");
        produto69.setNome("");
        produto69.setPreco(1.0d);
        java.lang.String str76 = produto69.getCodigo();
        double double77 = produto69.getPreco();
        produto69.setPreco((double) 10L);
        estoque0.inserirProduto(produto69, 68);
        int int83 = estoque0.consultarQuantidade("");
        boolean boolean85 = estoque0.produtoExiste("");
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
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.0d + "'", double77 == 1.0d);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 97 + "'", int83 == 97);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setNome("");
        java.lang.String str13 = produto3.getCodigo();
        produto3.setNome("");
        produto3.setPreco((-91.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
        boolean boolean40 = estoque0.produtoExiste("");
        int int42 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 86 + "'", int42 == 86);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        int int37 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 68);
        estoque0.removerProduto("hi!", (-63));
        java.lang.Class<?> wildcardClass44 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
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
        estoque0.removerProduto("hi!", 99);
        boolean boolean43 = estoque0.produtoExiste("");
        boolean boolean45 = estoque0.produtoExiste("hi!");
        int int47 = estoque0.consultarQuantidade("hi!");
        int int49 = estoque0.consultarQuantidade("hi!");
        boolean boolean51 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-4) + "'", int47 == (-4));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-4) + "'", int49 == (-4));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-108));
        java.lang.Class<?> wildcardClass4 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2) + "'", int29 == (-2));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        int int71 = estoque0.consultarQuantidade("hi!");
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
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-97) + "'", int71 == (-97));
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
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
        java.lang.Class<?> wildcardClass36 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        boolean boolean40 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
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
        double double27 = produto12.getPreco();
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", 109.0d);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setCodigo("hi!");
        produto3.setCodigo("");
        double double8 = produto3.getPreco();
        produto3.setCodigo("hi!");
        java.lang.String str11 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
        estoque0.removerProduto("hi!", (int) (short) 10);
        br.ufrn.imd.Produto produto55 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto55.setNome("");
        java.lang.String str58 = produto55.getCodigo();
        double double59 = produto55.getPreco();
        double double60 = produto55.getPreco();
        produto55.setNome("hi!");
        produto55.setCodigo("hi!");
        estoque0.inserirProduto(produto55, 9);
        produto55.setPreco((double) 10L);
        double double69 = produto55.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        int int66 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("", (-90));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-102) + "'", int66 == (-102));
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
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
        int int42 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 9 + "'", int42 == 9);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
        estoque0.removerProduto("", (-200));
        estoque0.removerProduto("", (int) (short) 0);
        int int78 = estoque0.consultarQuantidade("");
        int int80 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (-97));
        int int85 = estoque0.consultarQuantidade("");
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
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
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
        br.ufrn.imd.Produto produto22 = null;
        // The following exception was thrown during execution in test generation
        try {
            estoque0.inserirProduto(produto22, 79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
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
        java.lang.Class<?> wildcardClass86 = estoque0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        java.lang.String str66 = produto46.getCodigo();
        produto46.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        java.lang.String str13 = produto6.getCodigo();
        produto6.setPreco((-108.0d));
        java.lang.String str16 = produto6.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
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
        produto28.setNome("hi!");
        produto28.setPreco((double) 33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 96);
        produto3.setNome("hi!");
        produto3.setNome("hi!");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        int int23 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 1);
        int int28 = estoque0.consultarQuantidade("hi!");
        int int30 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-101) + "'", int23 == (-101));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-102) + "'", int28 == (-102));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-102) + "'", int30 == (-102));
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        java.lang.Class<?> wildcardClass25 = produto19.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
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
        produto15.setPreco((double) (-200));
        produto15.setPreco((double) (-13));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        boolean boolean53 = estoque0.produtoExiste("hi!");
        int int55 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto3.setNome("");
        java.lang.String str6 = produto3.getNome();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        br.ufrn.imd.Produto produto12 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto12.setNome("hi!");
        produto12.setNome("");
        produto12.setPreco(1.0d);
        estoque0.inserirProduto(produto12, 100);
        boolean boolean22 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque23 = new br.ufrn.imd.Estoque();
        boolean boolean25 = estoque23.produtoExiste("");
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto29.setNome("hi!");
        produto29.setPreco((double) 10);
        estoque23.inserirProduto(produto29, (int) (byte) -1);
        int int37 = estoque23.consultarQuantidade("");
        boolean boolean39 = estoque23.produtoExiste("");
        boolean boolean41 = estoque23.produtoExiste("");
        br.ufrn.imd.Estoque estoque42 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto46.setCodigo("hi!");
        estoque42.inserirProduto(produto46, (int) (byte) 0);
        estoque23.inserirProduto(produto46, 1);
        br.ufrn.imd.Produto produto56 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto56.setPreco((double) '#');
        produto56.setPreco((double) 10);
        java.lang.String str61 = produto56.getNome();
        produto56.setPreco(0.0d);
        java.lang.String str64 = produto56.getNome();
        estoque23.inserirProduto(produto56, (int) (short) -1);
        produto56.setPreco((double) (-63));
        java.lang.String str69 = produto56.getCodigo();
        estoque0.inserirProduto(produto56, (int) ' ');
        boolean boolean73 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto77 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double78 = produto77.getPreco();
        produto77.setNome("hi!");
        java.lang.String str81 = produto77.getNome();
        produto77.setCodigo("hi!");
        estoque0.inserirProduto(produto77, (int) (byte) 0);
        java.lang.Class<?> wildcardClass86 = produto77.getClass();
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 100.0d + "'", double78 == 100.0d);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        produto59.setPreco((double) 97);
        produto59.setNome("hi!");
        produto59.setNome("");
        java.lang.String str72 = produto59.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 100.0f);
        produto3.setCodigo("");
        produto3.setNome("hi!");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
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
        double double34 = produto25.getPreco();
        produto25.setPreco((double) (-4));
        java.lang.String str37 = produto25.getCodigo();
        double double38 = produto25.getPreco();
        produto25.setNome("");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-4.0d) + "'", double38 == (-4.0d));
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 36);
        produto3.setNome("");
        produto3.setCodigo("hi!");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        int int16 = estoque0.consultarQuantidade("");
        boolean boolean18 = estoque0.produtoExiste("hi!");
        boolean boolean20 = estoque0.produtoExiste("hi!");
        int int22 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque23 = new br.ufrn.imd.Estoque();
        boolean boolean25 = estoque23.produtoExiste("");
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto29.setNome("hi!");
        produto29.setPreco((double) 10);
        estoque23.inserirProduto(produto29, (int) (byte) -1);
        estoque23.removerProduto("hi!", 0);
        estoque23.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str46 = produto45.getCodigo();
        estoque23.inserirProduto(produto45, (int) 'a');
        boolean boolean50 = estoque23.produtoExiste("hi!");
        estoque23.removerProduto("", 10);
        estoque23.removerProduto("", (-33));
        boolean boolean58 = estoque23.produtoExiste("");
        br.ufrn.imd.Produto produto62 = new br.ufrn.imd.Produto("", "", (double) (short) -1);
        estoque23.inserirProduto(produto62, 99);
        estoque0.inserirProduto(produto62, (int) '4');
        produto62.setNome("");
        produto62.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto3.setNome("");
        java.lang.String str6 = produto3.getNome();
        produto3.setPreco(1.0d);
        produto3.setNome("hi!");
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setPreco((double) (byte) 0);
        java.lang.String str9 = produto3.getCodigo();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setPreco((double) 100.0f);
        double double13 = produto3.getPreco();
        double double14 = produto3.getPreco();
        java.lang.Class<?> wildcardClass15 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
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
        produto55.setNome("");
        produto55.setPreco((double) (-91));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
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
        boolean boolean35 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque36 = new br.ufrn.imd.Estoque();
        boolean boolean38 = estoque36.produtoExiste("");
        br.ufrn.imd.Produto produto42 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto42.setNome("hi!");
        produto42.setPreco((double) 10);
        estoque36.inserirProduto(produto42, (int) (byte) -1);
        int int50 = estoque36.consultarQuantidade("");
        boolean boolean52 = estoque36.produtoExiste("");
        boolean boolean54 = estoque36.produtoExiste("");
        br.ufrn.imd.Estoque estoque55 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto59 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto59.setCodigo("hi!");
        estoque55.inserirProduto(produto59, (int) (byte) 0);
        estoque36.inserirProduto(produto59, 1);
        br.ufrn.imd.Produto produto69 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto69.setPreco((double) '#');
        produto69.setPreco((double) 10);
        java.lang.String str74 = produto69.getNome();
        produto69.setPreco(0.0d);
        java.lang.String str77 = produto69.getNome();
        estoque36.inserirProduto(produto69, (int) (short) -1);
        boolean boolean81 = estoque36.produtoExiste("");
        br.ufrn.imd.Produto produto85 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 0);
        estoque36.inserirProduto(produto85, (int) (byte) 1);
        java.lang.String str88 = produto85.getCodigo();
        estoque0.inserirProduto(produto85, 70);
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-53));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        int int54 = estoque0.consultarQuantidade("");
        boolean boolean56 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (-99));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        boolean boolean23 = estoque0.produtoExiste("hi!");
        int int25 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
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
        java.lang.String str28 = produto16.getNome();
        double double29 = produto16.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setNome("hi!");
        produto3.setCodigo("hi!");
        java.lang.String str11 = produto3.getCodigo();
        java.lang.String str12 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
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
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "hi!", (double) 100.0f);
        produto41.setCodigo("");
        estoque0.inserirProduto(produto41, (-36));
        java.lang.String str46 = produto41.getNome();
        double double47 = produto41.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setPreco((double) 10L);
        java.lang.String str14 = produto3.getCodigo();
        produto3.setNome("hi!");
        java.lang.Class<?> wildcardClass17 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        produto47.setNome("hi!");
        produto47.setNome("");
        produto47.setPreco(1.0d);
        produto47.setCodigo("");
        produto47.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        java.lang.String str44 = produto28.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
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
        java.lang.String str26 = produto19.getCodigo();
        java.lang.String str27 = produto19.getCodigo();
        double double28 = produto19.getPreco();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
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
        br.ufrn.imd.Produto produto66 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double67 = produto66.getPreco();
        java.lang.String str68 = produto66.getCodigo();
        java.lang.String str69 = produto66.getNome();
        produto66.setCodigo("");
        double double72 = produto66.getPreco();
        java.lang.String str73 = produto66.getCodigo();
        produto66.setNome("hi!");
        java.lang.String str76 = produto66.getNome();
        java.lang.String str77 = produto66.getNome();
        estoque0.inserirProduto(produto66, (int) '4');
        int int81 = estoque0.consultarQuantidade("");
        boolean boolean83 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 100.0d + "'", double67 == 100.0d);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 100.0d + "'", double72 == 100.0d);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 104 + "'", int81 == 104);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 34);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (-100.0d));
        java.lang.String str4 = produto3.getCodigo();
        double double5 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-100.0d) + "'", double5 == (-100.0d));
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (short) 10);
        double double4 = produto3.getPreco();
        produto3.setCodigo("");
        produto3.setNome("hi!");
        produto3.setNome("");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        double double10 = produto3.getPreco();
        produto3.setCodigo("hi!");
        double double13 = produto3.getPreco();
        java.lang.String str14 = produto3.getNome();
        java.lang.String str15 = produto3.getCodigo();
        produto3.setNome("hi!");
        double double18 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (byte) 0);
        java.lang.String str4 = produto3.getCodigo();
        java.lang.String str5 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        boolean boolean32 = estoque0.produtoExiste("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco((double) 10L);
        java.lang.String str10 = produto3.getCodigo();
        java.lang.Class<?> wildcardClass11 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getCodigo();
        produto3.setPreco((double) (short) -1);
        double double9 = produto3.getPreco();
        produto3.setCodigo("");
        double double12 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
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
        produto19.setPreco((double) 1);
        java.lang.String str36 = produto19.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
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
        br.ufrn.imd.Produto produto48 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double49 = produto48.getPreco();
        produto48.setNome("hi!");
        java.lang.String str52 = produto48.getCodigo();
        produto48.setCodigo("hi!");
        produto48.setPreco(97.0d);
        estoque0.inserirProduto(produto48, (-100));
        java.lang.Class<?> wildcardClass59 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-63) + "'", int44 == (-63));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto18 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto18.setPreco((double) '#');
        produto18.setPreco((double) 10);
        java.lang.String str23 = produto18.getNome();
        produto18.setPreco(0.0d);
        estoque0.inserirProduto(produto18, (-2));
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto31.setPreco((double) '#');
        estoque0.inserirProduto(produto31, 100);
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto39.setNome("hi!");
        produto39.setNome("");
        produto39.setPreco(1.0d);
        estoque0.inserirProduto(produto39, (-11));
        java.lang.Class<?> wildcardClass48 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", 116.0d);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        double double14 = produto3.getPreco();
        java.lang.String str15 = produto3.getCodigo();
        produto3.setPreco((double) (-200));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) ' ');
        java.lang.String str4 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        boolean boolean29 = estoque0.produtoExiste("hi!");
        int int31 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        produto3.setNome("");
        java.lang.String str11 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        int int6 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto10 = new br.ufrn.imd.Produto("hi!", "", (double) 9);
        estoque0.inserirProduto(produto10, (int) '#');
        int int14 = estoque0.consultarQuantidade("hi!");
        java.lang.Class<?> wildcardClass15 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (-78.0d));
        java.lang.String str4 = produto3.getCodigo();
        java.lang.String str5 = produto3.getCodigo();
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 0.0f);
        produto3.setPreco(97.0d);
        java.lang.String str6 = produto3.getNome();
        produto3.setCodigo("");
        produto3.setPreco((double) (-102));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setCodigo("hi!");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        java.lang.String str13 = produto6.getCodigo();
        produto6.setPreco((double) (short) 1);
        double double16 = produto6.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 116.0d);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        produto44.setPreco((double) (-36));
        java.lang.String str53 = produto44.getNome();
        produto44.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "", (double) 100L);
        estoque0.inserirProduto(produto22, 68);
        int int26 = estoque0.consultarQuantidade("hi!");
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
        java.lang.String str50 = produto43.getCodigo();
        double double51 = produto43.getPreco();
        double double52 = produto43.getPreco();
        java.lang.String str53 = produto43.getNome();
        produto43.setCodigo("");
        produto43.setNome("");
        double double58 = produto43.getPreco();
        produto43.setNome("");
        estoque0.inserirProduto(produto43, (-5));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (byte) 1);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("hi!");
        produto3.setCodigo("hi!");
        java.lang.String str9 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        int int6 = estoque0.consultarQuantidade("");
        int int8 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto12 = new br.ufrn.imd.Produto("", "hi!", (double) (short) 100);
        produto12.setCodigo("");
        produto12.setPreco(10.0d);
        produto12.setCodigo("hi!");
        estoque0.inserirProduto(produto12, (int) (short) -1);
        int int22 = estoque0.consultarQuantidade("hi!");
        int int24 = estoque0.consultarQuantidade("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
        produto34.setCodigo("");
        produto34.setNome("");
        produto34.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
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
        int int56 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque57 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto61 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto61.setCodigo("hi!");
        estoque57.inserirProduto(produto61, (int) (byte) 0);
        estoque57.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto72 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto72.setNome("hi!");
        produto72.setPreco((double) 100L);
        estoque57.inserirProduto(produto72, (int) (short) 10);
        br.ufrn.imd.Produto produto82 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double83 = produto82.getPreco();
        produto82.setNome("hi!");
        java.lang.String str86 = produto82.getNome();
        produto82.setCodigo("hi!");
        estoque57.inserirProduto(produto82, (int) (short) 100);
        produto82.setNome("");
        produto82.setPreco(10.0d);
        estoque0.inserirProduto(produto82, (int) (byte) -1);
        java.lang.String str97 = produto82.getCodigo();
        java.lang.String str98 = produto82.getCodigo();
        double double99 = produto82.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 100.0d + "'", double83 == 100.0d);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "hi!" + "'", str97, "hi!");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "hi!" + "'", str98, "hi!");
        org.junit.Assert.assertTrue("'" + double99 + "' != '" + 10.0d + "'", double99 == 10.0d);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        int int92 = estoque0.consultarQuantidade("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 10.0d + "'", double86 == 10.0d);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 96 + "'", int92 == 96);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-160));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
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
        produto47.setNome("");
        java.lang.String str58 = produto47.getCodigo();
        double double59 = produto47.getPreco();
        java.lang.String str60 = produto47.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
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
        java.lang.String str74 = produto65.getCodigo();
        java.lang.String str75 = produto65.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) '#');
        produto3.setCodigo("");
        produto3.setNome("");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
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
        double double69 = produto54.getPreco();
        produto54.setNome("");
        produto54.setNome("");
        java.lang.Class<?> wildcardClass74 = produto54.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-63.0d) + "'", double69 == (-63.0d));
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 19);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
        java.lang.String str18 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        java.lang.String str12 = produto3.getCodigo();
        produto3.setCodigo("");
        produto3.setPreco(0.0d);
        produto3.setCodigo("");
        java.lang.String str19 = produto3.getCodigo();
        double double20 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        int int6 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto10 = new br.ufrn.imd.Produto("hi!", "", (double) 9);
        estoque0.inserirProduto(produto10, (int) '#');
        int int14 = estoque0.consultarQuantidade("hi!");
        int int16 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("", (-63));
        int int21 = estoque0.consultarQuantidade("");
        int int23 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto27 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto27.setNome("hi!");
        produto27.setPreco((double) 10);
        java.lang.String str32 = produto27.getNome();
        double double33 = produto27.getPreco();
        java.lang.String str34 = produto27.getCodigo();
        produto27.setCodigo("hi!");
        produto27.setPreco((double) (-1.0f));
        java.lang.String str39 = produto27.getNome();
        produto27.setCodigo("hi!");
        produto27.setCodigo("hi!");
        produto27.setCodigo("hi!");
        estoque0.inserirProduto(produto27, (int) ' ');
        estoque0.removerProduto("hi!", (-63));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        double double10 = produto3.getPreco();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        produto3.setNome("");
        produto3.setNome("hi!");
        java.lang.String str15 = produto3.getCodigo();
        produto3.setPreco((double) (short) 100);
        produto3.setPreco((double) '#');
        java.lang.String str20 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        br.ufrn.imd.Produto produto27 = new br.ufrn.imd.Produto("hi!", "", (double) 1.0f);
        java.lang.String str28 = produto27.getNome();
        estoque0.inserirProduto(produto27, 0);
        produto27.setPreco((double) 68);
        java.lang.Class<?> wildcardClass33 = produto27.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
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
        java.lang.String str62 = produto52.getNome();
        java.lang.String str63 = produto52.getNome();
        produto52.setPreco((double) (-1.0f));
        produto52.setNome("");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (-108.0d));
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (-78.0d));
        produto3.setNome("hi!");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (-116));
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        int int54 = estoque0.consultarQuantidade("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        produto21.setPreco((double) 114);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
        java.lang.String str57 = produto50.getCodigo();
        double double58 = produto50.getPreco();
        estoque0.inserirProduto(produto50, (int) (short) -1);
        estoque0.removerProduto("hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (short) 10);
        double double4 = produto3.getPreco();
        produto3.setCodigo("");
        produto3.setNome("hi!");
        java.lang.String str9 = produto3.getCodigo();
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getNome();
        produto3.setNome("");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        java.lang.Class<?> wildcardClass85 = estoque0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        produto3.setNome("");
        double double10 = produto3.getPreco();
        java.lang.String str11 = produto3.getCodigo();
        java.lang.String str12 = produto3.getNome();
        java.lang.Class<?> wildcardClass13 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
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
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str48 = produto47.getCodigo();
        produto47.setCodigo("hi!");
        produto47.setNome("hi!");
        estoque0.inserirProduto(produto47, 0);
        java.lang.Class<?> wildcardClass55 = produto47.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 0.0f);
        produto3.setPreco(97.0d);
        java.lang.String str6 = produto3.getNome();
        java.lang.String str7 = produto3.getNome();
        produto3.setPreco((double) (-90));
        java.lang.String str10 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        produto16.setPreco((double) 68);
        double double26 = produto16.getPreco();
        java.lang.Class<?> wildcardClass27 = produto16.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 68.0d + "'", double26 == 68.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (-90));
        produto3.setCodigo("hi!");
        produto3.setCodigo("");
        java.lang.String str8 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
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
        br.ufrn.imd.Produto produto24 = new br.ufrn.imd.Produto("hi!", "", 100.0d);
        java.lang.String str25 = produto24.getNome();
        double double26 = produto24.getPreco();
        estoque0.inserirProduto(produto24, (int) (short) 10);
        produto24.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        java.lang.String str12 = produto3.getCodigo();
        produto3.setCodigo("");
        produto3.setPreco(0.0d);
        java.lang.Class<?> wildcardClass17 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto3.setNome("");
        java.lang.String str6 = produto3.getCodigo();
        double double7 = produto3.getPreco();
        double double8 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setCodigo("hi!");
        double double13 = produto3.getPreco();
        java.lang.String str14 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        produto3.setNome("");
        java.lang.String str10 = produto3.getCodigo();
        produto3.setPreco(0.0d);
        double double13 = produto3.getPreco();
        java.lang.String str14 = produto3.getNome();
        java.lang.String str15 = produto3.getCodigo();
        double double16 = produto3.getPreco();
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 0.0f);
        java.lang.String str4 = produto3.getNome();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.Class<?> wildcardClass6 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
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
        int int77 = estoque0.consultarQuantidade("hi!");
        java.lang.Class<?> wildcardClass78 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 34 + "'", int77 == 34);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 33);
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
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
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
        produto41.setCodigo("");
        produto41.setCodigo("");
        double double52 = produto41.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        java.lang.String str30 = produto22.getNome();
        java.lang.String str31 = produto22.getNome();
        produto22.setNome("");
        double double34 = produto22.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        java.lang.String str7 = produto3.getCodigo();
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-160));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
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
        boolean boolean61 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto65.setNome("hi!");
        produto65.setPreco((double) 10);
        java.lang.String str70 = produto65.getNome();
        double double71 = produto65.getPreco();
        java.lang.String str72 = produto65.getCodigo();
        java.lang.String str73 = produto65.getNome();
        estoque0.inserirProduto(produto65, (int) '#');
        br.ufrn.imd.Produto produto79 = new br.ufrn.imd.Produto("", "", (double) 1L);
        produto79.setPreco((double) 'a');
        estoque0.inserirProduto(produto79, 10);
        double double84 = produto79.getPreco();
        produto79.setPreco((double) 33);
        produto79.setPreco((double) 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-2) + "'", int59 == (-2));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 97.0d + "'", double84 == 97.0d);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        double double38 = produto31.getPreco();
        java.lang.String str39 = produto31.getNome();
        double double40 = produto31.getPreco();
        produto31.setNome("hi!");
        produto31.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 35.0d + "'", double38 == 35.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 35.0d + "'", double40 == 35.0d);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        boolean boolean57 = estoque0.produtoExiste("");
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        java.lang.String str4 = produto3.getCodigo();
        double double5 = produto3.getPreco();
        java.lang.String str6 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.String str9 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.String str12 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
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
        int int34 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
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
        int int78 = estoque0.consultarQuantidade("");
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
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        double double35 = produto19.getPreco();
        produto19.setPreco((double) (-2));
        java.lang.String str38 = produto19.getNome();
        java.lang.Class<?> wildcardClass39 = produto19.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("");
        produto3.setPreco((double) 10);
        java.lang.String str9 = produto3.getCodigo();
        produto3.setPreco((double) (short) 0);
        java.lang.String str12 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        int int56 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque57 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto61 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto61.setCodigo("hi!");
        estoque57.inserirProduto(produto61, (int) (byte) 0);
        estoque57.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto72 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto72.setNome("hi!");
        produto72.setPreco((double) 100L);
        estoque57.inserirProduto(produto72, (int) (short) 10);
        br.ufrn.imd.Produto produto82 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double83 = produto82.getPreco();
        produto82.setNome("hi!");
        java.lang.String str86 = produto82.getNome();
        produto82.setCodigo("hi!");
        estoque57.inserirProduto(produto82, (int) (short) 100);
        produto82.setNome("");
        produto82.setPreco(10.0d);
        estoque0.inserirProduto(produto82, (int) (byte) -1);
        estoque0.removerProduto("hi!", (-53));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 100.0d + "'", double83 == 100.0d);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
        boolean boolean27 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        br.ufrn.imd.Estoque estoque34 = new br.ufrn.imd.Estoque();
        boolean boolean36 = estoque34.produtoExiste("");
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto40.setNome("hi!");
        produto40.setPreco((double) 10);
        estoque34.inserirProduto(produto40, (int) (byte) -1);
        double double47 = produto40.getPreco();
        java.lang.String str48 = produto40.getNome();
        estoque0.inserirProduto(produto40, (-97));
        produto40.setPreco(32.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        produto3.setNome("");
        java.lang.String str10 = produto3.getNome();
        double double11 = produto3.getPreco();
        produto3.setPreco((double) 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        int int13 = estoque0.consultarQuantidade("");
        boolean boolean15 = estoque0.produtoExiste("");
        boolean boolean17 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", 10);
        boolean boolean22 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto26 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double27 = produto26.getPreco();
        java.lang.String str28 = produto26.getCodigo();
        java.lang.String str29 = produto26.getNome();
        produto26.setCodigo("");
        double double32 = produto26.getPreco();
        produto26.setNome("hi!");
        java.lang.String str35 = produto26.getNome();
        estoque0.inserirProduto(produto26, (-90));
        boolean boolean39 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
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
        int int62 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto66 = new br.ufrn.imd.Produto("", "hi!", (double) (short) 100);
        produto66.setCodigo("");
        double double69 = produto66.getPreco();
        estoque0.inserirProduto(produto66, (-132));
        estoque0.removerProduto("", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 97.0d + "'", double52 == 97.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-13) + "'", int62 == (-13));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 100.0d + "'", double69 == 100.0d);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        boolean boolean29 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        produto47.setNome("hi!");
        produto47.setNome("");
        double double57 = produto47.getPreco();
        produto47.setNome("");
        java.lang.String str60 = produto47.getNome();
        produto47.setPreco((double) (-98));
        java.lang.Class<?> wildcardClass63 = produto47.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 100.0d + "'", double57 == 100.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        produto41.setCodigo("");
        produto41.setCodigo("");
        produto41.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
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
        estoque0.removerProduto("hi!", (-103));
        br.ufrn.imd.Produto produto44 = null;
        // The following exception was thrown during execution in test generation
        try {
            estoque0.inserirProduto(produto44, (-68));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        java.lang.Class<?> wildcardClass45 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 18 + "'", int44 == 18);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 100L);
        estoque0.inserirProduto(produto15, (int) (short) 10);
        java.lang.String str22 = produto15.getCodigo();
        produto15.setNome("hi!");
        produto15.setNome("");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        estoque0.removerProduto("hi!", (-78));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        boolean boolean63 = estoque0.produtoExiste("");
        int int65 = estoque0.consultarQuantidade("");
        boolean boolean67 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 36);
        produto3.setCodigo("");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
        double double35 = produto19.getPreco();
        produto19.setPreco((double) (-2));
        java.lang.String str38 = produto19.getNome();
        java.lang.String str39 = produto19.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 10L);
        produto29.setCodigo("hi!");
        java.lang.String str32 = produto29.getNome();
        estoque0.inserirProduto(produto29, (-200));
        br.ufrn.imd.Produto produto38 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto38.setNome("hi!");
        produto38.setNome("");
        produto38.setPreco(1.0d);
        java.lang.String str45 = produto38.getCodigo();
        double double46 = produto38.getPreco();
        produto38.setPreco((double) 100);
        estoque0.inserirProduto(produto38, (-2));
        estoque0.removerProduto("hi!", (-97));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        produto79.setPreco((double) (-102));
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
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        java.lang.Class<?> wildcardClass30 = produto16.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto3.setNome("");
        java.lang.String str6 = produto3.getCodigo();
        double double7 = produto3.getPreco();
        double double8 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setCodigo("hi!");
        java.lang.String str13 = produto3.getCodigo();
        produto3.setCodigo("");
        produto3.setPreco((-100.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto50.setNome("hi!");
        produto50.setPreco((double) 10);
        java.lang.String str55 = produto50.getNome();
        double double56 = produto50.getPreco();
        produto50.setNome("");
        java.lang.String str59 = produto50.getCodigo();
        double double60 = produto50.getPreco();
        produto50.setPreco(34.0d);
        estoque0.inserirProduto(produto50, 96);
        produto50.setCodigo("");
        produto50.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", 0.0d);
        java.lang.String str4 = produto3.getNome();
        produto3.setPreco((double) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
        int int61 = estoque0.consultarQuantidade("");
        boolean boolean63 = estoque0.produtoExiste("");
        int int65 = estoque0.consultarQuantidade("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 0);
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
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-2) + "'", int65 == (-2));
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        produto6.setNome("hi!");
        produto6.setCodigo("");
        produto6.setCodigo("");
        java.lang.String str19 = produto6.getCodigo();
        java.lang.String str20 = produto6.getCodigo();
        java.lang.Class<?> wildcardClass21 = produto6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
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
        produto25.setPreco(10.0d);
        produto25.setPreco(1.0d);
        java.lang.String str40 = produto25.getCodigo();
        produto25.setCodigo("");
        produto25.setNome("");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
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
        br.ufrn.imd.Estoque estoque71 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto75 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto75.setCodigo("hi!");
        estoque71.inserirProduto(produto75, (int) (byte) 0);
        br.ufrn.imd.Produto produto83 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto83.setNome("hi!");
        produto83.setNome("");
        produto83.setPreco(1.0d);
        estoque71.inserirProduto(produto83, 100);
        produto83.setCodigo("");
        estoque0.inserirProduto(produto83, (-97));
        int int97 = estoque0.consultarQuantidade("");
        int int99 = estoque0.consultarQuantidade("hi!");
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
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-97) + "'", int97 == (-97));
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 96 + "'", int99 == 96);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getCodigo();
        double double8 = produto3.getPreco();
        produto3.setPreco((double) (-97));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        produto3.setNome("");
        double double10 = produto3.getPreco();
        produto3.setNome("");
        double double13 = produto3.getPreco();
        produto3.setPreco((double) (-108));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
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
        produto16.setCodigo("hi!");
        produto16.setPreco(18.0d);
        double double32 = produto16.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 18.0d + "'", double32 == 18.0d);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
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
        java.lang.String str40 = produto28.getCodigo();
        double double41 = produto28.getPreco();
        java.lang.Class<?> wildcardClass42 = produto28.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double66 = produto65.getPreco();
        java.lang.String str67 = produto65.getCodigo();
        java.lang.String str68 = produto65.getNome();
        produto65.setCodigo("");
        double double71 = produto65.getPreco();
        produto65.setNome("hi!");
        estoque0.inserirProduto(produto65, (int) (byte) 0);
        java.lang.String str76 = produto65.getCodigo();
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
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 100.0d + "'", double66 == 100.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 100.0d + "'", double71 == 100.0d);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
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
        boolean boolean59 = estoque0.produtoExiste("hi!");
        int int61 = estoque0.consultarQuantidade("hi!");
        boolean boolean63 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto67 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 99);
        produto67.setCodigo("hi!");
        estoque0.inserirProduto(produto67, 0);
        java.lang.String str72 = produto67.getNome();
        produto67.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-2) + "'", int61 == (-2));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        estoque0.removerProduto("hi!", (int) (short) 1);
        br.ufrn.imd.Produto produto57 = new br.ufrn.imd.Produto("hi!", "", (double) 18);
        estoque0.inserirProduto(produto57, (-78));
        estoque0.removerProduto("", (int) '4');
        estoque0.removerProduto("hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 70);
        produto3.setCodigo("");
        java.lang.String str6 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str4 = produto3.getCodigo();
        produto3.setCodigo("");
        produto3.setPreco(0.0d);
        double double9 = produto3.getPreco();
        produto3.setPreco((-101.0d));
        double double12 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-101.0d) + "'", double12 == (-101.0d));
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
        produto16.setNome("");
        produto16.setPreco((-1.0d));
        java.lang.String str33 = produto16.getNome();
        java.lang.String str34 = produto16.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
        java.lang.String str30 = produto16.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-2.0d) + "'", double25 == (-2.0d));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 1L);
        produto3.setCodigo("");
        produto3.setPreco((double) (short) -1);
        produto3.setPreco((double) (short) 10);
        produto3.setCodigo("");
        java.lang.String str12 = produto3.getCodigo();
        double double13 = produto3.getPreco();
        java.lang.Class<?> wildcardClass14 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
        br.ufrn.imd.Estoque estoque29 = new br.ufrn.imd.Estoque();
        boolean boolean31 = estoque29.produtoExiste("");
        br.ufrn.imd.Produto produto35 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto35.setNome("hi!");
        produto35.setPreco((double) 10);
        estoque29.inserirProduto(produto35, (int) (byte) -1);
        int int43 = estoque29.consultarQuantidade("");
        estoque29.removerProduto("hi!", 1);
        int int48 = estoque29.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto52 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto52.setNome("hi!");
        produto52.setPreco((double) 10);
        java.lang.String str57 = produto52.getCodigo();
        double double58 = produto52.getPreco();
        produto52.setPreco((double) 1.0f);
        estoque29.inserirProduto(produto52, (int) (short) 0);
        java.lang.String str63 = produto52.getCodigo();
        produto52.setNome("hi!");
        produto52.setCodigo("hi!");
        estoque0.inserirProduto(produto52, (-11));
        double double70 = produto52.getPreco();
        double double71 = produto52.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-2) + "'", int48 == (-2));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 1.0d + "'", double71 == 1.0d);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
        boolean boolean61 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto65.setNome("hi!");
        produto65.setPreco((double) 10);
        java.lang.String str70 = produto65.getNome();
        double double71 = produto65.getPreco();
        java.lang.String str72 = produto65.getCodigo();
        java.lang.String str73 = produto65.getNome();
        estoque0.inserirProduto(produto65, (int) '#');
        int int77 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto81 = new br.ufrn.imd.Produto("", "", (double) (-98));
        produto81.setNome("");
        java.lang.String str84 = produto81.getNome();
        estoque0.inserirProduto(produto81, 114);
        estoque0.removerProduto("hi!", 18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-2) + "'", int59 == (-2));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-76));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        br.ufrn.imd.Produto produto12 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto12.setNome("hi!");
        produto12.setNome("");
        produto12.setPreco(1.0d);
        estoque0.inserirProduto(produto12, 100);
        boolean boolean22 = estoque0.produtoExiste("hi!");
        boolean boolean24 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        java.lang.String str29 = produto28.getCodigo();
        double double30 = produto28.getPreco();
        estoque0.inserirProduto(produto28, (int) (short) 0);
        boolean boolean34 = estoque0.produtoExiste("hi!");
        boolean boolean36 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        produto3.setNome("");
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (-33));
        produto3.setCodigo("hi!");
        produto3.setCodigo("hi!");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        int int47 = estoque0.consultarQuantidade("hi!");
        boolean boolean49 = estoque0.produtoExiste("");
        int int51 = estoque0.consultarQuantidade("hi!");
        int int53 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
        boolean boolean32 = estoque0.produtoExiste("hi!");
        boolean boolean34 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque35 = new br.ufrn.imd.Estoque();
        boolean boolean37 = estoque35.produtoExiste("");
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto41.setNome("hi!");
        produto41.setPreco((double) 10);
        estoque35.inserirProduto(produto41, (int) (byte) -1);
        estoque35.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque35.inserirProduto(produto54, (int) (short) 100);
        estoque35.removerProduto("hi!", 0);
        boolean boolean61 = estoque35.produtoExiste("hi!");
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto65.setNome("hi!");
        produto65.setPreco((double) 10);
        java.lang.String str70 = produto65.getCodigo();
        double double71 = produto65.getPreco();
        double double72 = produto65.getPreco();
        produto65.setCodigo("");
        java.lang.String str75 = produto65.getCodigo();
        estoque35.inserirProduto(produto65, 97);
        estoque0.inserirProduto(produto65, 10);
        double double80 = produto65.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 10.0d + "'", double80 == 10.0d);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
        estoque0.removerProduto("hi!", (-100));
        br.ufrn.imd.Estoque estoque63 = new br.ufrn.imd.Estoque();
        boolean boolean65 = estoque63.produtoExiste("");
        br.ufrn.imd.Produto produto69 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto69.setNome("hi!");
        produto69.setPreco((double) 10);
        estoque63.inserirProduto(produto69, (int) (byte) -1);
        br.ufrn.imd.Produto produto79 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto79.setNome("hi!");
        produto79.setNome("");
        estoque63.inserirProduto(produto79, 0);
        java.lang.String str86 = produto79.getCodigo();
        double double87 = produto79.getPreco();
        java.lang.String str88 = produto79.getCodigo();
        produto79.setNome("");
        produto79.setNome("");
        java.lang.String str93 = produto79.getNome();
        produto79.setNome("");
        double double96 = produto79.getPreco();
        estoque0.inserirProduto(produto79, 28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 10.0d + "'", double87 == 10.0d);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 10.0d + "'", double96 == 10.0d);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        boolean boolean24 = estoque0.produtoExiste("hi!");
        boolean boolean26 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto30 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double31 = produto30.getPreco();
        java.lang.String str32 = produto30.getCodigo();
        java.lang.String str33 = produto30.getNome();
        produto30.setNome("hi!");
        double double36 = produto30.getPreco();
        produto30.setNome("hi!");
        produto30.setNome("hi!");
        java.lang.String str41 = produto30.getCodigo();
        estoque0.inserirProduto(produto30, 97);
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
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
        boolean boolean57 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        java.lang.String str8 = produto3.getCodigo();
        produto3.setNome("");
        produto3.setNome("");
        java.lang.String str13 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", 1.0d);
        double double4 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
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
        java.lang.Class<?> wildcardClass74 = estoque0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        java.lang.String str6 = produto3.getCodigo();
        produto3.setPreco((double) (short) 100);
        java.lang.Class<?> wildcardClass9 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getCodigo();
        java.lang.String str7 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto46.setNome("hi!");
        produto46.setPreco((double) 10);
        java.lang.String str51 = produto46.getCodigo();
        double double52 = produto46.getPreco();
        produto46.setPreco((double) 1.0f);
        produto46.setPreco((double) '4');
        produto46.setCodigo("");
        produto46.setCodigo("hi!");
        produto46.setCodigo("hi!");
        produto46.setPreco((double) (byte) 100);
        estoque0.inserirProduto(produto46, 36);
        java.lang.Class<?> wildcardClass67 = produto46.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
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
        br.ufrn.imd.Estoque estoque28 = new br.ufrn.imd.Estoque();
        boolean boolean30 = estoque28.produtoExiste("");
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto34.setNome("hi!");
        produto34.setPreco((double) 10);
        estoque28.inserirProduto(produto34, (int) (byte) -1);
        estoque28.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto47.setNome("hi!");
        produto47.setPreco((double) 10);
        java.lang.String str52 = produto47.getNome();
        double double53 = produto47.getPreco();
        java.lang.String str54 = produto47.getCodigo();
        produto47.setCodigo("hi!");
        java.lang.String str57 = produto47.getCodigo();
        produto47.setNome("");
        estoque28.inserirProduto(produto47, (int) (short) 10);
        boolean boolean63 = estoque28.produtoExiste("");
        br.ufrn.imd.Produto produto67 = new br.ufrn.imd.Produto("hi!", "", 100.0d);
        estoque28.inserirProduto(produto67, (int) (byte) 10);
        estoque0.inserirProduto(produto67, (-97));
        boolean boolean73 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 1.0f);
        produto3.setNome("hi!");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        java.lang.String str8 = produto3.getNome();
        produto3.setNome("hi!");
        double double11 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        br.ufrn.imd.Produto produto12 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto12.setNome("hi!");
        produto12.setNome("");
        produto12.setPreco(1.0d);
        estoque0.inserirProduto(produto12, 100);
        boolean boolean22 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque23 = new br.ufrn.imd.Estoque();
        boolean boolean25 = estoque23.produtoExiste("");
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto29.setNome("hi!");
        produto29.setPreco((double) 10);
        estoque23.inserirProduto(produto29, (int) (byte) -1);
        int int37 = estoque23.consultarQuantidade("");
        boolean boolean39 = estoque23.produtoExiste("");
        boolean boolean41 = estoque23.produtoExiste("");
        br.ufrn.imd.Estoque estoque42 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto46.setCodigo("hi!");
        estoque42.inserirProduto(produto46, (int) (byte) 0);
        estoque23.inserirProduto(produto46, 1);
        br.ufrn.imd.Produto produto56 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto56.setPreco((double) '#');
        produto56.setPreco((double) 10);
        java.lang.String str61 = produto56.getNome();
        produto56.setPreco(0.0d);
        java.lang.String str64 = produto56.getNome();
        estoque23.inserirProduto(produto56, (int) (short) -1);
        produto56.setPreco((double) (-63));
        java.lang.String str69 = produto56.getCodigo();
        estoque0.inserirProduto(produto56, (int) ' ');
        boolean boolean73 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (-200));
        java.lang.Class<?> wildcardClass77 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double26 = produto25.getPreco();
        produto25.setNome("hi!");
        java.lang.String str29 = produto25.getNome();
        java.lang.String str30 = produto25.getCodigo();
        java.lang.String str31 = produto25.getNome();
        estoque0.inserirProduto(produto25, (int) ' ');
        java.lang.Class<?> wildcardClass34 = produto25.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-63));
        java.lang.String str4 = produto3.getNome();
        produto3.setPreco((double) (-35));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto3.setNome("");
        java.lang.String str6 = produto3.getCodigo();
        double double7 = produto3.getPreco();
        double double8 = produto3.getPreco();
        produto3.setPreco((double) (short) 100);
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        produto3.setPreco((double) (-1.0f));
        java.lang.String str15 = produto3.getNome();
        produto3.setCodigo("hi!");
        produto3.setCodigo("hi!");
        java.lang.String str20 = produto3.getCodigo();
        java.lang.Class<?> wildcardClass21 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
        boolean boolean24 = estoque0.produtoExiste("hi!");
        boolean boolean26 = estoque0.produtoExiste("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-68));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
        double double87 = produto75.getPreco();
        produto75.setNome("hi!");
        java.lang.Class<?> wildcardClass90 = produto75.getClass();
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
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 68.0d + "'", double87 == 68.0d);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
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
        estoque0.removerProduto("hi!", 116);
        estoque0.removerProduto("hi!", (-150));
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
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 1);
        produto3.setNome("");
        double double6 = produto3.getPreco();
        double double7 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setPreco((double) (-100));
        java.lang.Class<?> wildcardClass12 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
        boolean boolean59 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 97.0d + "'", double52 == 97.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (byte) 0);
        boolean boolean19 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto23.setNome("hi!");
        produto23.setPreco((double) 10);
        produto23.setNome("hi!");
        produto23.setPreco((double) 'a');
        produto23.setNome("");
        produto23.setNome("");
        produto23.setPreco(0.0d);
        produto23.setCodigo("");
        java.lang.String str40 = produto23.getCodigo();
        estoque0.inserirProduto(produto23, 34);
        java.lang.String str43 = produto23.getCodigo();
        produto23.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto22.setNome("hi!");
        produto22.setNome("hi!");
        estoque0.inserirProduto(produto22, 36);
        boolean boolean30 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (byte) 10);
        java.lang.String str4 = produto3.getCodigo();
        java.lang.String str5 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
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
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto39.setCodigo("hi!");
        produto39.setCodigo("");
        double double44 = produto39.getPreco();
        produto39.setCodigo("hi!");
        produto39.setNome("");
        estoque0.inserirProduto(produto39, 86);
        java.lang.String str51 = produto39.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        int int31 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
        boolean boolean36 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
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
        produto12.setCodigo("");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        java.lang.Class<?> wildcardClass18 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
        estoque0.removerProduto("hi!", (-101));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        java.lang.String str13 = produto3.getCodigo();
        produto3.setNome("");
        java.lang.Class<?> wildcardClass16 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
        produto16.setNome("");
        produto16.setPreco((-1.0d));
        java.lang.String str33 = produto16.getNome();
        produto16.setPreco((double) (short) 10);
        produto16.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
        produto16.setCodigo("");
        produto16.setPreco((double) 1.0f);
        java.lang.String str29 = produto16.getNome();
        java.lang.String str30 = produto16.getNome();
        produto16.setPreco((-1.0d));
        produto16.setNome("");
        java.lang.String str35 = produto16.getNome();
        produto16.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (-150));
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", 18);
        br.ufrn.imd.Produto produto32 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto32.setNome("");
        java.lang.String str35 = produto32.getNome();
        java.lang.String str36 = produto32.getNome();
        estoque0.inserirProduto(produto32, 68);
        estoque0.removerProduto("hi!", (-116));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        br.ufrn.imd.Produto produto12 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto12.setNome("hi!");
        produto12.setNome("");
        produto12.setPreco(1.0d);
        estoque0.inserirProduto(produto12, 100);
        estoque0.removerProduto("hi!", (-132));
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        java.lang.String str12 = produto3.getCodigo();
        produto3.setNome("hi!");
        produto3.setPreco((double) (-2));
        java.lang.String str17 = produto3.getCodigo();
        produto3.setPreco(104.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
        br.ufrn.imd.Estoque estoque28 = new br.ufrn.imd.Estoque();
        boolean boolean30 = estoque28.produtoExiste("");
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto34.setNome("hi!");
        produto34.setPreco((double) 10);
        estoque28.inserirProduto(produto34, (int) (byte) -1);
        boolean boolean42 = estoque28.produtoExiste("hi!");
        boolean boolean44 = estoque28.produtoExiste("");
        boolean boolean46 = estoque28.produtoExiste("");
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto50.setNome("hi!");
        produto50.setNome("");
        produto50.setPreco(1.0d);
        java.lang.String str57 = produto50.getCodigo();
        double double58 = produto50.getPreco();
        produto50.setNome("");
        produto50.setNome("");
        double double63 = produto50.getPreco();
        produto50.setPreco((double) (-1));
        produto50.setNome("hi!");
        estoque28.inserirProduto(produto50, (-1));
        estoque0.inserirProduto(produto50, (int) 'a');
        java.lang.String str72 = produto50.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 1.0d + "'", double63 == 1.0d);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 10L);
        produto29.setCodigo("hi!");
        java.lang.String str32 = produto29.getNome();
        estoque0.inserirProduto(produto29, (-200));
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
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
        estoque0.removerProduto("", 0);
        java.lang.Class<?> wildcardClass32 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        estoque0.inserirProduto(produto41, 98);
        produto41.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
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
        estoque0.removerProduto("", 116);
        int int58 = estoque0.consultarQuantidade("");
        boolean boolean60 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto61 = null;
        // The following exception was thrown during execution in test generation
        try {
            estoque0.inserirProduto(produto61, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-116) + "'", int58 == (-116));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
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
        java.lang.String str72 = produto65.getCodigo();
        produto65.setCodigo("hi!");
        produto65.setCodigo("hi!");
        java.lang.String str77 = produto65.getNome();
        produto65.setPreco(32.0d);
        produto65.setCodigo("hi!");
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
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-68));
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
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
        int int29 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setNome("hi!");
        produto3.setCodigo("hi!");
        produto3.setNome("");
        double double13 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        java.lang.String str8 = produto3.getCodigo();
        double double9 = produto3.getPreco();
        double double10 = produto3.getPreco();
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
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
        br.ufrn.imd.Produto produto75 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto75.setNome("hi!");
        produto75.setPreco((double) 10);
        java.lang.String str80 = produto75.getNome();
        double double81 = produto75.getPreco();
        java.lang.String str82 = produto75.getCodigo();
        produto75.setCodigo("hi!");
        java.lang.String str85 = produto75.getCodigo();
        produto75.setPreco(0.0d);
        produto75.setNome("");
        produto75.setPreco((double) 68);
        estoque0.inserirProduto(produto75, 114);
        estoque0.removerProduto("", 100);
        boolean boolean98 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        int int45 = estoque0.consultarQuantidade("hi!");
        boolean boolean47 = estoque0.produtoExiste("hi!");
        int int49 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque17 = new br.ufrn.imd.Estoque();
        boolean boolean19 = estoque17.produtoExiste("");
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto23.setNome("hi!");
        produto23.setPreco((double) 10);
        estoque17.inserirProduto(produto23, (int) (byte) -1);
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto33.setNome("hi!");
        produto33.setNome("");
        estoque17.inserirProduto(produto33, 0);
        java.lang.String str40 = produto33.getCodigo();
        double double41 = produto33.getPreco();
        double double42 = produto33.getPreco();
        produto33.setNome("hi!");
        produto33.setNome("");
        produto33.setCodigo("hi!");
        estoque0.inserirProduto(produto33, 99);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
        br.ufrn.imd.Produto produto56 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto56.setNome("hi!");
        produto56.setNome("");
        produto56.setPreco((double) 10L);
        estoque0.inserirProduto(produto56, 1);
        estoque0.removerProduto("hi!", (-108));
        java.lang.Class<?> wildcardClass68 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 1L);
        java.lang.Class<?> wildcardClass4 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        estoque0.removerProduto("hi!", (-53));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 16 + "'", int42 == 16);
    }
}


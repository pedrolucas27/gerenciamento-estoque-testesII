package br.ufrn.imd.execucao03.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

    public static boolean debug = false;

    @Test
    public void test9501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9501");
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
        boolean boolean39 = estoque25.produtoExiste("");
        int int41 = estoque25.consultarQuantidade("");
        boolean boolean43 = estoque25.produtoExiste("hi!");
        int int45 = estoque25.consultarQuantidade("");
        boolean boolean47 = estoque25.produtoExiste("hi!");
        boolean boolean49 = estoque25.produtoExiste("hi!");
        br.ufrn.imd.Produto produto53 = new br.ufrn.imd.Produto("", "", (double) (short) 10);
        double double54 = produto53.getPreco();
        produto53.setCodigo("");
        produto53.setNome("hi!");
        java.lang.String str59 = produto53.getCodigo();
        estoque25.inserirProduto(produto53, 114);
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("", "", (double) 100L);
        produto65.setCodigo("hi!");
        produto65.setNome("");
        double double70 = produto65.getPreco();
        estoque25.inserirProduto(produto65, (-91));
        estoque0.inserirProduto(produto65, (-99));
        java.lang.String str75 = produto65.getCodigo();
        double double76 = produto65.getPreco();
        produto65.setPreco((double) (-6));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 100.0d + "'", double70 == 100.0d);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 100.0d + "'", double76 == 100.0d);
    }

    @Test
    public void test9502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9502");
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
        br.ufrn.imd.Estoque estoque59 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto63 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto63.setCodigo("hi!");
        estoque59.inserirProduto(produto63, (int) (byte) 0);
        br.ufrn.imd.Produto produto71 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto71.setNome("hi!");
        produto71.setNome("");
        produto71.setPreco(1.0d);
        estoque59.inserirProduto(produto71, 100);
        produto71.setPreco((double) 0);
        double double82 = produto71.getPreco();
        produto71.setCodigo("");
        java.lang.String str85 = produto71.getCodigo();
        java.lang.String str86 = produto71.getCodigo();
        produto71.setNome("");
        estoque0.inserirProduto(produto71, (-78));
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
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test9503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9503");
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
        br.ufrn.imd.Estoque estoque44 = new br.ufrn.imd.Estoque();
        boolean boolean46 = estoque44.produtoExiste("");
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto50.setNome("hi!");
        produto50.setPreco((double) 10);
        estoque44.inserirProduto(produto50, (int) (byte) -1);
        boolean boolean58 = estoque44.produtoExiste("hi!");
        br.ufrn.imd.Produto produto62 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto62.setPreco((double) '#');
        produto62.setPreco((double) 10);
        java.lang.String str67 = produto62.getNome();
        produto62.setPreco(0.0d);
        estoque44.inserirProduto(produto62, (-2));
        br.ufrn.imd.Produto produto75 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto75.setPreco((double) '#');
        estoque44.inserirProduto(produto75, 100);
        produto75.setPreco((double) (-2));
        double double82 = produto75.getPreco();
        java.lang.String str83 = produto75.getNome();
        java.lang.String str84 = produto75.getNome();
        estoque0.inserirProduto(produto75, (-1));
        java.lang.Class<?> wildcardClass87 = produto75.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-2.0d) + "'", double82 == (-2.0d));
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test9504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9504");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        produto3.setCodigo("");
        produto3.setPreco((double) (short) 100);
        double double18 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test9505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9505");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", 70.0d);
        java.lang.String str4 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test9506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9506");
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
        int int78 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("", 28);
        estoque0.removerProduto("hi!", (-98));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
    }

    @Test
    public void test9507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9507");
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
        int int44 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test9508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9508");
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
        boolean boolean24 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "", (double) 10);
        java.lang.String str29 = produto28.getCodigo();
        java.lang.String str30 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, (int) ' ');
        estoque0.removerProduto("hi!", 94);
        estoque0.removerProduto("hi!", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test9509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9509");
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
        produto28.setCodigo("");
        java.lang.Class<?> wildcardClass43 = produto28.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test9510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9510");
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
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        boolean boolean32 = estoque30.produtoExiste("");
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto36.setNome("hi!");
        produto36.setPreco((double) 10);
        estoque30.inserirProduto(produto36, (int) (byte) -1);
        int int44 = estoque30.consultarQuantidade("");
        boolean boolean46 = estoque30.produtoExiste("");
        boolean boolean48 = estoque30.produtoExiste("");
        br.ufrn.imd.Estoque estoque49 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto53 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto53.setCodigo("hi!");
        estoque49.inserirProduto(produto53, (int) (byte) 0);
        estoque30.inserirProduto(produto53, 1);
        br.ufrn.imd.Produto produto63 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto63.setPreco((double) '#');
        produto63.setPreco((double) 10);
        java.lang.String str68 = produto63.getNome();
        produto63.setPreco(0.0d);
        java.lang.String str71 = produto63.getNome();
        estoque30.inserirProduto(produto63, (int) (short) -1);
        boolean boolean75 = estoque30.produtoExiste("");
        br.ufrn.imd.Produto produto79 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 0);
        estoque30.inserirProduto(produto79, (int) (byte) 1);
        estoque30.removerProduto("hi!", (int) (byte) 10);
        br.ufrn.imd.Produto produto88 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto88.setPreco((double) (byte) 100);
        java.lang.String str91 = produto88.getNome();
        java.lang.String str92 = produto88.getCodigo();
        estoque30.inserirProduto(produto88, (int) (byte) 1);
        estoque0.inserirProduto(produto88, 1);
        int int98 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test9511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9511");
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
        produto65.setCodigo("");
        java.lang.Class<?> wildcardClass74 = produto65.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test9512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9512");
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
        java.lang.Class<?> wildcardClass59 = estoque0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test9513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9513");
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
        int int85 = estoque0.consultarQuantidade("hi!");
        int int87 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("", 32);
        estoque0.removerProduto("hi!", 40);
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
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 33 + "'", int85 == 33);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 10 + "'", int87 == 10);
    }

    @Test
    public void test9514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9514");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        produto3.setPreco((double) (-1L));
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        java.lang.String str14 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test9515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9515");
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
        produto34.setPreco(42.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test9516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9516");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 0.0f);
        produto3.setPreco(97.0d);
        java.lang.String str6 = produto3.getNome();
        java.lang.String str7 = produto3.getNome();
        produto3.setPreco((double) (-90));
        double double10 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-90.0d) + "'", double10 == (-90.0d));
    }

    @Test
    public void test9517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9517");
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
        java.lang.String str38 = produto25.getNome();
        produto25.setNome("");
        produto25.setPreco((double) (-33));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test9518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9518");
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
        produto19.setNome("");
        produto19.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test9519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9519");
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
        java.lang.Class<?> wildcardClass45 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test9520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9520");
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
        double double67 = produto62.getPreco();
        produto62.setCodigo("hi!");
        produto62.setNome("");
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
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
    }

    @Test
    public void test9521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9521");
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
        br.ufrn.imd.Produto produto38 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto38.setPreco((double) '#');
        produto38.setPreco((double) 10);
        java.lang.String str43 = produto38.getNome();
        produto38.setPreco(0.0d);
        double double46 = produto38.getPreco();
        java.lang.String str47 = produto38.getNome();
        estoque0.inserirProduto(produto38, (-63));
        estoque0.removerProduto("hi!", (-82));
        br.ufrn.imd.Produto produto56 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 0.0f);
        produto56.setPreco((-100.0d));
        estoque0.inserirProduto(produto56, (-12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test9522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9522");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setPreco((double) (byte) 1);
        produto3.setNome("hi!");
        produto3.setCodigo("hi!");
        produto3.setPreco((double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test9523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9523");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto3.setCodigo("hi!");
        java.lang.String str6 = produto3.getNome();
        double double7 = produto3.getPreco();
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.Class<?> wildcardClass10 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test9524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9524");
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
        java.lang.String str19 = produto3.getNome();
        java.lang.String str20 = produto3.getNome();
        java.lang.String str21 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test9525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9525");
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
        int int57 = estoque0.consultarQuantidade("hi!");
        boolean boolean59 = estoque0.produtoExiste("hi!");
        int int61 = estoque0.consultarQuantidade("");
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 132 + "'", int57 == 132);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test9526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9526");
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
        boolean boolean31 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque32 = new br.ufrn.imd.Estoque();
        boolean boolean34 = estoque32.produtoExiste("");
        br.ufrn.imd.Produto produto38 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto38.setNome("hi!");
        produto38.setPreco((double) 10);
        estoque32.inserirProduto(produto38, (int) (byte) -1);
        br.ufrn.imd.Produto produto48 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto48.setNome("hi!");
        produto48.setNome("");
        estoque32.inserirProduto(produto48, 0);
        int int56 = estoque32.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto60 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto60.setNome("hi!");
        produto60.setPreco((double) 10);
        java.lang.String str65 = produto60.getNome();
        double double66 = produto60.getPreco();
        java.lang.String str67 = produto60.getCodigo();
        estoque32.inserirProduto(produto60, (int) '#');
        br.ufrn.imd.Produto produto73 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque32.inserirProduto(produto73, (-1));
        produto73.setCodigo("hi!");
        java.lang.String str78 = produto73.getCodigo();
        java.lang.String str79 = produto73.getNome();
        produto73.setPreco((double) 100);
        produto73.setCodigo("hi!");
        produto73.setNome("");
        java.lang.String str86 = produto73.getNome();
        estoque0.inserirProduto(produto73, (-10));
        java.lang.String str89 = produto73.getCodigo();
        produto73.setPreco((double) (-289));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
    }

    @Test
    public void test9527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9527");
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
        int int44 = estoque0.consultarQuantidade("hi!");
        boolean boolean46 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test9528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9528");
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
        int int89 = estoque0.consultarQuantidade("hi!");
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
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
    }

    @Test
    public void test9529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9529");
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
        double double25 = produto19.getPreco();
        java.lang.String str26 = produto19.getCodigo();
        java.lang.String str27 = produto19.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 35.0d + "'", double25 == 35.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test9530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9530");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 'a');
        java.lang.String str12 = produto3.getNome();
        produto3.setCodigo("hi!");
        java.lang.String str15 = produto3.getCodigo();
        java.lang.String str16 = produto3.getNome();
        double double17 = produto3.getPreco();
        double double18 = produto3.getPreco();
        double double19 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
    }

    @Test
    public void test9531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9531");
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
        br.ufrn.imd.Estoque estoque46 = new br.ufrn.imd.Estoque();
        boolean boolean48 = estoque46.produtoExiste("");
        br.ufrn.imd.Produto produto52 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto52.setNome("hi!");
        produto52.setPreco((double) 10);
        estoque46.inserirProduto(produto52, (int) (byte) -1);
        boolean boolean60 = estoque46.produtoExiste("hi!");
        br.ufrn.imd.Produto produto64 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto64.setPreco((double) '#');
        produto64.setPreco((double) 10);
        java.lang.String str69 = produto64.getNome();
        produto64.setPreco(0.0d);
        estoque46.inserirProduto(produto64, (-2));
        br.ufrn.imd.Produto produto77 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto77.setPreco((double) '#');
        estoque46.inserirProduto(produto77, 100);
        produto77.setPreco((double) (-2));
        estoque0.inserirProduto(produto77, (int) (short) -1);
        estoque0.removerProduto("", 114);
        boolean boolean90 = estoque0.produtoExiste("hi!");
        boolean boolean92 = estoque0.produtoExiste("");
        boolean boolean94 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", 10);
        boolean boolean99 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test9532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9532");
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
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 95);
        produto47.setPreco((double) 33);
        produto47.setCodigo("hi!");
        estoque0.inserirProduto(produto47, 0);
        java.lang.Class<?> wildcardClass54 = produto47.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test9533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9533");
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
        br.ufrn.imd.Produto produto51 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-11));
        estoque0.inserirProduto(produto51, (int) (short) 0);
        boolean boolean55 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto59 = new br.ufrn.imd.Produto("", "hi!", (double) 100L);
        java.lang.String str60 = produto59.getCodigo();
        estoque0.inserirProduto(produto59, 116);
        boolean boolean64 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto68 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto68.setNome("hi!");
        produto68.setPreco((double) 10);
        java.lang.String str73 = produto68.getCodigo();
        java.lang.String str74 = produto68.getCodigo();
        produto68.setCodigo("hi!");
        estoque0.inserirProduto(produto68, (int) (short) 0);
        produto68.setCodigo("");
        java.lang.Class<?> wildcardClass81 = produto68.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test9534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9534");
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
        boolean boolean28 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (-11));
        br.ufrn.imd.Produto produto35 = new br.ufrn.imd.Produto("hi!", "", 0.0d);
        estoque0.inserirProduto(produto35, 100);
        java.lang.String str38 = produto35.getCodigo();
        double double39 = produto35.getPreco();
        produto35.setCodigo("");
        produto35.setNome("");
        double double44 = produto35.getPreco();
        java.lang.Class<?> wildcardClass45 = produto35.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test9535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9535");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 'a');
        java.lang.String str12 = produto3.getNome();
        java.lang.String str13 = produto3.getNome();
        java.lang.String str14 = produto3.getCodigo();
        produto3.setCodigo("");
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test9536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9536");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (byte) 0);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test9537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9537");
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
        int int61 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("", (-68));
        boolean boolean66 = estoque0.produtoExiste("hi!");
        boolean boolean68 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test9538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9538");
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
        int int47 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 16 + "'", int42 == 16);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 16 + "'", int47 == 16);
    }

    @Test
    public void test9539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9539");
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
        int int60 = estoque0.consultarQuantidade("hi!");
        int int62 = estoque0.consultarQuantidade("hi!");
        int int64 = estoque0.consultarQuantidade("");
        int int66 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("", 34);
        estoque0.removerProduto("hi!", (-99));
        boolean boolean74 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 18 + "'", int60 == 18);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 18 + "'", int62 == 18);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 18 + "'", int66 == 18);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test9540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9540");
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
        java.lang.String str70 = produto48.getCodigo();
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
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
    }

    @Test
    public void test9541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9541");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        int int6 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto10 = new br.ufrn.imd.Produto("hi!", "", (double) 9);
        estoque0.inserirProduto(produto10, (int) '#');
        int int14 = estoque0.consultarQuantidade("hi!");
        int int16 = estoque0.consultarQuantidade("");
        int int18 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        boolean boolean21 = estoque19.produtoExiste("");
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto25.setNome("hi!");
        produto25.setPreco((double) 10);
        estoque19.inserirProduto(produto25, (int) (byte) -1);
        int int33 = estoque19.consultarQuantidade("");
        estoque19.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto40.setNome("hi!");
        produto40.setPreco((double) 10);
        produto40.setNome("hi!");
        java.lang.String str47 = produto40.getCodigo();
        double double48 = produto40.getPreco();
        produto40.setCodigo("hi!");
        estoque19.inserirProduto(produto40, (int) 'a');
        boolean boolean54 = estoque19.produtoExiste("");
        estoque19.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto61 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double62 = produto61.getPreco();
        produto61.setNome("hi!");
        java.lang.String str65 = produto61.getCodigo();
        produto61.setCodigo("hi!");
        double double68 = produto61.getPreco();
        produto61.setCodigo("hi!");
        double double71 = produto61.getPreco();
        java.lang.String str72 = produto61.getCodigo();
        estoque19.inserirProduto(produto61, 34);
        double double75 = produto61.getPreco();
        estoque0.inserirProduto(produto61, 32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 100.0d + "'", double62 == 100.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 100.0d + "'", double68 == 100.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 100.0d + "'", double71 == 100.0d);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 100.0d + "'", double75 == 100.0d);
    }

    @Test
    public void test9542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9542");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-98));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test9543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9543");
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
        double double66 = produto50.getPreco();
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
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 34.0d + "'", double66 == 34.0d);
    }

    @Test
    public void test9544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9544");
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
        boolean boolean31 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", 16);
        br.ufrn.imd.Estoque estoque35 = new br.ufrn.imd.Estoque();
        boolean boolean37 = estoque35.produtoExiste("");
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto41.setNome("hi!");
        produto41.setPreco((double) 10);
        estoque35.inserirProduto(produto41, (int) (byte) -1);
        boolean boolean49 = estoque35.produtoExiste("hi!");
        br.ufrn.imd.Produto produto53 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto53.setPreco((double) '#');
        produto53.setPreco((double) 10);
        java.lang.String str58 = produto53.getNome();
        produto53.setPreco(0.0d);
        estoque35.inserirProduto(produto53, (-2));
        br.ufrn.imd.Produto produto66 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto66.setPreco((double) '#');
        estoque35.inserirProduto(produto66, 100);
        produto66.setPreco((double) (-2));
        produto66.setNome("");
        java.lang.String str75 = produto66.getNome();
        produto66.setPreco((double) (-2));
        double double78 = produto66.getPreco();
        produto66.setCodigo("");
        java.lang.String str81 = produto66.getNome();
        double double82 = produto66.getPreco();
        estoque0.inserirProduto(produto66, (-70));
        produto66.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-2.0d) + "'", double78 == (-2.0d));
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-2.0d) + "'", double82 == (-2.0d));
    }

    @Test
    public void test9545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9545");
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
        int int77 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto81 = new br.ufrn.imd.Produto("", "", (double) (-63));
        produto81.setPreco((double) 10);
        estoque0.inserirProduto(produto81, 10);
        produto81.setNome("hi!");
        java.lang.String str88 = produto81.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
    }

    @Test
    public void test9546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9546");
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
        int int32 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test9547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9547");
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
        java.lang.Class<?> wildcardClass37 = produto25.getClass();
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test9548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9548");
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
        java.lang.String str45 = produto38.getNome();
        produto38.setPreco((double) (-98));
        java.lang.String str48 = produto38.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test9549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9549");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 'a');
        double double12 = produto3.getPreco();
        produto3.setCodigo("");
        produto3.setPreco(32.0d);
        produto3.setPreco((double) 166);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
    }

    @Test
    public void test9550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9550");
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
        boolean boolean42 = estoque0.produtoExiste("hi!");
        java.lang.Class<?> wildcardClass43 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test9551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9551");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (-196));
        java.lang.String str4 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test9552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9552");
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
        boolean boolean29 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "hi!", (double) (byte) 0);
        produto33.setNome("hi!");
        estoque0.inserirProduto(produto33, (-116));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test9553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9553");
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
        java.lang.String str36 = produto25.getNome();
        double double37 = produto25.getPreco();
        produto25.setCodigo("");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
    }

    @Test
    public void test9554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9554");
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
        boolean boolean63 = estoque0.produtoExiste("hi!");
        boolean boolean65 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-2) + "'", int59 == (-2));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-2) + "'", int61 == (-2));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test9555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9555");
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
        java.lang.Class<?> wildcardClass93 = estoque0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test9556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9556");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 'a');
        produto3.setNome("");
        produto3.setNome("");
        double double16 = produto3.getPreco();
        double double17 = produto3.getPreco();
        java.lang.String str18 = produto3.getCodigo();
        produto3.setCodigo("");
        produto3.setPreco((-78.0d));
        java.lang.String str23 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test9557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9557");
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
        double double66 = produto59.getPreco();
        produto59.setCodigo("hi!");
        produto59.setPreco((double) (-132));
        double double71 = produto59.getPreco();
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
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-132.0d) + "'", double71 == (-132.0d));
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test9558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9558");
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
        int int32 = estoque0.consultarQuantidade("hi!");
        boolean boolean34 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-98) + "'", int32 == (-98));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test9559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9559");
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
        int int31 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto35 = new br.ufrn.imd.Produto("hi!", "hi!", (-99.0d));
        estoque0.inserirProduto(produto35, (-25));
        java.lang.String str38 = produto35.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test9560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9560");
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
        java.lang.String str34 = produto31.getCodigo();
        java.lang.String str35 = produto31.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test9561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9561");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto3.setPreco((double) (byte) 100);
        produto3.setNome("hi!");
        produto3.setPreco((-10.0d));
        java.lang.String str10 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test9562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9562");
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
        boolean boolean44 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test9563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9563");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 42);
        java.lang.String str4 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test9564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9564");
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
        estoque0.removerProduto("", (int) 'a');
        br.ufrn.imd.Produto produto76 = new br.ufrn.imd.Produto("", "", (double) (short) -1);
        produto76.setCodigo("hi!");
        produto76.setPreco((double) (-108));
        estoque0.inserirProduto(produto76, (-63));
        estoque0.removerProduto("", (-1));
        int int87 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 16);
        int int92 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("", (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-160) + "'", int87 == (-160));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 97 + "'", int92 == 97);
    }

    @Test
    public void test9565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9565");
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
        int int34 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto38 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto38.setNome("hi!");
        produto38.setPreco((double) 10);
        java.lang.String str43 = produto38.getNome();
        double double44 = produto38.getPreco();
        java.lang.String str45 = produto38.getCodigo();
        estoque0.inserirProduto(produto38, (int) 'a');
        int int49 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test9566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9566");
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
        br.ufrn.imd.Estoque estoque28 = new br.ufrn.imd.Estoque();
        boolean boolean30 = estoque28.produtoExiste("");
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto34.setNome("hi!");
        produto34.setPreco((double) 10);
        estoque28.inserirProduto(produto34, (int) (byte) -1);
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto44.setNome("hi!");
        produto44.setNome("");
        estoque28.inserirProduto(produto44, 0);
        int int52 = estoque28.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto56 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto56.setNome("hi!");
        produto56.setPreco((double) 10);
        java.lang.String str61 = produto56.getNome();
        double double62 = produto56.getPreco();
        java.lang.String str63 = produto56.getCodigo();
        estoque28.inserirProduto(produto56, (int) '#');
        boolean boolean67 = estoque28.produtoExiste("");
        int int69 = estoque28.consultarQuantidade("");
        br.ufrn.imd.Produto produto73 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto73.setNome("hi!");
        produto73.setPreco((double) 10);
        java.lang.String str78 = produto73.getCodigo();
        double double79 = produto73.getPreco();
        produto73.setPreco((double) 1.0f);
        produto73.setPreco((double) '4');
        estoque28.inserirProduto(produto73, 0);
        produto73.setPreco((double) (-11));
        estoque0.inserirProduto(produto73, (-9));
        br.ufrn.imd.Produto produto93 = new br.ufrn.imd.Produto("hi!", "", (double) 2);
        estoque0.inserirProduto(produto93, 86);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 10.0d + "'", double79 == 10.0d);
    }

    @Test
    public void test9567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9567");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 10L);
        estoque0.inserirProduto(produto22, (int) (short) 0);
        boolean boolean26 = estoque0.produtoExiste("hi!");
        int int28 = estoque0.consultarQuantidade("hi!");
        int int30 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-98) + "'", int28 == (-98));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-98) + "'", int30 == (-98));
    }

    @Test
    public void test9568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9568");
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
        estoque0.removerProduto("hi!", 109);
        int int26 = estoque0.consultarQuantidade("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-110) + "'", int26 == (-110));
    }

    @Test
    public void test9569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9569");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setCodigo("hi!");
        produto3.setCodigo("hi!");
        java.lang.String str8 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test9570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9570");
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
        boolean boolean52 = estoque0.produtoExiste("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test9571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9571");
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
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("hi!", "", (double) 36);
        produto29.setNome("hi!");
        estoque0.inserirProduto(produto29, (-91));
        br.ufrn.imd.Estoque estoque34 = new br.ufrn.imd.Estoque();
        boolean boolean36 = estoque34.produtoExiste("");
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto40.setNome("hi!");
        produto40.setPreco((double) 10);
        estoque34.inserirProduto(produto40, (int) (byte) -1);
        boolean boolean48 = estoque34.produtoExiste("hi!");
        boolean boolean50 = estoque34.produtoExiste("");
        int int52 = estoque34.consultarQuantidade("");
        estoque34.removerProduto("hi!", (int) (short) 100);
        br.ufrn.imd.Produto produto59 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double60 = produto59.getPreco();
        java.lang.String str61 = produto59.getCodigo();
        java.lang.String str62 = produto59.getNome();
        produto59.setCodigo("");
        double double65 = produto59.getPreco();
        java.lang.String str66 = produto59.getNome();
        estoque34.inserirProduto(produto59, (-1));
        java.lang.String str69 = produto59.getCodigo();
        java.lang.String str70 = produto59.getNome();
        estoque0.inserirProduto(produto59, 199);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 100.0d + "'", double60 == 100.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test9572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9572");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (short) 0);
        produto3.setCodigo("");
        java.lang.String str6 = produto3.getNome();
        java.lang.String str7 = produto3.getCodigo();
        java.lang.String str8 = produto3.getNome();
        java.lang.String str9 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test9573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9573");
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
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test9574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9574");
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
        estoque0.removerProduto("hi!", (int) ' ');
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "hi!", 97.0d);
        produto33.setCodigo("");
        estoque0.inserirProduto(produto33, (int) (short) 10);
        double double38 = produto33.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 97.0d + "'", double38 == 97.0d);
    }

    @Test
    public void test9575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9575");
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
        boolean boolean50 = estoque0.produtoExiste("");
        java.lang.Class<?> wildcardClass51 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test9576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9576");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto3.setNome("");
        java.lang.String str6 = produto3.getCodigo();
        java.lang.String str7 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        java.lang.String str10 = produto3.getNome();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setNome("");
        produto3.setPreco((double) (-53));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test9577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9577");
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
        estoque0.removerProduto("hi!", (-11));
        int int79 = estoque0.consultarQuantidade("");
        int int81 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (-167));
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
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test9578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9578");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setPreco((double) 10L);
        java.lang.String str14 = produto3.getCodigo();
        produto3.setNome("hi!");
        java.lang.String str17 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test9579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9579");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setCodigo("");
        java.lang.String str9 = produto3.getCodigo();
        double double10 = produto3.getPreco();
        java.lang.String str11 = produto3.getNome();
        java.lang.String str12 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test9580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9580");
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
        estoque0.removerProduto("", (int) (byte) 0);
        int int49 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto53 = new br.ufrn.imd.Produto("", "hi!", (double) 100L);
        java.lang.String str54 = produto53.getCodigo();
        java.lang.String str55 = produto53.getNome();
        produto53.setNome("hi!");
        estoque0.inserirProduto(produto53, (-135));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-2) + "'", int49 == (-2));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test9581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9581");
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
        boolean boolean39 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto43 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto43.setPreco((double) '#');
        produto43.setPreco(1.0d);
        java.lang.String str48 = produto43.getCodigo();
        estoque0.inserirProduto(produto43, (int) (byte) 1);
        java.lang.Class<?> wildcardClass51 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test9582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9582");
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
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        boolean boolean32 = estoque30.produtoExiste("");
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto36.setNome("hi!");
        produto36.setPreco((double) 10);
        estoque30.inserirProduto(produto36, (int) (byte) -1);
        estoque30.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque30.inserirProduto(produto49, (int) (short) 100);
        java.lang.String str52 = produto49.getCodigo();
        produto49.setNome("hi!");
        java.lang.String str55 = produto49.getNome();
        estoque0.inserirProduto(produto49, (-35));
        java.lang.Class<?> wildcardClass58 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test9583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9583");
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
        estoque18.removerProduto("hi!", 0);
        estoque18.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str41 = produto40.getCodigo();
        estoque18.inserirProduto(produto40, (int) 'a');
        br.ufrn.imd.Estoque estoque44 = new br.ufrn.imd.Estoque();
        boolean boolean46 = estoque44.produtoExiste("");
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto50.setNome("hi!");
        produto50.setPreco((double) 10);
        estoque44.inserirProduto(produto50, (int) (byte) -1);
        int int58 = estoque44.consultarQuantidade("");
        br.ufrn.imd.Produto produto62 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto62.setNome("");
        estoque44.inserirProduto(produto62, (int) (byte) 10);
        java.lang.String str67 = produto62.getCodigo();
        estoque18.inserirProduto(produto62, (int) ' ');
        estoque0.inserirProduto(produto62, 8);
        produto62.setNome("");
        produto62.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
    }

    @Test
    public void test9584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9584");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        estoque0.removerProduto("hi!", (int) (short) 100);
        boolean boolean16 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (-83));
        br.ufrn.imd.Estoque estoque20 = new br.ufrn.imd.Estoque();
        boolean boolean22 = estoque20.produtoExiste("");
        br.ufrn.imd.Produto produto26 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto26.setNome("hi!");
        produto26.setPreco((double) 10);
        estoque20.inserirProduto(produto26, (int) (byte) -1);
        boolean boolean34 = estoque20.produtoExiste("");
        int int36 = estoque20.consultarQuantidade("");
        boolean boolean38 = estoque20.produtoExiste("");
        estoque20.removerProduto("hi!", (int) ' ');
        boolean boolean43 = estoque20.produtoExiste("");
        int int45 = estoque20.consultarQuantidade("");
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("", "", (double) (-2));
        java.lang.String str50 = produto49.getCodigo();
        estoque20.inserirProduto(produto49, (-97));
        produto49.setNome("hi!");
        java.lang.String str55 = produto49.getCodigo();
        produto49.setNome("hi!");
        estoque0.inserirProduto(produto49, (-68));
        int int61 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-68) + "'", int61 == (-68));
    }

    @Test
    public void test9585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9585");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 10L);
        double double4 = produto3.getPreco();
        produto3.setPreco((double) 0);
        produto3.setPreco((double) (-91));
        produto3.setCodigo("hi!");
        produto3.setCodigo("");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test9586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9586");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        boolean boolean6 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque7 = new br.ufrn.imd.Estoque();
        boolean boolean9 = estoque7.produtoExiste("");
        br.ufrn.imd.Produto produto13 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto13.setNome("hi!");
        produto13.setPreco((double) 10);
        estoque7.inserirProduto(produto13, (int) (byte) -1);
        boolean boolean21 = estoque7.produtoExiste("");
        int int23 = estoque7.consultarQuantidade("");
        boolean boolean25 = estoque7.produtoExiste("");
        estoque7.removerProduto("hi!", (int) ' ');
        br.ufrn.imd.Produto produto32 = new br.ufrn.imd.Produto("", "", 35.0d);
        estoque7.inserirProduto(produto32, (int) (short) -1);
        estoque0.inserirProduto(produto32, (int) (short) -1);
        boolean boolean38 = estoque0.produtoExiste("hi!");
        boolean boolean40 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto44.setNome("");
        java.lang.String str47 = produto44.getCodigo();
        java.lang.String str48 = produto44.getCodigo();
        produto44.setCodigo("hi!");
        produto44.setNome("");
        produto44.setCodigo("hi!");
        java.lang.String str55 = produto44.getCodigo();
        estoque0.inserirProduto(produto44, (-35));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
    }

    @Test
    public void test9587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9587");
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
        boolean boolean47 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto51 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 10L);
        estoque0.inserirProduto(produto51, 0);
        br.ufrn.imd.Produto produto57 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto57.setNome("hi!");
        produto57.setPreco((double) 10);
        java.lang.String str62 = produto57.getCodigo();
        double double63 = produto57.getPreco();
        java.lang.String str64 = produto57.getCodigo();
        produto57.setPreco((double) (short) -1);
        java.lang.String str67 = produto57.getNome();
        estoque0.inserirProduto(produto57, (-11));
        int int71 = estoque0.consultarQuantidade("");
        int int73 = estoque0.consultarQuantidade("hi!");
        java.lang.Class<?> wildcardClass74 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-12) + "'", int73 == (-12));
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test9588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9588");
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
        double double27 = produto16.getPreco();
        java.lang.String str28 = produto16.getCodigo();
        java.lang.String str29 = produto16.getCodigo();
        java.lang.String str30 = produto16.getCodigo();
        produto16.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test9589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9589");
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
        java.lang.String str24 = produto19.getNome();
        produto19.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test9590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9590");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (-1.0f));
        produto3.setCodigo("");
        produto3.setNome("hi!");
        produto3.setPreco((-99.0d));
    }

    @Test
    public void test9591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9591");
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
        estoque0.removerProduto("hi!", 0);
        boolean boolean47 = estoque0.produtoExiste("");
        int int49 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-2) + "'", int42 == (-2));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test9592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9592");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("hi!");
        boolean boolean18 = estoque0.produtoExiste("hi!");
        int int20 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto24 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto24.setNome("hi!");
        produto24.setPreco((double) 10);
        java.lang.String str29 = produto24.getNome();
        double double30 = produto24.getPreco();
        java.lang.String str31 = produto24.getCodigo();
        produto24.setCodigo("hi!");
        java.lang.String str34 = produto24.getCodigo();
        produto24.setPreco(0.0d);
        estoque0.inserirProduto(produto24, (-91));
        estoque0.removerProduto("hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test9593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9593");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 29);
        produto3.setPreco((double) 6);
        double double6 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.0d + "'", double6 == 6.0d);
    }

    @Test
    public void test9594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9594");
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
        java.lang.String str44 = produto31.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 97.0d + "'", double43 == 97.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test9595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9595");
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
        java.lang.String str41 = produto36.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test9596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9596");
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
        produto59.setPreco((double) 16);
        java.lang.String str72 = produto59.getNome();
        java.lang.String str73 = produto59.getCodigo();
        produto59.setNome("hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
    }

    @Test
    public void test9597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9597");
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
        br.ufrn.imd.Produto produto78 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto78.setNome("hi!");
        produto78.setPreco((double) 10);
        produto78.setNome("hi!");
        java.lang.String str85 = produto78.getCodigo();
        double double86 = produto78.getPreco();
        java.lang.String str87 = produto78.getNome();
        estoque0.inserirProduto(produto78, (int) 'a');
        java.lang.String str90 = produto78.getNome();
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
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 10.0d + "'", double86 == 10.0d);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
    }

    @Test
    public void test9598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9598");
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
        java.lang.String str42 = produto31.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-2.0d) + "'", double38 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-33.0d) + "'", double41 == (-33.0d));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test9599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9599");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", 35.0d);
        java.lang.String str4 = produto3.getNome();
        java.lang.String str5 = produto3.getNome();
        double double6 = produto3.getPreco();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test9600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9600");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) '#');
        double double4 = produto3.getPreco();
        double double5 = produto3.getPreco();
        produto3.setNome("");
        produto3.setNome("hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test9601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9601");
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
        boolean boolean50 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto51 = null;
        // The following exception was thrown during execution in test generation
        try {
            estoque0.inserirProduto(produto51, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test9602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9602");
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
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test9603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9603");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.String str8 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.String str11 = produto3.getNome();
        java.lang.String str12 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test9604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9604");
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
        produto23.setNome("hi!");
        java.lang.String str48 = produto23.getCodigo();
        java.lang.String str49 = produto23.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test9605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9605");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) 'a');
        boolean boolean20 = estoque0.produtoExiste("");
        boolean boolean22 = estoque0.produtoExiste("");
        int int24 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("hi!", "hi!", (-90.0d));
        java.lang.String str29 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, 105);
        boolean boolean33 = estoque0.produtoExiste("");
        boolean boolean35 = estoque0.produtoExiste("");
        boolean boolean37 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test9606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9606");
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
        boolean boolean39 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto43 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto43.setPreco((double) '#');
        produto43.setPreco(1.0d);
        java.lang.String str48 = produto43.getCodigo();
        estoque0.inserirProduto(produto43, (int) (byte) 1);
        produto43.setNome("");
        produto43.setPreco(100.0d);
        produto43.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
    }

    @Test
    public void test9607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9607");
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
        produto65.setPreco((double) 38);
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
    }

    @Test
    public void test9608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9608");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100.0f);
        java.lang.String str4 = produto3.getNome();
        produto3.setPreco((double) (-170));
        java.lang.String str7 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test9609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9609");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", 100.0d);
        java.lang.String str4 = produto3.getNome();
        produto3.setPreco((double) (-10));
        java.lang.String str7 = produto3.getCodigo();
        java.lang.String str8 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test9610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9610");
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
        java.lang.String str60 = produto47.getCodigo();
        produto47.setCodigo("");
        produto47.setPreco((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 100.0d + "'", double57 == 100.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
    }

    @Test
    public void test9611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9611");
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
        int int69 = estoque0.consultarQuantidade("hi!");
        boolean boolean71 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto75 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto75.setNome("hi!");
        produto75.setNome("");
        java.lang.String str80 = produto75.getCodigo();
        double double81 = produto75.getPreco();
        produto75.setNome("");
        java.lang.String str84 = produto75.getNome();
        estoque0.inserirProduto(produto75, (-3));
        produto75.setPreco((double) (-20));
        java.lang.String str89 = produto75.getNome();
        double double90 = produto75.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 68 + "'", int69 == 68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-20.0d) + "'", double90 == (-20.0d));
    }

    @Test
    public void test9612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9612");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (-78.0d));
        double double4 = produto3.getPreco();
        double double5 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-78.0d) + "'", double4 == (-78.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-78.0d) + "'", double5 == (-78.0d));
    }

    @Test
    public void test9613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9613");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 116);
        produto3.setNome("hi!");
        double double6 = produto3.getPreco();
        produto3.setPreco(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 116.0d + "'", double6 == 116.0d);
    }

    @Test
    public void test9614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9614");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        java.lang.String str6 = produto3.getCodigo();
        produto3.setNome("");
        produto3.setPreco((double) (-102));
        java.lang.String str11 = produto3.getCodigo();
        java.lang.String str12 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test9615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9615");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        boolean boolean19 = estoque0.produtoExiste("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 109);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test9616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9616");
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
        double double31 = produto16.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    }

    @Test
    public void test9617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9617");
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
        double double17 = produto3.getPreco();
        java.lang.String str18 = produto3.getNome();
        double double19 = produto3.getPreco();
        double double20 = produto3.getPreco();
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test9618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9618");
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
        produto48.setNome("hi!");
        produto48.setPreco((double) 33);
        double double67 = produto48.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 33.0d + "'", double67 == 33.0d);
    }

    @Test
    public void test9619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9619");
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
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        double double24 = produto21.getPreco();
        produto21.setCodigo("");
        produto21.setCodigo("hi!");
        produto21.setCodigo("hi!");
        estoque0.inserirProduto(produto21, 0);
        produto21.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    }

    @Test
    public void test9620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9620");
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
        br.ufrn.imd.Estoque estoque34 = new br.ufrn.imd.Estoque();
        boolean boolean36 = estoque34.produtoExiste("");
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto40.setNome("hi!");
        produto40.setPreco((double) 10);
        estoque34.inserirProduto(produto40, (int) (byte) -1);
        boolean boolean48 = estoque34.produtoExiste("hi!");
        boolean boolean50 = estoque34.produtoExiste("");
        int int52 = estoque34.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque53 = new br.ufrn.imd.Estoque();
        boolean boolean55 = estoque53.produtoExiste("");
        br.ufrn.imd.Produto produto59 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto59.setNome("hi!");
        produto59.setPreco((double) 10);
        estoque53.inserirProduto(produto59, (int) (byte) -1);
        estoque53.removerProduto("hi!", 0);
        estoque53.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto75 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str76 = produto75.getCodigo();
        estoque53.inserirProduto(produto75, (int) 'a');
        estoque34.inserirProduto(produto75, 100);
        estoque0.inserirProduto(produto75, (int) ' ');
        boolean boolean84 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test9621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9621");
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
        boolean boolean36 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test9622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9622");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        int int19 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque20 = new br.ufrn.imd.Estoque();
        boolean boolean22 = estoque20.produtoExiste("");
        br.ufrn.imd.Produto produto26 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto26.setNome("hi!");
        produto26.setPreco((double) 10);
        estoque20.inserirProduto(produto26, (int) (byte) -1);
        estoque20.removerProduto("hi!", 0);
        estoque20.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto42 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 10L);
        estoque20.inserirProduto(produto42, (int) (short) 0);
        estoque0.inserirProduto(produto42, (-4));
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("hi!", "", 97.0d);
        java.lang.String str51 = produto50.getNome();
        estoque0.inserirProduto(produto50, 29);
        int int55 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (-92));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 29 + "'", int55 == 29);
    }

    @Test
    public void test9623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9623");
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
        produto33.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test9624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9624");
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
        produto18.setPreco((double) (-33));
        produto18.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test9625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9625");
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
        br.ufrn.imd.Produto produto80 = new br.ufrn.imd.Produto("hi!", "", (double) 19);
        java.lang.String str81 = produto80.getCodigo();
        estoque0.inserirProduto(produto80, 28);
        java.lang.String str84 = produto80.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test9626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9626");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (short) -1);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("hi!");
        double double7 = produto3.getPreco();
        produto3.setPreco((-2.0d));
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getCodigo();
        java.lang.Class<?> wildcardClass12 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test9627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9627");
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
        produto47.setPreco((double) 149);
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
    public void test9628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9628");
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
        int int32 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto36.setNome("hi!");
        produto36.setPreco((double) 10);
        java.lang.String str41 = produto36.getCodigo();
        double double42 = produto36.getPreco();
        produto36.setPreco((double) 1.0f);
        produto36.setPreco((double) '4');
        produto36.setCodigo("");
        produto36.setCodigo("hi!");
        produto36.setPreco((double) (-1L));
        estoque0.inserirProduto(produto36, 54);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-98) + "'", int32 == (-98));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
    }

    @Test
    public void test9629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9629");
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
        produto21.setCodigo("hi!");
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
    }

    @Test
    public void test9630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9630");
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
        produto40.setPreco((double) 114);
        java.lang.String str59 = produto40.getNome();
        java.lang.String str60 = produto40.getNome();
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
    public void test9631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9631");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (-5.0d));
    }

    @Test
    public void test9632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9632");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto3.setCodigo("hi!");
        produto3.setNome("");
        java.lang.String str8 = produto3.getNome();
        java.lang.String str9 = produto3.getCodigo();
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test9633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9633");
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
        int int82 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto86 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double87 = produto86.getPreco();
        java.lang.String str88 = produto86.getCodigo();
        java.lang.String str89 = produto86.getNome();
        produto86.setCodigo("");
        java.lang.String str92 = produto86.getCodigo();
        produto86.setNome("hi!");
        estoque0.inserirProduto(produto86, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 52 + "'", int82 == 52);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 100.0d + "'", double87 == 100.0d);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test9634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9634");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto22.setNome("hi!");
        produto22.setNome("");
        produto22.setPreco(1.0d);
        java.lang.String str29 = produto22.getCodigo();
        double double30 = produto22.getPreco();
        produto22.setNome("");
        produto22.setNome("");
        double double35 = produto22.getPreco();
        produto22.setPreco((double) (-1));
        produto22.setNome("hi!");
        estoque0.inserirProduto(produto22, (-1));
        boolean boolean43 = estoque0.produtoExiste("");
        int int45 = estoque0.consultarQuantidade("");
        int int47 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test9635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9635");
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
        estoque0.removerProduto("", (-99));
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
    }

    @Test
    public void test9636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9636");
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
        produto41.setNome("hi!");
        produto41.setCodigo("");
        double double59 = produto41.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
    }

    @Test
    public void test9637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9637");
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
        int int67 = estoque0.consultarQuantidade("");
        int int69 = estoque0.consultarQuantidade("hi!");
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
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 97 + "'", int67 == 97);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-97) + "'", int69 == (-97));
    }

    @Test
    public void test9638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9638");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        int int13 = estoque0.consultarQuantidade("");
        boolean boolean15 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) (short) 0);
        boolean boolean20 = estoque0.produtoExiste("hi!");
        int int22 = estoque0.consultarQuantidade("hi!");
        boolean boolean24 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        produto28.setNome("hi!");
        java.lang.String str35 = produto28.getCodigo();
        double double36 = produto28.getPreco();
        java.lang.String str37 = produto28.getCodigo();
        produto28.setNome("hi!");
        java.lang.String str40 = produto28.getNome();
        produto28.setPreco((double) (short) 1);
        produto28.setCodigo("");
        produto28.setNome("");
        estoque0.inserirProduto(produto28, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-100) + "'", int22 == (-100));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test9639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9639");
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
        estoque0.removerProduto("hi!", 50);
        boolean boolean93 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test9640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9640");
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
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("", "", (double) 34);
        estoque0.inserirProduto(produto31, 97);
        produto31.setCodigo("hi!");
        produto31.setPreco((-2.0d));
        java.lang.String str38 = produto31.getCodigo();
        java.lang.String str39 = produto31.getCodigo();
        java.lang.String str40 = produto31.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test9641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9641");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) -1);
        double double4 = produto3.getPreco();
        produto3.setPreco((double) (-150));
        java.lang.String str7 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test9642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9642");
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
        java.lang.String str24 = produto3.getNome();
        java.lang.String str25 = produto3.getNome();
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test9643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9643");
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
        br.ufrn.imd.Estoque estoque22 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto26 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto26.setCodigo("hi!");
        estoque22.inserirProduto(produto26, (int) (byte) 0);
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto34.setNome("hi!");
        produto34.setNome("");
        produto34.setPreco(1.0d);
        estoque22.inserirProduto(produto34, 100);
        produto34.setPreco((double) 0);
        produto34.setNome("hi!");
        java.lang.String str47 = produto34.getCodigo();
        estoque0.inserirProduto(produto34, (-132));
        double double50 = produto34.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    }

    @Test
    public void test9644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9644");
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
        br.ufrn.imd.Produto produto72 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto72.setNome("hi!");
        produto72.setPreco((double) 10);
        java.lang.String str77 = produto72.getNome();
        double double78 = produto72.getPreco();
        java.lang.String str79 = produto72.getNome();
        produto72.setNome("hi!");
        estoque0.inserirProduto(produto72, (-100));
        boolean boolean85 = estoque0.produtoExiste("hi!");
        boolean boolean87 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test9645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9645");
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
        br.ufrn.imd.Produto produto52 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 1);
        double double53 = produto52.getPreco();
        estoque0.inserirProduto(produto52, 0);
        int int57 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (-91));
        estoque0.removerProduto("hi!", 36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test9646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9646");
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
        java.lang.String str72 = produto65.getNome();
        produto65.setPreco((double) 16);
        produto65.setCodigo("");
        produto65.setPreco((double) (-1.0f));
        double double79 = produto65.getPreco();
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
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
    }

    @Test
    public void test9647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9647");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 18);
        produto3.setNome("hi!");
        produto3.setCodigo("");
        java.lang.String str8 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test9648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9648");
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
        boolean boolean23 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto27 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto27.setPreco((double) '#');
        produto27.setPreco((double) 10);
        java.lang.String str32 = produto27.getNome();
        produto27.setPreco(0.0d);
        produto27.setNome("hi!");
        produto27.setPreco((double) 96);
        estoque0.inserirProduto(produto27, 28);
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-132));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test9649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9649");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (-54));
    }

    @Test
    public void test9650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9650");
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
        java.lang.Class<?> wildcardClass44 = produto33.getClass();
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test9651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9651");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 100L);
        produto3.setNome("hi!");
        produto3.setPreco((double) 0L);
        produto3.setCodigo("hi!");
        produto3.setNome("");
        java.lang.Class<?> wildcardClass12 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test9652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9652");
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
        br.ufrn.imd.Produto produto72 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto72.setNome("hi!");
        produto72.setPreco((double) 10);
        java.lang.String str77 = produto72.getNome();
        double double78 = produto72.getPreco();
        java.lang.String str79 = produto72.getNome();
        java.lang.String str80 = produto72.getCodigo();
        estoque0.inserirProduto(produto72, (-20));
        boolean boolean84 = estoque0.produtoExiste("hi!");
        boolean boolean86 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test9653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9653");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setPreco((double) 10L);
        java.lang.String str14 = produto3.getCodigo();
        produto3.setPreco(0.0d);
        java.lang.String str17 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test9654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9654");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        java.lang.String str8 = produto3.getNome();
        java.lang.String str9 = produto3.getCodigo();
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getNome();
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test9655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9655");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        double double10 = produto3.getPreco();
        produto3.setCodigo("hi!");
        java.lang.String str13 = produto3.getNome();
        produto3.setCodigo("");
        java.lang.String str16 = produto3.getCodigo();
        produto3.setNome("");
        java.lang.String str19 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test9656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9656");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto3.setCodigo("hi!");
        produto3.setNome("");
        produto3.setPreco((-53.0d));
    }

    @Test
    public void test9657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9657");
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
        br.ufrn.imd.Produto produto45 = null;
        // The following exception was thrown during execution in test generation
        try {
            estoque0.inserirProduto(produto45, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test9658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9658");
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
        estoque0.removerProduto("hi!", (int) (short) -1);
        br.ufrn.imd.Produto produto66 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto66.setNome("hi!");
        produto66.setPreco((double) 10);
        produto66.setNome("hi!");
        produto66.setPreco((double) 'a');
        produto66.setNome("");
        produto66.setNome("");
        produto66.setPreco((double) (short) -1);
        double double81 = produto66.getPreco();
        java.lang.String str82 = produto66.getCodigo();
        produto66.setCodigo("hi!");
        produto66.setNome("");
        java.lang.String str87 = produto66.getNome();
        estoque0.inserirProduto(produto66, (-89));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test9659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9659");
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
        estoque0.removerProduto("hi!", (-102));
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
    public void test9660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9660");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco((double) 10L);
        double double10 = produto3.getPreco();
        produto3.setPreco((double) (-11));
        produto3.setPreco((double) (-101));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test9661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9661");
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
        estoque0.removerProduto("hi!", (-53));
        int int27 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (-167));
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 102);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test9662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9662");
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
        int int32 = estoque0.consultarQuantidade("hi!");
        java.lang.Class<?> wildcardClass33 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-170) + "'", int32 == (-170));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test9663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9663");
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
        java.lang.String str33 = produto26.getCodigo();
        double double34 = produto26.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-108.0d) + "'", double34 == (-108.0d));
    }

    @Test
    public void test9664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9664");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) ' ');
        produto3.setCodigo("");
        java.lang.String str6 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test9665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9665");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto3.setCodigo("");
        double double6 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test9666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9666");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        produto3.setNome("");
        double double10 = produto3.getPreco();
        produto3.setCodigo("hi!");
        double double13 = produto3.getPreco();
        produto3.setPreco((double) (-3));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test9667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9667");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        double double9 = produto3.getPreco();
        produto3.setPreco((double) 1.0f);
        produto3.setPreco((double) '4');
        produto3.setCodigo("");
        double double16 = produto3.getPreco();
        produto3.setPreco((double) 0);
        java.lang.String str19 = produto3.getNome();
        double double20 = produto3.getPreco();
        produto3.setPreco(52.0d);
        produto3.setNome("hi!");
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test9668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9668");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (-118));
    }

    @Test
    public void test9669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9669");
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
        br.ufrn.imd.Estoque estoque54 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto58.setCodigo("hi!");
        estoque54.inserirProduto(produto58, (int) (byte) 0);
        estoque54.removerProduto("hi!", (int) (byte) 100);
        int int67 = estoque54.consultarQuantidade("");
        boolean boolean69 = estoque54.produtoExiste("");
        br.ufrn.imd.Produto produto73 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto73.setNome("hi!");
        produto73.setNome("");
        estoque54.inserirProduto(produto73, (int) (byte) -1);
        estoque0.inserirProduto(produto73, 114);
        boolean boolean83 = estoque0.produtoExiste("");
        int int85 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test9670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9670");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 9);
        produto3.setPreco((double) (byte) 0);
        double double6 = produto3.getPreco();
        java.lang.String str7 = produto3.getCodigo();
        produto3.setNome("");
        produto3.setCodigo("");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test9671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9671");
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
        double double39 = produto25.getPreco();
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-4.0d) + "'", double38 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-4.0d) + "'", double39 == (-4.0d));
    }

    @Test
    public void test9672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9672");
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
        int int65 = estoque0.consultarQuantidade("");
        boolean boolean67 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (-97));
        java.lang.Class<?> wildcardClass71 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test9673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9673");
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
        boolean boolean30 = estoque0.produtoExiste("hi!");
        int int32 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test9674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9674");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (byte) 1);
        produto3.setPreco((double) 0L);
        produto3.setCodigo("");
        produto3.setCodigo("");
        produto3.setNome("hi!");
        produto3.setCodigo("");
        produto3.setPreco((double) (-1.0f));
        java.lang.Class<?> wildcardClass16 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test9675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9675");
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
        estoque0.removerProduto("hi!", 109);
        boolean boolean55 = estoque0.produtoExiste("");
        int int57 = estoque0.consultarQuantidade("hi!");
        boolean boolean59 = estoque0.produtoExiste("hi!");
        int int61 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 116 + "'", int57 == 116);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test9676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9676");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setCodigo("hi!");
        produto3.setCodigo("");
        double double8 = produto3.getPreco();
        produto3.setPreco((double) 1.0f);
        double double11 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test9677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9677");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 'a');
        produto3.setCodigo("");
        produto3.setCodigo("");
        produto3.setPreco((double) (-11));
    }

    @Test
    public void test9678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9678");
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
        int int27 = estoque0.consultarQuantidade("");
        int int29 = estoque0.consultarQuantidade("");
        int int31 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 99 + "'", int31 == 99);
    }

    @Test
    public void test9679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9679");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (short) -1);
        produto3.setCodigo("hi!");
        produto3.setCodigo("hi!");
        double double8 = produto3.getPreco();
        java.lang.String str9 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test9680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9680");
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
        java.lang.Class<?> wildcardClass56 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-91) + "'", int51 == (-91));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-91) + "'", int55 == (-91));
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test9681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9681");
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
        br.ufrn.imd.Produto produto52 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 0L);
        java.lang.String str53 = produto52.getCodigo();
        estoque0.inserirProduto(produto52, 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 18 + "'", int44 == 18);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 18 + "'", int48 == 18);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
    }

    @Test
    public void test9682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9682");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        boolean boolean4 = estoque0.produtoExiste("hi!");
        boolean boolean6 = estoque0.produtoExiste("");
        boolean boolean8 = estoque0.produtoExiste("hi!");
        int int10 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque11 = new br.ufrn.imd.Estoque();
        boolean boolean13 = estoque11.produtoExiste("");
        br.ufrn.imd.Produto produto17 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto17.setNome("hi!");
        produto17.setPreco((double) 10);
        estoque11.inserirProduto(produto17, (int) (byte) -1);
        br.ufrn.imd.Produto produto27 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto27.setNome("hi!");
        produto27.setNome("");
        estoque11.inserirProduto(produto27, 0);
        int int35 = estoque11.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto39.setNome("hi!");
        produto39.setPreco((double) 10);
        java.lang.String str44 = produto39.getNome();
        double double45 = produto39.getPreco();
        java.lang.String str46 = produto39.getCodigo();
        estoque11.inserirProduto(produto39, (int) '#');
        br.ufrn.imd.Produto produto52 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque11.inserirProduto(produto52, (-1));
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto58.setNome("hi!");
        produto58.setPreco((double) 10);
        java.lang.String str63 = produto58.getCodigo();
        java.lang.String str64 = produto58.getCodigo();
        estoque11.inserirProduto(produto58, 0);
        br.ufrn.imd.Produto produto70 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str71 = produto70.getCodigo();
        produto70.setNome("");
        double double74 = produto70.getPreco();
        estoque11.inserirProduto(produto70, 0);
        produto70.setPreco((double) 8);
        java.lang.String str79 = produto70.getNome();
        produto70.setPreco((-100.0d));
        estoque0.inserirProduto(produto70, (int) '4');
        int int85 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto89 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 1);
        double double90 = produto89.getPreco();
        produto89.setNome("hi!");
        estoque0.inserirProduto(produto89, 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 1.0d + "'", double90 == 1.0d);
    }

    @Test
    public void test9683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9683");
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
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double30 = produto29.getPreco();
        java.lang.String str31 = produto29.getCodigo();
        java.lang.String str32 = produto29.getCodigo();
        produto29.setPreco((double) (short) -1);
        estoque0.inserirProduto(produto29, (int) (byte) 1);
        int int38 = estoque0.consultarQuantidade("hi!");
        boolean boolean40 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test9684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9684");
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
        produto41.setCodigo("hi!");
        double double49 = produto41.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
    }

    @Test
    public void test9685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9685");
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
        estoque0.removerProduto("", 18);
        br.ufrn.imd.Estoque estoque54 = new br.ufrn.imd.Estoque();
        boolean boolean56 = estoque54.produtoExiste("");
        br.ufrn.imd.Produto produto60 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto60.setNome("hi!");
        produto60.setPreco((double) 10);
        estoque54.inserirProduto(produto60, (int) (byte) -1);
        estoque54.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto73 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque54.inserirProduto(produto73, (int) (short) 100);
        br.ufrn.imd.Produto produto79 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double80 = produto79.getPreco();
        java.lang.String str81 = produto79.getCodigo();
        java.lang.String str82 = produto79.getNome();
        produto79.setCodigo("");
        double double85 = produto79.getPreco();
        java.lang.String str86 = produto79.getCodigo();
        produto79.setNome("hi!");
        java.lang.String str89 = produto79.getNome();
        estoque54.inserirProduto(produto79, (-63));
        java.lang.String str92 = produto79.getNome();
        estoque0.inserirProduto(produto79, (-82));
        java.lang.String str95 = produto79.getNome();
        java.lang.String str96 = produto79.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 18 + "'", int46 == 18);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 100.0d + "'", double80 == 100.0d);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 100.0d + "'", double85 == 100.0d);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "hi!" + "'", str95, "hi!");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "hi!" + "'", str96, "hi!");
    }

    @Test
    public void test9686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9686");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        int int16 = estoque0.consultarQuantidade("");
        boolean boolean18 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", 129);
        estoque0.removerProduto("hi!", (-200));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test9687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9687");
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
        produto19.setNome("");
        produto19.setPreco((double) (-13));
        double double42 = produto19.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-13.0d) + "'", double42 == (-13.0d));
    }

    @Test
    public void test9688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9688");
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
        br.ufrn.imd.Produto produto59 = new br.ufrn.imd.Produto("hi!", "hi!", (-101.0d));
        estoque0.inserirProduto(produto59, 97);
        boolean boolean63 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 18 + "'", int46 == 18);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test9689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9689");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 0);
        produto3.setCodigo("");
        produto3.setPreco(7.0d);
    }

    @Test
    public void test9690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9690");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("");
        java.lang.String str6 = produto3.getNome();
        produto3.setNome("");
        produto3.setCodigo("");
        produto3.setPreco((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test9691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9691");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        produto3.setNome("");
        produto3.setPreco((double) 18);
        java.lang.String str18 = produto3.getCodigo();
        produto3.setPreco((double) 33);
        produto3.setCodigo("hi!");
        produto3.setCodigo("");
        double double25 = produto3.getPreco();
        java.lang.String str26 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 33.0d + "'", double25 == 33.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test9692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9692");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto3.setPreco((double) (short) 1);
        java.lang.String str6 = produto3.getNome();
        java.lang.String str7 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test9693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9693");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        double double9 = produto3.getPreco();
        double double10 = produto3.getPreco();
        produto3.setPreco(100.0d);
        java.lang.String str13 = produto3.getCodigo();
        java.lang.String str14 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test9694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9694");
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
        produto76.setPreco((-2.0d));
        produto76.setCodigo("");
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
    }

    @Test
    public void test9695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9695");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (-5));
        java.lang.Class<?> wildcardClass4 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test9696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9696");
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
        produto21.setPreco((-3.0d));
        produto21.setNome("hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test9697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9697");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        produto3.setNome("");
        produto3.setPreco((double) (byte) 100);
        java.lang.String str15 = produto3.getNome();
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test9698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9698");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test9699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9699");
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
        java.lang.String str28 = produto21.getNome();
        java.lang.String str29 = produto21.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test9700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9700");
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
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto25.setNome("hi!");
        produto25.setNome("");
        estoque9.inserirProduto(produto25, 0);
        int int33 = estoque9.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto37.setNome("hi!");
        produto37.setPreco((double) 10);
        java.lang.String str42 = produto37.getNome();
        double double43 = produto37.getPreco();
        java.lang.String str44 = produto37.getCodigo();
        estoque9.inserirProduto(produto37, (int) '#');
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque9.inserirProduto(produto50, (-1));
        br.ufrn.imd.Produto produto56 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double57 = produto56.getPreco();
        java.lang.String str58 = produto56.getCodigo();
        java.lang.String str59 = produto56.getNome();
        estoque9.inserirProduto(produto56, 1);
        java.lang.String str62 = produto56.getNome();
        estoque0.inserirProduto(produto56, (-11));
        int int66 = estoque0.consultarQuantidade("hi!");
        boolean boolean68 = estoque0.produtoExiste("hi!");
        int int70 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 100.0d + "'", double57 == 100.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-11) + "'", int66 == (-11));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test9701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9701");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 54);
        produto3.setNome("hi!");
        produto3.setNome("");
        double double8 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 54.0d + "'", double8 == 54.0d);
    }

    @Test
    public void test9702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9702");
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
        boolean boolean44 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test9703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9703");
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
        estoque0.removerProduto("hi!", 6);
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
    }

    @Test
    public void test9704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9704");
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
        int int63 = estoque0.consultarQuantidade("hi!");
        int int65 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 149);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-2) + "'", int59 == (-2));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-2) + "'", int63 == (-2));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test9705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9705");
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
        br.ufrn.imd.Produto produto24 = new br.ufrn.imd.Produto("hi!", "", 100.0d);
        estoque0.inserirProduto(produto24, 18);
        double double27 = produto24.getPreco();
        produto24.setPreco(99.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
    }

    @Test
    public void test9706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9706");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 'a');
        produto3.setNome("");
        produto3.setNome("");
        java.lang.String str16 = produto3.getNome();
        double double17 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test9707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9707");
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
        br.ufrn.imd.Estoque estoque47 = new br.ufrn.imd.Estoque();
        boolean boolean49 = estoque47.produtoExiste("");
        br.ufrn.imd.Produto produto53 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto53.setNome("hi!");
        produto53.setPreco((double) 10);
        estoque47.inserirProduto(produto53, (int) (byte) -1);
        int int61 = estoque47.consultarQuantidade("");
        estoque47.removerProduto("hi!", 1);
        int int66 = estoque47.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto70 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto70.setNome("hi!");
        produto70.setPreco((double) 10);
        java.lang.String str75 = produto70.getCodigo();
        double double76 = produto70.getPreco();
        produto70.setPreco((double) 1.0f);
        estoque47.inserirProduto(produto70, (int) (short) 0);
        br.ufrn.imd.Produto produto84 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 0);
        produto84.setCodigo("");
        estoque47.inserirProduto(produto84, (int) (byte) 1);
        java.lang.String str89 = produto84.getCodigo();
        produto84.setCodigo("");
        java.lang.String str92 = produto84.getCodigo();
        estoque0.inserirProduto(produto84, 127);
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-2) + "'", int66 == (-2));
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 10.0d + "'", double76 == 10.0d);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test9708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9708");
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
        int int49 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque50 = new br.ufrn.imd.Estoque();
        boolean boolean52 = estoque50.produtoExiste("");
        br.ufrn.imd.Produto produto56 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto56.setNome("hi!");
        produto56.setPreco((double) 10);
        estoque50.inserirProduto(produto56, (int) (byte) -1);
        estoque50.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto69 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto69.setNome("hi!");
        produto69.setPreco((double) 10);
        java.lang.String str74 = produto69.getNome();
        double double75 = produto69.getPreco();
        java.lang.String str76 = produto69.getCodigo();
        produto69.setCodigo("hi!");
        java.lang.String str79 = produto69.getCodigo();
        produto69.setNome("");
        estoque50.inserirProduto(produto69, (int) (short) 10);
        java.lang.String str84 = produto69.getCodigo();
        double double85 = produto69.getPreco();
        estoque0.inserirProduto(produto69, (-76));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 109 + "'", int44 == 109);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 10.0d + "'", double75 == 10.0d);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 10.0d + "'", double85 == 10.0d);
    }

    @Test
    public void test9709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9709");
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
        int int73 = estoque0.consultarQuantidade("");
        boolean boolean75 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 97 + "'", int73 == 97);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test9710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9710");
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
        boolean boolean60 = estoque0.produtoExiste("hi!");
        boolean boolean62 = estoque0.produtoExiste("");
        boolean boolean64 = estoque0.produtoExiste("");
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
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test9711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9711");
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
        int int71 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 54);
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
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test9712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9712");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", 0.0d);
        java.lang.String str4 = produto3.getNome();
        double double5 = produto3.getPreco();
        java.lang.String str6 = produto3.getCodigo();
        produto3.setCodigo("");
        produto3.setPreco(52.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test9713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9713");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (-56.0d));
    }

    @Test
    public void test9714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9714");
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
        int int33 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto34 = null;
        // The following exception was thrown during execution in test generation
        try {
            estoque0.inserirProduto(produto34, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test9715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9715");
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
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("hi!", "", (double) 9);
        java.lang.String str47 = produto46.getCodigo();
        produto46.setNome("hi!");
        estoque0.inserirProduto(produto46, (-92));
        estoque0.removerProduto("", (-167));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test9716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9716");
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
        estoque0.removerProduto("", 199);
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
    public void test9717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9717");
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
        boolean boolean33 = estoque0.produtoExiste("");
        boolean boolean35 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test9718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9718");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 10.0f);
        double double4 = produto3.getPreco();
        java.lang.Class<?> wildcardClass5 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9719");
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
        produto21.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test9720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9720");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (-167.0d));
    }

    @Test
    public void test9721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9721");
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
        br.ufrn.imd.Estoque estoque32 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto36.setCodigo("hi!");
        estoque32.inserirProduto(produto36, (int) (byte) 0);
        estoque32.removerProduto("hi!", (int) (byte) 100);
        int int45 = estoque32.consultarQuantidade("");
        boolean boolean47 = estoque32.produtoExiste("");
        boolean boolean49 = estoque32.produtoExiste("hi!");
        br.ufrn.imd.Produto produto53 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto53.setNome("");
        java.lang.String str56 = produto53.getNome();
        estoque32.inserirProduto(produto53, (int) (byte) 10);
        double double59 = produto53.getPreco();
        java.lang.String str60 = produto53.getCodigo();
        java.lang.String str61 = produto53.getNome();
        estoque0.inserirProduto(produto53, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test9722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9722");
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
        boolean boolean29 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double34 = produto33.getPreco();
        produto33.setNome("hi!");
        java.lang.String str37 = produto33.getCodigo();
        produto33.setCodigo("hi!");
        double double40 = produto33.getPreco();
        produto33.setCodigo("hi!");
        java.lang.String str43 = produto33.getNome();
        double double44 = produto33.getPreco();
        estoque0.inserirProduto(produto33, 33);
        produto33.setNome("hi!");
        java.lang.String str49 = produto33.getCodigo();
        java.lang.String str50 = produto33.getCodigo();
        produto33.setCodigo("hi!");
        produto33.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test9723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9723");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setNome("");
        produto3.setNome("hi!");
        java.lang.String str15 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test9724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9724");
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
        boolean boolean52 = estoque0.produtoExiste("");
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test9725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9725");
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
        br.ufrn.imd.Estoque estoque23 = new br.ufrn.imd.Estoque();
        boolean boolean25 = estoque23.produtoExiste("");
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto29.setNome("hi!");
        produto29.setPreco((double) 10);
        estoque23.inserirProduto(produto29, (int) (byte) -1);
        estoque23.removerProduto("hi!", 0);
        int int40 = estoque23.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque41 = new br.ufrn.imd.Estoque();
        boolean boolean43 = estoque41.produtoExiste("");
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto47.setNome("hi!");
        produto47.setPreco((double) 10);
        estoque41.inserirProduto(produto47, (int) (byte) -1);
        br.ufrn.imd.Produto produto57 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto57.setNome("hi!");
        produto57.setNome("");
        estoque41.inserirProduto(produto57, 0);
        int int65 = estoque41.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto69 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto69.setNome("hi!");
        produto69.setPreco((double) 10);
        java.lang.String str74 = produto69.getNome();
        double double75 = produto69.getPreco();
        java.lang.String str76 = produto69.getCodigo();
        estoque41.inserirProduto(produto69, (int) '#');
        estoque23.inserirProduto(produto69, (int) (byte) -1);
        boolean boolean82 = estoque23.produtoExiste("hi!");
        int int84 = estoque23.consultarQuantidade("hi!");
        boolean boolean86 = estoque23.produtoExiste("hi!");
        br.ufrn.imd.Produto produto90 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 99);
        produto90.setCodigo("hi!");
        estoque23.inserirProduto(produto90, 0);
        produto90.setCodigo("hi!");
        java.lang.String str97 = produto90.getCodigo();
        estoque0.inserirProduto(produto90, (-103));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 10.0d + "'", double75 == 10.0d);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-2) + "'", int84 == (-2));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "hi!" + "'", str97, "hi!");
    }

    @Test
    public void test9726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9726");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (byte) 10);
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        produto21.setPreco((double) 10);
        java.lang.String str26 = produto21.getNome();
        double double27 = produto21.getPreco();
        java.lang.String str28 = produto21.getCodigo();
        java.lang.String str29 = produto21.getCodigo();
        produto21.setCodigo("hi!");
        produto21.setPreco((double) (short) 10);
        estoque0.inserirProduto(produto21, (-33));
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("", "hi!", (double) (-68));
        estoque0.inserirProduto(produto39, 0);
        double double42 = produto39.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-68.0d) + "'", double42 == (-68.0d));
    }

    @Test
    public void test9727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9727");
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
        int int77 = estoque0.consultarQuantidade("");
        int int79 = estoque0.consultarQuantidade("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test9728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9728");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        int int13 = estoque0.consultarQuantidade("");
        boolean boolean15 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) (short) 0);
        int int20 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque21 = new br.ufrn.imd.Estoque();
        boolean boolean23 = estoque21.produtoExiste("");
        br.ufrn.imd.Produto produto27 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto27.setNome("hi!");
        produto27.setPreco((double) 10);
        estoque21.inserirProduto(produto27, (int) (byte) -1);
        estoque21.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto40.setNome("hi!");
        produto40.setPreco((double) 10);
        java.lang.String str45 = produto40.getNome();
        double double46 = produto40.getPreco();
        java.lang.String str47 = produto40.getCodigo();
        produto40.setCodigo("hi!");
        java.lang.String str50 = produto40.getCodigo();
        produto40.setNome("");
        estoque21.inserirProduto(produto40, (int) (short) 10);
        boolean boolean56 = estoque21.produtoExiste("hi!");
        br.ufrn.imd.Produto produto60 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto60.setPreco((double) '#');
        produto60.setPreco((double) 10);
        java.lang.String str65 = produto60.getNome();
        produto60.setPreco(0.0d);
        estoque21.inserirProduto(produto60, (int) (byte) -1);
        double double70 = produto60.getPreco();
        estoque0.inserirProduto(produto60, (-211));
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
    }

    @Test
    public void test9729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9729");
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
        br.ufrn.imd.Produto produto72 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto72.setNome("hi!");
        produto72.setPreco((double) 10);
        java.lang.String str77 = produto72.getNome();
        double double78 = produto72.getPreco();
        java.lang.String str79 = produto72.getNome();
        java.lang.String str80 = produto72.getCodigo();
        estoque0.inserirProduto(produto72, (-20));
        boolean boolean84 = estoque0.produtoExiste("");
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
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test9730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9730");
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
        boolean boolean31 = estoque0.produtoExiste("hi!");
        boolean boolean33 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test9731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9731");
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
        produto28.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test9732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9732");
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
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("", "", (double) 1);
        estoque0.inserirProduto(produto29, (int) 'a');
        produto29.setCodigo("hi!");
        java.lang.String str34 = produto29.getCodigo();
        produto29.setPreco((double) (-50));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test9733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9733");
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
        boolean boolean45 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (-10));
        boolean boolean50 = estoque0.produtoExiste("");
        java.lang.Class<?> wildcardClass51 = estoque0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test9734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9734");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-2));
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test9735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9735");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", 9.0d);
    }

    @Test
    public void test9736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9736");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        produto3.setNome("");
        produto3.setPreco(0.0d);
        double double12 = produto3.getPreco();
        double double13 = produto3.getPreco();
        java.lang.String str14 = produto3.getNome();
        produto3.setPreco((double) (-2));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test9737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9737");
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
        boolean boolean67 = estoque0.produtoExiste("");
        boolean boolean69 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto73 = new br.ufrn.imd.Produto("hi!", "", (double) 1L);
        double double74 = produto73.getPreco();
        estoque0.inserirProduto(produto73, 50);
        estoque0.removerProduto("", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
    }

    @Test
    public void test9738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9738");
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
        produto79.setCodigo("hi!");
        java.lang.String str87 = produto79.getNome();
        java.lang.String str88 = produto79.getNome();
        java.lang.String str89 = produto79.getNome();
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
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test9739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9739");
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
    }

    @Test
    public void test9740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9740");
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
        br.ufrn.imd.Estoque estoque26 = new br.ufrn.imd.Estoque();
        boolean boolean28 = estoque26.produtoExiste("");
        br.ufrn.imd.Produto produto32 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto32.setNome("hi!");
        produto32.setPreco((double) 10);
        estoque26.inserirProduto(produto32, (int) (byte) -1);
        estoque26.removerProduto("hi!", 0);
        int int43 = estoque26.consultarQuantidade("");
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque26.inserirProduto(produto47, (int) (byte) 100);
        boolean boolean51 = estoque26.produtoExiste("");
        boolean boolean53 = estoque26.produtoExiste("hi!");
        boolean boolean55 = estoque26.produtoExiste("hi!");
        estoque26.removerProduto("hi!", (int) 'a');
        estoque26.removerProduto("hi!", (-2));
        estoque26.removerProduto("hi!", (int) (byte) 10);
        br.ufrn.imd.Produto produto68 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double69 = produto68.getPreco();
        java.lang.String str70 = produto68.getCodigo();
        java.lang.String str71 = produto68.getNome();
        produto68.setCodigo("");
        double double74 = produto68.getPreco();
        java.lang.String str75 = produto68.getCodigo();
        produto68.setNome("hi!");
        java.lang.String str78 = produto68.getCodigo();
        java.lang.String str79 = produto68.getNome();
        estoque26.inserirProduto(produto68, (int) ' ');
        java.lang.String str82 = produto68.getCodigo();
        estoque0.inserirProduto(produto68, (-100));
        produto68.setPreco((double) (-108));
        double double87 = produto68.getPreco();
        java.lang.String str88 = produto68.getNome();
        double double89 = produto68.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 100.0d + "'", double69 == 100.0d);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 100.0d + "'", double74 == 100.0d);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-108.0d) + "'", double87 == (-108.0d));
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-108.0d) + "'", double89 == (-108.0d));
    }

    @Test
    public void test9741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9741");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) '4');
        produto3.setCodigo("");
        double double6 = produto3.getPreco();
        produto3.setNome("hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test9742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9742");
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
        produto19.setPreco((double) 10L);
        java.lang.String str27 = produto19.getNome();
        produto19.setPreco((double) (-78));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test9743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9743");
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
        java.lang.String str30 = produto16.getCodigo();
        produto16.setNome("hi!");
        java.lang.String str33 = produto16.getNome();
        produto16.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test9744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9744");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 9);
        double double4 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
    }

    @Test
    public void test9745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9745");
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
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-1L));
        produto40.setCodigo("");
        produto40.setNome("hi!");
        produto40.setPreco((double) 'a');
        produto40.setNome("");
        estoque0.inserirProduto(produto40, (-102));
        estoque0.removerProduto("", (-111));
        boolean boolean55 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test9746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9746");
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
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double47 = produto46.getPreco();
        java.lang.String str48 = produto46.getNome();
        produto46.setNome("hi!");
        java.lang.String str51 = produto46.getNome();
        estoque0.inserirProduto(produto46, 97);
        br.ufrn.imd.Produto produto57 = new br.ufrn.imd.Produto("hi!", "", (double) 1L);
        estoque0.inserirProduto(produto57, (-13));
        estoque0.removerProduto("", (int) (short) 1);
        estoque0.removerProduto("hi!", (-103));
        estoque0.removerProduto("", (-78));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test9747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9747");
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
        produto25.setPreco((double) 116);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-4.0d) + "'", double38 == (-4.0d));
    }

    @Test
    public void test9748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9748");
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
        produto18.setNome("");
        double double34 = produto18.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 34.0d + "'", double34 == 34.0d);
    }

    @Test
    public void test9749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9749");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (-33));
        produto3.setCodigo("hi!");
        double double6 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-33.0d) + "'", double6 == (-33.0d));
    }

    @Test
    public void test9750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9750");
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
        double double86 = produto82.getPreco();
        produto82.setCodigo("");
        java.lang.String str89 = produto82.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.0d + "'", double83 == 10.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 10.0d + "'", double86 == 10.0d);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
    }

    @Test
    public void test9751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9751");
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
        java.lang.String str82 = produto79.getNome();
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
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
    }

    @Test
    public void test9752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9752");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 10.0f);
        produto3.setPreco((-1.0d));
        java.lang.String str6 = produto3.getCodigo();
        java.lang.String str7 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test9753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9753");
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
        int int30 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 105);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test9754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9754");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        estoque0.removerProduto("hi!", (int) '#');
        estoque0.removerProduto("hi!", 36);
        boolean boolean25 = estoque0.produtoExiste("");
        boolean boolean27 = estoque0.produtoExiste("hi!");
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
        br.ufrn.imd.Produto produto73 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        double double74 = produto73.getPreco();
        estoque28.inserirProduto(produto73, (int) (short) 10);
        produto73.setCodigo("hi!");
        double double79 = produto73.getPreco();
        estoque0.inserirProduto(produto73, (-6));
        produto73.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 10.0d + "'", double79 == 10.0d);
    }

    @Test
    public void test9755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9755");
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
        estoque0.removerProduto("", 98);
        boolean boolean67 = estoque0.produtoExiste("");
        int int69 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-102) + "'", int69 == (-102));
    }

    @Test
    public void test9756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9756");
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
        int int29 = estoque0.consultarQuantidade("");
        java.lang.Class<?> wildcardClass30 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test9757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9757");
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
        br.ufrn.imd.Estoque estoque31 = new br.ufrn.imd.Estoque();
        boolean boolean33 = estoque31.produtoExiste("");
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto37.setNome("hi!");
        produto37.setPreco((double) 10);
        estoque31.inserirProduto(produto37, (int) (byte) -1);
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto47.setNome("hi!");
        produto47.setNome("");
        estoque31.inserirProduto(produto47, 0);
        produto47.setNome("");
        java.lang.String str56 = produto47.getNome();
        double double57 = produto47.getPreco();
        produto47.setCodigo("hi!");
        produto47.setNome("hi!");
        java.lang.String str62 = produto47.getCodigo();
        produto47.setPreco(0.0d);
        estoque0.inserirProduto(produto47, (-13));
        int int68 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }
}


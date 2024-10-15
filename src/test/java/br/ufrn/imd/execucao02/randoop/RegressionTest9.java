package br.ufrn.imd.execucao02.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto3.setNome("");
        produto3.setNome("hi!");
        java.lang.String str8 = produto3.getNome();
        produto3.setPreco((double) (-33));
        java.lang.String str11 = produto3.getNome();
        produto3.setPreco(0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto3.setPreco((double) (byte) 100);
        java.lang.String str6 = produto3.getNome();
        java.lang.String str7 = produto3.getNome();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
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
        br.ufrn.imd.Estoque estoque31 = new br.ufrn.imd.Estoque();
        boolean boolean33 = estoque31.produtoExiste("");
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto37.setNome("hi!");
        produto37.setPreco((double) 10);
        estoque31.inserirProduto(produto37, (int) (byte) -1);
        estoque31.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto50.setNome("hi!");
        produto50.setPreco((double) 10);
        java.lang.String str55 = produto50.getNome();
        double double56 = produto50.getPreco();
        java.lang.String str57 = produto50.getCodigo();
        produto50.setCodigo("hi!");
        java.lang.String str60 = produto50.getCodigo();
        produto50.setNome("");
        estoque31.inserirProduto(produto50, (int) (short) 10);
        produto50.setNome("hi!");
        java.lang.String str67 = produto50.getNome();
        produto50.setNome("hi!");
        estoque0.inserirProduto(produto50, (-35));
        estoque0.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto78 = new br.ufrn.imd.Produto("", "hi!", (double) (short) 100);
        estoque0.inserirProduto(produto78, (-100));
        double double81 = produto78.getPreco();
        produto78.setNome("");
        double double84 = produto78.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 100.0d + "'", double81 == 100.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 100.0d + "'", double84 == 100.0d);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
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
        boolean boolean58 = estoque0.produtoExiste("");
        int int60 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto64 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto64.setNome("hi!");
        produto64.setNome("");
        produto64.setPreco(1.0d);
        java.lang.String str71 = produto64.getCodigo();
        double double72 = produto64.getPreco();
        produto64.setPreco((double) (byte) 1);
        produto64.setPreco((double) 96);
        estoque0.inserirProduto(produto64, (-33));
        boolean boolean80 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 34 + "'", int60 == 34);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.String str8 = produto3.getNome();
        produto3.setPreco(52.0d);
        produto3.setCodigo("hi!");
        produto3.setCodigo("");
        java.lang.Class<?> wildcardClass15 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
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
        double double47 = produto31.getPreco();
        java.lang.String str48 = produto31.getCodigo();
        double double49 = produto31.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setPreco((double) (byte) 0);
        java.lang.String str9 = produto3.getNome();
        produto3.setPreco((double) 10.0f);
        produto3.setPreco((double) (byte) 1);
        java.lang.String str14 = produto3.getCodigo();
        produto3.setPreco((double) (-99));
        double double17 = produto3.getPreco();
        produto3.setPreco(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-99.0d) + "'", double17 == (-99.0d));
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
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
        double double20 = produto10.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", 0.0d);
        java.lang.String str4 = produto3.getNome();
        java.lang.String str5 = produto3.getNome();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
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
        int int44 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", (-3));
        br.ufrn.imd.Produto produto51 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto51.setNome("hi!");
        produto51.setPreco((double) 10);
        java.lang.String str56 = produto51.getNome();
        double double57 = produto51.getPreco();
        java.lang.String str58 = produto51.getCodigo();
        java.lang.String str59 = produto51.getNome();
        produto51.setCodigo("");
        estoque0.inserirProduto(produto51, (-99));
        boolean boolean65 = estoque0.produtoExiste("hi!");
        int int67 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 16 + "'", int42 == 16);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 16 + "'", int44 == 16);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-99) + "'", int67 == (-99));
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setPreco((double) 10L);
        produto3.setPreco(35.0d);
        java.lang.String str16 = produto3.getNome();
        java.lang.String str17 = produto3.getCodigo();
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
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
        boolean boolean64 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", 34);
        estoque0.removerProduto("hi!", 196);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
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
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto45.setNome("hi!");
        produto45.setPreco((double) 10);
        produto45.setNome("hi!");
        produto45.setPreco((double) 'a');
        produto45.setNome("");
        produto45.setNome("");
        double double58 = produto45.getPreco();
        produto45.setNome("hi!");
        estoque0.inserirProduto(produto45, (int) ' ');
        br.ufrn.imd.Estoque estoque63 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto67 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto67.setCodigo("hi!");
        estoque63.inserirProduto(produto67, (int) (byte) 0);
        br.ufrn.imd.Produto produto75 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto75.setNome("hi!");
        produto75.setNome("");
        produto75.setPreco(1.0d);
        estoque63.inserirProduto(produto75, 100);
        produto75.setPreco((double) 0);
        produto75.setNome("");
        produto75.setNome("");
        estoque0.inserirProduto(produto75, 34);
        java.lang.Class<?> wildcardClass92 = produto75.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 97.0d + "'", double58 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
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
        int int45 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto49.setPreco((double) '#');
        produto49.setPreco((double) 10);
        produto49.setPreco((double) (-1L));
        java.lang.String str56 = produto49.getCodigo();
        estoque0.inserirProduto(produto49, 9);
        boolean boolean60 = estoque0.produtoExiste("");
        int int62 = estoque0.consultarQuantidade("");
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-5) + "'", int45 == (-5));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
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
        produto75.setCodigo("");
        produto75.setPreco((double) 84);
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
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
        int int33 = estoque0.consultarQuantidade("");
        int int35 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-65) + "'", int35 == (-65));
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
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
        br.ufrn.imd.Produto produto48 = new br.ufrn.imd.Produto("", "", (double) 70);
        estoque0.inserirProduto(produto48, 79);
        produto48.setNome("hi!");
        java.lang.String str53 = produto48.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
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
        produto3.setPreco((double) 100);
        produto3.setPreco((double) (short) 0);
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("hi!");
        int int18 = estoque0.consultarQuantidade("hi!");
        boolean boolean20 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque21 = new br.ufrn.imd.Estoque();
        boolean boolean23 = estoque21.produtoExiste("");
        br.ufrn.imd.Produto produto27 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto27.setNome("hi!");
        produto27.setPreco((double) 10);
        estoque21.inserirProduto(produto27, (int) (byte) -1);
        estoque21.removerProduto("hi!", 0);
        int int38 = estoque21.consultarQuantidade("");
        br.ufrn.imd.Produto produto42 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double43 = produto42.getPreco();
        produto42.setNome("hi!");
        java.lang.String str46 = produto42.getCodigo();
        produto42.setCodigo("hi!");
        double double49 = produto42.getPreco();
        estoque21.inserirProduto(produto42, (int) 'a');
        java.lang.String str52 = produto42.getCodigo();
        produto42.setNome("hi!");
        produto42.setNome("");
        produto42.setCodigo("");
        estoque0.inserirProduto(produto42, 104);
        produto42.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
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
        int int30 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto34.setNome("hi!");
        produto34.setPreco((double) 10);
        produto34.setNome("hi!");
        produto34.setPreco((double) 'a');
        produto34.setNome("");
        produto34.setNome("");
        double double47 = produto34.getPreco();
        double double48 = produto34.getPreco();
        produto34.setNome("hi!");
        double double51 = produto34.getPreco();
        estoque0.inserirProduto(produto34, (int) 'a');
        java.lang.String str54 = produto34.getNome();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 97.0d + "'", double47 == 97.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 97.0d + "'", double48 == 97.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 97.0d + "'", double51 == 97.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (short) 10);
        java.lang.String str4 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.String str8 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.String str11 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
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
        int int37 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
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
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto54.setNome("hi!");
        produto54.setPreco((double) 10);
        java.lang.String str59 = produto54.getNome();
        double double60 = produto54.getPreco();
        java.lang.String str61 = produto54.getCodigo();
        produto54.setCodigo("hi!");
        java.lang.String str64 = produto54.getCodigo();
        produto54.setNome("");
        produto54.setCodigo("hi!");
        produto54.setCodigo("hi!");
        estoque0.inserirProduto(produto54, 0);
        int int74 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("", (-56));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 18 + "'", int46 == 18);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
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
        produto18.setCodigo("");
        java.lang.String str41 = produto18.getCodigo();
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-2.0d) + "'", double37 == (-2.0d));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
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
        double double55 = produto45.getPreco();
        java.lang.String str56 = produto45.getNome();
        double double57 = produto45.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 196);
        double double4 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 196.0d + "'", double4 == 196.0d);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
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
        int int44 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", (-88));
        int int49 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque50 = new br.ufrn.imd.Estoque();
        boolean boolean52 = estoque50.produtoExiste("");
        br.ufrn.imd.Produto produto56 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto56.setNome("hi!");
        produto56.setPreco((double) 10);
        estoque50.inserirProduto(produto56, (int) (byte) -1);
        estoque50.removerProduto("hi!", 0);
        int int67 = estoque50.consultarQuantidade("");
        br.ufrn.imd.Produto produto71 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double72 = produto71.getPreco();
        produto71.setNome("hi!");
        java.lang.String str75 = produto71.getCodigo();
        produto71.setCodigo("hi!");
        double double78 = produto71.getPreco();
        estoque50.inserirProduto(produto71, (int) 'a');
        java.lang.String str81 = produto71.getCodigo();
        java.lang.String str82 = produto71.getCodigo();
        java.lang.String str83 = produto71.getNome();
        produto71.setNome("");
        java.lang.String str86 = produto71.getNome();
        java.lang.String str87 = produto71.getCodigo();
        produto71.setNome("");
        double double90 = produto71.getPreco();
        estoque0.inserirProduto(produto71, 84);
        double double93 = produto71.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-2) + "'", int42 == (-2));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-2) + "'", int44 == (-2));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-2) + "'", int49 == (-2));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 100.0d + "'", double72 == 100.0d);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 100.0d + "'", double78 == 100.0d);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 100.0d + "'", double90 == 100.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 100.0d + "'", double93 == 100.0d);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto3.setNome("");
        java.lang.String str6 = produto3.getCodigo();
        double double7 = produto3.getPreco();
        double double8 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setCodigo("hi!");
        java.lang.String str13 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
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
        produto55.setPreco(0.0d);
        java.lang.Class<?> wildcardClass62 = produto55.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 'a');
        produto3.setNome("hi!");
        produto3.setCodigo("");
        double double8 = produto3.getPreco();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 94);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        int int16 = estoque0.consultarQuantidade("");
        boolean boolean18 = estoque0.produtoExiste("hi!");
        int int20 = estoque0.consultarQuantidade("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
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
        estoque0.removerProduto("hi!", (-100));
        estoque0.removerProduto("", 100);
        int int32 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto33 = null;
        // The following exception was thrown during execution in test generation
        try {
            estoque0.inserirProduto(produto33, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-100) + "'", int32 == (-100));
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (byte) 1);
        java.lang.String str4 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (short) 10);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("");
        produto3.setPreco((double) 33);
        java.lang.String str9 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto3.setNome("");
        java.lang.String str6 = produto3.getCodigo();
        java.lang.String str7 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        produto3.setNome("");
        produto3.setCodigo("hi!");
        double double14 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
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
        produto3.setPreco((-33.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 'a');
        produto3.setNome("");
        produto3.setNome("");
        produto3.setNome("");
        produto3.setNome("hi!");
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 0.0f);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getNome();
        double double6 = produto3.getPreco();
        java.lang.Class<?> wildcardClass7 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getCodigo();
        produto3.setPreco((double) (short) -1);
        double double9 = produto3.getPreco();
        produto3.setCodigo("hi!");
        produto3.setCodigo("");
        java.lang.String str14 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
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
        estoque0.removerProduto("", (-67));
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
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
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
        int int65 = estoque0.consultarQuantidade("");
        java.lang.Class<?> wildcardClass66 = estoque0.getClass();
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        java.lang.String str4 = produto3.getNome();
        java.lang.String str5 = produto3.getNome();
        double double6 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
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
        int int54 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 84);
        estoque0.inserirProduto(produto58, 8);
        java.lang.String str61 = produto58.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
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
        java.lang.String str26 = produto12.getNome();
        double double27 = produto12.getPreco();
        java.lang.Class<?> wildcardClass28 = produto12.getClass();
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto3.setPreco((double) (byte) 100);
        produto3.setNome("hi!");
        produto3.setCodigo("");
        double double10 = produto3.getPreco();
        produto3.setPreco(54.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
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
        double double32 = produto16.getPreco();
        double double33 = produto16.getPreco();
        java.lang.String str34 = produto16.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
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
        int int68 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto72 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto72.setNome("hi!");
        double double75 = produto72.getPreco();
        double double76 = produto72.getPreco();
        java.lang.String str77 = produto72.getNome();
        estoque0.inserirProduto(produto72, 18);
        java.lang.Class<?> wildcardClass80 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 36 + "'", int68 == 36);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 10.0d + "'", double75 == 10.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 10.0d + "'", double76 == 10.0d);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
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
        boolean boolean33 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (byte) 1);
        java.lang.String str4 = produto3.getCodigo();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.Class<?> wildcardClass6 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 1);
        produto3.setNome("");
        produto3.setNome("");
        produto3.setCodigo("hi!");
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
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
        produto18.setNome("hi!");
        produto18.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 16);
        java.lang.String str4 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 18);
        double double4 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 18.0d + "'", double4 == 18.0d);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
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
        produto34.setCodigo("");
        java.lang.String str47 = produto34.getCodigo();
        java.lang.Class<?> wildcardClass48 = produto34.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 0);
        double double4 = produto3.getPreco();
        double double5 = produto3.getPreco();
        java.lang.String str6 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-110));
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-36));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
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
        java.lang.String str31 = produto16.getCodigo();
        java.lang.Class<?> wildcardClass32 = produto16.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
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
        java.lang.String str99 = produto82.getNome();
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
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "" + "'", str99, "");
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        int int13 = estoque0.consultarQuantidade("");
        int int15 = estoque0.consultarQuantidade("");
        boolean boolean17 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque18 = new br.ufrn.imd.Estoque();
        boolean boolean20 = estoque18.produtoExiste("");
        br.ufrn.imd.Produto produto24 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto24.setNome("hi!");
        produto24.setPreco((double) 10);
        estoque18.inserirProduto(produto24, (int) (byte) -1);
        int int32 = estoque18.consultarQuantidade("");
        estoque18.removerProduto("hi!", (int) (byte) 0);
        estoque18.removerProduto("hi!", (int) (short) 0);
        int int40 = estoque18.consultarQuantidade("");
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
        produto60.setNome("");
        produto60.setNome("hi!");
        estoque18.inserirProduto(produto60, (-108));
        produto60.setPreco(0.0d);
        estoque0.inserirProduto(produto60, 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
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
        boolean boolean61 = estoque0.produtoExiste("");
        estoque0.removerProduto("", 1);
        boolean boolean66 = estoque0.produtoExiste("hi!");
        int int68 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 0.0f);
        produto3.setPreco(97.0d);
        java.lang.String str6 = produto3.getNome();
        produto3.setPreco(0.0d);
        produto3.setCodigo("");
        produto3.setCodigo("hi!");
        java.lang.Class<?> wildcardClass13 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
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
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (-2));
        br.ufrn.imd.Produto produto84 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str85 = produto84.getCodigo();
        produto84.setCodigo("hi!");
        produto84.setPreco((double) 36);
        java.lang.String str90 = produto84.getNome();
        java.lang.String str91 = produto84.getNome();
        estoque0.inserirProduto(produto84, (-5));
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
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
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
        int int35 = estoque0.consultarQuantidade("hi!");
        int int37 = estoque0.consultarQuantidade("hi!");
        boolean boolean39 = estoque0.produtoExiste("");
        boolean boolean41 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (-67));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", 54.0d);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 86);
        double double4 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 86.0d + "'", double4 == 86.0d);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        int int13 = estoque0.consultarQuantidade("");
        boolean boolean15 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) (short) 0);
        int int20 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (-90));
        int int25 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-10) + "'", int25 == (-10));
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        produto3.setNome("");
        produto3.setPreco((double) (byte) 100);
        double double15 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str18 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double16 = produto15.getPreco();
        java.lang.String str17 = produto15.getCodigo();
        java.lang.String str18 = produto15.getNome();
        java.lang.String str19 = produto15.getCodigo();
        produto15.setCodigo("");
        double double22 = produto15.getPreco();
        estoque0.inserirProduto(produto15, (int) (short) 10);
        produto15.setNome("hi!");
        java.lang.Class<?> wildcardClass27 = produto15.getClass();
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
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
        boolean boolean75 = estoque0.produtoExiste("");
        int int77 = estoque0.consultarQuantidade("");
        int int79 = estoque0.consultarQuantidade("");
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
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
        produto47.setPreco((-53.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", 16.0d);
        java.lang.String str4 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
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
        int int47 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque48 = new br.ufrn.imd.Estoque();
        boolean boolean50 = estoque48.produtoExiste("");
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto54.setNome("hi!");
        produto54.setPreco((double) 10);
        estoque48.inserirProduto(produto54, (int) (byte) -1);
        boolean boolean62 = estoque48.produtoExiste("");
        br.ufrn.imd.Produto produto66 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto66.setNome("hi!");
        produto66.setPreco((double) 10);
        produto66.setNome("hi!");
        estoque48.inserirProduto(produto66, (-1));
        boolean boolean76 = estoque48.produtoExiste("");
        estoque48.removerProduto("hi!", (-11));
        br.ufrn.imd.Produto produto83 = new br.ufrn.imd.Produto("hi!", "", 0.0d);
        estoque48.inserirProduto(produto83, 100);
        estoque0.inserirProduto(produto83, (-5));
        double double88 = produto83.getPreco();
        java.lang.String str89 = produto83.getCodigo();
        java.lang.String str90 = produto83.getCodigo();
        java.lang.Class<?> wildcardClass91 = produto83.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
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
        int int22 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque23 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto27 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto27.setCodigo("hi!");
        estoque23.inserirProduto(produto27, (int) (byte) 0);
        estoque23.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto38 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto38.setNome("hi!");
        produto38.setPreco((double) 100L);
        estoque23.inserirProduto(produto38, (int) (short) 10);
        java.lang.String str45 = produto38.getCodigo();
        estoque0.inserirProduto(produto38, (int) (byte) -1);
        int int49 = estoque0.consultarQuantidade("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 196.0d);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (byte) 0);
        boolean boolean19 = estoque0.produtoExiste("hi!");
        int int21 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", (int) (byte) 0);
        boolean boolean26 = estoque0.produtoExiste("");
        int int28 = estoque0.consultarQuantidade("hi!");
        boolean boolean30 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
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
        br.ufrn.imd.Estoque estoque57 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto61 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto61.setCodigo("hi!");
        estoque57.inserirProduto(produto61, (int) (byte) 0);
        estoque57.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto72 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto72.setNome("hi!");
        produto72.setPreco((double) 100L);
        estoque57.inserirProduto(produto72, (int) (short) 10);
        produto72.setPreco(52.0d);
        double double81 = produto72.getPreco();
        estoque0.inserirProduto(produto72, (-13));
        int int85 = estoque0.consultarQuantidade("hi!");
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
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 52.0d + "'", double81 == 52.0d);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-5) + "'", int85 == (-5));
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (-5));
        produto3.setPreco((double) (-2));
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
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
        produto19.setNome("");
        produto19.setCodigo("hi!");
        produto19.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
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
        br.ufrn.imd.Produto produto83 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str84 = produto83.getCodigo();
        produto83.setNome("");
        produto83.setPreco((double) 10);
        java.lang.String str89 = produto83.getCodigo();
        double double90 = produto83.getPreco();
        estoque0.inserirProduto(produto83, (-1));
        boolean boolean94 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 10.0d + "'", double90 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 1);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        double double9 = produto4.getPreco();
        produto4.setCodigo("hi!");
        produto4.setPreco((double) 36);
        produto4.setPreco((double) 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
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
        produto23.setNome("hi!");
        java.lang.Class<?> wildcardClass50 = produto23.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
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
        boolean boolean25 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque26 = new br.ufrn.imd.Estoque();
        boolean boolean28 = estoque26.produtoExiste("");
        br.ufrn.imd.Produto produto32 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto32.setNome("hi!");
        produto32.setPreco((double) 10);
        estoque26.inserirProduto(produto32, (int) (byte) -1);
        boolean boolean40 = estoque26.produtoExiste("");
        int int42 = estoque26.consultarQuantidade("");
        boolean boolean44 = estoque26.produtoExiste("hi!");
        boolean boolean46 = estoque26.produtoExiste("hi!");
        int int48 = estoque26.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque49 = new br.ufrn.imd.Estoque();
        boolean boolean51 = estoque49.produtoExiste("");
        br.ufrn.imd.Produto produto55 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto55.setNome("hi!");
        produto55.setPreco((double) 10);
        estoque49.inserirProduto(produto55, (int) (byte) -1);
        estoque49.removerProduto("hi!", 0);
        estoque49.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto71 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str72 = produto71.getCodigo();
        estoque49.inserirProduto(produto71, (int) 'a');
        boolean boolean76 = estoque49.produtoExiste("hi!");
        estoque49.removerProduto("", 10);
        estoque49.removerProduto("", (-33));
        boolean boolean84 = estoque49.produtoExiste("");
        br.ufrn.imd.Produto produto88 = new br.ufrn.imd.Produto("", "", (double) (short) -1);
        estoque49.inserirProduto(produto88, 99);
        estoque26.inserirProduto(produto88, (int) '4');
        produto88.setNome("");
        estoque0.inserirProduto(produto88, 86);
        estoque0.removerProduto("hi!", 95);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 10);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setPreco((double) (short) -1);
        produto3.setPreco((double) (-90));
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        produto3.setNome("");
        java.lang.String str12 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
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
        int int65 = estoque0.consultarQuantidade("");
        boolean boolean67 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
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
        produto44.setNome("");
        java.lang.String str67 = produto44.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
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
        br.ufrn.imd.Estoque estoque22 = new br.ufrn.imd.Estoque();
        boolean boolean24 = estoque22.produtoExiste("");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        estoque22.inserirProduto(produto28, (int) (byte) -1);
        boolean boolean36 = estoque22.produtoExiste("hi!");
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto40.setPreco((double) '#');
        produto40.setPreco((double) 10);
        java.lang.String str45 = produto40.getNome();
        produto40.setPreco(0.0d);
        estoque22.inserirProduto(produto40, (-2));
        br.ufrn.imd.Produto produto53 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto53.setPreco((double) '#');
        estoque22.inserirProduto(produto53, 100);
        produto53.setPreco((double) (-2));
        double double60 = produto53.getPreco();
        java.lang.String str61 = produto53.getNome();
        produto53.setPreco(97.0d);
        produto53.setCodigo("");
        estoque0.inserirProduto(produto53, (int) (short) -1);
        estoque0.removerProduto("", 84);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-2.0d) + "'", double60 == (-2.0d));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
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
        boolean boolean37 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        java.lang.String str4 = produto3.getCodigo();
        double double5 = produto3.getPreco();
        java.lang.String str6 = produto3.getNome();
        produto3.setNome("hi!");
        produto3.setCodigo("hi!");
        double double11 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        java.lang.String str12 = produto3.getCodigo();
        produto3.setNome("hi!");
        produto3.setNome("hi!");
        java.lang.String str17 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        produto3.setCodigo("");
        produto3.setPreco((double) (-10));
        java.lang.Class<?> wildcardClass24 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
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
        int int48 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
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
        boolean boolean42 = estoque0.produtoExiste("hi!");
        java.lang.Class<?> wildcardClass43 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
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
        boolean boolean22 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Estoque estoque23 = new br.ufrn.imd.Estoque();
        boolean boolean25 = estoque23.produtoExiste("");
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto29.setNome("hi!");
        produto29.setPreco((double) 10);
        estoque23.inserirProduto(produto29, (int) (byte) -1);
        int int37 = estoque23.consultarQuantidade("");
        boolean boolean39 = estoque23.produtoExiste("");
        boolean boolean41 = estoque23.produtoExiste("");
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double46 = produto45.getPreco();
        java.lang.String str47 = produto45.getCodigo();
        java.lang.String str48 = produto45.getNome();
        produto45.setNome("hi!");
        estoque23.inserirProduto(produto45, (int) (short) 0);
        java.lang.String str53 = produto45.getNome();
        produto45.setPreco((double) (-1L));
        produto45.setPreco((double) (byte) 100);
        estoque0.inserirProduto(produto45, 30);
        int int61 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 29 + "'", int61 == 29);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
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
        int int58 = estoque0.consultarQuantidade("hi!");
        boolean boolean60 = estoque0.produtoExiste("");
        boolean boolean62 = estoque0.produtoExiste("hi!");
        boolean boolean64 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-10) + "'", int58 == (-10));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
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
        double double30 = produto16.getPreco();
        produto16.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 18.0d + "'", double30 == 18.0d);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
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
        produto23.setCodigo("hi!");
        produto23.setPreco((double) (-53));
        java.lang.String str41 = produto23.getNome();
        java.lang.String str42 = produto23.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
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
        boolean boolean33 = estoque0.produtoExiste("");
        boolean boolean35 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double40 = produto39.getPreco();
        java.lang.String str41 = produto39.getNome();
        produto39.setNome("hi!");
        produto39.setNome("hi!");
        estoque0.inserirProduto(produto39, 19);
        boolean boolean49 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
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
        java.lang.String str42 = produto31.getNome();
        java.lang.String str43 = produto31.getNome();
        produto31.setCodigo("");
        java.lang.Class<?> wildcardClass46 = produto31.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-2.0d) + "'", double38 == (-2.0d));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
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
        int int35 = estoque0.consultarQuantidade("");
        int int37 = estoque0.consultarQuantidade("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
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
        br.ufrn.imd.Estoque estoque46 = new br.ufrn.imd.Estoque();
        boolean boolean48 = estoque46.produtoExiste("");
        br.ufrn.imd.Produto produto52 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto52.setNome("hi!");
        produto52.setPreco((double) 10);
        estoque46.inserirProduto(produto52, (int) (byte) -1);
        estoque46.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque46.inserirProduto(produto65, (int) (short) 100);
        java.lang.String str68 = produto65.getCodigo();
        produto65.setPreco((double) '#');
        double double71 = produto65.getPreco();
        estoque0.inserirProduto(produto65, 0);
        int int75 = estoque0.consultarQuantidade("hi!");
        int int77 = estoque0.consultarQuantidade("");
        boolean boolean79 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 35.0d + "'", double71 == 35.0d);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 100.0d);
        java.lang.String str4 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
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
        produto23.setNome("");
        java.lang.String str36 = produto23.getNome();
        double double37 = produto23.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.String str8 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.Class<?> wildcardClass11 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
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
        produto28.setNome("hi!");
        produto28.setNome("");
        produto28.setPreco(0.0d);
        java.lang.String str46 = produto28.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
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
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto58.setNome("hi!");
        produto58.setPreco((double) 10);
        java.lang.String str63 = produto58.getNome();
        double double64 = produto58.getPreco();
        produto58.setNome("");
        estoque0.inserirProduto(produto58, 0);
        java.lang.Class<?> wildcardClass69 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
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
        br.ufrn.imd.Produto produto76 = null;
        // The following exception was thrown during execution in test generation
        try {
            estoque0.inserirProduto(produto76, (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
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
        estoque0.removerProduto("hi!", (-1));
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-135));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
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
        br.ufrn.imd.Estoque estoque36 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto40.setCodigo("hi!");
        estoque36.inserirProduto(produto40, (int) (byte) 0);
        estoque36.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto51 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto51.setNome("hi!");
        produto51.setPreco((double) 100L);
        estoque36.inserirProduto(produto51, (int) (short) 10);
        br.ufrn.imd.Produto produto61 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double62 = produto61.getPreco();
        produto61.setNome("hi!");
        java.lang.String str65 = produto61.getNome();
        produto61.setCodigo("hi!");
        estoque36.inserirProduto(produto61, (int) (short) 100);
        estoque0.inserirProduto(produto61, 1);
        int int73 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 30);
        int int78 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 100.0d + "'", double62 == 100.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 96 + "'", int73 == 96);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
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
        double double51 = produto45.getPreco();
        produto45.setCodigo("");
        produto45.setNome("hi!");
        produto45.setPreco((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-63));
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
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
        produto37.setCodigo("");
        java.lang.String str45 = produto37.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-98));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-98));
        produto3.setNome("");
        java.lang.String str6 = produto3.getNome();
        java.lang.String str7 = produto3.getCodigo();
        java.lang.Class<?> wildcardClass8 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setCodigo("");
        produto3.setPreco((double) (-1L));
        produto3.setPreco(0.0d);
        produto3.setNome("");
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        produto3.setCodigo("");
        produto3.setPreco((double) 'a');
        double double18 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
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
        double double77 = produto56.getPreco();
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
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
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
        boolean boolean31 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
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
        estoque0.removerProduto("hi!", (int) (byte) -1);
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto45.setCodigo("hi!");
        java.lang.String str48 = produto45.getNome();
        java.lang.String str49 = produto45.getCodigo();
        produto45.setNome("");
        double double52 = produto45.getPreco();
        java.lang.String str53 = produto45.getNome();
        estoque0.inserirProduto(produto45, (-4));
        int int57 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 96);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 100.0d + "'", double52 == 100.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 96 + "'", int57 == 96);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco((double) 'a');
        java.lang.String str10 = produto3.getCodigo();
        produto3.setPreco(0.0d);
        double double13 = produto3.getPreco();
        double double14 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
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
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "", (double) '#');
        produto45.setPreco(10.0d);
        produto45.setPreco((double) 10L);
        produto45.setCodigo("");
        double double52 = produto45.getPreco();
        estoque0.inserirProduto(produto45, (int) (short) -1);
        java.lang.String str55 = produto45.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
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
        produto18.setNome("hi!");
        java.lang.String str33 = produto18.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        produto3.setPreco(10.0d);
        produto3.setCodigo("hi!");
        produto3.setCodigo("");
        produto3.setPreco(0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 109.0d);
        produto3.setNome("");
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto3.setNome("");
        double double6 = produto3.getPreco();
        produto3.setPreco((-200.0d));
        produto3.setPreco((double) (-11));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        double double9 = produto3.getPreco();
        double double10 = produto3.getPreco();
        produto3.setCodigo("");
        produto3.setNome("hi!");
        java.lang.String str15 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
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
        int int55 = estoque36.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto59 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto59.setNome("hi!");
        produto59.setPreco((double) 10);
        java.lang.String str64 = produto59.getNome();
        double double65 = produto59.getPreco();
        java.lang.String str66 = produto59.getCodigo();
        produto59.setCodigo("hi!");
        java.lang.String str69 = produto59.getCodigo();
        estoque36.inserirProduto(produto59, 0);
        br.ufrn.imd.Produto produto75 = new br.ufrn.imd.Produto("", "", (double) 0L);
        java.lang.String str76 = produto75.getNome();
        estoque36.inserirProduto(produto75, (int) (short) 0);
        java.lang.String str79 = produto75.getCodigo();
        estoque0.inserirProduto(produto75, 18);
        double double82 = produto75.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-2) + "'", int55 == (-2));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
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
        produto40.setNome("");
        produto40.setNome("hi!");
        produto40.setPreco((double) 179);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
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
        produto45.setNome("");
        produto45.setPreco((double) 1.0f);
        java.lang.Class<?> wildcardClass57 = produto45.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getCodigo();
        java.lang.String str7 = produto3.getCodigo();
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
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
        br.ufrn.imd.Estoque estoque25 = new br.ufrn.imd.Estoque();
        boolean boolean27 = estoque25.produtoExiste("");
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto31.setNome("hi!");
        produto31.setPreco((double) 10);
        estoque25.inserirProduto(produto31, (int) (byte) -1);
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto41.setNome("hi!");
        produto41.setNome("");
        estoque25.inserirProduto(produto41, 0);
        int int49 = estoque25.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto53 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto53.setNome("hi!");
        produto53.setPreco((double) 10);
        java.lang.String str58 = produto53.getNome();
        double double59 = produto53.getPreco();
        java.lang.String str60 = produto53.getCodigo();
        estoque25.inserirProduto(produto53, (int) '#');
        br.ufrn.imd.Produto produto66 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque25.inserirProduto(produto66, (-1));
        br.ufrn.imd.Produto produto72 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto72.setNome("hi!");
        produto72.setPreco((double) 10);
        java.lang.String str77 = produto72.getCodigo();
        java.lang.String str78 = produto72.getCodigo();
        estoque25.inserirProduto(produto72, 0);
        br.ufrn.imd.Produto produto84 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto84.setCodigo("hi!");
        produto84.setCodigo("");
        produto84.setCodigo("hi!");
        estoque25.inserirProduto(produto84, (int) '#');
        produto84.setPreco((double) (short) 0);
        produto84.setPreco((double) (byte) 100);
        estoque0.inserirProduto(produto84, (-98));
        java.lang.Class<?> wildcardClass99 = produto84.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto3.setNome("");
        java.lang.String str6 = produto3.getCodigo();
        java.lang.String str7 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        java.lang.String str10 = produto3.getNome();
        produto3.setCodigo("");
        java.lang.String str13 = produto3.getNome();
        java.lang.String str14 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto3.setNome("");
        produto3.setNome("hi!");
        produto3.setNome("");
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        java.lang.String str12 = produto3.getCodigo();
        java.lang.String str13 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
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
        int int25 = estoque0.consultarQuantidade("hi!");
        boolean boolean27 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-33) + "'", int25 == (-33));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
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
        int int46 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque47 = new br.ufrn.imd.Estoque();
        boolean boolean49 = estoque47.produtoExiste("");
        br.ufrn.imd.Produto produto53 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto53.setNome("hi!");
        produto53.setPreco((double) 10);
        estoque47.inserirProduto(produto53, (int) (byte) -1);
        br.ufrn.imd.Produto produto63 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto63.setNome("hi!");
        produto63.setNome("");
        estoque47.inserirProduto(produto63, 0);
        java.lang.String str70 = produto63.getCodigo();
        double double71 = produto63.getPreco();
        double double72 = produto63.getPreco();
        java.lang.String str73 = produto63.getNome();
        java.lang.String str74 = produto63.getCodigo();
        produto63.setCodigo("");
        java.lang.String str77 = produto63.getNome();
        java.lang.String str78 = produto63.getNome();
        double double79 = produto63.getPreco();
        estoque0.inserirProduto(produto63, (-230));
        produto63.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 10.0d + "'", double79 == 10.0d);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getCodigo();
        produto3.setCodigo("");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
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
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto25.setNome("hi!");
        produto25.setPreco((double) 10);
        java.lang.String str30 = produto25.getNome();
        double double31 = produto25.getPreco();
        java.lang.String str32 = produto25.getCodigo();
        produto25.setCodigo("hi!");
        java.lang.String str35 = produto25.getCodigo();
        java.lang.String str36 = produto25.getCodigo();
        produto25.setCodigo("");
        java.lang.String str39 = produto25.getNome();
        estoque0.inserirProduto(produto25, (-91));
        boolean boolean43 = estoque0.produtoExiste("");
        int int45 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-2) + "'", int45 == (-2));
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
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
        produto22.setPreco((double) (-1L));
        produto22.setPreco((double) (byte) 100);
        java.lang.String str35 = produto22.getCodigo();
        double double36 = produto22.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setNome("");
        produto3.setNome("");
        produto3.setPreco(100.0d);
        produto3.setCodigo("");
        java.lang.Class<?> wildcardClass14 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        java.lang.String str8 = produto3.getCodigo();
        produto3.setNome("");
        java.lang.Class<?> wildcardClass11 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
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
        boolean boolean24 = estoque22.produtoExiste("");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        estoque22.inserirProduto(produto28, (int) (byte) -1);
        int int36 = estoque22.consultarQuantidade("");
        estoque22.removerProduto("hi!", (int) (byte) 0);
        estoque22.removerProduto("hi!", (int) (short) 0);
        int int44 = estoque22.consultarQuantidade("");
        boolean boolean46 = estoque22.produtoExiste("");
        int int48 = estoque22.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque49 = new br.ufrn.imd.Estoque();
        boolean boolean51 = estoque49.produtoExiste("");
        br.ufrn.imd.Produto produto55 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto55.setNome("hi!");
        produto55.setPreco((double) 10);
        estoque49.inserirProduto(produto55, (int) (byte) -1);
        estoque49.removerProduto("hi!", 0);
        estoque49.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto71 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str72 = produto71.getCodigo();
        estoque49.inserirProduto(produto71, (int) 'a');
        boolean boolean76 = estoque49.produtoExiste("hi!");
        br.ufrn.imd.Produto produto80 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto80.setCodigo("hi!");
        java.lang.String str83 = produto80.getNome();
        java.lang.String str84 = produto80.getCodigo();
        estoque49.inserirProduto(produto80, (int) (byte) 100);
        double double87 = produto80.getPreco();
        estoque22.inserirProduto(produto80, 34);
        estoque0.inserirProduto(produto80, (-76));
        boolean boolean93 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 100.0d + "'", double87 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
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
        int int33 = estoque19.consultarQuantidade("");
        estoque19.removerProduto("hi!", (int) (byte) 0);
        boolean boolean38 = estoque19.produtoExiste("hi!");
        br.ufrn.imd.Produto produto42 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto42.setNome("hi!");
        produto42.setPreco((double) 10);
        produto42.setNome("hi!");
        double double49 = produto42.getPreco();
        java.lang.String str50 = produto42.getCodigo();
        estoque19.inserirProduto(produto42, (int) ' ');
        produto42.setNome("");
        produto42.setCodigo("");
        estoque0.inserirProduto(produto42, (-99));
        estoque0.removerProduto("", 51);
        int int63 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-150) + "'", int63 == (-150));
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        produto3.setNome("");
        double double10 = produto3.getPreco();
        produto3.setCodigo("hi!");
        double double13 = produto3.getPreco();
        java.lang.String str14 = produto3.getNome();
        java.lang.String str15 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
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
        java.lang.String str38 = produto19.getNome();
        produto19.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
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
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto41.setCodigo("hi!");
        java.lang.String str44 = produto41.getNome();
        double double45 = produto41.getPreco();
        java.lang.String str46 = produto41.getNome();
        double double47 = produto41.getPreco();
        estoque0.inserirProduto(produto41, 0);
        boolean boolean51 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
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
        boolean boolean47 = estoque0.produtoExiste("hi!");
        boolean boolean49 = estoque0.produtoExiste("");
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (-80));
        java.lang.String str4 = produto3.getNome();
        double double5 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-80.0d) + "'", double5 == (-80.0d));
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
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
        int int22 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque23 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto27 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto27.setCodigo("hi!");
        estoque23.inserirProduto(produto27, (int) (byte) 0);
        estoque23.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto38 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto38.setNome("hi!");
        produto38.setPreco((double) 100L);
        estoque23.inserirProduto(produto38, (int) (short) 10);
        java.lang.String str45 = produto38.getCodigo();
        estoque0.inserirProduto(produto38, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (-33.0d));
        produto3.setPreco((double) (-68));
        java.lang.String str6 = produto3.getCodigo();
        double double7 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-68.0d) + "'", double7 == (-68.0d));
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 32);
        produto3.setPreco((double) 10L);
        double double6 = produto3.getPreco();
        java.lang.String str7 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
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
        br.ufrn.imd.Produto produto75 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto75.setPreco((double) '#');
        produto75.setPreco((double) 10);
        produto75.setNome("");
        java.lang.String str82 = produto75.getNome();
        double double83 = produto75.getPreco();
        java.lang.String str84 = produto75.getCodigo();
        estoque0.inserirProduto(produto75, (-5));
        produto75.setPreco((double) (-160));
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
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.0d + "'", double83 == 10.0d);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setCodigo("");
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        double double11 = produto3.getPreco();
        produto3.setCodigo("");
        java.lang.String str14 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
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
        java.lang.String str21 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 70);
        java.lang.String str4 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
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
        boolean boolean54 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
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
        boolean boolean69 = estoque0.produtoExiste("");
        boolean boolean71 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 68);
        boolean boolean24 = estoque0.produtoExiste("hi!");
        int int26 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-70) + "'", int26 == (-70));
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", 18.0d);
        double double4 = produto3.getPreco();
        produto3.setNome("");
        java.lang.String str7 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 18.0d + "'", double4 == 18.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
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
        produto16.setNome("");
        produto16.setPreco(0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
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
        double double62 = produto52.getPreco();
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("");
        int int18 = estoque0.consultarQuantidade("hi!");
        java.lang.Class<?> wildcardClass19 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
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
        java.lang.String str74 = produto68.getNome();
        double double75 = produto68.getPreco();
        produto68.setPreco((double) (short) -1);
        estoque0.inserirProduto(produto68, 34);
        java.lang.String str80 = produto68.getCodigo();
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
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 10.0d + "'", double75 == 10.0d);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str4 = produto3.getCodigo();
        java.lang.String str5 = produto3.getCodigo();
        double double6 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
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
        br.ufrn.imd.Produto produto61 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto61.setNome("hi!");
        produto61.setNome("");
        produto61.setPreco((double) 10L);
        double double68 = produto61.getPreco();
        produto61.setNome("");
        produto61.setPreco(0.0d);
        produto61.setPreco((double) 99);
        estoque0.inserirProduto(produto61, 0);
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
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
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
        java.lang.String str54 = produto41.getCodigo();
        java.lang.String str55 = produto41.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        produto3.setCodigo("");
        produto3.setPreco((double) (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
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
        br.ufrn.imd.Estoque estoque51 = new br.ufrn.imd.Estoque();
        boolean boolean53 = estoque51.produtoExiste("");
        br.ufrn.imd.Produto produto57 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto57.setNome("hi!");
        produto57.setPreco((double) 10);
        estoque51.inserirProduto(produto57, (int) (byte) -1);
        estoque51.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto70 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque51.inserirProduto(produto70, (int) (short) 100);
        estoque0.inserirProduto(produto70, 0);
        double double75 = produto70.getPreco();
        double double76 = produto70.getPreco();
        produto70.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 1.0d + "'", double75 == 1.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 'a');
        produto3.setNome("");
        produto3.setNome("");
        double double16 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str19 = produto3.getCodigo();
        double double20 = produto3.getPreco();
        java.lang.String str21 = produto3.getNome();
        java.lang.String str22 = produto3.getNome();
        produto3.setCodigo("");
        produto3.setPreco(54.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.String str8 = produto3.getNome();
        produto3.setPreco(52.0d);
        double double11 = produto3.getPreco();
        java.lang.String str12 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", 34.0d);
        produto3.setPreco((double) 28);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
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
        boolean boolean28 = estoque0.produtoExiste("hi!");
        boolean boolean30 = estoque0.produtoExiste("hi!");
        int int32 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 7);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
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
        br.ufrn.imd.Produto produto30 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto30.setPreco((double) '#');
        produto30.setPreco(1.0d);
        estoque0.inserirProduto(produto30, 1);
        boolean boolean38 = estoque0.produtoExiste("hi!");
        boolean boolean40 = estoque0.produtoExiste("");
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
        br.ufrn.imd.Produto produto82 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque41.inserirProduto(produto82, (-1));
        java.lang.String str85 = produto82.getCodigo();
        produto82.setNome("");
        java.lang.String str88 = produto82.getNome();
        produto82.setCodigo("");
        estoque0.inserirProduto(produto82, (-68));
        estoque0.removerProduto("hi!", 16);
        estoque0.removerProduto("hi!", (-111));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 10.0d + "'", double75 == 10.0d);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-102));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
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
        br.ufrn.imd.Estoque estoque44 = new br.ufrn.imd.Estoque();
        boolean boolean46 = estoque44.produtoExiste("");
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto50.setNome("hi!");
        produto50.setPreco((double) 10);
        estoque44.inserirProduto(produto50, (int) (byte) -1);
        int int58 = estoque44.consultarQuantidade("");
        boolean boolean60 = estoque44.produtoExiste("hi!");
        br.ufrn.imd.Produto produto64 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto64.setNome("hi!");
        produto64.setNome("");
        java.lang.String str69 = produto64.getNome();
        produto64.setNome("hi!");
        estoque44.inserirProduto(produto64, 9);
        estoque44.removerProduto("hi!", (int) (short) 10);
        br.ufrn.imd.Produto produto80 = new br.ufrn.imd.Produto("", "", (double) '#');
        produto80.setPreco(10.0d);
        produto80.setPreco((double) 10L);
        produto80.setCodigo("");
        estoque44.inserirProduto(produto80, (-108));
        produto80.setCodigo("");
        produto80.setPreco((-1.0d));
        estoque0.inserirProduto(produto80, (int) (short) -1);
        estoque0.removerProduto("hi!", (-102));
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (short) 0);
        int int22 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto26 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto26.setCodigo("hi!");
        java.lang.String str29 = produto26.getCodigo();
        estoque0.inserirProduto(produto26, 62);
        int int33 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 61 + "'", int33 == 61);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
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
        produto28.setNome("hi!");
        produto28.setNome("");
        java.lang.String str44 = produto28.getCodigo();
        produto28.setPreco(52.0d);
        java.lang.String str47 = produto28.getNome();
        produto28.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
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
        boolean boolean39 = estoque0.produtoExiste("");
        boolean boolean41 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-98) + "'", int31 == (-98));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
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
        produto25.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
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
            estoque0.removerProduto("", 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
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
        estoque0.removerProduto("", (-116));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 100.0f);
        produto3.setCodigo("");
        produto3.setNome("hi!");
        double double8 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (byte) 100);
        produto3.setCodigo("");
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (-65));
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
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
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        produto3.setNome("hi!");
        double double9 = produto3.getPreco();
        produto3.setCodigo("hi!");
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
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
        boolean boolean48 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
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
        boolean boolean26 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto30 = new br.ufrn.imd.Produto("", "hi!", (double) (byte) 1);
        produto30.setPreco((double) 0L);
        java.lang.String str33 = produto30.getNome();
        java.lang.String str34 = produto30.getNome();
        estoque0.inserirProduto(produto30, (-4));
        produto30.setPreco((double) 196);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
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
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "", (double) '#');
        produto36.setPreco(10.0d);
        produto36.setPreco((double) 10L);
        produto36.setCodigo("");
        estoque0.inserirProduto(produto36, (-108));
        boolean boolean46 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Estoque estoque47 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto51 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto51.setCodigo("hi!");
        estoque47.inserirProduto(produto51, (int) (byte) 0);
        estoque47.removerProduto("hi!", (int) (byte) 100);
        int int60 = estoque47.consultarQuantidade("");
        boolean boolean62 = estoque47.produtoExiste("");
        boolean boolean64 = estoque47.produtoExiste("hi!");
        estoque47.removerProduto("hi!", 10);
        br.ufrn.imd.Produto produto71 = new br.ufrn.imd.Produto("hi!", "", (double) (short) 10);
        java.lang.String str72 = produto71.getCodigo();
        produto71.setNome("");
        estoque47.inserirProduto(produto71, (-108));
        produto71.setPreco((double) 65);
        estoque0.inserirProduto(produto71, (-103));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
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
        boolean boolean32 = estoque0.produtoExiste("hi!");
        int int34 = estoque0.consultarQuantidade("");
        int int36 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 16 + "'", int36 == 16);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
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
        java.lang.Class<?> wildcardClass37 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 97.0d + "'", double28 == 97.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 97.0d + "'", double29 == 97.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
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
        java.lang.Class<?> wildcardClass98 = estoque0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
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
        produto3.setNome("");
        java.lang.String str22 = produto3.getCodigo();
        produto3.setNome("hi!");
        java.lang.Class<?> wildcardClass25 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (-63));
        produto3.setCodigo("hi!");
        java.lang.String str6 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
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
        boolean boolean31 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (-11));
        br.ufrn.imd.Produto produto38 = new br.ufrn.imd.Produto("hi!", "", (double) 54);
        produto38.setNome("hi!");
        estoque0.inserirProduto(produto38, (-78));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (-36.0d));
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("");
        int int21 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 10);
        estoque0.removerProduto("hi!", (-2));
        boolean boolean29 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto30 = null;
        // The following exception was thrown during execution in test generation
        try {
            estoque0.inserirProduto(produto30, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str4 = produto3.getNome();
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        double double9 = produto3.getPreco();
        produto3.setPreco((double) 1.0f);
        produto3.setPreco((double) 1);
        produto3.setPreco((double) (-116));
        java.lang.String str16 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
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
        int int28 = estoque0.consultarQuantidade("hi!");
        boolean boolean30 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("", "", 10.0d);
        estoque0.inserirProduto(produto34, (-78));
        int int38 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-78) + "'", int38 == (-78));
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setNome("hi!");
        produto3.setCodigo("hi!");
        produto3.setCodigo("hi!");
        produto3.setCodigo("hi!");
        java.lang.String str20 = produto3.getCodigo();
        double double21 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
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
        java.lang.String str37 = produto21.getNome();
        double double38 = produto21.getPreco();
        double double39 = produto21.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
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
        int int36 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
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
        int int47 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto51 = new br.ufrn.imd.Produto("", "hi!", (double) (short) 100);
        produto51.setCodigo("");
        produto51.setPreco(10.0d);
        produto51.setCodigo("hi!");
        estoque0.inserirProduto(produto51, (-2));
        int int61 = estoque0.consultarQuantidade("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
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
        boolean boolean31 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (-29));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
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
        estoque0.removerProduto("hi!", 10);
        boolean boolean38 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque39 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto43 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto43.setCodigo("hi!");
        estoque39.inserirProduto(produto43, (int) (byte) 0);
        estoque39.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto54.setNome("hi!");
        produto54.setPreco((double) 100L);
        estoque39.inserirProduto(produto54, (int) (short) 10);
        br.ufrn.imd.Produto produto64 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double65 = produto64.getPreco();
        produto64.setNome("hi!");
        java.lang.String str68 = produto64.getNome();
        produto64.setCodigo("hi!");
        estoque39.inserirProduto(produto64, (int) (short) 100);
        produto64.setNome("");
        estoque0.inserirProduto(produto64, (int) (byte) 1);
        br.ufrn.imd.Produto produto80 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double81 = produto80.getPreco();
        java.lang.String str82 = produto80.getCodigo();
        java.lang.String str83 = produto80.getNome();
        produto80.setCodigo("");
        double double86 = produto80.getPreco();
        java.lang.String str87 = produto80.getCodigo();
        produto80.setNome("hi!");
        java.lang.String str90 = produto80.getCodigo();
        produto80.setPreco((double) (byte) -1);
        estoque0.inserirProduto(produto80, (-200));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 100.0d + "'", double81 == 100.0d);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 100.0d + "'", double86 == 100.0d);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
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
        boolean boolean57 = estoque0.produtoExiste("");
        int int59 = estoque0.consultarQuantidade("");
        boolean boolean61 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 32 + "'", int59 == 32);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("hi!");
        int int20 = estoque0.consultarQuantidade("hi!");
        int int22 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
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
        java.lang.String str26 = produto16.getCodigo();
        java.lang.Class<?> wildcardClass27 = produto16.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        java.lang.String str13 = produto3.getCodigo();
        produto3.setNome("");
        produto3.setCodigo("hi!");
        java.lang.String str18 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
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
        produto65.setCodigo("");
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
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getCodigo();
        produto3.setPreco((double) (short) -1);
        produto3.setNome("");
        produto3.setCodigo("");
        produto3.setNome("hi!");
        java.lang.String str15 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 94);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
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
        br.ufrn.imd.Estoque estoque28 = new br.ufrn.imd.Estoque();
        boolean boolean30 = estoque28.produtoExiste("");
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto34.setNome("hi!");
        produto34.setPreco((double) 10);
        estoque28.inserirProduto(produto34, (int) (byte) -1);
        int int42 = estoque28.consultarQuantidade("");
        estoque28.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto49.setPreco((double) '#');
        produto49.setNome("");
        estoque28.inserirProduto(produto49, (int) (byte) 1);
        br.ufrn.imd.Produto produto59 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double60 = produto59.getPreco();
        produto59.setNome("hi!");
        java.lang.String str63 = produto59.getCodigo();
        produto59.setCodigo("hi!");
        double double66 = produto59.getPreco();
        produto59.setCodigo("hi!");
        java.lang.String str69 = produto59.getNome();
        produto59.setCodigo("");
        estoque28.inserirProduto(produto59, 97);
        java.lang.String str74 = produto59.getCodigo();
        double double75 = produto59.getPreco();
        java.lang.String str76 = produto59.getNome();
        double double77 = produto59.getPreco();
        java.lang.String str78 = produto59.getNome();
        estoque0.inserirProduto(produto59, (-200));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 100.0d + "'", double60 == 100.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 100.0d + "'", double66 == 100.0d);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 100.0d + "'", double75 == 100.0d);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 100.0d + "'", double77 == 100.0d);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        boolean boolean19 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Estoque estoque20 = new br.ufrn.imd.Estoque();
        boolean boolean22 = estoque20.produtoExiste("");
        br.ufrn.imd.Produto produto26 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto26.setNome("hi!");
        produto26.setPreco((double) 10);
        estoque20.inserirProduto(produto26, (int) (byte) -1);
        int int34 = estoque20.consultarQuantidade("");
        estoque20.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto41.setPreco((double) '#');
        produto41.setNome("");
        estoque20.inserirProduto(produto41, (int) (byte) 1);
        estoque20.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        estoque20.inserirProduto(produto54, (int) (byte) 10);
        estoque0.inserirProduto(produto54, (-97));
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        java.lang.String str12 = produto3.getCodigo();
        produto3.setNome("hi!");
        produto3.setNome("hi!");
        java.lang.String str17 = produto3.getCodigo();
        produto3.setPreco(1.0d);
        java.lang.String str20 = produto3.getCodigo();
        java.lang.String str21 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
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
        br.ufrn.imd.Estoque estoque32 = new br.ufrn.imd.Estoque();
        boolean boolean34 = estoque32.produtoExiste("");
        br.ufrn.imd.Produto produto38 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto38.setNome("hi!");
        produto38.setPreco((double) 10);
        estoque32.inserirProduto(produto38, (int) (byte) -1);
        int int46 = estoque32.consultarQuantidade("");
        estoque32.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto53 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto53.setNome("hi!");
        produto53.setPreco((double) 10);
        produto53.setNome("hi!");
        java.lang.String str60 = produto53.getCodigo();
        double double61 = produto53.getPreco();
        produto53.setCodigo("hi!");
        estoque32.inserirProduto(produto53, (int) 'a');
        java.lang.String str66 = produto53.getCodigo();
        java.lang.String str67 = produto53.getCodigo();
        estoque0.inserirProduto(produto53, 36);
        boolean boolean71 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto75 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double76 = produto75.getPreco();
        java.lang.String str77 = produto75.getCodigo();
        java.lang.String str78 = produto75.getNome();
        produto75.setCodigo("");
        double double81 = produto75.getPreco();
        java.lang.String str82 = produto75.getNome();
        double double83 = produto75.getPreco();
        estoque0.inserirProduto(produto75, (-76));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 100.0d + "'", double76 == 100.0d);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 100.0d + "'", double81 == 100.0d);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 100.0d + "'", double83 == 100.0d);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        produto3.setCodigo("hi!");
        double double10 = produto3.getPreco();
        double double11 = produto3.getPreco();
        double double12 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
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
        boolean boolean33 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("", 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-98) + "'", int31 == (-98));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 99 + "'", int31 == 99);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
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
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto33.setNome("hi!");
        produto33.setPreco((double) 10);
        java.lang.String str38 = produto33.getCodigo();
        double double39 = produto33.getPreco();
        double double40 = produto33.getPreco();
        produto33.setCodigo("");
        produto33.setPreco(18.0d);
        produto33.setCodigo("hi!");
        double double47 = produto33.getPreco();
        java.lang.String str48 = produto33.getNome();
        estoque0.inserirProduto(produto33, 97);
        int int52 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 18.0d + "'", double47 == 18.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 105 + "'", int52 == 105);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
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
        boolean boolean29 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto33.setNome("hi!");
        produto33.setNome("");
        produto33.setPreco(1.0d);
        java.lang.String str40 = produto33.getCodigo();
        double double41 = produto33.getPreco();
        produto33.setNome("");
        produto33.setPreco((double) (-13));
        estoque0.inserirProduto(produto33, 116);
        estoque0.removerProduto("hi!", 29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
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
        int int76 = estoque0.consultarQuantidade("hi!");
        boolean boolean78 = estoque0.produtoExiste("");
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
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 96 + "'", int76 == 96);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
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
        br.ufrn.imd.Produto produto33 = null;
        // The following exception was thrown during execution in test generation
        try {
            estoque0.inserirProduto(produto33, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 100);
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
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
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
        boolean boolean37 = estoque0.produtoExiste("");
        boolean boolean39 = estoque0.produtoExiste("");
        boolean boolean41 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto45.setPreco((double) '#');
        produto45.setPreco((double) 10);
        java.lang.String str50 = produto45.getCodigo();
        java.lang.String str51 = produto45.getNome();
        java.lang.String str52 = produto45.getCodigo();
        double double53 = produto45.getPreco();
        produto45.setPreco((double) (byte) 0);
        estoque0.inserirProduto(produto45, 98);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
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
        boolean boolean67 = estoque0.produtoExiste("hi!");
        int int69 = estoque0.consultarQuantidade("");
        boolean boolean71 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        int int13 = estoque0.consultarQuantidade("");
        boolean boolean15 = estoque0.produtoExiste("hi!");
        int int17 = estoque0.consultarQuantidade("hi!");
        boolean boolean19 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", 52);
        boolean boolean24 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "", 34.0d);
        java.lang.String str29 = produto28.getCodigo();
        estoque0.inserirProduto(produto28, 97);
        estoque0.removerProduto("hi!", (-160));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-100) + "'", int17 == (-100));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getNome();
        produto3.setNome("hi!");
        java.lang.String str8 = produto3.getNome();
        produto3.setPreco(52.0d);
        produto3.setCodigo("");
        java.lang.Class<?> wildcardClass13 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 1L);
        produto3.setCodigo("");
        produto3.setPreco((double) (short) -1);
        double double8 = produto3.getPreco();
        java.lang.String str9 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
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
        produto16.setPreco((double) 116);
        java.lang.String str31 = produto16.getNome();
        produto16.setPreco((double) (-69));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
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
        int int66 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", (-116));
        boolean boolean71 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-2) + "'", int61 == (-2));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-10) + "'", int66 == (-10));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", 9.0d);
        produto3.setCodigo("");
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (short) -1);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        produto3.setPreco((double) 68);
        produto3.setPreco((double) (-32));
        double double12 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-32.0d) + "'", double12 == (-32.0d));
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
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
        int int24 = estoque0.consultarQuantidade("");
        boolean boolean26 = estoque0.produtoExiste("");
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
        java.lang.String str64 = produto48.getCodigo();
        java.lang.String str65 = produto48.getNome();
        java.lang.String str66 = produto48.getCodigo();
        estoque0.inserirProduto(produto48, (int) '4');
        java.lang.Class<?> wildcardClass69 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", 10.0d);
        produto3.setNome("hi!");
        java.lang.String str6 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
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
        produto59.setNome("");
        double double75 = produto59.getPreco();
        java.lang.String str76 = produto59.getNome();
        java.lang.String str77 = produto59.getCodigo();
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
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-10.0d) + "'", double75 == (-10.0d));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 1);
        produto3.setNome("");
        double double6 = produto3.getPreco();
        double double7 = produto3.getPreco();
        double double8 = produto3.getPreco();
        java.lang.String str9 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-200));
        double double4 = produto3.getPreco();
        double double5 = produto3.getPreco();
        double double6 = produto3.getPreco();
        java.lang.Class<?> wildcardClass7 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-200.0d) + "'", double4 == (-200.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-200.0d) + "'", double5 == (-200.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-200.0d) + "'", double6 == (-200.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
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
        int int24 = estoque0.consultarQuantidade("hi!");
        int int26 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto30 = new br.ufrn.imd.Produto("", "", (double) (-200));
        estoque0.inserirProduto(produto30, 28);
        java.lang.Class<?> wildcardClass33 = produto30.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
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
        produto41.setPreco(0.0d);
        java.lang.Class<?> wildcardClass54 = produto41.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
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
        java.lang.String str47 = produto41.getNome();
        produto41.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
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
        int int41 = estoque0.consultarQuantidade("hi!");
        boolean boolean43 = estoque0.produtoExiste("");
        int int45 = estoque0.consultarQuantidade("");
        boolean boolean47 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-2) + "'", int41 == (-2));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
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
        boolean boolean25 = estoque0.produtoExiste("");
        int int27 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
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
        produto41.setPreco((double) 52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
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
        estoque0.removerProduto("", (int) (short) 10);
        estoque0.removerProduto("", 166);
        boolean boolean73 = estoque0.produtoExiste("hi!");
        java.lang.Class<?> wildcardClass74 = estoque0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        double double10 = produto3.getPreco();
        produto3.setNome("");
        java.lang.String str13 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
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
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 29);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
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
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        java.lang.String str32 = produto31.getCodigo();
        double double33 = produto31.getPreco();
        java.lang.String str34 = produto31.getNome();
        produto31.setNome("hi!");
        java.lang.String str37 = produto31.getNome();
        estoque0.inserirProduto(produto31, 34);
        boolean boolean41 = estoque0.produtoExiste("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (short) 10);
        double double4 = produto3.getPreco();
        produto3.setCodigo("");
        java.lang.String str7 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
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
        int int35 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto39.setNome("hi!");
        produto39.setPreco((double) 10);
        java.lang.String str44 = produto39.getNome();
        double double45 = produto39.getPreco();
        java.lang.String str46 = produto39.getNome();
        produto39.setNome("");
        produto39.setPreco((double) (byte) 100);
        java.lang.String str51 = produto39.getNome();
        produto39.setCodigo("hi!");
        java.lang.String str54 = produto39.getNome();
        java.lang.String str55 = produto39.getCodigo();
        estoque0.inserirProduto(produto39, 98);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        double double9 = produto4.getPreco();
        produto4.setCodigo("hi!");
        produto4.setPreco((double) 36);
        produto4.setPreco((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        int int19 = estoque0.consultarQuantidade("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
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
        boolean boolean40 = estoque0.produtoExiste("hi!");
        boolean boolean42 = estoque0.produtoExiste("hi!");
        boolean boolean44 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
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
        java.lang.Class<?> wildcardClass47 = produto41.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        java.lang.String str4 = produto3.getNome();
        java.lang.String str5 = produto3.getCodigo();
        produto3.setPreco((double) 84);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
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
        boolean boolean34 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
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
        boolean boolean74 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
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
        java.lang.Class<?> wildcardClass37 = produto19.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
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
        estoque0.removerProduto("hi!", 34);
        int int28 = estoque0.consultarQuantidade("");
        int int30 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-67) + "'", int30 == (-67));
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
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
        boolean boolean41 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double46 = produto45.getPreco();
        produto45.setNome("");
        java.lang.String str49 = produto45.getNome();
        produto45.setNome("hi!");
        java.lang.String str52 = produto45.getNome();
        estoque0.inserirProduto(produto45, 114);
        produto45.setPreco((double) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (byte) 1);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
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
        java.lang.String str54 = produto47.getCodigo();
        double double55 = produto47.getPreco();
        produto47.setNome("hi!");
        double double58 = produto47.getPreco();
        java.lang.String str59 = produto47.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 100.0d + "'", double55 == 100.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 100.0d + "'", double58 == 100.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
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
        br.ufrn.imd.Estoque estoque56 = new br.ufrn.imd.Estoque();
        boolean boolean58 = estoque56.produtoExiste("");
        br.ufrn.imd.Produto produto62 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto62.setNome("hi!");
        produto62.setPreco((double) 10);
        estoque56.inserirProduto(produto62, (int) (byte) -1);
        int int70 = estoque56.consultarQuantidade("");
        estoque56.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto77 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto77.setNome("hi!");
        produto77.setPreco((double) 10);
        produto77.setNome("hi!");
        java.lang.String str84 = produto77.getCodigo();
        double double85 = produto77.getPreco();
        produto77.setCodigo("hi!");
        estoque56.inserirProduto(produto77, (int) 'a');
        java.lang.String str90 = produto77.getCodigo();
        java.lang.String str91 = produto77.getCodigo();
        java.lang.String str92 = produto77.getCodigo();
        java.lang.String str93 = produto77.getNome();
        produto77.setCodigo("hi!");
        estoque0.inserirProduto(produto77, 10);
        java.lang.String str98 = produto77.getNome();
        java.lang.String str99 = produto77.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 10.0d + "'", double85 == 10.0d);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!" + "'", str91, "hi!");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "hi!" + "'", str98, "hi!");
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "hi!" + "'", str99, "hi!");
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
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
        double double36 = produto21.getPreco();
        java.lang.Class<?> wildcardClass37 = produto21.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
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
        boolean boolean78 = estoque0.produtoExiste("hi!");
        int int80 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (-25));
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
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
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
        java.lang.String str97 = produto88.getCodigo();
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
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "hi!" + "'", str97, "hi!");
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        java.lang.String str6 = produto3.getCodigo();
        produto3.setPreco((double) (short) 100);
        java.lang.String str9 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setNome("hi!");
        double double9 = produto3.getPreco();
        produto3.setPreco((double) 0);
        produto3.setCodigo("hi!");
        double double14 = produto3.getPreco();
        java.lang.Class<?> wildcardClass15 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setPreco((double) (byte) 0);
        java.lang.String str9 = produto3.getNome();
        produto3.setPreco((double) 10.0f);
        produto3.setPreco((double) 1);
        java.lang.String str14 = produto3.getCodigo();
        produto3.setPreco((double) 36);
        double double17 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 36.0d + "'", double17 == 36.0d);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
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
        estoque0.removerProduto("hi!", 10);
        boolean boolean38 = estoque0.produtoExiste("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-61));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
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
        int int68 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto72 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto72.setNome("hi!");
        produto72.setPreco((double) 10);
        java.lang.String str77 = produto72.getNome();
        double double78 = produto72.getPreco();
        produto72.setNome("");
        double double81 = produto72.getPreco();
        produto72.setPreco((-1.0d));
        double double84 = produto72.getPreco();
        estoque0.inserirProduto(produto72, 100);
        java.lang.Class<?> wildcardClass87 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 36 + "'", int68 == 36);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-1.0d) + "'", double84 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
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
        double double47 = produto31.getPreco();
        produto31.setNome("hi!");
        produto31.setPreco((double) (-13));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
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
        double double84 = produto77.getPreco();
        produto77.setNome("hi!");
        estoque0.inserirProduto(produto77, 1);
        java.lang.String str89 = produto77.getNome();
        produto77.setNome("");
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-2.0d) + "'", double84 == (-2.0d));
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (short) 100);
        produto3.setNome("");
        java.lang.String str6 = produto3.getNome();
        double double7 = produto3.getPreco();
        produto3.setPreco((double) 105);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
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
        produto42.setPreco((double) 1);
        produto42.setPreco((double) (-28));
        produto42.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getCodigo();
        java.lang.String str7 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        double double10 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
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
        double double27 = produto15.getPreco();
        produto15.setPreco((double) 1);
        java.lang.Class<?> wildcardClass30 = produto15.getClass();
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
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
        java.lang.String str25 = produto15.getNome();
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        estoque0.removerProduto("hi!", (-98));
        int int22 = estoque0.consultarQuantidade("hi!");
        boolean boolean24 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        int int16 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 99);
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("hi!", "", 100.0d);
        java.lang.String str24 = produto23.getCodigo();
        double double25 = produto23.getPreco();
        double double26 = produto23.getPreco();
        double double27 = produto23.getPreco();
        estoque0.inserirProduto(produto23, 52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
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
        int int92 = estoque0.consultarQuantidade("");
        int int94 = estoque0.consultarQuantidade("");
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
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 16 + "'", int92 == 16);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 16 + "'", int94 == 16);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
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
        java.lang.Class<?> wildcardClass21 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (short) 10);
        java.lang.String str4 = produto3.getNome();
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (-116));
        java.lang.String str4 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
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
        java.lang.String str54 = produto47.getCodigo();
        java.lang.String str55 = produto47.getCodigo();
        java.lang.String str56 = produto47.getCodigo();
        java.lang.String str57 = produto47.getCodigo();
        java.lang.String str58 = produto47.getCodigo();
        produto47.setCodigo("");
        estoque0.inserirProduto(produto47, (-98));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-33) + "'", int23 == (-33));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 9);
        java.lang.String str4 = produto3.getCodigo();
        double double5 = produto3.getPreco();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
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
        java.lang.String str46 = produto33.getCodigo();
        java.lang.String str47 = produto33.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
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
        produto37.setPreco((double) 109);
        produto37.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("");
        double double7 = produto3.getPreco();
        double double8 = produto3.getPreco();
        produto3.setCodigo("");
        java.lang.String str11 = produto3.getNome();
        java.lang.String str12 = produto3.getCodigo();
        produto3.setPreco((double) (-25));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
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
        produto23.setCodigo("");
        produto23.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
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
        int int38 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
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
        produto12.setCodigo("");
        double double28 = produto12.getPreco();
        java.lang.String str29 = produto12.getCodigo();
        produto12.setNome("");
        produto12.setNome("");
        java.lang.String str34 = produto12.getNome();
        produto12.setCodigo("");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
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
        boolean boolean53 = estoque0.produtoExiste("hi!");
        int int55 = estoque0.consultarQuantidade("hi!");
        boolean boolean57 = estoque0.produtoExiste("hi!");
        boolean boolean59 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-11) + "'", int55 == (-11));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 1);
        estoque0.removerProduto("hi!", 100);
        estoque0.removerProduto("hi!", (-2));
        estoque0.removerProduto("hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        java.lang.String str8 = produto3.getNome();
        java.lang.String str9 = produto3.getCodigo();
        produto3.setPreco(18.0d);
        java.lang.String str12 = produto3.getCodigo();
        java.lang.String str13 = produto3.getNome();
        java.lang.Class<?> wildcardClass14 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
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
        produto3.setCodigo("hi!");
        double double21 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
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
        int int47 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque48 = new br.ufrn.imd.Estoque();
        boolean boolean50 = estoque48.produtoExiste("");
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto54.setNome("hi!");
        produto54.setPreco((double) 10);
        estoque48.inserirProduto(produto54, (int) (byte) -1);
        br.ufrn.imd.Produto produto64 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto64.setNome("hi!");
        produto64.setNome("");
        estoque48.inserirProduto(produto64, 0);
        estoque48.removerProduto("hi!", 0);
        estoque48.removerProduto("hi!", 18);
        br.ufrn.imd.Produto produto80 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto80.setNome("");
        java.lang.String str83 = produto80.getNome();
        java.lang.String str84 = produto80.getNome();
        estoque48.inserirProduto(produto80, 68);
        estoque0.inserirProduto(produto80, (-99));
        produto80.setNome("");
        produto80.setCodigo("");
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setPreco((double) 10L);
        produto3.setPreco(35.0d);
        java.lang.String str16 = produto3.getCodigo();
        produto3.setNome("hi!");
        java.lang.Class<?> wildcardClass19 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
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
        boolean boolean25 = estoque0.produtoExiste("");
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-33) + "'", int23 == (-33));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        produto3.setNome("");
        double double13 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str16 = produto3.getNome();
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
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
        java.lang.String str20 = produto3.getCodigo();
        java.lang.String str21 = produto3.getNome();
        java.lang.String str22 = produto3.getCodigo();
        java.lang.String str23 = produto3.getNome();
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
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
        int int77 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto81 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto81.setNome("hi!");
        produto81.setPreco((double) 10);
        produto81.setNome("hi!");
        java.lang.String str88 = produto81.getCodigo();
        produto81.setPreco((double) (-1L));
        produto81.setNome("");
        estoque0.inserirProduto(produto81, 100);
        java.lang.Class<?> wildcardClass95 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        double double9 = produto3.getPreco();
        produto3.setPreco((double) 1.0f);
        double double12 = produto3.getPreco();
        java.lang.String str13 = produto3.getNome();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque15 = new br.ufrn.imd.Estoque();
        boolean boolean17 = estoque15.produtoExiste("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        produto21.setPreco((double) 10);
        estoque15.inserirProduto(produto21, (int) (byte) -1);
        estoque15.removerProduto("hi!", 0);
        int int32 = estoque15.consultarQuantidade("");
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double37 = produto36.getPreco();
        produto36.setNome("hi!");
        java.lang.String str40 = produto36.getCodigo();
        produto36.setCodigo("hi!");
        double double43 = produto36.getPreco();
        estoque15.inserirProduto(produto36, (int) 'a');
        java.lang.String str46 = produto36.getCodigo();
        produto36.setNome("hi!");
        estoque0.inserirProduto(produto36, (int) '4');
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto54.setNome("hi!");
        produto54.setPreco((double) 10);
        java.lang.String str59 = produto54.getCodigo();
        double double60 = produto54.getPreco();
        double double61 = produto54.getPreco();
        produto54.setCodigo("");
        produto54.setPreco(18.0d);
        java.lang.String str66 = produto54.getCodigo();
        estoque0.inserirProduto(produto54, 68);
        int int70 = estoque0.consultarQuantidade("hi!");
        boolean boolean72 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 51 + "'", int70 == 51);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
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
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto39.setNome("hi!");
        produto39.setPreco((double) 10);
        java.lang.String str44 = produto39.getNome();
        double double45 = produto39.getPreco();
        java.lang.String str46 = produto39.getCodigo();
        java.lang.String str47 = produto39.getCodigo();
        estoque0.inserirProduto(produto39, 99);
        br.ufrn.imd.Produto produto53 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto53.setNome("hi!");
        produto53.setNome("");
        java.lang.String str58 = produto53.getNome();
        double double59 = produto53.getPreco();
        estoque0.inserirProduto(produto53, (int) (short) -1);
        int int63 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto67 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-1.0f));
        java.lang.String str68 = produto67.getNome();
        estoque0.inserirProduto(produto67, 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
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
        int int22 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque23 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto27 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto27.setCodigo("hi!");
        estoque23.inserirProduto(produto27, (int) (byte) 0);
        estoque23.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto38 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto38.setNome("hi!");
        produto38.setPreco((double) 100L);
        estoque23.inserirProduto(produto38, (int) (short) 10);
        java.lang.String str45 = produto38.getCodigo();
        estoque0.inserirProduto(produto38, (int) (byte) -1);
        int int49 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto53 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto53.setNome("hi!");
        produto53.setPreco((double) 10);
        java.lang.String str58 = produto53.getNome();
        double double59 = produto53.getPreco();
        java.lang.String str60 = produto53.getNome();
        produto53.setNome("");
        double double63 = produto53.getPreco();
        produto53.setNome("hi!");
        estoque0.inserirProduto(produto53, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
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
        estoque0.removerProduto("hi!", (int) '4');
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
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
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
        produto65.setPreco((double) (byte) -1);
        double double80 = produto65.getPreco();
        produto65.setNome("");
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
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-1.0d) + "'", double80 == (-1.0d));
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        int int13 = estoque0.consultarQuantidade("");
        int int15 = estoque0.consultarQuantidade("");
        int int17 = estoque0.consultarQuantidade("");
        boolean boolean19 = estoque0.produtoExiste("hi!");
        int int21 = estoque0.consultarQuantidade("hi!");
        boolean boolean23 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
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
        java.lang.Class<?> wildcardClass34 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
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
        boolean boolean33 = estoque0.produtoExiste("hi!");
        int int35 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque36 = new br.ufrn.imd.Estoque();
        boolean boolean38 = estoque36.produtoExiste("");
        br.ufrn.imd.Produto produto42 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto42.setNome("hi!");
        produto42.setPreco((double) 10);
        estoque36.inserirProduto(produto42, (int) (byte) -1);
        boolean boolean50 = estoque36.produtoExiste("hi!");
        boolean boolean52 = estoque36.produtoExiste("hi!");
        br.ufrn.imd.Estoque estoque53 = new br.ufrn.imd.Estoque();
        boolean boolean55 = estoque53.produtoExiste("");
        br.ufrn.imd.Produto produto59 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto59.setNome("hi!");
        produto59.setPreco((double) 10);
        estoque53.inserirProduto(produto59, (int) (byte) -1);
        estoque53.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto72 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque53.inserirProduto(produto72, (int) (short) 100);
        produto72.setPreco((double) 1L);
        estoque36.inserirProduto(produto72, (int) (byte) 10);
        produto72.setNome("");
        produto72.setCodigo("");
        estoque0.inserirProduto(produto72, (-69));
        java.lang.Class<?> wildcardClass85 = produto72.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
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
        produto50.setCodigo("");
        java.lang.String str63 = produto50.getCodigo();
        produto50.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
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
        estoque0.removerProduto("hi!", (int) (short) 10);
        estoque0.removerProduto("hi!", (int) (short) 100);
        boolean boolean45 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", 96);
        java.lang.Class<?> wildcardClass49 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
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
        int int39 = estoque0.consultarQuantidade("");
        int int41 = estoque0.consultarQuantidade("hi!");
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
        double double67 = produto58.getPreco();
        java.lang.String str68 = produto58.getCodigo();
        produto58.setPreco(0.0d);
        produto58.setPreco((double) (byte) 10);
        estoque0.inserirProduto(produto58, 166);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-90) + "'", int39 == (-90));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-110) + "'", int41 == (-110));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
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
        boolean boolean31 = estoque0.produtoExiste("");
        boolean boolean33 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (byte) 0);
        produto3.setNome("");
        produto3.setPreco((double) (-36));
        produto3.setNome("");
        java.lang.Class<?> wildcardClass10 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
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
        estoque0.removerProduto("hi!", (-200));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
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
        int int47 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque48 = new br.ufrn.imd.Estoque();
        boolean boolean50 = estoque48.produtoExiste("");
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto54.setNome("hi!");
        produto54.setPreco((double) 10);
        estoque48.inserirProduto(produto54, (int) (byte) -1);
        br.ufrn.imd.Produto produto64 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto64.setNome("hi!");
        produto64.setNome("");
        estoque48.inserirProduto(produto64, 0);
        estoque48.removerProduto("hi!", 0);
        estoque48.removerProduto("hi!", 18);
        br.ufrn.imd.Produto produto80 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto80.setNome("");
        java.lang.String str83 = produto80.getNome();
        java.lang.String str84 = produto80.getNome();
        estoque48.inserirProduto(produto80, 68);
        estoque0.inserirProduto(produto80, (-99));
        estoque0.removerProduto("hi!", 0);
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
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
        produto55.setPreco(0.0d);
        produto55.setNome("");
        java.lang.String str64 = produto55.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
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
        java.lang.String str27 = produto24.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
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
        produto31.setCodigo("");
        produto31.setCodigo("hi!");
        produto31.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 35.0d + "'", double38 == 35.0d);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
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
        br.ufrn.imd.Produto produto55 = new br.ufrn.imd.Produto("", "", (-11.0d));
        estoque0.inserirProduto(produto55, (-97));
        boolean boolean59 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-91) + "'", int51 == (-91));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (short) 10);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("");
        double double7 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
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
        int int23 = estoque0.consultarQuantidade("");
        boolean boolean25 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
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
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto31.setCodigo("hi!");
        java.lang.String str34 = produto31.getNome();
        java.lang.String str35 = produto31.getCodigo();
        estoque0.inserirProduto(produto31, (int) (byte) 100);
        estoque0.removerProduto("", 96);
        int int42 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        produto3.setPreco(0.0d);
        produto3.setNome("hi!");
        produto3.setPreco((double) 1.0f);
        java.lang.String str15 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        produto6.setNome("hi!");
        produto6.setCodigo("");
        java.lang.String str17 = produto6.getNome();
        java.lang.String str18 = produto6.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
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
        produto33.setNome("");
        produto33.setCodigo("hi!");
        produto33.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
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
        boolean boolean62 = estoque0.produtoExiste("hi!");
        java.lang.Class<?> wildcardClass63 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (-63));
        produto3.setCodigo("hi!");
        produto3.setPreco((double) 32);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getCodigo();
        produto3.setNome("");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
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
        int int52 = estoque0.consultarQuantidade("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-70));
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
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
        produto3.setNome("");
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
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
        produto19.setPreco((double) 16);
        double double25 = produto19.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 16.0d + "'", double25 == 16.0d);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
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
        int int61 = estoque0.consultarQuantidade("hi!");
        int int63 = estoque0.consultarQuantidade("");
        int int65 = estoque0.consultarQuantidade("hi!");
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
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-2) + "'", int61 == (-2));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-2) + "'", int65 == (-2));
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-10));
        produto3.setNome("");
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 0);
        produto3.setCodigo("");
        java.lang.Class<?> wildcardClass6 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
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
        java.lang.String str30 = produto16.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque15 = new br.ufrn.imd.Estoque();
        boolean boolean17 = estoque15.produtoExiste("");
        br.ufrn.imd.Produto produto21 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto21.setNome("hi!");
        produto21.setPreco((double) 10);
        estoque15.inserirProduto(produto21, (int) (byte) -1);
        estoque15.removerProduto("hi!", 0);
        int int32 = estoque15.consultarQuantidade("");
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double37 = produto36.getPreco();
        produto36.setNome("hi!");
        java.lang.String str40 = produto36.getCodigo();
        produto36.setCodigo("hi!");
        double double43 = produto36.getPreco();
        estoque15.inserirProduto(produto36, (int) 'a');
        java.lang.String str46 = produto36.getCodigo();
        produto36.setNome("hi!");
        estoque0.inserirProduto(produto36, (int) '4');
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto54.setNome("hi!");
        produto54.setPreco((double) 10);
        java.lang.String str59 = produto54.getCodigo();
        double double60 = produto54.getPreco();
        double double61 = produto54.getPreco();
        produto54.setCodigo("");
        produto54.setPreco(18.0d);
        java.lang.String str66 = produto54.getCodigo();
        estoque0.inserirProduto(produto54, 68);
        int int70 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto74 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto74.setNome("hi!");
        produto74.setPreco((double) 10);
        java.lang.String str79 = produto74.getNome();
        double double80 = produto74.getPreco();
        java.lang.String str81 = produto74.getCodigo();
        java.lang.String str82 = produto74.getNome();
        double double83 = produto74.getPreco();
        produto74.setCodigo("");
        java.lang.String str86 = produto74.getCodigo();
        estoque0.inserirProduto(produto74, (-76));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 51 + "'", int70 == 51);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 10.0d + "'", double80 == 10.0d);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.0d + "'", double83 == 10.0d);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
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
        br.ufrn.imd.Produto produto75 = new br.ufrn.imd.Produto("", "", (double) (short) 0);
        produto75.setCodigo("");
        estoque0.inserirProduto(produto75, 99);
        java.lang.String str80 = produto75.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
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
        estoque0.removerProduto("hi!", 0);
        int int64 = estoque0.consultarQuantidade("");
        boolean boolean66 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
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
        double double36 = produto31.getPreco();
        produto31.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 34.0d + "'", double36 == 34.0d);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
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
        int int45 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 0);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-5) + "'", int45 == (-5));
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
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
        int int28 = estoque0.consultarQuantidade("hi!");
        int int30 = estoque0.consultarQuantidade("hi!");
        int int32 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", 179);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-2) + "'", int32 == (-2));
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (byte) 1);
        produto3.setPreco((double) (-98));
        produto3.setCodigo("");
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
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
        int int57 = estoque0.consultarQuantidade("");
        boolean boolean59 = estoque0.produtoExiste("hi!");
        int int61 = estoque0.consultarQuantidade("hi!");
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 32 + "'", int57 == 32);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 99 + "'", int61 == 99);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
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
        br.ufrn.imd.Estoque estoque71 = new br.ufrn.imd.Estoque();
        boolean boolean73 = estoque71.produtoExiste("");
        br.ufrn.imd.Produto produto77 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto77.setNome("hi!");
        produto77.setPreco((double) 10);
        estoque71.inserirProduto(produto77, (int) (byte) -1);
        produto77.setPreco((double) (-101));
        estoque0.inserirProduto(produto77, (-102));
        br.ufrn.imd.Produto produto91 = new br.ufrn.imd.Produto("", "", (double) 100.0f);
        estoque0.inserirProduto(produto91, (-25));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 105);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
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
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto65.setPreco((double) '#');
        java.lang.String str68 = produto65.getCodigo();
        estoque0.inserirProduto(produto65, 97);
        java.lang.Class<?> wildcardClass71 = produto65.getClass();
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
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
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
        boolean boolean36 = estoque0.produtoExiste("");
        int int38 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
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
        boolean boolean48 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
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
        boolean boolean33 = estoque0.produtoExiste("hi!");
        int int35 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque36 = new br.ufrn.imd.Estoque();
        boolean boolean38 = estoque36.produtoExiste("");
        br.ufrn.imd.Produto produto42 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto42.setNome("hi!");
        produto42.setPreco((double) 10);
        estoque36.inserirProduto(produto42, (int) (byte) -1);
        estoque36.removerProduto("hi!", 0);
        int int53 = estoque36.consultarQuantidade("");
        br.ufrn.imd.Produto produto57 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque36.inserirProduto(produto57, (int) (byte) 100);
        boolean boolean61 = estoque36.produtoExiste("");
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double66 = produto65.getPreco();
        java.lang.String str67 = produto65.getCodigo();
        java.lang.String str68 = produto65.getCodigo();
        produto65.setPreco((double) (short) -1);
        estoque36.inserirProduto(produto65, (int) (byte) 1);
        produto65.setCodigo("hi!");
        estoque0.inserirProduto(produto65, (int) (short) -1);
        boolean boolean78 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 100.0d + "'", double66 == 100.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double4 = produto3.getPreco();
        double double5 = produto3.getPreco();
        produto3.setPreco((double) (short) 0);
        double double8 = produto3.getPreco();
        produto3.setPreco((double) (-10));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
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
        double double51 = produto45.getPreco();
        produto45.setCodigo("");
        java.lang.String str54 = produto45.getCodigo();
        java.lang.String str55 = produto45.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
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
        java.lang.String str59 = produto51.getCodigo();
        double double60 = produto51.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-99));
        produto3.setNome("");
        produto3.setPreco((double) (-65));
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
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
        boolean boolean35 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (-35));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
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
        double double59 = produto55.getPreco();
        double double60 = produto55.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
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
        boolean boolean58 = estoque0.produtoExiste("");
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
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
        boolean boolean22 = estoque0.produtoExiste("");
        boolean boolean24 = estoque0.produtoExiste("");
        boolean boolean26 = estoque0.produtoExiste("");
        int int28 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque29 = new br.ufrn.imd.Estoque();
        boolean boolean31 = estoque29.produtoExiste("");
        br.ufrn.imd.Produto produto35 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto35.setNome("hi!");
        produto35.setPreco((double) 10);
        estoque29.inserirProduto(produto35, (int) (byte) -1);
        estoque29.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto48 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque29.inserirProduto(produto48, (int) (short) 100);
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double55 = produto54.getPreco();
        java.lang.String str56 = produto54.getCodigo();
        java.lang.String str57 = produto54.getNome();
        produto54.setCodigo("");
        double double60 = produto54.getPreco();
        java.lang.String str61 = produto54.getCodigo();
        produto54.setNome("hi!");
        java.lang.String str64 = produto54.getNome();
        estoque29.inserirProduto(produto54, (-63));
        estoque0.inserirProduto(produto54, 2);
        boolean boolean70 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 100.0d + "'", double55 == 100.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 100.0d + "'", double60 == 100.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
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
        double double24 = produto3.getPreco();
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-63.0d) + "'", double24 == (-63.0d));
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        boolean boolean4 = estoque0.produtoExiste("hi!");
        boolean boolean6 = estoque0.produtoExiste("");
        boolean boolean8 = estoque0.produtoExiste("hi!");
        int int10 = estoque0.consultarQuantidade("");
        int int12 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto16 = new br.ufrn.imd.Produto("hi!", "", 100.0d);
        produto16.setPreco((double) 0.0f);
        produto16.setNome("");
        estoque0.inserirProduto(produto16, (-80));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
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
        br.ufrn.imd.Produto produto72 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str73 = produto72.getCodigo();
        produto72.setNome("");
        produto72.setPreco((double) 10);
        java.lang.String str78 = produto72.getCodigo();
        double double79 = produto72.getPreco();
        estoque0.inserirProduto(produto72, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 36 + "'", int66 == 36);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 10.0d + "'", double79 == 10.0d);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
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
        java.lang.String str68 = produto59.getNome();
        produto59.setPreco((-100.0d));
        produto59.setPreco((-100.0d));
        double double73 = produto59.getPreco();
        java.lang.Class<?> wildcardClass74 = produto59.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-100.0d) + "'", double73 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 65);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) '#');
        produto3.setPreco(10.0d);
        produto3.setPreco((double) 10L);
        produto3.setCodigo("");
        double double10 = produto3.getPreco();
        produto3.setCodigo("");
        produto3.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 98);
        double double4 = produto3.getPreco();
        produto3.setNome("");
        java.lang.Class<?> wildcardClass7 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 98.0d + "'", double4 == 98.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        java.lang.String str10 = produto3.getNome();
        produto3.setNome("hi!");
        double double13 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
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
        boolean boolean48 = estoque0.produtoExiste("hi!");
        int int50 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
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
        estoque0.removerProduto("hi!", (-4));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
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
        estoque0.removerProduto("hi!", 100);
        boolean boolean88 = estoque0.produtoExiste("hi!");
        int int90 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", (-116));
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
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-67) + "'", int90 == (-67));
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
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
        boolean boolean75 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
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
        java.lang.String str24 = produto21.getCodigo();
        java.lang.String str25 = produto21.getCodigo();
        produto21.setCodigo("hi!");
        produto21.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
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
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "hi!", (double) (-2));
        estoque0.inserirProduto(produto41, (-103));
        java.lang.String str44 = produto41.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
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
        boolean boolean55 = estoque0.produtoExiste("");
        int int57 = estoque0.consultarQuantidade("hi!");
        boolean boolean59 = estoque0.produtoExiste("hi!");
        boolean boolean61 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto65.setNome("hi!");
        produto65.setPreco((double) 10);
        produto65.setNome("hi!");
        produto65.setPreco((double) 'a');
        produto65.setNome("");
        produto65.setNome("");
        produto65.setPreco((double) (short) -1);
        produto65.setCodigo("");
        produto65.setCodigo("");
        double double84 = produto65.getPreco();
        estoque0.inserirProduto(produto65, (-3));
        estoque0.removerProduto("", (-28));
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
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-1.0d) + "'", double84 == (-1.0d));
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
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
        boolean boolean44 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Estoque estoque45 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto49.setCodigo("hi!");
        estoque45.inserirProduto(produto49, (int) (byte) 0);
        estoque45.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto60 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto60.setNome("hi!");
        produto60.setPreco((double) 100L);
        estoque45.inserirProduto(produto60, (int) (short) 10);
        produto60.setPreco(52.0d);
        double double69 = produto60.getPreco();
        produto60.setCodigo("");
        double double72 = produto60.getPreco();
        double double73 = produto60.getPreco();
        estoque0.inserirProduto(produto60, (-101));
        java.lang.String str76 = produto60.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 52.0d + "'", double69 == 52.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 52.0d + "'", double72 == 52.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 52.0d + "'", double73 == 52.0d);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        double double6 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str9 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        java.lang.String str4 = produto3.getCodigo();
        java.lang.String str5 = produto3.getCodigo();
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
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
        produto39.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
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
        boolean boolean28 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", 16);
        br.ufrn.imd.Estoque estoque32 = new br.ufrn.imd.Estoque();
        boolean boolean34 = estoque32.produtoExiste("");
        br.ufrn.imd.Produto produto38 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto38.setNome("hi!");
        produto38.setPreco((double) 10);
        estoque32.inserirProduto(produto38, (int) (byte) -1);
        boolean boolean46 = estoque32.produtoExiste("");
        int int48 = estoque32.consultarQuantidade("");
        boolean boolean50 = estoque32.produtoExiste("");
        int int52 = estoque32.consultarQuantidade("");
        br.ufrn.imd.Produto produto56 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto56.setNome("hi!");
        produto56.setNome("");
        produto56.setPreco(1.0d);
        java.lang.String str63 = produto56.getCodigo();
        double double64 = produto56.getPreco();
        java.lang.String str65 = produto56.getNome();
        estoque32.inserirProduto(produto56, 9);
        produto56.setPreco((double) 100);
        estoque0.inserirProduto(produto56, 116);
        estoque0.removerProduto("hi!", (int) (short) 10);
        estoque0.removerProduto("hi!", (int) (short) 10);
        br.ufrn.imd.Produto produto78 = null;
        // The following exception was thrown during execution in test generation
        try {
            estoque0.inserirProduto(produto78, 166);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 1.0d + "'", double64 == 1.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
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
        int int37 = estoque0.consultarQuantidade("hi!");
        boolean boolean39 = estoque0.produtoExiste("hi!");
        int int41 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "", (double) (-2));
        produto45.setPreco((double) (-68));
        estoque0.inserirProduto(produto45, (-5));
        java.lang.String str50 = produto45.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 99 + "'", int37 == 99);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 99 + "'", int41 == 99);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
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
        boolean boolean29 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto33.setNome("hi!");
        produto33.setNome("");
        produto33.setPreco(1.0d);
        java.lang.String str40 = produto33.getCodigo();
        double double41 = produto33.getPreco();
        produto33.setNome("");
        produto33.setPreco((double) (-13));
        estoque0.inserirProduto(produto33, 116);
        estoque0.removerProduto("hi!", (-65));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
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
        produto49.setPreco((double) (byte) 10);
        produto49.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
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
        boolean boolean39 = estoque0.produtoExiste("hi!");
        boolean boolean41 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double46 = produto45.getPreco();
        java.lang.String str47 = produto45.getCodigo();
        java.lang.String str48 = produto45.getNome();
        produto45.setCodigo("");
        double double51 = produto45.getPreco();
        java.lang.String str52 = produto45.getCodigo();
        produto45.setNome("hi!");
        java.lang.String str55 = produto45.getCodigo();
        produto45.setPreco((double) (byte) -1);
        produto45.setNome("");
        produto45.setNome("");
        estoque0.inserirProduto(produto45, 0);
        produto45.setPreco(34.0d);
        produto45.setPreco((double) 52);
        double double68 = produto45.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 100.0d + "'", double51 == 100.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 52.0d + "'", double68 == 52.0d);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setCodigo("");
        double double8 = produto3.getPreco();
        java.lang.String str9 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        int int13 = estoque0.consultarQuantidade("");
        boolean boolean15 = estoque0.produtoExiste("");
        boolean boolean17 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", 10);
        br.ufrn.imd.Produto produto24 = new br.ufrn.imd.Produto("hi!", "", (double) (short) 10);
        java.lang.String str25 = produto24.getCodigo();
        produto24.setNome("");
        estoque0.inserirProduto(produto24, (-108));
        produto24.setPreco((double) 16);
        produto24.setPreco(36.0d);
        double double34 = produto24.getPreco();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 36.0d + "'", double34 == 36.0d);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
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
        produto3.setPreco((double) (-91));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
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
        int int68 = estoque0.consultarQuantidade("hi!");
        boolean boolean70 = estoque0.produtoExiste("hi!");
        int int72 = estoque0.consultarQuantidade("");
        boolean boolean74 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 36 + "'", int68 == 36);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
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
        java.lang.String str23 = produto12.getCodigo();
        java.lang.String str24 = produto12.getCodigo();
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        int int13 = estoque0.consultarQuantidade("");
        boolean boolean15 = estoque0.produtoExiste("");
        boolean boolean17 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", 10);
        br.ufrn.imd.Produto produto24 = new br.ufrn.imd.Produto("hi!", "", (double) (short) 10);
        java.lang.String str25 = produto24.getCodigo();
        produto24.setNome("");
        estoque0.inserirProduto(produto24, (-108));
        produto24.setPreco((double) 16);
        produto24.setPreco(36.0d);
        produto24.setPreco((-167.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
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
        int int30 = estoque0.consultarQuantidade("");
        boolean boolean32 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
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
        estoque0.removerProduto("hi!", (int) (short) -1);
        int int28 = estoque0.consultarQuantidade("");
        java.lang.Class<?> wildcardClass29 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 8);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.0d + "'", double4 == 8.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
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
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto31.setCodigo("hi!");
        java.lang.String str34 = produto31.getNome();
        java.lang.String str35 = produto31.getCodigo();
        estoque0.inserirProduto(produto31, (int) (byte) 100);
        estoque0.removerProduto("", 96);
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto44.setNome("hi!");
        produto44.setNome("");
        produto44.setPreco((double) 10L);
        java.lang.String str51 = produto44.getCodigo();
        java.lang.String str52 = produto44.getNome();
        estoque0.inserirProduto(produto44, 166);
        int int56 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto60 = new br.ufrn.imd.Produto("", "", (double) 0.0f);
        produto60.setPreco(97.0d);
        java.lang.String str63 = produto60.getNome();
        java.lang.String str64 = produto60.getNome();
        produto60.setPreco((double) (-90));
        java.lang.String str67 = produto60.getCodigo();
        estoque0.inserirProduto(produto60, (-101));
        produto60.setPreco((double) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 97 + "'", int56 == 97);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
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
        java.lang.String str41 = produto36.getCodigo();
        produto36.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 10.0f);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setPreco((double) (-103));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (-200.0d));
        java.lang.String str4 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
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
        boolean boolean70 = estoque0.produtoExiste("");
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
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
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
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto36.setNome("hi!");
        produto36.setPreco((double) 10);
        java.lang.String str41 = produto36.getNome();
        double double42 = produto36.getPreco();
        java.lang.String str43 = produto36.getNome();
        produto36.setNome("");
        produto36.setNome("hi!");
        java.lang.String str48 = produto36.getCodigo();
        produto36.setPreco((double) (short) 100);
        estoque0.inserirProduto(produto36, 1);
        br.ufrn.imd.Produto produto56 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto56.setNome("hi!");
        produto56.setNome("");
        java.lang.String str61 = produto56.getCodigo();
        double double62 = produto56.getPreco();
        produto56.setNome("");
        double double65 = produto56.getPreco();
        estoque0.inserirProduto(produto56, (int) '#');
        br.ufrn.imd.Produto produto71 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto71.setNome("");
        java.lang.String str74 = produto71.getNome();
        estoque0.inserirProduto(produto71, 54);
        java.lang.String str77 = produto71.getNome();
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
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
        estoque0.removerProduto("hi!", (-91));
        br.ufrn.imd.Produto produto74 = new br.ufrn.imd.Produto("", "", (double) (-63));
        estoque0.inserirProduto(produto74, 68);
        int int78 = estoque0.consultarQuantidade("hi!");
        boolean boolean80 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (-116));
        estoque0.removerProduto("hi!", (-116));
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
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 33 + "'", int78 == 33);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setNome("hi!");
        produto3.setCodigo("hi!");
        produto3.setCodigo("hi!");
        produto3.setCodigo("hi!");
        produto3.setNome("hi!");
        java.lang.Class<?> wildcardClass22 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
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
        produto75.setCodigo("hi!");
        double double89 = produto75.getPreco();
        java.lang.String str90 = produto75.getCodigo();
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
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 10.0d + "'", double89 == 10.0d);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
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
        estoque0.removerProduto("", (-2));
        int int42 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("", "hi!", (double) 19);
        estoque0.inserirProduto(produto46, (-200));
        boolean boolean50 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 99 + "'", int42 == 99);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
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
        java.lang.String str51 = produto50.getCodigo();
        produto50.setCodigo("hi!");
        produto50.setNome("hi!");
        double double56 = produto50.getPreco();
        java.lang.String str57 = produto50.getNome();
        estoque0.inserirProduto(produto50, 114);
        java.lang.String str60 = produto50.getNome();
        java.lang.String str61 = produto50.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
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
        boolean boolean37 = estoque0.produtoExiste("");
        int int39 = estoque0.consultarQuantidade("");
        boolean boolean41 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (short) 0);
        int int22 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto26 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto26.setCodigo("hi!");
        java.lang.String str29 = produto26.getCodigo();
        estoque0.inserirProduto(produto26, 62);
        int int33 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
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
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        produto28.setNome("hi!");
        java.lang.String str35 = produto28.getCodigo();
        produto28.setPreco((double) (-1L));
        double double38 = produto28.getPreco();
        produto28.setNome("hi!");
        estoque0.inserirProduto(produto28, (-98));
        produto28.setCodigo("hi!");
        produto28.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
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
        int int77 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 7);
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
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 10 + "'", int77 == 10);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setCodigo("");
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setNome("hi!");
        java.lang.String str13 = produto3.getCodigo();
        java.lang.String str14 = produto3.getNome();
        produto3.setCodigo("hi!");
        java.lang.String str17 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", 196.0d);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setCodigo("");
        double double14 = produto3.getPreco();
        java.lang.String str15 = produto3.getCodigo();
        java.lang.String str16 = produto3.getNome();
        java.lang.String str17 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
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
        int int87 = estoque0.consultarQuantidade("hi!");
        int int89 = estoque0.consultarQuantidade("hi!");
        int int91 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-2) + "'", int87 == (-2));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-2) + "'", int89 == (-2));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-2) + "'", int91 == (-2));
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
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
        produto58.setNome("");
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
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        double double10 = produto3.getPreco();
        produto3.setCodigo("hi!");
        java.lang.String str13 = produto3.getNome();
        java.lang.String str14 = produto3.getNome();
        produto3.setPreco((double) ' ');
        produto3.setPreco((double) (-111));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        java.lang.String str6 = produto3.getCodigo();
        produto3.setPreco((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
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
        produto15.setPreco((double) '#');
        java.lang.String str26 = produto15.getNome();
        produto15.setNome("");
        double double29 = produto15.getPreco();
        java.lang.Class<?> wildcardClass30 = produto15.getClass();
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 35.0d + "'", double29 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("");
        double double7 = produto3.getPreco();
        double double8 = produto3.getPreco();
        produto3.setCodigo("");
        produto3.setNome("");
        double double13 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
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
        boolean boolean44 = estoque0.produtoExiste("");
        int int46 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
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
        boolean boolean59 = estoque0.produtoExiste("");
        int int61 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("", "", (double) 100L);
        produto65.setCodigo("hi!");
        estoque0.inserirProduto(produto65, 51);
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-56));
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
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
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
        java.lang.String str25 = produto22.getCodigo();
        java.lang.String str26 = produto22.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-28));
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
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
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
        boolean boolean68 = estoque0.produtoExiste("");
        int int70 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 36 + "'", int66 == 36);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
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
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto44.setNome("hi!");
        produto44.setNome("");
        java.lang.String str49 = produto44.getCodigo();
        double double50 = produto44.getPreco();
        produto44.setNome("");
        double double53 = produto44.getPreco();
        estoque0.inserirProduto(produto44, 16);
        produto44.setPreco((double) (-201));
        double double58 = produto44.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-201.0d) + "'", double58 == (-201.0d));
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
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
        produto50.setPreco((double) 62);
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
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
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
        boolean boolean32 = estoque0.produtoExiste("");
        boolean boolean34 = estoque0.produtoExiste("hi!");
        boolean boolean36 = estoque0.produtoExiste("");
        boolean boolean38 = estoque0.produtoExiste("");
        int int40 = estoque0.consultarQuantidade("");
        int int42 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto3.setNome("");
        java.lang.String str6 = produto3.getNome();
        produto3.setPreco(1.0d);
        produto3.setPreco(0.0d);
        produto3.setPreco(0.0d);
        java.lang.Class<?> wildcardClass13 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        double double14 = produto3.getPreco();
        produto3.setPreco((double) 10.0f);
        produto3.setNome("");
        double double19 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str4 = produto3.getNome();
        produto3.setPreco((double) (-68));
        double double7 = produto3.getPreco();
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-68.0d) + "'", double7 == (-68.0d));
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        double double6 = produto3.getPreco();
        produto3.setCodigo("");
        java.lang.String str9 = produto3.getCodigo();
        produto3.setNome("hi!");
        java.lang.String str12 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 35.0d);
        produto3.setCodigo("");
        produto3.setCodigo("hi!");
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
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
        br.ufrn.imd.Estoque estoque57 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto61 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto61.setCodigo("hi!");
        estoque57.inserirProduto(produto61, (int) (byte) 0);
        estoque57.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto72 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto72.setNome("hi!");
        produto72.setPreco((double) 100L);
        estoque57.inserirProduto(produto72, (int) (short) 10);
        produto72.setPreco(52.0d);
        double double81 = produto72.getPreco();
        estoque0.inserirProduto(produto72, (-13));
        int int85 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 0);
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
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 52.0d + "'", double81 == 52.0d);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
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
        java.lang.Class<?> wildcardClass19 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-160));
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setCodigo("");
        double double14 = produto3.getPreco();
        produto3.setPreco(0.0d);
        produto3.setNome("");
        produto3.setPreco((double) 54);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
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
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto39.setNome("hi!");
        produto39.setNome("");
        estoque23.inserirProduto(produto39, 0);
        produto39.setNome("");
        estoque0.inserirProduto(produto39, 9);
        java.lang.String str50 = produto39.getNome();
        produto39.setPreco((double) 1L);
        produto39.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
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
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "hi!", (double) (byte) 10);
        estoque0.inserirProduto(produto41, 10);
        boolean boolean45 = estoque0.produtoExiste("hi!");
        int int47 = estoque0.consultarQuantidade("hi!");
        int int49 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto53 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto53.setNome("hi!");
        produto53.setPreco((double) 10);
        java.lang.String str58 = produto53.getNome();
        double double59 = produto53.getPreco();
        java.lang.String str60 = produto53.getNome();
        produto53.setNome("");
        produto53.setPreco((double) (-3));
        java.lang.String str65 = produto53.getNome();
        produto53.setCodigo("hi!");
        estoque0.inserirProduto(produto53, (int) ' ');
        int int71 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 19 + "'", int47 == 19);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 19 + "'", int49 == 19);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 51 + "'", int71 == 51);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
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
        produto58.setNome("hi!");
        produto58.setNome("hi!");
        produto58.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
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
        boolean boolean49 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (byte) 0);
        double double4 = produto3.getPreco();
        produto3.setPreco((double) 16);
        produto3.setCodigo("");
        java.lang.String str9 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
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
        boolean boolean27 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto3.setNome("");
        produto3.setNome("hi!");
        produto3.setCodigo("");
        java.lang.String str10 = produto3.getNome();
        produto3.setNome("");
        java.lang.String str13 = produto3.getCodigo();
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
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
        boolean boolean33 = estoque0.produtoExiste("");
        boolean boolean35 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double40 = produto39.getPreco();
        java.lang.String str41 = produto39.getNome();
        produto39.setNome("hi!");
        produto39.setNome("hi!");
        estoque0.inserirProduto(produto39, 19);
        produto39.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setNome("");
        double double8 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
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
        estoque0.removerProduto("hi!", 30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 34 + "'", int77 == 34);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 'a');
        java.lang.String str12 = produto3.getNome();
        java.lang.String str13 = produto3.getNome();
        java.lang.String str14 = produto3.getCodigo();
        java.lang.String str15 = produto3.getNome();
        double double16 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
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
        produto56.setPreco((double) 97);
        double double67 = produto56.getPreco();
        java.lang.Class<?> wildcardClass68 = produto56.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 97.0d + "'", double67 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
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
        estoque0.removerProduto("hi!", 0);
        boolean boolean62 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", 116.0d);
        produto3.setNome("");
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
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
        produto12.setNome("hi!");
        java.lang.String str25 = produto12.getNome();
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
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
        boolean boolean39 = estoque0.produtoExiste("hi!");
        boolean boolean41 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double46 = produto45.getPreco();
        java.lang.String str47 = produto45.getCodigo();
        java.lang.String str48 = produto45.getNome();
        produto45.setCodigo("");
        double double51 = produto45.getPreco();
        java.lang.String str52 = produto45.getCodigo();
        produto45.setNome("hi!");
        java.lang.String str55 = produto45.getCodigo();
        produto45.setPreco((double) (byte) -1);
        produto45.setNome("");
        produto45.setNome("");
        estoque0.inserirProduto(produto45, 0);
        java.lang.String str64 = produto45.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 100.0d + "'", double51 == 100.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
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
        int int44 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", (-3));
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 16 + "'", int42 == 16);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 16 + "'", int44 == 16);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-1L));
        produto3.setNome("");
        double double6 = produto3.getPreco();
        java.lang.String str7 = produto3.getCodigo();
        produto3.setPreco(35.0d);
        double double10 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
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
        br.ufrn.imd.Estoque estoque51 = new br.ufrn.imd.Estoque();
        boolean boolean53 = estoque51.produtoExiste("");
        br.ufrn.imd.Produto produto57 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto57.setNome("hi!");
        produto57.setPreco((double) 10);
        estoque51.inserirProduto(produto57, (int) (byte) -1);
        int int65 = estoque51.consultarQuantidade("");
        estoque51.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto72 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto72.setPreco((double) '#');
        produto72.setNome("");
        estoque51.inserirProduto(produto72, (int) (byte) 1);
        produto72.setNome("hi!");
        produto72.setNome("");
        estoque0.inserirProduto(produto72, (-132));
        java.lang.String str85 = produto72.getCodigo();
        java.lang.String str86 = produto72.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (short) 0);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getCodigo();
        double double8 = produto3.getPreco();
        java.lang.String str9 = produto3.getCodigo();
        java.lang.String str10 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
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
        produto28.setNome("hi!");
        java.lang.String str48 = produto28.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
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
        boolean boolean39 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
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
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto45.setNome("hi!");
        produto45.setPreco((double) 10);
        produto45.setNome("hi!");
        produto45.setPreco((double) 'a');
        produto45.setNome("");
        produto45.setNome("");
        double double58 = produto45.getPreco();
        produto45.setNome("hi!");
        estoque0.inserirProduto(produto45, (int) ' ');
        br.ufrn.imd.Estoque estoque63 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto67 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto67.setCodigo("hi!");
        estoque63.inserirProduto(produto67, (int) (byte) 0);
        br.ufrn.imd.Produto produto75 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto75.setNome("hi!");
        produto75.setNome("");
        produto75.setPreco(1.0d);
        estoque63.inserirProduto(produto75, 100);
        produto75.setPreco((double) 0);
        produto75.setNome("");
        produto75.setNome("");
        estoque0.inserirProduto(produto75, 34);
        br.ufrn.imd.Produto produto95 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 100);
        estoque0.inserirProduto(produto95, (-116));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 97.0d + "'", double58 == 97.0d);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
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
        java.lang.String str40 = produto36.getCodigo();
        produto36.setCodigo("");
        java.lang.String str43 = produto36.getCodigo();
        produto36.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
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
        br.ufrn.imd.Produto produto51 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto51.setPreco((double) '#');
        produto51.setPreco((double) 10);
        produto51.setNome("");
        java.lang.String str58 = produto51.getCodigo();
        produto51.setPreco(0.0d);
        double double61 = produto51.getPreco();
        java.lang.String str62 = produto51.getNome();
        java.lang.String str63 = produto51.getCodigo();
        estoque0.inserirProduto(produto51, 33);
        java.lang.String str66 = produto51.getNome();
        double double67 = produto51.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
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
        produto12.setNome("");
        produto12.setPreco(0.0d);
        produto12.setCodigo("");
        produto12.setNome("hi!");
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
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
        java.lang.String str41 = produto21.getNome();
        java.lang.String str42 = produto21.getCodigo();
        produto21.setPreco((-100.0d));
        produto21.setPreco((double) 86);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        double double9 = produto3.getPreco();
        produto3.setPreco((double) 1.0f);
        produto3.setPreco((double) '4');
        produto3.setCodigo("");
        produto3.setCodigo("hi!");
        produto3.setPreco((-4.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
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
        produto69.setPreco((double) 10);
        java.lang.String str74 = produto69.getNome();
        double double75 = produto69.getPreco();
        java.lang.String str76 = produto69.getCodigo();
        java.lang.String str77 = produto69.getNome();
        produto69.setCodigo("");
        double double80 = produto69.getPreco();
        java.lang.String str81 = produto69.getNome();
        java.lang.String str82 = produto69.getNome();
        estoque0.inserirProduto(produto69, 84);
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
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 10.0d + "'", double75 == 10.0d);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 10.0d + "'", double80 == 10.0d);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
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
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
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
        produto3.setCodigo("hi!");
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
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
        java.lang.String str53 = produto43.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 18);
        produto3.setNome("hi!");
        java.lang.Class<?> wildcardClass6 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        java.lang.String str12 = produto3.getCodigo();
        java.lang.String str13 = produto3.getCodigo();
        produto3.setNome("");
        produto3.setPreco((double) 'a');
        java.lang.String str18 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
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
        double double23 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
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
        java.lang.String str20 = produto3.getCodigo();
        produto3.setNome("hi!");
        double double23 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setCodigo("");
        java.lang.String str9 = produto3.getCodigo();
        double double10 = produto3.getPreco();
        produto3.setPreco((double) 1);
        double double13 = produto3.getPreco();
        produto3.setPreco((double) (-160));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
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
        java.lang.String str46 = produto23.getCodigo();
        produto23.setPreco((double) 7);
        produto23.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
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
        produto22.setPreco((double) (-1L));
        java.lang.String str33 = produto22.getCodigo();
        java.lang.String str34 = produto22.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
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
        boolean boolean51 = estoque0.produtoExiste("hi!");
        boolean boolean53 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        int int14 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (int) (byte) 0);
        boolean boolean19 = estoque0.produtoExiste("hi!");
        int int21 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (-90.0d));
        double double4 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-90.0d) + "'", double4 == (-90.0d));
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", 34.0d);
        produto3.setNome("");
        produto3.setCodigo("hi!");
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
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
        int int66 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", (-102));
        estoque0.removerProduto("hi!", (-201));
        br.ufrn.imd.Produto produto76 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str77 = produto76.getCodigo();
        produto76.setCodigo("hi!");
        java.lang.String str80 = produto76.getCodigo();
        double double81 = produto76.getPreco();
        java.lang.String str82 = produto76.getCodigo();
        produto76.setCodigo("hi!");
        estoque0.inserirProduto(produto76, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-2) + "'", int61 == (-2));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-10) + "'", int66 == (-10));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
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
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto33.setNome("hi!");
        produto33.setPreco((double) 10);
        java.lang.String str38 = produto33.getCodigo();
        double double39 = produto33.getPreco();
        double double40 = produto33.getPreco();
        produto33.setCodigo("");
        produto33.setPreco(18.0d);
        produto33.setCodigo("hi!");
        double double47 = produto33.getPreco();
        java.lang.String str48 = produto33.getNome();
        estoque0.inserirProduto(produto33, 97);
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (-1.0d));
        java.lang.String str55 = produto54.getNome();
        estoque0.inserirProduto(produto54, (-76));
        java.lang.Class<?> wildcardClass58 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 18.0d + "'", double47 == 18.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
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
        int int44 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto48 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double49 = produto48.getPreco();
        java.lang.String str50 = produto48.getCodigo();
        java.lang.String str51 = produto48.getNome();
        produto48.setCodigo("");
        double double54 = produto48.getPreco();
        java.lang.String str55 = produto48.getCodigo();
        produto48.setNome("hi!");
        java.lang.String str58 = produto48.getNome();
        java.lang.String str59 = produto48.getNome();
        estoque0.inserirProduto(produto48, 54);
        produto48.setPreco(166.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 16 + "'", int42 == 16);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 16 + "'", int44 == 16);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 100.0d + "'", double54 == 100.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
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
        int int47 = estoque0.consultarQuantidade("");
        int int49 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque50 = new br.ufrn.imd.Estoque();
        boolean boolean52 = estoque50.produtoExiste("");
        br.ufrn.imd.Produto produto56 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto56.setNome("hi!");
        produto56.setPreco((double) 10);
        estoque50.inserirProduto(produto56, (int) (byte) -1);
        br.ufrn.imd.Produto produto66 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto66.setNome("hi!");
        produto66.setNome("");
        estoque50.inserirProduto(produto66, 0);
        int int74 = estoque50.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto78 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto78.setNome("hi!");
        produto78.setPreco((double) 10);
        java.lang.String str83 = produto78.getNome();
        double double84 = produto78.getPreco();
        java.lang.String str85 = produto78.getCodigo();
        estoque50.inserirProduto(produto78, (int) '#');
        br.ufrn.imd.Produto produto91 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque50.inserirProduto(produto91, (-1));
        java.lang.String str94 = produto91.getCodigo();
        java.lang.String str95 = produto91.getNome();
        estoque0.inserirProduto(produto91, (int) (short) 1);
        boolean boolean99 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 10.0d + "'", double84 == 10.0d);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "hi!" + "'", str95, "hi!");
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
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
        java.lang.String str47 = produto41.getNome();
        java.lang.String str48 = produto41.getNome();
        produto41.setNome("");
        produto41.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
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
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto36.setNome("hi!");
        produto36.setPreco((double) 10);
        java.lang.String str41 = produto36.getNome();
        double double42 = produto36.getPreco();
        java.lang.String str43 = produto36.getNome();
        produto36.setNome("");
        produto36.setNome("hi!");
        java.lang.String str48 = produto36.getCodigo();
        produto36.setPreco((double) (short) 100);
        estoque0.inserirProduto(produto36, 1);
        br.ufrn.imd.Produto produto56 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto56.setNome("hi!");
        produto56.setNome("");
        java.lang.String str61 = produto56.getCodigo();
        double double62 = produto56.getPreco();
        produto56.setNome("");
        double double65 = produto56.getPreco();
        estoque0.inserirProduto(produto56, (int) '#');
        br.ufrn.imd.Produto produto71 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto71.setNome("");
        java.lang.String str74 = produto71.getNome();
        estoque0.inserirProduto(produto71, 54);
        br.ufrn.imd.Produto produto80 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-63));
        estoque0.inserirProduto(produto80, (-29));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (byte) -1);
        java.lang.String str4 = produto3.getNome();
        java.lang.String str5 = produto3.getNome();
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        java.lang.String str12 = produto3.getCodigo();
        produto3.setNome("hi!");
        java.lang.String str15 = produto3.getNome();
        produto3.setCodigo("hi!");
        produto3.setPreco((double) (-90));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto3.setNome("");
        produto3.setNome("hi!");
        produto3.setNome("");
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setPreco(1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
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
        br.ufrn.imd.Produto produto64 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto64.setNome("hi!");
        produto64.setPreco((double) 10);
        produto64.setNome("hi!");
        java.lang.String str71 = produto64.getCodigo();
        double double72 = produto64.getPreco();
        java.lang.String str73 = produto64.getCodigo();
        estoque36.inserirProduto(produto64, 10);
        boolean boolean77 = estoque36.produtoExiste("");
        br.ufrn.imd.Produto produto81 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 1);
        produto81.setNome("");
        double double84 = produto81.getPreco();
        estoque36.inserirProduto(produto81, (int) 'a');
        double double87 = produto81.getPreco();
        produto81.setCodigo("");
        estoque0.inserirProduto(produto81, 30);
        int int93 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 1.0d + "'", double84 == 1.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 1.0d + "'", double87 == 1.0d);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-80) + "'", int93 == (-80));
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (-1.0d));
        java.lang.String str4 = produto3.getCodigo();
        java.lang.String str5 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
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
        produto12.setCodigo("");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }
}


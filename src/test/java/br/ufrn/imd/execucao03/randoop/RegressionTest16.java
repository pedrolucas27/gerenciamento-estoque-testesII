package br.ufrn.imd.execucao03.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test8001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8001");
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
        produto48.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
    }

    @Test
    public void test8002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8002");
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
        boolean boolean25 = estoque0.produtoExiste("hi!");
        boolean boolean27 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test8003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8003");
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
        br.ufrn.imd.Estoque estoque53 = new br.ufrn.imd.Estoque();
        boolean boolean55 = estoque53.produtoExiste("");
        br.ufrn.imd.Produto produto59 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto59.setNome("hi!");
        produto59.setPreco((double) 10);
        estoque53.inserirProduto(produto59, (int) (byte) -1);
        boolean boolean67 = estoque53.produtoExiste("hi!");
        br.ufrn.imd.Produto produto71 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto71.setPreco((double) '#');
        produto71.setPreco((double) 10);
        java.lang.String str76 = produto71.getNome();
        produto71.setPreco(0.0d);
        estoque53.inserirProduto(produto71, (-2));
        br.ufrn.imd.Produto produto84 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto84.setPreco((double) '#');
        estoque53.inserirProduto(produto84, 100);
        produto84.setPreco((double) (-2));
        produto84.setNome("");
        java.lang.String str93 = produto84.getNome();
        produto84.setPreco((double) (-2));
        double double96 = produto84.getPreco();
        estoque0.inserirProduto(produto84, (-13));
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + (-2.0d) + "'", double96 == (-2.0d));
    }

    @Test
    public void test8004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8004");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        produto3.setCodigo("hi!");
        produto3.setCodigo("");
        java.lang.String str13 = produto3.getNome();
        java.lang.String str14 = produto3.getNome();
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test8005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8005");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 16.0d);
        double double4 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 16.0d + "'", double4 == 16.0d);
    }

    @Test
    public void test8006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8006");
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
        int int30 = estoque0.consultarQuantidade("");
        int int32 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test8007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8007");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (-1.0d));
        java.lang.String str4 = produto3.getNome();
        double double5 = produto3.getPreco();
        java.lang.String str6 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test8008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8008");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        double double6 = produto3.getPreco();
        double double7 = produto3.getPreco();
        java.lang.String str8 = produto3.getNome();
        java.lang.String str9 = produto3.getNome();
        produto3.setPreco((double) 65);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test8009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8009");
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
        boolean boolean31 = estoque0.produtoExiste("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test8010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8010");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        produto3.setCodigo("hi!");
        double double10 = produto3.getPreco();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        produto3.setPreco((double) (-69));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test8011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8011");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 'a');
        produto3.setNome("");
        double double14 = produto3.getPreco();
        produto3.setCodigo("hi!");
        double double17 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test8012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8012");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-1));
        produto3.setCodigo("hi!");
        produto3.setNome("");
        java.lang.String str8 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test8013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8013");
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
        boolean boolean36 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("hi!", "", (double) (byte) 1);
        estoque0.inserirProduto(produto40, (-97));
        estoque0.removerProduto("", (-68));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-11) + "'", int34 == (-11));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test8014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8014");
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
        estoque30.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto49.setNome("hi!");
        produto49.setPreco((double) 10);
        java.lang.String str54 = produto49.getNome();
        double double55 = produto49.getPreco();
        java.lang.String str56 = produto49.getCodigo();
        produto49.setCodigo("hi!");
        java.lang.String str59 = produto49.getCodigo();
        produto49.setNome("");
        estoque30.inserirProduto(produto49, (int) (short) 10);
        boolean boolean65 = estoque30.produtoExiste("hi!");
        int int67 = estoque30.consultarQuantidade("");
        boolean boolean69 = estoque30.produtoExiste("hi!");
        int int71 = estoque30.consultarQuantidade("hi!");
        int int73 = estoque30.consultarQuantidade("");
        br.ufrn.imd.Produto produto77 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto77.setNome("hi!");
        produto77.setPreco((double) 10);
        java.lang.String str82 = produto77.getNome();
        double double83 = produto77.getPreco();
        java.lang.String str84 = produto77.getCodigo();
        produto77.setCodigo("hi!");
        java.lang.String str87 = produto77.getNome();
        produto77.setNome("hi!");
        estoque30.inserirProduto(produto77, 0);
        estoque0.inserirProduto(produto77, (-88));
        estoque0.removerProduto("hi!", 31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 9 + "'", int71 == 9);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.0d + "'", double83 == 10.0d);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
    }

    @Test
    public void test8015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8015");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (-200));
        java.lang.String str4 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test8016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8016");
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
        double double87 = produto75.getPreco();
        double double88 = produto75.getPreco();
        java.lang.String str89 = produto75.getNome();
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
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-2.0d) + "'", double87 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-2.0d) + "'", double88 == (-2.0d));
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
    }

    @Test
    public void test8017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8017");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("");
        produto3.setPreco((double) 10);
        produto3.setCodigo("hi!");
        java.lang.String str11 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test8018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8018");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setPreco((double) (byte) 0);
        java.lang.String str9 = produto3.getNome();
        double double10 = produto3.getPreco();
        produto3.setNome("");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test8019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8019");
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
        boolean boolean44 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 86 + "'", int42 == 86);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test8020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8020");
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
        java.lang.String str28 = produto16.getNome();
        double double29 = produto16.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
    }

    @Test
    public void test8021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8021");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 30);
        java.lang.String str4 = produto3.getNome();
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test8022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8022");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-6));
    }

    @Test
    public void test8023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8023");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("");
        int int18 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 32);
        boolean boolean23 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto27 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto27.setNome("hi!");
        produto27.setNome("");
        produto27.setPreco(1.0d);
        java.lang.String str34 = produto27.getCodigo();
        double double35 = produto27.getPreco();
        java.lang.String str36 = produto27.getCodigo();
        java.lang.String str37 = produto27.getCodigo();
        java.lang.String str38 = produto27.getNome();
        produto27.setCodigo("hi!");
        java.lang.String str41 = produto27.getNome();
        estoque0.inserirProduto(produto27, (-36));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test8024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8024");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 97);
        java.lang.String str4 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test8025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8025");
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
        br.ufrn.imd.Produto produto75 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto75.setNome("hi!");
        produto75.setNome("");
        produto75.setPreco((double) 10L);
        java.lang.String str82 = produto75.getCodigo();
        java.lang.String str83 = produto75.getNome();
        estoque0.inserirProduto(produto75, 35);
        produto75.setCodigo("");
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
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
    }

    @Test
    public void test8026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8026");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (short) 0);
        produto3.setNome("hi!");
    }

    @Test
    public void test8027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8027");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 1.0f);
        java.lang.String str4 = produto3.getNome();
        double double5 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test8028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8028");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", 100.0d);
        java.lang.String str4 = produto3.getNome();
        double double5 = produto3.getPreco();
        java.lang.String str6 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test8029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8029");
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
        int int72 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("hi!", (-200));
        estoque0.removerProduto("hi!", 19);
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
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 96 + "'", int72 == 96);
    }

    @Test
    public void test8030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8030");
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
        boolean boolean44 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto48 = new br.ufrn.imd.Produto("", "", (double) (-98));
        estoque0.inserirProduto(produto48, 70);
        produto48.setPreco((-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test8031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8031");
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
        produto16.setPreco((double) (-61));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test8032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8032");
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
        boolean boolean42 = estoque0.produtoExiste("hi!");
        boolean boolean44 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test8033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8033");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco(1.0d);
        java.lang.String str8 = produto3.getNome();
        produto3.setCodigo("hi!");
        java.lang.String str11 = produto3.getCodigo();
        java.lang.Class<?> wildcardClass12 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8034");
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
        produto71.setPreco((double) (-1L));
        produto71.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
    }

    @Test
    public void test8035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8035");
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
        int int63 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto67 = new br.ufrn.imd.Produto("", "", (double) (-63));
        java.lang.String str68 = produto67.getNome();
        produto67.setPreco((double) 166);
        double double71 = produto67.getPreco();
        java.lang.String str72 = produto67.getNome();
        estoque0.inserirProduto(produto67, (-4));
        estoque0.removerProduto("hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 166.0d + "'", double71 == 166.0d);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test8036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8036");
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
        boolean boolean75 = estoque0.produtoExiste("");
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
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test8037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8037");
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
        boolean boolean32 = estoque0.produtoExiste("hi!");
        int int34 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-100) + "'", int34 == (-100));
    }

    @Test
    public void test8038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8038");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        boolean boolean4 = estoque0.produtoExiste("hi!");
        int int6 = estoque0.consultarQuantidade("");
        int int8 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test8039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8039");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto3.setNome("");
        java.lang.String str6 = produto3.getCodigo();
        java.lang.String str7 = produto3.getCodigo();
        java.lang.String str8 = produto3.getCodigo();
        produto3.setCodigo("");
        double double11 = produto3.getPreco();
        double double12 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test8040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8040");
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
        int int98 = estoque0.consultarQuantidade("");
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
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 86 + "'", int98 == 86);
    }

    @Test
    public void test8041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8041");
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
        boolean boolean22 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque23 = new br.ufrn.imd.Estoque();
        boolean boolean25 = estoque23.produtoExiste("");
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto29.setNome("hi!");
        produto29.setPreco((double) 10);
        estoque23.inserirProduto(produto29, (int) (byte) -1);
        int int37 = estoque23.consultarQuantidade("");
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto41.setNome("");
        estoque23.inserirProduto(produto41, (int) (byte) 10);
        boolean boolean47 = estoque23.produtoExiste("");
        int int49 = estoque23.consultarQuantidade("");
        estoque23.removerProduto("hi!", 10);
        br.ufrn.imd.Estoque estoque53 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto57 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto57.setCodigo("hi!");
        estoque53.inserirProduto(produto57, (int) (byte) 0);
        estoque23.inserirProduto(produto57, (int) (byte) 10);
        produto57.setCodigo("");
        produto57.setNome("");
        produto57.setCodigo("");
        java.lang.String str70 = produto57.getCodigo();
        estoque0.inserirProduto(produto57, (-32));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test8042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8042");
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
        produto24.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test8043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8043");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setCodigo("");
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setNome("hi!");
        produto3.setPreco((double) 1);
        produto3.setPreco((double) 0.0f);
        double double17 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test8044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8044");
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
        br.ufrn.imd.Produto produto27 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto27.setPreco((double) '#');
        produto27.setPreco((double) 10);
        java.lang.String str32 = produto27.getNome();
        produto27.setPreco(0.0d);
        produto27.setNome("hi!");
        produto27.setPreco((double) 1.0f);
        produto27.setNome("");
        produto27.setPreco((double) 32);
        estoque0.inserirProduto(produto27, (-108));
        java.lang.String str45 = produto27.getNome();
        double double46 = produto27.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 32.0d + "'", double46 == 32.0d);
    }

    @Test
    public void test8045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8045");
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
        boolean boolean44 = estoque0.produtoExiste("hi!");
        int int46 = estoque0.consultarQuantidade("");
        int int48 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test8046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8046");
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
        double double17 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test8047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8047");
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
        produto59.setPreco((double) (short) 10);
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
    }

    @Test
    public void test8048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8048");
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
        produto37.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
    }

    @Test
    public void test8049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8049");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto3.setPreco((double) (byte) 100);
        java.lang.String str6 = produto3.getNome();
        java.lang.String str7 = produto3.getCodigo();
        double double8 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setPreco(0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test8050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8050");
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
        java.lang.String str27 = produto12.getCodigo();
        produto12.setNome("");
        produto12.setNome("");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8051");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-182));
    }

    @Test
    public void test8052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8052");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        produto3.setNome("hi!");
        produto3.setCodigo("");
        java.lang.String str18 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test8053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8053");
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
        java.lang.String str20 = produto3.getCodigo();
        java.lang.String str21 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test8054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8054");
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
        boolean boolean76 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test8055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8055");
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
        java.lang.String str43 = produto31.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 35.0d + "'", double38 == 35.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test8056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8056");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setNome("hi!");
        produto3.setCodigo("hi!");
        produto3.setPreco(0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test8057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8057");
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
        boolean boolean32 = estoque0.produtoExiste("hi!");
        boolean boolean34 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test8058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8058");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (byte) 1);
        produto3.setPreco((double) 0L);
        java.lang.String str6 = produto3.getNome();
        double double7 = produto3.getPreco();
        produto3.setPreco((double) (-29));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test8059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8059");
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
        produto21.setPreco((double) (-89));
        produto21.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test8060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8060");
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
        boolean boolean53 = estoque0.produtoExiste("hi!");
        int int55 = estoque0.consultarQuantidade("");
        boolean boolean57 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 68 + "'", int55 == 68);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test8061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8061");
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
        estoque0.removerProduto("", 33);
        br.ufrn.imd.Produto produto45 = null;
        // The following exception was thrown during execution in test generation
        try {
            estoque0.inserirProduto(produto45, 164);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test8062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8062");
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
        java.lang.String str39 = produto21.getCodigo();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test8063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8063");
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
        estoque0.removerProduto("hi!", 35);
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("", "hi!", (double) '#');
        produto37.setCodigo("");
        estoque0.inserirProduto(produto37, 1);
        produto37.setNome("hi!");
        double double44 = produto37.getPreco();
        produto37.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 35.0d + "'", double44 == 35.0d);
    }

    @Test
    public void test8064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8064");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setPreco((double) (byte) 0);
        java.lang.String str9 = produto3.getCodigo();
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setNome("hi!");
        java.lang.String str14 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test8065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8065");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        int int6 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto10 = new br.ufrn.imd.Produto("hi!", "", (double) 9);
        estoque0.inserirProduto(produto10, (int) '#');
        int int14 = estoque0.consultarQuantidade("hi!");
        int int16 = estoque0.consultarQuantidade("");
        boolean boolean18 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("", 166);
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-1L));
        double double26 = produto25.getPreco();
        java.lang.String str27 = produto25.getCodigo();
        estoque0.inserirProduto(produto25, (-333));
        java.lang.String str30 = produto25.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test8066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8066");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 0.0f);
        produto3.setPreco(97.0d);
        java.lang.String str6 = produto3.getNome();
        java.lang.String str7 = produto3.getNome();
        double double8 = produto3.getPreco();
        java.lang.String str9 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test8067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8067");
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
        int int63 = estoque0.consultarQuantidade("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-52));
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
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test8068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8068");
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
        br.ufrn.imd.Produto produto77 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto77.setNome("");
        estoque0.inserirProduto(produto77, 34);
        produto77.setCodigo("");
        double double84 = produto77.getPreco();
        java.lang.String str85 = produto77.getNome();
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 10.0d + "'", double84 == 10.0d);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
    }

    @Test
    public void test8069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8069");
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
        boolean boolean37 = estoque23.produtoExiste("");
        int int39 = estoque23.consultarQuantidade("");
        br.ufrn.imd.Produto produto43 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto43.setNome("hi!");
        java.lang.String str46 = produto43.getCodigo();
        estoque23.inserirProduto(produto43, (-1));
        int int50 = estoque23.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (short) 100);
        estoque23.inserirProduto(produto54, 10);
        produto54.setNome("");
        produto54.setCodigo("hi!");
        estoque0.inserirProduto(produto54, 1);
        br.ufrn.imd.Produto produto66 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str67 = produto66.getCodigo();
        produto66.setNome("");
        produto66.setPreco((double) 10);
        java.lang.String str72 = produto66.getCodigo();
        produto66.setCodigo("");
        produto66.setCodigo("");
        estoque0.inserirProduto(produto66, (-102));
        java.lang.String str79 = produto66.getCodigo();
        java.lang.Class<?> wildcardClass80 = produto66.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-2) + "'", int50 == (-2));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test8070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8070");
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
        int int26 = estoque0.consultarQuantidade("");
        boolean boolean28 = estoque0.produtoExiste("");
        boolean boolean30 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto34 = new br.ufrn.imd.Produto("", "hi!", (double) (short) -1);
        java.lang.String str35 = produto34.getCodigo();
        produto34.setNome("hi!");
        java.lang.String str38 = produto34.getNome();
        produto34.setPreco((double) 99);
        estoque0.inserirProduto(produto34, (-333));
        estoque0.removerProduto("hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test8071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8071");
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
        java.lang.String str70 = produto54.getNome();
        produto54.setPreco((double) 196);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test8072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8072");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 99.0d);
        java.lang.Class<?> wildcardClass4 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8073");
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
        estoque0.removerProduto("hi!", (int) (short) 0);
        br.ufrn.imd.Estoque estoque33 = new br.ufrn.imd.Estoque();
        boolean boolean35 = estoque33.produtoExiste("");
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto39.setNome("hi!");
        produto39.setPreco((double) 10);
        estoque33.inserirProduto(produto39, (int) (byte) -1);
        boolean boolean47 = estoque33.produtoExiste("hi!");
        boolean boolean49 = estoque33.produtoExiste("");
        int int51 = estoque33.consultarQuantidade("");
        br.ufrn.imd.Estoque estoque52 = new br.ufrn.imd.Estoque();
        boolean boolean54 = estoque52.produtoExiste("");
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto58.setNome("hi!");
        produto58.setPreco((double) 10);
        estoque52.inserirProduto(produto58, (int) (byte) -1);
        estoque52.removerProduto("hi!", 0);
        estoque52.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto74 = new br.ufrn.imd.Produto("", "", (double) '#');
        java.lang.String str75 = produto74.getCodigo();
        estoque52.inserirProduto(produto74, (int) 'a');
        estoque33.inserirProduto(produto74, 100);
        produto74.setNome("hi!");
        estoque0.inserirProduto(produto74, (int) (short) 0);
        java.lang.String str84 = produto74.getNome();
        java.lang.String str85 = produto74.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
    }

    @Test
    public void test8074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8074");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto3.setNome("");
        java.lang.String str6 = produto3.getCodigo();
        double double7 = produto3.getPreco();
        double double8 = produto3.getPreco();
        produto3.setPreco((double) (short) 100);
        java.lang.String str11 = produto3.getNome();
        double double12 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test8075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8075");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        produto3.setNome("hi!");
        produto3.setCodigo("");
        produto3.setPreco((double) (-102));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test8076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8076");
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
        int int84 = estoque0.consultarQuantidade("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-28));
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test8077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8077");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 31);
    }

    @Test
    public void test8078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8078");
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
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test8079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8079");
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
        boolean boolean57 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test8080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8080");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        java.lang.String str8 = produto3.getCodigo();
        produto3.setPreco(34.0d);
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test8081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8081");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setNome("hi!");
        double double14 = produto3.getPreco();
        produto3.setPreco((double) (-99));
        java.lang.Class<?> wildcardClass17 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8082");
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
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        java.lang.String str34 = produto33.getCodigo();
        double double35 = produto33.getPreco();
        java.lang.String str36 = produto33.getNome();
        produto33.setNome("hi!");
        java.lang.String str39 = produto33.getNome();
        double double40 = produto33.getPreco();
        estoque0.inserirProduto(produto33, (-53));
        java.lang.String str43 = produto33.getNome();
        java.lang.String str44 = produto33.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test8083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8083");
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
        double double31 = produto16.getPreco();
        produto16.setNome("");
        double double34 = produto16.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
    }

    @Test
    public void test8084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8084");
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
        int int46 = estoque0.consultarQuantidade("");
        int int48 = estoque0.consultarQuantidade("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 33);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-2) + "'", int42 == (-2));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-2) + "'", int44 == (-2));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test8085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8085");
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
        java.lang.String str26 = produto16.getNome();
        java.lang.String str27 = produto16.getNome();
        produto16.setCodigo("");
        produto16.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8086");
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
        produto37.setNome("hi!");
        produto37.setPreco((double) 10);
        produto37.setNome("hi!");
        produto37.setPreco((double) 'a');
        produto37.setNome("");
        produto37.setNome("");
        produto37.setPreco((double) (short) -1);
        produto37.setCodigo("");
        produto37.setCodigo("");
        double double56 = produto37.getPreco();
        java.lang.String str57 = produto37.getCodigo();
        estoque0.inserirProduto(produto37, 97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test8087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8087");
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
        int int63 = estoque0.consultarQuantidade("hi!");
        int int65 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto69 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 62);
        java.lang.String str70 = produto69.getCodigo();
        estoque0.inserirProduto(produto69, (-182));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
    }

    @Test
    public void test8088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8088");
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
        double double94 = produto75.getPreco();
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
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 100.0d + "'", double94 == 100.0d);
    }

    @Test
    public void test8089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8089");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (byte) 0);
        produto3.setNome("");
        java.lang.String str6 = produto3.getCodigo();
        produto3.setPreco(54.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test8090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8090");
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
        java.lang.String str58 = produto37.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test8091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8091");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setCodigo("hi!");
        produto3.setCodigo("");
        produto3.setCodigo("hi!");
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setPreco((-132.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test8092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8092");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 9);
        double double4 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
    }

    @Test
    public void test8093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8093");
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
        boolean boolean50 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (-20));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test8094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8094");
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
        br.ufrn.imd.Produto produto77 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double78 = produto77.getPreco();
        java.lang.String str79 = produto77.getCodigo();
        java.lang.String str80 = produto77.getNome();
        estoque30.inserirProduto(produto77, 1);
        produto77.setNome("hi!");
        java.lang.String str85 = produto77.getNome();
        java.lang.String str86 = produto77.getCodigo();
        estoque0.inserirProduto(produto77, (-3));
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 100.0d + "'", double78 == 100.0d);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
    }

    @Test
    public void test8095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8095");
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
        boolean boolean25 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (-142));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test8096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8096");
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
        int int46 = estoque0.consultarQuantidade("");
        int int48 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto52 = new br.ufrn.imd.Produto("", "hi!", (double) (-4));
        java.lang.String str53 = produto52.getNome();
        estoque0.inserirProduto(produto52, (-33));
        int int57 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-2) + "'", int42 == (-2));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-2) + "'", int44 == (-2));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-35) + "'", int57 == (-35));
    }

    @Test
    public void test8097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8097");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getCodigo();
        produto3.setPreco((double) (short) -1);
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        java.lang.String str11 = produto3.getNome();
        java.lang.String str12 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test8098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8098");
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
        double double35 = produto25.getPreco();
        double double36 = produto25.getPreco();
        produto25.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
    }

    @Test
    public void test8099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8099");
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
        java.lang.String str36 = produto19.getCodigo();
        produto19.setPreco(42.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test8100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8100");
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
        java.lang.String str34 = produto24.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test8101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8101");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (-167.0d));
    }

    @Test
    public void test8102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8102");
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
        estoque0.removerProduto("", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test8103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8103");
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
        int int27 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double32 = produto31.getPreco();
        java.lang.String str33 = produto31.getNome();
        produto31.setPreco((double) '4');
        estoque0.inserirProduto(produto31, (-11));
        produto31.setPreco(0.0d);
        produto31.setCodigo("hi!");
        produto31.setPreco((double) (-32));
        java.lang.String str44 = produto31.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-33) + "'", int25 == (-33));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test8104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8104");
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
        estoque0.removerProduto("hi!", 18);
        int int36 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto40.setCodigo("hi!");
        java.lang.String str43 = produto40.getNome();
        java.lang.String str44 = produto40.getCodigo();
        produto40.setNome("");
        double double47 = produto40.getPreco();
        estoque0.inserirProduto(produto40, (int) (short) 100);
        br.ufrn.imd.Produto produto53 = new br.ufrn.imd.Produto("", "", (double) (short) 10);
        estoque0.inserirProduto(produto53, 51);
        java.lang.String str56 = produto53.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2) + "'", int29 == (-2));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-20) + "'", int36 == (-20));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test8105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8105");
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
        java.lang.String str77 = produto56.getCodigo();
        produto56.setCodigo("hi!");
        java.lang.String str80 = produto56.getCodigo();
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
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
    }

    @Test
    public void test8106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8106");
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
        java.lang.String str34 = produto16.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test8107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8107");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        double double6 = produto3.getPreco();
        double double7 = produto3.getPreco();
        java.lang.String str8 = produto3.getNome();
        java.lang.String str9 = produto3.getNome();
        produto3.setNome("");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test8108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8108");
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
        boolean boolean32 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", (-70));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-90) + "'", int28 == (-90));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test8109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8109");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (-111.0d));
    }

    @Test
    public void test8110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8110");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (byte) 10);
        produto3.setNome("");
    }

    @Test
    public void test8111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8111");
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
        java.lang.String str42 = produto22.getCodigo();
        produto22.setPreco((double) (-91));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test8112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8112");
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
        estoque0.inserirProduto(produto75, 51);
        java.lang.String str96 = produto75.getCodigo();
        produto75.setCodigo("hi!");
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
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "hi!" + "'", str96, "hi!");
    }

    @Test
    public void test8113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8113");
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
        estoque0.removerProduto("hi!", (-89));
        int int72 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 35 + "'", int72 == 35);
    }

    @Test
    public void test8114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8114");
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
        int int77 = estoque0.consultarQuantidade("hi!");
        boolean boolean79 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-25) + "'", int77 == (-25));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test8115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8115");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        produto3.setNome("hi!");
        produto3.setNome("hi!");
        produto3.setPreco((double) (-30));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test8116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8116");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 109);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test8117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8117");
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
        br.ufrn.imd.Produto produto53 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto53.setPreco((double) '#');
        produto53.setPreco((double) 10);
        java.lang.String str58 = produto53.getNome();
        produto53.setPreco(0.0d);
        produto53.setCodigo("hi!");
        produto53.setPreco((double) 8);
        java.lang.String str65 = produto53.getNome();
        estoque0.inserirProduto(produto53, 30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
    }

    @Test
    public void test8118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8118");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        java.lang.String str12 = produto3.getCodigo();
        produto3.setNome("hi!");
        produto3.setNome("hi!");
        produto3.setNome("hi!");
        java.lang.String str19 = produto3.getCodigo();
        double double20 = produto3.getPreco();
        produto3.setPreco((double) (short) 100);
        double double23 = produto3.getPreco();
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test8119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8119");
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
        int int52 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("", (-182));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 18 + "'", int46 == 18);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test8120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8120");
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
        int int33 = estoque0.consultarQuantidade("hi!");
        boolean boolean35 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (-13));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test8121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8121");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        double double9 = produto3.getPreco();
        produto3.setPreco((double) 1.0f);
        produto3.setPreco((double) '4');
        produto3.setCodigo("");
        produto3.setCodigo("hi!");
        produto3.setPreco(10.0d);
        produto3.setNome("");
        produto3.setNome("");
        produto3.setNome("hi!");
        java.lang.Class<?> wildcardClass26 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8122");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test8123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8123");
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
        java.lang.String str53 = produto46.getCodigo();
        java.lang.String str54 = produto46.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test8124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8124");
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
        java.lang.String str73 = produto55.getCodigo();
        double double74 = produto55.getPreco();
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
    }

    @Test
    public void test8125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8125");
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
        java.lang.String str24 = produto16.getCodigo();
        produto16.setCodigo("hi!");
        java.lang.String str27 = produto16.getNome();
        produto16.setCodigo("");
        java.lang.String str30 = produto16.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test8126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8126");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        java.lang.String str8 = produto3.getNome();
        java.lang.String str9 = produto3.getNome();
        produto3.setPreco((double) 0L);
        produto3.setNome("hi!");
        java.lang.String str14 = produto3.getNome();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test8127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8127");
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
        double double35 = produto12.getPreco();
        produto12.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test8128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8128");
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
        br.ufrn.imd.Produto produto73 = new br.ufrn.imd.Produto("hi!", "", 100.0d);
        java.lang.String str74 = produto73.getCodigo();
        double double75 = produto73.getPreco();
        estoque0.inserirProduto(produto73, (-67));
        int int79 = estoque0.consultarQuantidade("");
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
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 100.0d + "'", double75 == 100.0d);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 30 + "'", int79 == 30);
    }

    @Test
    public void test8129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8129");
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
        int int48 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto52 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str53 = produto52.getCodigo();
        produto52.setNome("");
        double double56 = produto52.getPreco();
        double double57 = produto52.getPreco();
        java.lang.String str58 = produto52.getCodigo();
        produto52.setNome("");
        estoque0.inserirProduto(produto52, (-33));
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test8130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8130");
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
        int int80 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 100.0d + "'", double62 == 100.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 96 + "'", int73 == 96);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 96 + "'", int80 == 96);
    }

    @Test
    public void test8131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8131");
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
        int int49 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("", (-160));
        boolean boolean54 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test8132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8132");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 127);
    }

    @Test
    public void test8133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8133");
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
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto49.setNome("hi!");
        produto49.setPreco((double) 10);
        produto49.setNome("hi!");
        produto49.setPreco((double) 'a');
        produto49.setNome("");
        produto49.setNome("");
        produto49.setPreco(0.0d);
        java.lang.String str64 = produto49.getCodigo();
        estoque0.inserirProduto(produto49, (-5));
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
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
    }

    @Test
    public void test8134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8134");
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
        boolean boolean41 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test8135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8135");
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
        java.lang.Class<?> wildcardClass29 = produto18.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8136");
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
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double29 = produto28.getPreco();
        java.lang.String str30 = produto28.getCodigo();
        java.lang.String str31 = produto28.getNome();
        java.lang.String str32 = produto28.getCodigo();
        produto28.setNome("");
        produto28.setCodigo("hi!");
        estoque0.inserirProduto(produto28, (int) (byte) 0);
        java.lang.String str39 = produto28.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test8137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8137");
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
        produto18.setPreco(10.0d);
        produto18.setCodigo("");
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
    public void test8138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8138");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 1.0d);
        produto3.setCodigo("");
        double double6 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test8139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8139");
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
        estoque0.removerProduto("hi!", (-101));
        br.ufrn.imd.Produto produto38 = new br.ufrn.imd.Produto("", "hi!", (double) 9);
        estoque0.inserirProduto(produto38, (-32));
        boolean boolean42 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test8140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8140");
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
        java.lang.String str18 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test8141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8141");
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
        estoque0.removerProduto("hi!", 84);
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
    }

    @Test
    public void test8142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8142");
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
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double30 = produto29.getPreco();
        estoque0.inserirProduto(produto29, 10);
        produto29.setCodigo("hi!");
        java.lang.String str35 = produto29.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test8143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8143");
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
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test8144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8144");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (-63.0d));
        java.lang.String str4 = produto3.getNome();
        produto3.setCodigo("hi!");
        produto3.setPreco((double) (-11));
        produto3.setPreco((double) (-101));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test8145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8145");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 'a');
        java.lang.String str12 = produto3.getNome();
        java.lang.String str13 = produto3.getNome();
        java.lang.String str14 = produto3.getNome();
        java.lang.String str15 = produto3.getCodigo();
        java.lang.String str16 = produto3.getNome();
        double double17 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test8146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8146");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
    }

    @Test
    public void test8147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8147");
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
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("hi!", "", (double) (-98));
        estoque0.inserirProduto(produto49, 97);
        produto49.setNome("");
        produto49.setPreco((double) 96);
        java.lang.String str56 = produto49.getNome();
        produto49.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test8148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8148");
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
        estoque0.removerProduto("hi!", (-102));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test8149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8149");
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
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto49.setNome("");
        produto49.setNome("hi!");
        produto49.setNome("");
        java.lang.String str56 = produto49.getCodigo();
        produto49.setCodigo("");
        estoque0.inserirProduto(produto49, (int) '#');
        estoque0.removerProduto("", (-78));
        br.ufrn.imd.Produto produto67 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto67.setNome("");
        java.lang.String str70 = produto67.getCodigo();
        double double71 = produto67.getPreco();
        produto67.setPreco((-63.0d));
        produto67.setPreco((double) (-3));
        produto67.setCodigo("hi!");
        estoque0.inserirProduto(produto67, (-146));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
    }

    @Test
    public void test8150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8150");
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
        int int56 = estoque0.consultarQuantidade("hi!");
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 25 + "'", int56 == 25);
    }

    @Test
    public void test8151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8151");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco((double) 'a');
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setCodigo("hi!");
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test8152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8152");
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
        br.ufrn.imd.Produto produto64 = new br.ufrn.imd.Produto("", "", (double) 30);
        estoque0.inserirProduto(produto64, 100);
        br.ufrn.imd.Produto produto70 = new br.ufrn.imd.Produto("", "", (double) (byte) 0);
        produto70.setNome("");
        produto70.setCodigo("");
        estoque0.inserirProduto(produto70, 86);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
    }

    @Test
    public void test8153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8153");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco((double) 10L);
        double double10 = produto3.getPreco();
        produto3.setNome("");
        double double13 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test8154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8154");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-2));
        java.lang.String str4 = produto3.getCodigo();
        double double5 = produto3.getPreco();
        produto3.setCodigo("hi!");
        java.lang.String str8 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-2.0d) + "'", double5 == (-2.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test8155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8155");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        int int6 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto10 = new br.ufrn.imd.Produto("hi!", "", (double) 9);
        estoque0.inserirProduto(produto10, (int) '#');
        boolean boolean14 = estoque0.produtoExiste("");
        boolean boolean16 = estoque0.produtoExiste("");
        boolean boolean18 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto22.setNome("hi!");
        produto22.setPreco((double) 10);
        java.lang.String str27 = produto22.getNome();
        produto22.setCodigo("hi!");
        produto22.setPreco((double) (short) -1);
        produto22.setCodigo("hi!");
        estoque0.inserirProduto(produto22, (-200));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test8156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8156");
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
        estoque0.removerProduto("hi!", (int) (byte) -1);
        estoque0.removerProduto("hi!", (int) (byte) 0);
        int int49 = estoque0.consultarQuantidade("hi!");
        int int51 = estoque0.consultarQuantidade("");
        boolean boolean53 = estoque0.produtoExiste("hi!");
        int int55 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 9 + "'", int49 == 9);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test8157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8157");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        java.lang.String str12 = produto3.getCodigo();
        java.lang.String str13 = produto3.getCodigo();
        produto3.setPreco((double) 33);
        java.lang.String str16 = produto3.getCodigo();
        double double17 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 33.0d + "'", double17 == 33.0d);
    }

    @Test
    public void test8158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8158");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (-200.0d));
        java.lang.String str4 = produto3.getCodigo();
        java.lang.Class<?> wildcardClass5 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8159");
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
        boolean boolean99 = estoque0.produtoExiste("");
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
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test8160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8160");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        produto3.setCodigo("hi!");
        produto3.setPreco((double) (short) -1);
        java.lang.String str13 = produto3.getNome();
        java.lang.Class<?> wildcardClass14 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8161");
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
        produto40.setPreco((double) 42);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test8162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8162");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto15 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto15.setNome("hi!");
        produto15.setPreco((double) 100L);
        estoque0.inserirProduto(produto15, (int) (short) 10);
        double double22 = produto15.getPreco();
        double double23 = produto15.getPreco();
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test8163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8163");
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
        int int47 = estoque0.consultarQuantidade("hi!");
        java.lang.Class<?> wildcardClass48 = estoque0.getClass();
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-5) + "'", int47 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test8164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8164");
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
        java.lang.String str75 = produto56.getCodigo();
        produto56.setNome("");
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
    public void test8165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8165");
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
        produto21.setNome("");
        produto21.setPreco((double) 116);
        produto21.setPreco((double) 18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test8166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8166");
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
        produto70.setCodigo("hi!");
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
    public void test8167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8167");
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
        boolean boolean77 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test8168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8168");
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
        estoque0.removerProduto("hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 36 + "'", int68 == 36);
    }

    @Test
    public void test8169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8169");
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
        int int24 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-100) + "'", int17 == (-100));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test8170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8170");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 0.0f);
        double double4 = produto3.getPreco();
        double double5 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test8171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8171");
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
        double double76 = produto65.getPreco();
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
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 100.0d + "'", double76 == 100.0d);
    }

    @Test
    public void test8172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8172");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        double double6 = produto3.getPreco();
        double double7 = produto3.getPreco();
        java.lang.String str8 = produto3.getNome();
        produto3.setCodigo("");
        produto3.setPreco((double) (-2));
        produto3.setPreco((double) (-1L));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test8173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8173");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (short) 10);
        produto3.setPreco((double) (-102));
        java.lang.String str6 = produto3.getCodigo();
        java.lang.Class<?> wildcardClass7 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test8174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8174");
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
        int int43 = estoque0.consultarQuantidade("");
        int int45 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test8175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8175");
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
        produto16.setPreco(36.0d);
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
    public void test8176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8176");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 33);
        java.lang.String str4 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test8177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8177");
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
        java.lang.String str25 = produto15.getCodigo();
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test8178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8178");
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
        produto3.setCodigo("hi!");
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test8179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8179");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        produto3.setNome("");
        produto3.setPreco((double) (byte) 100);
        produto3.setNome("");
        produto3.setPreco((double) 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test8180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8180");
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
        estoque0.removerProduto("", 196);
        estoque0.removerProduto("hi!", (int) '4');
        estoque0.removerProduto("hi!", 79);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
    }

    @Test
    public void test8181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8181");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        produto3.setNome("hi!");
        double double9 = produto3.getPreco();
        produto3.setCodigo("hi!");
        double double12 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test8182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8182");
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
        produto22.setNome("");
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
    public void test8183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8183");
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
        java.lang.String str42 = produto28.getNome();
        java.lang.String str43 = produto28.getCodigo();
        java.lang.String str44 = produto28.getNome();
        produto28.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test8184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8184");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        java.lang.String str9 = produto3.getNome();
        produto3.setNome("");
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test8185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8185");
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
        java.lang.String str53 = produto46.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test8186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8186");
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
        int int33 = estoque0.consultarQuantidade("hi!");
        int int35 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-65) + "'", int33 == (-65));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-65) + "'", int35 == (-65));
    }

    @Test
    public void test8187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8187");
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
        estoque0.removerProduto("hi!", (int) (byte) 10);
        estoque0.removerProduto("hi!", (-116));
        estoque0.removerProduto("hi!", 99);
        boolean boolean72 = estoque0.produtoExiste("");
        int int74 = estoque0.consultarQuantidade("");
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
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test8188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8188");
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
        java.lang.Class<?> wildcardClass56 = produto44.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test8189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8189");
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
        int int26 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque27 = new br.ufrn.imd.Estoque();
        boolean boolean29 = estoque27.produtoExiste("");
        br.ufrn.imd.Produto produto33 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto33.setNome("hi!");
        produto33.setPreco((double) 10);
        estoque27.inserirProduto(produto33, (int) (byte) -1);
        estoque27.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto46.setNome("hi!");
        produto46.setPreco((double) 10);
        java.lang.String str51 = produto46.getNome();
        double double52 = produto46.getPreco();
        java.lang.String str53 = produto46.getCodigo();
        produto46.setCodigo("hi!");
        java.lang.String str56 = produto46.getCodigo();
        produto46.setNome("");
        estoque27.inserirProduto(produto46, (int) (short) 10);
        produto46.setNome("hi!");
        java.lang.String str63 = produto46.getNome();
        produto46.setNome("hi!");
        estoque0.inserirProduto(produto46, (-12));
        estoque0.removerProduto("hi!", (-160));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-90) + "'", int26 == (-90));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
    }

    @Test
    public void test8190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8190");
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
        int int39 = estoque0.consultarQuantidade("");
        int int41 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-108));
        produto45.setCodigo("hi!");
        estoque0.inserirProduto(produto45, (int) (byte) 10);
        java.lang.Class<?> wildcardClass50 = produto45.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test8191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8191");
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
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "hi!", (double) (-1.0f));
        produto45.setCodigo("");
        estoque0.inserirProduto(produto45, (int) '4');
        java.lang.String str50 = produto45.getCodigo();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test8192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8192");
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
        br.ufrn.imd.Produto produto77 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto77.setNome("");
        estoque0.inserirProduto(produto77, 34);
        produto77.setPreco((double) 99);
        java.lang.String str84 = produto77.getNome();
        double double85 = produto77.getPreco();
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 99.0d + "'", double85 == 99.0d);
    }

    @Test
    public void test8193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8193");
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
        boolean boolean32 = estoque0.produtoExiste("");
        boolean boolean34 = estoque0.produtoExiste("hi!");
        boolean boolean36 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-90) + "'", int28 == (-90));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test8194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8194");
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
        java.lang.String str64 = produto59.getCodigo();
        double double65 = produto59.getPreco();
        produto59.setPreco((double) 1.0f);
        estoque36.inserirProduto(produto59, (int) (short) 0);
        java.lang.String str70 = produto59.getCodigo();
        produto59.setNome("hi!");
        java.lang.String str73 = produto59.getNome();
        produto59.setCodigo("hi!");
        produto59.setCodigo("hi!");
        estoque0.inserirProduto(produto59, (-200));
        produto59.setNome("hi!");
        produto59.setPreco((-63.0d));
        double double84 = produto59.getPreco();
        java.lang.String str85 = produto59.getCodigo();
        produto59.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-2) + "'", int55 == (-2));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-63.0d) + "'", double84 == (-63.0d));
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
    }

    @Test
    public void test8195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8195");
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
        int int75 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 110 + "'", int75 == 110);
    }

    @Test
    public void test8196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8196");
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
        int int31 = estoque0.consultarQuantidade("hi!");
        int int33 = estoque0.consultarQuantidade("hi!");
        int int35 = estoque0.consultarQuantidade("hi!");
        boolean boolean37 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test8197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8197");
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
        produto52.setCodigo("hi!");
        java.lang.String str58 = produto52.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test8198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8198");
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
        br.ufrn.imd.Produto produto84 = new br.ufrn.imd.Produto("hi!", "", 109.0d);
        estoque0.inserirProduto(produto84, 86);
        java.lang.String str87 = produto84.getNome();
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
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
    }

    @Test
    public void test8199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8199");
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
        estoque0.removerProduto("hi!", (-108));
        int int27 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test8200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8200");
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
        produto33.setCodigo("hi!");
        java.lang.Class<?> wildcardClass43 = produto33.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test8201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8201");
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
        br.ufrn.imd.Produto produto35 = new br.ufrn.imd.Produto("", "", (double) 0L);
        java.lang.String str36 = produto35.getNome();
        java.lang.String str37 = produto35.getCodigo();
        produto35.setPreco(0.0d);
        produto35.setNome("");
        estoque0.inserirProduto(produto35, 16);
        java.lang.Class<?> wildcardClass44 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test8202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8202");
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
        estoque0.removerProduto("", (-35));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test8203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8203");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (byte) 10);
        produto3.setPreco((double) (-23));
    }

    @Test
    public void test8204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8204");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (-63.0d));
        produto3.setPreco((double) 35);
        produto3.setPreco((double) (-102));
        java.lang.Class<?> wildcardClass8 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test8205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8205");
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
        boolean boolean23 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto27 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double28 = produto27.getPreco();
        java.lang.String str29 = produto27.getCodigo();
        java.lang.String str30 = produto27.getNome();
        produto27.setNome("hi!");
        produto27.setCodigo("hi!");
        java.lang.String str35 = produto27.getCodigo();
        estoque0.inserirProduto(produto27, (-33));
        produto27.setCodigo("");
        produto27.setPreco(96.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test8206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8206");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        estoque0.removerProduto("hi!", (int) (short) 100);
        int int16 = estoque0.consultarQuantidade("hi!");
        int int18 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque19 = new br.ufrn.imd.Estoque();
        boolean boolean21 = estoque19.produtoExiste("");
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto25.setNome("hi!");
        produto25.setPreco((double) 10);
        estoque19.inserirProduto(produto25, (int) (byte) -1);
        int int33 = estoque19.consultarQuantidade("");
        estoque19.removerProduto("hi!", 1);
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto40.setPreco((double) '#');
        produto40.setNome("");
        estoque19.inserirProduto(produto40, (int) (byte) 1);
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto50.setNome("hi!");
        produto50.setPreco((double) 10);
        produto50.setNome("hi!");
        java.lang.String str57 = produto50.getCodigo();
        produto50.setPreco((double) (-1L));
        estoque19.inserirProduto(produto50, 8);
        estoque0.inserirProduto(produto50, 30);
        int int65 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-200) + "'", int16 == (-200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-200) + "'", int18 == (-200));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test8207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8207");
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
        br.ufrn.imd.Produto produto42 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto42.setNome("hi!");
        produto42.setPreco((double) 10);
        java.lang.String str47 = produto42.getNome();
        double double48 = produto42.getPreco();
        java.lang.String str49 = produto42.getCodigo();
        produto42.setCodigo("hi!");
        java.lang.String str52 = produto42.getCodigo();
        produto42.setNome("");
        estoque0.inserirProduto(produto42, (-98));
        double double57 = produto42.getPreco();
        produto42.setNome("");
        produto42.setPreco(96.0d);
        produto42.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
    }

    @Test
    public void test8208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8208");
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
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double48 = produto47.getPreco();
        produto47.setNome("hi!");
        produto47.setPreco((double) (byte) 0);
        java.lang.String str53 = produto47.getCodigo();
        estoque0.inserirProduto(produto47, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
    }

    @Test
    public void test8209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8209");
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
        java.lang.String str33 = produto27.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test8210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8210");
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
        estoque0.removerProduto("hi!", (-63));
        estoque0.removerProduto("hi!", (int) (byte) 0);
        estoque0.removerProduto("", 9);
        estoque0.removerProduto("", (-201));
        int int39 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
    }

    @Test
    public void test8211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8211");
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
        produto36.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test8212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8212");
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
        boolean boolean73 = estoque0.produtoExiste("");
        boolean boolean75 = estoque0.produtoExiste("");
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test8213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8213");
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
        int int23 = estoque0.consultarQuantidade("");
        java.lang.Class<?> wildcardClass24 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8214");
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
        br.ufrn.imd.Produto produto53 = null;
        // The following exception was thrown during execution in test generation
        try {
            estoque0.inserirProduto(produto53, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test8215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8215");
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
        produto3.setPreco((double) (-4));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test8216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8216");
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
        br.ufrn.imd.Estoque estoque54 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto58.setCodigo("hi!");
        estoque54.inserirProduto(produto58, (int) (byte) 0);
        estoque54.removerProduto("hi!", (int) (byte) 100);
        br.ufrn.imd.Produto produto69 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto69.setNome("hi!");
        produto69.setPreco((double) 100L);
        estoque54.inserirProduto(produto69, (int) (short) 10);
        br.ufrn.imd.Produto produto79 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double80 = produto79.getPreco();
        produto79.setNome("hi!");
        java.lang.String str83 = produto79.getNome();
        produto79.setCodigo("hi!");
        estoque54.inserirProduto(produto79, (int) (short) 100);
        produto79.setPreco((double) (short) 100);
        java.lang.String str90 = produto79.getNome();
        estoque0.inserirProduto(produto79, 96);
        double double93 = produto79.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 100.0d + "'", double80 == 100.0d);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 100.0d + "'", double93 == 100.0d);
    }

    @Test
    public void test8217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8217");
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
        int int96 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 100 + "'", int96 == 100);
    }

    @Test
    public void test8218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8218");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 9);
        java.lang.String str4 = produto3.getCodigo();
        double double5 = produto3.getPreco();
        produto3.setCodigo("hi!");
        java.lang.String str8 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test8219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8219");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto3.setNome("");
        java.lang.String str6 = produto3.getCodigo();
        java.lang.String str7 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        produto3.setNome("");
        produto3.setCodigo("hi!");
        double double14 = produto3.getPreco();
        java.lang.String str15 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8220");
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
        int int46 = estoque0.consultarQuantidade("");
        int int48 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", (-101));
        br.ufrn.imd.Produto produto55 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto55.setNome("hi!");
        produto55.setPreco((double) 10);
        java.lang.String str60 = produto55.getNome();
        double double61 = produto55.getPreco();
        java.lang.String str62 = produto55.getCodigo();
        java.lang.String str63 = produto55.getNome();
        estoque0.inserirProduto(produto55, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-2) + "'", int42 == (-2));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-2) + "'", int44 == (-2));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
    }

    @Test
    public void test8221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8221");
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
        java.lang.Class<?> wildcardClass70 = produto57.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test8222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8222");
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
        double double20 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
    }

    @Test
    public void test8223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8223");
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
        br.ufrn.imd.Produto produto42 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto42.setNome("hi!");
        produto42.setNome("");
        estoque26.inserirProduto(produto42, 0);
        int int50 = estoque26.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto54.setNome("hi!");
        produto54.setPreco((double) 10);
        java.lang.String str59 = produto54.getNome();
        double double60 = produto54.getPreco();
        java.lang.String str61 = produto54.getCodigo();
        estoque26.inserirProduto(produto54, (int) '#');
        br.ufrn.imd.Produto produto67 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque26.inserirProduto(produto67, (-1));
        br.ufrn.imd.Produto produto73 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto73.setNome("hi!");
        produto73.setPreco((double) 10);
        java.lang.String str78 = produto73.getCodigo();
        java.lang.String str79 = produto73.getCodigo();
        estoque26.inserirProduto(produto73, 0);
        br.ufrn.imd.Produto produto85 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto85.setCodigo("hi!");
        produto85.setCodigo("");
        produto85.setCodigo("hi!");
        estoque26.inserirProduto(produto85, (int) '#');
        produto85.setPreco((double) (short) 0);
        estoque0.inserirProduto(produto85, 96);
        java.lang.Class<?> wildcardClass98 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test8224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8224");
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
        produto23.setNome("");
        estoque0.inserirProduto(produto23, 10);
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto37.setNome("");
        java.lang.String str40 = produto37.getCodigo();
        java.lang.String str41 = produto37.getCodigo();
        produto37.setCodigo("hi!");
        java.lang.String str44 = produto37.getNome();
        produto37.setCodigo("");
        estoque0.inserirProduto(produto37, (-72));
        br.ufrn.imd.Produto produto52 = new br.ufrn.imd.Produto("", "hi!", (double) (-72));
        estoque0.inserirProduto(produto52, 0);
        produto52.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test8225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8225");
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
        br.ufrn.imd.Produto produto51 = new br.ufrn.imd.Produto("", "", (double) 0L);
        double double52 = produto51.getPreco();
        estoque0.inserirProduto(produto51, 28);
        java.lang.String str55 = produto51.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-2) + "'", int42 == (-2));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-2) + "'", int44 == (-2));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test8226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8226");
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
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-1L));
        produto45.setCodigo("");
        produto45.setNome("hi!");
        produto45.setPreco((double) 'a');
        java.lang.String str52 = produto45.getCodigo();
        java.lang.String str53 = produto45.getCodigo();
        java.lang.String str54 = produto45.getCodigo();
        java.lang.String str55 = produto45.getNome();
        produto45.setNome("hi!");
        estoque0.inserirProduto(produto45, (-82));
        estoque0.removerProduto("hi!", (-78));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 8 + "'", int39 == 8);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
    }

    @Test
    public void test8227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8227");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 54);
        double double4 = produto3.getPreco();
        produto3.setCodigo("hi!");
        double double7 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 54.0d + "'", double4 == 54.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 54.0d + "'", double7 == 54.0d);
    }

    @Test
    public void test8228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8228");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco((double) 'a');
        produto3.setCodigo("hi!");
        double double12 = produto3.getPreco();
        produto3.setCodigo("hi!");
        produto3.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
    }

    @Test
    public void test8229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8229");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setNome("hi!");
        double double9 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str12 = produto3.getNome();
        double double13 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test8230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8230");
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
        java.lang.String str24 = produto18.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test8231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8231");
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
        br.ufrn.imd.Estoque estoque30 = new br.ufrn.imd.Estoque();
        boolean boolean32 = estoque30.produtoExiste("");
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto36.setNome("hi!");
        produto36.setPreco((double) 10);
        estoque30.inserirProduto(produto36, (int) (byte) -1);
        estoque30.removerProduto("hi!", 0);
        estoque30.removerProduto("hi!", (int) 'a');
        boolean boolean50 = estoque30.produtoExiste("");
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double55 = produto54.getPreco();
        java.lang.String str56 = produto54.getCodigo();
        java.lang.String str57 = produto54.getNome();
        produto54.setNome("hi!");
        estoque30.inserirProduto(produto54, 18);
        estoque30.removerProduto("hi!", 8);
        br.ufrn.imd.Produto produto68 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto68.setNome("");
        java.lang.String str71 = produto68.getCodigo();
        java.lang.String str72 = produto68.getCodigo();
        estoque30.inserirProduto(produto68, (int) '4');
        java.lang.String str75 = produto68.getNome();
        estoque0.inserirProduto(produto68, 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 100.0d + "'", double55 == 100.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test8232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8232");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (byte) 1);
        produto3.setPreco((-108.0d));
        java.lang.Class<?> wildcardClass6 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8233");
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
        double double22 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test8234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8234");
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
        java.lang.String str31 = produto16.getCodigo();
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
    public void test8235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8235");
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
        int int50 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
    }

    @Test
    public void test8236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8236");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 105.0d);
    }

    @Test
    public void test8237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8237");
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
        double double45 = produto31.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 35.0d + "'", double38 == 35.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 35.0d + "'", double40 == 35.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 35.0d + "'", double45 == 35.0d);
    }

    @Test
    public void test8238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8238");
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
        br.ufrn.imd.Produto produto64 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto64.setNome("hi!");
        produto64.setNome("");
        estoque48.inserirProduto(produto64, 0);
        java.lang.String str71 = produto64.getCodigo();
        double double72 = produto64.getPreco();
        produto64.setCodigo("");
        produto64.setPreco((double) 1.0f);
        java.lang.String str77 = produto64.getNome();
        java.lang.String str78 = produto64.getNome();
        produto64.setPreco((-1.0d));
        produto64.setNome("");
        produto64.setPreco((-33.0d));
        estoque0.inserirProduto(produto64, 28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test8239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8239");
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
        produto54.setPreco((double) (-78));
        java.lang.String str73 = produto54.getNome();
        java.lang.String str74 = produto54.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test8240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8240");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 127);
    }

    @Test
    public void test8241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8241");
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
        boolean boolean29 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test8242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8242");
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
        produto25.setNome("hi!");
        java.lang.String str36 = produto25.getNome();
        produto25.setCodigo("");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test8243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8243");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setCodigo("");
        java.lang.String str14 = produto3.getNome();
        double double15 = produto3.getPreco();
        double double16 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test8244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8244");
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
        int int36 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque37 = new br.ufrn.imd.Estoque();
        boolean boolean39 = estoque37.produtoExiste("");
        br.ufrn.imd.Produto produto43 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto43.setNome("hi!");
        produto43.setPreco((double) 10);
        estoque37.inserirProduto(produto43, (int) (byte) -1);
        estoque37.removerProduto("hi!", 0);
        int int54 = estoque37.consultarQuantidade("");
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", 100.0d);
        estoque37.inserirProduto(produto58, (int) (byte) 100);
        java.lang.String str61 = produto58.getCodigo();
        double double62 = produto58.getPreco();
        produto58.setPreco((-63.0d));
        estoque0.inserirProduto(produto58, (-100));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-88) + "'", int36 == (-88));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 100.0d + "'", double62 == 100.0d);
    }

    @Test
    public void test8245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8245");
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
        int int66 = estoque0.consultarQuantidade("");
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
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test8246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8246");
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
        boolean boolean67 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto71 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto71.setNome("hi!");
        produto71.setNome("");
        produto71.setPreco((double) 'a');
        produto71.setCodigo("hi!");
        double double80 = produto71.getPreco();
        produto71.setCodigo("hi!");
        double double83 = produto71.getPreco();
        estoque0.inserirProduto(produto71, (-99));
        double double86 = produto71.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 97.0d + "'", double80 == 97.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 97.0d + "'", double83 == 97.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 97.0d + "'", double86 == 97.0d);
    }

    @Test
    public void test8247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8247");
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
        produto41.setNome("hi!");
        double double49 = produto41.getPreco();
        double double50 = produto41.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 35.0d + "'", double49 == 35.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 35.0d + "'", double50 == 35.0d);
    }

    @Test
    public void test8248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8248");
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
        estoque0.removerProduto("hi!", (-3));
        br.ufrn.imd.Produto produto58 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto58.setNome("hi!");
        produto58.setPreco((double) 10);
        java.lang.String str63 = produto58.getCodigo();
        double double64 = produto58.getPreco();
        produto58.setPreco((double) 1.0f);
        produto58.setPreco((double) '4');
        produto58.setCodigo("");
        double double71 = produto58.getPreco();
        produto58.setPreco((double) 0);
        produto58.setCodigo("hi!");
        produto58.setPreco((double) (-100));
        produto58.setNome("hi!");
        estoque0.inserirProduto(produto58, (-98));
        produto58.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 52.0d + "'", double71 == 52.0d);
    }

    @Test
    public void test8249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8249");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        produto3.setPreco(0.0d);
        produto3.setNome("hi!");
        produto3.setPreco((double) 96);
        produto3.setNome("");
        produto3.setNome("");
        double double19 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 96.0d + "'", double19 == 96.0d);
    }

    @Test
    public void test8250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8250");
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
        java.lang.String str41 = produto34.getNome();
        java.lang.String str42 = produto34.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test8251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8251");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco(1.0d);
        java.lang.Class<?> wildcardClass8 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test8252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8252");
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
        boolean boolean40 = estoque0.produtoExiste("hi!");
        boolean boolean42 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test8253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8253");
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
        int int67 = estoque0.consultarQuantidade("");
        boolean boolean69 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test8254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8254");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 116);
        produto3.setPreco((double) 8);
        java.lang.Class<?> wildcardClass6 = produto3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8255");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 31);
    }

    @Test
    public void test8256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8256");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (-36.0d));
        double double4 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-36.0d) + "'", double4 == (-36.0d));
    }

    @Test
    public void test8257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8257");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test8258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8258");
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
        produto47.setPreco((double) 36);
        produto47.setPreco((-90.0d));
        produto47.setPreco((double) (-83));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
    }

    @Test
    public void test8259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8259");
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
        br.ufrn.imd.Estoque estoque38 = new br.ufrn.imd.Estoque();
        boolean boolean40 = estoque38.produtoExiste("");
        br.ufrn.imd.Produto produto44 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto44.setNome("hi!");
        produto44.setPreco((double) 10);
        estoque38.inserirProduto(produto44, (int) (byte) -1);
        java.lang.String str51 = produto44.getCodigo();
        produto44.setPreco((double) (short) 1);
        produto44.setCodigo("");
        double double56 = produto44.getPreco();
        java.lang.String str57 = produto44.getNome();
        estoque0.inserirProduto(produto44, 52);
        produto44.setPreco((double) 34);
        java.lang.Class<?> wildcardClass62 = produto44.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test8260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8260");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-6));
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
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 36 + "'", int66 == 36);
    }

    @Test
    public void test8261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8261");
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
        estoque0.removerProduto("hi!", 179);
        boolean boolean27 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test8262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8262");
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
        br.ufrn.imd.Produto produto64 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double65 = produto64.getPreco();
        java.lang.String str66 = produto64.getCodigo();
        java.lang.String str67 = produto64.getNome();
        java.lang.String str68 = produto64.getCodigo();
        java.lang.String str69 = produto64.getNome();
        java.lang.String str70 = produto64.getCodigo();
        estoque0.inserirProduto(produto64, (int) (byte) 1);
        int int74 = estoque0.consultarQuantidade("");
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
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 104 + "'", int74 == 104);
    }

    @Test
    public void test8263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8263");
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
        java.lang.String str25 = produto16.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test8264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8264");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-1.0f));
        produto3.setCodigo("hi!");
        java.lang.String str6 = produto3.getCodigo();
        double double7 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test8265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8265");
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
        int int56 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("", 19);
        int int61 = estoque0.consultarQuantidade("");
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 109 + "'", int56 == 109);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 109 + "'", int61 == 109);
    }

    @Test
    public void test8266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8266");
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
        double double32 = produto24.getPreco();
        double double33 = produto24.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
    }

    @Test
    public void test8267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8267");
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
        br.ufrn.imd.Estoque estoque39 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto43 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto43.setCodigo("hi!");
        estoque39.inserirProduto(produto43, (int) (byte) 0);
        estoque39.removerProduto("hi!", (int) (byte) 100);
        int int52 = estoque39.consultarQuantidade("");
        boolean boolean54 = estoque39.produtoExiste("");
        estoque39.removerProduto("hi!", (int) (short) 0);
        br.ufrn.imd.Produto produto61 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto61.setNome("hi!");
        produto61.setPreco((double) 10);
        java.lang.String str66 = produto61.getNome();
        double double67 = produto61.getPreco();
        java.lang.String str68 = produto61.getCodigo();
        java.lang.String str69 = produto61.getNome();
        double double70 = produto61.getPreco();
        produto61.setCodigo("");
        java.lang.String str73 = produto61.getNome();
        estoque39.inserirProduto(produto61, 36);
        boolean boolean77 = estoque39.produtoExiste("hi!");
        estoque39.removerProduto("", (-91));
        boolean boolean82 = estoque39.produtoExiste("hi!");
        br.ufrn.imd.Produto produto86 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto86.setPreco(1.0d);
        estoque39.inserirProduto(produto86, 19);
        produto86.setNome("");
        estoque0.inserirProduto(produto86, 166);
        produto86.setPreco((-78.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test8268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8268");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 6);
        produto3.setNome("hi!");
        produto3.setCodigo("hi!");
    }

    @Test
    public void test8269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8269");
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
        int int29 = estoque0.consultarQuantidade("hi!");
        boolean boolean31 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 99 + "'", int29 == 99);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test8270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8270");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (byte) 1);
        java.lang.String str4 = produto3.getNome();
        produto3.setPreco((-10.0d));
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test8271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8271");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-2) + "'", int38 == (-2));
    }

    @Test
    public void test8272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8272");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        boolean boolean6 = estoque0.produtoExiste("hi!");
        int int8 = estoque0.consultarQuantidade("");
        boolean boolean10 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Estoque estoque11 = new br.ufrn.imd.Estoque();
        boolean boolean13 = estoque11.produtoExiste("");
        br.ufrn.imd.Produto produto17 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto17.setNome("hi!");
        produto17.setPreco((double) 10);
        estoque11.inserirProduto(produto17, (int) (byte) -1);
        estoque11.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto30 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto30.setNome("hi!");
        produto30.setPreco((double) 10);
        java.lang.String str35 = produto30.getNome();
        double double36 = produto30.getPreco();
        java.lang.String str37 = produto30.getCodigo();
        produto30.setCodigo("hi!");
        java.lang.String str40 = produto30.getCodigo();
        produto30.setNome("");
        estoque11.inserirProduto(produto30, (int) (short) 10);
        boolean boolean46 = estoque11.produtoExiste("hi!");
        int int48 = estoque11.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto52 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto52.setNome("hi!");
        produto52.setPreco((double) 10);
        java.lang.String str57 = produto52.getNome();
        produto52.setCodigo("hi!");
        estoque11.inserirProduto(produto52, (int) (short) 10);
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double66 = produto65.getPreco();
        produto65.setNome("hi!");
        produto65.setPreco((double) (byte) 0);
        java.lang.String str71 = produto65.getCodigo();
        java.lang.String str72 = produto65.getCodigo();
        produto65.setPreco((double) (byte) 10);
        produto65.setPreco(100.0d);
        java.lang.String str77 = produto65.getNome();
        estoque11.inserirProduto(produto65, (-13));
        estoque0.inserirProduto(produto65, (-122));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 9 + "'", int48 == 9);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 100.0d + "'", double66 == 100.0d);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
    }

    @Test
    public void test8273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8273");
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
        estoque0.removerProduto("hi!", (-34));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
    }

    @Test
    public void test8274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8274");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        java.lang.String str6 = produto3.getCodigo();
        produto3.setPreco((double) (short) 100);
        java.lang.String str9 = produto3.getCodigo();
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test8275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8275");
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
        estoque0.removerProduto("hi!", 29);
        estoque0.removerProduto("", 79);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test8276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8276");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        java.lang.String str8 = produto3.getNome();
        java.lang.String str9 = produto3.getCodigo();
        produto3.setPreco(18.0d);
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test8277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8277");
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
        boolean boolean68 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (-68));
        int int73 = estoque0.consultarQuantidade("");
        boolean boolean75 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (-99));
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
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test8278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8278");
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
        produto41.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test8279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8279");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        int int2 = estoque0.consultarQuantidade("hi!");
        int int4 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test8280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8280");
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
        produto19.setCodigo("");
        produto19.setNome("");
        produto19.setNome("hi!");
        java.lang.String str40 = produto19.getNome();
        java.lang.String str41 = produto19.getNome();
        java.lang.String str42 = produto19.getCodigo();
        java.lang.Class<?> wildcardClass43 = produto19.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test8281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8281");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", 10.0d);
        java.lang.String str4 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test8282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8282");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto3.setNome("");
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(19.0d);
    }

    @Test
    public void test8283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8283");
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
        produto56.setNome("");
        produto56.setNome("");
        produto56.setNome("hi!");
        produto56.setPreco((double) 50);
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
    }

    @Test
    public void test8284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8284");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (-63.0d));
        produto3.setPreco((double) 104);
        produto3.setNome("");
    }

    @Test
    public void test8285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8285");
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
        boolean boolean73 = estoque0.produtoExiste("hi!");
        boolean boolean75 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto79 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto79.setPreco((double) '#');
        produto79.setPreco((double) 10);
        produto79.setNome("");
        java.lang.String str86 = produto79.getCodigo();
        produto79.setPreco(0.0d);
        double double89 = produto79.getPreco();
        produto79.setCodigo("");
        estoque0.inserirProduto(produto79, (-91));
        produto79.setNome("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
    }

    @Test
    public void test8286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8286");
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
        int int85 = estoque0.consultarQuantidade("");
        int int87 = estoque0.consultarQuantidade("hi!");
        int int89 = estoque0.consultarQuantidade("hi!");
        boolean boolean91 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 33 + "'", int87 == 33);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 33 + "'", int89 == 33);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test8287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8287");
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
        br.ufrn.imd.Estoque estoque31 = new br.ufrn.imd.Estoque();
        boolean boolean33 = estoque31.produtoExiste("");
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto37.setNome("hi!");
        produto37.setPreco((double) 10);
        estoque31.inserirProduto(produto37, (int) (byte) -1);
        int int45 = estoque31.consultarQuantidade("");
        estoque31.removerProduto("hi!", 1);
        int int50 = estoque31.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto54 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto54.setNome("hi!");
        produto54.setPreco((double) 10);
        java.lang.String str59 = produto54.getCodigo();
        double double60 = produto54.getPreco();
        produto54.setPreco((double) 1.0f);
        estoque31.inserirProduto(produto54, (int) (short) 0);
        estoque0.inserirProduto(produto54, 33);
        boolean boolean68 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto72 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 10L);
        double double73 = produto72.getPreco();
        estoque0.inserirProduto(produto72, (-2));
        produto72.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-2) + "'", int50 == (-2));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
    }

    @Test
    public void test8288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8288");
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
        produto50.setCodigo("hi!");
        java.lang.String str63 = produto50.getNome();
        java.lang.String str64 = produto50.getNome();
        produto50.setPreco((double) (-15));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test8289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8289");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        produto3.setNome("");
        produto3.setPreco((double) (byte) 100);
        java.lang.String str15 = produto3.getNome();
        produto3.setPreco((double) 97);
        produto3.setCodigo("");
        java.lang.Class<?> wildcardClass20 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8290");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 36);
        produto3.setNome("");
        java.lang.String str6 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test8291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8291");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        produto3.setNome("");
        produto3.setNome("");
        java.lang.String str15 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test8292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8292");
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
        estoque0.removerProduto("hi!", (int) (byte) 1);
        estoque0.removerProduto("hi!", (-100));
        int int61 = estoque0.consultarQuantidade("");
        int int63 = estoque0.consultarQuantidade("hi!");
        boolean boolean65 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-12) + "'", int63 == (-12));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test8293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8293");
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
        produto40.setPreco(0.0d);
        double double51 = produto40.getPreco();
        java.lang.String str52 = produto40.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test8294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8294");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (short) -1);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        produto3.setPreco((double) 99);
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getNome();
        produto3.setCodigo("");
        produto3.setNome("hi!");
        produto3.setPreco((double) 96);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test8295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8295");
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
        java.lang.String str72 = produto66.getNome();
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
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test8296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8296");
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
        produto19.setCodigo("");
        java.lang.String str36 = produto19.getNome();
        java.lang.String str37 = produto19.getCodigo();
        double double38 = produto19.getPreco();
        java.lang.String str39 = produto19.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test8297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8297");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", 166.0d);
    }

    @Test
    public void test8298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8298");
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
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto41.setNome("hi!");
        produto41.setPreco((double) 10);
        java.lang.String str46 = produto41.getNome();
        double double47 = produto41.getPreco();
        java.lang.String str48 = produto41.getCodigo();
        produto41.setCodigo("hi!");
        java.lang.String str51 = produto41.getNome();
        produto41.setNome("hi!");
        produto41.setCodigo("");
        java.lang.String str56 = produto41.getNome();
        estoque0.inserirProduto(produto41, 1);
        int int60 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
    }

    @Test
    public void test8299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8299");
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
        boolean boolean27 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Estoque estoque31 = new br.ufrn.imd.Estoque();
        boolean boolean33 = estoque31.produtoExiste("");
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto37.setNome("hi!");
        produto37.setPreco((double) 10);
        estoque31.inserirProduto(produto37, (int) (byte) -1);
        boolean boolean45 = estoque31.produtoExiste("");
        br.ufrn.imd.Produto produto49 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto49.setNome("hi!");
        produto49.setPreco((double) 10);
        produto49.setNome("hi!");
        estoque31.inserirProduto(produto49, (-1));
        java.lang.String str58 = produto49.getNome();
        double double59 = produto49.getPreco();
        estoque0.inserirProduto(produto49, (-32));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
    }

    @Test
    public void test8300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8300");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        java.lang.String str12 = produto3.getCodigo();
        java.lang.String str13 = produto3.getCodigo();
        produto3.setPreco((double) 33);
        java.lang.String str16 = produto3.getNome();
        java.lang.String str17 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test8301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8301");
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
        produto19.setNome("hi!");
        produto19.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test8302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8302");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setNome("hi!");
        double double9 = produto3.getPreco();
        produto3.setCodigo("");
        java.lang.String str12 = produto3.getNome();
        produto3.setPreco((double) 62);
        java.lang.String str15 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test8303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8303");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", 18.0d);
        produto3.setNome("hi!");
        java.lang.String str6 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test8304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8304");
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
        java.lang.Class<?> wildcardClass84 = estoque0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test8305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8305");
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
        produto3.setCodigo("hi!");
        double double20 = produto3.getPreco();
        java.lang.String str21 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test8306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8306");
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
        java.lang.String str43 = produto19.getNome();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test8307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8307");
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
        produto16.setPreco(0.0d);
        double double31 = produto16.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test8308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8308");
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
        boolean boolean48 = estoque0.produtoExiste("");
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
        double double74 = produto65.getPreco();
        java.lang.String str75 = produto65.getNome();
        produto65.setCodigo("");
        produto65.setNome("");
        produto65.setCodigo("");
        java.lang.String str82 = produto65.getCodigo();
        estoque0.inserirProduto(produto65, 95);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
    }

    @Test
    public void test8309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8309");
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
        java.lang.Class<?> wildcardClass57 = estoque0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test8310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8310");
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
        boolean boolean57 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto61 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 1);
        double double62 = produto61.getPreco();
        estoque0.inserirProduto(produto61, 97);
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-97));
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-11) + "'", int55 == (-11));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
    }

    @Test
    public void test8311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8311");
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
        boolean boolean32 = estoque0.produtoExiste("");
        boolean boolean34 = estoque0.produtoExiste("hi!");
        boolean boolean36 = estoque0.produtoExiste("");
        boolean boolean38 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-90) + "'", int28 == (-90));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test8312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8312");
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
        java.lang.String str20 = produto6.getNome();
        produto6.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test8313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8313");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("");
        produto3.setNome("hi!");
        java.lang.String str8 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test8314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8314");
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
        boolean boolean26 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto30 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto30.setNome("hi!");
        produto30.setPreco((double) 10);
        java.lang.String str35 = produto30.getNome();
        double double36 = produto30.getPreco();
        produto30.setNome("");
        java.lang.String str39 = produto30.getCodigo();
        double double40 = produto30.getPreco();
        produto30.setPreco(34.0d);
        produto30.setNome("");
        double double45 = produto30.getPreco();
        estoque0.inserirProduto(produto30, 149);
        br.ufrn.imd.Produto produto51 = new br.ufrn.imd.Produto("", "", (double) (short) 10);
        double double52 = produto51.getPreco();
        produto51.setCodigo("");
        produto51.setNome("");
        java.lang.String str57 = produto51.getNome();
        produto51.setCodigo("hi!");
        produto51.setNome("");
        produto51.setNome("");
        estoque0.inserirProduto(produto51, 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 34.0d + "'", double45 == 34.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test8315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8315");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        produto3.setCodigo("hi!");
        double double10 = produto3.getPreco();
        produto3.setPreco((double) 100.0f);
        java.lang.String str13 = produto3.getNome();
        java.lang.String str14 = produto3.getCodigo();
        produto3.setPreco((double) (-68));
        double double17 = produto3.getPreco();
        produto3.setPreco((double) (-1.0f));
        produto3.setNome("hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-68.0d) + "'", double17 == (-68.0d));
    }

    @Test
    public void test8316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8316");
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
        boolean boolean39 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque40 = new br.ufrn.imd.Estoque();
        boolean boolean42 = estoque40.produtoExiste("");
        br.ufrn.imd.Produto produto46 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto46.setNome("hi!");
        produto46.setPreco((double) 10);
        estoque40.inserirProduto(produto46, (int) (byte) -1);
        int int54 = estoque40.consultarQuantidade("");
        estoque40.removerProduto("hi!", 1);
        int int59 = estoque40.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto63 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto63.setNome("hi!");
        produto63.setPreco((double) 10);
        java.lang.String str68 = produto63.getNome();
        double double69 = produto63.getPreco();
        java.lang.String str70 = produto63.getCodigo();
        produto63.setCodigo("hi!");
        java.lang.String str73 = produto63.getCodigo();
        estoque40.inserirProduto(produto63, 0);
        estoque0.inserirProduto(produto63, (int) (short) 0);
        double double78 = produto63.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-2) + "'", int59 == (-2));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
    }

    @Test
    public void test8317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8317");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Estoque estoque16 = new br.ufrn.imd.Estoque();
        boolean boolean18 = estoque16.produtoExiste("");
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto22.setNome("hi!");
        produto22.setPreco((double) 10);
        estoque16.inserirProduto(produto22, (int) (byte) -1);
        int int30 = estoque16.consultarQuantidade("");
        estoque16.removerProduto("hi!", 1);
        int int35 = estoque16.consultarQuantidade("hi!");
        int int37 = estoque16.consultarQuantidade("hi!");
        int int39 = estoque16.consultarQuantidade("hi!");
        int int41 = estoque16.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("hi!", "hi!", (double) ' ');
        estoque16.inserirProduto(produto45, (int) (short) -1);
        estoque0.inserirProduto(produto45, (-108));
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-2) + "'", int39 == (-2));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-2) + "'", int41 == (-2));
    }

    @Test
    public void test8318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8318");
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
        boolean boolean43 = estoque0.produtoExiste("");
        estoque0.removerProduto("", (-36));
        int int48 = estoque0.consultarQuantidade("hi!");
        boolean boolean50 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-200) + "'", int48 == (-200));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test8319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8319");
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
        int int46 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-2) + "'", int46 == (-2));
    }

    @Test
    public void test8320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8320");
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
        estoque0.removerProduto("hi!", (-6));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2) + "'", int25 == (-2));
    }

    @Test
    public void test8321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8321");
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
        double double44 = produto23.getPreco();
        double double45 = produto23.getPreco();
        produto23.setPreco((double) (short) 10);
        java.lang.String str48 = produto23.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
    }

    @Test
    public void test8322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8322");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        int int17 = estoque0.consultarQuantidade("");
        boolean boolean19 = estoque0.produtoExiste("hi!");
        boolean boolean21 = estoque0.produtoExiste("");
        br.ufrn.imd.Estoque estoque22 = new br.ufrn.imd.Estoque();
        boolean boolean24 = estoque22.produtoExiste("");
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto28.setNome("hi!");
        produto28.setPreco((double) 10);
        estoque22.inserirProduto(produto28, (int) (byte) -1);
        int int36 = estoque22.consultarQuantidade("");
        estoque22.removerProduto("hi!", 1);
        int int41 = estoque22.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto45.setNome("hi!");
        produto45.setPreco((double) 10);
        java.lang.String str50 = produto45.getCodigo();
        double double51 = produto45.getPreco();
        produto45.setPreco((double) 1.0f);
        estoque22.inserirProduto(produto45, (int) (short) 0);
        int int57 = estoque22.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto61 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto61.setNome("hi!");
        produto61.setPreco((double) 10);
        produto61.setNome("hi!");
        produto61.setPreco((double) 'a');
        produto61.setNome("");
        produto61.setNome("");
        double double74 = produto61.getPreco();
        produto61.setNome("hi!");
        java.lang.String str77 = produto61.getCodigo();
        estoque22.inserirProduto(produto61, (-11));
        estoque22.removerProduto("hi!", (-200));
        br.ufrn.imd.Produto produto86 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (short) 10);
        estoque22.inserirProduto(produto86, (-101));
        double double89 = produto86.getPreco();
        estoque0.inserirProduto(produto86, 99);
        int int93 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-2) + "'", int41 == (-2));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-2) + "'", int57 == (-2));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 97.0d + "'", double74 == 97.0d);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 10.0d + "'", double89 == 10.0d);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 98 + "'", int93 == 98);
    }

    @Test
    public void test8323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8323");
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
        produto21.setCodigo("");
        java.lang.String str34 = produto21.getNome();
        java.lang.String str35 = produto21.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test8324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8324");
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
        java.lang.String str67 = produto59.getCodigo();
        produto59.setNome("hi!");
        produto59.setNome("");
        produto59.setCodigo("hi!");
        produto59.setPreco((-69.0d));
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
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
    }

    @Test
    public void test8325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8325");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) '#');
        java.lang.String str4 = produto3.getCodigo();
        java.lang.Class<?> wildcardClass5 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8326");
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
        br.ufrn.imd.Produto produto39 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto39.setNome("hi!");
        produto39.setNome("");
        estoque23.inserirProduto(produto39, 0);
        int int47 = estoque23.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto51 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto51.setNome("hi!");
        produto51.setPreco((double) 10);
        java.lang.String str56 = produto51.getNome();
        double double57 = produto51.getPreco();
        java.lang.String str58 = produto51.getCodigo();
        estoque23.inserirProduto(produto51, (int) '#');
        br.ufrn.imd.Produto produto64 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        estoque23.inserirProduto(produto64, (-1));
        br.ufrn.imd.Produto produto70 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto70.setNome("hi!");
        produto70.setPreco((double) 10);
        java.lang.String str75 = produto70.getCodigo();
        java.lang.String str76 = produto70.getCodigo();
        estoque23.inserirProduto(produto70, 0);
        br.ufrn.imd.Produto produto82 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str83 = produto82.getCodigo();
        produto82.setNome("");
        double double86 = produto82.getPreco();
        estoque23.inserirProduto(produto82, 0);
        produto82.setPreco((double) 8);
        estoque0.inserirProduto(produto82, (-101));
        produto82.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 10.0d + "'", double86 == 10.0d);
    }

    @Test
    public void test8327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8327");
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
        java.lang.String str20 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test8328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8328");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto3.setCodigo("hi!");
        produto3.setNome("");
        produto3.setNome("hi!");
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test8329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8329");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (byte) 0);
        double double4 = produto3.getPreco();
        double double5 = produto3.getPreco();
        java.lang.String str6 = produto3.getNome();
        java.lang.Class<?> wildcardClass7 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test8330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8330");
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
        java.lang.String str34 = produto28.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test8331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8331");
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
        boolean boolean25 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test8332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8332");
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
        java.lang.String str55 = produto48.getCodigo();
        double double56 = produto48.getPreco();
        java.lang.String str57 = produto48.getCodigo();
        double double58 = produto48.getPreco();
        estoque0.inserirProduto(produto48, (int) '4');
        estoque0.removerProduto("hi!", 0);
        int int65 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 51 + "'", int65 == 51);
    }

    @Test
    public void test8333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8333");
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
        produto78.setCodigo("hi!");
        double double91 = produto78.getPreco();
        produto78.setPreco((double) (-6));
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
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 10.0d + "'", double91 == 10.0d);
    }

    @Test
    public void test8334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8334");
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
        produto31.setPreco((double) (-2));
        double double43 = produto31.getPreco();
        produto31.setCodigo("hi!");
        java.lang.Class<?> wildcardClass46 = produto31.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-2.0d) + "'", double43 == (-2.0d));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test8335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8335");
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
        br.ufrn.imd.Produto produto83 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto83.setNome("hi!");
        produto83.setNome("");
        produto83.setPreco(1.0d);
        java.lang.String str90 = produto83.getCodigo();
        double double91 = produto83.getPreco();
        java.lang.String str92 = produto83.getCodigo();
        java.lang.String str93 = produto83.getCodigo();
        java.lang.String str94 = produto83.getNome();
        estoque0.inserirProduto(produto83, 28);
        boolean boolean98 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1.0d + "'", double91 == 1.0d);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test8336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8336");
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
        br.ufrn.imd.Estoque estoque67 = new br.ufrn.imd.Estoque();
        boolean boolean69 = estoque67.produtoExiste("");
        br.ufrn.imd.Produto produto73 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto73.setNome("hi!");
        produto73.setPreco((double) 10);
        estoque67.inserirProduto(produto73, (int) (byte) -1);
        produto73.setNome("hi!");
        produto73.setCodigo("");
        java.lang.String str84 = produto73.getNome();
        double double85 = produto73.getPreco();
        estoque0.inserirProduto(produto73, (int) (byte) 1);
        java.lang.String str88 = produto73.getNome();
        produto73.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 36 + "'", int66 == 36);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 10.0d + "'", double85 == 10.0d);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
    }

    @Test
    public void test8337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8337");
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
        boolean boolean46 = estoque0.produtoExiste("hi!");
        int int48 = estoque0.consultarQuantidade("");
        estoque0.removerProduto("hi!", 105);
        boolean boolean53 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test8338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8338");
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
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto65.setNome("hi!");
        produto65.setPreco((double) 10);
        java.lang.String str70 = produto65.getNome();
        double double71 = produto65.getPreco();
        produto65.setNome("");
        double double74 = produto65.getPreco();
        produto65.setCodigo("");
        java.lang.String str77 = produto65.getCodigo();
        estoque0.inserirProduto(produto65, (int) (byte) -1);
        boolean boolean81 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto85 = new br.ufrn.imd.Produto("", "hi!", (double) 0);
        java.lang.String str86 = produto85.getCodigo();
        estoque0.inserirProduto(produto85, 28);
        java.lang.String str89 = produto85.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test8339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8339");
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
        estoque0.removerProduto("hi!", (-28));
        estoque0.removerProduto("hi!", (-112));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
    }

    @Test
    public void test8340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8340");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 'a');
        produto3.setCodigo("hi!");
        java.lang.String str6 = produto3.getCodigo();
        produto3.setCodigo("");
        produto3.setPreco((double) (-2));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test8341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8341");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (-230));
    }

    @Test
    public void test8342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8342");
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
        produto23.setNome("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test8343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8343");
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
        int int48 = estoque0.consultarQuantidade("");
        int int50 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-5) + "'", int50 == (-5));
    }

    @Test
    public void test8344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8344");
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
        double double62 = produto55.getPreco();
        double double63 = produto55.getPreco();
        produto55.setCodigo("");
        double double66 = produto55.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 100.0d + "'", double62 == 100.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 100.0d + "'", double63 == 100.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 100.0d + "'", double66 == 100.0d);
    }

    @Test
    public void test8345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8345");
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
        produto3.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test8346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8346");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        java.lang.String str13 = produto6.getCodigo();
        java.lang.String str14 = produto6.getNome();
        produto6.setCodigo("hi!");
        java.lang.String str17 = produto6.getNome();
        produto6.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test8347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8347");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 10.0d);
        produto3.setNome("");
        java.lang.String str6 = produto3.getCodigo();
        java.lang.String str7 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        produto3.setNome("");
        produto3.setCodigo("hi!");
        java.lang.String str14 = produto3.getCodigo();
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test8348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8348");
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
        double double22 = produto3.getPreco();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test8349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8349");
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
        produto16.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test8350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8350");
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
        estoque0.removerProduto("hi!", (-88));
        int int73 = estoque0.consultarQuantidade("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 36 + "'", int68 == 36);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test8351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8351");
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
        produto21.setCodigo("");
        produto21.setCodigo("hi!");
        java.lang.Class<?> wildcardClass44 = produto21.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test8352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8352");
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
        java.lang.String str18 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test8353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8353");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 10L);
        produto3.setCodigo("hi!");
        java.lang.String str6 = produto3.getNome();
        double double7 = produto3.getPreco();
        produto3.setCodigo("hi!");
        java.lang.String str10 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test8354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8354");
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
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("hi!", "", (double) 10L);
        produto45.setNome("");
        java.lang.String str48 = produto45.getCodigo();
        java.lang.String str49 = produto45.getCodigo();
        estoque0.inserirProduto(produto45, 16);
        int int53 = estoque0.consultarQuantidade("hi!");
        boolean boolean55 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 109 + "'", int41 == 109);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 109 + "'", int53 == 109);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test8355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8355");
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
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto37.setNome("hi!");
        produto37.setPreco((double) 10);
        produto37.setNome("hi!");
        java.lang.String str44 = produto37.getCodigo();
        double double45 = produto37.getPreco();
        java.lang.String str46 = produto37.getCodigo();
        produto37.setNome("hi!");
        estoque0.inserirProduto(produto37, 0);
        produto37.setCodigo("");
        java.lang.String str53 = produto37.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
    }

    @Test
    public void test8356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8356");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-63));
        produto3.setCodigo("hi!");
        produto3.setPreco((double) '#');
    }

    @Test
    public void test8357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8357");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("");
        double double7 = produto3.getPreco();
        java.lang.String str8 = produto3.getCodigo();
        java.lang.String str9 = produto3.getNome();
        java.lang.String str10 = produto3.getNome();
        double double11 = produto3.getPreco();
        java.lang.Class<?> wildcardClass12 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8358");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        double double9 = produto3.getPreco();
        double double10 = produto3.getPreco();
        produto3.setCodigo("");
        produto3.setPreco(18.0d);
        produto3.setCodigo("hi!");
        double double17 = produto3.getPreco();
        java.lang.String str18 = produto3.getNome();
        double double19 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 18.0d + "'", double17 == 18.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 18.0d + "'", double19 == 18.0d);
    }

    @Test
    public void test8359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8359");
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
        br.ufrn.imd.Produto produto35 = new br.ufrn.imd.Produto("hi!", "", (double) (byte) 1);
        java.lang.String str36 = produto35.getCodigo();
        produto35.setNome("hi!");
        java.lang.String str39 = produto35.getNome();
        estoque0.inserirProduto(produto35, 0);
        boolean boolean43 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test8360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8360");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        double double7 = produto3.getPreco();
        java.lang.String str8 = produto3.getCodigo();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test8361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8361");
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
        produto55.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
    }

    @Test
    public void test8362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8362");
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
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto37.setPreco((double) '#');
        produto37.setPreco((double) 10);
        estoque0.inserirProduto(produto37, 100);
        br.ufrn.imd.Produto produto47 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto47.setNome("hi!");
        produto47.setPreco((double) 10);
        produto47.setNome("hi!");
        produto47.setPreco((double) 'a');
        produto47.setNome("");
        produto47.setNome("");
        produto47.setPreco((double) (short) -1);
        produto47.setCodigo("");
        produto47.setCodigo("");
        produto47.setCodigo("");
        double double68 = produto47.getPreco();
        estoque0.inserirProduto(produto47, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
    }

    @Test
    public void test8363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8363");
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
        estoque0.removerProduto("hi!", (-28));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test8364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8364");
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
        double double76 = produto71.getPreco();
        double double77 = produto71.getPreco();
        java.lang.String str78 = produto71.getNome();
        produto71.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 10.0d + "'", double76 == 10.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
    }

    @Test
    public void test8365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8365");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", 18.0d);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setPreco((-108.0d));
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test8366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8366");
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
        estoque0.removerProduto("hi!", (int) ' ');
        boolean boolean85 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("", (int) (byte) 0);
        estoque0.removerProduto("hi!", (-78));
        boolean boolean93 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test8367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8367");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        estoque0.removerProduto("hi!", 0);
        estoque0.removerProduto("hi!", (int) 'a');
        br.ufrn.imd.Produto produto22 = new br.ufrn.imd.Produto("", "", (double) (byte) 10);
        java.lang.String str23 = produto22.getCodigo();
        java.lang.String str24 = produto22.getCodigo();
        estoque0.inserirProduto(produto22, 51);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test8368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8368");
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
        boolean boolean73 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test8369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8369");
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
        double double81 = produto75.getPreco();
        double double82 = produto75.getPreco();
        java.lang.String str83 = produto75.getCodigo();
        produto75.setNome("");
        java.lang.String str86 = produto75.getCodigo();
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
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 10.0d + "'", double82 == 10.0d);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
    }

    @Test
    public void test8370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8370");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 100.0f);
        double double4 = produto3.getPreco();
        produto3.setPreco((-4.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test8371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8371");
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
        int int52 = estoque0.consultarQuantidade("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-112));
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
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 84 + "'", int52 == 84);
    }

    @Test
    public void test8372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8372");
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
        br.ufrn.imd.Estoque estoque55 = new br.ufrn.imd.Estoque();
        boolean boolean57 = estoque55.produtoExiste("");
        br.ufrn.imd.Produto produto61 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto61.setNome("hi!");
        produto61.setPreco((double) 10);
        estoque55.inserirProduto(produto61, (int) (byte) -1);
        int int69 = estoque55.consultarQuantidade("");
        estoque55.removerProduto("hi!", 1);
        int int74 = estoque55.consultarQuantidade("hi!");
        int int76 = estoque55.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto80 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto80.setNome("hi!");
        java.lang.String str83 = produto80.getCodigo();
        estoque55.inserirProduto(produto80, 18);
        java.lang.String str86 = produto80.getNome();
        produto80.setPreco(35.0d);
        double double89 = produto80.getPreco();
        produto80.setNome("hi!");
        produto80.setNome("");
        estoque0.inserirProduto(produto80, (int) '#');
        java.lang.Class<?> wildcardClass96 = produto80.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-2) + "'", int74 == (-2));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-2) + "'", int76 == (-2));
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 35.0d + "'", double89 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test8373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8373");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        produto3.setCodigo("");
        produto3.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test8374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8374");
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
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("hi!", "", 1.0d);
        estoque0.inserirProduto(produto25, 0);
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
        estoque28.removerProduto("hi!", 0);
        boolean boolean57 = estoque28.produtoExiste("hi!");
        int int59 = estoque28.consultarQuantidade("hi!");
        boolean boolean61 = estoque28.produtoExiste("hi!");
        int int63 = estoque28.consultarQuantidade("hi!");
        boolean boolean65 = estoque28.produtoExiste("hi!");
        br.ufrn.imd.Produto produto69 = new br.ufrn.imd.Produto("hi!", "", 100.0d);
        java.lang.String str70 = produto69.getNome();
        produto69.setPreco((double) (-10));
        estoque28.inserirProduto(produto69, (-108));
        produto69.setNome("hi!");
        estoque0.inserirProduto(produto69, 196);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
    }

    @Test
    public void test8375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8375");
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
        int int88 = estoque0.consultarQuantidade("hi!");
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
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-102) + "'", int88 == (-102));
    }

    @Test
    public void test8376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8376");
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
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", 0.0d);
        double double37 = produto36.getPreco();
        java.lang.String str38 = produto36.getNome();
        estoque0.inserirProduto(produto36, (-11));
        boolean boolean42 = estoque0.produtoExiste("");
        estoque0.removerProduto("hi!", 110);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test8377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8377");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        boolean boolean14 = estoque0.produtoExiste("hi!");
        boolean boolean16 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Estoque estoque17 = new br.ufrn.imd.Estoque();
        boolean boolean19 = estoque17.produtoExiste("");
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto23.setNome("hi!");
        produto23.setPreco((double) 10);
        estoque17.inserirProduto(produto23, (int) (byte) -1);
        estoque17.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto36 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        estoque17.inserirProduto(produto36, (int) (short) 100);
        produto36.setPreco((double) 1L);
        estoque0.inserirProduto(produto36, (int) (byte) 10);
        produto36.setNome("");
        produto36.setCodigo("");
        java.lang.Class<?> wildcardClass47 = produto36.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test8378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8378");
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
        int int73 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto77 = new br.ufrn.imd.Produto("", "", (double) 10.0f);
        produto77.setPreco((-1.0d));
        java.lang.String str80 = produto77.getCodigo();
        java.lang.String str81 = produto77.getCodigo();
        java.lang.String str82 = produto77.getNome();
        estoque0.inserirProduto(produto77, 18);
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
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 99 + "'", int73 == 99);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
    }

    @Test
    public void test8379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8379");
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
        estoque0.removerProduto("hi!", (-2));
        boolean boolean44 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Estoque estoque45 = new br.ufrn.imd.Estoque();
        boolean boolean47 = estoque45.produtoExiste("");
        br.ufrn.imd.Produto produto51 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto51.setNome("hi!");
        produto51.setPreco((double) 10);
        estoque45.inserirProduto(produto51, (int) (byte) -1);
        int int59 = estoque45.consultarQuantidade("");
        boolean boolean61 = estoque45.produtoExiste("hi!");
        br.ufrn.imd.Produto produto65 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto65.setPreco((double) '#');
        estoque45.inserirProduto(produto65, (int) (short) 0);
        br.ufrn.imd.Produto produto73 = new br.ufrn.imd.Produto("hi!", "", (double) 100L);
        estoque45.inserirProduto(produto73, (int) (short) 0);
        double double76 = produto73.getPreco();
        produto73.setNome("");
        java.lang.String str79 = produto73.getCodigo();
        java.lang.String str80 = produto73.getNome();
        estoque0.inserirProduto(produto73, (-110));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 100.0d + "'", double76 == 100.0d);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test8380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8380");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) 99);
        produto3.setCodigo("hi!");
        produto3.setPreco((double) 179);
        java.lang.String str8 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test8381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8381");
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
        br.ufrn.imd.Produto produto28 = new br.ufrn.imd.Produto("hi!", "", (-63.0d));
        estoque0.inserirProduto(produto28, (-98));
        int int32 = estoque0.consultarQuantidade("");
        boolean boolean34 = estoque0.produtoExiste("");
        java.lang.Class<?> wildcardClass35 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-98) + "'", int32 == (-98));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test8382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8382");
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
        br.ufrn.imd.Produto produto25 = new br.ufrn.imd.Produto("", "", 35.0d);
        estoque0.inserirProduto(produto25, (int) (short) -1);
        br.ufrn.imd.Produto produto31 = new br.ufrn.imd.Produto("", "", (double) 0.0f);
        produto31.setPreco(97.0d);
        java.lang.String str34 = produto31.getNome();
        java.lang.String str35 = produto31.getNome();
        produto31.setPreco((double) (-90));
        estoque0.inserirProduto(produto31, (-29));
        java.lang.String str40 = produto31.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test8383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8383");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-67));
    }

    @Test
    public void test8384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8384");
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
        java.lang.Class<?> wildcardClass40 = produto21.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test8385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8385");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", 100.0d);
        produto3.setPreco((double) 0.0f);
        java.lang.String str6 = produto3.getCodigo();
        java.lang.Class<?> wildcardClass7 = produto3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test8386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8386");
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
        java.lang.String str25 = produto16.getNome();
        produto16.setNome("");
        java.lang.String str28 = produto16.getNome();
        produto16.setCodigo("");
        produto16.setPreco((double) (-10));
        java.lang.Class<?> wildcardClass33 = produto16.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8387");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto6 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto6.setNome("hi!");
        produto6.setPreco((double) 10);
        estoque0.inserirProduto(produto6, (int) (byte) -1);
        java.lang.String str13 = produto6.getCodigo();
        produto6.setPreco((double) (short) 1);
        produto6.setCodigo("");
        produto6.setNome("");
        java.lang.String str20 = produto6.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8388");
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
        java.lang.String str38 = produto23.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test8389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8389");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (short) -1);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        produto3.setPreco((double) 68);
        java.lang.String str10 = produto3.getNome();
        java.lang.String str11 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test8390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8390");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setPreco(1.0d);
        java.lang.String str10 = produto3.getCodigo();
        double double11 = produto3.getPreco();
        java.lang.String str12 = produto3.getCodigo();
        java.lang.String str13 = produto3.getCodigo();
        produto3.setPreco((double) 33);
        java.lang.String str16 = produto3.getNome();
        double double17 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 33.0d + "'", double17 == 33.0d);
    }

    @Test
    public void test8391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8391");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 99.0d);
        produto3.setPreco(0.0d);
    }

    @Test
    public void test8392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8392");
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
        produto59.setPreco((double) (-5));
        java.lang.String str78 = produto59.getCodigo();
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
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
    }

    @Test
    public void test8393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8393");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        produto3.setPreco((double) (byte) 0);
        java.lang.String str9 = produto3.getNome();
        produto3.setPreco((double) 10.0f);
        produto3.setCodigo("");
        java.lang.String str14 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test8394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8394");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setCodigo("hi!");
        java.lang.String str6 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test8395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8395");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 68);
        double double4 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 68.0d + "'", double4 == 68.0d);
    }

    @Test
    public void test8396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8396");
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
        boolean boolean51 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto55 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto55.setNome("hi!");
        produto55.setPreco((double) 10);
        java.lang.String str60 = produto55.getNome();
        double double61 = produto55.getPreco();
        java.lang.String str62 = produto55.getCodigo();
        java.lang.String str63 = produto55.getNome();
        produto55.setPreco((double) '4');
        produto55.setNome("");
        java.lang.String str68 = produto55.getCodigo();
        estoque0.inserirProduto(produto55, (-20));
        boolean boolean72 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto76 = new br.ufrn.imd.Produto("", "hi!", (-91.0d));
        estoque0.inserirProduto(produto76, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test8397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8397");
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
        int int35 = estoque0.consultarQuantidade("");
        boolean boolean37 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto41.setNome("hi!");
        produto41.setNome("");
        produto41.setPreco(1.0d);
        java.lang.String str48 = produto41.getCodigo();
        double double49 = produto41.getPreco();
        produto41.setNome("");
        produto41.setNome("");
        java.lang.String str54 = produto41.getNome();
        produto41.setNome("hi!");
        estoque0.inserirProduto(produto41, 95);
        boolean boolean60 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test8398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8398");
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
        int int46 = estoque27.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto50 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto50.setNome("hi!");
        produto50.setPreco((double) 10);
        java.lang.String str55 = produto50.getNome();
        double double56 = produto50.getPreco();
        java.lang.String str57 = produto50.getCodigo();
        produto50.setCodigo("hi!");
        java.lang.String str60 = produto50.getCodigo();
        estoque27.inserirProduto(produto50, 0);
        br.ufrn.imd.Produto produto66 = new br.ufrn.imd.Produto("", "", (double) 0L);
        java.lang.String str67 = produto66.getNome();
        estoque27.inserirProduto(produto66, (int) (short) 0);
        java.lang.String str70 = produto66.getCodigo();
        estoque0.inserirProduto(produto66, 0);
        boolean boolean74 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-2) + "'", int46 == (-2));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test8399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8399");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) '#');
        produto3.setCodigo("hi!");
    }

    @Test
    public void test8400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8400");
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
        boolean boolean30 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test8401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8401");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto3.setPreco((double) (byte) 100);
        java.lang.String str6 = produto3.getNome();
        java.lang.String str7 = produto3.getCodigo();
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test8402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8402");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-83));
        double double4 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-83.0d) + "'", double4 == (-83.0d));
    }

    @Test
    public void test8403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8403");
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
        estoque0.removerProduto("", 79);
        int int53 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 18 + "'", int46 == 18);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 18 + "'", int53 == 18);
    }

    @Test
    public void test8404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8404");
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
        br.ufrn.imd.Produto produto74 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 99);
        java.lang.String str75 = produto74.getNome();
        estoque0.inserirProduto(produto74, 99);
        double double78 = produto74.getPreco();
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 99.0d + "'", double78 == 99.0d);
    }

    @Test
    public void test8405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8405");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 8);
        produto3.setNome("hi!");
    }

    @Test
    public void test8406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8406");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (byte) 1);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("hi!");
        produto3.setNome("");
        produto3.setNome("hi!");
        java.lang.String str11 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test8407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8407");
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
        estoque0.removerProduto("", 196);
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
    }

    @Test
    public void test8408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8408");
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
        estoque0.removerProduto("hi!", (-90));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
    }

    @Test
    public void test8409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8409");
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
        java.lang.String str73 = produto55.getNome();
        produto55.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test8410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8410");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (double) (-78));
    }

    @Test
    public void test8411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8411");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", 34.0d);
        produto3.setNome("");
        produto3.setCodigo("hi!");
        produto3.setPreco((double) 68);
    }

    @Test
    public void test8412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8412");
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
        java.lang.String str47 = produto34.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test8413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8413");
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
        java.lang.String str42 = produto28.getNome();
        produto28.setNome("");
        java.lang.String str45 = produto28.getNome();
        produto28.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test8414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8414");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        produto3.setCodigo("");
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        produto3.setNome("hi!");
        java.lang.String str13 = produto3.getNome();
        produto3.setPreco((double) 10L);
        java.lang.Class<?> wildcardClass16 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8415");
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
        int int48 = estoque0.consultarQuantidade("hi!");
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 102 + "'", int48 == 102);
    }

    @Test
    public void test8416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8416");
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
        boolean boolean51 = estoque0.produtoExiste("hi!");
        boolean boolean53 = estoque0.produtoExiste("");
        int int55 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto59 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto59.setNome("hi!");
        produto59.setPreco((double) 10);
        java.lang.String str64 = produto59.getNome();
        double double65 = produto59.getPreco();
        java.lang.String str66 = produto59.getCodigo();
        java.lang.String str67 = produto59.getNome();
        produto59.setPreco((double) '4');
        produto59.setNome("");
        estoque0.inserirProduto(produto59, 114);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
    }

    @Test
    public void test8417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8417");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (-33.0d));
        java.lang.String str4 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test8418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8418");
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
        br.ufrn.imd.Produto produto37 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 1);
        produto37.setNome("");
        double double40 = produto37.getPreco();
        double double41 = produto37.getPreco();
        java.lang.String str42 = produto37.getCodigo();
        estoque0.inserirProduto(produto37, (-33));
        double double45 = produto37.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
    }

    @Test
    public void test8419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8419");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto3.setPreco((double) '#');
        produto3.setPreco((double) 10);
        produto3.setNome("");
        double double10 = produto3.getPreco();
        produto3.setNome("");
        double double13 = produto3.getPreco();
        produto3.setPreco((double) (-108));
        java.lang.String str16 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8420");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-1L));
        produto3.setPreco(33.0d);
        produto3.setCodigo("");
    }

    @Test
    public void test8421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8421");
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
        boolean boolean62 = estoque0.produtoExiste("hi!");
        int int64 = estoque0.consultarQuantidade("");
        br.ufrn.imd.Produto produto65 = null;
        // The following exception was thrown during execution in test generation
        try {
            estoque0.inserirProduto(produto65, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 34 + "'", int60 == 34);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test8422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8422");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        double double10 = produto3.getPreco();
        double double11 = produto3.getPreco();
        double double12 = produto3.getPreco();
        produto3.setCodigo("");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test8423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8423");
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
        boolean boolean73 = estoque0.produtoExiste("hi!");
        int int75 = estoque0.consultarQuantidade("");
        boolean boolean77 = estoque0.produtoExiste("hi!");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test8424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8424");
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
        estoque0.removerProduto("hi!", 0);
        br.ufrn.imd.Produto produto72 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto72.setNome("hi!");
        produto72.setNome("");
        java.lang.String str77 = produto72.getNome();
        java.lang.String str78 = produto72.getCodigo();
        java.lang.String str79 = produto72.getCodigo();
        produto72.setCodigo("hi!");
        estoque0.inserirProduto(produto72, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
    }

    @Test
    public void test8425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8425");
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
        produto3.setCodigo("hi!");
        java.lang.String str21 = produto3.getCodigo();
        double double22 = produto3.getPreco();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test8426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8426");
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
        int int46 = estoque0.consultarQuantidade("hi!");
        boolean boolean48 = estoque0.produtoExiste("hi!");
        estoque0.removerProduto("hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-2) + "'", int42 == (-2));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-2) + "'", int44 == (-2));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-2) + "'", int46 == (-2));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test8427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8427");
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
        java.lang.String str29 = produto12.getCodigo();
        java.lang.String str30 = produto12.getNome();
        produto12.setCodigo("hi!");
        java.lang.String str33 = produto12.getCodigo();
        java.lang.String str34 = produto12.getNome();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test8428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8428");
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
        boolean boolean55 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test8429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8429");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (int) (byte) 0);
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
    }

    @Test
    public void test8430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8430");
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
        boolean boolean33 = estoque0.produtoExiste("hi!");
        int int35 = estoque0.consultarQuantidade("hi!");
        boolean boolean37 = estoque0.produtoExiste("");
        java.lang.Class<?> wildcardClass38 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test8431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8431");
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
        int int85 = estoque0.consultarQuantidade("");
        boolean boolean87 = estoque0.produtoExiste("");
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
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-63) + "'", int85 == (-63));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test8432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8432");
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
        boolean boolean49 = estoque0.produtoExiste("");
        br.ufrn.imd.Produto produto53 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto53.setPreco((double) '#');
        produto53.setPreco((double) 10);
        java.lang.String str58 = produto53.getNome();
        produto53.setPreco(0.0d);
        produto53.setNome("hi!");
        produto53.setPreco((double) 96);
        double double65 = produto53.getPreco();
        estoque0.inserirProduto(produto53, (-30));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 96.0d + "'", double65 == 96.0d);
    }

    @Test
    public void test8433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8433");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getNome();
        double double9 = produto3.getPreco();
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getNome();
        double double12 = produto3.getPreco();
        produto3.setCodigo("");
        java.lang.String str15 = produto3.getNome();
        java.lang.String str16 = produto3.getCodigo();
        produto3.setPreco((double) (-25));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8434");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 54);
        double double4 = produto3.getPreco();
        produto3.setCodigo("hi!");
        produto3.setPreco((-132.0d));
        produto3.setPreco((double) 149);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 54.0d + "'", double4 == 54.0d);
    }

    @Test
    public void test8435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8435");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("");
        java.lang.String str6 = produto3.getNome();
        produto3.setCodigo("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test8436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8436");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        boolean boolean2 = estoque0.produtoExiste("");
        int int4 = estoque0.consultarQuantidade("hi!");
        int int6 = estoque0.consultarQuantidade("");
        int int8 = estoque0.consultarQuantidade("");
        boolean boolean10 = estoque0.produtoExiste("hi!");
        boolean boolean12 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test8437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8437");
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
        estoque0.removerProduto("hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test8438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8438");
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
        java.lang.String str48 = produto31.getNome();
        double double49 = produto31.getPreco();
        double double50 = produto31.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
    }

    @Test
    public void test8439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8439");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setCodigo("hi!");
        produto3.setPreco((double) 100L);
    }

    @Test
    public void test8440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8440");
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
        boolean boolean26 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test8441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8441");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) (-1L));
        produto3.setCodigo("");
        produto3.setNome("hi!");
        produto3.setPreco((double) 'a');
        java.lang.String str10 = produto3.getCodigo();
        java.lang.String str11 = produto3.getCodigo();
        produto3.setCodigo("hi!");
        double double14 = produto3.getPreco();
        produto3.setCodigo("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test8442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8442");
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
            estoque0.removerProduto("", 125);
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
    public void test8443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8443");
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
        estoque0.removerProduto("hi!", (int) (byte) 10);
        int int61 = estoque0.consultarQuantidade("");
        boolean boolean63 = estoque0.produtoExiste("hi!");
        int int65 = estoque0.consultarQuantidade("");
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
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test8444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8444");
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
        double double44 = produto28.getPreco();
        java.lang.String str45 = produto28.getNome();
        produto28.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test8445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8445");
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
        boolean boolean54 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test8446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8446");
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
        boolean boolean76 = estoque0.produtoExiste("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test8447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8447");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-35));
        produto3.setCodigo("hi!");
    }

    @Test
    public void test8448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8448");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 1);
        double double4 = produto3.getPreco();
        produto3.setPreco((double) 62);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test8449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8449");
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
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", 29);
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
    }

    @Test
    public void test8450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8450");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getCodigo();
        produto3.setNome("");
        java.lang.String str10 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test8451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8451");
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
        int int35 = estoque0.consultarQuantidade("");
        int int37 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-3) + "'", int37 == (-3));
    }

    @Test
    public void test8452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8452");
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
        java.lang.String str95 = produto79.getNome();
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
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "hi!" + "'", str95, "hi!");
    }

    @Test
    public void test8453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8453");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        produto3.setPreco(34.0d);
    }

    @Test
    public void test8454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8454");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) 10);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getNome();
        java.lang.String str6 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test8455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8455");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        double double10 = produto3.getPreco();
        double double11 = produto3.getPreco();
        double double12 = produto3.getPreco();
        produto3.setCodigo("hi!");
        produto3.setNome("hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test8456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8456");
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
        int int99 = estoque0.consultarQuantidade("hi!");
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
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-12) + "'", int99 == (-12));
    }

    @Test
    public void test8457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8457");
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
        int int56 = estoque0.consultarQuantidade("hi!");
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 77 + "'", int56 == 77);
    }

    @Test
    public void test8458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8458");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) (byte) 1);
        produto3.setCodigo("hi!");
        produto3.setPreco(0.0d);
        java.lang.String str8 = produto3.getNome();
        produto3.setCodigo("hi!");
        produto3.setCodigo("hi!");
        double double13 = produto3.getPreco();
        double double14 = produto3.getPreco();
        java.lang.String str15 = produto3.getNome();
        produto3.setPreco(79.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8459");
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
            estoque0.removerProduto("", 5);
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
    public void test8460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8460");
        br.ufrn.imd.Estoque estoque0 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto4 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto4.setCodigo("hi!");
        estoque0.inserirProduto(produto4, (int) (byte) 0);
        estoque0.removerProduto("hi!", (int) (byte) 100);
        estoque0.removerProduto("hi!", (int) (short) 1);
        boolean boolean16 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Estoque estoque17 = new br.ufrn.imd.Estoque();
        boolean boolean19 = estoque17.produtoExiste("");
        br.ufrn.imd.Produto produto23 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto23.setNome("hi!");
        produto23.setPreco((double) 10);
        estoque17.inserirProduto(produto23, (int) (byte) -1);
        int int31 = estoque17.consultarQuantidade("");
        br.ufrn.imd.Produto produto35 = new br.ufrn.imd.Produto("", "hi!", (double) 1L);
        produto35.setNome("");
        estoque17.inserirProduto(produto35, (int) (byte) 10);
        boolean boolean41 = estoque17.produtoExiste("");
        int int43 = estoque17.consultarQuantidade("");
        estoque17.removerProduto("hi!", 10);
        br.ufrn.imd.Estoque estoque47 = new br.ufrn.imd.Estoque();
        br.ufrn.imd.Produto produto51 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto51.setCodigo("hi!");
        estoque47.inserirProduto(produto51, (int) (byte) 0);
        estoque17.inserirProduto(produto51, (int) (byte) 10);
        br.ufrn.imd.Produto produto61 = new br.ufrn.imd.Produto("", "", (double) (byte) 0);
        estoque17.inserirProduto(produto61, 1);
        estoque0.inserirProduto(produto61, (-29));
        java.lang.Class<?> wildcardClass66 = estoque0.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test8461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8461");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        java.lang.String str8 = produto3.getCodigo();
        double double9 = produto3.getPreco();
        produto3.setPreco((double) 1.0f);
        java.lang.String str12 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test8462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8462");
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
        java.lang.String str33 = produto16.getCodigo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test8463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8463");
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
        produto82.setCodigo("");
        produto82.setCodigo("hi!");
        produto82.setPreco((-33.0d));
        java.lang.Class<?> wildcardClass99 = produto82.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test8464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8464");
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
        estoque0.removerProduto("hi!", 35);
        br.ufrn.imd.Produto produto75 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 10L);
        double double76 = produto75.getPreco();
        produto75.setPreco((double) 0);
        produto75.setPreco((double) (-91));
        double double81 = produto75.getPreco();
        double double82 = produto75.getPreco();
        estoque0.inserirProduto(produto75, (-10));
        int int86 = estoque0.consultarQuantidade("");
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
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 10.0d + "'", double76 == 10.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-91.0d) + "'", double81 == (-91.0d));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-91.0d) + "'", double82 == (-91.0d));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 35 + "'", int86 == 35);
    }

    @Test
    public void test8465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8465");
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
        boolean boolean44 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test8466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8466");
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
        boolean boolean41 = estoque0.produtoExiste("hi!");
        br.ufrn.imd.Produto produto45 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double46 = produto45.getPreco();
        java.lang.String str47 = produto45.getCodigo();
        java.lang.String str48 = produto45.getNome();
        produto45.setNome("hi!");
        double double51 = produto45.getPreco();
        produto45.setNome("hi!");
        produto45.setNome("hi!");
        produto45.setNome("hi!");
        produto45.setCodigo("hi!");
        estoque0.inserirProduto(produto45, (-67));
        estoque0.removerProduto("hi!", (-56));
        int int66 = estoque0.consultarQuantidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 100.0d + "'", double51 == 100.0d);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-2) + "'", int66 == (-2));
    }

    @Test
    public void test8467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8467");
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
        int int48 = estoque0.consultarQuantidade("");
        boolean boolean50 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test8468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8468");
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
        java.lang.String str20 = produto3.getNome();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8469");
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
        int int64 = estoque0.consultarQuantidade("hi!");
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
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 105 + "'", int64 == 105);
    }

    @Test
    public void test8470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8470");
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
        br.ufrn.imd.Produto produto41 = new br.ufrn.imd.Produto("hi!", "", (double) (-101));
        estoque0.inserirProduto(produto41, (-35));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test8471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8471");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setPreco((double) 8);
        java.lang.String str7 = produto3.getNome();
        java.lang.String str8 = produto3.getNome();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test8472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8472");
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
        br.ufrn.imd.Produto produto29 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double30 = produto29.getPreco();
        java.lang.String str31 = produto29.getCodigo();
        java.lang.String str32 = produto29.getNome();
        produto29.setNome("hi!");
        double double35 = produto29.getPreco();
        produto29.setNome("hi!");
        produto29.setCodigo("");
        estoque0.inserirProduto(produto29, (-11));
        int int43 = estoque0.consultarQuantidade("hi!");
        boolean boolean45 = estoque0.produtoExiste("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 99 + "'", int43 == 99);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test8473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8473");
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
        produto79.setPreco((double) (-201));
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
    }

    @Test
    public void test8474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8474");
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
        produto56.setPreco((double) (-2));
        double double67 = produto56.getPreco();
        java.lang.String str68 = produto56.getNome();
        produto56.setCodigo("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-2.0d) + "'", double67 == (-2.0d));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test8475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8475");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 35.0d);
        double double4 = produto3.getPreco();
        produto3.setCodigo("");
        produto3.setCodigo("");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test8476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8476");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 5);
        java.lang.String str4 = produto3.getCodigo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test8477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8477");
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
        int int67 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("", 29);
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
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-97) + "'", int67 == (-97));
    }

    @Test
    public void test8478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8478");
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
        boolean boolean24 = estoque0.produtoExiste("");
        // The following exception was thrown during execution in test generation
        try {
            estoque0.removerProduto("", (-29));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: O produto de co?digo  na?o existe no estoque.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test8479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8479");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 7);
    }

    @Test
    public void test8480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8480");
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
        int int55 = estoque0.consultarQuantidade("hi!");
        br.ufrn.imd.Estoque estoque56 = new br.ufrn.imd.Estoque();
        boolean boolean58 = estoque56.produtoExiste("");
        br.ufrn.imd.Produto produto62 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto62.setNome("hi!");
        produto62.setPreco((double) 10);
        estoque56.inserirProduto(produto62, (int) (byte) -1);
        int int70 = estoque56.consultarQuantidade("");
        estoque56.removerProduto("hi!", 1);
        int int75 = estoque56.consultarQuantidade("hi!");
        br.ufrn.imd.Produto produto79 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto79.setNome("hi!");
        produto79.setPreco((double) 10);
        java.lang.String str84 = produto79.getCodigo();
        double double85 = produto79.getPreco();
        produto79.setPreco((double) 1.0f);
        estoque56.inserirProduto(produto79, (int) (short) 0);
        java.lang.String str90 = produto79.getCodigo();
        produto79.setNome("hi!");
        java.lang.String str93 = produto79.getNome();
        estoque0.inserirProduto(produto79, 196);
        double double96 = produto79.getPreco();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-2) + "'", int75 == (-2));
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 10.0d + "'", double85 == 10.0d);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 1.0d + "'", double96 == 1.0d);
    }

    @Test
    public void test8481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8481");
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
        br.ufrn.imd.Produto produto78 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto78.setNome("hi!");
        produto78.setPreco((double) 10);
        produto78.setNome("hi!");
        java.lang.String str85 = produto78.getCodigo();
        double double86 = produto78.getPreco();
        java.lang.String str87 = produto78.getCodigo();
        produto78.setNome("hi!");
        estoque41.inserirProduto(produto78, 0);
        estoque0.inserirProduto(produto78, (-99));
        java.lang.String str94 = produto78.getNome();
        produto78.setCodigo("");
        produto78.setPreco((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 10.0d + "'", double86 == 10.0d);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
    }

    @Test
    public void test8482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8482");
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
        br.ufrn.imd.Produto produto32 = new br.ufrn.imd.Produto("", "hi!", (double) 1);
        estoque0.inserirProduto(produto32, (-11));
        produto32.setNome("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
    }

    @Test
    public void test8483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8483");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100.0f);
        java.lang.String str4 = produto3.getCodigo();
        produto3.setNome("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test8484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8484");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto3.setNome("hi!");
        produto3.setPreco((double) 10);
        produto3.setNome("hi!");
        double double10 = produto3.getPreco();
        java.lang.String str11 = produto3.getCodigo();
        double double12 = produto3.getPreco();
        java.lang.Class<?> wildcardClass13 = produto3.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test8485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8485");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        produto3.setNome("hi!");
        java.lang.String str7 = produto3.getNome();
        produto3.setCodigo("hi!");
        double double10 = produto3.getPreco();
        double double11 = produto3.getPreco();
        produto3.setNome("");
        produto3.setPreco((double) (byte) 0);
        produto3.setNome("");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test8486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8486");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "hi!", (double) 100);
        double double4 = produto3.getPreco();
        java.lang.String str5 = produto3.getCodigo();
        java.lang.String str6 = produto3.getNome();
        java.lang.String str7 = produto3.getCodigo();
        java.lang.String str8 = produto3.getNome();
        java.lang.String str9 = produto3.getCodigo();
        double double10 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test8487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8487");
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
        br.ufrn.imd.Produto produto67 = new br.ufrn.imd.Produto("hi!", "hi!", (-78.0d));
        produto67.setNome("hi!");
        estoque0.inserirProduto(produto67, 196);
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
    }

    @Test
    public void test8488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8488");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", 34.0d);
    }

    @Test
    public void test8489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8489");
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
        java.lang.Class<?> wildcardClass63 = produto50.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test8490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8490");
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
        br.ufrn.imd.Produto produto40 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 100);
        produto40.setPreco((double) '#');
        produto40.setPreco((double) 10);
        java.lang.String str45 = produto40.getNome();
        produto40.setPreco(0.0d);
        produto40.setNome("hi!");
        produto40.setPreco((double) 96);
        produto40.setCodigo("hi!");
        estoque0.inserirProduto(produto40, (-68));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-11) + "'", int36 == (-11));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
    }

    @Test
    public void test8491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8491");
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
        double double83 = produto67.getPreco();
        java.lang.String str84 = produto67.getCodigo();
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
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.0d + "'", double83 == 10.0d);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
    }

    @Test
    public void test8492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8492");
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
        java.lang.String str44 = produto30.getNome();
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test8493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8493");
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
        java.lang.String str63 = produto42.getNome();
        produto42.setCodigo("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test8494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8494");
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
        java.lang.String str70 = produto59.getCodigo();
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
    }

    @Test
    public void test8495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8495");
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
        br.ufrn.imd.Produto produto78 = new br.ufrn.imd.Produto("", "hi!", (double) 10);
        produto78.setNome("hi!");
        produto78.setPreco((double) 10);
        produto78.setNome("hi!");
        java.lang.String str85 = produto78.getCodigo();
        double double86 = produto78.getPreco();
        java.lang.String str87 = produto78.getCodigo();
        produto78.setNome("hi!");
        estoque41.inserirProduto(produto78, 0);
        estoque0.inserirProduto(produto78, (-99));
        java.lang.String str94 = produto78.getNome();
        java.lang.String str95 = produto78.getNome();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 10.0d + "'", double86 == 10.0d);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "hi!" + "'", str95, "hi!");
    }

    @Test
    public void test8496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8496");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("", "", (double) (-78));
        java.lang.String str4 = produto3.getCodigo();
        java.lang.String str5 = produto3.getNome();
        produto3.setPreco((-78.0d));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test8497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8497");
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
        int int63 = estoque0.consultarQuantidade("");
        boolean boolean65 = estoque0.produtoExiste("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test8498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8498");
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
        int int72 = estoque0.consultarQuantidade("hi!");
        estoque0.removerProduto("", (-78));
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
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 96 + "'", int72 == 96);
    }

    @Test
    public void test8499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8499");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "", (-63.0d));
        double double4 = produto3.getPreco();
        produto3.setCodigo("");
        double double7 = produto3.getPreco();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-63.0d) + "'", double4 == (-63.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-63.0d) + "'", double7 == (-63.0d));
    }

    @Test
    public void test8500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8500");
        br.ufrn.imd.Produto produto3 = new br.ufrn.imd.Produto("hi!", "hi!", (double) 102);
    }
}


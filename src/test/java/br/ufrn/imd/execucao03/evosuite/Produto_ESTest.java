/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 15 20:32:54 GMT 2024
 */

package br.ufrn.imd.execucao03.evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import br.ufrn.imd.Produto;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Produto_ESTest extends Produto_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Produto produto0 = new Produto("HK lU#", "HK lU#", 1917.0);
      produto0.setPreco(0.0);
      double double0 = produto0.getPreco();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Produto produto0 = new Produto("X'KCqO%_", "X'KCqO%_", (-2043.019462357));
      double double0 = produto0.getPreco();
      assertEquals((-2043.019462357), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Produto produto0 = new Produto((String) null, (String) null, 378.0);
      produto0.getNome();
      assertEquals(378.0, produto0.getPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Produto produto0 = new Produto("HK lU#", "HK lU#", 1917.0);
      produto0.getNome();
      assertEquals(1917.0, produto0.getPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Produto produto0 = new Produto((String) null, (String) null, 378.0);
      produto0.getCodigo();
      assertEquals(378.0, produto0.getPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Produto produto0 = new Produto("HK lU#", "HK lU#", 1917.0);
      produto0.getCodigo();
      assertEquals(1917.0, produto0.getPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Produto produto0 = new Produto("", "", 2603.007378);
      double double0 = produto0.getPreco();
      assertEquals(2603.007378, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Produto produto0 = new Produto("", "", 2603.007378);
      produto0.setCodigo("");
      assertEquals(2603.007378, produto0.getPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Produto produto0 = new Produto("", "", 2603.007378);
      produto0.getNome();
      assertEquals(2603.007378, produto0.getPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Produto produto0 = new Produto("", "", 2603.007378);
      produto0.getCodigo();
      assertEquals(2603.007378, produto0.getPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Produto produto0 = new Produto("", "", 2603.007378);
      produto0.setNome("");
      assertEquals(2603.007378, produto0.getPreco(), 0.01);
  }
}
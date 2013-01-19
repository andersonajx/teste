package br.com.teste;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TesteTest {

	@Test
	public void instance() {
		Teste teste1 = Teste.newInstance("Fulano");
		
		assertNotNull(teste1);
		
		Teste teste2 = Teste.newInstance("");
		
		assertNotNull(teste2);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void instanceError() {
		Teste.newInstance(null);
	}

}

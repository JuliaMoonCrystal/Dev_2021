package com.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.mock;

public class CalculadoraTest {

	@Test
	public void test() {
		
		Calculadora calc= new Calculadora();
		int sum= calc.somar("1+1+3");
		assertEquals(5, sum);
	}
	
	@Test
	public void testeSomarComMock(){
		Calculadora calculadora= mock(Calculadora.class);
		
		when(calculadora.somar("1+2").thenReturn(10));
		int resultado = calculadora.somar("1+2");
		
		assertEquals(10, resultado);
	}

}

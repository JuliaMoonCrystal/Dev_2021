package com.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraNovaTest {
  
	
	@Test
	public void SomaDoisValores(){
		int valorA=1;
		int valorB=2;
		int soma=0;
		
		CalculadoraNova calc = new CalculadoraNova();
		soma=calc.Somar(valorA, valorB);
		
		assertEquals(3, soma);
	}
	
	@Test
	public void SomaTresValores(){
		int valorA=1;
		int valorB=2;
		int valorC=3;
		int soma=0;
		
		CalculadoraNova calc = new CalculadoraNova();
		soma=calc.Somar(valorA, valorB,valorC);
		
		assertEquals(6, soma);
	}
}

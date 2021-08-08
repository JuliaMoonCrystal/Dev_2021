package com.teste;

public class CalculadoraNova {

	public int Somar(int ...valores){
		int soma=0;
		for(int valor :valores){
			soma+= valor;
		}
		
		
		return soma;
		
	}
}

package com.teste;

import org.junit.Test;

public class AssertJTest {

	@Test
	public void checkEquality(){
		Pessoa pessoa = new Pessoa("Obama", "Barrack");
		Pessoa pessoaClone=pessoa;
		
		asserThat(pessoa).setEqualTo(pessoaClone);
	}
}

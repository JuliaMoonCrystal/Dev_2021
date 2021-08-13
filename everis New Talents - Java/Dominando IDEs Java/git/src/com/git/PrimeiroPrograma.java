package com.git;

import com.git.br.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		 Gato gato = new Gato(null, null, null);
		// Livro livro = new Livro();
		
		/*
		int a=3;
		int b=10;
		
		System.out.println("Hello word"+" "+(a+b));
	*/
	}
	
	public class Livro{
		private String nome;
		private Integer qtdPaginas;
		
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Integer getQtdPaginas() {
			return qtdPaginas;
		}
		public void setQtdPaginas(Integer qtdPaginas) {
			this.qtdPaginas = qtdPaginas;
		}
	}

}

package com.git.br;

public class Gato {
   private String nome;
   private String cor;
   private Integer idade;
   
   public Gato(String nome, String cor, Integer idade) {
	   this.nome = nome;
	   this.cor = cor;
	   this.idade = idade;
   }
@Override
public String toString() {
	return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((cor == null) ? 0 : cor.hashCode());
	result = prime * result + ((idade == null) ? 0 : idade.hashCode());
	result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	return result;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public Integer getIdade() {
	return idade;
}
public void setIdade(Integer idade) {
	this.idade = idade;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Gato other = (Gato) obj;
	if (cor == null) {
		if (other.cor != null)
			return false;
	} else if (!cor.equals(other.cor))
		return false;
	if (idade == null) {
		if (other.idade != null)
			return false;
	} else if (!idade.equals(other.idade))
		return false;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	return true;
}
	
}

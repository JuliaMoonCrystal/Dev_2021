package Entidades;

public class Contato {
  private String nome;
  private Integer numero;
  
  public Contato(String nome,Integer numero){
	  this.nome=nome;
	  this.numero=numero;
  }
  
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Integer getNumero() {
	return numero;
}
public void setNumero(Integer numero) {
	this.numero = numero;
}
}

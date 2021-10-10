package Entidades;

import java.util.List;

public class Votacao {
	private int numeroSecao;
	private String localizacao;

	public Votacao() {
	}

	public Votacao(int numeroSecao, String localizacao) {
		super();
		this.numeroSecao = numeroSecao;
		this.localizacao = localizacao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public int getNumeroSecao() {
		return numeroSecao;
	}

	public void setNumeroSecao(int numeroSecao) {
		this.numeroSecao = numeroSecao;
	}

	public List<Votacao> addVotacao(List<Votacao> votacao) {

		 votacao.add(new Votacao(12345,"Escola Estadual Jardin-Zona leste"));
		 votacao.add(new Votacao(54321,"Escola Estadual Fernandes-Zona norte"));
		 votacao.add(new Votacao(67890,"Escola Estadual Esperança-Zona oeste"));
		 votacao.add(new Votacao(19876,"Escola Estadual Olinda-Zona sudeste"));
		 votacao.add(new Votacao(91827,"Escola Estadual Horizonte-Zona sul"));
		 
		return votacao;
	}

}

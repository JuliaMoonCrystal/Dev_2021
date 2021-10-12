package Entidades;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

	public List<Votacao> addVotacao(List<Votacao> votacao) throws IOException {

		File file = new File("Locais.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

		votacao.add(new Votacao(12345, "Escola Estadual Jardin-Zona leste"));
		votacao.add(new Votacao(54321, "Escola Estadual Fernandes-Zona norte"));
		votacao.add(new Votacao(67890, "Escola Estadual Esperança-Zona oeste"));
		votacao.add(new Votacao(19876, "Escola Estadual Olinda-Zona sudeste"));
		votacao.add(new Votacao(91827, "Escola Estadual Horizonte-Zona sul"));

		for (Votacao rodar : votacao) {
			writer.write("\n");
			writer.write("Número da seção :" + rodar.getNumeroSecao() + " Localização :" + rodar.getLocalizacao());
			writer.newLine();
		}
		writer.close();

		return votacao;
	}

}

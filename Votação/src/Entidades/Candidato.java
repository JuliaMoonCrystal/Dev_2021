package Entidades;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Candidato {
	private String nome;
	private String cargo;
	private int numCandidato;
	private String nomePartido;
	private int votos;

	// contrutor vazio para não ter a obrigação de passar os atributos
	public Candidato() {
	}
	
	
	public Candidato(String nome, String cargo, int numCandidato, String nomePartido,int votos) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.numCandidato = numCandidato;
		this.nomePartido = nomePartido;
		this.votos=votos;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumCandidato() {
		return numCandidato;
	}

	public void setNumCandidato(int numCandidato) {
		this.numCandidato = numCandidato;
	}

	public String getNomePartido() {
		return nomePartido;
	}

	public void setNomePartido(String nomePartido) {
		this.nomePartido = nomePartido;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getVotos() {
		return votos;
	}


	public void setVotos(int votos) {
		this.votos = votos;
	}

	public List<Candidato> addCandidatos(List<Candidato> candidatos) throws IOException {
		
		File file= new File("Candidatos.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter( file, true ));
		
		if(file.exists()) {/*Essa verificação serve para para ver se o arquivo já esxite*/
			  file.delete();
		  }
			
		candidatos.add(new Candidato("José das Graças","Deputado",1,"Partito Partido",0));
		candidatos.add(new Candidato("Marias das Graças","Deputada",2,"Partito Par",0));
		candidatos.add(new Candidato("Allan da Silva","Prefeito",3,"Partito Impar",0));
		candidatos.add(new Candidato("Alana Ferreira","Prefeita",4,"Partito Monoromatico",0));
		candidatos.add(new Candidato("Thadeu Oliveira","Governadora",5,"Partito heterocromatico",0));
		candidatos.add(new Candidato("Jhonatas Oliver","Governador",6,"Partito Par",0));
		candidatos.add(new Candidato("Joseph Joestar","Presidente",7,"Partito Impar",0));
		candidatos.add(new Candidato("Jotaro kujo","Presidente",8,"Partito Monocromatico",0));
		candidatos.add(new Candidato("Jonathan Hooly","Deputado",9,"Partito Heterocromatico",0));
		candidatos.add(new Candidato("Master Piece","Deputada",10,"Partito Partido",0));
		
		for(Candidato rodar : candidatos){
		  writer.write("\n");	
      	  writer.write("Nome do candidato:"+rodar.getNome()+"\nCargo : "+rodar.getCargo()
      	  +"\nNúmero do candidato : "+rodar.getNumCandidato()+"\nNome do partido :"+rodar.getNomePartido());
      	 
      	  writer.newLine();	
      }         
      writer.close();
		
		return candidatos;
	}

}

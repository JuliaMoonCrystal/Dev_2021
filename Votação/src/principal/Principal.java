package principal;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Entidades.Candidato;
import Entidades.Votacao;

public class Principal {
	public static void main(String[] args) throws Exception {
		// instancia��o das classes
		List<Candidato> candidatos = new ArrayList<>();
		List<Votacao> votacao = new ArrayList<>();

		/* metodos para garantir que as listas j� estejam alimentadas */
		Candidato c = new Candidato();
		Votacao v = new Votacao();

		candidatos = c.addCandidatos(candidatos);
		votacao = v.addVotacao(votacao);

		/* variavel de op��o e do scanner */
		int opc = 0;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("-------------------------------------------------");
			System.out.println(
					"\n1-Votar em um candidato \n2-Consultar a lista de Locais de vota��o \n3-Consultar lista de candidatos"
							+ " \n4-Pesquisar locais de vota��o \n5-Pesquisar candidato \n9-Sair");
			System.out.println("-------------------------------------------------");

			System.out.println("\nDigite a sua op��o :");
			opc = scan.nextInt();
			switch (opc) {
			case 1:
				Votar(candidatos, votacao);
				break;

			case 2:
				listarLocais(votacao);
				break;

			case 3:
				listarCandidatos(candidatos);
				break;

			case 4:
				pesquisarLocais(votacao);
				break;
				
			case 5:
				pesquisarCandidatos(candidatos);
				break;
				
			case 0:
				System.out.println("\nOp��o indisponivel!!!");
				break;


			}
		} while (opc != 9);

	}

	private static void pesquisarCandidatos(List<Candidato> candidatos) {
		Scanner scaner = new Scanner(System.in);
		System.out.println("\nDigite o nome do candidato : ");
		String nome_can = scaner.nextLine();
		
		for (Candidato rodar : candidatos) {
			if(rodar.getNome().equals(nome_can)){
				System.out.println("\nO candidato esta disponivel para vota��o!!!");
			}
			else{
				System.out.println("\nO candidato n�o esta disponivel para vota��o!!!");
			}
		}	
	}

	private static void pesquisarLocais(List<Votacao> votacao) throws Exception, IOException {
		
		Scanner scaner = new Scanner(System.in);
		System.out.println("\nDigite o local da vota��o : ");
		String nome_local = scaner.nextLine();
		
		for (Votacao votacao2 : votacao) {
			if(votacao2.getLocalizacao().equals(nome_local)){
				System.out.println("\nO local esta disponivel para vota��o!!!");
			}
			
		}	
		System.out.println("\nO local n�o esta disponivel para vota��o!!!");
	}

	private static void listarCandidatos(List<Candidato> candidatos) {
		System.out.println("-----------------------------------------------------------------");
		for (Candidato rodar : candidatos) {
			System.out.println(rodar.toString());
		}
		System.out.println("-----------------------------------------------------------------");
	}

	private static void listarLocais(List<Votacao> votacao) {
		System.out.println("-----------------------------------------------------------------");
		for (Votacao votacao2 : votacao) {
			System.out.println(
					"\nNumero da Se��o:" + votacao2.getNumeroSecao() + " Localiza��o :" + votacao2.getLocalizacao());
		}
		System.out.println("-----------------------------------------------------------------");
	}

	private static void Votar(List<Candidato> candidatos, List<Votacao> votacao) throws IOException {
		/*
		 * Nesse metodo o sistema vai pegar o numero do voto e gravar as
		 * infoema��es em um arquivo
		 */

		File file = new File("Votos.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

		Scanner scan = new Scanner(System.in);
		System.out.println("\nDigite o numero do candidato:");
		int votos = scan.nextInt();

		for (Candidato rodar : candidatos) {
			if (rodar.getNumCandidato() == votos) {
				rodar.setVotos(rodar.getVotos() + 1);
				writer.write("O candidato :" + rodar.getNome() + " Teve um total de :" + rodar.getVotos() + " Votos");
			}
			writer.newLine();
		}
		writer.close();

	}

}

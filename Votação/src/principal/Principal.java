package principal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Candidato;
import Entidades.Votacao;

public class Principal {
	public static void main(String[] args) throws IOException {
		// instanciação das classes
		List<Candidato> candidatos = new ArrayList<>();
		List<Votacao> votacao = new ArrayList<>();

		/* metodos para garantir que as listas já estejam alimentadas */
		Candidato c = new Candidato();
		Votacao v = new Votacao();

		candidatos = c.addCandidatos(candidatos);
		votacao = v.addVotacao(votacao);

		/* variavel de opção e do scanner */
		int opc = 0;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("-------------------------------------------------");
			System.out.println(
					"\n1-Votar em um candidato \n2-Consultar a lista de Locais de votação \n3-Consultar lista de candidatos"
							+ " \n4-Pesquisar locais de votação \n5-Pesquisar candidato \n9-Sair");
			System.out.println("-------------------------------------------------");

			System.out.println("\nDigite a sua opção :");
			opc = scan.nextInt();
			switch (opc) {
			case 1:
				Votar(candidatos, votacao);
				break;

			case 2:
				listarLocais(votacao);
				break;
				
			case 3:
				listarCandidatod(candidatos);
				break;

			}
		} while (opc != 9);

	}

	private static void listarCandidatod(List<Candidato> candidatos) {
		 System.out.println("-----------------------------------------------------------------");
			for (Candidato rodar : candidatos) {
				System.out.println(rodar.toString());
			}
			System.out.println("-----------------------------------------------------------------");
	}

	private static void listarLocais(List<Votacao> votacao) {
        System.out.println("-----------------------------------------------------------------");
		for (Votacao votacao2 : votacao) {
			System.out.println("\nNumero da Seção:"+votacao2.getNumeroSecao()+" Localizaçãp :"+votacao2.getLocalizacao());
		}
		System.out.println("-----------------------------------------------------------------");
	}

	private static void Votar(List<Candidato> candidatos, List<Votacao> votacao) throws IOException {
		/*
		 * Nesse metodo o sistema vai pegar o numero do voto e gravar as
		 * infoemações em um arquivo
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

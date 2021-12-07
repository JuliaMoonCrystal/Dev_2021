package Exercicio1;

public class Mensagem {

	public static void obterMnesagem(int hora) {
		switch (hora) {
		case 1:
		 break;

		case 2:
			 break;
			 
		case 3:
			 break;
			 
		case 4:
			 break;
			 
		case 5:
			 break;
			 
		case 6:
			mensagemBomDia();
			 break;
			 
		case 7:
			 break;
			 
		case 8:
			 break;
			 
		case 9:
			 break;
			 
		case 10:
			 break;
			 
		case 11:
			 break;
			 
		case 12:
			mensagemBoaTarde();
			 break;
		default:
			System.out.println("Horário inválido");
			break;
		}
		
	}

	private static void mensagemBoaTarde() {
		System.out.println("Bom Tarde usuário");
		
	}

	private static void mensagemBomDia() {
		System.out.println("Boa dia usuário");
		
	}

}

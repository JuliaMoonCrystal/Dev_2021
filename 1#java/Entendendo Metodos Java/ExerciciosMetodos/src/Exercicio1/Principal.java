package Exercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
		//Exercitando a mensagem
		 System.out.println("Mensagem");
		 Mensagem.obterMnesagem(6);
		 Mensagem.obterMnesagem(12); 
		 Mensagem.obterMnesagem(13); 
		 
		//Exercitando a parcela
		 System.out.println("\nParcelas");
		 Parcelas.calcular(500.50, Parcelas.getumaParcela());
		 Parcelas.calcular(100, Parcelas.gettresParcela());
		 Parcelas.calcular(1000, Parcelas.getduasParcela());
		 
		// Calculadora
	     System.out.println("\nExercício calculadora");
	     Calculadora.soma(3, 6);
         Calculadora.subtracao(9, 1.8);
         Calculadora.multiplicacao(7, 8);
         Calculadora.divisao(5, 2.5);
	}

}

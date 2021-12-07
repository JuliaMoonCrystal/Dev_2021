package Exercicio1;

public class Parcelas {

	public static int getumaParcela() {
		// TODO Auto-generated method stub
		return 1;
	}

	public static void calcular(double valor, int parcelas) {
		if (parcelas == 2) {

            double valorFinal = valor + (valor * getduasParcela());

            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {

            double valorFinal = valor + (valor * gettresParcela());

            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }
	}

	public static int gettresParcela() {
		// TODO Auto-generated method stub
		return 3;
	}

	public static int getduasParcela() {
		// TODO Auto-generated method stub
		return 4;
	}

}

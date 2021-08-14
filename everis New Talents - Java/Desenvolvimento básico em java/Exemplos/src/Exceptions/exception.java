
package Exceptions;

public class exception {

	public static void main(String[] args) {

		metodo();
	}

	private static void metodo() {

		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (java.io.FileNotFoundException e) {
		    System.out.println("Arquivo não encontrado");
		}
	}

}

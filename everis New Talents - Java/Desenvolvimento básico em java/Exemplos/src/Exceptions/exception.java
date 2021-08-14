
package Exceptions;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class exception {

	public static void main(String[] args) {

		metodo();
		//metodo2();
		pegaPlaca();
	}

private static void pegaPlaca() {
		 try {
			CarroVo carro = new CarroVo();
			carro.getPlaca();
		} catch (IntegrationException e) {
       throw new BusinessException("Erro na criação do objeto");
		}
	}

/*	private static void metodo2() {
try {
	Object con;
	Object query;
	//PreparedStatement stmt= con.prepareStatement(query);
} catch (SQLException e) {
   // throw new Exception("Problema na criação do Statment", e);
   }		
	}
*/
	private static void metodo() {

		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (java.io.FileNotFoundException e) {
		    System.out.println("Arquivo não encontrado");
		}
	}

}

package Conta_Bancaria;

import javax.swing.JOptionPane;


public class MenuConta {

	public static void main(String[] args) {
      //Aqui o usu�rio vai escolher qual a��o vai realizar//
		
		int opc=0;
		
		 do{
			  opc = Integer.parseInt(JOptionPane.showInputDialog("----------Bem-Vindo----------- \n1 -Sacar da Conta Corrente- "
					+"\n2  -Consultar Conta-"  
			  		+ "\n3 -Pagar Fatura do Cart�o- \n4 -Pagar Boleto- \n5 -Recarga de celular- \n6 -Depositar na poupan�a- "
			  		+"\n9 -Finalizar consulta"));
	       
			  
	            switch (opc)
	            {
//	                  case 1: dados_lista =metodos.Create(dados_lista);
//	                             break;
//	                  case 2: metodos.Read(dados_lista);
//	                             break;
//	                  case 3: dados_lista=metodos.Update(dados_lista);
//	                             break;
//	                  case 4: metodos.Delete(dados_lista);
//	                             break;
//	                  case 5: ordena.Ordena_Selection(vetor);
//	                             break;
//	                  case 6: ordena.Ordena_Bubble(dados_lista);
//	                             break;
//	                  case 7: metodos.Pesquisa(dados_lista);
//	                             break;
//	                  case 8: hr.insereRegioes(dados_lista);
//	                             break;            

	                  case 9: JOptionPane.showMessageDialog(null,"-----FIM-----");
	                             break;             
	                  default: JOptionPane.showMessageDialog(null,"opc inv�lida");
	            }
	        }
	      while(opc != 9);
	     }
		
	}



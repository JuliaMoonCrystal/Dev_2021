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
			  
			  //Criando novos objetos//
	           operacoes metodos= new operacoes();
			   Conta conta= new Conta();
			   
			   //Valores j� determinados para facilitar os testes//
	           conta.setNumConta(21435674);
	           conta.setSaldo(1000);
	           
	            switch (opc)
	            {
	                  case 1: conta =metodos.sacar(conta);
	                             break;
	                  case 2: metodos.consulta(conta);
	                             break;
	                  case 3: conta=metodos.PagarBoleto(conta);
	                             break;
	                  case 4: conta=metodos.RecargaCelular(conta);
	                             break;
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



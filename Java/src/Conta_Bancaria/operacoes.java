package Conta_Bancaria;

import javax.swing.JOptionPane;

public class operacoes {
//Nessa classe  est�o todas as opera��es possiveis//
	

	public Conta sacar(Conta conta) {
       
		int opc=0;
	    opc = Integer.parseInt(JOptionPane.showInputDialog("----------Qual a sua ag�ncia Banc�ria----------- \n1 -Nubank- "
					+"\n2  -Ita�-"  
			  		+ "\n3 -Santander- \n4 -Bradesco- \n5 -Banco do Brasil-"));
			  		
  
        switch(opc) {
        case 1:
        	conta.setNome("Nubank");
        	System.out.println("-------------------------- "+""
        			+ "\n "+conta.getNome()+
        			"\n "+conta.getNumConta()+
        			"\n "+conta.getSaldo()+
        			"\n -----------------");
        	break;
		case 2:
        	conta.setNome("Ita�");
        	System.out.println("-------------------------- "+""
        			+ "\n "+conta.getNome()+
        			"\n "+conta.getNumConta()+
        			"\n "+conta.getSaldo()+
        			"\n -----------------");
        	break;
        	
        case 3:
        	conta.setNome("Santander");
        	System.out.println("-------------------------- "+""
        			+ "\n "+conta.getNome()+
        			"\n "+conta.getNumConta()+
        			"\n "+conta.getSaldo()+
        			"\n -----------------");
        	break;
        
        case 4:
        	conta.setNome("Bradesco");
        	System.out.println("-------------------------- "+""
        			+ "\n "+conta.getNome()+
        			"\n "+conta.getNumConta()+
        			"\n "+conta.getSaldo()+
        			"\n -----------------");
        	break;
     
	    case 5:
         	conta.setNome("Banco do Brasil");
         	System.out.println("-------------------------- "+""
        			+ "\n "+conta.getNome()+
        			"\n "+conta.getNumConta()+
        			"\n "+conta.getSaldo()+
        			"\n -----------------");
         	break;
      }
        
        
        //Aqui o valor sacado � informado//
        double valor=Double.parseDouble(JOptionPane.showInputDialog("Qual o valor h� ser sacado?"));
        double saldo=conta.getSaldo();
        saldo=saldo-valor;        
        conta.setSaldo(saldo);
        
        //teste para ver a saida do saldo est� certa
        System.out.println("O seu Saldo atual �: "+conta.getSaldo());
        
  return conta;
	  }

	public void consulta(Conta conta) {
         JOptionPane.showMessageDialog(null,"--------------------"+
	      "\n  O n�mero da sua conta � :"+conta.getNumConta()+
	      "\n  A sua agencia � : "+conta.getNome()+
	      "\n  O seu saldo atual � de  :"+conta.getSaldo()+" R$ "+
	      "\n  O valor guardado na poupan�a � de : "+conta.getPoupanca()+" R$ "+
	      "\n----------------------");
	}

	public Conta PagarFatura(Conta conta) {
         double valorFatura=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da fatura"));
         
         
         System.out.println("-------------\n"+conta.getSaldo());
         conta.setSaldo(conta.getSaldo()-valorFatura);
         System.out.println("-------------\n"+conta.getSaldo());
		
		return conta;
	}

	public Conta PagarBoleto(Conta conta) {
        double valorBoleto=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Boleto"));
        
        System.out.println("-------------\n"+conta.getSaldo());
        conta.setSaldo(conta.getSaldo()-valorBoleto);
        System.out.println("-------------\n"+conta.getSaldo());
        
		return conta;
	}

	public Conta RecaregarCelular(Conta conta) {
		 double valorRecarga=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Recarga"));
	        
	        System.out.println("-------------\n"+conta.getSaldo());
	        conta.setSaldo(conta.getSaldo()-valorRecarga);
	        System.out.println("-------------\n"+conta.getSaldo());
	        
		return conta;
	}

	public Conta DepositarPoupanca(Conta conta) {
        double valorDepodito;
        valorDepodito=Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR QUE VAI SER DEPOSITADO"));
		
        //teste para ver a saida da poupan�a
        
        conta.setPoupanca(conta.getPoupanca()+valorDepodito);
        
        System.out.println("------------ \n"+conta.getPoupanca());
		return conta;
	}
	
	// esse metodo vai servir para verificar se o usuario possui dinheiro na conta//
	
	public void Verifica() {
		
	}

	public Conta depositarConta(Conta conta) {
        double valor=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado : ")); 	
		conta.setSaldo(conta.getSaldo()+valor);
		
		//teste de saida do deposito//
		System.out.println(" O valor depositado foi esse : "+valor+" e o seu sal atual e de : "+ conta.getSaldo());
		
		return conta;
	}
	
	
}

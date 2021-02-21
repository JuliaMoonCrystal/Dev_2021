package Conta_Bancaria;

import javax.swing.JOptionPane;

public class operacoes {
//Nessa classe  estão todas as operações possiveis//
	

	public Conta sacar(Conta conta) {
       
		int opc=0;
	    opc = Integer.parseInt(JOptionPane.showInputDialog("----------Qual a sua agência Bancária----------- \n1 -Nubank- "
					+"\n2  -Itaú-"  
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
        	conta.setNome("Itaú");
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
        
        
        //Aqui o valor sacado é informado//
        double valor=Double.parseDouble(JOptionPane.showInputDialog("Qual o valor há ser sacado?"));
        double saldo=conta.getSaldo();
        saldo=saldo-valor;        
        conta.setSaldo(saldo);
        
        //teste para ver a saida do saldo está certa
        System.out.println("O seu Saldo atual é: "+conta.getSaldo());
        
  return conta;
	  }

	public void consulta(Conta conta) {
         JOptionPane.showMessageDialog(null,"--------------------"+
	      "\n  O número da sua conta é :"+conta.getNumConta()+
	      "\n  A sua agencia é : "+conta.getNome()+
	      "\n  O seu saldo atual é de  :"+conta.getSaldo()+
	      "\n  O valor guardado na poupança é de : "+conta.getPoupanca()+
	      "\n----------------------");
	}

	public Conta PagarFatura(Conta conta) {
         double valorFatura=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da fatura"));
         
         
         System.out.println("-------------\n"+conta.getSaldo());
         conta.setSaldo(conta.getSaldo()-valorFatura);
         System.out.println("-------------\n"+conta.getSaldo());
		
		return null;
	}

	public Conta PagarBoleto(Conta conta) {

		return conta;
	}

	public Conta RecaregarCelular(Conta conta) {

		return conta;
	}

	public Conta DepositarPoupanca(Conta conta) {
        double valorDepodito;
        valorDepodito=Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR QUE VAI SER DEPOSITADO"));
		
        //teste para ver a saida da poupança
        
        conta.setPoupanca(conta.getPoupanca()+valorDepodito);
        
        System.out.println("------------ \n"+conta.getPoupanca());
		return conta;
	}
	
	
	
}

package Conta_Bancaria;

import javax.swing.JOptionPane;

public class operacoes {
//Nessa classe  estão todas as operações possiveis//
	

	public Conta sacar(Conta conta) {
       
		int opc=0;
	    opc = Integer.parseInt(JOptionPane.showInputDialog("----------Qual a sua agencia----------- \n1 -Nubank- "
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
        
        
        //Aqui o valoe sacado é informado//
        double valor=Double.parseDouble(JOptionPane.showInputDialog("Qual o valor há ser sacado?"));
        double saldo=conta.getSaldo();
        saldo=saldo-valor;        
        conta.setSaldo(saldo);
        
        //teste para ver a saida do saldo
        System.out.println("O seu Saldo atual é: "+conta.getSaldo());
        
  return conta;
	  }

	public void consulta(Conta conta) {
         System.out.println("--------------------"+
	      "\n  O número da sua conta é :"+conta.getNumConta()+
	      "\n  A sua agencia é :"+conta.getNome()+
	      "\n  O seu saldo é :"+conta.getSaldo());
	}

	public Conta PagarBoleto(Conta conta) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

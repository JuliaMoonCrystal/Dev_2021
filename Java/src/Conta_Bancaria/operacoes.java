package Conta_Bancaria;

import javax.swing.JOptionPane;

public class operacoes {
//Nessa classe  est�o todas as opera��es possiveis//
	

	public Conta sacar(Conta conta) {
       
		int opc=0;
	    opc = Integer.parseInt(JOptionPane.showInputDialog("----------Qual a sua agencia----------- \n1 -Nubank- "
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
        
        
        //Aqui o valoe sacado � informado//
        double valor=Double.parseDouble(JOptionPane.showInputDialog("Qual o valor h� ser sacado?"));
        double saldo=conta.getSaldo();
        saldo=saldo-valor;        
        conta.setSaldo(saldo);
        
        //teste para ver a saida do saldo
        System.out.println("O seu Saldo atual �: "+conta.getSaldo());
        
  return conta;
	  }

	public void consulta(Conta conta) {
         System.out.println("--------------------"+
	      "\n  O n�mero da sua conta � :"+conta.getNumConta()+
	      "\n  A sua agencia � :"+conta.getNome()+
	      "\n  O seu saldo � :"+conta.getSaldo());
	}

	public Conta PagarBoleto(Conta conta) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

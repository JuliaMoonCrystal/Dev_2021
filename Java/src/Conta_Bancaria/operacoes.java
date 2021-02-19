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
        	break;
		case 2:
        	conta.setNome("Itaú");
        	break;
        	
        case 3:
        	conta.setNome("Santander");
        	break;
        
        case 4:
        	conta.setNome("Bradesco");
        	break;
     
	    case 5:
         	conta.setNome("Banco do Brasil");
         	break;
      }
        
        
  return conta;
	  }
}

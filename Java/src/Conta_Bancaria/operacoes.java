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
        	break;
		case 2:
        	conta.setNome("Ita�");
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

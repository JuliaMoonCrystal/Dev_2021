package práticas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ExerciciosSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Crie um conjunto contendo as cores do arco-íris e:*/
		
		Set<String> cores= new HashSet<>(Arrays.asList("Vermelho","Azul","Verde","Amarelo","Roxo","Laranja","Indigo"));
		
		System.out.println("Exiba todas as cores uma abaixo da outra");
		Iterator<String> iterator= cores.iterator();
		while(iterator.hasNext()){
			String next= iterator.next();
			System.out.println(" Cores do arco-íris :"+ next);
		}
		
		System.out.println("\nA quantidade de cores que o arco-íris tem: "+cores.size());
		System.out.println("\nExiba as cores em ordem alfabética");
		List<String> cor= new ArrayList<>(cores);
		Collections.sort(cor);
		System.out.println("\n"+cor);
		
		System.out.println("Exiba as cores na ordem inversa da que foi informada");
		
	}	

}

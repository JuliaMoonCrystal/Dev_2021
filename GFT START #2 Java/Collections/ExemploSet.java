package práticas;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(" Crie um conjunto e direcione as notas :");
		Set<Double> notas=new HashSet<>(Arrays.asList(7.2,8.0,9.3,6.1,3.9,5.1,4.3,1.2));
		System.out.println(notas.toString());
		
		/*exibindo a posição da nota 3.9
		 * Com o set você não consegue perquisar por um valor 
		 * especifico pelo indice já que a inserção e feta de forma aleatória
		 * 
		 * 
		 */
		System.out.println("Confira se a nota 9.3 está no conjunto");
		System.out.println(notas.contains(9.3));
		
		System.out.println("Exiba a menor nota : "+Collections.min(notas));
		System.out.println("Exiba a maior nota : "+Collections.max(notas));
		
		Iterator<Double> interator= notas.iterator();
		Double soma=0.0;
		
		while (interator.hasNext()) {
			Double next= interator.next();
			soma+=next;
		}
		
		System.out.println("A soma dos valores é : "+soma);
		
		System.out.println("A média das nota é : "+(soma/notas.size()));
		
		System.out.println("Removendo a nota 3.9  "+notas.remove(3.9));
		System.out.println("Teste com a nota removida "+notas.toString());
		
		System.out.println("Removendo as notas menores que 7.0");
		
		Iterator<Double> iterator1= notas.iterator();
		while(iterator1.hasNext()){
			Double next=iterator1.next();
			if(next <7){
				iterator1.remove();
				System.out.println(" Elemento removido : "+" [ "+next+" ] ");
			}
		}
		
		System.out.println("Conjunto depois das remoções :"+notas.toString());
		
		System.out.println("Exiba as notas na ordem que foram informados");
		Set<Double> nota = new LinkedHashSet<>();
		nota.add(7.5);
		nota.add(5.5);
		nota.add(1.0);
		nota.add(9.0);
		nota.add(10.0);
		nota.add(6.5);
		
		System.out.println("Exibindo a nota: "+nota.toString());

		/*Esse funciona porque o TreeSet tem o comparable*/
		
		System.out.println(" \n\t Exiba as notas na ordem crescente");
		Set<Double> notas2= new TreeSet<>(nota);
		System.out.println("\n"+notas2.toString());
		
		System.out.println("/t Apagando todo o conjunto");
		notas.clear();
		nota.clear();
		System.out.println("\t notas :"+notas+ "\n\t nota :"+nota);
	}

}

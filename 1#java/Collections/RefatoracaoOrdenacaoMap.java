package práticas;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;

import Entidades.Contato;

public class RefatoracaoOrdenacaoMap {
	 public static void main(String[] args) {
	        System.out.println("--\tOrdem aleatória\t--");
	        Map<Integer, Contato> agenda = new HashMap() {{
	           put(1, new Contato("Simba", 5555));
	           put(4, new Contato("Cami", 1111));
	           put(3, new Contato("Jon", 2222));
	        }};
	        System.out.println(agenda);
	        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
	            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
	        }

	        System.out.println("--\tOrdem Inserção\t--");
	        Map<Integer, Contato> agenda1 = new LinkedHashMap() {{
	            put(1, new Contato("Simba", 5555));
	            put(4, new Contato("Cami", 1111));
	            put(3, new Contato("Jon", 2222));
	        }};
	        System.out.println(agenda1);
	        for (Map.Entry<Integer, Contato> entry: agenda1.entrySet()) {
	            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
	        }

	        System.out.println("--\tOrdem id\t--");
	        Map<Integer, Contato> agenda2 = new TreeMap(agenda);
	        System.out.println(agenda2);
	        for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) {
	            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
	        }

	        System.out.println("--\tOrdem número telefone\t--");
	        //precisamos organizar os valores. Logo:
	        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
	            @Override
	            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
	                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
	            }
	        });

	        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(
	                new Function<Map.Entry<Integer, Contato>, Integer>() {
	                    @Override
	                    public Integer apply(Map.Entry<Integer, Contato> cont) {
	                        return cont.getValue().getNumero();
	                    }
	                }));

	        Set<Map.Entry<Integer, Contato>> set11 = new TreeSet(Comparator.comparing(
	                cont -> ((Entry<Integer, Contato>) cont).getValue().getNumero()));
	        set11.addAll(agenda.entrySet());
	        for (Map.Entry<Integer, Contato> entry: set11) {
	            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
	                    ": " +entry.getValue().getNome());
	        }

	        System.out.println("--\tOrdem nome contato\t--");
	        //precisamos organizar os valores. Logo:
	        Set<Map.Entry<Integer, Contato>> set111 = new TreeSet(Comparator.comparing(
	                cont -> ((Entry<Integer, Contato>) cont).getValue().getNome()));
	        set111.addAll(agenda.entrySet());
	        //imprimindo usando forEach
	        set111.forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue().getNome()));
	    }
	}

	class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
	    @Override
	    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
	        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
	    }
	}

	class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {
	    @Override
	    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
	        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
	    }
}

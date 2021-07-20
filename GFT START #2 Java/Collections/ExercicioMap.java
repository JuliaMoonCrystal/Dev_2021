package one.innovation.digital;

import java.util.*;

public class ExercicioMap {
    public static void main(String[] args) {

        Map<String, Integer> estados= new HashMap<String, Integer>(){{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};
        System.out.println(" Estados e o número da população \n "+ estados.toString());

        System.out.println("---------------------------------");
        System.out.println("Substitua a população do estado do RN por 3.534.165;");
        estados.put("RN",3534165);
        System.out.println("População substituida "+ estados.toString());

        System.out.println("---------------------------------");
        System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB -\n" +
                "4.039.277;");
        if(estados.containsKey("PB") != true){
            estados.put("PB",4039277);
        }
        else {
            System.out.println(estados.toString());
        }
        System.out.println("---------------------------------");
        System.out.println("Exiba a população PE;");
        System.out.println(estados.get("PE"));

        System.out.println("---------------------------------");
        System.out.println("Exiba todos os estados e suas populações na ordem que foi\n" +
                "informado;");
        Map<String,Integer>estado1= new LinkedHashMap(){{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};
        System.out.println(estado1.toString());

        System.out.println("---------------------------------");
        System.out.println("\n\tExiba os estados e suas populações em ordem alfabética;\t");
        Map<String,Integer>estado2= new TreeMap<>(estado1);
        for (Map.Entry<String,Integer> populacao : estado2.entrySet()){
            System.out.println(populacao.getKey()+" - "+populacao.getValue());
        }

        System.out.println("---------------------------------");
        System.out.println("\n\tExiba o estado com o menor população e sua quantidade;\t");
        Integer menorPopulacao= Collections.min(estados.values());
        Set<Map.Entry<String,Integer>> entries = estados.entrySet();

        String menorPopulacaoEstado="";
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(menorPopulacao)) {
                menorPopulacaoEstado = entry.getKey();
                System.out.println(menorPopulacaoEstado+ " - " + menorPopulacao);
            }
        }

        System.out.println("---------------------------------");
        System.out.println("\n\tExiba o estado com a maior população e sua quantidade;");
        Integer maiorPopulacao= Collections.max(estados.values());
        Set<Map.Entry<String,Integer>> entries1 = estados.entrySet();

        String maiorPopulacaoEstado="";
        for (Map.Entry<String,Integer> entry :entries1){
            if(entry.getValue().equals(maiorPopulacao)){
                maiorPopulacaoEstado=entry.getKey();
                System.out.println(maiorPopulacaoEstado+" - "+maiorPopulacao);
            }
        }

        int soma=0;
        System.out.println("---------------------------------");
        System.out.println("\n\tExiba a soma da população desses estados;");
        Iterator<Integer> iterator= estados.values().iterator();
        while (iterator.hasNext()){
            soma+=iterator.next();
        }
        System.out.println(soma);

        System.out.println("---------------------------------");
        System.out.println("\n\tExiba a média da população deste dicionário de estados;");
        System.out.println(soma/estados.size());

        System.out.println("---------------------------------");
        System.out.println("\n\tRemova os estados com a população menor que 4.000.000;");
        Iterator<Integer> iterator1= estados.values().iterator();


        while (iterator.hasNext()){
            iterator1.next();
            if(iterator1.next() <= 4000000)
                iterator1.remove();
        }
        System.out.println(estados);


        System.out.println("---------------------------------");
        System.out.println("Apague o dicionário de estados;");
        estados.clear();

        System.out.println("---------------------------------");
        System.out.println("Confira se o dicionário está vazio.\n"+ estados.isEmpty());



    }
}

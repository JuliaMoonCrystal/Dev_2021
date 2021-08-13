package TemMedia;

import java.sql.Array;
import java.util.*;

public class ExemploList {

       public static void main(String[]args){

           //System.out.println("Olá");

           /*antes do java 5
           List temperatura =new ArrayList();
           */
           //depois do java 5

           System.out.println("Criando uma lista com as temperatutas dos ultimos 6 messes");
           List<Double> temperatura =new ArrayList<>();
           double media;

           temperatura.add(37.2);
           temperatura.add(33.0);
           temperatura.add(29.2);
           temperatura.add(15.1);
           temperatura.add(30.5);
           temperatura.add(17.2);

           //Vendo se um valor está na lista
           System.out.println(temperatura.indexOf(29.2));

           //mostrando os itens da lista
           System.out.println(" Lista antes de add "+temperatura);

         /*  //add elemento em uma posição
           temperatura.add(0,43.2);
           System.out.println(" Lista depois de add "+ temperatura);
         */

           //substituindo 1 elemento
           temperatura.set(temperatura.indexOf(29.2), 10.9);
           System.out.println(" Lista com elemento substituido "+temperatura);

           //verificando se 1 elemento está na lista
           System.out.println(" Lista "+temperatura.contains(37.2));

           System.out.println("Imprimindo a lista por ordem que foram informados");
           for (Double temperaturas : temperatura){
               System.out.println(temperaturas);
           }

           //menor temperatura
           System.out.println("A menor temperatura é: "+ Collections.min(temperatura));

           //maior temperatura
           System.out.println("A maior temperatura é: "+ Collections.max(temperatura));

           //somando as temperaturas
           Iterator<Double> iterator= temperatura.iterator();
           Double soma=0.0;
           while (iterator.hasNext()){
               Double next= iterator.next();
               soma+=next;
           }
           System.out.println("A soma das temperaturas é: "+soma);

           /*//apagando a lista
           temperatura.clear();
           */

           /*Faça um programa que receba a temperatura média dos 6
           primeiros meses do ano e armazene-as em uma lista.

           Após isto, calcule a média semestral das temperaturas e
           mostre todas as temperaturas acima desta média, e em que
           mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
           – Fevereiro e etc). */

           System.out.println("A média das temperaturas do semestre é: "+(soma/temperatura.size()));


       }
}

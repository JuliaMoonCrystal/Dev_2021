package TemMedia;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[]ars){
        List<Gato> meuGato= new ArrayList<>(){{
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));
        }};

        //testando a criação da lista
        System.out.println(meuGato);

        System.out.println("---Ordem Aleatória---");
        Collections.shuffle(meuGato);
        System.out.println(meuGato);

        System.out.println("--ordem Natural--");
        Collections.sort(meuGato);
        System.out.println(meuGato);

        //ordenando usando o comparator
        System.out.println("--\tOrdena Idade\t--");

        meuGato.sort(new ComparatorIdade());
        System.out.println(meuGato);

        System.out.println("--\tOrdem cor\t---");
//        Collections.sort(meusGatos, new ComparatorCor());
        meuGato.sort(new ComparatorCor());
        System.out.println(meuGato);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
//        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        meuGato.sort((Comparator<? super Gato>) new ComparatorNomeCorIdade());
        System.out.println(meuGato);
    }
}

class Gato implements Comparable<Gato>{
    public  String nome;
    public  Integer idade;
    public  String cor;

    public Gato(String nome, Integer idade, String cor){
        this.nome=nome;
        this.idade=idade;
        this.cor=cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor !=0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}

package one.innovation.digital;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        System.out.println(" \tOrdem Aleatória\t");
        Map<String, Livro> meusLivros= new HashMap(){{
            put("George R.R. Martin", new Livro("A guerra dos tronos", 500));
            put("Sarah J.Mass", new Livro("Trono de vidro", 350));
            put("Patrick Rothfuss", new Livro("O nome do vento", 300));
            put("Frank Herbert", new Livro("Duna", 600));
        }};

        for(Map.Entry<String,Livro> livro : meusLivros.entrySet()){
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        }

        System.out.println(" \n\tOrdem de inserção\t");
        Map<String, Livro> meuLivro= new LinkedHashMap(){{
            put("George R.R. Martin", new Livro("A guerra dos tronos", 500));
            put("Sarah J.Mass", new Livro("Trono de vidro", 350));
            put("Patrick Rothfuss", new Livro("O nome do vento", 300));
            put("Frank Herbert", new Livro("Duna", 600));
        }};

        for(Map.Entry<String,Livro> livro : meuLivro.entrySet()){
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        }

        System.out.println("\n\t Ordem alfabética dos autores\t");
        Map<String, Livro> meuLivro1= new TreeMap(meuLivro);
        for(Map.Entry<String,Livro> livro : meuLivro1.entrySet()){
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        }

        System.out.println("\n\tOrdem Alfabetica dos livros");
        Set<Map.Entry<String,Livro>> meuli =new TreeSet<>(new ComparatorNome());
        meuli.addAll(meusLivros.entrySet());
        for(Map.Entry<String,Livro> livro : meuli){
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        }

    }
}

class Livro{
    private String nome;
    private Integer paginas;

    Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }
}
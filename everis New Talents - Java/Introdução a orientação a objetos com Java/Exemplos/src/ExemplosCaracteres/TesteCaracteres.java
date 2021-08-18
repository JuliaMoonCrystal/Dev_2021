package ExemplosCaracteres;

public class TesteCaracteres {
    public static void main(String[] args) {
        char letra ='A';
        System.out.println(letra);

        char valor=65;//compila
        System.out.println(valor);

        valor= (char) (valor+1);
        System.out.println(valor);

        String frase="Bom dia a todos";
        System.out.println(frase);

        frase=frase+2020;//compila porque o java vai reconhecer
        //0 2020 como string
        System.out.println(frase);
    }
}

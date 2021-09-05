package Desafios;

import java.util.Scanner;

/*Nesse exercício opcional, o seu desafio é imprimir os fatoriais de 1 a 10!*/
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = scan.nextInt();
        int fat=1;

        for (int i =1; i<=valor;i++){
           fat*=i;

        }
        System.out.println("O fatorial de "+valor+" é "+fat);

    }
}

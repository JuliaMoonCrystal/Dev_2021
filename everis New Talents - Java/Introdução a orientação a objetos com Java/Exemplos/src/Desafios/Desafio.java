package Desafios;

import java.util.Scanner;

/*Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.*/
public class Desafio {
    public static void main(String[] args) {
        /*Scanner scan= new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int valor=scan.nextInt();
        */
        for (int i=1;i<=100;i++){
            if (i % 3 ==0){
                System.out.println(i+ " é multiplo de 3");
            }
        }

    }
}

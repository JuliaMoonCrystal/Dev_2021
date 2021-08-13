package br.com.dio.Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;

        System.out.println("Digite um numero :");
        a= scan.nextInt();

        System.out.println("Digite um numero :");
        b= scan.nextInt();

        int somar = Somar(a, b);
        int subtrair = Subtrair(a, b);
        int multiplicar = Multiplicar(a, b);
        double dividir = Dividir(a, b);

        System.out.println(somar);
        System.out.println(subtrair);
        System.out.println(multiplicar);
        System.out.println(dividir);
    }

    public  static  int Somar(int a, int b){
        return a+b;
    }
    public  static  int Subtrair(int a, int b){
        return a-b;
    }
    public  static  int Multiplicar(int a, int b){
        return a*b;
    }
    public  static double Dividir(int a, int b){
       double a1=a;
       double b2=b;
        return  a1/b2;
    }
}

package com.git.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
		int a, b;
		
		System.out.println("Digite o Primeiro valor : ");
		a= scan.nextInt();
		
		System.out.println("Digite o Segundo valor : ");
		b= scan.nextInt();
		
		int soma = Soma(a,b);
		int subtracao = Subtracao(a, b);
		int multiplicacao = Multiplicacao(a, b);
		int divisao = Divisao(a, b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
	}
     
	public static int Soma(int a, int b){
		return a+b;
	}
	public static int Subtracao(int a, int b){
		return a-b;
	}
	public static int Divisao(int a, int b){
		return a/b;
	}
	public static int Multiplicacao(int a, int b){
		return a*b;
	}
}

package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva o valor de a");
		a = ler.nextInt();
		
		System.out.println("Escreva o valor de b");
		b = ler.nextInt();
		
		System.out.println("Escreva o valor de c");
		c = ler.nextInt();
		
		if(a<b && b<c){
			System.out.println("Em ordem Crescente!: ");
			System.out.println(a);
			if(b<c){
				System.out.println(b);
				System.out.println(c);
			}
			else if(c<b) {
				System.out.println(c);
				System.out.println(b);
			}
		}		
		if(b<a && b<c){
			System.out.println("Em ordem Crescente!: ");
			System.out.println(b);
			if(a<c){
				System.out.println(a);
				System.out.println(c);
			}
			else if(c<a) {
				System.out.println(c);
				System.out.println(a);
			}
		}	
		if(c<a && c<b){
			System.out.println("Em ordem Crescente!: ");
			System.out.println(c);
			if(a<b){
				System.out.println(a);
				System.out.println(b);
			}
			else if(b<a) {
				System.out.println(b);
				System.out.println(a);
			}
		}
		
	}
}

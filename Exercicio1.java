package Exercicios;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);	
	int a,b,c;

	System.out.println("Escreva o valor de a");
	a = ler.nextInt();
	
	System.out.println("Escreva o valor de b");
	b = ler.nextInt();
	
	System.out.println("Escreva o valor de c");
	c = ler.nextInt();

		if(a>b && a>c) {
			System.out.println("O maior valor é a: "+a);
		}
		else if(b>c && b>a) {
			System.out.println("O maior valor é b:"+b);
		}
		else {
			System.out.println("O maior valor é c: "+c);
		}
	}
}

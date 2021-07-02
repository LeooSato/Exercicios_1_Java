package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		double numero, raiz, elevado;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        numero = ler.nextInt();

        if (numero % 2 == 0) {
            raiz = Math.sqrt(numero);
            System.out.printf("A raiz quadrada de " + numero + " é " + raiz);
        }
        else {
            elevado = numero * numero;
            System.out.printf("O número " + numero + " elevado ao quadrado é "+ elevado);
        }
	}
	
}
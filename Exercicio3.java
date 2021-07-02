package Exercicios;
import java.util.Scanner;
public class Exercicio3 {
public static void main() {
	int idade;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Entre com Idade do Usuario: ");
	idade = ler.nextInt();
	
	if(idade >= 10 && idade <= 14) {
	System.out.println("Infantil");
	}
	else if(idade >= 15 && idade <= 17){
		System.out.println("Juvenil");
	}
	else{
		System.out.println("Adulto");
	}
}
}

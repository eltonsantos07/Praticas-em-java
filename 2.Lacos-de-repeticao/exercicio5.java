package lacos_de_repeticao;

import java.util.Scanner;
/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
 * No final, mostre a soma dos n�meros digitados.(DO/WHILE)
 */
public class exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero, soma=0;
		
		do {
			System.out.println("Digite um n�mero:");
			numero = entrada.nextInt();
			
			soma = soma + numero;
		}
		while(numero != 0);
		entrada.close();
		
		System.out.println("A soma dos n�meros inseridos �: " + soma);
	}

}

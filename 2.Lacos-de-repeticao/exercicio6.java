package lacos_de_repeticao;

import java.util.Scanner;

/*
 * Escrever um programa que receba vários números inteiros no teclado.
 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */
public class exercicio6 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero, soma=0, contador=0;
		double mediaMultiplosDeTres=0.0;
		
		do {
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				soma += numero;
				contador++;
			}
		}
		while(numero!=0);
		entrada.close();
		
		if(soma != 0) {
		mediaMultiplosDeTres = soma /(contador);
		}
		System.out.println("A média dos números digitados que são múltiplos de 3 é: " + mediaMultiplosDeTres);
	}

}

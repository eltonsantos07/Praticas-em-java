package lacos_de_repeticao;

import java.util.Scanner;

/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */
public class exercicio2 {
	
	public static void main(String[] args) {
		int numero, par=0, impar=0;
		Scanner entrada = new Scanner(System.in);
		
		for(int i=1; i<=10; i++) {
			
		System.out.println("Insira o " + i + "º numero: ");
		numero = entrada.nextInt();

		if(numero % 2 == 0) {
			par += 1;
		}
		else {
			impar += 1;
		}
		}
		entrada.close();

		System.out.println("Paridade dos números inseridos");
		System.out.println("Par: " + par);
		System.out.println("Ímpar: " + impar);

	}

}

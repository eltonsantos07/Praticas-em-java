package lacos_de_repeticao;

import java.util.Scanner;

/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */
public class exercicio2 {
	
	public static void main(String[] args) {
		int numero, par=0, impar=0;
		Scanner entrada = new Scanner(System.in);
		
		for(int i=1; i<=10; i++) {
			
		System.out.println("Insira o " + i + "� numero: ");
		numero = entrada.nextInt();

		if(numero % 2 == 0) {
			par += 1;
		}
		else {
			impar += 1;
		}
		}
		entrada.close();

		System.out.println("Paridade dos n�meros inseridos");
		System.out.println("Par: " + par);
		System.out.println("�mpar: " + impar);

	}

}

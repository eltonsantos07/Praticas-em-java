package introducao_a_java;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float nota1, nota2, nota3, media;
		
		System.out.print("Nota 1: ");
		nota1 = entrada.nextFloat();
		
		System.out.print("Nota 2: ");
		nota2 = entrada.nextFloat();
		
		System.out.print("Nota 3: ");
		nota3 = entrada.nextFloat();
		
		entrada.close();
		
		System.out.println("\nPeso das notas:\nNota 1: 2\nNota 2: 3\nNota 3: 5");
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		System.out.printf("\nA média final é: %.1f", media);
	}

}

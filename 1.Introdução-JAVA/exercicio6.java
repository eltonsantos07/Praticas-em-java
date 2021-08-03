package introducao_a_java;
import java.lang.Math;
import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double x1, x2, y1, y2, d;
		
		System.out.println("Digite as coordenadas do primeiro ponto:\n");
		
		System.out.print("X1: ");
		x1 = entrada.nextFloat();
		
		System.out.print("Y1: ");
		y1 = entrada.nextFloat();
		
		System.out.println("\nDigite as coordenadas do primeiro ponto:\n");
		
		System.out.print("X2: ");
		x2 = entrada.nextFloat();
		
		System.out.print("Y2: ");
		y2 = entrada.nextFloat();
		
		entrada.close();
		
		d = (Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2));
		
		System.out.printf("\nA distância entre os dois pontos é aproximadamente %.3f", Math.sqrt(d));
	}
}

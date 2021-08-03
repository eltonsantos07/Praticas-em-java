package introducao_a_java;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Temos o seguinte sistema de equações lineares:\n"
							+ "ax + by = c\ndx + ey = f");
		
		System.out.printf("\nDigite o coeficiente a: ");
		a = entrada.nextDouble();
		
		System.out.printf("\nDigite o coeficiente b: ");
		b = entrada.nextDouble();
		
		System.out.printf("\nDigite o coeficiente c: ");
		c = entrada.nextDouble();
		
		System.out.printf("\nDigite o coeficiente d: ");
		d = entrada.nextDouble();
		
		System.out.printf("\nDigite o coeficiente e: ");
		e = entrada.nextDouble();
		
		System.out.printf("\nDigite o coeficiente f: ");
		f = entrada.nextDouble();
		
		entrada.close();
		
		x = (c*e - b*f) / (a*e - b*d);
		y = (a*f - c*d) / (a*e - b*d);
		
		System.out.printf("\nOs valores de x e y são\nx = %f\ty = %f", x, y);
	}

}

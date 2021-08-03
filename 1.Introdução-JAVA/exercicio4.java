package introducao_a_java;
import java.lang.Math;
import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a, b, c;
		double d, r, s;
		
		System.out.println("Vamos realizar a seguinte operação:\nD = (R + S)/2\n"
							+ "onde R = (A+B)² e S = (B+C)²\n");
		
		System.out.print("Digite o valor de A: ");
		a = entrada.nextInt();
		
		System.out.print("\nDigite o valor de B: ");
		b = entrada.nextInt();
		
		System.out.print("\nDigite o valor de C: ");
		c = entrada.nextInt();
		
		entrada.close();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = (r + s) / 2;
		
		System.out.println("\nO valor de d é: " + d);
	}

}

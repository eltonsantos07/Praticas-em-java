package introducao_a_java;

import java.util.Scanner;

public class exercico8 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double custoDeFabrica, custoConsumidor, distribuidor;
		
		System.out.print("Custo de fábrica: ");
		custoDeFabrica = entrada.nextDouble();
		entrada.close();
		
		distribuidor = custoDeFabrica + (custoDeFabrica * 0.28);
		custoConsumidor = distribuidor + (distribuidor * 0.45);
		
		System.out.printf("Custo do consumidor: %.2f", custoConsumidor);
	}
}

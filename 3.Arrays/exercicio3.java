package arrays_vetores;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int superiorAdez = 0;
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				
				matriz[i][j] = entrada.nextInt();
				
				if(matriz[i][j] > 10) {
				superiorAdez = superiorAdez + 1;
				}
			}
		}
		entrada.close();
		System.out.printf("\nA matriz possui %d valores maiores que dez", superiorAdez);
	}

}

package arrays_vetores;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetor = new int[6];
		int totalPar=0, totalImpar=0;
		
		System.out.println("Digite 6 n�meros inteiros");
		for(int i = 0; i < vetor.length; i++) {//inserir os valores
			vetor[i] = entrada.nextInt();
			
			if(vetor[i] % 2 == 0){//verificar se h� pares e �mpares
			totalPar++;
			}
			else {
			totalImpar++;
			}
		}//Final da entrada de valores
		entrada.close();
		
		System.out.print("Os Valores digitados foram: ");
		for(int i = 0; i < vetor.length; i++) {//imprimir os valores
			System.out.print(vetor[i] + " ");
			}
		
		if(totalPar != 0) {//Somando e contando os pares
			int somaPar=0;
			System.out.printf("\nOs %d n�meros pares digitados foram: ", totalPar);
			for(int par=0; par < vetor.length; par++) {
				
				if(vetor[par] % 2 == 0) {
					System.out.print(vetor[par]+ " ");
					
					somaPar = somaPar + vetor[par];
				}
			}
			System.out.printf("\nA soma dos n�meros pares �: %d", somaPar);
		}
		else {
			System.out.print("\nNenhum n�mero par digitado");
		}//Final da contagem dos n�meros pares
		
		if(totalImpar != 0) {//Somando e contando os �mpares
			int somaImpar=0;
			System.out.printf("\nOs %d n�meros �mpares digitados foram: ", totalImpar);
			for(int impar=0; impar < vetor.length; impar++) {
				
				if(vetor[impar] % 2 == 1) {
					System.out.print(vetor[impar]+ " ");
					
					somaImpar = somaImpar + vetor[impar];
				}
			}
			System.out.printf("\nA soma dos n�meros �mpares �: %d", somaImpar);
		}
		else {
			System.out.print("Nenhum n�mero �mpar digitado");
		}//Final da contagem dos n�meros �mpares
	}

}

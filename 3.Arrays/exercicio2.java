package arrays_vetores;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetor = new int[6];
		int totalPar=0, totalImpar=0;
		
		System.out.println("Digite 6 números inteiros");
		for(int i = 0; i < vetor.length; i++) {//inserir os valores
			vetor[i] = entrada.nextInt();
			
			if(vetor[i] % 2 == 0){//verificar se há pares e ímpares
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
			System.out.printf("\nOs %d números pares digitados foram: ", totalPar);
			for(int par=0; par < vetor.length; par++) {
				
				if(vetor[par] % 2 == 0) {
					System.out.print(vetor[par]+ " ");
					
					somaPar = somaPar + vetor[par];
				}
			}
			System.out.printf("\nA soma dos números pares é: %d", somaPar);
		}
		else {
			System.out.print("\nNenhum número par digitado");
		}//Final da contagem dos números pares
		
		if(totalImpar != 0) {//Somando e contando os ímpares
			int somaImpar=0;
			System.out.printf("\nOs %d números ímpares digitados foram: ", totalImpar);
			for(int impar=0; impar < vetor.length; impar++) {
				
				if(vetor[impar] % 2 == 1) {
					System.out.print(vetor[impar]+ " ");
					
					somaImpar = somaImpar + vetor[impar];
				}
			}
			System.out.printf("\nA soma dos números ímpares é: %d", somaImpar);
		}
		else {
			System.out.print("Nenhum número ímpar digitado");
		}//Final da contagem dos números ímpares
	}

}

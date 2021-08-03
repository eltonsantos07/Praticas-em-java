package arrays_vetores;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[][] matrizA = new int[2][2];
		int[][] matrizB = new int[2][2];
		
		System.out.println("Digite 4 valores para a primeira Matriz");
		for(int i=0; i < matrizA.length; i++) {//percorre as linhas
			for(int j=0; j < matrizA[i].length; j++) {//percorre as colunas
				
				matrizA[i][j] = entrada.nextInt();
			}
		}//primeira matriz finalizada
		
		System.out.println("Digite 4 valores para a segunda Matriz");
		for(int i=0; i < matrizB.length; i++) {//percorre as linhas
			for(int j=0; j < matrizB[i].length; j++) {//percorre as colunas
				
				matrizB[i][j] = entrada.nextInt();
			}
		}//segunda matriz finalizada
		
		char operacao = ' ';
		
		do{//INÍCIO DAS OPERACOES
			System.out.println("\nQual operação você deseja realizar?\nDigite:"
					+ "\t(1) para somar as duas matrizes \n"
					+ "\t(2) para subtrair a primeira matriz da segunda \n"
					+ "\t(3) para adicionar uma constante as duas matrizes \n"
					+ "\t(4) para imprimir as matrizes \n"
					+ "\t(5) para encerrar a aplicação");
			operacao = entrada.next().charAt(0);
		
			switch(operacao) {
			
				case '1'://somando as duas matrizes
					
					int[][] matrizSoma = new int[2][2];
					System.out.println("A soma das duas matrizes resulta na seguinte matriz:");
						
					for(int i=0; i < matrizSoma.length; i++) {//percorre as linhas
						for(int j=0; j < matrizSoma[i].length; j++) {//percorre as colunas
								
							matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
							System.out.printf("[%d]", matrizSoma[i][j]);
						}
					System.out.print("\n");
					}///////fim da operação 1
					break;		
						
				case '2': //subtraindo as duas matrizes
					
					int[][] matrizSubtrai = new int[2][2];
					System.out.println("Subtraindo a primeira matriz da segunda obtemos a seguinte matriz:");
					
					for(int i=0; i < matrizSubtrai.length; i++) {//percorre as linhas
						for(int j=0; j < matrizSubtrai[i].length; j++) {//percorre as colunas
							
							matrizSubtrai[i][j] = matrizA[i][j] - matrizB[i][j];
							System.out.printf("[%d]", matrizSubtrai[i][j]);
						}
						System.out.print("\n");
					}///////fim da operação 2
					break;
					
				case '3': //adcionando uma constante nas duas matrizes
					
					System.out.println("Insira uma constante inteira: ");
					int constante = entrada.nextInt();
					
					System.out.printf("Adcionando a constante %d nas duas matrizes obtemos\n", constante);
					
					System.out.println("Primeira matriz: ");
					for(int i=0; i < matrizA.length; i++) {//percorre as linhas
						for(int j=0; j < matrizA[i].length; j++) {//percorre as colunas
								
							matrizA[i][j] = matrizA[i][j] + constante;
							System.out.printf("[%d]", matrizA[i][j]);
						}
					System.out.print("\n");
					}//fim da matriz A
					
					System.out.println("Segunda matriz: ");
					for(int i=0; i < matrizB.length; i++) {//percorre as linhas
						for(int j=0; j < matrizB[i].length; j++) {//percorre as colunas
								
							matrizB[i][j] = matrizB[i][j] + constante;
							System.out.printf("[%d]", matrizB[i][j]);
						}
					System.out.print("\n");
					}//fim da matrizB
					break;
				
				case '4'://imprimindo as matrizes
					
					System.out.println("A primeira matriz digitada foi:");
					for(int i=0; i < matrizA.length; i++) {//percorre as linhas
						for(int j=0; j < matrizA[i].length; j++) {//percorre as colunas
							
							System.out.printf("[%d]", matrizA[i][j]);
						}
						System.out.print("\n");
					}//primeira matriz finalizada
					System.out.print("\n");
					
					System.out.println("A segunda matriz digitada foi:");
					for(int i=0; i < matrizB.length; i++) {//percorre as linhas
						for(int j=0; j < matrizB[i].length; j++) {//percorre as colunas
							
							System.out.printf("[%d]", matrizB[i][j]);
						}
						System.out.print("\n");
					}//segunda matriz finalizadao
					///////fim da operacao 4
					break;
					
				case '5':
					System.out.println("Aplicacao encerrada");
					break;
			}//fim do switch
		}//FINAL DAS OPERACOES
		while(operacao != '5');
		entrada.close();
	}

}

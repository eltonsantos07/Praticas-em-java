package arrays_vetores;

public class exercicio1 {

	public static void main(String[] args) {
		
		int[] A = new int[6];
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		
		int soma = A[0] + A[1] + A[5];
		System.out.println("A soma das notas 1, 2 e 5 é: " + soma);
		
		A[4] = 100;//modificando o valor na posição 4
		
		System.out.println("Os valores do vetor são: ");
		for(int i =0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}

}

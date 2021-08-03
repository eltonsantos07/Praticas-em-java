package lacos_de_repeticao;

import java.util.Scanner;

/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 */
public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada =new Scanner(System.in);
		int idade, menor21=0, maior50=0;
		
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		
		while(idade != -99) {
			
			if(idade < 21) {
				menor21 += 1;
			}
			else if(idade > 50) {
				maior50 +=1;
			}
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
		}
		entrada.close();
		
		System.out.println("Pessoas com menos de 21 anos: " + menor21);
		System.out.println("Pessoas com mais de 50 anos: " + maior50);

	}

}

package lacos_de_repeticao;

import java.util.Scanner;

/*
 * Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o.
 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
 * e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
 * o n�mero de pessoas calmas; 
	- n�mero de mulheres nervosas; 
	- n�mero de homens agressivos; 
	- n�mero de outros calmos;
	- n�mero de pessoas nervosas com mais de 40 anos; 
	- n�mero de pessoas calmas com menos de 18 anos.

 */
public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		//Informa��es dos usu�rios
		int idade, genero, psi;
		
		//contadores da condi��o psicol�gica
		int calmo=0;
		
		//contadores da idade
		int menor18=0, maior40=0;
		
		//contador do g�nero
		int homem=0, mulher=0, outros=0;
		
		int i=0;
		while(i < 150) {
			//entrada de informa��es
			System.out.println("Insira sua idade: ");
			idade = entrada.nextInt();
			
			System.out.println("Voc� �:\n 1-Homem cisg�nero ou transg�nero\n 2-Mulher cisg�nero ou transg�nero\n 3-Outro");
			genero = entrada.nextInt();
			
			System.out.println("Voc� se considera: 1-Calmo   2-Nervoso   3-Agressivo");
			psi = entrada.nextInt();
			
			//An�lise dos calmos
			if(psi == 1) {
				calmo +=1;
				
				if(genero == 3) {
					outros += 1;
				}
				if(idade<18) {
					menor18 += 1;
				}
			}
			//An�lise dos nervosos
			else if(psi == 2) {
				
					if(genero == 2) {
						mulher += 1;
					}
					if(idade>40) {
						maior40 += 1;
					}
			}
			//An�lise dos agressivos
			else if(psi == 3 && genero == 1) {
				
					homem +=1;
			}
			i += 1;
		}//final do la�o de repeti��o
		entrada.close();
		
		System.out.println("Segundo a nossa pesquisa temos:");
		System.out.println("Pessoas calmas: " + calmo);
		System.out.println("Mmulheres nervosas:" + mulher);
		System.out.println("Homens agressivos: " + homem);
		System.out.println("Pessoas calmas que declararam outro g�nero: " + outros);
		System.out.println("Pessoas nervosas com mais de 40 anos: " + maior40);
		System.out.println("Pessoas calmas com menos de 18 anos: " + menor18);
	}
}

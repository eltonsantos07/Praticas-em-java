package introducao_a_java;

import java.util.Scanner;

public class exerc�cio1 {

	public static void main(String[] args) {//converter idade em dias
		Scanner entrada = new Scanner(System.in);
		int anos, bissexto, meses, dias, idade;
		
		System.out.println("Digite sua idade em anos:");
		anos = entrada.nextInt();
		bissexto = anos / 4;
		
		System.out.println("Digite quantos meses completos se passaram desde o seu �ltimo anivers�rio:");
		meses = entrada.nextInt();
		
		System.out.println("Digite quantos dias faltam para completar mais um m�s:");
		dias = entrada.nextInt();
		
		entrada.close();
		
		idade = (anos * 365) + bissexto + (meses * 30) + (30 - dias);
		
		System.out.println("Sua idade em dias �: " + idade);
	}

}

package introducao_a_java;

import java.util.Scanner;

public class exerc�cio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade, anos, meses, dias;
		
		System.out.println("Escreva sua idade em dias:");
		idade = entrada.nextInt();
		entrada.close();
		
		anos = idade / 365; //Contagem dos anos
		meses = (idade % 365) /30; //Meses que se passaram desde o �ltimo ano completo
		dias = (idade % 365) % 30; //Dias que se passaram desde o �ltimo dia completo
		
		System.out.println("Voc� possui: " + anos + " anos, " 
							+ meses + " meses e " + dias + " dias de vida");
		
		
	}

}

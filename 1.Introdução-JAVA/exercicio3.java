package introducao_a_java;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int tempo, horas, minutos, segundos;
		
		System.out.print("Digite o trmpo de duração do evento em segundos: ");
		tempo = entrada.nextInt();
		entrada.close();
		
		horas = tempo / 3600; //convertendo em horas
		minutos = (tempo % 3600) / 60; //o resto que não completou 1 hora converto em minutos
		segundos = (tempo % 3600) % 60; //o resto que não completou 1 minuto converto em segundos
		
		System.out.println("O tempo da operação é: " + horas + " horas " + minutos + " minutos e " 
							+ segundos + " segundos");
	}

}

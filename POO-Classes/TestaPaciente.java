package exercicio7;

import java.util.Scanner;

public class TestaPaciente {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	Paciente paciente = new Paciente();
	
	System.out.print("Nome do paciente: ");
	paciente.setNome(entrada.nextLine());
	
	System.out.print("\nIdade: ");
	paciente.setIdade(entrada.nextLine());
	
	System.out.print("\nSintomas: ");
	paciente.setSintomas(entrada.nextLine());
	
	System.out.print("\nMedicação: ");
	paciente.TomarRemedio(entrada.nextLine());
	
	entrada.close();
	}
}

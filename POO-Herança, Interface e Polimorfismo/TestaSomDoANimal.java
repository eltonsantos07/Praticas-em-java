package exercicio2;

import java.util.Scanner;

public class TestaSomDoANimal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Animal animal = new Animal();
		Cachorro2 dog = new Cachorro2();
		Cavalo2 horse = new Cavalo2();
		Preguica2 sloth = new Preguica2();
		
		dog.setNome("Galguinho");
		dog.setIdade(2);
		
		horse.setNome("Morgan");
		horse.setIdade(7);
		
		sloth.setNome("Bentinho");
		sloth.setIdade(3);
		
		System.out.println("Bem-vindo ao nosso aplicativo!\n\n"
				+ "Vamos testar os sons de alguns animais?\n"
				+ "Animais dispon�veis:\n");
		
		System.out.println("Op��o 1: Cachorro");
		System.out.println("Nome: " + dog.getNome() + "\nIdade: " + dog.getIdade());
		
		System.out.println("\nOp��o 2: Cavalo");
		System.out.println("Nome: " + horse.getNome() + "\nIdade: " + horse.getIdade());
		
		System.out.println("\nOp��o 3: Pregui�a");
		System.out.println("Nome: " + sloth.getNome() + "\nIdade: " + sloth.getIdade());
		
		System.out.print("\n\nDigite o n�mero da op��o desejada: ");
		char opcao = entrada.next().charAt(0);
		entrada.close();
		
		switch(opcao) {
		case '1': 
			dog.SomDoAnimal();
			break;
		case '2':
			horse.SomDoAnimal();
			break;
		case '3':
			sloth.SomDoAnimal();
			break;
		default:
			System.out.println("Op��o inv�lida!");
		}
	}

}

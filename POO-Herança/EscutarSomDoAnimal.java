package exercicio1;

import java.util.Scanner;

public class EscutarSomDoAnimal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Animal animal = new Animal();
		Animal dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica sloth = new Preguica();
		
		dog.setNome("Galguinho");
		dog.setIdade(2);
		
		horse.setNome("Morgan");
		horse.setIdade(7);
		
		sloth.setNome("Bentinho");
		sloth.setIdade(3);
		
		System.out.println("Bem-vindo ao nosso aplicativo!\n\n"
				+ "Vamos testar os sons de alguns animais?\n"
				+ "Animais disponíveis:\n");
		
		System.out.println("Opção 1: Cachorro");
		System.out.println("Nome: " + dog.getNome() + "\nIdade: " + dog.getIdade());
		
		System.out.println("\nOpção 2: Cavalo");
		System.out.println("Nome: " + horse.getNome() + "\nIdade: " + horse.getIdade());
		
		System.out.println("\nOpção 3: Preguiça");
		System.out.println("Nome: " + sloth.getNome() + "\nIdade: " + sloth.getIdade());
		
		System.out.print("\n\nDigite o número da opção desejada: ");
		char opcao = entrada.next().charAt(0);
		entrada.close();
		
		System.out.println("Som: " + animal.EmitirSom(opcao));
		
	}

}

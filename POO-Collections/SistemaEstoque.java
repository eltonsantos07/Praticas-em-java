package br.com.collections.generation;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEstoque {

	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);

		Estoque e1 = new Estoque("Roupa", "Camiseta estamjpada - Batman", 10);
		Estoque e2 = new Estoque("Roupa", "Saia amarela", 7);
		Estoque e3 = new Estoque("Calçado", "All-Star roxo", 4);
		Estoque e4 = new Estoque("Cama, mesa e banho", "Toalha de banho azul", 15);
		
		ArrayList<Estoque> produto = new ArrayList<>();
		produto.add(e1);
		produto.add(e2);
		produto.add(e3);
		produto.add(e4);
		
		System.out.println(produto);
		
		System.out.println("\nDeseja Fazer alguma alteração no sistema?\n"
							+ "\n 1 - Sim \n 2 - Não");
		
		int opcao = entrada.nextInt();
		
		if(opcao == 1) {
			System.out.println("Qual dos itens deseja alterar?");
			Thread.sleep(3000);
			System.out.println("Saia amarela");
			int remover = 2;
			produto.remove(remover);
			
			e2 = new Estoque("Roupa", "Saia vermelha", 4);
			
			System.out.println("Fazendo a alteração...");
			Thread.sleep(3000);
			
			System.out.println(produto);
			
		}else {
			System.out.println("Encerrando o estoque...");
		}
		
	}

}

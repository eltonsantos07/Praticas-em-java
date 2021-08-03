package exercicio3;

import java.util.Scanner;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valorPago;

		ProdutoEletronico produto1 = new ProdutoEletronico();
		ProdutoEletronico produto2 = new ProdutoEletronico();
		
		produto1.setProduto("Notebook");
		produto1.setModelo("Lenovo Ideapad S145");
		produto1.setCondicao("Novo");
		produto1.setPreco(3500.00);
		
		produto2.setProduto("Celular");
		produto2.setModelo("Motorla Moto G7 Plus");
		produto2.setCondicao("Usado");
		produto2.setPreco(800.00);
		
		ProdutoEletronico.IprimirInformacoes(produto1.getProduto(), produto1.getModelo(), produto1.getCondicao(), produto1.getPreco());
		
		System.out.printf("Valor pago: ");
		valorPago = entrada.nextDouble();
		
		ProdutoEletronico.Troco(produto1.getPreco(), valorPago);
		//ProdutoEletronico.MensagemDeTroco(troco1);
		
		
		ProdutoEletronico.IprimirInformacoes
		(produto2.getProduto(), produto2.getModelo(), produto2.getCondicao(), produto2.getPreco());
		
		System.out.printf("Valor pago: ");
		valorPago = entrada.nextDouble();
		
		ProdutoEletronico.Troco(produto2.getPreco(), valorPago);
		
		entrada.close();
	}

}

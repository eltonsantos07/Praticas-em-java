package exercicio6;

import java.util.Scanner;

public class TestaContaBancaria {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		ContaBancaria conta = new ContaBancaria();
				
		conta.setBanco("Itaú");
		conta.setAgencia("7676");
		conta.setConta("12345678");
		conta.setProprietario("Elton");
		conta.setSaldo(2500.00);
		
		System.out.printf("Banco: %s\n", conta.getBanco());
		System.out.printf("Agência: %s\n", conta.getAgencia());
		System.out.printf("Conta: %s\n", conta.getConta());
		System.out.printf("Proprietário: %s\n", conta.getProprietario());
		System.out.printf("Saldo: %.2f\n", conta.getSaldo());
		
		System.out.print("Valor desejado para saque: ");
		double valorDoSaque = entrada.nextDouble();
		double saldoAtual = conta.SacarDinheiro(valorDoSaque);
		if(saldoAtual >= 0){
			System.out.println("Saque Aprovado!");
			System.out.printf("Valor do saque: R$%.2f\nSaldo Atual: R$%.2f", valorDoSaque, saldoAtual);
		}
		else {
			System.out.println("Saque Reprovado! Valor em conta insuficiente");
		}
		entrada.close();
	}

}

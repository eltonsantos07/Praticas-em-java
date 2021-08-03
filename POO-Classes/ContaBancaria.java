package exercicio6;

public class ContaBancaria {
	
	private String banco;
	private String agencia;
	private String conta;
	private String proprietario;
	private double saldo;
	
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double SacarDinheiro(double saque) {
		double saldo = getSaldo();
		
			saldo = saldo - saque;
		
		return saldo;
	}
	

}

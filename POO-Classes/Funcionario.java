package exercicio4;

import java.util.Scanner;

public class Funcionario {
	
	private String nome;
	private String idade;
	private String numeroDeIdentificacao;
	private double salário;
	private int horasTrabalhadas;
	
	public void Produto(String nome, String idade, String numeroDeIdentificacao, int horasTrabalhadas) {
        this.nome = nome;
        this.idade = idade;
        this.numeroDeIdentificacao = numeroDeIdentificacao;
        this.horasTrabalhadas = horasTrabalhadas;
    }

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getNumeroDeIdentificacao() {
		return numeroDeIdentificacao;
	}
	public void setNumeroDeIdentificacao(String numeroDeIdentificacao) {
		this.numeroDeIdentificacao = numeroDeIdentificacao;
	}
	public double getSalário() {
		return salário;
	}
	public void setSalário(double salário) {
		this.salário = salário;
	}
	public int getHoras() {
		return horasTrabalhadas;
	}
	public void setHoras(int horas) {
		this.horasTrabalhadas = horas;
	}
	
	static double PagamentoDoSalario (int horasTrabalhadas) {
		double valorHora = 4.50;
		double salario = horasTrabalhadas * valorHora;
		
		return salario;
	}
	public void PagarFuncionario(){
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Informações do Funcionário\nNome: ");
		setNome(entrada.nextLine());
		
		System.out.println("Idade: ");
		setIdade(entrada.nextLine());
		
		System.out.println("Número de Identificação: ");
		setNumeroDeIdentificacao(entrada.nextLine());
		
		System.out.println("Horas Trabalhadas: ");
		setHoras(entrada.nextInt());
		
		double pagamento = Funcionario.PagamentoDoSalario(getHoras());
		System.out.println("Total a receber: " + pagamento);
		
		
		entrada.close();
	}
}

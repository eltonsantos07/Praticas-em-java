package exercicio4;

import java.util.Scanner;

public class Funcionario {
	
	private String nome;
	private String idade;
	private String numeroDeIdentificacao;
	private double sal�rio;
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
	public double getSal�rio() {
		return sal�rio;
	}
	public void setSal�rio(double sal�rio) {
		this.sal�rio = sal�rio;
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
	
		System.out.println("Informa��es do Funcion�rio\nNome: ");
		setNome(entrada.nextLine());
		
		System.out.println("Idade: ");
		setIdade(entrada.nextLine());
		
		System.out.println("N�mero de Identifica��o: ");
		setNumeroDeIdentificacao(entrada.nextLine());
		
		System.out.println("Horas Trabalhadas: ");
		setHoras(entrada.nextInt());
		
		double pagamento = Funcionario.PagamentoDoSalario(getHoras());
		System.out.println("Total a receber: " + pagamento);
		
		
		entrada.close();
	}
}

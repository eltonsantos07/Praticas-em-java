package exercicio1;

public class Cliente {
	
	private String Nome, Endereco;
	private int Idade;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	static void ImprimirDadosDoCliente (String nome, int idade, String endereco) {
		System.out.printf("Nome: %s - %d anos - Endereço: %s\n", nome, idade, endereco);
		
	}
	
}

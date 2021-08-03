package exercicio1;

public class Animal {
	
	private String nome;
	private int Idade;
	private String som;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	
	public String EmitirSom(char opcao) {
		
		switch(opcao) {
		case '1': 
			return "AUAUAUHAHAUAUAHAUAH";
		case '2':
			return "HIIIHIHIHIIHIIIHI";
		case '3':
			return "AAAAAAH AAAAAAAH";
		default:
			return "Opcção Inválida!";
		}
	}
}

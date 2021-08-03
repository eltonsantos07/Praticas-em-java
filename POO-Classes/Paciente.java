package exercicio7;

public class Paciente {
	
	private String nome, idade, sintomas, medicação;
	
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

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getMedicação() {
		return medicação;
	}

	public void setMedicação(String medicação) {
		this.medicação = medicação;
	}
	
	public String TomarRemedio (String medicacao) {
		
		return ("Medicação prescrita pelo médico: " + medicacao);
	}
	

}

package exercicio7;

public class Paciente {
	
	private String nome, idade, sintomas, medica��o;
	
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

	public String getMedica��o() {
		return medica��o;
	}

	public void setMedica��o(String medica��o) {
		this.medica��o = medica��o;
	}
	
	public String TomarRemedio (String medicacao) {
		
		return ("Medica��o prescrita pelo m�dico: " + medicacao);
	}
	

}

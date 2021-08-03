package exercicio2;

public class Aviao {
	
	private String modelo;
	private String cor;
	private int horarioDoVoo;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getHorarioDoVoo() {
		return horarioDoVoo;
	}
	public void setHorarioDoVoo(int horarioDoVoo) {
		this.horarioDoVoo = horarioDoVoo;
	}
	
	static void IprimirDadosDoAviao(String modelo, String cor, int horario) {
		System.out.printf("Modelo: %s\n"
							+ "Cor: %s\n"
							+ "Horário do Voo: %d\n", modelo,cor, horario);
	}

}

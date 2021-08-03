package exercicio2;

public class Cachorro2 extends Animal2 implements SomDoAnimal{
	
	private String correr;

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	@Override
	public void SomDoAnimal() {
		System.out.println("AUAUAUAUHAUAUAHUAUAHA");
	}

}

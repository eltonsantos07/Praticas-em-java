package exercicio2;

public class Preguica2 extends Animal2 implements SomDoAnimal {
	
	private String subirEmArvores;

	public String getSubirEmArvores() {
		return subirEmArvores;
	}

	public void setSubirEmArvores(String subirEmArvores) {
		this.subirEmArvores = subirEmArvores;
	}

	@Override
	public void SomDoAnimal() {
		System.out.println("AAAAHAAAAHAAAAH");
	}
	
	
}

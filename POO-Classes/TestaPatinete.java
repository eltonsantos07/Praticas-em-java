package exercicio5;

public class TestaPatinete {

	public static void main(String[] args) {
		
		ContaBancaria patinete = new ContaBancaria();
		
		patinete.setCor("Azul");
		patinete.setNumeroDeRodas(4);
		patinete.setCategoria("Adulto");
		patinete.setVelocidadeMaxima(15);
		
		System.out.println("Informações do Patinete:\nCor: " + patinete.getCor());
		System.out.println("Numero de rodas: " + patinete.getNumeroDeRodas());
		System.out.println("Categoria: " + patinete.getCategoria());
		System.out.printf("Velocidade Máxima: %d\n", patinete.getVelocidadeMaxima());
		System.out.printf("Velocidade Recomendada: %d\n", patinete.Velocidade(patinete.getVelocidadeMaxima()));
	}

}

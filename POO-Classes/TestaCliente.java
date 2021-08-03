package exercicio1;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.setNome("Elton");
		cliente1.setIdade(20);
		cliente1.setEndereco("Diadema - SP");
		
		cliente2.setNome("Erica");
		cliente2.setIdade(28);
		cliente2.setEndereco("São Paulo - SP");
		
		Cliente.ImprimirDadosDoCliente(cliente1.getNome(), cliente1.getIdade(), cliente1.getEndereco());
		Cliente.ImprimirDadosDoCliente(cliente2.getNome(), cliente2.getIdade(), cliente2.getEndereco());
	}

}

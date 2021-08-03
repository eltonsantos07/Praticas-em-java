package exercicio3;

public class ProdutoEletronico {
	
	private String produto;
	private String modelo;
	private String condicao;
	private double preco;
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	public String getCondicao() {
		return condicao;
	}
	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	static void IprimirInformacoes(String produto, String modelo, String condicao, double preco) {
		System.out.printf("Produto: %s\n"
							+ "Modelo: %s\n"
							+ "Condição: %s\n"
							+ "Preço: %.2f\n", produto, modelo, condicao, preco);
		}
	
	static double Troco(double preco, double dinheiro) {
		double troco = dinheiro - preco;
		
		if(dinheiro >= preco) {
			System.out.printf("Troco: R$%.2f\n\n", troco);
		}
		else{
			System.out.printf("Valor incompleto! Faltam R$%.2f\n\n", troco*(-1)); 	
		}
		return troco;
	}
}

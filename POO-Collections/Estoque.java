package br.com.collections.generation;

public class Estoque {
	
	private String setor;
	private String produto;
	private int quantidade;
	
	public Estoque(String setor, String produto, int quantidade) {
		this.setor = setor;
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public String getSetor() {
		return setor;
	}
	public String getProduto() {
		return produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	public String toString() {
		return "(Setor: " + this.setor + " - Produto: " + this.produto + " - Quantidade: " + this.quantidade + ")";
	}
	
	public String AterarEstoque(String produto) {
		return ("1: " + this.produto);
	}
}

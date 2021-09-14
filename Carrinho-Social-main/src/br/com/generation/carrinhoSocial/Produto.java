package br.com.generation.carrinhoSocial;

public class Produto {
	private String nome;
	private int quantidade;
	private Categoria categoria;
	
	public Produto() {
		
	}

	public Produto(String nome, Categoria categoria) {
		this.nome = nome;
		this.quantidade = 0;
		this.categoria=categoria;
	}
	

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void adicionarProduto(int quantidade) {
		this.quantidade+=quantidade;
	}
	
	public void subtraiProduto(int quantidade) {
		this.quantidade-=quantidade;
	}

}

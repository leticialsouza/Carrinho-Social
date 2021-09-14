package br.com.generation.carrinhoSocial;

import java.util.ArrayList;
import java.util.List;

public class ListagemProdutos {
	
	private List<Produto>produtos = new ArrayList<>();
	
	public Produto incluirProdutoNaLista (Produto produto) {
		produtos.add(produto);
		return produto;
	}
	
	public void exibirItensDaListaProduto () {
		System.out.println("==== Produtos ====");
		int contador=1;
		for (Produto produto : produtos) {
			System.out.println(contador+" - "+produto.getNome()+" | Estoque: "+produto.getQuantidade());
			contador++;
			
		}
		}
	public void adicionarQuantidadeAoProduto (int indice, int quantidade) {
		produtos.get(indice).adicionarProduto(quantidade);
	}
	public void subtrairQuantidadeAoProduto (int indice, int quantidade) {
		produtos.get(indice).subtraiProduto(quantidade);
	}
	

}

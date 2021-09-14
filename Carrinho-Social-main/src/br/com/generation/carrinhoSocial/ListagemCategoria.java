package br.com.generation.carrinhoSocial;

import java.util.ArrayList;
import java.util.List;

public class ListagemCategoria {
	
	private List<Categoria>categorias = new ArrayList<>();
	
	public Categoria incluirCategoriaNaLista (Categoria categoria) {
		categorias.add(categoria);
		return categoria;
	}
	
	public void exibirItensDaListaCategoria () {
		System.out.println("==== Categorias ====");
		int contador=1;
		for (Categoria categoria : categorias) {
			System.out.println(contador+" - "+categoria.getNomeCategoria());
			contador++;
		}
	}
	

}

package br.com.generation.carrinhoSocial;

import java.util.Scanner;

public class CarrinhoSocial {

	public static void main(String[] args) {
		
		int opcaoMenuPrincipal=100;
		int opcaoMenuCategoria=100;
		int indice=0;
		int quantidade=0;
		
		//Criando Objeto Categoria
		Categoria objAlimentacao = new Categoria ("Alimentação");
		Categoria objHigiene = new Categoria ("Higiene");
		
		ListagemCategoria objListaCategoria = new ListagemCategoria();
		
		objListaCategoria.incluirCategoriaNaLista(objAlimentacao);
		objListaCategoria.incluirCategoriaNaLista(objHigiene);
		
		//Criando Objeto Produto
		Produto objArroz = new Produto ("Arroz", objAlimentacao);
		Produto objFeijao = new Produto ("Feijão", objAlimentacao);
		Produto objOleo = new Produto ("Óleo", objAlimentacao);
		Produto objCafe = new Produto ("Café", objAlimentacao);
		Produto objMacarrao = new Produto ("Macarrão", objAlimentacao);
		
		ListagemProdutos objListaProdutoAlimentacao = new ListagemProdutos();
		
		objListaProdutoAlimentacao.incluirProdutoNaLista(objArroz);
		objListaProdutoAlimentacao.incluirProdutoNaLista(objFeijao);
		objListaProdutoAlimentacao.incluirProdutoNaLista(objOleo);
		objListaProdutoAlimentacao.incluirProdutoNaLista(objCafe);
		objListaProdutoAlimentacao.incluirProdutoNaLista(objMacarrao);
		
		Produto objPapelHigienico = new Produto ("Pepel Higiênico", objHigiene);
		Produto objAlcoolGel = new Produto ("Álcool em gel", objHigiene);
		Produto objMascara = new Produto ("Máscara", objHigiene);
		Produto objSabonete = new Produto ("Sabonete", objHigiene);
		Produto objAbsorvente = new Produto ("Absorvente", objHigiene);
		
		ListagemProdutos objListaProdutoHigiene = new ListagemProdutos();
		
		objListaProdutoHigiene.incluirProdutoNaLista(objPapelHigienico);
		objListaProdutoHigiene.incluirProdutoNaLista(objAlcoolGel);
		objListaProdutoHigiene.incluirProdutoNaLista(objMascara);
		objListaProdutoHigiene.incluirProdutoNaLista(objSabonete);
		objListaProdutoHigiene.incluirProdutoNaLista(objAbsorvente);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("\n======= Bem-vinde ao Carrinho Social =======");
		
		do {
			
			System.out.println("\nVocê deseja: \n");
			System.out.println("1 - Doar | 2 - Receber | 0 - Sair");
			opcaoMenuPrincipal=in.nextInt();
			
		switch (opcaoMenuPrincipal) {
			
			case 1: {
				System.out.println("\nDigite a categoria que deseja: \n");
				objListaCategoria.exibirItensDaListaCategoria();
				opcaoMenuCategoria=in.nextInt();
				if (opcaoMenuCategoria == 1) {
					opcaoAdicionar(opcaoMenuCategoria, objListaProdutoAlimentacao, in, indice, quantidade);
				}
				else {
					opcaoAdicionar(opcaoMenuCategoria, objListaProdutoHigiene, in, indice, quantidade);
				}
				break;
			}
			
			case 2: {
				System.out.println("\nDigite a categoria que deseja: \n");
				objListaCategoria.exibirItensDaListaCategoria();
				opcaoMenuCategoria=in.nextInt();
				if (opcaoMenuCategoria == 1) {
					opcaoSubtrair(opcaoMenuCategoria, objListaProdutoAlimentacao, in, indice, quantidade);
				}
				else {
					opcaoSubtrair(opcaoMenuCategoria, objListaProdutoHigiene, in, indice, quantidade);
				}
				break;
			}
			
			default:
				if(opcaoMenuPrincipal!=0 && opcaoMenuPrincipal!=1 && opcaoMenuPrincipal!=2) {
					System.out.println("Opção inválida, favor digitar novamente." + opcaoMenuPrincipal);
			}
		
		}
			
			
		}
		while (opcaoMenuPrincipal!=0);
		System.out.println("\n***** Obrigado por participar do Carrinho Social *****");

	}
	
	public static void opcaoAdicionar (int opcaoMenuCategoria, ListagemProdutos listaProdutos, Scanner in, int indice, int quantidade) {
		switch (opcaoMenuCategoria) {
			case 1: {
				System.out.println("\nQual produto deseja?\n");
				listaProdutos.exibirItensDaListaProduto();
				indice=in.nextInt();
				System.out.println("\nInforme a quantidade de produtos");
				quantidade=in.nextInt();
				listaProdutos.adicionarQuantidadeAoProduto(indice-1, quantidade);
				System.out.println("\nDoação realizada com sucesso!!!");
	            System.out.println("***** Muito obrigado! *****");

				break;
			}
			
			case 2: {
				System.out.println("\nQual produto deseja?\n");
				listaProdutos.exibirItensDaListaProduto();
				indice=in.nextInt();
				System.out.println("\nInforme a quantidade de produtos");
				quantidade=in.nextInt();
				listaProdutos.adicionarQuantidadeAoProduto(indice-1, quantidade);
				System.out.println("\nDoação realizada com sucesso!!!");
	            System.out.println("***** Muito obrigado! *****");

				break;
			}
			
		}
		
			
	}
	
	public static void opcaoSubtrair (int opcaoMenuCategoria, ListagemProdutos listaProdutos, Scanner in, int indice, int quantidade) {
		switch (opcaoMenuCategoria) {
			case 1: {
				System.out.println("\nQual produto deseja?\n");
				listaProdutos.exibirItensDaListaProduto();
				indice=in.nextInt();
				System.out.println("\nInforme a quantidade de produtos");
				quantidade=in.nextInt();
				listaProdutos.subtrairQuantidadeAoProduto(indice-1, quantidade);
				System.out.println("\nCarrinho reservado com sucesso!!!");
                System.out.println("***** Muito obrigado! *****");
				break;
			}
			
			case 2: {
				System.out.println("\nQual produto deseja?\n");
				listaProdutos.exibirItensDaListaProduto();
				indice=in.nextInt();
				System.out.println("\nInforme a quantidade de produtos");
				quantidade=in.nextInt();
				listaProdutos.subtrairQuantidadeAoProduto(indice-1, quantidade);
				System.out.println("\nCarrinho reservado com sucesso!!!");
                System.out.println("***** Muito obrigado! *****");
				break;
			}
			
		}
		
			
	}
	
	
	
}

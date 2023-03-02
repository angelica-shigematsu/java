package br.com.educ.livraria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int opcao = 0;
		double preco;

		LivroFisico livroFisico = new LivroFisico("1234", "Comunicação não Violenta", "Marshall B. Rosenberg", 56.90,
				500, 10.0);
		Ebook ebook = new Ebook("1235", "As coisas que você só vê quando desacelera", "Haemin Sunim", 29.61, 3.45);

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarLivro(livroFisico);
		carrinho.adicionarLivro(ebook);

		Scanner scan = new Scanner(System.in);
		
		while (opcao != 5) {
	
			System.out.println("------Livraria Online-------");
			System.out.println("1- Listar todos os livros");
			System.out.println("2- Preço total da compra");
			System.out.println("3- Sair");
			opcao = scan.nextInt();
				switch (opcao) {
				case 1: 
					carrinho.listarLivros();
					break;
				case 2:
					preco = carrinho.calcularPrecoTotal();
					System.out.printf("Preço total: %.2f \n", preco);
					break;
				case 3:
					break;
				}
		}

	}

}

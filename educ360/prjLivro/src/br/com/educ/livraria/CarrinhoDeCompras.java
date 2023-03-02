package br.com.educ.livraria;

import java.util.ArrayList;
import java.util.Collections;

public class CarrinhoDeCompras {
	int sequencia = 0;
	ArrayList<Livro> listaDeLivros = new ArrayList<Livro>();
	
	public void adicionarLivro(Livro livro) {
		listaDeLivros.add(livro);
	}
	
	public void removerLivro(Livro livro) {
		listaDeLivros.remove(livro);
	}
	
	public void listarLivros() {
		System.out.println("--------Ebook---------");
		ArrayList<Livro> ordemTitulo = new ArrayList<Livro>(listaDeLivros);
		
		//Collections.sort(ordemTitulo);
		
		for (Livro ebook  : listaDeLivros) {
			if (ebook instanceof Ebook) {
				sequencia++;
				System.out.println(sequencia + "- Título: " + ebook.getTitulo() + "\n\tPreço Total: " + ebook.calcularPrecoTotal());
			}
		}
		sequencia = 0;
		System.out.println("--------Livro físico---------");
		for (Livro livro : listaDeLivros) {
			if (livro instanceof LivroFisico) {
				sequencia++;
				System.out.println(sequencia + "- Título: " + livro.getTitulo() + "\n\tPreço Total: " + livro.calcularPrecoTotal());
			}
		}	
	}
	public double calcularPrecoTotal() {
		double preco = 0;
		
		for(int index = 0; index < listaDeLivros.size(); index++) {
			preco += listaDeLivros.get(index).calcularPrecoTotal();
		}
		return preco;
	}
}

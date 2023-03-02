package br.com.educ.livraria;

public class Ebook extends Livro{
	private double tamanhoEmMb;
	
	public Ebook(String isbn, String titulo, String autor, double preco, double tamanhoEmMb) {
		super(isbn, titulo, autor, preco);
		this.tamanhoEmMb = tamanhoEmMb;
	}

	public double getTamanhoEmMb() {
		return tamanhoEmMb;
	}

	public void setTamanhoEmMb(double tamanhoEmMb) {
		this.tamanhoEmMb = tamanhoEmMb;
	}
	
	@Override
	public double calcularPrecoTotal() {
		return getPreco();
	}
	
}

package br.com.educ.livraria;

public class Livro {
	private String isbn;
	private String titulo;
	private String autor;
	private double preco;
	
	public Livro(String isbn, String titulo, String autor, double preco) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double calcularPrecoTotal() {
		return getPreco();
	}
}

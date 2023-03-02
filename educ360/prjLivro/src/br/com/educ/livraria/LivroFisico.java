package br.com.educ.livraria;

public class LivroFisico extends Livro{
	private double peso;
	private double frete;
	
	public LivroFisico(String isbn, String titulo, String autor, double preco, double peso, double frete) {
		super(isbn, titulo, autor, preco);
		this.peso = peso;
		this.frete = frete;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getFrete() {
		return frete;
	}
	public void setFrete(double frete) {
		this.frete = frete;
	}
	
	@Override
	public double calcularPrecoTotal() {
		return getFrete() + getPreco();
	}
	
}

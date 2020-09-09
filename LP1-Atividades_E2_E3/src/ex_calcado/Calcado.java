package ex_calcado;

public class Calcado {

	// Atributos
	private String tipo;
	private int tamanho;
	private float preco;
	private char genero;
	
	// Construtor
	public Calcado(String tipo, char genero) {
		super();
		this.tipo = tipo;
		this.genero = genero;
	}

	// Getters and Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	// Métodos
	public void calcar() {
		System.out.println("Calce seu novo calçado!");
	}
	
	public void lavar() {
		System.out.println("Lave seu novo calçado! Cuide bem dele!");
	}
	
	public void andar() {
		System.out.println("Saia com seu novo calçado para algum lugar!");
	}
	
}

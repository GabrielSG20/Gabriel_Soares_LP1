package ex_instrumento_musical;

public class InstrumentoMusical {
	
	// Atributos
	private String nome;
	private String tipo;
	private float preco;
	private String marca;
	
	// Construtor
	public InstrumentoMusical(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	// Métodos
	public void tocar() {
		System.out.println("Toque seu novo Instrumento Musical! O " + nome + "!");
	}
	
	public void afinar() {
		System.out.println("Afine seu novo Instrumento Musical! O " + nome + "!");
	}
	
	public void guardar() {
		System.out.println("Guarde com cuidado seu novo Instrumento Musical! O " + nome + "!");
	}
	
}

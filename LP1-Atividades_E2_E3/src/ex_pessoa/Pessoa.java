package ex_pessoa;

public class Pessoa {

	// Atributos
	private String nome;
	private float altura;
	private float massa;
	private char sexo;
	
	//Construtor
	public Pessoa(String nome) {
		this.nome = nome;
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getMassa() {
		return massa;
	}

	public void setMassa(float massa) {
		this.massa = massa;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	// M�todos
	public void fazerExercicios() {
		System.out.println("Pratique mais exerc�cios! Cuidado com sua sa�de!");
	}
	
	public void comer() {
		System.out.println("Coma mais alimentos!");
	}
	
	public void sorrir() {
		System.out.println("Sorria voc� � uma pessoa saud�vel! Parab�ns!");
	}
}

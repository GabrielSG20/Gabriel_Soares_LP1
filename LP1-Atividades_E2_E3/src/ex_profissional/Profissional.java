package ex_profissional;

public class Profissional {

	// Atributos
	private String nome;
	private String cargo;
	private String profissao;
	private float salario;
	
	// Construtor
	public Profissional(String nome) {
		super();
		this.nome = nome;
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	// M�todos
	public void trabalhar() {
		System.out.println("Vamos ao trabalho " + nome + "!");
	}
	
	public void receberAumento() {
		System.out.println(nome + " merece um aumento de sal�rio! Seu sal�rio atual � R$" + salario + ".");
	}
	
	public void receberPromocao() {
		System.out.println(nome + " merece uma promo��o de cargo! Seu cargo atual � " + cargo + ".");
	}
}

package classes;

public class Profissional {

	// Atributos
	private int pid;
	private String nome;
	private String cargo;
	private String profissao;
	private float salario;
	
	// Construtores
	public Profissional(int pid, String nome) {
		this.pid = pid;
		this.nome = nome;
	}
	
	// Construtor
		public Profissional() {
	
		}

	// Getters and Setters
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
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
	
	// Métodos
	public void trabalhar() {
		System.out.println("Vamos ao trabalho " + nome + "!");
	}
	
	public void receberAumento() {
		System.out.println(nome + " merece um aumento de salário! Seu salário atual é R$" + salario + ".");
	}
	
	public void receberPromocao() {
		System.out.println(nome + " merece uma promoção de cargo! Seu cargo atual é " + cargo + ".");
	}
}

package ex_alunofatecsjc;

public class AlunoFatec {

	// Atributos
	private String nome;
	private String curso;
	private String periodo;
	private float nota1;
	private float nota2;
	
	// Construtor
	public AlunoFatec(String nome, String curso, String periodo) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.periodo = periodo;
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
	// Métodos
	public float obterMedia(float n1, float n2) {
		float media = (n1 + n2)/2;
		return media;
	}
	
	public void estudar() {
		System.out.println("Precisa estudar mais para melhorar o desempenho!");
	}
	
	public void entregarTrabs() {
		System.out.println("Lembre-se de entregar todos os trabalhos!");
	}
}

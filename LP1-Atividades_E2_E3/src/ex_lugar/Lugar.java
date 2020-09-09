package ex_lugar;

public class Lugar {
	
	// Atributos
	private String nome;
	private boolean lugar_turistico;
	private int habitantes;
	private int temperatura;
	private String lingua_nativa;
	
	// Construtor
	public Lugar(String nome, int habitantes, int temperatura) {
		this.nome = nome;
		this.habitantes = habitantes;
		this.temperatura = temperatura;
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isLugar_turistico() {
		return lugar_turistico;
	}

	public void setLugar_turistico(boolean lugar_turistico) {
		this.lugar_turistico = lugar_turistico;
	}

	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public String getLingua_nativa() {
		return lingua_nativa;
	}

	public void setLingua_nativa(String lingua_nativa) {
		this.lingua_nativa = lingua_nativa;
	}
	
	// Métodos
	public void viajarTrabalho() {
		System.out.println("Prepare as malas e vá ao trabalho no " + nome + "!");
	}
	
	public void viajarFerias() {
		System.out.println("Lugar turístico! Prepare as malas e vá se divertir no " + nome + "!");
	}
	
	public void realizarMudanca() {
		System.out.println("Ajeite suas coisas para a nova casa no " + nome + "!");
	}
	
}
package classes;

public class Planeta {

	// Atributos
	private String nome;
	private String distanciaSol;
	private int satelitesNaturais;
	private String temperatura;
	private String diametro;
	
	// Construtor
	public Planeta(String nome, String distanciaSol, int satelitesNaturais, String temperatura, String diametro) {
		super();
		this.nome = nome;
		this.distanciaSol = distanciaSol;
		this.satelitesNaturais = satelitesNaturais;
		this.temperatura = temperatura;
		this.diametro = diametro;
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDistanciaSol() {
		return distanciaSol;
	}

	public void setDistanciaSol(String distanciaSol) {
		this.distanciaSol = distanciaSol;
	}

	public int getSatelitesNaturais() {
		return satelitesNaturais;
	}

	public void setSatelitesNaturais(int satelitesNaturais) {
		this.satelitesNaturais = satelitesNaturais;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	
	public String getDiametro() {
		return diametro;
	}

	public void setDiametro(String diametro) {
		this.diametro = diametro;
	}
}

package servlets;

public class Mulher {
	
	private String nome;
	private Integer idade;
	private String ultimoCiclo;
	private String tipoCiclo;
	
	//Constructor
	public Mulher(String nome, Integer idade, String ultimoCiclo, String tipoCiclo) {
		this.nome = nome;
		this.idade = idade;
		this.ultimoCiclo = ultimoCiclo;
		this.tipoCiclo = tipoCiclo;
	}
	
	
	//Getters
	public String getNome() {
		return nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public String getUltimoCiclo() {
		return ultimoCiclo;
	}
	public String getTipoCiclo() {
		return tipoCiclo;
	}
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public void setUltimoCiclo(String ultimoCiclo) {
		this.ultimoCiclo = ultimoCiclo;
	}
	public void setTipoCiclo(String tipoCiclo) {
		this.tipoCiclo = tipoCiclo;
	}
	
}

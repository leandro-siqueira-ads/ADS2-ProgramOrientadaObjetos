package exercicio1po;

public class Pessoa {
	
	String nome, nada;
	int numeroContrib, idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroContrib() {
		return numeroContrib;
	}
	public void setNumeroContrib(int numeroContrib) {
		this.numeroContrib = numeroContrib;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public Pessoa(String nome, int numeroContrib, int idade) {
		this.nome = nome;
		this.numeroContrib = numeroContrib;
		this.idade = idade;
		
	}
	
	public Pessoa(String nome) {
		
		this.nome = nome;
		
	}
	
	public Pessoa() {
		
	}
	
}

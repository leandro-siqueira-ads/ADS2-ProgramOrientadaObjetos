package pessoa;

	
	public class pessoa {
	    private String nome;
	    private int numContribuinte;
	    private int idade;
	    
	    public pessoa(String nome, int numContribuinte, int idade) {
	        this.nome = nome;
	        this.numContribuinte = numContribuinte;
	        this.idade = idade;
	    }
	    
	    public pessoa(String nome) {
	        this.nome = nome;
	        this.numContribuinte = 0;
	        this.idade = 0;
	    }
	    
	    public pessoa() {
	        this.nome = "";
	        this.numContribuinte = 0;
	        this.idade = 0;
	    }
	    
	    public String getNome() {
	        return nome;
	    }
	    
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	    
	    public int getNumContribuinte() {
	        return numContribuinte;
	    }
	    
	    public void setNumContribuinte(int numContribuinte) {
	        this.numContribuinte = numContribuinte;
	    }
	    
	    public int getIdade() {
	        return idade;
	    }
	    
	    public void setIdade(int idade) {
	        this.idade = idade;
	    }
	}

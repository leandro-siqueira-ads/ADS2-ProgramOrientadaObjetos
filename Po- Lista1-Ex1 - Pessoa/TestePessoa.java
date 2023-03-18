package pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		
		pessoa pessoa1 = new pessoa("Maria Silva", 123456789, 35);
		pessoa pessoa2 = new pessoa("João Santos");
        
        System.out.println("Dados da pessoa 1:");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Número de contribuinte: " + pessoa1.getNumContribuinte());
        System.out.println("Idade: " + pessoa1.getIdade());
        
        System.out.println("\nDados da pessoa 2:");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Número de contribuinte: " + pessoa2.getNumContribuinte());
        System.out.println("Idade: " + pessoa2.getIdade());
        
        pessoa2.setNumContribuinte(987654321);
        pessoa2.setIdade(28);
        
        System.out.println("\nDados atualizados da pessoa 2:");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Número de contribuinte: " + pessoa2.getNumContribuinte());
        System.out.println("Idade: " + pessoa2.getIdade());

	}

}

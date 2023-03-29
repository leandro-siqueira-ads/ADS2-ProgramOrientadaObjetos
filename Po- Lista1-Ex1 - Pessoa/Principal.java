package exercicio1po;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Pessoa obj = new Pessoa();
			
		
		System.out.println("Digite o nome: ");
		obj.nome = sc.nextLine();
		
		
		System.out.println("N Contribuinte: ");
		obj.numeroContrib = sc.nextInt();
		
		System.out.println("Idade: ");
		obj.idade = sc.nextInt();
		
		if (obj.nome != null && obj.numeroContrib != 0 && obj.idade != 0) {
		Pessoa obj1 = new Pessoa(obj.nome, obj.numeroContrib, obj.idade );
		
		System.out.println(obj1.getNome());
		System.out.println(obj1.getNumeroContrib());
		System.out.println(obj1.getIdade());
		
		}
		
		if (obj.nome != null && obj.numeroContrib == 0 && obj.idade == 0) {
		Pessoa obj2 = new Pessoa(obj.nome);
		
		System.out.println(obj2.getNome());
		
		}	
		
		if (obj.nome != ""  && obj.numeroContrib == 0 && obj.idade == 0) {		
		System.out.println("Nada");
		
	}
	}
}
	

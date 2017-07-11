
public class Pessoa {

	String nome = "Daniele";
	int idade = 21 ;
	
	
	void fazAniversario (){
		
		idade = this.idade + 1;		
	}
	
	void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println( "Sua idade é : "+ this.idade  );
	}
	
	
	
}

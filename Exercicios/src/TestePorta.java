import java.util.Scanner;

public class TestePorta {
	
	public static void main (String[]args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vamos brincar de porta!");
		System.out.println("Digite ABRE para abrir a porta");
		System.out.println("Digite FECHA para fechar a porta");
		System.out.println("Digite PINTA para pintar a porta");
		System.out.println("Digite X para sair");
		
		String comando = null;
		Porta p = new Porta();
		System.out.println("Ja criei a porta...");
		
		do {
			
			System.out.println("Digite um comando!!!");
			comando = scan.nextLine(); 
			
			if (comando.equalsIgnoreCase("ABRE")) {
				abre(p);
			} else if (comando.equalsIgnoreCase("FECHA")) {
				fecha(p);
			} else if (comando.equalsIgnoreCase("PINTA")) {
				pinta(p, scan);
			}
			
		} while (!comando.equalsIgnoreCase("X"));
		
	}
	
	private static void pinta(Porta p, Scanner scan) {
		
		System.out.println("Digite o nome da cor que vc quer:");
		String cor = scan.nextLine();
		
		p.pinta(cor);
		
	}

	private static void fecha(Porta p) {
		p.fecha();
	}

	private static void abre(Porta p) {
		p.abre();
	}
}

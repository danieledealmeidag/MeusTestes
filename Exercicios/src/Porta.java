
public class Porta {

	boolean aberta;
	String cor = "azul";
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;
	
	void abre(){
//minhasportas[0];
//		if (!aberta){
//			aberta = true;
//			System.out.println(" A porta foi aberta");
//		}
			
	}
	void fecha(){
		if(aberta){
			aberta = false;
			System.out.println(" A porta foi fechada");
		}
		
	}
	void pinta(String s){
		cor = s;
		System.out.println("Nova cor = " + cor);
	}	
	
	boolean estaAberta(){
		return aberta;
	}
}

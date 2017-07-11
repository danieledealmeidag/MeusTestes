import java.util.Scanner;

public class EuFaco {
		public static void main(String[] Args){

	int [][] matriz = new int [3][2];
	Scanner entrada = new Scanner(System.in);
	int linha, coluna,i;
	

	for(linha = 0; linha < 3; linha ++){
		for(coluna = 0; coluna < 2; coluna ++){
			System.out.printf("Insira matriz [%d], [%d]", linha+1, coluna+1 );
			matriz[linha][coluna] = entrada.nextInt();
		}
	}
	System.out.println("A matriz ficou: " );
		for(linha = 0; linha < 3; linha ++){
			for(coluna = 0; coluna < 2; coluna ++ ){
				System.out.printf(" %d ",matriz [linha][coluna]);
				
			}
			System.out.println();
		}
	
		}
}

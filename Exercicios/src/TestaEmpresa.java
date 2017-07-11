
public class TestaEmpresa {
	public static void main (String[]args){
		
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];
		
//		Funcionario f1 = new Funcionario();
//		f1.nome = "Daniele";
//		f1.salario = 1000;
//		empresa.adiciona(f1);
//		
//		Funcionario f2 = new Funcionario();
//		f2.nome = "Gustavo";
//		f2.salario = 1000;
//		empresa.adiciona(f2);
//		
//		System.out.println(empresa.contem(f2));
		
	
		for(int i = 0; i<20; i++){
			Funcionario f = new Funcionario();
			f.salario = 1000 + i * 100;
			empresa.adiciona(f);
		}
		empresa.mostraEmpregados();
	}
	
}

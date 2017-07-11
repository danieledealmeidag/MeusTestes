
public class Main {

	public static void main (String[]args){
		
		/*f1.departamento="Desenvolvedor";
		f1.estaNaEmpresa= 4;
		f1.rg= 470507020;
		f1.salario = 100000;
		f1.recebeAumento = (50);*/
		
		Funcionario.demite();
		Funcionario f1 = new Funcionario();
		f1.nome = "Hugo";
		f1.salario = 100;
		
		f1.dataEntrada.dia = 21;
		f1.dataEntrada.mes = 06;
		f1.dataEntrada.ano = 2017;
		f1.mostra();
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Danilo";
		f2.salario=100;
		f2.dataEntrada.dia = 01;
		f2.dataEntrada.mes = 05;
		f2.dataEntrada.ano = 2017;
		f2.mostra();
		
		f1.mostra();
		
		
//		 f2 = f1;
//		
//		if(f1 == f2){
//		System.out.println("Iguais");
//		}
//		else{
//		System.out.println("Diferentes");
//		}
//		
		
//		System.out.println("Nome" + f1.nome);
//		System.out.println("Departamento: " + f1.departamento);
//		System.out.println("Tempo de empresa" + f1.estaNaEmpresa);
//		System.out.println("RG: " + f1.rg);
//		System.out.println("Salario atual: " + f1.salario);
//		System.out.println("valor do aumento: " + f1.aumentaSalario);
//		System.out.println("Total: " + f1.recebeAumento);
//		System.out.println("Ganho anual: " + f1.calculaGanhoAnual());
		
//		f1.mostra();
	}
}

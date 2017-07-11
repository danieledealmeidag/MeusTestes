
 class Funcionario {
		
	public String nome;
	public String departamento;
	private double salario;
	Data dataEntrada = new Data();
	static boolean estaNaEmpresa;
	int rg;	
	double aumentaSalario;
	double recebeAumento;
	void recebeAumento (double quantidade){
		 
		salario =+ recebeAumento;
	}
	private double calculaGanhoAnual(){
		return salario * 12;
		
		
	}
	 void mostra() {
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Data de admissão: " + this.dataEntrada.dia + "/" + this.dataEntrada.mes + "/" + this.dataEntrada.ano);
		System.out.println("Tempo de empresa: " + Funcionario.estaNaEmpresa);
		System.out.println("RG" + this.rg);
		System.out.println("Salario atual: " + this.salario);
		System.out.println("Valor do aumento do salário: " + this.aumentaSalario);
		System.out.println("Salario total com aumento: " + this.recebeAumento);
		System.out.println("Ganho anual: " + this.calculaGanhoAnual());
		
		System.out.println("-------------------------------------------------");
		
	}
	public static void demite() {
		estaNaEmpresa = false;
	}
}

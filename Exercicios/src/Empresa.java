
public class Empresa {

	String nome;
	String cnpj;
	float salario;
	Funcionario[] empregados;
	int proximaPosicao = 0;

	void adiciona(Funcionario f) {
		if (proximaPosicao >= 10) {
			Funcionario[] empregados2 = new Funcionario[this.empregados.length * 2];

			for (int i = 0; i < this.empregados.length; i++) {
				empregados2[i] = empregados[i];
			}

			empregados = empregados2;

		} else {
			empregados[proximaPosicao] = f;
			proximaPosicao += 1;
		}

	}

	String getNome() {
		return nome;
	}

	void mostraEmpregados() {
		/*
		 * System.out.println("Funcionário na posição: "+ i);
		 * System.out.println("Salario: " + this.empregados[i].salario ); }
		 */

		for (int i = 0; i < proximaPosicao; i++) {
			empregados[i].mostra();
		}
	}

	boolean contem(Funcionario f) {
		for (int i = 0; i < proximaPosicao; i++) {
			if (empregados[i] == f) {
				return true;
			}
		}
		System.out.println("Não existe");
		return false;
	}
}

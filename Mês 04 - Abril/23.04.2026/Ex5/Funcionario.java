public class Funcionario {

	// Atributos (estado do objeto)
	String identificacao;
	String nome;
	String sobrenome;
	double salarioMensal;

	/**
	 * Calcula e retorna o salário anual do funcionário.
	 * 
	 * Método simples que utiliza o atributo salarioMensal e multiplica por 12
	 * (meses do ano).
	 * 
	 * @return o salário anual do funcionário
	 */
	public double obterSalarioAnual() {
		return salarioMensal * 12;
	}

	/**
	 * Retorna o nome completo do funcionário.
	 * 
	 * Junta (concatena) o nome e o sobrenome com um espaço entre eles.
	 * 
	 * @return uma String contendo nome + sobrenome
	 */
	public String obterNomeCompleto() {
		return nome + " " + sobrenome;
	}

	/**
	 * Aplica um aumento percentual ao salário mensal.
	 * 
	 * Exemplo: se o salário é 1000 e o percentual é 10, o novo salário será 1100.
	 * 
	 * Passos do método: 1. Calcula o valor do aumento 2. Soma ao salário atual 3.
	 * Atualiza o atributo salarioMensal
	 * 
	 * @param percentualDeAumento percentual de aumento (ex: 10 para 10%)
	 */
	public void modificarSalario(double percentualDeAumento) {

		// Calcula o valor do aumento com base no percentual
		double aumento = salarioMensal * percentualDeAumento / 100;

		// Soma o aumento ao salário atual
		double salarioFinal = salarioMensal + aumento;

		// Atualiza o atributo com o novo salário
		salarioMensal = salarioFinal;
	}

}
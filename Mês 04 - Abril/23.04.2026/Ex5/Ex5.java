
public class Ex5 {

	public static void main(String[] args) {

		// Criação de um objeto da classe Funcionario
		// "new Funcionario()" instancia (cria) um funcionário na memória
		Funcionario f1 = new Funcionario();

		// Atribuindo valores diretamente aos atributos do objeto
		f1.identificacao = "618518584";
		f1.nome = "Ana";
		f1.sobrenome = "Carvalho";
		f1.salarioMensal = 4000;

		// Chamando o método que calcula o salário anual
		// Observe que o método usa o estado interno do objeto (salarioMensal)
		System.out.println(f1.obterSalarioAnual());

		// Chamando o método que retorna o nome completo
		System.out.println(f1.obterNomeCompleto());

		// Acessando diretamente o atributo (estado atual do objeto)
		System.out.println("Salário antes da modificação: " + f1.salarioMensal);

		// Chamando método que altera o estado do objeto
		// Aqui estamos aplicando um aumento de 10%
		f1.modificarSalario(10);

		// Verificando o novo valor após a alteração
		System.out.println("Salário após a modificação: " + f1.salarioMensal);

		// Recalculando o salário anual com o novo valor atualizado
		System.out.println(f1.obterSalarioAnual());
	}

}

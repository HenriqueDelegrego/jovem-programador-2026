import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char entrarValor = 's';

		while (entrarValor == 's') {

			// Entrada dos dados do vendedor
			System.out.print("Nome do vendedor: ");
			String nome = input.next();

			System.out.print("Valor total de vendas no mês (R$): ");
			double vendas = input.nextDouble();

			// Cálculo da comissão (17%)
			double salario = vendas * 0.17;

			// Exibição do relatório
			System.out.println("Nome: " + nome);
			System.out.println("Total de vendas: " + vendas);
			System.out.println("Salário " + salario);

			// Pergunta se deseja continuar
			System.out.print("Deseja digitar os dados de mais um vendedor? (s/n): ");
			entrarValor = input.next().charAt(0);

		}

	}

}

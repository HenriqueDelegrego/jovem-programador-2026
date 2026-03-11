import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Insira o nome do vendedor");
		String nome = input.next();

		System.out.println("Insira o salário fixo do vendedor");
		double salarioFixo = input.nextDouble();

		System.out.println("Insira o total de vendas em R$");
		double totalVendas = input.nextDouble();

		double comissao = totalVendas * 0.15;

		double salarioFinal = salarioFixo + comissao;

		System.out.println("O funcionário " + nome + " terá um salário de R$" + df.format(salarioFinal));

	}

}

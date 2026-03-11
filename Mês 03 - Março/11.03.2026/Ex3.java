import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Para limitar a quantidade de dígitos após a vírgula
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Insira a mátricula do funcionário");
		// Tem que ser String por ser um número não calculável
		// int ou double ignorariam o 0 à esquerda
		// Além de terem limites numéricos
		String matricula = input.next();

		System.out.println("Insira o nome do funcionário");
		String nome = input.next();

		System.out.println("Insira a quantidade de horas trabalhadas");
		double horasTrabalhadas = input.nextDouble();

		System.out.println("Insira o salário por hora");
		double salarioHora = input.nextDouble();

		// Separação de cálculos para tornar o código mais legível
		double salarioSemanal = horasTrabalhadas * salarioHora;

		double salarioMensal = salarioSemanal * 4;

		// Utiliza df.format para aplicar o comando
		System.out.println(nome + " (" + matricula + ")" + "\nSalário: R$ " + df.format(salarioMensal));

	}

}

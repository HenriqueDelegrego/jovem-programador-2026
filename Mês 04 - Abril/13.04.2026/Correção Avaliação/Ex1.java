import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Solicita os comprimentos dos três lados
		System.out.print("Digite o comprimento do primeiro lado: ");
		double lado1 = input.nextDouble();

		System.out.print("Digite o comprimento do segundo lado: ");
		double lado2 = input.nextDouble();

		System.out.print("Digite o comprimento do terceiro lado: ");
		double lado3 = input.nextDouble();

		// Classifica o triângulo conforme os lados informados
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("O triângulo é Equilátero (três lados iguais).");
		} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			System.out.println("O triângulo é Isósceles (dois lados iguais).");
		} else {
			System.out.println("O triângulo é Escaleno (três lados diferentes).");
		}

	}

}

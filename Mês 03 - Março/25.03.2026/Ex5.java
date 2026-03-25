import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// A variável somaAltura precisa ser declarada antes do for porque ela será
		// usada
		// para acumular os valores digitados ao longo de todas as iterações do laço.
		// Se fosse declarada dentro do for, seria reinicializada a cada repetição,
		// impedindo o cálculo correto da soma total.
		double somaAltura = 0;

		// Estrutura de repetição que executa exatamente 5 vezes (i de 0 até 4).
		for (int i = 0; i < 5; i++) {
			System.out.println("Insira a altura");
			double altura = input.nextDouble();

			somaAltura += altura;
		}

		// A variável media deve ser calculada após o término do for, pois somente nesse
		// ponto
		// a variável somaAltura contém a soma completa de todas as alturas.
		// Se fosse calculada dentro do laço, o valor ainda estaria incompleto.
		// Atualização do GitHub
		double media = somaAltura / 5;

		System.out.println("Média de altura " + media + " metros");

	}

}

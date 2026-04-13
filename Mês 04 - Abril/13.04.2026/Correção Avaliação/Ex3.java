import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int vetor[] = { 6, 3, 1, 7, 4, 2, 3, 8, 4, 1 };

		System.out.print("Informe o índice inicial: ");
		int inicio = input.nextInt();

		System.out.print("Informe o índice final: ");
		int fim = input.nextInt();

		// Validação dos índices
		while (inicio < 0 || fim < 0 || inicio >= vetor.length || fim >= vetor.length) {
			System.out.println("Erro: índices fora dos limites do vetor.");

			System.out.print("Informe o índice inicial: ");
			inicio = input.nextInt();

			System.out.print("Informe o índice final: ");
			fim = input.nextInt();
		}

		// Criação do subvetor (+ 1 porque o limite final é inclusivo)
		int subvetor[] = new int[fim - inicio + 1];
		int iteradorSubvetor = 0;

		for (int i = inicio; i <= fim; i++) {
			subvetor[iteradorSubvetor] = vetor[i];
			iteradorSubvetor++;
		}

		for (int i = 0; i < subvetor.length; i++) {
			System.out.println(subvetor[i]);
		}

	}

}

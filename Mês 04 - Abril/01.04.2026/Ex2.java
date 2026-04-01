
public class Ex2 {

	public static void main(String[] args) {

		int vetor[] = { 2, 5, -9, 10, 8 };

		// Maior elemento
		int maiorNumero = Integer.MIN_VALUE;

		// Percorre o vetor do índice 0 até vetor.length - 1
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maiorNumero) {
				maiorNumero = vetor[i];
			}
		}
		System.out.println("O maior número é: " + maiorNumero);

		// Menor elemento
		int menorNumero = Integer.MAX_VALUE;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < menorNumero) {
				menorNumero = vetor[i];
			}
		}
		System.out.println("O menor número é: " + menorNumero);

		// Média dos elementos
		double somaNumeros = 0;
		for (int i = 0; i < vetor.length; i++) {
			somaNumeros += vetor[i];
		}

		// Soma total dividido pela quantidade de elementos (vetor.length)
		double media = somaNumeros / vetor.length;

		System.out.println("Média dos valores é de: " + media);
	}

}

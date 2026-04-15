
public class Ex4 {

	public static void main(String[] args) {

		int vetor[] = { 5, 2, 9, 87, 51, 24 };

		// Chamando métodos e passando o vetor como argumento
		obterMenorValor(vetor);
		obterMaiorValor(vetor);
		obterMedia(vetor);

	}

	/**
	 * Encontra e imprime o menor valor presente no vetor.
	 *
	 * @param vetor - Array de números inteiros que será analisado.
	 */
	public static void obterMenorValor(int vetor[]) {

		int menorValor = Integer.MAX_VALUE;

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] < menorValor) {
				menorValor = vetor[i];
			}
		}

		System.out.println("O menor valor é: " + menorValor);

	}

	/**
	 * Encontra e imprime o maior valor presente no vetor.
	 *
	 * @param vetor - Array de números inteiros que será analisado.
	 */
	public static void obterMaiorValor(int vetor[]) {

		int maiorValor = Integer.MIN_VALUE;

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
		}

		System.out.println("O maior valor é: " + maiorValor);

	}

	/**
	 * Calcula e imprime a média dos valores do vetor.
	 *
	 * @param vetor - Array de números inteiros que será analisado.
	 */
	public static void obterMedia(int vetor[]) {

		double soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		double media = soma / vetor.length;

		System.out.println("A média é: " + media);

	}

}

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

		// Começamos com o maior valor possível de um inteiro
		int menorValor = Integer.MAX_VALUE;

		// Percorremos todo o vetor
		for (int i = 0; i < vetor.length; i++) {

			// Se encontrarmos um valor menor, atualizamos
			if (vetor[i] < menorValor) {
				menorValor = vetor[i];
			}
		}

		// Exibe o resultado
		System.out.println("O menor valor é: " + menorValor);

	}

	/**
	 * Encontra e imprime o maior valor presente no vetor.
	 *
	 * @param vetor - Array de números inteiros que será analisado.
	 */
	public static void obterMaiorValor(int vetor[]) {

		// Começamos com o menor valor possível de um inteiro
		int maiorValor = Integer.MIN_VALUE;

		// Percorremos todo o vetor
		for (int i = 0; i < vetor.length; i++) {

			// Se encontrarmos um valor maior, atualizamos
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
		}

		// Exibe o resultado
		System.out.println("O maior valor é: " + maiorValor);

	}

	/**
	 * Calcula e imprime a média dos valores do vetor.
	 *
	 * @param vetor - Array de números inteiros que será analisado.
	 */
	public static void obterMedia(int vetor[]) {

		// Variável para acumular a soma dos valores
		double soma = 0;

		// Percorremos o vetor somando cada elemento
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		// Calculamos a média
		double media = soma / vetor.length;

		// Exibe o resultado
		System.out.println("A média é: " + media);

	}

}
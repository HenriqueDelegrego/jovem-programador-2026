
public class Ex11 {

	public static void main(String[] args) {

		int vetor[] = { 2, 5, -9, 10, 8, 7 };

		System.out.println(obterMaiorValor(vetor));
		System.out.println(obterMenorValor(vetor));
		System.out.println(obterMedia(vetor));

	}

	/**
	 * Retorna o maior valor presente no vetor.
	 *
	 * @param vetor vetor de inteiros a ser analisado
	 * @return o maior valor encontrado no vetor
	 */
	public static int obterMaiorValor(int vetor[]) {

		int maiorNumero = Integer.MIN_VALUE;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maiorNumero) {
				maiorNumero = vetor[i];
			}
		}

		return maiorNumero;

	}

	/**
	 * Retorna o menor valor presente no vetor.
	 *
	 * @param vetor vetor de inteiros a ser analisado
	 * @return o menor valor encontrado no vetor
	 */
	public static int obterMenorValor(int vetor[]) {

		int menorNumero = Integer.MAX_VALUE;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < menorNumero) {
				menorNumero = vetor[i];
			}
		}

		return menorNumero;
	}

	/**
	 * Calcula a média aritmética dos valores do vetor.
	 *
	 * @param vetor vetor de inteiros a ser analisado
	 * @return a média dos valores do vetor
	 */
	public static double obterMedia(int vetor[]) {

		double soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		double media = soma / vetor.length;
		return media;
	}

}
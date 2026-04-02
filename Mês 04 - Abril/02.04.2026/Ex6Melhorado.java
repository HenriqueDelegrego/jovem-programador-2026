public class Ex6Melhorado {

	public static void main(String[] args) {

		// Vetor original
		int vetor[] = { 2, 5, -9, 10, 8, 7 };

		// Loop que percorre apenas metade do vetor
		// Isso é suficiente porque a cada iteração trocamos dois elementos
		for (int i = 0; i < vetor.length / 2; i++) {

			// Armazena temporariamente o valor da posição atual (início)
			int valorTemp = vetor[i];

			// Substitui o valor da posição inicial pelo valor correspondente do final
			// Exemplo: i = 0 troca com (length - 1 - 0) → última posição
			vetor[i] = vetor[vetor.length - 1 - i];

			// Coloca o valor armazenado (original do início) na posição final
			vetor[vetor.length - 1 - i] = valorTemp;
		}

		// Impressão do vetor já invertido
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}
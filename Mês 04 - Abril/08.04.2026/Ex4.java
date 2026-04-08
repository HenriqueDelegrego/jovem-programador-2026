public class Ex4 {

	public static void main(String[] args) {

		// Matriz onde cada linha representa uma casa
		// Colunas:
		// [0] = tamanho da casa (m²)
		// [1] = número de quartos
		// [2] = preço da casa
		int[][] matriz = {
				{ 210, 3, 399900 },
				{ 160, 3, 329900 },
				{ 240, 3, 369000 },
				{ 141, 2, 232000 },
				{ 300, 4, 539900 },
				{ 198, 4, 299900 },
				{ 153, 3, 314900 },
				{ 142, 3, 199000 },
				{ 138, 3, 212000 },
				{ 149, 3, 242500 },
				{ 194, 4, 240000 },
				{ 200, 3, 347000 },
				{ 189, 3, 330000 },
				{ 447, 5, 699900 },
				{ 126, 3, 259900 }
		};

		// a) Qual é a média dos preços das casas?

		double somaPrecos = 0;

		// Percorre todas as linhas da matriz
		for (int i = 0; i < matriz.length; i++) {
			// matriz[i][2] → acessa o preço da casa na linha i
			somaPrecos += matriz[i][2];
		}

		// Divide pela quantidade de casas (número de linhas)
		double mediaPrecos = somaPrecos / matriz.length;

		System.out.println("A média dos preços das casas é de R$" + mediaPrecos);

		// b) Quanto custa a menor casa?

		int tamMenorCasa = Integer.MAX_VALUE; // começa com valor muito alto
		int precoMenorCasa = 0;

		for (int i = 0; i < matriz.length; i++) {
			// matriz[i][0] → tamanho da casa
			if (matriz[i][0] < tamMenorCasa) {
				// atualiza o menor tamanho encontrado
				tamMenorCasa = matriz[i][0];

				// pega o preço da mesma casa (mesma linha)
				precoMenorCasa = matriz[i][2];
			}
		}

		System.out.println("A menor casa custa R$" + precoMenorCasa);

		/*
		 * c) Qual a diferença de tamanho da casa com o maior número de quartos
		 * para a casa com o menor número de quartos?
		 */

		int menorQtdQuartos = Integer.MAX_VALUE;
		int maiorQtdQuartos = Integer.MIN_VALUE;

		int tamMenorQtdQuartos = 0;
		int tamMaiorQtdQuartos = 0;

		for (int i = 0; i < matriz.length; i++) {

			// matriz[i][1] → número de quartos

			// Verifica a casa com MAIS quartos
			if (matriz[i][1] > maiorQtdQuartos) {
				maiorQtdQuartos = matriz[i][1];

				// Guarda o tamanho dessa casa
				tamMaiorQtdQuartos = matriz[i][0];
			}

			// Verifica a casa com MENOS quartos
			if (matriz[i][1] < menorQtdQuartos) {
				menorQtdQuartos = matriz[i][1];

				// Guarda o tamanho dessa casa
				tamMenorQtdQuartos = matriz[i][0];
			}
		}

		// Diferença entre os tamanhos
		int diferencaTamanhos = tamMaiorQtdQuartos - tamMenorQtdQuartos;

		System.out.println("A diferença de tamanho das casas é de " + diferencaTamanhos + "m²");

		// d) Qual a média do tamanho das casas que custam mais de 300.000?

		double somaTamanhoCasas300 = 0;
		int qtdCasas300 = 0;

		for (int i = 0; i < matriz.length; i++) {
			// matriz[i][2] → preço
			if (matriz[i][2] > 300000) {

				// matriz[i][0] → tamanho
				somaTamanhoCasas300 += matriz[i][0];

				// conta quantas casas atendem à condição
				qtdCasas300++;
			}
		}

		// média apenas das casas filtradas
		double media300 = somaTamanhoCasas300 / qtdCasas300;

		System.out.println("Média dos tamanhos das casas de mais de 300 mil " + media300 + "m²");
	}
}
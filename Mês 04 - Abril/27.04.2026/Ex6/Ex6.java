public class Ex6 {

	public static void main(String[] args) {

		// Criação e configuração da unidade de Blumenau
		Mercado unidadeDeBlumenau = new Mercado();
		unidadeDeBlumenau.nome = "Giassi";
		unidadeDeBlumenau.qtdMacasVendidas = 450;
		unidadeDeBlumenau.precoMacas = 8.5;
		unidadeDeBlumenau.qtdLaranjasVendidas = 400;
		unidadeDeBlumenau.precoLaranjas = 9.2;

		// Criação e configuração da unidade de Joinville
		Mercado unidadeDeJoinville = new Mercado();
		unidadeDeJoinville.nome = "Bistek";
		unidadeDeJoinville.qtdMacasVendidas = 600;
		unidadeDeJoinville.precoMacas = 8.9;
		unidadeDeJoinville.qtdLaranjasVendidas = 450;
		unidadeDeJoinville.precoLaranjas = 9.5;

		// Criação e configuração da unidade de Florianópolis
		Mercado unidadeDeFlorianopolis = new Mercado();
		unidadeDeFlorianopolis.nome = "Angeloni";
		unidadeDeFlorianopolis.qtdMacasVendidas = 620;
		unidadeDeFlorianopolis.precoMacas = 9.8;
		unidadeDeFlorianopolis.qtdLaranjasVendidas = 500;
		unidadeDeFlorianopolis.precoLaranjas = 11.4;

		// Vetor cujo tipo é "Mercado"
		// Ou seja, cada posição do vetor armazena um OBJETO do tipo Mercado
		Mercado vetor[] = { unidadeDeBlumenau, unidadeDeFlorianopolis, unidadeDeJoinville };

		// ================================
		// Maior receita com maçãs
		// ================================

		double maiorReceitaMacas = Double.MIN_VALUE;
		Mercado mercadoMaiorReceitaMacas = null;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].obterReceitaMacas() > maiorReceitaMacas) {
				maiorReceitaMacas = vetor[i].obterReceitaMacas();
				mercadoMaiorReceitaMacas = vetor[i];
			}
		}

		System.out.println(mercadoMaiorReceitaMacas.nome);

		// ================================
		// Menor receita com laranjas
		// ================================

		double menorReceitaLaranjas = Double.MAX_VALUE;
		Mercado mercadoMenorReceitaLaranjas = null;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].obterReceitaLaranjas() < menorReceitaLaranjas) {
				menorReceitaLaranjas = vetor[i].obterReceitaLaranjas();
				mercadoMenorReceitaLaranjas = vetor[i];
			}
		}

		System.out.println(mercadoMenorReceitaLaranjas.nome);

		// ================================
		// Segunda maior receita total
		// ================================

		double maiorReceitaTotal = Double.MIN_VALUE;
		double segundaMaiorReceitaTotal = Double.MIN_VALUE;
		Mercado mercadoSegundaMaiorReceitaTotal = null;

		for (int i = 0; i < vetor.length; i++) {

			double receitaAtual = vetor[i].obterReceitaTotal();

			// Caso encontre uma nova maior receita
			if (receitaAtual > maiorReceitaTotal) {

				// Atualiza a segunda maior antes de sobrescrever a maior
				segundaMaiorReceitaTotal = maiorReceitaTotal;
				maiorReceitaTotal = receitaAtual;
				mercadoSegundaMaiorReceitaTotal = vetor[i];

				// Caso esteja entre a maior e a segunda maior
			} else if (receitaAtual > segundaMaiorReceitaTotal && receitaAtual != maiorReceitaTotal) {

				segundaMaiorReceitaTotal = receitaAtual;
				mercadoSegundaMaiorReceitaTotal = vetor[i];
			}
		}

		System.out.println(mercadoSegundaMaiorReceitaTotal.nome);

		// ================================
		// Comparação total: maçãs vs laranjas
		// ================================

		double totalReceitaLaranjas = 0;
		double totalReceitaMacas = 0;

		for (int i = 0; i < vetor.length; i++) {
			totalReceitaLaranjas += vetor[i].obterReceitaLaranjas();
			totalReceitaMacas += vetor[i].obterReceitaMacas();
		}

		if (totalReceitaLaranjas > totalReceitaMacas) {
			System.out.println("Teve uma receita maior vendendo laranjas");
		} else if (totalReceitaLaranjas < totalReceitaMacas) {
			System.out.println("Teve uma receita maior vendendo maçãs");
		} else {
			System.out.println("Receitas iguais");
		}

	}
}
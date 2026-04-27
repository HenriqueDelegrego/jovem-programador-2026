
public class Mercado {

	String nome;
	int qtdMacasVendidas;
	double precoMacas;
	int qtdLaranjasVendidas;
	double precoLaranjas;

	/**
	 * Calcula a receita obtida com a venda de maçãs.
	 *
	 * @return valor total arrecadado com maçãs
	 */
	public double obterReceitaMacas() {
		return qtdMacasVendidas * precoMacas;
	}

	/**
	 * Calcula a receita obtida com a venda de laranjas.
	 *
	 * @return valor total arrecadado com laranjas
	 */
	public double obterReceitaLaranjas() {
		return qtdLaranjasVendidas * precoLaranjas;
	}

	/**
	 * Calcula a receita total do mercado (maçãs + laranjas).
	 *
	 * <p>
	 * Este método reutiliza a lógica já implementada em
	 * {@link #obterReceitaMacas()} e {@link #obterReceitaLaranjas()}, evitando
	 * duplicação de código e facilitando manutenção.
	 * </p>
	 *
	 * @return valor total arrecadado
	 */
	public double obterReceitaTotal() {
		return obterReceitaMacas() + obterReceitaLaranjas();
	}

}

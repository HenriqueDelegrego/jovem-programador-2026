
public class Mercado {

	String nome;
	int qtdMacasVendidas;
	double precoMacas;
	int qtdLaranjasVendidas;
	double precoLaranjas;

	/**
	 * Construtor da classe Mercado.
	 * 
	 * <p>
	 * Um construtor é um método especial chamado automaticamente quando criamos um
	 * objeto da classe usando a palavra-chave new. Ele serve para inicializar os
	 * atributos do objeto com valores iniciais.
	 * </p>
	 * 
	 * @param nome                nome do mercado
	 * @param qtdMacasVendidas    quantidade de maçãs vendidas
	 * @param precoMacas          preço de cada maçã
	 * @param qtdLaranjasVendidas quantidade de laranjas vendidas
	 * @param precoLaranjas       preço de cada laranja
	 */

	public Mercado(String nome, int qtdMacasVendidas, double precoMacas, int qtdLaranjasVendidas,
			double precoLaranjas) {
		this.nome = nome;
		this.qtdMacasVendidas = qtdMacasVendidas;
		this.precoMacas = precoMacas;
		this.qtdLaranjasVendidas = qtdLaranjasVendidas;
		this.precoLaranjas = precoLaranjas;
	}

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

	/**
	 * Retorna uma representação em texto do objeto.
	 * 
	 * 
	 * 
	 * <p>
	 * Ele é útil para visualizar rapidamente os valores dos atributos do objeto,
	 * especialmente para depuração (debug).
	 * </p>
	 * * @return uma string contendo os dados do mercado
	 */
	@Override
	public String toString() {
		return "Mercado [nome=" + nome + ", qtdMacasVendidas=" + qtdMacasVendidas + ", precoMacas=" + precoMacas
				+ ", qtdLaranjasVendidas=" + qtdLaranjasVendidas + ", precoLaranjas=" + precoLaranjas + "]";
	}

}

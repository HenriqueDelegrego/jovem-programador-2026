import java.util.ArrayList;
import java.util.List;

public class Revendedora {

	/** Lista de carros na revendedora */
	private List<Carro> listaCarros;

	// Construtor
	public Revendedora() {
		listaCarros = new ArrayList<Carro>();
	}

	/**
	 * Obtém um carro da revendedora a partir da placa informada.
	 * 
	 * @param placa - A placa do carro a ser procurado.
	 * @return O carro correspondente à placa informada, ou null caso não exista.
	 * @throws IllegalArgumentException se a placa for nula ou possuir tamanho
	 *                                  inválido.
	 */
	public Carro obterCarroPorPlaca(String placa) {
		if (placa == null || placa.length() != 7 && placa.length() != 6) {
			throw new IllegalArgumentException("Placa inválida");
		}

		for (Carro c : listaCarros) {
			if (c.getPlaca().equals(placa)) {
				return c;
			}
		}

		return null;
	}

	/**
	 * Obtém o carro mais caro de um determinado ano.
	 * 
	 * @param ano - O ano dos carros a serem considerados.
	 * @return O carro mais caro do ano especificado, ou null se não houver carros
	 *         desse ano.
	 */
	public Carro obterCarroMaisCaroAno(int ano) {

		Carro carroMaisCaro = null;
		double maisCaro = 0;

		for (Carro c : listaCarros) {
			if (c.getAno() == ano && c.getPreco() > maisCaro) {
				maisCaro = c.getPreco();
				carroMaisCaro = c;
			}

		}

		return carroMaisCaro;
	}

	/**
	 * Lista os carros de uma determinada marca dentro de uma faixa de preço.
	 * 
	 * @param marca       - A marca dos carros a serem listados.
	 * @param precoMinimo - O preço mínimo dos carros a serem listados.
	 * @param precoMaximo - O preço máximo dos carros a serem listados.
	 * @return Uma lista de carros que correspondem aos critérios especificados.
	 */
	public List<Carro> listarCarrosMarcaEPreco(String marca, double precoMinimo, double precoMaximo) {

		List<Carro> listaCarrosPorAnoEPreco = new ArrayList<Carro>();

		for (Carro c : listaCarros) {
			if (c.getMarca().equals(marca) && (c.getPreco() >= precoMinimo && c.getPreco() <= precoMaximo)) {
				listaCarrosPorAnoEPreco.add(c);
			}
		}

		return listaCarrosPorAnoEPreco;
	}

	/**
	 * Adiciona um carro à lista de carros da revendedora.
	 * 
	 * @param c - O carro a ser adicionado.
	 */
	public void adicionarCarro(Carro c) {
		listaCarros.add(c);
	}

	/**
	 * Obtém a lista de carros da revendedora.
	 * 
	 * @return A lista de carros disponíveis na revendedora.
	 */
	public List<Carro> getListaCarros() {
		return this.listaCarros;
	}

}

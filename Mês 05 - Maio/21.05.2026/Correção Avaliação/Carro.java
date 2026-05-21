import java.time.LocalDate;

public class Carro {

	// Atributos encapsulados
	private String marca;
	private String modelo;
	private String placa;
	private int ano;
	private double preco;
	private LocalDate dataAquisicao;

	// Construtor
	public Carro(String marca, String modelo, String placa, int ano, double preco, LocalDate dataAquisicao) {
		setMarca(marca);
		setModelo(modelo);
		setPlaca(placa);
		setAno(ano);
		setPreco(preco);
		setDataAquisicao(dataAquisicao);
	}

	/**
	 * Calcula o valor do carro em um ano futuro, considerando a depreciação anual.
	 * A taxa de depreciação é definida com base no ano do carro.
	 * 
	 * @param anoAlvo O ano futuro para o qual se deseja calcular o valor do carro.
	 * @return O valor do carro no ano alvo após a depreciação.
	 * @throws IllegalArgumentException Se o ano alvo for menor ou igual ao ano
	 *                                  atual.
	 */
	public double calcularDepreciacao(int anoAlvo) {

		if (anoAlvo <= LocalDate.now().getYear()) {
			throw new IllegalArgumentException("Ano alvo deve ser maior que " + LocalDate.now().getYear());
		}

		int anos = anoAlvo - LocalDate.now().getYear();

		double taxa = definirTaxaDeDepreciacao();

		return preco * Math.pow(1 - taxa, anos);

	}

	/**
	 * Define a taxa de depreciação com base no ano do carro. Carros fabricados
	 * antes de 2016 depreciam 7% ao ano, enquanto os fabricados a partir de 2016
	 * depreciam 5% ao ano.
	 * 
	 * @return A taxa de depreciação a ser aplicada.
	 */
	private double definirTaxaDeDepreciacao() {

		if (ano >= 2016) {
			return 0.05;
		}
		return 0.07;

		// Ou
		// return (ano >= 2016) ? 0.05 : 0.07;
	}

	// Getters e Setters com validação
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca == null || marca.isBlank()) {
			throw new IllegalArgumentException("Marca inválida");
		}
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo == null || modelo.isBlank()) {
			throw new IllegalArgumentException("Modelo inválido");
		}
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		if (placa == null || placa.length() != 7 && placa.length() != 6) {
			throw new IllegalArgumentException("Placa inválida");
		}
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano > LocalDate.now().getYear()) {
			throw new IllegalArgumentException("Ano inválido");
		}
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco <= 0) {
			throw new IllegalArgumentException("Preço inválido");
		}
		this.preco = preco;
	}

	public LocalDate getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(LocalDate dataAquisicao) {
		if (dataAquisicao.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Data de aquisição inválida");
		}
		this.dataAquisicao = dataAquisicao;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", ano=" + ano + ", preco=" + preco
				+ "]";
	}

}

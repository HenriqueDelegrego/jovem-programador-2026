/**
 * Representa um endereço.
 * <p>
 * A classe {@code Endereco} é utilizada como um objeto auxiliar da classe
 * {@link Pessoa}, encapsulando informações relacionadas à localização,
 * como UF, cidade, CEP, logradouro e número.
 * </p>
 *
 * <p>
 * O uso de uma classe separada para endereço segue o princípio de
 * responsabilidade única, permitindo que os dados de localização sejam
 * organizados de forma independente e reutilizável.
 * </p>
 */
public class Endereco {

	private String uf;
	private String cidade;
	private String cep;
	private String logradouro;
	private String numero;

	public Endereco(String uf, String cidade, String cep, String logradouro, String numero) {
		setUf(uf);
		setCidade(cidade);
		setCep(cep);
		setLogradouro(logradouro);
		setNumero(numero);
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		if (uf == null || uf.isBlank() || uf.trim().length() != 2) {
			throw new IllegalArgumentException("Uf inválida");
		}
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if (cidade == null || cidade.isBlank()) {
			throw new IllegalArgumentException("Cidade inválida");

		}
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		if (cep == null || cep.isBlank()) {
			throw new IllegalArgumentException("CEP inválido");

		}
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		if (logradouro == null || logradouro.isBlank()) {
			throw new IllegalArgumentException("Logradouro inválido");

		}
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		if (numero == null || numero.isBlank()) {
			throw new IllegalArgumentException("Número inválido");

		}
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Endereco [uf=" + uf + ", cidade=" + cidade + ", cep=" + cep + ", logradouro=" + logradouro + ", numero="
				+ numero + "]";
	}

}

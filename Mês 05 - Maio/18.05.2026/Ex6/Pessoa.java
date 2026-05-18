
/**
 * Representa uma pessoa do sistema.
 * <p>
 * A classe {@code Pessoa} possui informações básicas de identificação, como o
 * nome, e também um objeto {@link Endereco}, que funciona como um objeto
 * auxiliar responsável por concentrar os dados de localização da pessoa.
 * </p>
 *
 * <p>
 * Essa separação evita que a classe {@code Pessoa} fique sobrecarregada com
 * atributos relacionados ao endereço, promovendo melhor organização,
 * reutilização e manutenção do código.
 * </p>
 */
public class Pessoa {

	private String nome;

	/**
	 * Objeto auxiliar que armazena os dados de endereço da pessoa.
	 */
	private Endereco endereco;

	public Pessoa(String nome, Endereco endereco) {
		setNome(nome);
		setEndereco(endereco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * Define o endereço da pessoa.
	 * <p>
	 * O endereço é representado por um objeto auxiliar da classe {@link Endereco},
	 * responsável por encapsular os dados de localização.
	 * </p>
	 *
	 * @param endereco endereço da pessoa
	 * @throws IllegalArgumentException caso o endereço seja nulo
	 */
	public void setEndereco(Endereco endereco) {
		if (endereco == null) {
			throw new IllegalArgumentException("Endereço inválido");
		}
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + "]";
	}

}

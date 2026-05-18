/**
 * Classe de teste do sistema.
 * <p>
 * Neste exemplo é demonstrada a criação de um objeto {@link Pessoa} utilizando
 * um objeto {@link Endereco} como estrutura auxiliar para armazenar os dados de
 * localização da pessoa.
 * </p>
 *
 * <p>
 * O exemplo também mostra a relação entre as classes, evidenciando o conceito
 * de composição, onde uma pessoa possui um endereço.
 * </p>
 */
public class Ex6 {

	public static void main(String[] args) {

		// Endereço é criado diretamente no construtor da pessoa,
		// demonstrando o uso do objeto auxiliar Endereco para encapsular os dados

		Pessoa p1 = new Pessoa("Henrique", new Endereco("SC", "Blumenau", "962", "Avenida Brasil", "515"));

		System.out.println(p1);

	}
}
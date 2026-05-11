import java.util.ArrayList;
import java.util.List;

public class Floricultura {

	private List<Flor> listaFlores;

	public Floricultura() {
		listaFlores = new ArrayList<>();
	}

	/**
	 * Adiciona um objeto {@link Flor} na lista de flores da floricultura.
	 *
	 * <p>
	 * Este método existe para centralizar o processo de inserção de flores na
	 * coleção {@code listaFlores}. Em vez de permitir acesso direto à lista interna
	 * da classe, a adição é feita por meio de um método específico, seguindo o
	 * princípio de encapsulamento da Programação Orientada a Objetos.
	 * </p>
	 *
	 * <p>
	 * Utilizar um método para adicionar elementos facilita futuras manutenções e
	 * evoluções do sistema. Caso seja necessário implementar validações, regras de
	 * negócio, verificações de duplicidade, geração de logs ou qualquer outro
	 * processamento antes da inserção, essas alterações poderão ser feitas neste
	 * único ponto do código.
	 * </p>
	 *
	 * <p>
	 * Internamente, o método utiliza o {@code add()} da interface {@link List} para
	 * inserir o objeto no final da coleção.
	 * </p>
	 *
	 * @param f Objeto {@link Flor} que será armazenado na lista da floricultura.
	 */
	public void adicionarFlor(Flor f) {
		listaFlores.add(f);
	}

	/**
	 * Realiza uma pesquisa na lista de flores cadastradas na floricultura,
	 * retornando apenas as flores associadas ao cliente informado.
	 * <p>
	 * O método percorre toda a coleção listaFlores utilizando um laço de repetição
	 * for-each. Para cada objeto {@link Flor} encontrado, é feita uma comparação
	 * entre o nome do cliente armazenado na flor e o nome recebido como parâmetro.
	 * </p>
	 * <p>
	 * Sempre que uma flor pertence ao cliente pesquisado, ela é adicionada na lista
	 * {@code listaPesquisa}. Essa lista funciona como uma coleção temporária de
	 * resultados da pesquisa.
	 * </p>
	 *
	 * <p>
	 * Ao final da varredura, o método retorna:
	 * </p>
	 * <ul>
	 * <li>Uma lista contendo todas as flores encontradas para o cliente;</li>
	 * <li>Uma lista vazia caso nenhum resultado seja localizado.</li>
	 * </ul>
	 *
	 * @param nome Nome do cliente utilizado como critério de pesquisa.
	 * @return Lista contendo as flores do cliente informado.
	 */
	public List<Flor> obterFlores(String nome) {

		List<Flor> listaPesquisa = new ArrayList<Flor>();

		for (Flor f : listaFlores) {
			if (f.getNomeCliente().equalsIgnoreCase(nome)) {
				listaPesquisa.add(f);
			}
		}

		return listaPesquisa;
	}

}

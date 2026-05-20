import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Familia {

	private List<Pessoa> listaPessoas;

	public Familia() {
		listaPessoas = new ArrayList<Pessoa>();
	}

	public void adicionarPessoa(Pessoa p) {
		listaPessoas.add(p);
	}

	/**
	 * Obtém a pessoa mais velha da família.
	 * <p>
	 * A lógica utiliza a classe {@link LocalDate} para comparar datas de
	 * nascimento. Em Java, uma data mais antiga representa uma pessoa mais velha.
	 * </p>
	 *
	 * <p>
	 * O algoritmo percorre toda a lista de pessoas armazenada em
	 * {@code listaPessoas}, mantendo a menor (mais antiga) data encontrada.
	 * </p>
	 *
	 * @return a pessoa mais velha da lista ou {@code null} caso a família não
	 *         possua pessoas cadastradas
	 */
	public Pessoa obterPessoaMaisVelha() {

		Pessoa pMaisVelha = null;
		LocalDate dataMaisVelha = LocalDate.now();

		for (Pessoa p : listaPessoas) {
			if (p.getDataNascimento().isBefore(dataMaisVelha)) {
				dataMaisVelha = p.getDataNascimento();
				pMaisVelha = p;
			}

		}

		return pMaisVelha;
	}

}
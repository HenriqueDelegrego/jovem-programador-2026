import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

	private String nome;
	private LocalDate dataNascimento;

	public Pessoa(String nome, LocalDate dataNascimento) {
		setNome(nome);
		setDataNascimento(dataNascimento);
	}

	/**
	 * Calcula a idade da pessoa com base na data atual do sistema.
	 * <p>
	 * A idade é calculada usando {@link Period#between(LocalDate, LocalDate)}, que
	 * determina a diferença entre a data de nascimento e a data atual retornada por
	 * {@link LocalDate#now()}.
	 * </p>
	 *
	 * <p>
	 * O método {@code getYears()} retorna apenas a quantidade de anos completos,
	 * desconsiderando meses e dias restantes.
	 * </p>
	 *
	 * @return a idade da pessoa em anos completos
	 */
	public int obterIdade() {
		return Period.between(dataNascimento, LocalDate.now()).getYears();
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Data de nascimento inválida");
		}
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + "]";
	}

}
/**
 * Representa uma ave.
 *
 * <p>
 * Por herdar da classe {@code Animal}, esta classe já possui todas as
 * características comuns aos animais. Ela acrescenta atributos próprios
 * relacionados à cor das penas e ao tipo de alimentação.
 * </p>
 */
public class Ave extends Animal {

	private String corPena;
	private String tipoAlimentacao;

	/**
	 * Cria uma ave.
	 *
	 * <p>
	 * O construtor da superclasse é chamado através de {@code super(...)} para
	 * inicializar os atributos herdados.
	 * </p>
	 */
	public Ave(String raca, String nome, String porte, String habitat, String paisOrigem, String corPena,
			String tipoAlimentacao) {
		super(raca, nome, porte, habitat, paisOrigem);
		this.corPena = corPena;
		this.tipoAlimentacao = tipoAlimentacao;
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	public String getTipoAlimentacao() {
		return tipoAlimentacao;
	}

	public void setTipoAlimentacao(String tipoAlimentacao) {
		this.tipoAlimentacao = tipoAlimentacao;
	}

}

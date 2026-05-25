/**
 * Representa um gato selvagem.
 *
 * <p>
 * Esta classe herda de {@link Animal}, recebendo automaticamente todos os
 * atributos e métodos da superclasse. Além das características comuns de
 * qualquer animal, um gato selvagem possui informações específicas como cor da
 * pelagem e tipo de mancha.
 * </p>
 */
public class GatoSelvagem extends Animal {

	private String corPelagem;
	private String tipoMancha;

	/**
	 * Cria um gato selvagem.
	 *
	 * <p>
	 * O comando {@code super(...)} chama o construtor da superclasse
	 * {@code Animal}, responsável por inicializar os atributos herdados (raça,
	 * nome, porte, habitat e país de origem).
	 * </p>
	 */
	public GatoSelvagem(String raca, String nome, String porte, String habitat, String paisOrigem, String corPelagem,
			String tipoMancha) {
		super(raca, nome, porte, habitat, paisOrigem);
		setCorPelagem(corPelagem);
		setTipoMancha(tipoMancha);
	}

	public String getCorPelagem() {
		return corPelagem;
	}

	public void setCorPelagem(String corPelagem) {
		this.corPelagem = corPelagem;
	}

	public String getTipoMancha() {
		return tipoMancha;
	}

	public void setTipoMancha(String tipoMancha) {
		this.tipoMancha = tipoMancha;
	}

}

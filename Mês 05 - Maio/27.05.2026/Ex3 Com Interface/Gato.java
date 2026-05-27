/**
 * Classe que representa um gato.
 *
 * <p>
 * Esta classe implementa a interface {@code Animal}, assumindo o compromisso de
 * fornecer uma implementação para todos os métodos definidos no contrato da
 * interface.
 * </p>
 *
 * <p>
 * Embora um gato possua características próprias, como espécie, peso e
 * informação sobre castração, ele também compartilha com outros animais o
 * comportamento de emitir sons. Esse comportamento é definido genericamente
 * pela interface {@code Animal} e implementado de forma específica nesta
 * classe.
 * </p>
 *
 * <p>
 * Graças a essa abordagem, objetos do tipo {@code Gato} podem ser tratados como
 * {@code Animal} em qualquer parte do sistema, permitindo o uso de polimorfismo
 * e tornando o código mais flexível e reutilizável.
 * </p>
 */
public class Gato implements Animal {
	private String especie;
	private double peso;
	private boolean castrado;

	public Gato(String especie, double peso, boolean castrado) {
		super();
		this.especie = especie;
		this.peso = peso;
		this.castrado = castrado;
	}

	/**
	 * Implementação do método definido pela interface {@code Animal}.
	 *
	 * <p>
	 * Cada classe que implementa a interface pode fornecer uma versão diferente
	 * deste método. Neste caso, como o objeto representa um gato, o som retornado é
	 * "Miau".
	 * </p>
	 *
	 * <p>
	 * A anotação {@code @Override} indica que este método está sobrescrevendo a
	 * declaração existente na interface, garantindo que o contrato seja cumprido
	 * corretamente.
	 * </p>
	 *
	 * @return o som característico de um gato
	 */
	@Override
	public String emitirSom() {
		return "Miau";
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

}

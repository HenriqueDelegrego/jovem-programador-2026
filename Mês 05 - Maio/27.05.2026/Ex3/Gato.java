
public class Gato extends Animal {

	private boolean castrado;

	public Gato(String especie, double peso, boolean castrado) {
		super(especie, peso);
		setCastrado(castrado);
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

	/**
	 * Retorna o som característico de um gato.
	 * <p>
	 * Este método implementa o método abstrato definido na superclasse
	 * {@link Animal}. A sobrescrita permite que a classe {@code Gato} forneça seu
	 * próprio comportamento para a operação de emissão de som, demonstrando o
	 * conceito de polimorfismo.
	 * </p>
	 *
	 * @return a String {@code "Miau"}
	 */
	@Override
	public String emitirSom() {
		return "Miau";
	}

}

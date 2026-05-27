
public class Cachorro extends Animal {

	private String raca;

	public Cachorro(String especie, double peso, String raca) {
		super(especie, peso);
		setRaca(raca);
	}

	/**
	 * Retorna o som característico de um cachorro.
	 * <p>
	 * Este método sobrescreve o método abstrato {@link Animal#emitirSom()},
	 * fornecendo a implementação específica para a classe {@code Cachorro}.
	 * Enquanto a classe {@code Animal} apenas define que todo animal deve ser capaz
	 * de emitir um som, cabe a cada subclasse concreta determinar qual som será
	 * retornado.
	 * </p>
	 *
	 * @return a String {@code "Au au"}
	 */
	@Override
	public String emitirSom() {
		return "Au au";
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		if (raca == null || raca.isBlank()) {
			throw new IllegalArgumentException("Raça inválida");
		}
		this.raca = raca;
	}

}

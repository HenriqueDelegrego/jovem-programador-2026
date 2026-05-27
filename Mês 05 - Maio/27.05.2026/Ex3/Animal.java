/**
 * Representa um animal genérico.
 * <p>
 * Esta é uma <b>classe abstrata</b>, ou seja, não pode ser instanciada
 * diretamente através do operador {@code new}. Seu objetivo é servir como
 * modelo para outras classes mais específicas, como Cachorro, Gato ou Pássaro.
 * </p>
 *
 * <p>
 * Classes abstratas podem possuir atributos, métodos concretos (com
 * implementação) e métodos abstratos (sem implementação). As subclasses herdam
 * os atributos e métodos desta classe e devem implementar os métodos abstratos
 * definidos nela.
 * </p>
 *
 */
public abstract class Animal {

	private String especie;
	private double peso;

	public Animal(String especie, double peso) {
		setEspecie(especie);
		setPeso(peso);
	}

	/**
	 * Retorna o som característico do animal.
	 * <p>
	 * Este é um <b>método abstrato</b>, portanto não possui implementação nesta
	 * classe. Toda classe concreta que herdar de {@code Animal} deverá fornecer sua
	 * própria implementação deste método.
	 * </p>
	 *
	 * @return uma {@link String} contendo o som emitido pelo animal
	 */
	public abstract String emitirSom();

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		if (especie == null || especie.isBlank()) {
			throw new IllegalArgumentException("Espécie inválida");
		}
		this.especie = especie;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso <= 0) {
			throw new IllegalArgumentException("Peso inválido");
		}
		this.peso = peso;
	}

}

/**
 *
 * <p>
 * Esta classe é a <b>superclasse</b> da hierarquia. Em orientação a objetos,
 * uma superclasse contém atributos e comportamentos comuns que podem ser
 * reutilizados por outras classes através do mecanismo de <b>herança</b>.
 * </p>
 *
 * <p>
 * Neste exemplo, a classe {@code Cilindro} herda de {@code Circulo},
 * aproveitando o atributo {@code raio} e o método {@link #calcularArea()}.
 * Dessa forma, evita-se a duplicação de código e mantém-se uma relação lógica
 * entre os objetos: todo cilindro possui uma base circular.
 * </p>
 */
public class Circulo {

	private double raio;

	public Circulo(double raio) {
		setRaio(raio);
	}

	/**
	 * Calcula a área do círculo utilizando a fórmula πr².
	 *
	 * @return área do círculo
	 */
	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		if (raio <= 0) {
			throw new IllegalArgumentException("Raio inválido");
		}
		this.raio = raio;
	}

}
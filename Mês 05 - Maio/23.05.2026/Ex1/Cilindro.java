/**
 *
 * <p>
 * Esta classe é uma <b>subclasse</b> (ou classe filha) de {@link Circulo}.
 * Através da herança, {@code Cilindro} recebe todos os atributos e métodos
 * públicos e protegidos da superclasse, incluindo o armazenamento do raio e o
 * cálculo da área da base circular.
 * </p>
 *
 * <p>
 * O construtor utiliza {@code super(raio)} para inicializar a parte herdada do
 * objeto. Já o método {@link #calcularVolume()} reutiliza
 * {@link Circulo#calcularArea()} para obter a área da base e multiplicá-la pela
 * altura, aplicando a fórmula do volume do cilindro.
 * </p>
 *
 * <p>
 * Essa relação de herança faz sentido porque um cilindro pode ser visto como
 * uma extensão de um círculo, acrescentando a dimensão da altura às
 * características já existentes da figura circular.
 * </p>
 */
public class Cilindro extends Circulo {

	private double altura;

	public Cilindro(double raio, double altura) {
		super(raio);
		setAltura(altura);
	}

	/**
	 * Calcula o volume do cilindro utilizando a fórmula: área da base × altura.
	 *
	 * *
	 * <p>
	 * O uso de {@code super.calcularArea()} chama o método herdado da superclasse
	 * {@code Circulo}. Esse método retorna a área da base circular do cilindro
	 * (πr²). Em seguida, essa área é multiplicada pela altura para obter o volume
	 * do cilindro.
	 * </p>
	 *
	 * @return volume do cilindro
	 */
	public double calcularVolume() {
		return super.calcularArea() * altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura <= 0) {
			throw new IllegalArgumentException("Altura inválida");
		}
		this.altura = altura;
	}

}
/**
 * Classe que representa um cachorro.
 *
 * <p>
 * Ao utilizar a palavra-chave {@code implements Animal}, esta classe assume o
 * compromisso de cumprir o contrato definido pela interface {@code Animal}.
 * Isso significa que ela deve fornecer uma implementação para todos os métodos
 * declarados na interface.
 * </p>
 *
 * <p>
 * Neste exemplo, a interface exige a implementação do método
 * {@code emitirSom()}. Como cada tipo de animal possui um som diferente, a
 * classe {@code Cachorro} implementa esse método retornando "Au au".
 * </p>
 *
 * <p>
 * Uma vantagem desse modelo é o polimorfismo: objetos de diferentes classes
 * (como Cachorro, Gato e Vaca) podem ser tratados de forma genérica como
 * {@code Animal}, enquanto cada um executa sua própria versão de
 * {@code emitirSom()}.
 * </p>
 */
public class Cachorro implements Animal {

	private String especie;
	private double peso;
	private String raca;

	public Cachorro(String especie, double peso, String raca) {
		super();
		this.especie = especie;
		this.peso = peso;
		this.raca = raca;
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

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	/**
	 * Implementação do método definido pela interface {@code Animal}.
	 *
	 * <p>
	 * A anotação {@code @Override} indica que este método está sobrescrevendo um
	 * método declarado em uma superclasse ou interface. Caso a assinatura esteja
	 * incorreta, o compilador emitirá um erro, ajudando a evitar bugs.
	 * </p>
	 *
	 * <p>
	 * Como esta classe representa um cachorro, o som retornado é "Au au". Outras
	 * classes que implementam {@code Animal} poderão retornar sons diferentes.
	 * </p>
	 *
	 * @return o som característico de um cachorro
	 */
	@Override
	public String emitirSom() {
		return "Au au";
	}

}

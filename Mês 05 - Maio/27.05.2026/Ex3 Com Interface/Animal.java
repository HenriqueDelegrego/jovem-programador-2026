/**
 * Representa um animal capaz de emitir um som.
 *
 * <p>
 * Uma interface em Java define um conjunto de comportamentos que uma classe
 * deve implementar. Ela funciona como um "contrato": qualquer classe que
 * implemente esta interface será obrigada a fornecer uma implementação para
 * todos os métodos declarados nela.
 * </p>
 *
 * <p>
 * Diferentemente de uma classe, uma interface normalmente não descreve como o
 * comportamento será executado, apenas quais operações devem existir. Isso
 * permite que diferentes classes compartilhem o mesmo comportamento esperado,
 * cada uma com sua própria implementação.
 * </p>
 *
 * <p>
 * Por exemplo, as classes Cachorro, Gato e Vaca podem implementar a interface
 * Animal. Todas possuirão o método {@code emitirSom()}, mas cada uma retornará
 * um som diferente ("Au au", "Miau", "Muu", etc.).
 * </p>
 */
public interface Animal {

	/**
	 * Retorna o som característico do animal.
	 *
	 * <p>
	 * Este método faz parte do contrato definido pela interface. Assim, toda classe
	 * que implementar {@code Animal} deverá fornecer sua própria implementação para
	 * informar qual som o animal produz.
	 * </p>
	 *
	 * <p>
	 * Exemplos de retornos possíveis:
	 * </p>
	 * <ul>
	 * <li>{@code "Au au"} para um cachorro;</li>
	 * <li>{@code "Miau"} para um gato;</li>
	 * <li>{@code "Muu"} para uma vaca.</li>
	 * </ul>
	 *
	 * @return uma {@link String} contendo o som emitido pelo animal
	 */
	String emitirSom();

}
/**
 * Representa um primata.
 *
 * <p>
 * Esta classe herda diretamente de {@code Animal}. Como não possui atributos ou
 * comportamentos adicionais neste exemplo, ela apenas reutiliza tudo o que foi
 * definido na superclasse.
 * </p>
 *
 * <p>
 * Esse caso demonstra que uma classe filha pode existir apenas para
 * especializar um conceito, mesmo sem adicionar novos atributos ou métodos.
 * </p>
 */
public class Primata extends Animal {

	/**
	 * Cria um primata utilizando o construtor da superclasse.
	 */
	public Primata(String raca, String nome, String porte, String habitat, String paisOrigem) {
		super(raca, nome, porte, habitat, paisOrigem);
	}

}

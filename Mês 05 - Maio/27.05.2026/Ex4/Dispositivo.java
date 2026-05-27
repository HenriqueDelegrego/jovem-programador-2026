/**
 * Representa um dispositivo eletrônico que pode ser ligado, desligado e ter seu
 * estado consultado.
 *
 * <p>
 * Uma interface em Java define um contrato de comportamento que deve ser
 * seguido pelas classes que a implementam. Ela especifica quais operações
 * estarão disponíveis, sem determinar como essas operações serão executadas.
 * </p>
 *
 * <p>
 * Neste caso, qualquer classe que implemente {@code Dispositivo} deverá
 * fornecer implementações para os métodos {@code ligar()}, {@code desligar()} e
 * {@code obterStatus()}.
 * </p>
 *
 * <p>
 * Por exemplo, uma televisão, um computador, um smartphone ou uma impressora
 * podem implementar esta interface. Embora cada dispositivo possua
 * características próprias, todos compartilham os comportamentos básicos de ser
 * ligado, desligado e informar seu estado atual.
 * </p>
 *
 * <p>
 * O uso de interfaces favorece o polimorfismo, permitindo que diferentes tipos
 * de dispositivos sejam manipulados através da mesma referência:
 * </p>
 *
 * <pre>{@code
 * Dispositivo tv = new Televisao();
 * Dispositivo notebook = new Computador();
 *
 * tv.ligar();
 * notebook.ligar();
 *
 * System.out.println(tv.obterStatus());
 * System.out.println(notebook.obterStatus());
 * }</pre>
 *
 * <p>
 * Mesmo sendo objetos de classes diferentes, ambos podem ser tratados como
 * {@code Dispositivo}, pois seguem o mesmo contrato.
 * </p>
 */
public interface Dispositivo {

	/**
	 * Liga o dispositivo.
	 *
	 * <p>
	 * Cada implementação deverá definir quais ações são necessárias para alterar o
	 * estado do dispositivo para ligado.
	 * </p>
	 *
	 * @return {@code true} se o dispositivo foi ligado com sucesso; {@code false}
	 *         caso a operação não possa ser realizada
	 */
	boolean ligar();

	/**
	 * Desliga o dispositivo.
	 *
	 * <p>
	 * Cada implementação deverá definir quais ações são necessárias para alterar o
	 * estado do dispositivo para desligado.
	 * </p>
	 *
	 * @return {@code true} se o dispositivo foi desligado com sucesso;
	 *         {@code false} caso a operação não possa ser realizada
	 */
	boolean desligar();

	/**
	 * Retorna uma descrição textual do estado atual do dispositivo.
	 *
	 * <p>
	 * Esse método permite consultar informações sobre a situação do dispositivo,
	 * como "Ligado", "Desligado" ou outros estados definidos pela implementação.
	 * </p>
	 *
	 * @return uma {@link String} contendo o status atual do dispositivo
	 */
	String obterStatus();

}
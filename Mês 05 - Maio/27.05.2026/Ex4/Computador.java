/**
 * Representa um computador de mesa (desktop).
 *
 * <p>
 * Esta classe implementa a interface {@code Dispositivo}, assumindo o
 * compromisso de fornecer implementações para todos os métodos definidos pela
 * interface.
 * </p>
 *
 * <p>
 * Embora compartilhe comportamentos comuns com outros dispositivos, como ligar,
 * desligar e informar seu estado, um computador possui suas próprias
 * características e regras de funcionamento.
 * </p>
 *
 * <p>
 * Neste exemplo, o computador depende exclusivamente de estar conectado à
 * energia elétrica para poder ser ligado. Diferentemente do {@code Notebook},
 * não existe bateria que permita o funcionamento sem conexão elétrica.
 * </p>
 *
 * <p>
 * Graças ao uso da interface, objetos desta classe podem ser tratados
 * genericamente como {@code Dispositivo}, permitindo o uso de polimorfismo.
 * </p>
 *
 * <pre>{@code
 * Dispositivo pc = new Computador("Dell OptiPlex", true);
 *
 * System.out.println(pc.ligar());
 * System.out.println(pc.obterStatus());
 * }</pre>
 */
public class Computador implements Dispositivo {

	private String modelo;
	private boolean conectado;

	/**
	 * Cria um computador com os dados informados.
	 *
	 * @param modelo    modelo do computador
	 * @param conectado indica se o equipamento está conectado à energia
	 */
	public Computador(String modelo, boolean conectado) {
		setModelo(modelo);
		setConectado(conectado);
	}

	/**
	 * Implementação do método definido pela interface {@code Dispositivo}.
	 *
	 * <p>
	 * Como um computador desktop depende da alimentação elétrica para funcionar,
	 * ele somente poderá ser ligado quando estiver conectado à energia.
	 * </p>
	 *
	 * <p>
	 * A anotação {@code @Override} indica que este método está implementando a
	 * operação declarada na interface.
	 * </p>
	 *
	 * @return {@code true} se o computador estiver conectado à energia;
	 *         {@code false} caso contrário
	 */
	@Override
	public boolean ligar() {
		return conectado;
	}

	/**
	 * Implementação do método definido pela interface {@code Dispositivo}.
	 *
	 * <p>
	 * Nesta implementação simplificada, considera-se que o computador pode ser
	 * desligado sempre que estiver apto a funcionar.
	 * </p>
	 *
	 * <p>
	 * Em aplicações reais, esse método poderia realizar tarefas como salvar
	 * informações, encerrar programas e liberar recursos antes do desligamento.
	 * </p>
	 *
	 * @return {@code true} se o desligamento puder ocorrer; {@code false} caso
	 *         contrário
	 */
	@Override
	public boolean desligar() {
		return ligar();
	}

	/**
	 * Implementação do método definido pela interface {@code Dispositivo}.
	 *
	 * <p>
	 * Retorna uma descrição textual contendo o modelo do computador e seu estado
	 * atual de conexão elétrica.
	 * </p>
	 *
	 * <p>
	 * Observe que diferentes classes podem implementar este método de maneiras
	 * distintas, retornando informações específicas de cada tipo de dispositivo.
	 * </p>
	 *
	 * @return uma descrição do estado atual do computador
	 */
	@Override
	public String obterStatus() {
		if (conectado) {
			return "Modelo: " + modelo + "\nEstá conectado";
		}

		return "Modelo: " + modelo + "\nNão está conectado";
	}

	/**
	 * Obtém o modelo do computador.
	 *
	 * @return o modelo do equipamento
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Define o modelo do computador.
	 *
	 * <p>
	 * O modelo não pode ser nulo nem vazio.
	 * </p>
	 *
	 * @param modelo nome do modelo
	 * @throws IllegalArgumentException se o modelo for inválido
	 */
	public void setModelo(String modelo) {
		if (modelo == null || modelo.isBlank()) {
			throw new IllegalArgumentException("Modelo inválido");
		}
		this.modelo = modelo;
	}

	/**
	 * Verifica se o computador está conectado à energia elétrica.
	 *
	 * @return {@code true} se estiver conectado; {@code false} caso contrário
	 */
	public boolean isConectado() {
		return conectado;
	}

	/**
	 * Define o estado de conexão elétrica do computador.
	 *
	 * @param conectado novo estado de conexão
	 */
	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}

}
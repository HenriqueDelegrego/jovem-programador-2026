/**
 * Representa um notebook no sistema.
 *
 * <p>
 * Esta classe implementa a interface {@code Dispositivo}, o que significa que
 * ela deve fornecer implementações para os métodos {@code ligar()},
 * {@code desligar()} e {@code obterStatus()} definidos pelo contrato da
 * interface.
 * </p>
 *
 * <p>
 * Além dos comportamentos comuns a qualquer dispositivo, um notebook possui
 * características próprias, como modelo, nível de bateria e estado de conexão
 * com a energia elétrica.
 * </p>
 *
 * <p>
 * O uso da interface permite que objetos desta classe sejam tratados de forma
 * genérica como {@code Dispositivo}, facilitando a reutilização e o
 * polimorfismo.
 * </p>
 *
 * <pre>{@code
 * Dispositivo notebook = new Notebook("Dell Inspiron", 80, false);
 *
 * System.out.println(notebook.ligar());
 * System.out.println(notebook.obterStatus());
 * }</pre>
 */
public class Notebook implements Dispositivo {

	private String modelo;
	private int bateria;
	private boolean conectado;

	/**
	 * Cria um notebook com os dados informados.
	 *
	 * @param modelo    nome ou modelo do notebook
	 * @param bateria   nível de bateria em porcentagem (0 a 100)
	 * @param conectado indica se o notebook está conectado à energia elétrica
	 */
	public Notebook(String modelo, int bateria, boolean conectado) {
		setModelo(modelo);
		setBateria(bateria);
		setConectado(conectado);
	}

	/**
	 * Implementação do método definido pela interface {@code Dispositivo}.
	 *
	 * <p>
	 * Um notebook pode ser ligado caso esteja conectado à tomada ou possua bateria
	 * suficiente para funcionar. Neste exemplo, considera-se que o dispositivo pode
	 * ser ligado quando a bateria estiver acima de 10%.
	 * </p>
	 *
	 * <p>
	 * A anotação {@code @Override} indica que este método implementa o
	 * comportamento exigido pela interface.
	 * </p>
	 *
	 * @return {@code true} se o notebook puder ser ligado; {@code false} caso
	 *         contrário
	 */
	@Override
	public boolean ligar() {
		return conectado || bateria > 10;
	}

	/**
	 * Implementação do método definido pela interface {@code Dispositivo}.
	 *
	 * <p>
	 * Neste exemplo simplificado, o desligamento é considerado possível sempre que
	 * o notebook estiver em condições de funcionamento.
	 * </p>
	 *
	 * <p>
	 * Em sistemas reais, este método poderia alterar estados internos, encerrar
	 * processos ou executar outras tarefas antes do desligamento.
	 * </p>
	 *
	 * @return {@code true} se o desligamento puder ser realizado; {@code false}
	 *         caso contrário
	 */
	@Override
	public boolean desligar() {
		return ligar();
	}

	/**
	 * Implementação do método definido pela interface {@code Dispositivo}.
	 *
	 * <p>
	 * Retorna informações sobre o estado atual do notebook, incluindo seu modelo e
	 * o percentual de bateria disponível.
	 * </p>
	 *
	 * @return uma descrição textual contendo informações do dispositivo
	 */
	@Override
	public String obterStatus() {
		return "Modelo: " + modelo + "\nEstá com bateria de " + bateria + "%";
	}

	/**
	 * Obtém o modelo do notebook.
	 *
	 * @return o modelo do notebook
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Define o modelo do notebook.
	 *
	 * <p>
	 * O modelo não pode ser nulo nem composto apenas por espaços em branco.
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
	 * Obtém o percentual atual de bateria.
	 *
	 * @return nível de bateria entre 0 e 100
	 */
	public int getBateria() {
		return bateria;
	}

	/**
	 * Define o nível de bateria do notebook.
	 *
	 * <p>
	 * O valor informado deve estar entre 0 e 100, representando um percentual
	 * válido de carga.
	 * </p>
	 *
	 * @param bateria percentual de bateria
	 * @throws IllegalArgumentException se o valor estiver fora da faixa válida
	 */
	public void setBateria(int bateria) {
		if (bateria < 0 || bateria > 100) {
			throw new IllegalArgumentException("Bateria inválida");
		}
		this.bateria = bateria;
	}

	/**
	 * Verifica se o notebook está conectado à energia elétrica.
	 *
	 * @return {@code true} se estiver conectado; {@code false} caso contrário
	 */
	public boolean isConectado() {
		return conectado;
	}

	/**
	 * Define se o notebook está conectado à energia elétrica.
	 *
	 * @param conectado novo estado de conexão
	 */
	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}

}

public class Aeronave {

	String modelo;
	int qtdPassageiros;
	int velMax;
	double capCombustivel;
	double queimaPorMinuto;

	/**
	 * Construtor da classe Aeronave.
	 * <p>
	 * O construtor é um método especial que é chamado automaticamente no momento em
	 * que um objeto é criado usando a palavra-chave new. Ele serve para inicializar
	 * os atributos do objeto com valores iniciais.
	 * </p>
	 *
	 * <p>
	 * Exemplo de uso:
	 * </p>
	 * 
	 * <pre>
	 * Aeronave a = new Aeronave("Boeing 737", 180, 850, 26000, 50);
	 * </pre>
	 *
	 * <p>
	 * Nesse exemplo:
	 * <ul>
	 * <li><code>"Boeing 737"</code> será atribuído ao atributo {@link #modelo}</li>
	 * <li><code>180</code> será atribuído a {@link #qtdPassageiros}</li>
	 * <li><code>850</code> será atribuído a {@link #velMax}</li>
	 * <li><code>26000</code> será atribuído a {@link #capCombustivel}</li>
	 * <li><code>50</code> será atribuído a {@link #queimaPorMinuto}</li>
	 * </ul>
	 * </p>
	 *
	 * <p>
	 * O uso do this dentro do construtor indica que estamos nos referindo aos
	 * atributos do objeto atual. Isso é necessário quando o nome do parâmetro é
	 * igual ao nome do atributo.
	 * </p>
	 *
	 * @param modelo          Nome ou modelo da aeronave.
	 * @param qtdPassageiros  Capacidade máxima de passageiros.
	 * @param velMax          Velocidade máxima da aeronave.
	 * @param capCombustivel  Capacidade total de combustível.
	 * @param queimaPorMinuto Consumo de combustível por minuto.
	 */
	public Aeronave(String modelo, int qtdPassageiros, int velMax, double capCombustivel, double queimaPorMinuto) {
		this.modelo = modelo;
		this.qtdPassageiros = qtdPassageiros;
		this.velMax = velMax;
		this.capCombustivel = capCombustivel;
		this.queimaPorMinuto = queimaPorMinuto;
	}

	/**
	 * Calcula a autonomia da aeronave.
	 * <p>
	 * A autonomia representa por quanto tempo (em minutos) a aeronave consegue
	 * permanecer em voo com o combustível disponível.
	 * </p>
	 *
	 * @return Tempo máximo de voo em minutos.
	 */
	public double obterAutonomia() {
		return capCombustivel / queimaPorMinuto;
	}

	/**
	 * Calcula a distância máxima que a aeronave pode percorrer.
	 * <p>
	 * A distância é obtida multiplicando a autonomia pela velocidade máxima.
	 * </p>
	 *
	 * @return Distância máxima (ex: em quilômetros).
	 */
	public double obterDistanciaMaxima() {
		return obterAutonomia() * velMax;
	}

	@Override
	public String toString() {
		return "Aeronave [modelo=" + modelo + ", qtdPassageiros=" + qtdPassageiros + ", velMax=" + velMax
				+ ", capCombustivel=" + capCombustivel + ", queimaPorMinuto=" + queimaPorMinuto + "]";
	}

}

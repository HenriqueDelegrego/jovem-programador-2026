public class Aeronave {

	// Agora os atributos são privados (encapsulamento)
	// Isso impede acesso direto de fora da classe e força o uso de métodos
	// controlados (get/set)
	private String modelo;
	private int qtdPassageiros;
	private int velMax;
	private double capCombustivel;
	private double queimaPorMinuto;

	/**
	 * Construtor da classe Aeronave.
	 *
	 * Agora o construtor NÃO atribui diretamente os atributos. Em vez disso, ele
	 * utiliza os métodos setters.
	 *
	 * Isso é uma decisão importante de projeto: - Garante que as validações dos
	 * setters também sejam aplicadas na criação do objeto - Evita duplicar lógica
	 * de validação dentro do construtor
	 *
	 * Ou seja: qualquer regra definida nos setters vale tanto para criação quanto
	 * para alteração futura.
	 */
	public Aeronave(String modelo, int qtdPassageiros, int velMax, double capCombustivel, double queimaPorMinuto) {

		// Em vez de: this.modelo = modelo;
		// usamos o setter → aplica validação automaticamente
		setModelo(modelo);
		setQtdPassageiros(qtdPassageiros);
		setVelMax(velMax);
		setCapCombustivel(capCombustivel);
		setQueimaPorMinuto(queimaPorMinuto);
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

	// =========================
	// GETTERS (leitura segura)
	// =========================

	// Getter expõe o valor, mas não permite modificação direta
	public String getModelo() {
		return modelo;
	}

	// =========================
	// SETTERS (controle + validação)
	// =========================

	public void setModelo(String modelo) {

		// Validação de integridade do objeto
		// Evita estados inválidos (modelo nulo ou vazio)
		if (modelo == null || modelo.isBlank()) {
			System.out.println("Erro, modelo inválido");
		} else {
			this.modelo = modelo;
		}
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public void setQtdPassageiros(int qtdPassageiros) {

		// Regra de negócio: não existe quantidade negativa
		if (qtdPassageiros < 0) {
			System.out.println("Erro, quantidade de passageiros inválida");
		} else {
			this.qtdPassageiros = qtdPassageiros;
		}
	}

	public int getVelMax() {
		return velMax;
	}

	public void setVelMax(int velMax) {

		// Velocidade precisa ser positiva
		if (velMax <= 0) {
			System.out.println("Erro, velocidade máxima inválida");
		} else {
			this.velMax = velMax;
		}
	}

	public double getCapCombustivel() {
		return capCombustivel;
	}

	public void setCapCombustivel(double capCombustivel) {

		// Capacidade também deve ser positiva
		if (capCombustivel <= 0) {
			System.out.println("Erro, capacidade de combustível inválida");
		} else {
			this.capCombustivel = capCombustivel;
		}
	}

	public double getQueimaPorMinuto() {
		return queimaPorMinuto;
	}

	public void setQueimaPorMinuto(double queimaPorMinuto) {

		// Evita divisão por zero no método obterAutonomia()
		if (queimaPorMinuto <= 0) {
			System.out.println("Erro, queima por minuto inválida");
		} else {
			this.queimaPorMinuto = queimaPorMinuto;
		}
	}

	@Override
	public String toString() {
		return "Aeronave [modelo=" + modelo + ", qtdPassageiros=" + qtdPassageiros + ", velMax=" + velMax
				+ ", capCombustivel=" + capCombustivel + ", queimaPorMinuto=" + queimaPorMinuto + "]";
	}

}
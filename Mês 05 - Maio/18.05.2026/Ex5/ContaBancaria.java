
public class ContaBancaria {

	private String nomeTitular;
	private double saldo;

	public ContaBancaria(String nomeTitular, double saldo) {
		setNomeTitular(nomeTitular);
		setSaldo(saldo);
	}

	/**
	 * Realiza um saque da conta.
	 * 
	 * <p>
	 * O valor informado deve ser maior que zero e não pode exceder o saldo
	 * disponível.
	 * 
	 * @param valor Valor a ser sacado.
	 * 
	 * @throws IllegalArgumentException Caso o valor seja negativo, zero ou maior
	 *                                  que o saldo disponível.
	 */
	public void sacar(double valor) {

		if (valor <= 0) {
			throw new IllegalArgumentException("Valor a ser sacado não pode ser negativo");
		}

		if (valor > saldo) {
			throw new IllegalArgumentException("Valor a ser sacado excede o saldo");
		}

		saldo -= valor;
		// setSaldo(saldo - valor);
	}

	/**
	 * Realiza um depósito na conta.
	 * 
	 * <p>
	 * O valor depositado deve ser maior que zero. Após a validação, o valor é
	 * somado ao saldo atual.
	 * 
	 * @param valor Valor a ser depositado.
	 * 
	 * @throws IllegalArgumentException Caso o valor seja negativo ou zero.
	 */
	public void depositar(double valor) {

		if (valor <= 0) {
			throw new IllegalArgumentException("Valor a ser depositado não pode ser negativo");
		}

		saldo += valor;
	}

	/**
	 * Transfere dinheiro desta conta para outra conta bancária.
	 * 
	 * <p>
	 * Esse método recebe como parâmetro um outro objeto da classe
	 * {@code ContaBancaria}, representando a conta que receberá o valor
	 * transferido.
	 * 
	 * <p>
	 * Exemplo:
	 * 
	 * <pre>
	 * ContaBancaria conta1 = new ContaBancaria("Ana", 1000);
	 * ContaBancaria conta2 = new ContaBancaria("Carlos", 500);
	 * 
	 * conta1.transferir(conta2, 200);
	 * </pre>
	 * 
	 * <p>
	 * No exemplo acima:
	 * <ul>
	 * <li>R$ 200 são retirados da conta de Ana;</li>
	 * <li>R$ 200 são adicionados à conta de Carlos.</li>
	 * </ul>
	 * 
	 * 
	 * @param destinatario Conta que receberá o valor transferido.
	 * @param valor        Valor a ser transferido.
	 * 
	 * @throws IllegalArgumentException Caso:
	 *                                  <ul>
	 *                                  <li>a conta destinatária seja a própria
	 *                                  conta;</li>
	 *                                  <li>o valor seja negativo ou zero;</li>
	 *                                  <li>o saldo seja insuficiente.</li>
	 *                                  </ul>
	 */
	public void transferir(ContaBancaria destinatario, double valor) {

		if (destinatario.equals(this)) {
			throw new IllegalArgumentException("Conta destinatária não pode ser a sua");
		}

		if (valor <= 0) {
			throw new IllegalArgumentException("Valor a ser transferido não pode ser negativo");
		}

		if (valor > saldo) {
			throw new IllegalArgumentException("Valor a ser transferido excede o saldo");
		}

		this.saldo -= valor;

		destinatario.saldo += valor;
	}

	/**
	 * Simula um investimento utilizando juros compostos de 1% ao período.
	 * 
	 * @param capitalInicial Valor inicial investido.
	 * @param tempo          Quantidade de períodos do investimento.
	 * 
	 * @return Valor final do investimento após o tempo informado.
	 * 
	 * @throws IllegalArgumentException Caso o capital inicial ou o tempo sejam
	 *                                  negativos ou zero.
	 */
	public double simularInvestimento(double capitalInicial, int tempo) {

		if (capitalInicial <= 0) {
			throw new IllegalArgumentException("Valor a ser investido não pode ser negativo");
		}

		if (tempo <= 0) {
			throw new IllegalArgumentException("Tempo do investimento não pode ser negativo");
		}

		return capitalInicial * Math.pow(1 + 0.01, tempo);
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {

		if (nomeTitular == null || nomeTitular.isBlank()) {
			throw new IllegalArgumentException("Nome do titular inválido");
		}

		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [nomeTitular=" + nomeTitular + ", saldo=" + saldo + "]";
	}

}
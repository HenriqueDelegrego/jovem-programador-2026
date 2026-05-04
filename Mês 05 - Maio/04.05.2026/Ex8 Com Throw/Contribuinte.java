
public class Contribuinte {

	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;

	/**
	 * Construtor da classe Contribuinte.
	 * 
	 * IMPORTANTE: utiliza os métodos setters para garantir que as validações sejam
	 * aplicadas também na criação do objeto.
	 * 
	 * @param nome       nome do contribuinte
	 * @param cpf        CPF do contribuinte (11 dígitos)
	 * @param uf         estado (2 letras)
	 * @param rendaAnual renda anual (valor positivo)
	 */
	public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
		setNome(nome);
		setCpf(cpf);
		setUf(uf);
		setRendaAnual(rendaAnual);
	}

	/**
	 * Calcula o valor do imposto a pagar com base na renda anual do contribuinte e
	 * na alíquota correspondente.
	 * 
	 * A alíquota é determinada internamente pelo método
	 * {@link #determinarAliquota()}.
	 *
	 * @return valor do imposto a pagar
	 */
	public double calcularImpostoAPagar() {
		return rendaAnual * determinarAliquota();
	}

	/**
	 * Determina a alíquota de imposto aplicável com base na renda anual.
	 *
	 * Faixas de tributação:
	 * <ul>
	 * <li>Até 4000: isento (0%)</li>
	 * <li>De 4000 até 9000: 5.8%</li>
	 * <li>De 9000 até 25000: 15%</li>
	 * <li>De 25000 até 35000: 27.5%</li>
	 * <li>Acima de 35000: 30%</li>
	 * </ul>
	 *
	 * Este método é private porque representa um detalhe interno da regra de
	 * negócio. Ele não deve ser acessado diretamente por outras classes, pois:
	 * <ul>
	 * <li>Evita acoplamento com a lógica interna de cálculo</li>
	 * <li>Permite alterar as regras de alíquota sem impactar código externo</li>
	 * <li>Garante que o cálculo do imposto ocorra sempre de forma controlada</li>
	 * </ul>
	 *
	 * @return alíquota correspondente à renda anual
	 */
	private double determinarAliquota() {
		if (rendaAnual <= 4000) {
			return 0;
		} else if (rendaAnual <= 9000) {
			return 0.058;
		} else if (rendaAnual <= 25000) {
			return 0.15;
		} else if (rendaAnual <= 35000) {
			return 0.275;
		}
		return 0.3;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		// Validação: impede que o nome seja nulo ou vazio
		if (nome == null || nome.isBlank()) {
			// "throw" lança uma exceção em tempo de execução
			// Aqui usamos IllegalArgumentException porque o argumento recebido é inválido
			// Ao lançar a exceção, o fluxo do programa é interrompido imediatamente
			// e o objeto NÃO será criado/alterado com um estado inválido
			// Quem chamar este método pode tratar a exceção com try/catch

			throw new IllegalArgumentException("Erro, nome inválido");
		}
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		// Validação:
		// - não pode ser null
		// - não pode ser vazio
		// - deve ter exatamente 11 caracteres
		if (cpf == null || cpf.isBlank() || cpf.length() != 11) {
			throw new IllegalArgumentException("Erro, cpf inválido");
		}
		this.cpf = cpf;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		if (uf == null || uf.isBlank() || uf.length() != 2) {
			throw new IllegalArgumentException("Erro, uf inválida");
		}
		this.uf = uf;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		// Validação:
		// - renda deve ser maior que zero
		if (rendaAnual <= 0) {
			throw new IllegalArgumentException("Erro, renda anual inválida");
		}
		this.rendaAnual = rendaAnual;
	}

	@Override
	public String toString() {
		return "Contribuinte [nome=" + nome + ", cpf=" + cpf + ", uf=" + uf + ", rendaAnual=" + rendaAnual + "]";
	}

}

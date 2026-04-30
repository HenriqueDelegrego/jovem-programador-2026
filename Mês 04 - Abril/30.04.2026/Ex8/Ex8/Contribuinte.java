
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
	 * Calcula o valor do imposto a pagar com base na renda anual.
	 * 
	 * @return valor do imposto a pagar
	 */
	public double calcularImpostoAPagar() {
		if (rendaAnual <= 4000) {
			return 0;
		} else if (rendaAnual <= 9000) {
			return rendaAnual * 0.058;
		} else if (rendaAnual <= 25000) {
			return rendaAnual * 0.15;
		} else if (rendaAnual <= 35000) {
			return rendaAnual * 0.275;
		}
		return rendaAnual * 0.3;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		// Validação: impede que o nome seja nulo ou vazio
		if (nome == null || nome.isBlank()) {
			System.out.println("Erro, nome inválido");
		} else {
			this.nome = nome;
		}
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
			System.out.println("Erro, cpf inválido");
		} else {
			this.cpf = cpf;
		}
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		if (uf == null || uf.isBlank() || uf.length() != 2) {
			System.out.println("Erro, uf inválida");
		} else {
			this.uf = uf;
		}
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		// Validação:
		// - renda deve ser maior que zero
		if (rendaAnual <= 0) {
			System.out.println("Erro, renda anual inválida");
		} else {
			this.rendaAnual = rendaAnual;
		}
	}

	@Override
	public String toString() {
		return "Contribuinte [nome=" + nome + ", cpf=" + cpf + ", uf=" + uf + ", rendaAnual=" + rendaAnual + "]";
	}

}

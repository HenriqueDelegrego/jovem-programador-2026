
public class Flor {

	private String nomeFlor;
	private double preco;
	private String nomeCliente;

	public Flor(String nomeFlor, double preco, String nomeCliente) {
		setNomeFlor(nomeFlor);
		setPreco(preco);
		setNomeCliente(nomeCliente);
	}

	public String getNomeFlor() {
		return nomeFlor;
	}

	public void setNomeFlor(String nomeFlor) {
		if (nomeFlor == null || nomeFlor.isBlank()) {
			throw new IllegalArgumentException("Nome da flor inválida");
		}
		this.nomeFlor = nomeFlor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			throw new IllegalArgumentException("Preço da flor inválida");
		}
		this.preco = preco;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		if (nomeCliente == null || nomeCliente.isBlank()) {
			throw new IllegalArgumentException("Nome do cliente inválido");
		}
		this.nomeCliente = nomeCliente;
	}

	@Override
	public String toString() {
		return "Flor [nomeFlor=" + nomeFlor + ", preco=" + preco + ", nomeCliente=" + nomeCliente + "]";
	}

}

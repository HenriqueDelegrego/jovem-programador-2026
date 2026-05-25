/**
 * Representa um animal genérico.
 *
 * <p>
 * Esta é a superclasse da hierarquia. Em orientação a objetos, a herança
 * permite que classes mais específicas reutilizem atributos e métodos definidos
 * em uma classe mais geral.
 * </p>
 *
 * <p>
 * Neste exemplo, as classes {@code GatoSelvagem}, {@code Ave} e {@code Primata}
 * herdam de {@code Animal}. Dessa forma, todas elas possuem características
 * comuns como raça, nome, porte, habitat e país de origem, sem necessidade de
 * repetir esse código em cada classe.
 * </p>
 */
public class Animal {

	private String raca;
	private String nome;
	private String porte;
	private String habitat;
	private String paisOrigem;

	public Animal(String raca, String nome, String porte, String habitat, String paisOrigem) {
		setRaca(raca);
		setNome(nome);
		setPorte(porte);
		setHabitat(habitat);
		setPaisOrigem(paisOrigem);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

}

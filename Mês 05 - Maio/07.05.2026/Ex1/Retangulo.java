/**
 * Esta classe representa um único retângulo.
 * 
 * Cada objeto criado a partir dessa classe possui seus próprios valores de
 * altura e largura.
 * 
 * Diferente da classe ListaRetangulos, que trabalha com uma coleção de vários
 * objetos, esta classe representa apenas um elemento individual.
 * 
 * Isso mostra a ideia de modelagem orientada a objetos: primeiro criamos a
 * estrutura de um objeto individual (Retangulo) e depois podemos criar classes
 * que agrupam vários desses objetos utilizando coleções como ArrayList.
 */
public class Retangulo {

	private double altura;
	private double largura;

	public Retangulo(double altura, double largura) {
		setAltura(altura);
		setLargura(largura);
	}

	/**
	 * Calcula a área do retângulo.
	 * 
	 * @return a área calculada pela multiplicação da largura pela altura
	 */
	public double calcularArea() {
		return largura * altura;
	}

	/**
	 * Calcula o perímetro do retângulo.
	 * 
	 * @return o perímetro calculado pela soma dos lados multiplicada por 2
	 */
	public double calcularPerimetro() {
		return (largura + altura) * 2;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura <= 0) {
			throw new IllegalArgumentException("Altura inválida");
		}
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if (largura <= 0) {
			throw new IllegalArgumentException("Largura inválida");
		}
		this.largura = largura;
	}

	@Override
	public String toString() {
		return "Retangulo [altura=" + altura + ", largura=" + largura + "]";
	}

}

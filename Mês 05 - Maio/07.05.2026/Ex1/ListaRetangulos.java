import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe representa uma coleção de objetos Retangulo.
 * 
 * Enquanto a classe Retangulo representa um único retângulo (com altura,
 * largura, área e perímetro próprios), esta classe é responsável por armazenar
 * vários objetos Retangulo juntos utilizando um ArrayList.
 * 
 * Isso é um exemplo de associação entre objetos: um objeto ListaRetangulos
 * "possui" vários objetos Retangulo.
 */
public class ListaRetangulos {

	/**
	 * Lista que armazena vários objetos Retangulo.
	 * 
	 * O tipo List é uma interface do Java para coleções. O ArrayList é uma
	 * implementação dessa interface.
	 * 
	 * Cada posição da lista guarda uma referência para um objeto Retangulo criado
	 * separadamente.
	 */
	private List<Retangulo> listaRetangulos;

	/**
	 * Construtor da classe.
	 * 
	 * Inicializa a lista vazia para que possamos adicionar objetos Retangulo
	 * posteriormente.
	 */
	public ListaRetangulos() {
		listaRetangulos = new ArrayList<Retangulo>();
	}

	/**
	 * Adiciona um objeto Retangulo na coleção.
	 * 
	 * Recebemos um retângulo já criado e armazenamos ele dentro do ArrayList.
	 * 
	 * @param r objeto Retangulo que será adicionado
	 */
	public void adicionarRetangulo(Retangulo r) {
		listaRetangulos.add(r);
	}

	/**
	 * Percorre todos os retângulos da lista para descobrir qual possui a maior
	 * área.
	 * 
	 * O laço for-each percorre cada objeto Retangulo armazenado no ArrayList.
	 * 
	 * @return o objeto Retangulo com maior área
	 */
	public Retangulo obterRetanguloMaiorArea() {

		double maiorArea = 0;
		Retangulo retMaiorArea = null;

		for (Retangulo r : listaRetangulos) {

			if (r.calcularArea() > maiorArea) {
				maiorArea = r.calcularArea();
				retMaiorArea = r;
			}
		}

		return retMaiorArea;
	}

	/**
	 * Percorre todos os retângulos da lista para descobrir qual possui o maior
	 * perímetro.
	 * 
	 * @return o objeto Retangulo com maior perímetro
	 */
	public Retangulo obterRetanguloMaiorPerimetro() {

		double maiorPerimetro = 0;
		Retangulo retMaiorPerimetro = null;

		for (Retangulo r : listaRetangulos) {

			if (r.calcularPerimetro() > maiorPerimetro) {
				maiorPerimetro = r.calcularPerimetro();
				retMaiorPerimetro = r;
			}
		}

		return retMaiorPerimetro;
	}

}
import java.util.ArrayList; // Importa a classe ArrayList (lista dinâmica)
import java.util.Collections; // Importa utilidades para manipular coleções (como ordenar)
import java.util.List; // Interface List (tipo mais genérico de lista)

public class ExemploArrayList {

	public static void main(String[] args) {

		// Criamos uma lista de inteiros (Integer, não int)
		// List é a interface, ArrayList é a implementação
		List<Integer> listaIdades = new ArrayList<>();

		// Adicionando elementos à lista
		// O método add() insere valores no final da lista
		listaIdades.add(15);
		listaIdades.add(18);
		listaIdades.add(17);
		listaIdades.add(19);
		listaIdades.add(14);

		// Imprime a lista inteira
		// O ArrayList já sabe como se mostrar (ex: [15, 18, 17, 19, 14])
		System.out.println(listaIdades);

		// Ordena os elementos da lista em ordem crescente
		// Esse método modifica a própria lista (não cria outra)
		Collections.sort(listaIdades);

		// Imprime novamente a lista, agora ordenada
		System.out.println(listaIdades);

	}
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira a palavra");
		String palavra = input.next();

		// Lista que irá armazenar cada caractere da palavra
		// ArrayList permite armazenar elementos dinamicamente
		List<Character> listaCaracteres = new ArrayList<>();

		// Percorre a String caractere por caractere
		for (int i = 0; i < palavra.length(); i++) {
			// charAt(i) pega o caractere na posição i da String
			// Cada caractere é adicionado na lista
			listaCaracteres.add(palavra.charAt(i));
		}

		// Cria uma nova lista a partir da lista original
		List<Character> listaInvertida = new ArrayList<>(listaCaracteres);

		// Inverte a ordem dos elementos da nova lista
		// A lista original permanece inalterada
		Collections.reverse(listaInvertida);

		// Compara as duas listas:
		// equals() verifica se possuem os mesmos elementos na mesma ordem
		if (listaCaracteres.equals(listaInvertida)) {
			System.out.println("A palavra " + palavra + " é um palíndromo");
		} else {
			System.out.println("A palavra " + palavra + " não é um palíndromo");
		}

	}

}
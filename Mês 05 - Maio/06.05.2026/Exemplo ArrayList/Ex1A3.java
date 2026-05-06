import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex1A3 {

	public static void main(String[] args) {

		// Criação de uma lista de inteiros usando a interface List
		// e a implementação ArrayList (estrutura dinâmica que permite
		// redimensionamento)
		List<Integer> listaNumeros = new ArrayList<>();

		// Adicionando elementos à lista (inserção no final da lista)
		listaNumeros.add(5);
		listaNumeros.add(2);
		listaNumeros.add(4);
		listaNumeros.add(6);
		listaNumeros.add(1);
		listaNumeros.add(8);

		// Ordena os elementos da lista em ordem crescente
		// (usa o algoritmo de ordenação padrão do Java)
		Collections.sort(listaNumeros);

		// Inverte a ordem dos elementos da lista
		// Resultado final: lista em ordem decrescente
		Collections.reverse(listaNumeros);

		// Criação de um objeto Scanner para ler entrada do usuário
		Scanner input = new Scanner(System.in);

		// Solicita ao usuário um valor para buscar na lista
		System.out.println("Insira o valor a ser pesquisado");
		int valor = input.nextInt();

		// Procura o valor na lista
		// indexOf retorna:
		// - o índice do elemento, se encontrado
		// - -1, se o elemento não estiver na lista
		int indice = listaNumeros.indexOf(valor);

		// Verifica se o valor foi encontrado
		if (indice != -1) {
			System.out.println("O valor " + valor + " está no índice " + indice);
		} else {
			System.out.println("Valor inexistente na lista");
		}

		// Exibe a lista final (ordenada em ordem decrescente)
		System.out.println(listaNumeros);

	}

}
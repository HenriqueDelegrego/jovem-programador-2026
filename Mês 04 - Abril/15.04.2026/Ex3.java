import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número");
		int numero = input.nextInt();
		// Chama o método "imprimir20Numeros" e ENVIA o valor de "numero" para ele
		// Esse valor enviado é chamado de PARÂMETRO
		imprimir20Numeros(numero);

	}

	// Este é um método que recebe um número como parâmetro
	// Ou seja, ele precisa que alguém envie um valor para funcionar
	public static void imprimir20Numeros(int numero) {

		// "numero" aqui é o valor que foi enviado pelo main

		// O laço começa no número recebido e vai até esse número + 20
		for (int i = numero; i <= numero + 20; i++) {
			System.out.println(i);
		}

	}

}

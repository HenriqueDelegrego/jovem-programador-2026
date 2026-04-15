import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o nome do coleguinha");
		String nome = input.next();
		// dependendo do nome digitado, o programa executa um método diferente

		if (nome.equalsIgnoreCase("João")) {
			imprimirJoao();
			// Se o nome for "João", chama (executa) o método imprimirJoao()
		} else if (nome.equalsIgnoreCase("Ana")) {
			imprimirAna();
			// Se o nome for "Ana", chama (executa) o método imprimirAna()
		}

	}

	// MÉTODO 1
	public static void imprimirJoao() {
		// Este é um método.
		// Pense nele como um "bloco de código com nome" que pode ser chamado quando
		// necessário.

		System.out.println("O nome dele é João");
		System.out.println("Ele tem 20 anos");
		System.out.println("Ele é estudante de desenvolvimento de sistemas");
		// Esse método imprime informações sobre João
	}

	// MÉTODO 2
	public static void imprimirAna() {
		// Outro método, semelhante ao anterior, mas com informações diferentes

		System.out.println("O nome dela é Ana");
		System.out.println("Ela tem 22 anos");
		System.out.println("Ela é estudante de desenvolvimento de sistemas");
		// Esse método imprime informações sobre Ana
	}

}

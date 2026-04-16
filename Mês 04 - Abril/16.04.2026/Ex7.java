import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira um número");
		int numero = input.nextInt();

		if (numero == 1) {
			System.out.println(obterVerao()); // chama o método e imprime o retorno
		} else if (numero == 2) {
			System.out.println(obterOutono());
		} else if (numero == 3) {
			System.out.println(obterInverno());
		} else {
			System.out.println(obterPrimavera());
		}

	}

	/**
	 * Método que retorna uma mensagem sobre o verão.
	 * 
	 * Um método com retorno (neste caso String) significa que ele
	 * devolve um valor ao ser chamado. Esse valor pode ser usado
	 * ou exibido por quem chamou o método.
	 * 
	 * @return uma String contendo informações sobre o verão
	 */
	public static String obterVerao() {
		return "É verão\nE o tempo está quente";
	}

	/**
	 * Método que retorna uma mensagem sobre o outono.
	 * 
	 * O comando 'return' envia o valor de volta para o local
	 * onde o método foi chamado.
	 * 
	 * @return uma String contendo informações sobre o outono
	 */
	public static String obterOutono() {
		return "É outono\nE as folhas estão caindo";
	}

	/**
	 * Método que retorna uma mensagem sobre o inverno.
	 * 
	 * Note que o tipo do método é String, então ele obrigatoriamente
	 * precisa retornar um texto.
	 * 
	 * @return uma String contendo informações sobre o inverno
	 */
	public static String obterInverno() {
		return "É inverno\nE o tempo está frio";
	}

	/**
	 * Método que retorna uma mensagem sobre a primavera.
	 * 
	 * Todos os métodos deste exemplo funcionam da mesma forma:
	 * não recebem parâmetros e retornam uma String.
	 * 
	 * @return uma String contendo informações sobre a primavera
	 */
	public static String obterPrimavera() {
		return "É primavera\nE as folhas estão florindo";
	}

}
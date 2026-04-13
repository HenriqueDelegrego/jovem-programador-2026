import java.util.Scanner;

// Declaração da classe principal do programa
public class Ex1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o valor de 1 a 4");
		
		int estacao = input.nextInt();

		// Dependendo do valor digitado, chamamos (executamos) um método diferente
		if (estacao == 1) {
			imprimirVerao(); // chama o método que mostra informações sobre o verão
		} else if (estacao == 2) {
			imprimirOutono(); // chama o método do outono
		} else if (estacao == 3) {
			imprimirInverno(); // chama o método do inverno
		} else if (estacao == 4) {
			imprimirPrimavera(); // chama o método da primavera
		}

	}

	// ================= MÉTODOS =================
	// Um método é um bloco de código separado que executa uma tarefa específica.
	// Aqui temos vários métodos, cada um responsável por mostrar uma estação.

	// Método que imprime informações sobre o verão
	public static void imprimirVerao() {
		// Tudo que está aqui dentro só será executado quando o método for chamado
		System.out.println("É verão");
		System.out.println("E o tempo está quente");
		System.out.println("Todo mundo está na praia");
	}

	// Método que imprime informações sobre o outono
	public static void imprimirOutono() {
		System.out.println("É outono");
		System.out.println("E as folhas estão caindo");
	}

	// Método que imprime informações sobre o inverno
	public static void imprimirInverno() {
		System.out.println("É inverno");
		System.out.println("E está frio");
	}

	// Método que imprime informações sobre a primavera
	public static void imprimirPrimavera() {
		System.out.println("É primavera");
		System.out.println("E as folhas estão florindo");
	}

}
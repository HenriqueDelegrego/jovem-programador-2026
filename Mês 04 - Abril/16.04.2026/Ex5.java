import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número base");
		int base = input.nextInt();

		System.out.println("Insira o ponto 1");
		int ponto1 = input.nextInt();

		System.out.println("Insira o ponto 2");
		int ponto2 = input.nextInt();

		// Chama o método para verificar qual ponto está mais próximo da base
		obterNumeroMaisProximo(base, ponto1, ponto2);

	}

	/**
	 * Compara dois pontos em relação a um valor base e imprime qual deles está mais próximo.
	 *
	 * <p>A lógica de proximidade é baseada na distância absoluta entre cada ponto e a base.
	 * Para isso, utilizamos o método {@code Math.abs()}, que retorna o valor absoluto de um número.
	 *
	 * <p>Por exemplo:
	 * <ul>
	 *   <li>Se base = 10 e ponto1 = 7 → diferença = -3 → valor absoluto = 3</li>
	 *   <li>Se base = 10 e ponto2 = 13 → diferença = 3 → valor absoluto = 3</li>
	 * </ul>
	 *
	 * <p>O valor absoluto é essencial porque queremos apenas a distância, sem considerar
	 * direção (positivo ou negativo). Assim, tanto 7 quanto 13 estão à mesma distância de 10.
	 *
	 * @param base valor de referência
	 * @param ponto1 primeiro ponto a ser comparado
	 * @param ponto2 segundo ponto a ser comparado
	 */
	public static void obterNumeroMaisProximo(int base, int ponto1, int ponto2) {

		// Calcula a distância entre ponto1 e base
		// (ponto1 - base) pode ser negativo, então usamos Math.abs para garantir um valor positivo
		int distancia1Base = Math.abs(ponto1 - base);

		// Calcula a distância entre ponto2 e base
		// Novamente, usamos Math.abs para obter a distância real (sem sinal)
		int distancia2Base = Math.abs(ponto2 - base);

		// Compara as distâncias para determinar qual ponto está mais próximo
		if (distancia1Base < distancia2Base) {
			System.out.println("O ponto " + ponto1 + " está mais perto da base");
		} else {
			System.out.println("O ponto " + ponto2 + " está mais perto da base");
		}

	}

}
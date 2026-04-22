
public class Ex9 {

	public static void main(String[] args) {

		System.out.println(determinarParOuImpar(11));

	}

	/**
	 * Verifica se um número inteiro é par.
	 *
	 * @param numero número a ser verificado
	 * @return true se o número for par, false caso contrário
	 */
	public static boolean determinarParOuImpar(int numero) {
		return numero % 2 == 0;
	}

}
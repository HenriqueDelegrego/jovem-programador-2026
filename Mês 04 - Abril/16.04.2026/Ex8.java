
public class Ex8 {

	public static void main(String[] args) {

		double media = calcularMedia(8, 8.5, 8.9);
		System.out.println(media);

		System.out.println(calcularMedia(9, 9.2, 9.6));

	}

	/**
	 * Calcula a média aritmética de três valores.
	 * 
	 * @param nota1 primeira nota
	 * @param nota2 segunda nota
	 * @param nota3 terceira nota
	 * @return média aritmética das três notas
	 */
	public static double calcularMedia(double nota1, double nota2, double nota3) {
		return (nota1 + nota2 + nota3) / 3;
	}

}
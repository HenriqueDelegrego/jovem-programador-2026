import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número de inscrição do atleta");
		String numeroInscricao = input.next();

		System.out.println("Insira a altura do atlta");
		double altura = input.nextDouble();

		double somaAltura = 0;
		int qtdAtletas = 0;

		double alturaAtletaMaisAlto = Double.MIN_VALUE;
		double alturaAtletaMaisBaixo = Double.MAX_VALUE;

		String nrAtletaMaisAlto = "";
		String nrAtletaMaisBaixo = "";

		while (!numeroInscricao.equals("0")) {

			if (altura > alturaAtletaMaisAlto) {
				alturaAtletaMaisAlto = altura;
				nrAtletaMaisAlto = numeroInscricao;
			}

			if (altura < alturaAtletaMaisBaixo) {
				alturaAtletaMaisBaixo = altura;
				nrAtletaMaisBaixo = numeroInscricao;
			}

			somaAltura += altura;
			qtdAtletas++;

			System.out.println("Insira o número de inscrição do atleta");
			numeroInscricao = input.next();

			System.out.println("Insira a altura do atlta");
			altura = input.nextDouble();
		}

		double media = somaAltura / qtdAtletas;

		System.out.println("A média de altura é dos " + qtdAtletas + " atletas é de " + media + " metros");

		System.out.println("Atleta mais alto: " + nrAtletaMaisAlto + " (" + alturaAtletaMaisAlto + " metros)");
		System.out.println("Atleta mais baixo: " + nrAtletaMaisBaixo + " (" + alturaAtletaMaisBaixo + " metros)");

	}

}

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número de inscrição do atleta");
		String numeroInscricao = input.next();

		System.out.println("Insira a altura do atleta");
		double altura = input.nextDouble();

		double somaAltura = 0;
		int qtdAtletas = 0;

		// Inicialização para comparação:
		// menor valor possível → qualquer altura será maior que isso
		double alturaAtletaMaisAlto = Double.MIN_VALUE;

		// maior valor possível → qualquer altura será menor que isso
		double alturaAtletaMaisBaixo = Double.MAX_VALUE;

		String nrAtletaMaisAlto = "";
		String nrAtletaMaisBaixo = "";

		// Continua enquanto o número de inscrição NÃO for "0"
		while (!numeroInscricao.equals("0")) {

			// Se a altura atual for maior que a maior já registrada,
			// atualiza o "recorde"
			if (altura > alturaAtletaMaisAlto) {
				alturaAtletaMaisAlto = altura;
				nrAtletaMaisAlto = numeroInscricao;
			}

			// Se a altura atual for menor que a menor já registrada,
			// atualiza o "recorde"
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

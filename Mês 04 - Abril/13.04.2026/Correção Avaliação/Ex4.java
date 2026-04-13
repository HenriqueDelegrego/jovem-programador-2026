import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {

		double matriz[][] = {
				{ 21.7, 21.5, 21.3, 21.2, 21.4, 21.9, 22.5, 23.0, 23.6, 24.1, 24.5, 24.8, 25.0, 24.9, 24.7, 24.5, 24.2,
						24.0, 23.7, 23.4, 23.0, 22.7, 22.4, 22.1 },
				{ 21.8, 21.6, 21.5, 21.7, 22.1, 22.8, 23.5, 24.3, 25.0, 26.0, 27.0, 28.0, 29.0, 29.5, 29.2, 28.8, 28.0,
						27.0, 26.0, 25.2, 24.5, 24.0, 23.5, 22.8 },
				{ 20.7, 20.5, 20.3, 20.2, 20.5, 21.0, 21.8, 22.5, 23.2, 24.0, 24.8, 25.5, 26.0, 26.5, 27.0, 27.5, 28.0,
						28.2, 28.0, 27.8, 27.5, 27.0, 26.5, 26.0 },
				{ 20.2, 20.0, 19.8, 19.7, 20.0, 20.5, 21.2, 22.0, 22.8, 23.5, 24.2, 25.0, 25.8, 26.5, 27.0, 27.5, 27.8,
						28.0, 27.8, 27.5, 27.0, 26.5, 26.0, 25.5 },
				{ 19.8, 19.6, 19.5, 19.4, 19.7, 20.2, 20.8, 21.5, 22.2, 23.0, 23.8, 24.5, 25.2, 26.0, 26.5, 27.0, 27.3,
						27.5, 27.2, 26.8, 26.3, 25.8, 25.2, 24.5 },
				{ 19.5, 19.3, 19.2, 19.4, 20.0, 21.0, 22.5, 24.0, 25.5, 27.0, 28.2, 29.0, 29.5, 29.8, 29.5, 29.0, 28.5,
						28.0, 27.5, 27.0, 26.5, 26.0, 25.5, 25.0 },
				{ 19.2, 19.0, 18.8, 18.7, 19.0, 19.5, 20.2, 21.0, 21.8, 22.5, 23.2, 24.0, 24.8, 25.5, 26.0, 26.5, 27.0,
						27.2, 27.0, 26.7, 26.3, 25.8, 25.2, 24.5 } };

		String dias[] = { "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" };

		Scanner input = new Scanner(System.in);

		// a) Média diária
		System.out.print("Digite o dia da semana: ");
		String diaInput = input.nextLine();

		int indiceDia = -1;
		for (int i = 0; i < dias.length; i++) {
			if (dias[i].equalsIgnoreCase(diaInput)) {
				indiceDia = i;
				break;
			}
		}

		if (indiceDia != -1) {
			double soma = 0;
			for (int j = 0; j < matriz[indiceDia].length; j++) {
				soma += matriz[indiceDia][j];
			}
			double media = soma / matriz[indiceDia].length;
			System.out.println("Média do dia: " + media);
		} else {
			System.out.println("Dia inválido.");
		}

		// b) Média por hora
		System.out.print("Digite a hora (0-23): ");
		int hora = input.nextInt();

		if (hora >= 0 && hora < matriz[0].length) {
			double soma = 0;
			for (int i = 0; i < matriz.length; i++) {
				soma += matriz[i][hora];
			}
			double mediaHora = soma / matriz.length;
			System.out.println("Média da hora: " + mediaHora);
		} else {
			System.out.println("Hora inválida.");
		}

		// c) Maior amplitude térmica
		double maiorAmp = Double.MIN_VALUE;
		int diaMaiorAmp = 0;

		for (int i = 0; i < matriz.length; i++) {
			double min = Double.MAX_VALUE;
			double max = Double.MIN_VALUE;

			for (int j = 1; j < matriz[j].length; j++) {
				if (matriz[i][j] < min)
					min = matriz[i][j];
				if (matriz[i][j] > max)
					max = matriz[i][j];
			}

			double amplitude = max - min;

			if (amplitude > maiorAmp) {
				maiorAmp = amplitude;
				diaMaiorAmp = i;
			}
		}

		System.out.println("Dia com maior amplitude térmica: " + dias[diaMaiorAmp]);
		System.out.println("Amplitude: " + maiorAmp);
	}
}
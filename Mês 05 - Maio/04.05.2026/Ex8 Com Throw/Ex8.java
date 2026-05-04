
public class Ex8 {

	public static void main(String[] args) {

		Contribuinte c1 = new Contribuinte("Joãozinho", "11111111111", "SC", 2000);
		Contribuinte c2 = new Contribuinte("Maria", "11111111111", "SC", 5000);
		Contribuinte c3 = new Contribuinte("Ana", "11111111111", "SC", 10000);
		Contribuinte c4 = new Contribuinte("Guilherme", "11111111111", "SC", 26000);
		Contribuinte c5 = new Contribuinte("Cleber", "11111111111", "SC", 36000);

		Contribuinte vetor[] = { c1, c2, c3, c4, c5 };

		// Quem mais paga imposto

		double maiorImposto = Double.MIN_VALUE;
		Contribuinte contribuinteMaiorImposto = null;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].calcularImpostoAPagar() > maiorImposto) {
				maiorImposto = vetor[i].calcularImpostoAPagar();
				contribuinteMaiorImposto = vetor[i];
			}
		}

		System.out.println("Quem mais paga imposto: " + contribuinteMaiorImposto);

		// Qual o total de imposto pago entre os 5 contribuintes?

		double totalImposto = 0;

		for (int i = 0; i < vetor.length; i++) {
			totalImposto += vetor[i].calcularImpostoAPagar();
		}

		System.out.println("O total de imposto pago é de: " + totalImposto);

	}

}

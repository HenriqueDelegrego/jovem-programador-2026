
public class Ex7 {

	public static void main(String[] args) {

		// Criação dos objetos (instâncias da classe Aeronave)
		// Cada objeto representa uma aeronave com características próprias
		// Como o construtor usa setters, TODAS as validações já são aplicadas aqui
		Aeronave a1 = new Aeronave("Boeing 747", 150, 700, 1000, 10);
		Aeronave a2 = new Aeronave("Cessna", 2, 200, 100, 2);

		// Aqui há um valor inválido (queimaPorMinuto = -4)
		// O setter correspondente vai impedir a atribuição e imprimir erro
		Aeronave a3 = new Aeronave("Fokker", 1, 210, 150, -4);

		Aeronave a4 = new Aeronave("Airbus", 200, 800, 1500, 15);

		// Tentativa de alterar o modelo para um valor inválido (string em branco)
		// O setter bloqueia a alteração → o valor anterior ("Boeing 747") permanece
		a1.setModelo("    ");

		// Armazena todos os objetos em um vetor para facilitar a manipulação em
		// conjunto
		Aeronave vetorAeronaves[] = { a1, a2, a3, a4 };

		// Qual aeronave leva o maior número de passageiros?

		int maiorQtdPassageiros = Integer.MIN_VALUE;
		Aeronave aeronaveMaisPassageiros = null;

		for (int i = 0; i < vetorAeronaves.length; i++) {
			// Agora o acesso é via getter (encapsulamento)
			// Não acessamos mais o atributo diretamente
			if (vetorAeronaves[i].getQtdPassageiros() > maiorQtdPassageiros) {
				maiorQtdPassageiros = vetorAeronaves[i].getQtdPassageiros();
				aeronaveMaisPassageiros = vetorAeronaves[i];
			}
		}

		// Imprime o objeto (chama automaticamente o método toString())
		System.out.println(aeronaveMaisPassageiros);

		// Qual das aeronaves pode ficar mais tempo no ar?

		double maiorAutonomia = Double.MIN_VALUE;
		Aeronave aeronaveMaiorAutonomia = null;

		for (int i = 0; i < vetorAeronaves.length; i++) {
			if (vetorAeronaves[i].obterAutonomia() > maiorAutonomia) {
				maiorAutonomia = vetorAeronaves[i].obterAutonomia();
				aeronaveMaiorAutonomia = vetorAeronaves[i];
			}
		}

		System.out.println(aeronaveMaiorAutonomia);

		// qual deles consegue voar mais longe?

		double maiorDistancia = Double.MIN_VALUE;

		Aeronave aeronaveMaiorDistancia = null;

		for (int i = 0; i < vetorAeronaves.length; i++) {
			if (vetorAeronaves[i].obterDistanciaMaxima() > maiorDistancia) {
				maiorDistancia = vetorAeronaves[i].obterDistanciaMaxima();
				aeronaveMaiorDistancia = vetorAeronaves[i];
			}
		}

		System.out.println(aeronaveMaiorDistancia);
	}

}

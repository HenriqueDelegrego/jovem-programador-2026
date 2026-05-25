public class Ex1 {

	public static void main(String[] args) {

		// Cria um objeto da classe Circulo com raio igual a 5.
		Circulo circulo1 = new Circulo(5);

		// Chama o método calcularArea() do objeto circulo1
		// e exibe o resultado na tela.
		System.out.println(circulo1.calcularArea());

		// Cria um objeto da classe Cilindro com raio 4 e altura 2.
		// Como Cilindro herda de Circulo, o raio é inicializado
		// pelo construtor da superclasse através de super(raio).
		Cilindro c1 = new Cilindro(4, 2);

		// Chama o método próprio da classe Cilindro para calcular
		// o volume (área da base × altura).
		System.out.println(c1.calcularVolume());

		// Apesar de calcularArea() estar definido na classe Circulo,
		// ele pode ser chamado em um objeto Cilindro porque foi herdado
		// da superclasse. Neste caso, retorna a área da base circular
		// do cilindro.
		System.out.println(c1.calcularArea());

	}

}

public class Ex1 {

	public static void main(String[] args) {

		// Criação de objetos individuais da classe Retangulo
		// Cada variável guarda a referência para um objeto diferente
		Retangulo r1 = new Retangulo(4, 5);
		Retangulo r2 = new Retangulo(2, 4);
		Retangulo r3 = new Retangulo(1, 2);
		Retangulo r4 = new Retangulo(19, 1);

		// Criação do objeto que representa uma coleção de retângulos
		ListaRetangulos l1 = new ListaRetangulos();

		// Associação entre objetos:
		// estamos adicionando os objetos Retangulo dentro do objeto ListaRetangulos
		// O ArrayList de ListaRetangulos armazenará referências para esses objetos
		l1.adicionarRetangulo(r1);
		l1.adicionarRetangulo(r2);
		l1.adicionarRetangulo(r3);
		l1.adicionarRetangulo(r4);

		System.out.println(l1.obterRetanguloMaiorArea());
		System.out.println(l1.obterRetanguloMaiorPerimetro());

	}

}

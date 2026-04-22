
public class Ex1 {

	public static void main(String[] args) {

		// Criando um objeto da classe Pessoa.
		// "new Pessoa()" cria uma nova pessoa na memória.
		Pessoa p1 = new Pessoa();

		// Atribuindo valores aos atributos do objeto p1.
		// Estamos "preenchendo" os dados dessa pessoa.
		p1.nome = "Joãozinho";
		p1.sexo = 'M';
		p1.dataNascimento = "10/02/1998";
		p1.estadoCivil = "Solteiro";

		// Criando outro objeto da classe Pessoa.
		// Agora temos uma segunda pessoa independente da primeira.
		Pessoa p2 = new Pessoa();

		// Atribuindo valores aos atributos do objeto p2.
		p2.nome = "Maria";
		p2.sexo = 'F';
		p2.dataNascimento = "08/09/2001";
		p2.estadoCivil = "Casada";

		// Exibindo informações no console (tela).
		// System.out.println imprime uma linha de texto.
		// Aqui estamos acessando os dados dentro dos objetos.
		System.out.println("O " + p1.nome + " está " + p1.estadoCivil);
		System.out.println("A " + p2.nome + " está " + p2.estadoCivil);

	}

}

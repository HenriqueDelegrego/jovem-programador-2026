import java.time.LocalDate;

public class Ex9 {

	public static void main(String[] args) {

		// O construtor recebe o nome da pessoa e um objeto LocalDate
		// representando sua data de nascimento.
		// LocalDate.of(1977, 6, 4) cria uma data correspondente a 4 de junho de 1977.
		Pessoa p1 = new Pessoa("Jorge", LocalDate.of(1977, 6, 4));
		Pessoa p2 = new Pessoa("Ana", LocalDate.of(2002, 9, 14));
		Pessoa p3 = new Pessoa("Cláudia", LocalDate.of(1979, 8, 26));

		Familia f1 = new Familia();
		f1.adicionarPessoa(p1);
		f1.adicionarPessoa(p2);
		f1.adicionarPessoa(p3);

		System.out.println(p1.obterIdade());

		System.out.println(f1.obterPessoaMaisVelha());

	}

}

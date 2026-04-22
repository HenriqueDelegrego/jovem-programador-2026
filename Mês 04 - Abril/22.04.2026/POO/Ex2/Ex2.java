
public class Ex2 {

	public static void main(String[] args) {

		Mercado unidadeDeBlumenau = new Mercado();

		unidadeDeBlumenau.nome = "Giassi";
		unidadeDeBlumenau.qtdMacasVendidas = 500;
		unidadeDeBlumenau.precoMacas = 8.5;
		unidadeDeBlumenau.qtdLaranjasVendidas = 400;
		unidadeDeBlumenau.precoLaranjas = 9.2;

		Mercado unidadeDeJoinville = new Mercado();

		unidadeDeJoinville.nome = "Bistek";
		unidadeDeJoinville.qtdMacasVendidas = 600;
		unidadeDeJoinville.precoMacas = 8.9;
		unidadeDeJoinville.qtdLaranjasVendidas = 450;
		unidadeDeJoinville.precoLaranjas = 9.5;

		Mercado unidadeDeFlorianopolis = new Mercado();

		unidadeDeFlorianopolis.nome = "Angeloni";
		unidadeDeFlorianopolis.qtdMacasVendidas = 620;
		unidadeDeFlorianopolis.precoMacas = 9.8;
		unidadeDeFlorianopolis.qtdLaranjasVendidas = 500;
		unidadeDeFlorianopolis.precoLaranjas = 11.4;

		System.out.println(unidadeDeFlorianopolis.nome + " vendeu " + unidadeDeFlorianopolis.qtdMacasVendidas + " maçãs");

	}

}

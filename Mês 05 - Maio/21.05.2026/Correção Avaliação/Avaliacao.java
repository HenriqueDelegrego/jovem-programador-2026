import java.time.LocalDate;

public class Avaliacao {
	public static void main(String[] args) {

		// Criação dos carros conforme os dados fornecidos
		Carro c1 = new Carro("Volkswagen", "Gol", "FTX2A45", 2010, 21000, LocalDate.of(2024, 3, 14));
		Carro c2 = new Carro("Chevrolet", "Onix", "JKM9B12", 2015, 38000, LocalDate.of(2024, 11, 29));
		Carro c3 = new Carro("Honda", "Civic", "LPR4C67", 2010, 34000, LocalDate.of(2023, 6, 7));
		Carro c4 = new Carro("Chevrolet", "Cruze", "QWE7D89", 2019, 78000, LocalDate.of(2025, 1, 18));
		Carro c5 = new Carro("Volkswagen", "Polo", "ZTR1F23", 2019, 58000, LocalDate.of(2024, 8, 25));

		// Criação da revendedora
		Revendedora r = new Revendedora();

		// Inserção dos carros fornecidos
		r.adicionarCarro(c1);
		r.adicionarCarro(c2);
		r.adicionarCarro(c3);
		r.adicionarCarro(c4);
		r.adicionarCarro(c5);

		System.out.println(r.obterCarroPorPlaca("QWE7D89"));

		System.out.println(r.obterCarroMaisCaroAno(2010) + "\n");
		System.out.println(r.listarCarrosMarcaEPreco("Volkswagen", 20000, 59000) + "\n");

		System.out.println(c1.calcularDepreciacao(2030));
	}
}

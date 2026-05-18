
public class Ex5 {

	public static void main(String[] args) {

		ContaBancaria c1 = new ContaBancaria("José", 1000);
		ContaBancaria c2 = new ContaBancaria("Henrique", 2500);

		c2.transferir(c1, 500);

		System.out.println(c1);
		System.out.println(c2);

		System.out.println(c2.simularInvestimento(500, 5));

	}

}

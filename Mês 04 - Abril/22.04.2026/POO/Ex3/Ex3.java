
public class Ex3 {

	public static void main(String[] args) {

		Produto produto1 = new Produto();
		produto1.nome = "Caderno";
		produto1.descricao = "Caderno em espiral tamnho médio";
		produto1.precoUnitario = 4.5;
		produto1.desconto = 15;

		System.out.println(produto1.nome + " custa R$" + produto1.precoUnitario);

	}

}

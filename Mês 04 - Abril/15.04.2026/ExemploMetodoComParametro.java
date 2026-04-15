
public class ExemploMetodoComParametro {

	public static void main(String[] args) {
		// Aqui estamos chamando (executando) um método chamado "multiplicarValores"
		// Estamos passando dois valores para ele: 5 e 2
		// Esses valores são chamados de "parâmetros" (ou argumentos)
		multiplicarValores(5, 2);

	}

	// Declaração do método "multiplicarValores"
	// Esse método recebe dois números inteiros (int) como parâmetros
	// "fator1" e "fator2" são variáveis que vão armazenar os valores recebidos
	public static void multiplicarValores(int fator1, int fator2) {

		// Aqui multiplicamos os dois valores recebidos
		int produto = fator1 * fator2;
		System.out.println(produto);
	}

}

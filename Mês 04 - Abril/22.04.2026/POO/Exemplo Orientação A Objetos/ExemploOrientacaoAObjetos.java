
public class ExemploOrientacaoAObjetos {

	public static void main(String[] args) {
		// Aqui estamos criando um objeto (uma "instância") da classe Veiculo
		// Pense como criar um carro a partir de um molde
		Veiculo v1 = new Veiculo();

		// Agora estamos definindo (atribuindo) valores para os atributos do objeto v1

		v1.modelo = "Toyota Yaris";
		v1.comprimento = 4;
		v1.qtdPassageiros = 5;
		v1.velMax = 350;
		v1.cor = "Cinza";

		System.out.println(v1.modelo + " velocidade máxima: " + v1.velMax);

	}

}

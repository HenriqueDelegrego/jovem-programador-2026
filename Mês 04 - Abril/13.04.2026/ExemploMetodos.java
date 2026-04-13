// Declaração da classe (estrutura principal do programa)
public class ExemploMetodos {

	// Método principal (main)
	// É o ponto de entrada do programa: tudo começa a execução por aqui
	public static void main(String[] args) {
		
		// Aqui estamos chamando (executando) um método chamado imprimirInformacoesTurma
		imprimirInformacoesTurma();
	}

	// Declaração de um método
	// "imprimirInformacoesTurma" = nome do método
	public static void imprimirInformacoesTurma() {
		
		// Esses comandos exibem mensagens no console (tela)
		System.out.println("Turma do PJP Java SENAC Blumenau");
		System.out.println("A turma tem aulas nas segundas, quartas e quintas");
		System.out.println("Das 8:10 até 11:30");
	}

}
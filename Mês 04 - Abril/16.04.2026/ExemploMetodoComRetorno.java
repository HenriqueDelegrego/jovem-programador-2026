public class ExemploMetodoComRetorno {

    public static void main(String[] args) {

        // Chamando o método dividirValores e armazenando o resultado em uma variável
        // O método retorna um valor do tipo double (número com casas decimais)
        double resultado = dividirValores(8, 4);

        // Imprime o valor armazenado na variável resultado
        System.out.println(resultado);

        // Também é possível chamar o método diretamente dentro do println
        // Nesse caso, o valor retornado já é impresso sem precisar de variável
        System.out.println(dividirValores(10, 2));

    }

    /**
     * Este método realiza a divisão entre dois valores.
     *
     * Um método com retorno significa que ele devolve um valor após sua execução.
     * Nesse caso, ele retorna o resultado da divisão entre numerador e denominador.
     *
     * @param numerador valor que será dividido
     * @param denominador valor pelo qual o numerador será dividido
     * @return resultado da divisão entre numerador e denominador
     */
    public static double dividirValores(double numerador, double denominador) {

        // A palavra-chave 'return' devolve o resultado do método
        // Aqui estamos retornando o resultado da divisão
        return numerador / denominador;
    }

}
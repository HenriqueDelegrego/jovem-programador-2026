public class Ex1 {

    public static void main(String[] args) {

        // Matriz onde:
        // Coluna 0 = número do mês
        // Coluna 1 = lucro correspondente ao mês
        double[][] lucroLoja = {
            { 1, 1500.50 },
            { 2, 2000.75 },
            { 3, 1800.00 },
            { 4, 2200.30 },
            { 5, 2500.00 },
            { 6, 2700.10 },
            { 7, 3000.00 },
            { 8, 3200.50 },
            { 9, 3100.00 },
            { 10, 2900.75 },
            { 11, 2800.40 },
            { 12, 3500.90 }
        };

        // Loop para percorrer todas as linhas da matriz
        for (int i = 0; i < lucroLoja.length; i++) {

            // Exibe o mês (posição [i][0]) e o lucro (posição [i][1])
            System.out.println(
                "No mês " + lucroLoja[i][0] +
                " a loja teve um lucro de R$" + lucroLoja[i][1]
            );
        }

    }

}
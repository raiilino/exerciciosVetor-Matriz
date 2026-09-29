import java.util.Scanner;

class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] producao = new double[4][12];
        double[] totalAnual = new double[4];

        for (int pomar = 0; pomar < 4; pomar++) {
            System.out.printf("Pomar", pomar + 1);
            for (int mes = 0; mes < 12; mes++) {
                System.out.printf("Informe a produção do mês %d: ", mes + 1);
                producao[pomar][mes] = scanner.nextDouble();
                totalAnual[pomar] += producao[pomar][mes];
            }
        }

        int pomarMaiorProducao = 0;
        double maiorProducao = totalAnual[0];

        for (int pomar = 1; pomar < 4; pomar++) {
            if (totalAnual[pomar] > maiorProducao) {
                maiorProducao = totalAnual[pomar];
                pomarMaiorProducao = pomar;
            }
        }

        System.out.println("\n--- Relatório Anual de Produção por Pomar ---");
        for (int pomar = 0; pomar < 4; pomar++) {
            System.out.printf("Pomar %d - Total Anual: %.2f\n", (pomar + 1), totalAnual[pomar]);
        }

        System.out.printf("\nO pomar com maior produção foi o Pomar %d com total de %.2f\n",
                (pomarMaiorProducao + 1), maiorProducao);

        scanner.close();
    }
}
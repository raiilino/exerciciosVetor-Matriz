import java.util.Scanner;

class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] fertilidade = new double[6][6];
        double[] mediaLinhas = new double[6];


        for (int i = 0; i < 6; i++) {
            System.out.printf("--- Linha %d ---\n", i + 1);
            double somaLinha = 0;
            for (int j = 0; j < 6; j++) {
                System.out.printf("Informe o índice de fertilidade da posição [%d][%d]: ", i, j);
                fertilidade[i][j] = scanner.nextDouble();
                somaLinha += fertilidade[i][j];
            }
            mediaLinhas[i] = somaLinha / 6.0;
        }

        System.out.println("\n--- Relatório: Média de Fertilidade por Linha ---");
        for (int i = 0; i < 6; i++) {
            System.out.printf("Linha %d: Média = %.2f\n", (i + 1), mediaLinhas[i]);
        }

        scanner.close();
    }
}
import java.util.Scanner;

class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] pragas = new int[5][5];

        int maiorFoco = -1;
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Informe a quantidade de focos de pragas na região [%d][%d]: ", i, j);
                pragas[i][j] = scanner.nextInt();

                if (pragas[i][j] > maiorFoco) {
                    maiorFoco = pragas[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("\n--- Relatório do Controle de Pragas ---");
        System.out.printf("Maior quantidade de focos: %d\n", maiorFoco);
        System.out.printf("Região localizada na posição: linha %d, coluna %d\n", linhaMaior, colunaMaior);

        scanner.close();
    }
}
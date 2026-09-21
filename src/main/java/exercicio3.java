import java.util.Scanner;

class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Informe o valor do numero[%d]\n", i);
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
            soma += numeros[i];
        }
        System.out.println("A soma dos numeros é de:" + soma);
    }
}

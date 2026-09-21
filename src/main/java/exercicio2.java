class Main2 {
    public static void main(String[] args) {
        int soma = 0;
        int[] numeros = new int[5];
        numeros[0] = 67;
        numeros[1] = 20;
        numeros[2] = 89;
        numeros[3] = 29;
        numeros[4] = 16;
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
            soma += numeros[i];
        }
        System.out.println("A soma dos numeros é de:" + soma);
    }
}

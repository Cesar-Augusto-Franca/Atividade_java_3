public class atv2 {
    public static void main(String[] args) {
        import java.util.Scanner;

        public class SomaNumeros {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Declara um vetor (array) para armazenar 5 números inteiros
                int[] numeros = new int[5];

                // Pede ao usuário para inserir 5 números inteiros
                System.out.println("Digite 5 números inteiros:");
                for (int i = 0; i < 5; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros[i] = scanner.nextInt();
                }

                // Calcula a soma total dos valores no vetor
                int soma = 0;
                for (int numero : numeros) {
                    soma += numero;
                }

                // Exibe a soma total
                System.out.println("A soma total dos valores é: " + soma);

                scanner.close();
            }
        }

    }
}

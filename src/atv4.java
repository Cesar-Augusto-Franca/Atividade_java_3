import java.util.Scanner;
public class atv4 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Declara um vetor (array) para armazenar 10 números inteiros
                int[] numeros = new int[10];

                // Pede ao usuário para inserir 10 números inteiros
                System.out.println("Digite 10 números inteiros:");
                for (int i = 0; i < 10; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros[i] = scanner.nextInt();
                }

                // Inicializa maior e menor com o primeiro valor
                int maior = numeros[0];
                int menor = numeros[0];

                // Percorre o vetor para encontrar maior e menor
                for (int i = 1; i < 10; i++) {
                    if (numeros[i] > maior) {
                        maior = numeros[i];
                    }
                    if (numeros[i] < menor) {
                        menor = numeros[i];
                    }
                }

                // Exibe o maior e o menor valor
                System.out.println("O maior valor é: " + maior);
                System.out.println("O menor valor é: " + menor);

                scanner.close();
            }
        }



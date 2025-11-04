import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Declara um vetor (array) para armazenar 5 notas (valores double)
                double[] notas = new double[5];

                // Pede ao usuário para inserir 5 notas
                System.out.println("Digite 5 notas (valores decimais):");
                for (int i = 0; i < 5; i++) {
                    System.out.print("Nota " + (i + 1) + ": ");
                    notas[i] = scanner.nextDouble();
                }

                // Calcula a soma das notas
                double soma = 0;
                for (double nota : notas) {
                    soma += nota;
                }

                // Calcula a média
                double media = soma / 5;

                // Exibe a média
                System.out.println("A média das notas é: " + media);

                scanner.close();
            }
        }



import java.util.Scanner;
public class atv10 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int[] vetor1 = new int[5];
                int[] vetor2 = new int[5];
                int[] vetor3 = new int[10];

                System.out.println("Digite 5 números para o primeiro vetor:");
                for (int i = 0; i < 5; i++) {
                    vetor1[i] = scanner.nextInt();
                    vetor3[i] = vetor1[i];
                }

                System.out.println("Digite 5 números para o segundo vetor:");
                for (int i = 0; i < 5; i++) {
                    vetor2[i] = scanner.nextInt();
                    vetor3[i + 5] = vetor2[i];
                }

                System.out.println("Vetor resultante:");
                for (int i = 0; i < 10; i++) {
                    System.out.print(vetor3[i] + " ");
                }
                System.out.println(); // Para pular uma linha no final
            }
        }




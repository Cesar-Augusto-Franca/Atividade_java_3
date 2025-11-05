import java.util.Scanner;
public class atv6 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int[] numeros = new int[8];
                System.out.println("Digite 8 números inteiros:");
                for (int i = 0; i < 8; i++) {
                    numeros[i] = scanner.nextInt();
                }
                System.out.println("Vetor na ordem inversa:");
                for (int i = 7; i >= 0; i--) {
                    System.out.print(numeros[i] + " ");
                }
                System.out.println(); // Para pular uma linha no final
            }
        }




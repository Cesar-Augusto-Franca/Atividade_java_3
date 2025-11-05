import java.util.Scanner;
public class atv9 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int[] numeros = new int[10];

                System.out.println("Digite 10 números inteiros:");
                for (int i = 0; i < 10; i++) {
                    numeros[i] = scanner.nextInt();
                }

                System.out.println("Números positivos:");
                for (int i = 0; i < 10; i++) {
                    if (numeros[i] > 0) {
                        System.out.print(numeros[i] + " ");
                    }
                }
                System.out.println(); // Para pular uma linha no final
            }
        }




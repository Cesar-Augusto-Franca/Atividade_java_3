import java.util.Scanner;
public class atv5 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int[] numeros = new int[10];
                int pares = 0;
                int impares = 0;

                System.out.println("Digite 10 números inteiros:");
                for (int i = 0; i < 10; i++) {
                    numeros[i] = scanner.nextInt();
                    if (numeros[i] % 2 == 0) {
                        pares++;
                    } else {
                        impares++;
                    }
                }

                System.out.println("Quantidade de pares: " + pares);
                System.out.println("Quantidade de ímpares: " + impares);
            }
        }




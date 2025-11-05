import java.util.Scanner;
public class atv8 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int[] original = new int[5];
                int[] dobro = new int[5];
                System.out.println("Digite 5 números inteiros:");
                for (int i = 0; i < 5; i++) {
                    original[i] = scanner.nextInt();
                    dobro[i] = original[i] * 2;
                }
                System.out.println("Original\tDobro");
                for (int i = 0; i < 5; i++) {
                    System.out.println(original[i] + "\t\t" + dobro[i]);
                }
            }
        }




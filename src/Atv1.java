import java.util.Scanner;
public class Atv1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i <5; i++) {
            System.out.println("Digite o "+(i+1)+" numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("numeros digitados");
        for (int num: numeros ){
            System.out.println(num);
        }
        sc.close();
    }}
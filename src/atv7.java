import java.util.Scanner;
public class atv7 {
    public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                String[] nomes = new String[10];
                boolean encontrado = false;
                System.out.println("Digite 10 nomes de alunos:");
                for (int i = 0; i < 10; i++) {
                    nomes[i] = scanner.nextLine();
                }
                System.out.println("Digite um nome para buscar:");
                String nomeBusca = scanner.nextLine();
                for (int i = 0; i < 10; i++) {
                    if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado) {
                    System.out.println("O nome está na lista.");
                } else {
                    System.out.println("O nome não está na lista.");
                }
            }
        }




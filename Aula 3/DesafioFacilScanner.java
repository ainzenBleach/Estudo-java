
import java.util.Scanner;

public class DesafioFacilScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite se nome:");
        String nome = input.nextLine();

        System.out.println("Digite sua idade:");
        int idade = input.nextInt();

        System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos");

        input.close();

    }
}

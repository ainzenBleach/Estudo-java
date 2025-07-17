
import java.util.Scanner;

public class DesafioMedioRepeticao {
    public static void main(String[] args) {
        String senha = "";
        Scanner input = new Scanner(System.in);

        while(!senha.equals("1234")){

            System.out.println("Digite a senha");
            senha = input.nextLine();

            if(!senha.equals("1234")){
                System.out.println("Senha invalida");
            }
        }

        System.out.println("Senha valida");
        input.close();
    }
}

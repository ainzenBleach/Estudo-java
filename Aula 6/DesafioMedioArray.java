import java.util.Scanner;
public class DesafioMedioArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] listaNome = new String[3];
        String nome;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um nome:");
            nome = input.nextLine();
            listaNome[i] = nome;
        }

        System.out.println("Mostrando os nomes:");

        for(int i = 1; i <= listaNome.length; i++) {
            System.out.println("Olá, " + listaNome[i]);
        }

        input.close();
    }
}

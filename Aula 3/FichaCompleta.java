import java.util.Scanner;

public class FichaCompleta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = input.nextLine();

        System.out.println("Digite sua idade:");
        int idade = input.nextInt();
        
        input.nextLine();
        
        System.out.println("Digite sua altura:");
        Double altura = input.nextDouble();

        input.nextLine();

        System.out.println("Digite sua inicial:");
        char inicial = input.next().charAt(0);

        input.nextLine();

        System.out.println("Digite seus status:");
        Boolean ativo = input.nextBoolean();


        System.out.println("--- Ficha Cadastral ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + "m");
        System.out.println("Inicial: " + inicial);
        System.out.println("Status: " + ativo);

        input.close();
    }
}



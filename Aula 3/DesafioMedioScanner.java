import java.util.Scanner;


public class DesafioMedioScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Digite seu nome:");
        String nome = input.nextLine();
        
        
        System.out.println("Digite sua altura:");
        Double altura = input.nextDouble();
        
        System.out.println("Digite sua inicial:");
        char PrimeiroLetra = input.next().charAt(0);

        System.out.println("Olá, "+ PrimeiroLetra +"! Seu nome é "+ nome +" e você tem "+ altura +"m de altura.");

        input.close();
    }
}

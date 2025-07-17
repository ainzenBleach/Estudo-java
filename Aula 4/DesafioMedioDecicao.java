
import java.util.Scanner;


public class DesafioMedioDecicao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite uma letra:");
        char letra = input.next().charAt(0);

        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("Você digitou uma vogal.");
        }else{
            System.out.println("Você digitou uma consoante.");
        }

        input.close();
    }
}

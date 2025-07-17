
import java.util.Random;
import java.util.Scanner;

public class DesafioDificilRepeticao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();

        int escolha = 3;

        do { 

        System.out.println("--- MENU ---");
        System.out.println("1 - Dizer Olá");
        System.out.println("2 - Mostrar número aleatório");
        System.out.println("0 - Sair");
        System.out.println("-----------");

        escolha = input.nextInt();


        if (escolha == 1) {
            System.out.println("Olá!");
        }else if (escolha == 2) {
            System.out.println(aleatorio.nextInt());
        }else if(escolha != 0){
            System.out.println("Opção invalida");
        }
        } while (escolha != 0);

        input.close();
    }
}

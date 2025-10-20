import java.util.Scanner;

public class DesafioMedioFuncao {
    public static int dobro(int a){
        return a * 2;
    } 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero:");
        
        int numero = input.nextInt();

        int resultado = dobro(numero);

        System.out.println("Seu numero dobrado é " + resultado);

        input.close();
    }

}

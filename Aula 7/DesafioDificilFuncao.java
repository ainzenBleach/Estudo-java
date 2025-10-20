import java.util.Scanner;

public class DesafioDificilFuncao {
    public static double media(double n1, double n2, double n3){
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a 1° nota:");
        double n1 = input.nextDouble();

        System.out.println("Digite a 2° nota:");
        double n2 = input.nextDouble();
        
        System.out.println("Digite a 3° nota:");
        double n3 = input.nextDouble();

        double resultado = media(n1, n2, n3);

        System.out.printf("A media das notas é %.2f", resultado);

        input.close();
    }
}

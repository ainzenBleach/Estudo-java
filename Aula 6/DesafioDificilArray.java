
import java.util.Scanner;


public class DesafioDificilArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] listaNota = new double[5];
        double nota;
        double somaNota = 0;


        System.out.println("Digite as notas do aluno:");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite a "+ i+"° nota");
            nota = input.nextFloat();
            listaNota[i - 1] = nota;
        }

        for (int i = 0; i < listaNota.length; i++) {
            somaNota = somaNota + listaNota[i];
        }

        System.out.println("Notas computadas");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i+"° nota:" + listaNota[i - 1]);
        }
        System.out.println("Soma das notas: " + somaNota);

        System.out.println("Media das notas: " + somaNota / 5);

        
        input.close();
    }
}

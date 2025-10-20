import java.util.Random;

public class DesafioFacilArray {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        int[] listaNumero = new int[5];
        listaNumero[0] = aleatorio.nextInt(100);
        listaNumero[1] = aleatorio.nextInt(100);
        listaNumero[2] = aleatorio.nextInt(100);
        listaNumero[3] = aleatorio.nextInt(100);
        listaNumero[4] = aleatorio.nextInt(100);

        for (int i = 0; i < listaNumero.length; i++) {
            System.err.println(listaNumero[i]);
        }

    }
}
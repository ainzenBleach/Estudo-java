import java.util.ArrayList;
import java.util.Scanner;


public class DesafioEspecial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> listaNome = new ArrayList<>();

        int opcao = 0;
        String nome = "";
        boolean ativo = true;
        boolean adicionarNome = true;

        do { 
          
        System.out.println("---- Menu ----");
        System.out.println("1. Adicionar nome");
        System.out.println("2. Ver lista de nomes");
        System.out.println("3. Fechar programa");

        opcao = input.nextInt();

        if (opcao == 1) {
            int palavras = 0;
            adicionarNome = true;
            System.out.println("---- Adicionando nome ----");
            System.out.println("Para sair digite 'sair' ");
            System.out.println("Adicione o nome:");
            input.nextLine();

            while(adicionarNome){
                nome = input.nextLine();
                
                if(nome.equals("sair")){
                    adicionarNome = false;
                    break;
                }
                palavras ++;
                listaNome.add(nome);
            }

            System.out.println( palavras +" foram adicionadas");

        } else if (opcao == 2) {
            System.out.println("Nomes adicionados:");
            System.out.println("Total de nomes adicionado: " + listaNome.size());
            System.out.println("Lista dos nomes:");
            
            for (int i = 0; i < listaNome.size(); i++) {
                System.out.println((i + 1) + ". " + listaNome.get(i));
            }

        }else if(opcao == 3){
            ativo = false;
        }else{
            System.out.println("Opção invalida");
        };


        } while (ativo);



        input.close();
    }
}

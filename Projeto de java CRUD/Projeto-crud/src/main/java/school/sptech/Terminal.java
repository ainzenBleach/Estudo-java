package school.sptech;

import java.util.ArrayList;
import java.util.Scanner;

public class Terminal {
    Integer mensagemInicial(){
        String[] numerosPreenchidos = new String[] {"Adicionar", "Mostrar", "Remover","Sair"};
        Scanner input = new Scanner(System.in);


        int opcao = 0;

        String mensagem = """
        Selecione um opção:
        1- Adiconar item
        2- Mostrar estoque
        4- Deletar produto
        5- Sair""";

        System.out.println(mensagem);

        opcao = input.nextInt();

        if (opcao < 0 || opcao > numerosPreenchidos.length){
            return null;
        }else{
        return opcao;
        }

    }
}

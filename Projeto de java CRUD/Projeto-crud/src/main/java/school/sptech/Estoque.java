package school.sptech;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
    ArrayList adicionarProduto (ArrayList listaProduto){
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------");

        System.out.println("Digite o nome do produto:");
        String produto = input.nextLine();

        System.out.println("--------------------");
        listaProduto.add(produto);

        return listaProduto;
    }

    void mostrarEstoque(ArrayList listaProduto){
        System.out.println("--------------------");
        for (int i = 0; i < listaProduto.size(); i++) {
            System.out.println((i + 1) + "° - " + listaProduto.get(i));
        }
        System.out.println("--------------------");
    }

    ArrayList removerProduto(ArrayList listaProduto) {
        Integer produto = -1;

        System.out.println("Escolha o produto que você quer remover:");
        mostrarEstoque(listaProduto);
        if (produto > 0 && produto < listaProduto.size()) {
            listaProduto.remove(produto - 1);
        } else {
            System.out.println("Digite um produto valido");
            removerProduto(listaProduto);
        }

        return listaProduto;
    }
}

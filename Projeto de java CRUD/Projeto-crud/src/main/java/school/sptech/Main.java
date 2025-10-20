package school.sptech;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        Estoque estoque = new Estoque();
        ArrayList<String> listaProduto = new ArrayList<>();
        Boolean operacao = true;


    do {
        int opcao = terminal.mensagemInicial();

        switch (opcao) {
            case 1 -> listaProduto = estoque.adicionarProduto(listaProduto);
            case 2 -> estoque.mostrarEstoque(listaProduto);
            case 3 -> estoque.removerProduto(listaProduto);
            default -> System.out.println("Comando invalido");
       }

    }while(operacao);


        }
    }
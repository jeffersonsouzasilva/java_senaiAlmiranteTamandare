package ListaComprasExer;

/*
* Lista de Compras
* - Crie um programa que permita ao usuário inserir o nome de 5 itens que deseja
* - Armazene os nomes dos itens em um array de strings.
* - Após a entrada dos itens, exiba a lista de compras na tela, um item por linha
*
* */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] produtos = new String[5];

        System.out.println("Digite o nome de 5 itens que deseja da lista:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Produto " + (i + 1) + ":");
            produtos[i] = scanner.nextLine();
        }

        System.out.println(" ");
        for (int i = 0; i < 5; i++){
            System.out.println("Produto " + (i + 1) + ":" + produtos[i]);
        }



    }
}

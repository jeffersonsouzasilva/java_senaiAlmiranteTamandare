package ListaDeComprasExer;
import java.util.Scanner;


public class ListaDeCompras {
    public static void main(String[] args) {
        // Criar um array para armazenar os itens da lista de compras
        String[] listaDeCompras = new String[5];


        // Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);


        // Solicitar ao usuário que insira os nomes dos itens
        System.out.println("Digite os nomes de 5 itens que deseja comprar no supermercado:");


        for (int i = 0; i < listaDeCompras.length; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            listaDeCompras[i] = scanner.nextLine();
        }


        // Exibir a lista de compras
        System.out.println("\nSua lista de compras:");
        for (String item : listaDeCompras) {
            System.out.println("- " + item);
        }


        // Fechar o scanner
        scanner.close();
    }
}
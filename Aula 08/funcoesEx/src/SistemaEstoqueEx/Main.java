package SistemaEstoqueEx;

public class Main {
    /*
     Sistema de Estoque
     - Criar uma classe Produto para representar produtos em um sistema de estoque. O construtor da classe deve receber
      o nome, preço e quantidade do produto.
     - Crie um método exibirInformacoes() que imprime no console as informações do produto(nome, preço, quantidade).
     */

    public static void main(String[] args) {
        Produto chocolate = new Produto("Nestle", 13.5,3);

        System.out.println(chocolate);
    }
}

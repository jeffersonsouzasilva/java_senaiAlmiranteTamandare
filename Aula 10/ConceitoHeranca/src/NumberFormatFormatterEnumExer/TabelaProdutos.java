package NumberFormatFormatterEnumExer;
import java.util.Formatter;


public class TabelaProdutos {
    public static void main(String[] args) {
        // Detalhes do produto
        String nomeProduto1 = "Notebook";
        double precoProduto1 = 3599.99;
        int quantidadeProduto1 = 15;


        String nomeProduto2 = "Smartphone";
        double precoProduto2 = 1999.90;
        int quantidadeProduto2 = 30;


        String nomeProduto3 = "Mouse";
        double precoProduto3 = 79.99;
        int quantidadeProduto3 = 50;


        // Criar e formatar a tabela
        Formatter formatter = new Formatter();


        formatter.format("%-20s %-10s %-10s%n", "Produto", "Preço (R$)", "Quantidade");
        formatter.format("%-20s %-10s %-10s%n", "-------------------", "----------", "----------");
        formatter.format("%-20s %-10.2f %-10d%n", nomeProduto1, precoProduto1, quantidadeProduto1);
        formatter.format("%-20s %-10.2f %-10d%n", nomeProduto2, precoProduto2, quantidadeProduto2);
        formatter.format("%-20s %-10.2f %-10d%n", nomeProduto3, precoProduto3, quantidadeProduto3);


        // Exibir a tabela
        System.out.println(formatter);


        formatter.close();
    }
}


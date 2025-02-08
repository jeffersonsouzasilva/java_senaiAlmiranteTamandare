import java.util.Scanner;

public class switchDescricaoDeProdutoExercicioSwitchCase37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário a inserção do código do produto
        System.out.print("Insira o código do produto (De 1 até 5): ");
        int codigoProduto = scanner.nextInt();

        // Utilizar a estrutura switch-case para determinar a descrição do produto
        String descricao;
        switch (codigoProduto) {
            case 1:
                descricao = "Notebook";
                break;
            case 2:
                descricao = "Smartphone";
                break;
            case 3:
                descricao = "Tablet";
                break;
            case 4:
                descricao = "Monitor";
                break;
            case 5:
                descricao = "Impressora";
                break;
            default:
                descricao = "Código de produto inválido.";
                break;
        }

        // Exibir a descrição do produto
        System.out.println("Descrição: " + descricao);

        scanner.close();
    }
}

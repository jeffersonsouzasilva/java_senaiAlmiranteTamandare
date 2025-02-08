import java.util.Scanner;

public class ifelseDescontoProduto01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o usuário (Premium, Pro ou Start): ");
        String usuario = scanner.nextLine();

        System.out.println("Informe o preço do produto: ");
        Double preco = scanner.nextDouble();


        if (usuario.equals("Premium"))
        {
            Double precoPremium = preco - (preco * 0.15);
            System.out.println("O preço Premium com desconto é: " + precoPremium);
        }
        else if (usuario.equals("Pro"))
        {
            Double precoPro = preco - (preco * 0.10);
            System.out.println("O preço Pro com desconto é: " + precoPro);
        }
        else
        {
            Double precoPro = preco - (preco * 0.05);
            System.out.println("O preço Pro com desconto é: " + precoPro);
        }

    }
}

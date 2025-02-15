import java.util.Scanner;

public class DescontoUsuario
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informar o tipo de usuário (Premium, Pro ou Start): ");
        String usuario = scanner.next();

        System.out.println("Informar o preço do produto: ");
        double preco = scanner.nextDouble();

        if (usuario.equals("Premium"))
        {
            double precoPremium = preco - (preco * 0.15);
            System.out.println("Preço com desconto Premium:" + precoPremium);
        }
        else if (usuario.equals("Pro"))
        {
            double precoPro = preco - (preco * 0.10);
            System.out.println("Preço com desconto Pro:" + precoPro);
        }
        else
        {
            double precoStart = preco - (preco * 0.05);
            System.out.println("Preço com desconto Start:" + precoStart);
        }
    }
}

import java.util.Scanner;

public class ConversosMoedas
{
    public static void main(String[] args)
    {
     Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor a ser convertido (2025): ");
        double valorReais = scanner.nextDouble();

        System.out.println("1- Euro");
        System.out.println("2- Dólar");
        System.out.println("3- Libra");
        System.out.println("Escolha uma opção para converter o dinhero: ");
        int opcao = scanner.nextInt();

        double valorDolar = valorReais * 5.84;
        double valorEuro = valorReais * 6.06;
        double valorLibra = valorReais * 7.24;

        switch (opcao)
        {
            case 1:
                System.out.println("Real em Dólar:" + valorDolar);
                break;
            case 2:
                System.out.println("Real em Euro:" + valorEuro);
                break;
            case 3:
                System.out.println("Real em Libra:" + valorLibra);
                break;
            default:
                System.out.println("Não efetuado.");
                break;
        }

    }
}

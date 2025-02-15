import java.util.Scanner;

public class numeroPositivo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numeroPrimeiro = scanner.nextDouble();

        while (numeroPrimeiro <= 10)
        {
            System.out.println("Digite mais um número: ");
            double numeroSegundo = scanner.nextDouble();

        }


    }
}

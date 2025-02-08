import java.util.Scanner;

public class switchConversorMoeda02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o valor em Reais
        System.out.print("Digite o valor em Reais(R$): ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite a taxa do dia em Reais(R$): ");
        double numero2 = scanner.nextDouble();

        // Solicitar ao usuário a escolha da operação
        System.out.println("Escolha qual moeda deseja converter: ");
        System.out.println("1. Dólar");
        System.out.println("2. Euro");
        System.out.println("3. Libra Esterlina");
        System.out.print("Digite o número correspondente a moeda que deseja converter: ");
        int conversao = scanner.nextInt();

        // Variável para armazenar o resultado
        double resultado;

        // Utilizar a estrutura switch-case para realizar a conversão da moeda
        switch (conversao) {
            case 1:
                resultado = numero1 / numero2;
                System.out.println("O valor convertido em Dólar é: " + resultado);
                break;
            case 2:
                resultado = numero1 / numero2;
                System.out.println("O valor convertido em Euro é: " + resultado);
                break;
            case 3:
                resultado = numero1 / numero2;
                System.out.println("O valor convertido em Libra Esterlina é: " + resultado);
                break;

            default:
                System.out.println("Operação inválida.");
                break;
        }

        scanner.close();
    }
}

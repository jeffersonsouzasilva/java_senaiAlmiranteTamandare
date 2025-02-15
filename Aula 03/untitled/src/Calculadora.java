import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite outro número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("1-adição; 2-Subtração; 3-Multiplicação; 4-divisão; Escolha uma operação: ");
        int operacao = scanner.nextInt();

        double resultado1 = (double) (numero1 + numero2);
        double resultado2 = (double) (numero1 - numero2);
        double resultado3 = (double) (numero1 * numero2);
        double resultado4 = (double) (numero1 / numero2);


        switch (operacao)
        {
            case 1:
                System.out.println("Resultado:" + resultado1);
                break;
            case 2:
                System.out.println("Resultado:" + resultado2);
                break;
            case 3:
                System.out.println("Resultado:" + resultado3);
                break;
            case 4:
                System.out.println("Resultado:" + resultado4);
                break;
            default:
                System.out.println("não há resultado");
                break;

        }


    }
}

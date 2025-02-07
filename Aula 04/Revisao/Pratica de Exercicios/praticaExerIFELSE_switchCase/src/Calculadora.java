import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário a inserção dos números
        System.out.print("Digite o Número 1: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o Número 2: ");
        double numero2 = scanner.nextDouble();

        // Solicitar ao usuário a escolha da operação
        System.out.println("Escolha a operação: ");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Divisão");
        System.out.println("4. Multiplicação");
        System.out.print("Digite o número correspondente à operação desejada: ");
        int operacao = scanner.nextInt();

        // Variável para armazenar o resultado
        double resultado;

        // Utilizar a estrutura switch-case para realizar a operação escolhida
        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado da adição: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            case 4:
                resultado = numero1 * numero2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        scanner.close();
    }
}

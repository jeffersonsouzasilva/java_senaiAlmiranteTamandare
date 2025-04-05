package CalculadoraExer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado = 0;
        char operacao;

        try {
            System.out.print("Digite a operação (+, -, *, /): ");
            operacao = scanner.next().charAt(0);

            System.out.print("Digite o numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Digite o denominador: ");
            int denominador = scanner.nextInt();



            switch (operacao) {
                case '+':
                    resultado = numerador + denominador;
                    System.out.println("Resultado: " + resultado);
                    break;
                case '-':
                    resultado = numerador - denominador;
                    System.out.println("Resultado: " + resultado);
                    break;
                case '*':
                    resultado = numerador * denominador;
                    System.out.println("Resultado: " + resultado);
                    break;
                case '/':
                    if (denominador == 0) {
                        throw new ArithmeticException();
                    }
                    resultado = numerador / denominador;
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    throw new IllegalArgumentException("Errou");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Você deve digitar um número inteiro válido!");
            scanner.nextLine(); // Limpa o buffer do scanner
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero!");
            scanner.nextLine(); // Limpa o buffer do scanner
        }

        scanner.close();
    }
}

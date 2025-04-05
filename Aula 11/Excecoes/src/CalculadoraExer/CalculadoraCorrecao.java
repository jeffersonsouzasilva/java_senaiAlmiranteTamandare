package CalculadoraExer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraCorrecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Digite o primeiro número:");
            double num1 = scanner.nextDouble();


            System.out.println("Digite o segundo número:");
            double num2 = scanner.nextDouble();


            System.out.println("Escolha a operação (+, -, *, /):");
            char operacao = scanner.next().charAt(0);


            double resultado = 0;
            switch (operacao) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Divisão por zero não é permitida.");
                    }
                    resultado = num1 / num2;
                    break;
                default:
                    System.out.println("Operação inválida.");
                    return;
            }


            System.out.println("O resultado é: " + resultado);


        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite um número válido.");
        } finally {
            scanner.close();
        }
    }
}


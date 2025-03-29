package ControleDeGastosExer;
import java.util.Scanner;


public class ControleDeGastos {
    public static void main(String[] args) {
        // Array para armazenar os gastos diários
        double[] gastos = new double[7];
        double totalGastos = 0; // Variável para calcular o total dos gastos


        // Scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);


        // Solicitar ao usuário os gastos diários
        System.out.println("Insira os gastos de cada dia da semana:");
        String[] diasDaSemana = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"};


        for (int i = 0; i < gastos.length; i++) {
            System.out.print(diasDaSemana[i] + ": R$ ");
            gastos[i] = scanner.nextDouble();
            totalGastos += gastos[i]; // Soma ao total de gastos
        }


        // Calcular a média de gastos por dia
        double mediaGastos = totalGastos / gastos.length;


        // Exibir o resultado
        System.out.println("\nResumo dos gastos:");
        System.out.println("Total da semana: R$ " + totalGastos);
        System.out.println("Média de gastos por dia: R$ " + mediaGastos);


        // Fechar o scanner
        scanner.close();
    }
}

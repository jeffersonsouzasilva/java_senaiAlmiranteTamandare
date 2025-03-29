package NumberFormatFormatterEnumExer;

import java.util.Scanner;


public class DiasSemana {
    // Enumeração para os dias da semana
    public enum DiaSemana {
        DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Solicitar ao usuário um número entre 1 e 7
        System.out.println("Digite um número de 1 a 7 para representar o dia da semana:");
        int numero = scanner.nextInt();


        // Verificar se o número está dentro do intervalo válido
        if (numero < 1 || numero > 7) {
            System.out.println("Número inválido. Por favor, insira um número entre 1 e 7.");
        } else {
            // Obter o dia correspondente utilizando valores da enum
            DiaSemana dia = DiaSemana.values()[numero - 1];
            System.out.println("O dia correspondente é: " + dia);
        }


        scanner.close();
    }
}


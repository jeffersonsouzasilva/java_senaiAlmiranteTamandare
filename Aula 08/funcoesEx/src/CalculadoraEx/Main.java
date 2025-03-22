package CalculadoraEx;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //01 - CRIAR A ENTRADA DE DADOS E A VARIÁVEL QUE VAI ARMAZENAR QUANTOS NÚMEROS SERÃO USADOS
        System.out.print("Digite a quantidade de números: ");
        int quantidade = scanner.nextInt();

        //02 - CRIAR UMA VARIÁVEL PARA SOMAR TODOS OS NÚMEROS QUE SERÃO DIGITADOS
        double soma = 0;

        //03 - USAR O LAÇO FOR PARA INTERAGIR COM QUANTOS NÚMEROS SERÃO LANÇADOS
        //EXEMPLO: SE NOSSA VARIÁVEL QUANTIDADE (DECLARADA ACIMA) TIVER O VALOR 2

        //1º EXECUÇÃO DO FOR: VOCÊ DIGITOU O NÚMERO 10, ELE SERÁ ARMAZENAO NA VARIÁVEL NUMERO E EM SEGUIDA O NUMERO 10 SERÁ GRAVADO NA VARIAVEL SOMA, E O i QUE ERA IGUAL 1, PASSOU A SER DOIS

        //2º EXECUÇÃO DO FOR: ELE VAI VERIFICAR A CONDIÇÃO, i <= QUANTIDADE, É VERDADE, i = 2, ENTÃO VAI EXECUTAR, VOCÊ DIGITA O NÚMERO, QUE É 8, ELE ARMAZENA NA VARIÁVEL NUMERO, E SOMA O 8 NA VARIÁVEL SOMA QUE JÁ TEM O VALOR 10, AGORA SOMA VALE 18

        //3º EXECUÇÃO DO FOR: AGORA i = 3, i <= QUANTIDADE, ESSE TESTE É FALSO, ENTÃO SAI DO FOR
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o número " + i + ": ");
            double numero = scanner.nextDouble();
            soma += numero; // Soma os números
        }

        //04 - DEPOIS DE SAIR DO FOR, O CÓDIGO EXECUTA O MÉTODP CALCULARMEDIA
        double media = CalcularMedia(soma, quantidade);
        System.out.println("A média é: " + media);

        scanner.close();
    }

    //05 - CRIAÇÃO DO MÉTODO CALCULAR MÉDIA
    public static double CalcularMedia(double soma, int quantidade) {
        return soma / quantidade; // Calcula a média
    }
}

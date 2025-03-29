package ConversorMoedasExer;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Solicitar o valor em reais
        System.out.println("Digite o valor em reais (R$):");
        double valorReais = scanner.nextDouble();


        // Cotações atuais (exemplo: 1 BRL = 26.03 JPY, 1 BRL = 0.16 EUR)
        double cotacaoIene = 26.03;
        double cotacaoEuro = 0.16;


        // Converter para ienes e euros
        double valorIenes = valorReais * cotacaoIene;
        double valorEuros = valorReais * cotacaoEuro;


        // Formatar os valores para as moedas locais
        NumberFormat formatoIene = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        NumberFormat formatoEuro = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat formatoReal = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));


        // Exibir os resultados
        System.out.println("Valor em reais: " + formatoReal.format(valorReais));
        System.out.println("Valor em ienes: " + formatoIene.format(valorIenes));
        System.out.println("Valor em euros: " + formatoEuro.format(valorEuros));


        scanner.close();
    }
}



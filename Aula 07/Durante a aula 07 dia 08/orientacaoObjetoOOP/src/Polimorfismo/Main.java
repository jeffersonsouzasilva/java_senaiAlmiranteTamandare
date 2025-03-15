package Polimorfismo;

public class Main {
    public static void main(String[] args) {

        int arroz = 10;
        int feijao = 15;

        double carne = 10.5;
        double macarrao = 11.95;

        Integer batata = 5;
        Integer maracuja = 6;
        Integer beterraba = 11;

        int totalInt = Calculadora.somar(arroz, feijao);
        double totalDouble = Calculadora.somar(carne, macarrao);
        Integer totalInteger = Calculadora.somar(batata, maracuja, beterraba);

        System.out.println("O total de arroz e feijão  é: " +  totalInt);
        System.out.println("Total de carne + macarrão é: " + totalDouble);
        System.out.println("Total de batata, maracuja e beterraba é: " + totalInteger);
    }
}

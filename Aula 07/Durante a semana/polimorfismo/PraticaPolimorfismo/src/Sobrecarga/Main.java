package Sobrecarga;

public class Main {
    public static void main(String[] args) {
        int arroz = 2;
        int feijão = 3;

        double carne = 15.50;
        double macarrao = 7.29;

        Integer batata = 6;
        Integer maracuja = 8;
        Integer beterraba = 9;

        int totalint = Calculadora.somar(arroz, feijão);
        double totalDouble = Calculadora.somar(carne,macarrao);
        Integer totalInteger = Calculadora.somar(batata, maracuja, beterraba);


        System.out.println("O total de arroz e feijão é: " + totalint);
        System.out.println("O total de carne + macarrao é: " + totalDouble);
        System.out.println("O total de batata, maracuja e beterraba é: " + totalInteger);
    }
}

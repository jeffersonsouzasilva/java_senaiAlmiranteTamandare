package Polimorfismo;

public class Main {
    public static void main(String[] args) {

        int arroz = 10;
        int feijao = 15;

        double laranja = 10.5;
        double maca = 11.95;

        Integer maracuja = 5;
        Integer abacate = 6;
        Integer melao = 11;

        int totalInt = Calculadora.somar(arroz, feijao);
        double totalDouble = Calculadora.somar(laranja, maca);
        Integer totalInteger = Calculadora.somar(maracuja, abacate, melao);

        System.out.println("Total int: " +  totalInt);
        System.out.println("Total double: " + totalDouble);
        System.out.println("Total integer: " + totalInteger);
    }
}

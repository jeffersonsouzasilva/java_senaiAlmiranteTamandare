package CalculeIMC;

/*
Classe Pessoa

Crie um programa que contenha um classe chamada Pessoa, a classe deve conter os atributos Nome, Idade,Peso e Altura.

Nesta classe, também crie uma função que solicite os atributos peso e altura e calcule o IMC, retornando-o no console.

Instancie o objeto da classe Pessoa na classe Main e execute a função.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite seu Nome: ");
        String nome= scanner.nextLine();

        System.out.println("Digite sua idade: ");
        String idade= scanner.nextLine();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = Pessoa.calcularIMC(peso, altura);
        System.out.println(imc);

    }
}

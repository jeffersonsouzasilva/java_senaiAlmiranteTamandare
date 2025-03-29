package ControleGastosDiariosExer;

/*
* Controle de Gastos Diários
* - Crie um programa que registra os gastos diários do usuário durante uma semana
* - Utilize um array de double para armazanar osgastos de cada dia
* - Peça ao usuário que insira o gasto de cada dia da semana
* - Ao final, calcule e exiba o gasto total da semana e a média de gastos por dia
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] gastos = new double[7];

        double soma = 0;
        System.out.println("Digite os Gastos de cada dia: ");
        for (int i = 0; i < 7; i++) {
            System.out.println("Produto " + (i + 1) + ":");
            gastos[i] = scanner.nextDouble();
            soma += gastos[i];

        }
        System.out.println("Somatória " + soma);
        System.out.println("Somatória " + soma / gastos.length);


    }

}

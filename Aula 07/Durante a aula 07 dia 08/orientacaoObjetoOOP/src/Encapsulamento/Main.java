package Encapsulamento;

public class Main {
    public static void main(String[] args) {
        contaBancaria minhaConta = new contaBancaria("Senai",1000);

        System.out.println("Nome: " + minhaConta.getTitular());
        System.out.println("Saldo: " + minhaConta.getSaldo());

        minhaConta.setTitular("Senai São Paulo");
        minhaConta.setSaldo(10000);

        System.out.println("\n");

        System.out.println("Nome: " + minhaConta.getTitular());
        System.out.println("Saldo: " + minhaConta.getSaldo());
    }
}

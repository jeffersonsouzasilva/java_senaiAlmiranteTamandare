package Encapsulamento;

public class contaBancaria {
    private String titular;
    private double saldo;


    //Ao adcionar private é necesssario criar get e set
    // click + direito -> generate -> Getter and Setter -> selecionar titular e saldo
    // click + direito -> generate -> Constructor -> selecionar titular e saldo // criar um constructor a partir da main contaBancaria minhaConta = new contaBancaria("Senai",1000);



    public contaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    //Todas vez que usar o private preciso criar o constructor e get & set

    /*
        private String Nome
        - criar Construtor
        - Criar Get
        - Criar Set
    */
}

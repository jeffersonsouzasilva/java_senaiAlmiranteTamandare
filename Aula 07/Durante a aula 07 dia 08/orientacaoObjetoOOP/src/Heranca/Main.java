package Heranca;

public class Main {
    public static void main(String[] args) {

        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.beber();
        caramelo.dormir();
        caramelo.comer();

        System.out.println("\n");

        Papagaio Jose = new Papagaio();
        Jose.voar();
        Jose.comer();
        Jose.beber();
        Jose.dormir();
    }
}

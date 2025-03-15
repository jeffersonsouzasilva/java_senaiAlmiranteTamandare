package AnimalsEx;

public class Main {
    /*
    Criem uma classe abstrata que representa um conceito genérico (exemplo; Animal, Veículo, etc.).
    Essa classe deve possuir um atributo encapsulado(privado) e um método abstrato que deverá ser implementado pelas subclasses.

    Criem duas subclasses que herdem da classe abstrata e sobrescrevam o método abstrato, demonstrando polimorfismo.

    Na classe principal, instanciem objetos das subclasses e utilizem os métodos implementados para demonstrar os conceitos aplicados.

    Observação: Lembrem-se de que o atributo privado na classe abstrata deve ser acessado apenas por meio de métodos do tipo getters e setters. O objetivo é praticar o uso de encapsulamento e reutilização de código por meio da herança.

     */

    public static void main(String[] args) {
        Cachorro luk = new Cachorro("PitBull","American", "Corre");

        Passaro loro = new Passaro("Papagaio","Amazona aestiva","Voa");

        System.out.println(luk);
        System.out.println();
        System.out.println();
        System.out.println(loro);

    }



}

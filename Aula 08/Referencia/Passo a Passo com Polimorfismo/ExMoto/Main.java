package ExMoto;


/*

Crie uma classe chamada Moto, a classe deve conter:
 - 3 atributos;
 - 2 métodos: 1 para mostrar os atributos e 1 para indicar que a Moto está a 40Km/h.

O objeto deve ser instanciado na classe que contém o Main

 */

public class Main {
    public static void main(String[] args) {
        Moto suzuki = new Moto("Suzuki","V-strom 1050xt","1037");

        System.out.println(suzuki);
        System.out.println("A Moto esta a 40Km/h");

    }
}

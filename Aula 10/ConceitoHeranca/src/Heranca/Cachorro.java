package Heranca;

// Classe derivada (subclasse)
class Cachorro extends Animal {
    // Atributo específico da classe Cachorro
    private String raca;


    // Construtor para inicializar atributos
    public Cachorro(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }


    // Método específico para a raça
    public void mostrarRaca() {
        System.out.println("Raça: " + raca);
    }


    // Sobrescrita do método emitirSom (polimorfismo)
    @Override
    public void emitirSom() {
        System.out.println(nome + " está latindo: Au au!");
    }


    // Método adicional
    public void correr() {
        System.out.println(nome + " está correndo alegremente.");
    }
}

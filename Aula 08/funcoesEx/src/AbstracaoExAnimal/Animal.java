package AbstracaoExAnimal;

/*
1.Criar a Classe Abstrata Animal
  A classe abstrata Animal terá:
    - Um atributo privado nome.
    - Um método abstrato fazerSom() que será implementado pelas subclasses.
    - Métodos get e set para o atributo nome.
 */
public abstract class Animal {
    // Atributo privado encapsulado
    private String nome;

    // Método abstrato (deve ser implementado pelas subclasses)
    public abstract void fazerSom();

    // Métodos get e set para o atributo nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) { // Validação simples
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }
}
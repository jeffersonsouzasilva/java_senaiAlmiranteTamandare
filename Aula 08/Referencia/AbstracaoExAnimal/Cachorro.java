package AbstracaoExAnimal;



/*
2.Criar as Subclasses Cachorro e Gato
  As subclasses herdam de Animal e implementam o método abstrato fazerSom().
    - Subclasse Cachorro
    - Subclasse Gato
 */
public class Cachorro extends Animal {
    // Implementação do método abstrato
    @Override
    public void fazerSom() {
        System.out.println(getNome() + " diz: Au Au!");
    }
}

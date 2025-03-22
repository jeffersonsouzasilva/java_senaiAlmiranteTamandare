package AbstracaoExCliente;

/*
1.Criar a Classe Abstrata
  A classe abstrata deve representar um conceito genérico. No código fornecido,
     a classe Endereco já é uma classe abstrata, mas vamos adaptá-la para atender ao exercício.

  Classe Abstrata Endereco
    - Adicionaremos um atributo privado encapsulado.
    - Criaremos um método abstrato que será implementado pelas subclasses.
 */
public abstract class Endereco {
    // Atributo privado encapsulado
    private String rua;

    // Construtor
    public Endereco(String rua) {
        this.rua = rua;
    }

    // Método abstrato (deve ser implementado pelas subclasses)
    public abstract void mostrarDetalhes();

    // Métodos get e set para o atributo rua
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        if (rua != null && !rua.isEmpty()) { // Validação simples
            this.rua = rua;
        } else {
            System.out.println("Rua inválida!");
        }
    }

    // Implementação dos métodos da interface Pessoa
    public abstract String getNome();

    public abstract void setNome(String nome);

    public abstract String getDocumento();

    public abstract void setDocumento(String documento);
}

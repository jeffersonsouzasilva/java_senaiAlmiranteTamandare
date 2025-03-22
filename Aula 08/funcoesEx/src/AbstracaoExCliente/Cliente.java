package AbstracaoExCliente;



/*
2.Criar as Subclasses
  As subclasses herdam da classe abstrata Endereco e implementam o método abstrato mostrarDetalhes().
    - Subclasse Cliente
    - Subclasse Funcionario
 */
public class Cliente extends Endereco {
    // Atributos privados
    private String nome;
    private String documento;

    // Construtor
    public Cliente(String rua, String nome, String documento) {
        super(rua); // Chama o construtor da classe abstrata
        this.nome = nome;
        this.documento = documento;
    }

    // Implementação do método abstrato
    @Override
    public void mostrarDetalhes() {
        System.out.println("Cliente: " + nome + ", Documento: " + documento + ", Rua: " + getRua());
    }

    // Implementação dos métodos da interface Pessoa
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDocumento() {
        return documento;
    }

    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
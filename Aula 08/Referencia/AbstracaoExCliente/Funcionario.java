package AbstracaoExCliente;



/*
2.Criar as Subclasses
  As subclasses herdam da classe abstrata Endereco e implementam o método abstrato mostrarDetalhes().
    - Subclasse Cliente
    - Subclasse Funcionario
 */
public class Funcionario extends Endereco {
    // Atributos privados
    private String nome;
    private String documento;
    private String cargo;

    // Construtor
    public Funcionario(String rua, String nome, String documento, String cargo) {
        super(rua); // Chama o construtor da classe abstrata
        this.nome = nome;
        this.documento = documento;
        this.cargo = cargo;
    }

    // Implementação do método abstrato
    @Override
    public void mostrarDetalhes() {
        System.out.println("Funcionário: " + nome + ", Documento: " + documento + ", Cargo: " + cargo + ", Rua: " + getRua());
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

    // Métodos específicos da classe Funcionario
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
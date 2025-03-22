package abstracao;


/*
Depois de criar a classe abstrata Endereco, vamos criar a classe Funcionario,
 dentro do package abstracao.

Na classe Funcionario, vamos herdar a classe Endereco e também vamos implementar a
 Interface Pessoa.
 */

//01 - CRIAR OS ATRIBUTOS
//02 - CRIAR OS GETTERS E SETTERS
//03 - CRIAR O CONSTRUTOR PARA FUNCIONÁRIO
//04 - CRIAR MÉTODO MOSTRARENDEREÇO
//05 - CRIAR O MÉTODO TOSTRING PARA MOSTRAR NOME, DOCUMENTO E CARGO

public class Funcionario extends Endereco implements Pessoa{
    //01 - CRIAR OS ATRIBUTOS
    private String nome;
    private String documento;
    private String cargo;

    //03 - CRIAR O CONSTRUTOR PARA FUNCIONÁRIO

    public Funcionario(String rua, String cidade, String numero, String estado, String cep, String nome, String documento, String cargo) {
        super(rua, cidade, numero, estado, cep);
        this.nome = nome;
        this.documento = documento;
        this.cargo = cargo;
    }


    //02 - CRIAR OS GETTERS E SETTERS
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //04 - CRIAR MÉTODO MOSTRARENDEREÇO
    @Override
    public void mostrarEndereco(){
        System.out.println("Endereço Funcionário: " + getRua() + ", " + getCidade() + ", " + getNumero() + ", " + getEstado() + ", " + getCep()) ;
    }

    //05 - CRIAR O MÉTODO TOSTRING PARA MOSTRAR NOME, DOCUMENTO E CARGO
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }


}

package Abstracao;

public class Funcionario extends Endereco implements Pessoa{

    //01 - CRIAR OS ATRIBUTOS
    private String nome;
    private String documento;
    private String cargo;

    //02 - CRIAR OS GETTERS E SETTERS
    @Override
    public String getNome() {
        return nome;
    }

    //03 - CRIAR O CONSTRUTOR PARA FUNCIONÁRIO
    public Funcionario(String rua, String cidade, String numero, String estado, String cep, String nome, String documento, String cargo) {
        super(rua, cidade, numero, estado, cep);
        this.nome = nome;
        this.documento = documento;
        this.cargo = cargo;
    }

    //04 - CRIAR MÉTODO MOSTRARENDEREÇO
    @Override
    public void mostrarEndereço(){
        System.out.println("Endereço Funcionário: " + getRua() + ", " + ", " + getCidade() + ", " + ", " + getNumero() + ", " + getEstado() + ", " + " " + getCep()) ;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }





}

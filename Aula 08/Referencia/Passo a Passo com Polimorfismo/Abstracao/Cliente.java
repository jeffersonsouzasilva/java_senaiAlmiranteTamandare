package Abstracao;

public class Cliente extends Endereco implements Pessoa {

    //01 - CRIAR OS ATRIBUTOS DA CLASSE CLIENTE
    private String nome;
    private String documento;

    //02 - CRIAR OS GETTERS E SETTERS
    @Override
    public String getNome() {
        return nome;
    }

    //03 - CRIAR O CONSTRUTOR DA CLASSE CLIENTE
    public Cliente(String rua, String cidade, String estado, String cep, String nome, String documento) {
        super(rua, cidade, estado, cep);
        this.nome = nome;
        this.documento = documento;
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

    //04 - CRIAR MÉTODO MOSTRARENDEREÇO
    @Override
    public void mostrarEndereço(){
        System.out.println("Endereço Cliente: " + getRua() + ", " + ", " + getCidade() + ", " + ", " + getNumero() + ", " + getEstado() + ", " + " " + getCep()) ;
    }

    //05 - CRIAR O MÉTODO TOSTRING PARA MOSTRAR NOME, DOCUMENTO E CARGO
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                '}';
    }
}

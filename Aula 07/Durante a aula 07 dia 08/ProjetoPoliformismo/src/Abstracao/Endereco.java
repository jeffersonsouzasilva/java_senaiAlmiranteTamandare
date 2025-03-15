package Abstracao;

public abstract class Endereco {
    //01 - CRIAR OS ATRIBUTOS
    private String rua;
    private String cidade;
    private String numero;
    private String estado;
    private String cep;

    //02 - CRIAR OS GETTERS E SETTERS
    public String getRua() {
        return rua;
    }

    //03 - CRIAR O CONTRUTOR COM TODOS OS ATRIBUTOS
    public Endereco(String rua, String cidade, String numero, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
        this.estado = estado;
        this.cep = cep;
    }

    //04 - CRIAR O CONSTRUTOR SEM ATRIBUTOS
    public Endereco() {
    }

    //05 - CRIAR O CONSTRUTOR SEM O ATRIBUTO NÚMERO
    public Endereco(String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    //06 - CRIAR O MÉTODO PARA MOSTRAR O ENDEREÇO
    public void mostrarEndereço(){
        System.out.println("Endereço" + rua + ", " + ", " + cidade + ", " + ", " + numero + ", " + estado + ", " + " " + cep) ;
    }


    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


}

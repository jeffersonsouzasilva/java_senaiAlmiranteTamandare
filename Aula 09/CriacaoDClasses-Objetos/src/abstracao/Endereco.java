package abstracao;

/*
2.
O próximo código é criar uma classe abstrata dentro do package abstracao,
 uma classe abstrata é uma classe que serve para mais de uma classe,
 ela será o modelo para que as outras classes herdem os atributos e
 os métodos definidos dentro dela.


Em nosso código vamos criar uma classe chamada Endereco,
 que é abstrata e que vai ser herdada pela classe Funcionario e
 Cliente, todo funcionário e todo cliente tem um endereço,
 então a classe Endereco (abstrata) pode ser usada por mais classe através da
 herança.

 */

//01 - CRIAR OS ATRIBUTOS
//02 - CRIAR OS GETTERS E SETTERS
//03 - CRIAR O CONTRUTOR COM TODOS OS ATRIBUTOS
//04 - CRIAR O CONSTRUTOR SEM ATRIBUTOS
//05 - CRIAR O CONSTRUTOR SEM O ATRIBUTO NÚMERO
//06 - CRIAR O MÉTODO PARA MOSTRAR O ENDEREÇO


public abstract class Endereco {
    //01 - CRIAR OS ATRIBUTOS
    private String rua;
    private String cidade;
    private String numero;
    private String estado;
    private String cep;

    //02 - CRIAR OS GETTERS E SETTERS / Direito - Generate - getter and setter - selecionar atributos
    public String getRua() {
        return rua;
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

    //03 - CRIAR O CONTRUTOR COM TODOS OS ATRIBUTOS / Direito - Generate - Construtor - selecionar atributos
    public Endereco(String rua, String cidade, String numero, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
        this.estado = estado;
        this.cep = cep;
    }

    //04 - CRIAR O CONSTRUTOR SEM ATRIBUTOS / Direito - Generate - Construtor - não selecionar atributo só o método
    public Endereco() {
    }

    //05 - CRIAR O CONSTRUTOR SEM O ATRIBUTO NÚMERO / Direito - Generate - getter and setter - selecionar todos atributos menos numero
    public Endereco(String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    //06 - CRIAR O MÉTODO PARA MOSTRAR O ENDEREÇO
    public void mostrarEndereco(){
        System.out.println("Endereço"+rua+","+cidade+","+numero+","+estado+","+cep);
    }
}

package PessoaEx;


/*
Seguem os códigos para criação da classe Pessoa e Main.
O código valida a idade para fazer a modificação.
Observar o setIdade na classe Pessoa.
 */

class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setIdade(30);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}

package Heranca;

// Classe base (superclasse)
class Animal {
    // Atributos comuns a todos os animais
    protected String nome;
    protected int idade;


    // Método para exibir informações gerais
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }


    // Método genérico de som
    public void emitirSom() {
        System.out.println("O animal está emitindo um som.");
    }
}
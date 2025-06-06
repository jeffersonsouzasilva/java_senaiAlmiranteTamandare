package AlunoEx;


/*
Segue enunciado do exercício.

Crie uma classe Aluno com os atributos nome, matricula e curso, todos privados. Implemente getters e setters para os atributos, garantindo que o nome seja preenchido e a matrícula seja um número válido.

Dica: Para verificar se a matrícula é válida, você pode utilizar uma estrutura condicional que valida se o usuário digitou apenas ‘0’ como valor desse atibuto.
 */


public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        // Exemplo de uso
        aluno.setNome("Maria");
        aluno.setMatricula("123456");
        aluno.setCurso("Direito");

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());

        // Testando validações
        aluno.setNome(""); // Deve exibir mensagem de erro
        aluno.setMatricula("0"); // Deve exibir mensagem de erro
    }
}

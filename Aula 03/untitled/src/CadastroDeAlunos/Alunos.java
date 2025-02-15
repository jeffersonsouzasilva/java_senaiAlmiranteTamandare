package CadastroDeAlunos;

public class Alunos
{
    String nome;
    int idade;
    int ra;
    String cor;
    char genero;
    String ensino;

    //MÉTODO CADASTRO
    public void cadastro()
    {
        System.out.println("O nome do Aluno é: " + nome);
        System.out.println("A idade do Aluno é: " + idade);
        System.out.println("O RA do Aluno é: " + ra);
        System.out.println("A cor do Aluno é: " + cor);
        System.out.println("O gênero do Aluno é: " + genero);
        System.out.println("O ensino do Aluno é: " + ensino);

    }
}

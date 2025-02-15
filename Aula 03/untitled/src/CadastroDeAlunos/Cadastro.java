package CadastroDeAlunos;

public class Cadastro
{
    public static void main(String[] args)
    {
        Alunos aluno1 = new Alunos();

        aluno1.nome = "Maju";
        aluno1.idade = 16;
        aluno1.ra = 1106153406;
        aluno1.cor = "branca";
        aluno1.genero = 'F';
        aluno1.ensino = "Ensino Médio";

        aluno1.cadastro();

    }

}

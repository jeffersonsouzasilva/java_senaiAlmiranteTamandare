package ApresentaçãoDeArtistas;

public class Artista
{
    String nome;
    String nacionalidade;
    String profissao;
    int idade;
    char genero;

    //MÉTODO APRESENTAR
    public void apresentar()
    {
        System.out.println("Nome do(a) ApresentaçãoDeArtistas.Artista: " + nome);
        System.out.println("Nacionalidade do(a) ApresentaçãoDeArtistas.Artista: " + nacionalidade);
        System.out.println("Profissão do(a) ApresentaçãoDeArtistas.Artista: " + profissao);
        System.out.println("Idade do(a) ApresentaçãoDeArtistas.Artista: " + idade);
        System.out.println("Gênero do ApresentaçãoDeArtistas.Artista: " + genero);

    }
}

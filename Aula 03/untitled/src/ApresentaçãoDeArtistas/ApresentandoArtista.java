package ApresentaçãoDeArtistas;

public class ApresentandoArtista
{
    public static void main(String[] args)
    {
        Artista artista1 = new Artista();

        artista1.nome = "Billie Eilish";
        artista1.nacionalidade = "Estadunidense";
        artista1.profissao = "Cantora-Compositora";
        artista1.idade = 23;
        artista1.genero = 'F';

        artista1.apresentar();

        Artista artista2 = new Artista();

        artista2.nome = "Marshall Bruce Mathers III (Eminem)";
        artista2.nacionalidade = "Estadunidense";
        artista2.profissao = "Rapper e Compositor";
        artista2.idade = 52;
        artista2.genero = 'M';

        artista2.apresentar();


    }

}

package Casa;

public class Casa
{
    public static void main(String[] args)
    {
        PlantaDaCasa casa1 = new PlantaDaCasa();
        casa1.metragem= 100;
        casa1.quantidadeQuartos = 2;
        casa1.quantidadeBanheiros = 2;
        casa1.material = "Tijolo";


        casa1.construir();



        PlantaDaCasa casa2 = new PlantaDaCasa();
        casa2.metragem = 1000;
        casa2.quantidadeQuartos = 4;
        casa2.quantidadeBanheiros = 3;
        casa2.material = "Alvenaria";

        casa2.construir();


    }

}

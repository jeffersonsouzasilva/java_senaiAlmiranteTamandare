package ConstrucaoDaCasa;

public class Casa {
    public static void main(String[] args) {
        PlantaDaCasa casa1 = new PlantaDaCasa(); //Instanciar um objeto

        casa1.areaConstruida = 100;
        casa1.quantidadeComodos = 5;
        casa1.metrosQuadrados = 250;
        casa1.cor= "Branca";
        casa1.material = "Alvenaria";

        casa1.Construir();
    }
}

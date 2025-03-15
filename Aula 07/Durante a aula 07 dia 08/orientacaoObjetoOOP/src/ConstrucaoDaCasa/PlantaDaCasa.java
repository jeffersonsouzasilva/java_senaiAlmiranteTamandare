package ConstrucaoDaCasa;

public class PlantaDaCasa {
    String material;
    int metrosQuadrados;
    int quantidadeComodos;
    String cor;
    int areaConstruida;

    public void Construir(){
        System.out.println("O material usado na sua casa é: " + material);
        System.out.println("A casa possui " + metrosQuadrados + " metros quadrados");
        System.out.println("A casa possui " + quantidadeComodos + " comôdos");
        System.out.println("A cor da casa é " + cor);
        System.out.println("A área é: " + areaConstruida);
    }
}

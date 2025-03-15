package ExMoto;

public class Moto {

    private String marca;
    private String modelo;
    private String cilindradas;

    public Moto(String marca, String modelo, String cilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindradas = cilindradas;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }



    public void mostrarMoto(){
        System.out.println("Marca da Moto: " + marca + ", " + "Modelo: " + modelo + ", " + " Cilindradas: " + cilindradas);
    }

    @Override
    public String toString(){
        return "Moto{" +
                "Marca da Moto:='" + marca + '\'' +
                ", Modelo='" + modelo + '\'' +
                ", Cilindradas='" + cilindradas + '\'' +
                '}';
    }



}

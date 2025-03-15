package AnimalsEx;

public abstract class Corpo {
    private int numeroPatas;
    private int numeroDedos;
    private int numeroCalda;
    private String corPelo;
    private String raca;

    public Corpo(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getNumeroDedos() {
        return numeroDedos;
    }

    public void setNumeroDedos(int numeroDedos) {
        this.numeroDedos = numeroDedos;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroCalda() {
        return numeroCalda;
    }

    public void setNumeroCalda(int numeroCalda) {
        this.numeroCalda = numeroCalda;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }


    public Corpo(int numeroPatas, int numeroDedos, int numeroCalda, String corPelo) {
        this.numeroPatas = numeroPatas;
        this.numeroDedos = numeroDedos;
        this.numeroCalda = numeroCalda;
        this.corPelo = corPelo;
    }


    public Corpo(){

    }

    //05 - CRIAR O CONSTRUTOR SEM O ATRIBUTO NÚMERO

    //06 - CRIAR O MÉTODO PARA MOSTRAR
    public void mostrarCopoAnimal (){
        System.out.println("Corpo: " + numeroPatas + numeroDedos + numeroCalda + corPelo + raca);
    }

}

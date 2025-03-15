package AnimalsEx;

public class Passaro extends Corpo{
    private String raca;
    private String movimento;

    @Override
    public String getRaca() {
        return raca;
    }

    @Override
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getMovimento() {
        return movimento;
    }

    public void setMovimento(String movimento) {
        this.movimento = movimento;
    }

    public Passaro(int numeroPatas, int numeroDedos, int numeroCalda, String corPelo, String raca, String movimento) {
        super(numeroPatas, numeroDedos, numeroCalda, corPelo);
        this.raca = raca;
        this.movimento = movimento;
    }

    public Passaro(String raca, String movimento) {
        this.raca = raca;
        this.movimento = movimento;
    }

    public Passaro(String raca, String raca1, String movimento) {
        super(raca);
        this.raca = raca1;
        this.movimento = movimento;
    }


}

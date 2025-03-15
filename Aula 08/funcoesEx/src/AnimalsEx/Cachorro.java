package AnimalsEx;

public class Cachorro extends Corpo{
    private String raca;
    private String movimento;

    public String getMovimento() {
        return movimento;
    }

    public void setMovimento(String movimento) {
        this.movimento = movimento;
    }

    @Override
    public String getRaca() {
        return raca;
    }

    @Override
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Cachorro(String raca, String raca1, String movimento) {
        super(raca);
        this.raca = raca1;
        this.movimento = movimento;
    }

    public Cachorro(int numeroPatas, int numeroDedos, int numeroCalda, String corPelo, String raca, String movimento) {
        super(numeroPatas, numeroDedos, numeroCalda, corPelo);
        this.raca = raca;
        this.movimento = movimento;
    }

    public Cachorro(String raca, String movimento) {
        this.raca = raca;
        this.movimento = movimento;
    }
}

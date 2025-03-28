package CarroRefatoreEx;

public class Carro {
    public String marca;          // Atributo público
    protected String modelo;      // Atributo protegido
    private double preco;         // Atributo privado agora


    // Construtor
    public Carro(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        setPreco(preco); // Usando o setter para aplicar a validação ao inicializar
    }


    // Getter para o preço
    public double getPreco() {
        return preco;
    }


    // Setter para o preço com validação
    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Erro: O preço deve ser maior que zero.");
        } else {
            this.preco = preco;
        }
    }


    // Método para exibir as informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: " + preco);
    }
}

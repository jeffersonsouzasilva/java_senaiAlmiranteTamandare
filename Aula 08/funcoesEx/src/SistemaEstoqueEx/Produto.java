package SistemaEstoqueEx;

public class Produto {
    private String nome;
    private Double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirInformacoes() {
        System.out.println(" Nome do Produto: " + getNome() + getPreco() + getQuantidade());
    }

    @Override
    public String toString() {
        return  "nome: " + nome + '\'' +
                " preco: " + preco + '\'' +
                " quantidade: " + quantidade;
    }


}
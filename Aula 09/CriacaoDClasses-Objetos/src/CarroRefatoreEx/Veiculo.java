package CarroRefatoreEx;

public class Veiculo {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 85000.00);


        // Acessando os atributos
        System.out.println("Marca: " + meuCarro.marca); // Atributo público pode ser acessado diretamente
        System.out.println("Modelo: " + meuCarro.modelo); // Atributo protegido pode ser acessado porque está no mesmo pacote


        // Acessando o preço via método público
        System.out.println("Preço: " + meuCarro.getPreco());


        System.out.println(" ");
        System.out.println(" ");


        // Exibindo informações usando o método
        meuCarro.exibirInformacoes();


        // Tentando alterar o preço para um valor inválido
        meuCarro.setPreco(-5000);
        System.out.println("Novo preço após tentativa de ajuste inválido: " + meuCarro.getPreco());


        // Alterando o preço para um valor válido
        meuCarro.setPreco(90000.00);
        System.out.println("Novo preço após ajuste válido: " + meuCarro.getPreco());
    }
}

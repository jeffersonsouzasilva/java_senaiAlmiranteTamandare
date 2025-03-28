package CarroEx;

public class Veiculo {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 85000.00);

        // Acessando os atributos
        System.out.println("Marca: " + meuCarro.marca); // Atributo público pode ser acessado diretamente
        System.out.println("Modelo: " + meuCarro.modelo); // Atributo protegido pode ser acessado porque está no mesmo pacote

        // Acessando o preço via método público
        System.out.println("Preço: " + meuCarro.getPreco());
    }
}

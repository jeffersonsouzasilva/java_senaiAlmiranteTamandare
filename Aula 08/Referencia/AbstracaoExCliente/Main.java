package AbstracaoExCliente;



/*
Criem uma classe abstrata que representa um conceito genérico (exemplo; Animal, Veículo, etc.).
Essa classe deve possuir um atributo encapsulado(privado) e um método abstrato que deverá ser implementado pelas subclasses.

Criem duas subclasses que herdem da classe abstrata e sobrescrevam o método abstrato, demonstrando polimorfismo.

Na classe principal, instanciem objetos das subclasses e utilizem os métodos implementados para demonstrar os conceitos aplicados.

Observação: Lembrem-se de que o atributo privado na classe abstrata deve ser acessado apenas por meio de métodos do tipo getters e setters. O objetivo é praticar o uso de encapsulamento e reutilização de código por meio da herança.

 */

public class Main {
    public static void main(String[] args) {
        // Criando objetos das subclasses
        Cliente cliente = new Cliente("Rua A", "Joana Silva", "00000000002");
        Funcionario funcionario = new Funcionario("Rua B", "João Silva", "00000000001", "Vendedor");

        // Usando o método mostrarDetalhes() (polimorfismo)
        cliente.mostrarDetalhes(); // Saída: Cliente: Joana Silva, Documento: 00000000002, Rua: Rua A
        funcionario.mostrarDetalhes(); // Saída: Funcionário: João Silva, Documento: 00000000001, Cargo: Vendedor, Rua: Rua B
    }
}

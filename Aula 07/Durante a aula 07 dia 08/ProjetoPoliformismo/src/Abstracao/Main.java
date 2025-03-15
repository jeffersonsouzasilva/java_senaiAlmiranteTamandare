package Abstracao;

public class Main {
    public static void main(String[] args) {
        //01 - CRIAR O OBJETO DA CLASSE FUNCIONÁRIO
        Funcionario joao = new Funcionario("Rua Um","São Paulo","1000","SP",
                "09890-000","Joao Paulo da Silva","00000000001","Vendedor");

        //02 - CRIAR O OBJETO DA CLASSE CLIENTE
        Cliente joana = new Cliente("Rua Dois","Rio de Janeiro","RJ","09890-240",
                "Joana Silva","00000000002");

        //
        System.out.println(joao);
        //joao.mostrarEndereço();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(joana);
        //joana.mostrarEndereço();
    }
}

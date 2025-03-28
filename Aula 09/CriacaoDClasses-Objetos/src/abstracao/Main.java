package abstracao;


/*
Depois de ter criado a Interface Pessoal,
  a classe abstrata Endereco, a classe Funcionario e a classe Cliente,
   é preciso criar a classe Main, dentro do package abstracao,
    ela é a responsável pela execução de todo o código.
 */

//01 - CRIAR O OBJETO DA CLASSE FUNCIONÁRIO
//02 - CRIAR O OBJETO DA CLASSE CLIENTE

//EXIBIÇÃO DOS OBJETOS CRIADOS COM A CLASSE FUNCIONARIO
//EXIBIÇÃO DO ENDEREÇO DA CLASSE FUNCIONÁRIO
//INCLUIR DUAS LINHAS EM BRANCO
//EXIBIÇÃO DOS OBJETOS CRIADOS COM A CLASSE CLIENTE
//EXIBIÇÃO DO ENDEREÇO DA CLASSE CLIENTE

public class Main {
    public static void main(String[] args) {
        //01 - CRIAR O OBJETO DA CLASSE FUNCIONÁRIO
        Funcionario joao = new Funcionario("Rua Um","São Paulo","1000","SP",
                "09890-000","Joao Paulo da Silva","00000000001","Vendedor");

        //02 - CRIAR O OBJETO DA CLASSE CLIENTE
        Cliente joana = new Cliente("Rua Dois","Rio de Janeiro","RJ","09890-240",
                "Joana Silva","00000000002");

        //EXIBIÇÃO DOS OBJETOS CRIADOS COM A CLASSE FUNCIONARIO
        System.out.println(joao);

        //EXIBIÇÃO DO ENDEREÇO DA CLASSE FUNCIONÁRIO
        joao.mostrarEndereco();

        //INCLUIR DUAS LINHAS EM BRANCO
        System.out.println(" ");
        System.out.println(" ");

        //EXIBIÇÃO DOS OBJETOS CRIADOS COM A CLASSE CLIENTE
        System.out.println(joao);

        //EXIBIÇÃO DO ENDEREÇO DA CLASSE CLIENTE
        joao.mostrarEndereco();
    }
}

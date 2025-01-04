import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World !");

        /*
        Aula 02

        Instalação de ambiente Java e IDE ( JDK e Intelij )

        Tipo de Variaveis apresentadas na aula passada :

            int valor = 1;
            boolean = true;
            double = 1.75;
            char capital = "São Paulo";
            String nome = "Caio";

        Variaveis quem vão mais usadas:
            int, bool, double e String

        Exercicios utilizandos operadores e operações
        */

        Scanner scanner = new Scanner(System.in); // Chamando objeto Scanner
        System.out.println("Digite seu nome");

        String nome = scanner.nextLine();
        System.out.println("Seu é nome: " + nome);

        System.out.println("Digite seu Salario");
        Float salario = scanner.nextFloat();

        //nesta linha criar um sout e imprimir o nome mais salario usando %d %s
        //System.out.println(" O seu salario é : R$ %s\n" ,salario); TENTATIVA SEM SUCESSO

        //


    }
}
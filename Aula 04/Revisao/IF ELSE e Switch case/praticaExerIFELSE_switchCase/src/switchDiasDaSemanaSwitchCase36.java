import java.util.Scanner;

public class switchDiasDaSemanaSwitchCase36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário a inserção de um número de 1 a 7
        System.out.print("Insira um número de 1 a 7: ");
        int dia = scanner.nextInt();

        // Utilizar a estrutura switch-case para determinar o dia da semana
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido. Insira um número de 1 a 7.");
                break;
        }

        scanner.close();
    }
}



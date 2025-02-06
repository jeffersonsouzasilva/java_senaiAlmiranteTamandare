import java.util.Scanner;

public class NumeroMenorQueDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        // Continua solicitando ao usuário para inserir um número enquanto for menor que 10
        while (numero < 10) {
            System.out.print("Insira um número: ");
            numero = scanner.nextInt();

            if (numero < 10) {
                System.out.println("Número menor que 10. Tente novamente.");
            }
        }

        System.out.println("Número inserido é 10 ou maior. Programa encerrado.");
        scanner.close();
    }
}
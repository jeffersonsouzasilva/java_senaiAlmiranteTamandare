import java.util.Scanner;

public class forContagemRegressiva04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que informe um número
        System.out.print("Informe um número para iniciar a contagem regressiva: ");
        int numero = scanner.nextInt();

        // Inicia a contagem regressiva usando um loop for
        int i;
        for ( i = numero; i >= 0; i--)
        {
            System.out.println(i);
        }

        System.out.println("Contagem regressiva concluída!");
        System.out.println();
    }
}
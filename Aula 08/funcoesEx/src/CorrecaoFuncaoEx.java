import java.util.Scanner;

public class CorrecaoFuncaoEx {
    /*
    Função para calcular Média
    crie uma função chamada CalcularMedia que receba os números como parãmetro e
      retorne a média aritmédica desses números
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menu = 1;
        while (menu == 1){
            System.out.println(" ** Bem vindo ao Calculo de Média ** ");
            System.out.println(" ");

            System.out.println("Digite a quantidade de números: ");
            int quantidade = scanner.nextInt();
            double soma = 0;

            for (int i = 1; i<= quantidade; i++){
                System.out.println("Digite o número " + i + ": ");
                double numero = scanner.nextDouble();;
                soma = numero + i;
            }

            double media = CalcularMedia(soma, quantidade);
            System.out.println("A média é " + media);

            System.out.println(" ");
            System.out.println(" ** Digite 1 para continuar e 0 para encerrar ! ** ");
            menu = scanner.nextInt();


//            do {
//                System.out.println(" ** Para continuar digite 1 e para encerrar digite 0 ! ** ");
//                menu = scanner.nextInt();
//                if (menu == 1 || menu == 0){
//                    break;
//                }
//
//            }while (menu != 1 || menu != 0);
//            break;

        }


        scanner.close();
    }

    public static double CalcularMedia(double soma, int quantidade){
        return soma / quantidade; // Calcular Média
    }
}

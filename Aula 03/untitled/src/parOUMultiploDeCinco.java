import java.util.Scanner;

public class parOUMultiploDeCinco {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite um numero:");
//        int numero = scanner.nextInt();
        int numero = 14;

        if (numero % 2 == 0 || numero % 5 == 0){
            System.out.println("O numero é par ou multiplo de 5");
        } else {
            System.out.println("O numero não é par nem multiplo de 5");
        }

    }
}

import java.util.Scanner;

public class operadorOU {
    public static void main(String[] args) {
        int numero = 120;

        if (numero < 0 || numero > 100){
            System.out.println("O número é negativo ou maior que 100");
        }else {
            System.out.println("O número está entre 0 e 100");
        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite um numero: ");
//        int numero = scanner.nextInt();
//
//        if (numero < 0 ){
//            System.out.println("O numero é negativo !");
//        } else if (numero >= 0 && numero <= 100) {
//            System.out.println("O numero é positivo entre 0 e 100 !");
//        } else {
//            System.out.println(" O numero é positivo maior que 100 !");
//        }
//
//        scanner.close();
    }
}

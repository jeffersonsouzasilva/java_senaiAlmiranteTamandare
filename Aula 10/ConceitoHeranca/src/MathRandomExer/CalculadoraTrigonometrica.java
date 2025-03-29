package MathRandomExer;
import java.util.Scanner;



public class CalculadoraTrigonometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o ângulo em graus:");
        double anguloGraus = scanner.nextDouble();


        // Converter o ângulo para radianos, já que a classe Math trabalha com radianos
        double anguloRadianos = Math.toRadians(anguloGraus);


        // Calcular seno, cosseno e tangente
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);


        // Exibir os resultados
        System.out.printf("Seno: %.4f%n", seno);
        System.out.printf("Cosseno: %.4f%n", cosseno);
        System.out.printf("Tangente: %.4f%n", tangente);


        scanner.close();
    }
}

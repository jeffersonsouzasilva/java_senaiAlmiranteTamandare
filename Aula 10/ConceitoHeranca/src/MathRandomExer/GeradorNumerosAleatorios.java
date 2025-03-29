package MathRandomExer;
import java.util.Random;


public class GeradorNumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();


        System.out.println("10 números inteiros aleatórios entre 1 e 50:");
        for (int i = 0; i < 10; i++) {
            // Gerar números aleatórios no intervalo de 1 a 50
            int numeroAleatorio = random.nextInt(50);
            System.out.println(numeroAleatorio);
        }
    }
}

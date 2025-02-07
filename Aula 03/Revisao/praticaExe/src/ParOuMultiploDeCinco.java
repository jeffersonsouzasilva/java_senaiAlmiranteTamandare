public class ParOuMultiploDeCinco {
    public static void main(String[] args) {
        int numero = 14;

        if (numero % 2 == 0 || numero % 5 == 0) {
            System.out.println("O número é par ou múltiplo de 5.");
        } else {
            System.out.println("O número não é par nem múltiplo de 5.");
        }
    }
}

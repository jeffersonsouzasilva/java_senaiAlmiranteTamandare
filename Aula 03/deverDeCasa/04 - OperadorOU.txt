public class OperadorOU {
    public static void main(String[] args) {
        int numero = 120;

        if (numero < 0 || numero > 100) {
            System.out.println("O número é negativo ou maior que 100.");
        } else {
            System.out.println("O número está entre 0 e 100.");
        }
    }
}

public class CorrecaoPrimo {
    public static boolean CorrecaoPrimo(int numero){
        if(numero <= 1) return false;

        for (int i = 2; i < numero; i++){
            if(numero % i == 0 ) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int numero = 29;
        System.out.println(numero + (CorrecaoPrimo(numero) ? " é primo. " : " não é primo"));
    }
}

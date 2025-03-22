public class CorrecaoPrimo {
    /*
    Função para verificar numero primo
    Crie uma função chamada VerificarPrimo que receba um número inteiro como parametro e
      retorne true se o número for primo e false caso contrario.
     */
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

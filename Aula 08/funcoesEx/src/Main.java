


public class Main {
    /*
    Função para calcular Média
    crie uma função chamada CalcularMedia que receba os números como parãmetro e retorne a média aritmédica desses números

    Função para verificar numero primo
    Crie uma função chamada VerificarPrimo que receba um número inteiro como parametro e retorne true se o número for primo e false caso contrario.
     */


    public static void main(String[] args) {
        // Calculo de media com a função
        float resultadoMedia = CalcularMedia(2,3,2);
        System.out.println(resultadoMedia);

        int  resultadoNumeroPrimo = VerificarPrimo(1);
        System.out.println(" O número apresentado é um numero primo ");
    }

    public static float CalcularMedia(float a, float b, int x){
        float media = (a + b)/x ;

        return media;
    }

    public static int VerificarPrimo(int a){
        int numeroPrimo = a % 2;
        if (numeroPrimo == 0 ){
            System.out.println(" OK ");
        } else {
            System.out.println("O numero não é Primo");
        }

        return numeroPrimo;
    }


}
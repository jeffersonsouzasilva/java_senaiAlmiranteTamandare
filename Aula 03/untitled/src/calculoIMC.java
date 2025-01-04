import java.util.Scanner;

public class calculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        float altura = scanner.nextFloat(); ;

        System.out.println("Digite seu peso: ");
        float peso = scanner.nextFloat();

        float imc = peso / (altura * altura);

        if (imc <= 18.5){
            System.out.println(("Abaixo do peso normal"));
        } else if (imc > 18.5 && imc <=24.9) {
            System.out.println("Peso Normal");
        } else if (imc > 24.9 && imc <= 29.9) {
            System.out.println("Excesso de peso");
        } else if (imc > 29.9 && imc <= 34.9) {
            System.out.println("Obesosidade classe 1");
        } else if (imc > 34.9 && imc <= 39.9) {
            System.out.println("Obesosidade classe 2");
        } else {
            System.out.println("Obesosidade classe 3");
        }

    }


}

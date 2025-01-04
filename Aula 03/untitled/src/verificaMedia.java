import java.util.Scanner;

public class verificaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Digite a primeira nota:");
        int n1 = scanner.nextInt();

        System.out.println("Digite a primeira nota:");
        int n2 = scanner.nextInt();

        System.out.println("Digite a primeira nota:");
        int n3 = scanner.nextInt();

        System.out.println("Digite a primeira nota:");
        int n4 = scanner.nextInt();


        int media = (n1 + n2 +n3 +n4)/4;

        if (media >= 6){
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }

        scanner.close();
    }
}

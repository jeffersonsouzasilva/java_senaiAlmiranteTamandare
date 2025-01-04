import java.util.Scanner;

public class validacao {
    public static void main(String[] args) {
        /*
        notaDisciplina1
        notaDisciplina2
        notaMinima = 70

        verdade: "O estudante passou em ambas as disciplinas"
        falso: "o estudadnte não passsou em ambas ou em uma delas"

        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        int notaDisciplina1 = scanner.nextInt();

        System.out.println(" Digite a segunda nota: ");
        int notaDisciplina2 =  scanner.nextInt();

        int notaMinima = 70;

//        if ( notaDisciplina1 && notaDisciplina2 >= notaMinima)
//        {
//            System.out.println("O estudante passou em ambas as disciplinas");
//        }
//        else
//        {
//            System.out.println("o estudadnte não passsou em ambas ou em uma delas");
//        }

        if ( notaDisciplina1 >= notaMinima && notaDisciplina2 >= notaMinima)
        {
            System.out.println("O estudante passou em ambas as disciplinas");
        }
        else
        {
            System.out.println("o estudadnte não passsou em ambas ou em uma delas");
        }

        scanner.close();
    }
}

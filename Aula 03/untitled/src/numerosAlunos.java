import java.util.Scanner;

public class numerosAlunos {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite quantos alunos: ");
        int quantidadeAlunos = scanner.nextInt();

        double somaNota = 0.0;
        //int i = 1;


        for ( int i = 1; i <= quantidadeAlunos; i++)
        {
            System.out.println("Digite a nota do aluno" + i);
            double nota = scanner.nextDouble();
            somaNota += nota;


        }
        double resultado = somaNota / quantidadeAlunos;
        System.out.println(resultado);




    }
}

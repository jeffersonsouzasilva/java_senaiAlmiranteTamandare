import java.util.Scanner;

public class forRegistroNotas07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int numeroAlunos = scanner.nextInt();

        double somaNotas = 0.0;
        double nota;

        for (int i = 1; i <= numeroAlunos; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            nota = scanner.nextDouble();
            somaNotas += nota; // Acumula a soma das notas
        }

        double media = somaNotas / numeroAlunos;
        System.out.println("A média da turma é: " + media);

        scanner.close();
    }
}

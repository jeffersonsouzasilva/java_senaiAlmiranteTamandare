import java.util.Scanner;

public class verificacaMediaFaltas {
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


        System.out.println("Informe a quantidade de faltas do aluno: ");
        int faltas = scanner.nextInt();

        System.out.println("Informe a quantidade de auals: ");
        int quantidadesAulas = scanner.nextInt();

//        int porcentualPresenca = (faltas / quantidadesAulas) * 100;
        int porcentualPresenca = ((quantidadesAulas - faltas) * 100) / quantidadesAulas;

//        if (porcentualPresenca >= 75){
//            System.out.println("Aluno reprovado por falta");
//        } else if (media >= 6){
//            System.out.println("Aluno aprovado");
//        } else {
//            System.out.println("Aluno reprovado");
//        }

//        if (porcentualPresenca <= 75 && media >= 6 ){
//            System.out.println("Aluno Aprovado");
//        } else if (porcentualPresenca > 75 && media >= 6 ) {
//            System.out.println("Reprovado por falta");
//        }else {
//            System.out.println("Aluno Reprovado");
//        }

        if (porcentualPresenca < 75) {
            System.out.println("Aluno reprovado por falta");
        } else if (media >= 6) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado por média");
        }


        scanner.close();
    }
}

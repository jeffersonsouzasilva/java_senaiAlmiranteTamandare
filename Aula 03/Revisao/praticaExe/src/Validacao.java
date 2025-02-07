public class Validacao {
    public static void main(String[] args) {
        int notaDisciplina1 = 85;
        int notaDisciplina2 = 75;
        int notaMinima = 70;

        if (notaDisciplina1 >= notaMinima && notaDisciplina2 >= notaMinima) {
            System.out.println("O estudante passou em ambas as disciplinas.");
        } else {
            System.out.println("O estudante não passou em ambas as disciplinas.");
        }
    }
}

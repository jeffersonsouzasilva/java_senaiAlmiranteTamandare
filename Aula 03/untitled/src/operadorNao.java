public class operadorNao {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite um numero:");
//        int numero = scanner.nextInt();
        int idade = 16;
        int idadeMinima = 18;

        if (!(idade >= idadeMinima)){
            System.out.println("Você não esta habilidatado a dirigir");
//            System.out.println("Você esta habilidatado a dirigir");
        } else {
            System.out.println("Você esta habilidatado a dirigir");
//            System.out.println("Você não esta habilidatado a dirigir");
        }

    }
}

public class operadorNao07 {
    public static void main(String[] args) {
        int idade = 16;
        int idadeMinima = 18;

        if (!(idade >= idadeMinima)) {
            System.out.println("Você não está habilitado para dirigir.");
        } else {
            System.out.println("Você está habilitado para dirigir.");
        }
    }
}

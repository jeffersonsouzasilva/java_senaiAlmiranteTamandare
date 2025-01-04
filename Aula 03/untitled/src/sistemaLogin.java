import java.util.Scanner;

public class sistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user ="Admin";
        String pass ="2025";

        System.out.println("Digite o usuario: ");
        String user1 = scanner.nextLine();

        System.out.println("Digite a senha: ");
        String pass1 = scanner.nextLine();

        if(pass1.equals(pass) && user.equals(user1)){
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Usuario ou senha invalida");
        }
    }
}

import java.util.Scanner;

public class SistemaDeLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário a inserção de um id e uma senha
        System.out.print("Cadastre um id: ");
        String idCadastro = scanner.nextLine();

        System.out.print("Cadastre uma senha: ");
        String senhaCadastro = scanner.nextLine();

        int tentativas = 0;
        boolean acessoPermitido = false;

        // Enquanto o acesso não for permitido e o número de tentativas for menor que 3
        while (tentativas < 3 && !acessoPermitido) {
            // Solicitar ao usuário a inserção do id e da senha para login
            System.out.print("Insira seu id: ");
            String idLogin = scanner.nextLine();

            System.out.print("Insira sua senha: ");
            String senhaLogin = scanner.nextLine();

            // Verificar se o id e a senha são corretos
            if (idLogin.equals(idCadastro) && senhaLogin.equals(senhaCadastro)) {
                System.out.println("Login realizado com sucesso.");
                acessoPermitido = true;
            } else {
                System.out.println("Login ou senha incorretos.");
                tentativas++;
            }
        }

        if (!acessoPermitido) {
            System.out.println("Acesso negado por excesso de tentativas.");
        }

        scanner.close();
    }
}

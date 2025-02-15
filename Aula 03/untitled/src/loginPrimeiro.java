import java.util.Scanner;

public class loginPrimeiro
{
    public static void main(String[] args)
    {
     Scanner scanner = new Scanner(System.in);

        System.out.println("cadastre seu login: ");
        String cadLog = scanner.nextLine();

        System.out.println("Cadastre sua senha: ");
        String cadSen = scanner.nextLine();

        int tentativas = 0;
        boolean acessoPermitido = false;

        while( tentativas <= 3 && !acessoPermitido)
        {
            System.out.println("Informe seu Login: ");
            String login =scanner.next();

            System.out.println("Informe a sua senha: ");
            String senha = scanner.next();

            if (login.equals(cadLog) && senha.equals(cadSen))
            {
                System.out.println("Acesso Permitido.");
                acessoPermitido = true;

            }
            else
            {
            System.out.println("Acesso Negado.");
            tentativas ++;
            }

        }
        if (!acessoPermitido)
        {
            System.out.println("Acesso negado por excesso de tentativas.");
        }


    }
}

public class Acesso {
    public static void main(String[] args) {
        String permissao = "Admin";
        boolean autorizacao = false;

        if (permissao.equals("Admin") || autorizacao)
        {
            System.out.println("Acesso permitido.");
        }
        else
        {
            System.out.println("Acesso negado.");
        }
    }
}

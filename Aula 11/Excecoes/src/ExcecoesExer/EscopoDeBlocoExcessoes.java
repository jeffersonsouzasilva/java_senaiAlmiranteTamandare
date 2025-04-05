package ExcecoesExer;

public class EscopoDeBlocoExcessoes {
    public static void main(String[] args) {
        try {
            int x = 10; // Variável x declarada no escopo da função main


            if (x > 5) {
                int y = 20; // Variável y declarada no escopo do bloco if
                System.out.println(x + y); // 30
            }


            // Tentando acessar y fora do escopo do bloco if
            try {
                throw new Exception("Erro: A variável 'y' não está definida fora do bloco 'if'.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


            for (int i = 0; i < 5; i++) { // Variável i declarada no escopo do loop for
                System.out.println(i);
            }


            // Tentando acessar i fora do escopo do loop for
            try {
                throw new Exception("Erro: A variável 'i' não está definida fora do loop 'for'.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

}

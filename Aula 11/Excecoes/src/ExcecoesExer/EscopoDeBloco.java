package ExcecoesExer;

public class EscopoDeBloco {
    public static void main(String[] args) {
        int x = 10; // Variável x declarada no escopo da função main


        if (x > 5) {
            int y = 20; // Variável y declarada no escopo do bloco if
            System.out.println(x + y); // 30
        }


        // System.out.println(y); // Erro: y não está definido fora do bloco if


        for (int i = 0; i < 5; i++) { // Variável i declarada no escopo do loop for
            System.out.println(i);
        }


        //System.out.println(i); // Erro: i não está definido fora do loop for
    }
}


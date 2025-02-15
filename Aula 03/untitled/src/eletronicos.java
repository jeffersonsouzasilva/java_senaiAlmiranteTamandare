import java.util.Scanner;

public class eletronicos {
    public static void main(String[] args)
    {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Digite um número de 1 a 5: ");
     int codigoProduto = scanner.nextInt();

     switch (codigoProduto)
     {
         case 1:
             System.out.println("Notebook");
             break;
         case 2:
             System.out.println("Smartphone");
             break;
         case 3:
             System.out.println("Tablet");
             break;
         case 4:
             System.out.println("Monitor");
             break;
         case 5:
             System.out.println("Impressora");
             break;
         default:
             System.out.println("Opção inválida");
             break;
     }

    }
}

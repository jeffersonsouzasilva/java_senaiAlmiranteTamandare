package NumberFormatFormatterEnumExer;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


public class ConversorNumero {
    public static void main(String[] args) {
        // String representando um número com vírgulas e pontos
        String numeroString = "1.234,56"; // Exemplo de número no formato brasileiro


        // Definir o formato do número com base na localidade (Brasil neste caso)
        NumberFormat formatoBrasileiro = NumberFormat.getInstance(new Locale("pt", "BR"));


        try {
            // Converter a string para um número
            Number numero = formatoBrasileiro.parse(numeroString);


            // Exibir o número como decimal
            System.out.println("Número convertido: " + numero.doubleValue());
        } catch (ParseException e) {
            System.out.println("Erro ao converter a string para número. Verifique o formato.");
        }
    }
}


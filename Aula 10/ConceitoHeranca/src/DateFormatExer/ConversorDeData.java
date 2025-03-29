package DateFormatExer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversorDeData {
    public static void main(String[] args) {
        // Data e hora no formato original
        String dataOriginal = "28/03/2025 16:09:00"; // Exemplo, pode ser alterado ou recebido do usuário


        // Formato original
        DateFormat formatoOriginal = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


        // Novo formato
        DateFormat novoFormato = new SimpleDateFormat("MM,d, yyyy h:mm");


        try {
            // Converter para um objeto Date
            Date data = formatoOriginal.parse(dataOriginal);


            // Formatar para o novo formato
            String dataFormatada = novoFormato.format(data);


            // Exibir a data formatada
            System.out.println("Data formatada: " + dataFormatada);
        } catch (ParseException e) {
            System.out.println("Erro ao converter a data. Verifique o formato fornecido.");
        }
    }
}


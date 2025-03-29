package DateCalenderExer;

import java.util.Date;

public class ExibirDataHora {
    public static void main(String[] args) {
        // Obter a data e hora atual
        Date dataAtual = new Date();


        // Extrair partes da data e hora diretamente
        int dia = dataAtual.getDate();
        int mes = dataAtual.getMonth() + 1; // Os meses vão de 0 a 11
        int ano = dataAtual.getYear() + 1900; // O ano começa em 1900
        int horas = dataAtual.getHours();
        int minutos = dataAtual.getMinutes();
        int segundos = dataAtual.getSeconds();


        // Montar o formato legível da data e hora
        String dataHoraFormatada = dia + " de " + mes + " de " + ano + ", " + horas + ":" + minutos + ":" + segundos;


        // Exibir o resultado
        System.out.println("Data e Hora atuais: " + dataHoraFormatada);
    }
}


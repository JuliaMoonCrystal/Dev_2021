package DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Exemplo009 {
    public static void main(String[] args) {

        Date agora = new Date();
        SimpleDateFormat formater= new SimpleDateFormat("dd/MM/yyyy");

        String dataFormatada = formater.format(agora);
        System.out.println(dataFormatada);
    }
}

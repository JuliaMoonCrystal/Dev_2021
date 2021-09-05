package DateFormat;

import java.text.DateFormat;
import java.util.Date;

public class Exemplo008 {
    public static void main(String[] args) {

        Date agora= new Date();

        String dateStr = DateFormat.getInstance().format(agora);

        System.out.println(dateStr);

        dateStr= DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);
        System.out.println(dateStr);
    }
}

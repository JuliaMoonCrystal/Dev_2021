package DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioFinal {
    public static void main(String[] args) {

        Date agora = new Date();
        SimpleDateFormat format1= new SimpleDateFormat("dd/mm/yyyy");
        SimpleDateFormat format2= new SimpleDateFormat("hh:mm:ss:mmm");

        String datafoematada= format1.format(agora);
        String horafoematada= format2.format(agora);
        System.out.println("Data : "+datafoematada+"  Hora: "+horafoematada);
    }
}

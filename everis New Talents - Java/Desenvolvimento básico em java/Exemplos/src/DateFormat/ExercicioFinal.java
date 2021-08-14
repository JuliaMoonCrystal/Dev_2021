package DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioFinal {
    public static void main(String[] args) {

        Date agora = new Date();

        //TOMAR CUIDADO PORQUE NESSE CASO LETRAS MAIUSCULAS FAZEM DIFERENÇA
        SimpleDateFormat format1= new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat format2= new SimpleDateFormat("HH:mm:ss:mmm");

        String datafoematada= format1.format(agora);
        String horafoematada= format2.format(agora);
        System.out.println("Data : "+datafoematada+"  Hora: "+horafoematada);
    }
}

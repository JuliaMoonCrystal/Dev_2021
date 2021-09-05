package LocalTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class ExercicioFinal {
    public static void main(String[] args) {

        /*
        Date data= new Date("15/05/2010 10:00:00");
        System.out.println(data);
        */
        LocalDate data= LocalDate.of(2010,05,15);
        LocalTime horas= LocalTime.of(10,00,00);
        System.out.println("Data "+ data+ " Horas "+horas);

        LocalDate datafutura= data.plusYears(6).plusMonths(6);
        LocalTime horafutura= horas.plusHours(13);
        System.out.println("Data Futura "+datafutura+" Horas Futuras "+horafutura);



    }
}

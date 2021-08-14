package Calendar;

import java.util.Calendar;

public class ExercicioFinal {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();
        System.out.println("Data : ");
        System.out.printf("%tD\n",agora);

        agora.add(Calendar.DATE, 10);
        System.out.println("\nVocê tem até:");
        System.out.printf("%tD\n",agora);
    }
}

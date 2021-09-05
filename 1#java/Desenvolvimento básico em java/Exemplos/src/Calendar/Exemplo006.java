package Calendar;

import java.util.Calendar;

public class Exemplo006 {
    public static void main(String[] args) {

        Calendar agora =Calendar.getInstance();
        System.out.println("Data corrente "+agora.getTime());

        agora.add(Calendar.DATE,  -15);
        System.out.println("Data de 15 dias atrás :"+agora.getTime());

        agora.add(Calendar.MONTH,8);
        System.out.println("8 Messes depois: "+agora.getTime());

        agora.add(Calendar.YEAR,4);
        System.out.println("4 anos depois: "+agora.getTime());
    }
}

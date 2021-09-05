package LocalTime;

import java.time.LocalTime;

public class Exemplo013 {
    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        LocalTime maisUmahora= agora.plusHours(1);
        System.out.println(" +1 Hora : "+maisUmahora);
    }
}

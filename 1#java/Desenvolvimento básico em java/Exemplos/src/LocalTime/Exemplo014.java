package LocalTime;

import java.time.LocalDateTime;

public class Exemplo014 {
    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        LocalDateTime futuro =agora.plusHours(1).plusDays(2).plusSeconds(12);
        System.out.println("Futuro : "+futuro);
    }
}

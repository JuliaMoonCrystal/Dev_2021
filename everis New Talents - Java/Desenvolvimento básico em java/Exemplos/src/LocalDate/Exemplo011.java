package LocalDate;

import java.time.LocalDate;

public class Exemplo011 {
    public static void main(String[] args) {

        LocalDate hoje= LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);

        System.out.println("Hoje "+hoje);
        System.out.println("Ontem "+ontem);
    }
}

package Date;

import java.util.Date;

public class Exemplo002 {
    public static void main(String[] args) {

        Long currentTimeMillis= System.currentTimeMillis();
        System.out.println(currentTimeMillis);



        Date data = new Date(currentTimeMillis);
        System.out.println(data);
    }
}

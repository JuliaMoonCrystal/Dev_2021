package Calendar;

import java.util.Calendar;

public class Exemplo007 {
    public static void main(String[] args) {

        //Imprimindo datas e horas
        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n",agora);

        //Data
        System.out.printf("%tF\n",agora);

        
        System.out.printf("%tD\n",agora);

        //horas(EUA)
        System.out.printf("%tr\n",agora);

        //horas
        System.out.printf("%tT\n",agora);



    }
}

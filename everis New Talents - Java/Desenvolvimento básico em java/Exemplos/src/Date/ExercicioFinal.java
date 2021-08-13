package Date;

import java.util.Date;

public class ExercicioFinal {

    public static void main(String[] args) {

        Date dataNascimento= new Date(949951404000L);
        Date dataCompara = new Date(1276570800000L);

        if(dataNascimento.before(dataCompara)){
            System.out.println("True");
        }
        if(dataNascimento.after(dataCompara)){
            System.out.println("False");
        }
    }
}

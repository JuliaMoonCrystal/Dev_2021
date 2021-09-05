package ExemplosPOO;

public class Exemplo001 {
    public static void main(String[] args) {


        String CPF="12345678";
       boolean validador= isCpf(CPF);
        System.out.println(validador);
    }

    /*Considera erro se cpf for igual*/
    private static boolean isCpf(String CPF) {
      boolean validador =true;

        if(CPF.equals("00000000")
             || CPF.equals("11111111")
             || CPF.equals("22222222")
             || CPF.equals("33333333")
             || CPF.equals("44444444")
             || CPF.equals("55555555")
             || CPF.equals("66666666")){

            validador=false;
      }
        return validador;
    }
}

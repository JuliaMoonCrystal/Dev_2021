package POO;

import ExemplosPOO.Cliente;
import ExemplosPOO.Endereco;

import java.util.ArrayList;

public class EntregaCartão {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        //dados


        Cliente cliente = new Cliente();
        //dados cliente
        if(cliente.endereco == null){
            cliente.endereco = new ArrayList<Endereco>();
        }
        cliente.endereco.add(endereco);

    }
}

package POO;

import ExemplosPOO.Cliente;
import ExemplosPOO.Endereco;

import java.util.ArrayList;

public class EntregaCartão {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        //dados
         endereco.cep="000000000";
         endereco.bairro ="Bairro fantasioso";


        Cliente cliente = new Cliente();
        //dados cliente
        if(cliente.endereco == null){
            cliente.endereco = new ArrayList<Endereco>();
        }
        cliente.adicionarEndereco(endereco);
        System.out.println("Dados adicionados com sucesso");

    }
}

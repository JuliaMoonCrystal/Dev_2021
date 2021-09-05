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

        try {
            cliente.adicionarEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso");
        }catch (Exception e){
            System.out.println("Houve erro ao adicionar "+ e.getMessage());
        }
    }
}

package ExemplosPOO;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
     public Integer codigo;
     public String nome;
     public String cpf;

     public List<Endereco> endereco;

     public void adicionarEndereco(Endereco endereco){
          if(endereco == null){
               throw new NullPointerException("Esse cliente não tem endereço");
          }
          if (endereco.cep ==null
                  || endereco.bairro ==null){
          throw  new NullPointerException("Não pode ser Null");
          }
          getEndereco().add(endereco);
     }

     private List<Endereco> getEndereco(){
          if (endereco ==null){
               endereco= new ArrayList<Endereco>();
          }
          return  endereco;
     }
}

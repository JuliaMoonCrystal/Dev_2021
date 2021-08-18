package ExemplosPOO;
/*Toda a classe extends Object*/
public class Pessoa {

    private  static  final int Tamanho_cpf=11;
    private  static  final int Tamanho_cnpj=12;

    public enum TipoPessoa{FISICA, JURIDICA};
    public Integer codigo;
    public String nome;
    public String documento;
    public TipoPessoa tipo;

    public  String getDocumento(){
        return documento;
    }

    public void setDocumento(String documento) {
        if(documento == null || documento.isEmpty()){
             throw new RuntimeException("Documento não pode ser vazio ou nulo");
        }
        if(documento.length() == Tamanho_cpf){
            tipo=TipoPessoa.FISICA;
        } else if (documento.length() == Tamanho_cnpj){
            tipo= TipoPessoa.JURIDICA;
        }else {
            throw  new RuntimeException("Tamanho do CPF ou Cnpj inválidos");
        }
        this.documento = documento;
    }

    private void setDocumento(String documento, TipoPessoa tipo) {

    }
}

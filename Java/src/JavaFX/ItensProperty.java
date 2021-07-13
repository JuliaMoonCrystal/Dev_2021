package JavaFX;



public class ItensProperty {
   private String produto;
   private double preco;
   private int quantidade;
   
   public ItensProperty(String produto, double preco,int quantidade) {
	   this.produto=produto;
	   this.preco=preco;
	   this.quantidade=quantidade;
   }

public String getProduto() {
	return produto;
}

public void setProduto(String produto) {
	this.produto = produto;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public int getQuantidade() {
	return quantidade;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}
}

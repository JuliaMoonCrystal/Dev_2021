package JavaFX;

public class Produto {
   private String produto;
   private double preco;
   
   public Produto(String produto,double preco) {
	   this.setProduto(produto);
	   this.setPreco(preco);
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
   
   
}

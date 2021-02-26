package JavaFX;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class ItensProperty {
   private String produto;
   private double preco;
   
   public ItensProperty(String produto, double preco) {
	   this.produto=produto;
	   this.preco=preco;
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

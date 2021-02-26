package JavaFX;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class ItensProperty {
   private String produto;
   private SimpleDoubleProperty preco;
   
   public ItensProperty(String produto, double preco) {
	   this.produto=produto;
	   this.setPreco(new SimpleDoubleProperty(preco));
   }

public String getProduto() {
	return produto;
}

public void setProduto(String produto) {
	this.produto = produto;
}

public SimpleDoubleProperty getPreco() {
	return preco;
}

public void setPreco(SimpleDoubleProperty preco) {
	this.preco = preco;
}
}

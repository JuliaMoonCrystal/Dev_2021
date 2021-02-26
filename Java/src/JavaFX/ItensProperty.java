package JavaFX;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class ItensProperty {
   private SimpleStringProperty produto;
   private SimpleDoubleProperty preco;
   
   public ItensProperty(String produto, double preco) {
	   this.setProduto(new SimpleStringProperty(produto));
	   this.setPreco(new SimpleDoubleProperty(preco));
   }

public SimpleStringProperty getProduto() {
	return produto;
}

public void setProduto(SimpleStringProperty produto) {
	this.produto = produto;
}

public SimpleDoubleProperty getPreco() {
	return preco;
}

public void setPreco(SimpleDoubleProperty preco) {
	this.preco = preco;
}
}

package Telas;

import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CarrinhoApp extends Application {

	private AnchorPane painelCarrinho;
	private TableView<ItensProperty> tbCarrinho;
	private TableColumn<ItensProperty,String> collumProduto;
	private TableColumn<ItensProperty,Double> collumPreco;
	private Button btExcluir,btAdicionar;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
	}
	
	public class ItensProperty{
		private SimpleStringProperty produto;
		private SimpleDoubleProperty preco;
		
		public ItensProperty(String produto, double preco) {
			super();
			this.produto = new SimpleStringProperty(produto);
			this.preco = new SimpleDoubleProperty(preco);
		}

		public String getProduto() {
			return produto.get();
		}

		public void setProduto(String produto) {
			this.produto.set(produto);;
		}

		public double getPreco() {
			return preco.get();
		}

		public void setPreco(double preco) {
			this.preco.set(preco);;
		}
		
		
	}

}

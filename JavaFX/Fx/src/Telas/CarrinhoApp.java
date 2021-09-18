package Telas;

import Controller.Carrinho;
import Telas.VitrineApp.ItensProperty;
import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CarrinhoApp extends Application {

	private AnchorPane painelCarrinho;
	private TableView<ItensProperty> tbCarrinho;
	private TableColumn<ItensProperty,String> collumProduto;
	private TableColumn<ItensProperty,Double> collumPreco;
	private Button btExcluir,btConfirmar,btVoltar;
	private Scene cena;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		initComponents();
		
		primaryStage.setTitle("Carrinho de compras");
		primaryStage.setResizable(false);
		primaryStage.setScene(cena);
		primaryStage.show();
		
	}
	
	private void initComponents(){
		painelCarrinho = new AnchorPane();
		painelCarrinho.setPrefSize(800, 600);
		painelCarrinho.setStyle("-fx-background: lightblue;");
		
		tbCarrinho = new TableView<ItensProperty>();
		tbCarrinho.setPrefSize(780, 550);
		
		collumProduto = new TableColumn<ItensProperty,String>("Produto");
		collumPreco = new TableColumn<ItensProperty,Double>("Preco");
		
		collumProduto.setPrefWidth(500);
		collumPreco.setPrefWidth(278);
		
		btConfirmar = new Button("Confirmar");
		btExcluir = new Button("Excluir");
		btVoltar = new Button("Voltar");
		
		btConfirmar.setLayoutX(800);
		btConfirmar.setLayoutY(0);
		
		btExcluir.setLayoutX(800);
		btExcluir.setLayoutY(150);
		
		btVoltar.setLayoutX(800);
		btVoltar.setLayoutY(300);
		
		tbCarrinho.getColumns().addAll(collumProduto,collumPreco);
		painelCarrinho.getChildren().addAll(tbCarrinho,btConfirmar,btExcluir,btVoltar);
		cena=new Scene(painelCarrinho);
		
		
		collumProduto.setCellValueFactory( new PropertyValueFactory<ItensProperty ,String>("Produto"));
		collumPreco.setCellValueFactory( new PropertyValueFactory<ItensProperty ,Double>("Preco"));
		
		//tbCarrinho.setItems();
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

package Telas;

import Controller.Carrinho;
import Controller.Vitrine;
import Model.Produto;
import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class VitrineApp extends Application {
      private AnchorPane painelPrin = new AnchorPane();
      private TextField txtPesquisa = new TextField();
      private TableView<ItensProperty> tbVitrine;
      private TableColumn<ItensProperty, String> tbColumnProduto;
      private TableColumn<ItensProperty, Double> tbColumnPreco;
      private static ObservableList<ItensProperty> listaItens = FXCollections.observableArrayList();
      private static Carrinho carrinho;
      

	public static void main(String[] args) {
		

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
	}
	
	private void initComponents(){
		painelPrin.setPrefSize(800, 600);
		
		txtPesquisa.setPromptText("Digite o item para pesquisa");
		
		tbVitrine = new TableView<ItensProperty>();
		tbVitrine.setPrefSize(780, 550);
		
		tbColumnProduto = new TableColumn<ItensProperty,String>();
		tbColumnPreco = new TableColumn<ItensProperty,Double>();
		tbVitrine.getColumns().addAll(tbColumnProduto,tbColumnPreco);
		painelPrin.getChildren().addAll(txtPesquisa,tbVitrine);
		carrinho = new Carrinho();
		
		tbColumnProduto.setCellValueFactory( new PropertyValueFactory<ItensProperty ,String>("Produto"));
		tbColumnPreco.setCellValueFactory( new PropertyValueFactory<ItensProperty ,Double>("Preço"));
		
		tbVitrine.setItems(listaItens);
	}
	
	private void initItems(){
		Vitrine vitrine = new Vitrine();
		vitrine.addProduto(new Produto("Caixa de lápis", 20.00),new Produto("Bola de Vólei", 40.00),
				new Produto("Notebook", 1200.00),new Produto("Pen-Drive", 50.00));
		
		for (Produto p: vitrine.getProdutos()) {
			listaItens.add(new ItensProperty(p.getProduto(), p.getPreco()));
		}
	}
	
	private ObservableList<ItensProperty> findItems(){
		ObservableList<ItensProperty> itensEcontrados = FXCollections.observableArrayList();
		
		for (ItensProperty itens : itensEcontrados) {
			if(itens.getProduto().contains(txtPesquisa.getText())){
				itensEcontrados.add(itens);
			}
		}
		return itensEcontrados;
		
	}
	
	
	/*Classe interna da Vitrine*/
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

    
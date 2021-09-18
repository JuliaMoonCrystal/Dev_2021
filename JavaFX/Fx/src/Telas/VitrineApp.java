package Telas;

import javax.swing.JOptionPane;

import Controller.Carrinho;
import Controller.Vitrine;
import Model.Produto;
import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class VitrineApp extends Application {
      private AnchorPane painelPrin = new AnchorPane();
      private TextField txtPesquisa = new TextField();
      private TableView<ItensProperty> tbVitrine;
      private TableColumn<ItensProperty, String> tbColumnProduto;
      private TableColumn<ItensProperty, Double> tbColumnPreco;
      private static ObservableList<ItensProperty> listaItens = FXCollections.observableArrayList();
      private static Carrinho carrinho;
      private Scene cena;

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		initComponents();
		initItems();
		initListeners();
	
		
		primaryStage.setTitle("VITRINE");
		primaryStage.setResizable(false);
		primaryStage.setScene(cena);
		primaryStage.show();
	}
	
	private void initComponents(){
		painelPrin.setPrefSize(800, 600);
		painelPrin.setStyle("-fx-background: lightblue;");
		
		txtPesquisa.setPromptText("Digite o item para pesquisa");
		txtPesquisa.setLayoutX(800);
		txtPesquisa.setLayoutY(0);
		
		
		tbVitrine = new TableView<ItensProperty>();
		tbVitrine.setPrefSize(780, 550);
		
		tbColumnProduto = new TableColumn<ItensProperty,String>("Produto");
		tbColumnPreco = new TableColumn<ItensProperty,Double>("Preco");
		
		tbColumnProduto.setPrefWidth(500);
		tbColumnPreco.setPrefWidth(278);
		
		tbVitrine.getColumns().addAll(tbColumnProduto,tbColumnPreco);
		painelPrin.getChildren().addAll(txtPesquisa,tbVitrine);
		cena=new Scene(painelPrin);
		carrinho = new Carrinho();
		
		tbColumnProduto.setCellValueFactory( new PropertyValueFactory<ItensProperty ,String>("Produto"));
		tbColumnPreco.setCellValueFactory( new PropertyValueFactory<ItensProperty ,Double>("Preco"));
		
		tbVitrine.setItems(listaItens);
		
	}
	
	private void initItems(){
		Vitrine vitrine = new Vitrine();
		vitrine.addProduto(new Produto("Caixa de lápis", 20.00),new Produto("Bola de Vólei", 40.00),
				new Produto("Notebook", 1200.00),new Produto("Pen-Drive", 50.00));
		
		  String novoProduto;
		  double novoPreco;
		  
//		  int aux=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantos Produtos você quer adicionar:"));
//		  for(int x=0; x< aux;x++){
//			  novoProduto=JOptionPane.showInputDialog(null,"Digite o nome do produto");
//			  novoPreco=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o nome do produto"));
//			  
//			  vitrine.addProduto(new Produto(novoProduto,novoPreco));
//		  }
		for (Produto p: vitrine.getProdutos()) {
			listaItens.add(new ItensProperty(p.getProduto(), p.getPreco()));
		}
	}
	
	private ObservableList<ItensProperty> findItems(){
		ObservableList<ItensProperty> itensEcontrados = FXCollections.observableArrayList();
		
		for (ItensProperty itens : listaItens) {
			if(itens.getProduto().contains(txtPesquisa.getText())){
				itensEcontrados.add(itens);
			}
		}
		return itensEcontrados;
	}
	
	public void initListeners(){
		txtPesquisa.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(!txtPesquisa.getText().equals("")){
					tbVitrine.setItems(findItems());
				}
				else{
					tbVitrine.setItems(listaItens);
				}
				
			}
		});
		
		tbVitrine.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ItensProperty>() {

			@Override
			public void changed(ObservableValue<? extends ItensProperty> value, ItensProperty oldItem,
					ItensProperty newItem) {
				ItemApp.setProduto(new Produto(newItem.getProduto(),newItem.getPreco()));//arrumar valores não aparecendo na tela
				ItemApp.setIndex(tbVitrine.getSelectionModel().getSelectedIndex());
				
				
				try{
					new ItemApp().start(new Stage());
				}catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
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

    
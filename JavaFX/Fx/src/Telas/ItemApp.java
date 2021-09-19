package Telas;

import Model.Produto;
import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ItemApp extends Application {
     private AnchorPane painelItem;
     private Scene cena;
     private ImageView img;
     private Label lbPreco,lbDescricao;
     private Button btnAddCarrinho;
     private static Stage stage;
     private static Produto produto;
     private static int index;
     private static String [] imagens ={"https://i.dell.com/is/image/DellContent//content/dam/global-site-design/product_images/"
     		+ "dell_client_products/notebooks/"
     		+ "latitude_notebooks/14_3420/media_gallery/peripherals_"
     		+ "laptop_latitude_3420nt_gallery_1.psd?fmt=pjpg&pscan=auto&scl=1&wid=300&hei=200&qlt=85,0&resMode=sharp2&op_"
     		+ "usm=1.75,0.3,2,0&size=3319,2405","https://a-static.mlcdn.com.br/300x200/caixa-lapis-cor-sextavado-72-cores"
     		+ "-ecolapis-original-faber-castell/globalrevendas/10106285737/c0eb6446d7a1971f63e8841d09c036ed.jpg",
             "https://m.media-amazon.com/images/I/61Ri7L26AQL._AC_SX300_.jpg"};
     
     public static void main(String[] args) {
		launch(args);
	}
     
	@Override
	public void start(Stage primaryStage) throws Exception {
		initComponents();
		
		primaryStage.setTitle("Itens");
		primaryStage.setResizable(false);
		primaryStage.setScene(cena);
		primaryStage.show();
		
	}
	
	private void initComponents(){
		painelItem = new AnchorPane();
		painelItem.setPrefSize(600, 400);
		painelItem.setStyle("-fx-background: lightblue;");
		
		cena= new Scene(painelItem);
		
		btnAddCarrinho= new Button("Adicionar ao carrinho");
		btnAddCarrinho.setLayoutX(350);
		btnAddCarrinho.setLayoutY(200);
		btnAddCarrinho.setStyle("-fx-text-fill: green; -fx-font-size: 16px;");
		
		lbPreco = new Label("Preço :");
		lbDescricao = new Label("Descriçao :");
		
		lbPreco.setLayoutX(350);
	    lbPreco.setLayoutY(100);
	    lbPreco.setStyle("-fx-font-size: 16px;");
	    
		lbDescricao.setLayoutX(350);
		lbDescricao.setLayoutY(150);
		lbDescricao.setStyle("-fx-font-size: 16px;");
		
		
		img= new ImageView( new Image(imagens[index]));
		
		img.setLayoutX(20);
		img.setLayoutY(20);
		
		painelItem.getChildren().addAll(lbPreco,lbDescricao,btnAddCarrinho,img);
		
	}
	
	public void initListenes(){
		btnAddCarrinho.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				VitrineApp.getCarrinho().addProduto(produto);
				try{
					new CarrinhoApp().start(new Stage());
				}catch(Exception e){
					e.printStackTrace();
				}
				
			}
		});
	}

	public static Stage getStage() {
		return gettage();
	}

	public void setStage(Stage stage) {
		this.settage(stage);
	}

	public static Produto getProduto() {
		return produto;
	}

	public static void setProduto(Produto produto) {
		ItemApp.produto = produto;
	}

	public static int getIndex() {
		return index;
	}

	public static void setIndex(int index) {
		ItemApp.index = index;
	}
	
	public static Stage gettage() {
		return stage;
	}

	public static void settage(Stage stage) {
		ItemApp.stage = stage;
	}

	/*Classe interna da Item*/
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

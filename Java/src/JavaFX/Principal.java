package JavaFX;

import java.util.Observable;

import javax.swing.text.TabableView;

import com.sun.corba.se.impl.encoding.CodeSetConversion.BTCConverter;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Principal extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		//elementos
        AnchorPane pane;
        TextField txtPesquisa;
        Button btnPesquisar;
        TableView <ItensProperty> tbVitrine;
        TableColumn<ItensProperty, String> columnProduto;
        TableColumn<ItensProperty, Double> columnPreco;
		ObservableList<ItensProperty> listItens=FXCollections.observableArrayList();
		Carrinho carrinho;
		
		//definindo os elementos
		pane= new AnchorPane();
		pane.setPrefSize(880, 600);
		
		txtPesquisa=new TextField();
		txtPesquisa.setPromptText("Digite o item para pesquisa");
		
		txtPesquisa.setLayoutX(690);
		txtPesquisa.setLayoutY(10);
		
		btnPesquisar= new Button("Pesquisar");
		btnPesquisar.setLayoutX(690);
		btnPesquisar.setLayoutY(50);
		
		tbVitrine= new TableView<ItensProperty>();
		tbVitrine.setPrefSize(600, 500);
		
		columnProduto = new TableColumn<ItensProperty, String>("Produto");
		columnPreco = new TableColumn<ItensProperty, Double>("Pre�o");
		
		tbVitrine.getColumns().addAll(columnProduto,columnPreco);
		pane.getChildren().addAll(txtPesquisa,btnPesquisar, tbVitrine);
		
		carrinho= new Carrinho();
		
		columnProduto.setCellValueFactory(new PropertyValueFactory<ItensProperty, String>("produto"));
		columnPreco.setCellValueFactory(new PropertyValueFactory<ItensProperty, Double>("preco"));
		
		Vitrine v= new Vitrine();
		v.addProdutos(new Produto("Camiseta Geek",35.00), new Produto("Regata Star Wars",29.90),new Produto("Caneca GOT",40.00)
		,new Produto("Action Figure Mother of Dragons",100.90), new Produto("Drogon",80.00));
		
		for(Produto p:v.getProdutos())  
			listItens.add(new ItensProperty(p.getProduto(),p.getPreco()));
		
		tbVitrine.setItems(listItens);
		
		
		Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Vitrine-ADM");
        stage.show();
        
      
	}


}

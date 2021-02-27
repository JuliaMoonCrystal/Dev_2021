package JavaFX;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CarrinhoApp extends Application{

	private AnchorPane pane;
	private TableView<ItensProperty> tbcarrinho;
	private TableColumn<ItensProperty, String> collumProduto;
	private TableColumn<ItensProperty, Double> collumPreco;
	private TableColumn<ItensProperty, Integer> collumQuantidade;
	private Button btAdicionar,btRemover,btVoltar,btConfirmar;
	private static ObservableList<ItensProperty> listItens;
	
	@Override
	public void start(Stage Stage) throws Exception {

		pane= new AnchorPane();
		pane.setPrefSize(880, 600);
		
		tbcarrinho=new TableView<ItensProperty>();
		tbcarrinho.setPrefSize(600, 500);
		
		collumProduto = new TableColumn<ItensProperty, String>("Produto");
		collumPreco = new TableColumn<ItensProperty, Double>("Preço");
		collumQuantidade= new TableColumn<ItensProperty, Integer>("Quantidade");
		
		tbcarrinho.getColumns().addAll(collumProduto,collumPreco,collumQuantidade);
		
	}

}

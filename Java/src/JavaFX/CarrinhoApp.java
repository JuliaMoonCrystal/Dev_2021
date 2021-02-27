package JavaFX;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
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
		
		btAdicionar= new Button("Adicionar");
		btAdicionar.setLayoutX(690);
		btAdicionar.setLayoutY(50);
		
		btRemover= new Button("Remover");
		btRemover.setLayoutX(710);
		btRemover.setLayoutY(50);
		
		btConfirmar= new Button("Confirmar compra");
		btConfirmar.setLayoutX(690);
		btConfirmar.setLayoutY(80);
		
		btVoltar= new Button("Voltar");
		btVoltar.setLayoutX(710);
		btVoltar.setLayoutY(80);
		
		collumProduto = new TableColumn<ItensProperty, String>("Produto");
		collumPreco = new TableColumn<ItensProperty, Double>("Preço");
		collumQuantidade= new TableColumn<ItensProperty, Integer>("Quantidade");
		
		tbcarrinho.getColumns().addAll(collumProduto,collumPreco,collumQuantidade);
		pane.getChildren().addAll(tbcarrinho,btAdicionar,btConfirmar,btRemover,btVoltar);
		
		btAdicionar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
                // Vitrine.getCarrinho().addProdutos(produto);
				try {
					new CarrinhoApp().start(new Stage());
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Scene scene = new Scene(pane);
        Stage.setScene(scene);
        Stage.setResizable(false);
        Stage.setTitle("CARRINHO");
        Stage.show();
		
	}
	
	private void initItens() {
		for(Produto p : ((Vitrine) Vitrine.getCarrinho()).getProdutos()) listItens.add(new ItensProperty(p.getProduto(),p.getPreco(),p.getQuantidade()));
	}

}

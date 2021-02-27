package JavaFX;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sun.launcher.resources.launcher;

public class ItensApp extends Application {

	private static   Produto produto;
	private int index;
	
	public void start(Stage Stage) throws Exception {
       
		// elementos
	   AnchorPane pane;
       ImageView imgitem;
       Label lbPreco,lbDescricao;
       Stage stage;
       
       pane= new AnchorPane();
       pane.setPrefSize(600, 400);
	
       lbPreco=new Label();
       lbDescricao= new Label();
       
       imgitem= new ImageView(new Image("Captura de Tela(333).png"));
       imgitem.setLayoutX(10);
       imgitem.setLayoutY(0);
      
       
       
	}

	public static void setProduto(Produto produto) {
		ItensApp.produto=produto;
		
	}

	

}

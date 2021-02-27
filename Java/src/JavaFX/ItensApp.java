package JavaFX;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sun.launcher.resources.launcher;

public class ItensApp extends Application {

	private static   Produto produto;
	private static int index;
	
	public void start(Stage Stage) throws Exception {
       
		// elementos
	   AnchorPane pane;
       ImageView imgitem;
       Label lbPreco,lbDescricao;
     
       
       pane= new AnchorPane();
       pane.setPrefSize(600, 400);
	
       lbPreco=new Label();
       lbDescricao= new Label();
       
       
     //  imgitem= new ImageView(new Image("\\Users\\Julia\\Documents\\Dev_2021\\Java\\src\\JavaFX"));
     //  imgitem.setLayoutX(10);
      // imgitem.setLayoutY(0);
       
       //Vai abrir a tela com a descrição dos produtos, mas por enquanto vou deixar vazio
      // pane.getChildren().addAll(lbDescricao,lbPreco);
      
       Scene scene = new Scene(pane);
       Stage.setScene(scene);
       Stage.setResizable(false);
       Stage.setTitle("Produto");
       Stage.show();
       
	}

	public static void setProduto(Produto produto) {
		ItensApp.produto=produto;
		
	}
	public static int getindex() {
		return index;
	}

	public static void setIndex(int selectedIndex) {
        ItensApp.index=index;
		
	}

	

}

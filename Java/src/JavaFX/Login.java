package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Login extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		AnchorPane pane= new AnchorPane();
		pane.setPrefSize(500,500);
		
		
		TextField txtLogin= new TextField();
		txtLogin.setPromptText("Digite a sua senha");
		
		PasswordField txtSenha= new PasswordField();
		txtSenha.setPromptText("Digite a sua senha");
		
		Scene cena= new Scene(pane);
	
		stage.setScene(cena);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}

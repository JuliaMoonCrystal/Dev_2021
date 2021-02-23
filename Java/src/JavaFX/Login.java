package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		AnchorPane pane= new AnchorPane();
		pane.setPrefSize(500,500);
		pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100% blue 0%, silver 100%);");
		
		Text login=new Text("LOGIN : ");
		Text senha= new Text("SENHA : ");
		
		
		TextField txtLogin= new TextField();
		txtLogin.setPromptText("Digite o seu email");
		
		PasswordField txtSenha= new PasswordField();
		txtSenha.setPromptText("Digite a sua senha");
		
		Button btnEntrar= new Button("Entrar");
		Button btnSair=new Button("Sair");
		
		pane.getChildren().addAll(txtLogin,login,senha,txtSenha,btnEntrar,btnSair);
		
		txtLogin.setLayoutX(50);
		txtLogin.setLayoutY(50);
		
		login.setLayoutX(5);
		login.setLayoutY(65);
		
		senha.setLayoutX(5);
		senha.setLayoutY(115);
		
		txtSenha.setLayoutX(50);
		txtSenha.setLayoutY(100);
		
		btnEntrar.setLayoutX(pane.getWidth()-txtLogin.getWidth()/2);
		btnEntrar.setLayoutY(150);
		
		btnSair.setLayoutX(pane.getWidth()-txtLogin.getWidth()/2);
		btnSair.setLayoutY(200);
		
		Scene cena= new Scene(pane);
	
		stage.setScene(cena);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}

package JavaFX;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application{

	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage Stage) throws Exception {
      
		AnchorPane pane= new AnchorPane();
		pane.setPrefSize(400, 300);
		pane.setStyle("-fx--background-color: linear-gradient(from 0% 0% to 100% 100% blue 0%, silver 100%);");
		
		//definição dos campos
	    TextField	txtLogin= new TextField("Digite o seu Login");
		txtLogin.setPromptText("Digite a sua senha");
		
		PasswordField txtSenha= new PasswordField();
		txtLogin.setPromptText("Digite a sua senha");
		
		Button btnLogin= new Button("Logar");
		Button btnSair= new Button("Sair");
		
		txtLogin.setLayoutX(50);
		txtLogin.setLayoutY(50);
		
		
		
		txtSenha.setLayoutX(50);
		txtSenha.setLayoutY(100);
		
		btnLogin.setLayoutX(50);
		btnLogin.setLayoutY(150);
		
		pane.getChildren().addAll(txtLogin,txtSenha,btnLogin,btnSair);
		
		 Scene scene = new Scene(pane);
	        Stage.setScene(scene);
	        Stage.setResizable(false);
	        Stage.setTitle("Login");
	        Stage.show();
	}
	
}

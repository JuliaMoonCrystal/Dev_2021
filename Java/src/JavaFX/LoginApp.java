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
		
		// definição do Layout dos campos e posições
		txtLogin.setLayoutX(50);
		txtLogin.setLayoutY(50);
		
		txtSenha.setLayoutX(50);
		txtSenha.setLayoutY(100);
		
		btnLogin.setLayoutX(50);
		btnLogin.setLayoutY(150);
		
		btnSair.setLayoutX(100);
		btnSair.setLayoutY(150);
		
		//add na tela
		pane.getChildren().addAll(txtLogin,txtSenha,btnLogin,btnSair);
		
		Scene scene = new Scene(pane);
        Stage.setScene(scene);
        Stage.setResizable(false);
        Stage.setTitle("Login");
        Stage.show();
        
        //ações dos botões
		btnLogin.setOnAction(new EventHandler<ActionEvent>() {
        
			public void handle(ActionEvent event) {
               logar();
				
			}

			private void logar() {
                if(txtLogin.getText().equals("admin") && txtSenha.getText().equals("123456")) {
                	JOptionPane.showMessageDialog(null, "Login efetuado com sucesso");
                	//Vai abrir outra tela
                }
                else {
                	JOptionPane.showMessageDialog(null, "Login ou senha incorretos","ERRO", JOptionPane.ERROR_MESSAGE);
                }
				
			}
		});
		
		btnSair.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
               fecharApp();				
			}
		});
	
	
	}
	
		
	protected void fecharApp() {
      System.exit(0);	
	}

}

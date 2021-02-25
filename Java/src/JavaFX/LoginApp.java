package JavaFX;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application{

	private AnchorPane pane;
	private TextField txtLogin;
	private PasswordField txtSenha;
	private Button btnLogin,btnSair;
	private static Stage stage;
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		
		LoginApp.stage=stage;
	}
	
	public static Stage getStage() {
		return stage;
	}
	
	private void initComponent() {
		pane= new AnchorPane();
		pane.setPrefSize(400, 300);
		pane.setStyle("-fx--background-color: linear-gradient(from 0% 0% to 100% 100% blue 0%, silver 100%);");
		
		txtLogin= new TextField();
		txtLogin.setPromptText("Digite a sua senha");
	}
	
	private void initLayout(){
		txtLogin.setLayoutX((pane.getWidth()-txtLogin.getHeight())/2);
		txtLogin.setLayoutY(50);
	}
	
	
	//ação do botão de sair
	private void initListener() {
	 btnSair.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
           fechaApp();			
		}
	});	 
}
	
	private void fechaApp() {
        System.exit(0);
		
	}
	
	//ação do botão de entrar
	private void initListeners() {
		btnLogin.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
		       Login();		
			}
		});
	}
	
	private void Login() {
		if(txtLogin.getText().contentEquals("admin") && txtSenha.getText().equals("12345")) {
			
		}
		else {
			JOptionPane.showInternalMessageDialog(null, "Login ou senha inválidos","ERRO",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
}

package Telas;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application{
  private	TextField Login = new TextField();
  private   PasswordField txtSenha = new PasswordField();
  private	Button btnEntrar = new Button("Entrar");
  private	Button btnSair = new Button("Sair");
  private	AnchorPane painel = new AnchorPane();
  private	Scene cena = new Scene(painel);
  private   Label login = new Label("Login");
  private   Label senha = new Label("Senha");
  private static Stage stage;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		painel.setPrefSize(400, 300);
		LoginApp.stage=stage;
		
		
		//Colocando os elementos no painel

        painel.getChildren().addAll(Login,txtSenha,btnEntrar,btnSair,login,senha);
        
        /*Testando o css*/
        //painel.setStyle("-fx-text-fill: green; -fx-font-size: 16px;");
          painel.setStyle("-fx-background: lightblue;");
          btnEntrar.setStyle("-fx-color: gold");
          btnSair.setStyle("-fx-color: gold");
          
          
        /*Metodos que vamos usar*/
        initComponents();
        initListeners();
        
		/*Inicia a nossa tela*/
		stage.setTitle("SISTEMA DE GERENCIAMENTO");
		stage.setResizable(false);
		stage.setScene(cena);
		stage.show();
			
		}
	   private void initComponents(){
		    Login.setText("Digite o seu login :");
			txtSenha.setText("Digite a sua senha :");
			
			/*Colocando os elementos em determinadas posições*/
			Login.setLayoutX(130);
			Login.setLayoutY(100);
			
			txtSenha.setLayoutX(130);
			txtSenha.setLayoutY(150);
			
			login.setLayoutX(190);
			login.setLayoutY(70);
			
			senha.setLayoutX(190);
			senha.setLayoutY(130);
			
			
			btnEntrar.setLayoutX(130);
			btnEntrar.setLayoutY(200);
			
			btnSair.setLayoutX(200);
			btnSair.setLayoutY(200); 
	   }
	   
	
	   private void initListeners(){
		   btnSair.setOnAction(new EventHandler<ActionEvent>() {
		    
			@Override
			public void handle(ActionEvent event) {
				fecharApp();
				
			}
		});
		   btnEntrar.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				logar();
				
			}
		});
		   
	   }

	protected void logar() {
		if(Login.getText().equals("admin") && txtSenha.getText().equals("123")){
			
			try{
				new VitrineApp().start( new Stage());
				LoginApp.getStage().close();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "Login ou senha inválidos","erro", JOptionPane.ERROR_MESSAGE);
		}
		
	}

	private static Stage getStage() {
		return stage;
	}

	protected void fecharApp() {
		System.exit(0);
		
	}

}

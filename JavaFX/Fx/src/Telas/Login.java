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

public class Login extends Application{
  private	TextField Login = new TextField();
  private   PasswordField txtSenha = new PasswordField();
  private	Button btnEntrar = new Button("Entrar");
  private	Button btnSair = new Button("Sair");
  private	AnchorPane painel = new AnchorPane();
  private	Scene cena = new Scene(painel);
  private   Label login = new Label("Login");
  private   Label senha = new Label("Senha");
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		painel.setPrefSize(400, 300);
		
		//Colocando os elementos no painel

        painel.getChildren().addAll(Login,txtSenha,btnEntrar,btnSair,login,senha);
        
        /*Testando o css*/
        painel.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, blue 0% red 100%);");
        
        /*Metodod qua vamos usar*/
        initComponents();
        initListeners();
        
		/*Inicia a nossa tela*/
		stage.setTitle("SISTEMA DE GERENCIAMENTO");
		stage.setResizable(false);
		stage.setScene(cena);
		stage.show();
			
		}
	   private void initComponents(){
		    //Login.setText("Digite o seu login");
			//txtSenha.setText("Digite a sua senha");
			
			/*Colocando os elementos em determinadas posi��es*/
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
		if(Login.getText().equals("admin") && Login.getText().equals("123456")){
			JOptionPane.showMessageDialog(null, "Implenmentando");
		}
		else{
			JOptionPane.showMessageDialog(null, "Login ou senha inv�lidos","erro", JOptionPane.ERROR_MESSAGE);
		}
		
	}

	protected void fecharApp() {
		System.exit(0);
		
	}

}

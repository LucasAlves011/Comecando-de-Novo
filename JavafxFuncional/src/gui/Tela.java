package gui;

import beans.Pessoa;
import dados.RepositorioPessoa;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Tela extends Application {
	public static void main(String[] args) {			
		launch();		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane a = FXMLLoader.load(getClass().getResource("dxml.fxml"));
		Scene b = new Scene(a);
		primaryStage.setScene(b);
		primaryStage.show();		
	}
}
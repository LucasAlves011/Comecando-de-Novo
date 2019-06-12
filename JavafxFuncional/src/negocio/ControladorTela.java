package negocio;

import java.net.URL;
import java.util.ResourceBundle;

import beans.Pessoa;
import dados.RepositorioPessoa;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class ControladorTela implements Initializable {

	RepositorioPessoa sinalizador = new RepositorioPessoa();
	
	
	 @FXML
	 private TextField txtNome;

	 @FXML
	 private TextField txtIdade;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

	
	public void setarNome() {
		sinalizador.add(new Pessoa(txtNome.getText() , Integer.parseInt(txtIdade.getText())));
//		System.out.println(	sinalizador.listar()); tava testando e funcionou;
	}
	
	
}

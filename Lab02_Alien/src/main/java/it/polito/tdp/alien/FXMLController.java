package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	private AlienDictionary dizionario;

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField textImport;

	@FXML
	private Button transButton;

	@FXML
	private TextArea spazioTesto;

	@FXML
	private Button clearButton;

	@FXML
	void doClear(ActionEvent event) {
		spazioTesto.setText("Welcome to Alien Dictionary v2020.");
	}

	@FXML
	void transAction(ActionEvent event) {

		String parolaImport = (textImport.getText()).toUpperCase();

		if (parolaImport.contains(" ")) {
			
			String[] wArr = parolaImport.split(" ");
			
			if (dizionario.contieneNumero(wArr[0], wArr[1]) == false)
				dizionario.addWord(wArr[0], wArr[1]);
			
			else
				spazioTesto.appendText("\nInserire parole senza numeri!");
			
		} else {
			if (dizionario.contieneNumero(parolaImport, "") == false) {

				WordEnahnced parolaCerc = dizionario.translate(parolaImport);
				if (parolaCerc != null) {
					for (String parolaAtt : parolaCerc.getDizzi())
					spazioTesto.appendText("\nTraduzione '" + parolaImport + "': " + parolaAtt);
				}
					else
					spazioTesto.appendText("\nParola Inesistente!");
			} else
				spazioTesto.appendText("\nInserire parole senza numeri!");

		}
	}

	@FXML
	void initialize() {
		assert textImport != null : "fx:id=\"textImport\" was not injected: check your FXML file 'Scene.fxml'.";
		assert transButton != null : "fx:id=\"transButton\" was not injected: check your FXML file 'Scene.fxml'.";
		assert spazioTesto != null : "fx:id=\"spazioTesto\" was not injected: check your FXML file 'Scene.fxml'.";
		assert clearButton != null : "fx:id=\"clearButton\" was not injected: check your FXML file 'Scene.fxml'.";
	}

	public void setDizionario(AlienDictionary dizionario) {
		this.dizionario = dizionario;
	}
}

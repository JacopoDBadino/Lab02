package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

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

    }

    @FXML
    void transAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert textImport != null : "fx:id=\"textImport\" was not injected: check your FXML file 'Scene.fxml'.";
        assert transButton != null : "fx:id=\"transButton\" was not injected: check your FXML file 'Scene.fxml'.";
        assert spazioTesto != null : "fx:id=\"spazioTesto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert clearButton != null : "fx:id=\"clearButton\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}

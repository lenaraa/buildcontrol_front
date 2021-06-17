package fr.epsi.controllers;

import fr.epsi.App;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    @FXML
    private Label menu;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        menu.setStyle("-fx-font-weight: bold");
    }

    @FXML
    private void captures() throws IOException {
        App.setRoot("captures");
    }

}

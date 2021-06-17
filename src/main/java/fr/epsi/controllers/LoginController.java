package fr.epsi.controllers;

import fr.epsi.App;
import fr.epsi.utilities.FetchData;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.FontWeight;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Label error;

    @FXML
    private Label connect;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        connect.setStyle("-fx-font-weight: bold");
    }

    @FXML
    private void connect() throws IOException {

        if (FetchData.login(username.getText(), password.getText())){
            App.setRoot("menu");
        } else {
            error.setText("Erreur dans l'authentification");
            error.setStyle("-fx-text-fill: #ff0000;");
        }

    }

}

package fr.epsi.controllers;

import fr.epsi.App;
import javafx.fxml.FXML;

import java.io.IOException;

public class LoginController {

    @FXML
    private void connect() throws IOException {
        App.setRoot("menu");
    }

}

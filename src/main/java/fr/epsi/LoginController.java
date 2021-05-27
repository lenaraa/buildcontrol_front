package fr.epsi;

import javafx.fxml.FXML;

import java.io.IOException;

public class LoginController {

    @FXML
    private void connect() throws IOException {
        App.setRoot("menu");
    }

}

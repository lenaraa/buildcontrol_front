package fr.epsi;

import javafx.fxml.FXML;

import java.io.IOException;

public class MenuController {

    @FXML
    private void continuer() throws IOException {
        App.setRoot("primary");
    }

}

package fr.epsi.controllers;

import fr.epsi.App;
import javafx.fxml.FXML;

import java.io.IOException;

public class MenuController {

    @FXML
    private void captures() throws IOException {
        App.setRoot("captures");
    }

}

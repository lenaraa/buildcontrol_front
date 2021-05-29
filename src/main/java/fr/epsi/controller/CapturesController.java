package fr.epsi.controller;

import fr.epsi.App;
import javafx.fxml.FXML;

import java.io.IOException;

public class CapturesController {

    @FXML
    private void back() throws IOException {
        App.setRoot("menu");
    }

}

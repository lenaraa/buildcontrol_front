package fr.epsi.controller;

import fr.epsi.App;
import javafx.fxml.FXML;

import java.io.IOException;

public class DeleteCaptureController {

    @FXML
    private void back() throws IOException {
        App.setRoot("menu");
    }

}
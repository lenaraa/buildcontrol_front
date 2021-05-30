package fr.epsi.controllers;

import fr.epsi.App;
import javafx.fxml.FXML;

import java.io.IOException;

public class MenuController {

    @FXML
    private void captures() throws IOException {
        App.setRoot("captures");
    }

    @FXML
    private void create() throws IOException {
        App.setRoot("createCapture");
    }

    @FXML
    private void read() throws IOException {
        App.setRoot("readCapture");
    }

    @FXML
    private void update() throws IOException {
        App.setRoot("updateCapture");
    }

    @FXML
    private void delete() throws IOException {
        App.setRoot("deleteCapture");
    }

}

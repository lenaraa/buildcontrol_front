package fr.epsi.controllers;

import fr.epsi.App;
import fr.epsi.entities.Capture;
import fr.epsi.utilities.FetchData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class CapturesController implements Initializable {

    private List<Capture> lesCaptures;

    private ObservableList<String> list = FXCollections.observableArrayList();

    @FXML
    ListView<String> listView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        list.addListener((javafx.beans.Observable observable) -> {
            System.out.println("List invalidated");
        });

        //on récupère les données
        lesCaptures = FetchData.getCaptures();

        //on les attache à la liste d'observables
        lesCaptures.forEach(capture -> list.add(capture.toStringAbridged()));

        //on les affiche
        listView.setItems(list);
    }

    @FXML
    private void back() throws IOException {
        App.setRoot("menu");
    }

}

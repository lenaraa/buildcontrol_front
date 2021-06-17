package fr.epsi.controllers;

import fr.epsi.App;
import fr.epsi.entities.Capture;
import fr.epsi.utilities.FetchData;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

public class CapturesController implements Initializable {

    private List<Capture> lesCaptures;

    private ObservableList<String> list = FXCollections.observableArrayList();

    @FXML
    private ListView<String> listView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        list.addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("List invalidated");
            }
        });

        //affiche la liste test
        listView.setItems(list);

        this.lesCaptures = FetchData.getCaptures();
        for (int i=0; i<lesCaptures.size(); i++){
            list.add(lesCaptures.get(i).toStringAbridged());
        }
    }


    @FXML
    private void back() throws IOException {
        App.setRoot("menu");
    }

}

module fr.epsi {
    requires javafx.controls;
    requires javafx.fxml;

    opens fr.epsi to javafx.fxml;
    exports fr.epsi;
    exports fr.epsi.controller;
    opens fr.epsi.controller to javafx.fxml;
}
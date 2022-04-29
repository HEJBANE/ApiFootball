/**
 *
 */
module ui.restappcomp {
    requires javafx.controls;
    requires javafx.fxml;

    requires okhttp3;
    requires com.google.gson;
    requires java.desktop;
    requires batik.transcoder;
    requires java.logging;
    requires javafx.web;


    opens ui to javafx.fxml;
    exports ui;
    exports uiController;
    opens uiController to javafx.fxml;
    exports apiConnector;
    opens apiConnector to javafx.fxml;
    exports classes;
    opens classes to javafx.fxml;
}
module com.ad {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.desktop;

    opens com.ad.controller;
    opens com.ad;
}

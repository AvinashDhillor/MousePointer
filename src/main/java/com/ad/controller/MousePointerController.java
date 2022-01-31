package com.ad.controller;

import java.awt.MouseInfo;
import java.awt.Point;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MousePointerController {

    @FXML
    private TextField x_axis;

    @FXML
    private TextField y_axis;

    @FXML
    public void initialize() {
        execute();
    }

    public void execute() {
        new Thread(() -> {
            while (true) {
                try {
                    Point p = MouseInfo.getPointerInfo().getLocation();
                    Platform.runLater(() -> {
                        x_axis.setText((int) p.getX() + "");
                        y_axis.setText((int) p.getY() + "");
                    });
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}

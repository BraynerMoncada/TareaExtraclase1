package com.example.tarea_1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class Controller {

    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


}

